package io.toolisticon.apstackct.processor;

import io.toolisticon.aptk.annotationwrapper.api.CustomCodeMethod;
import io.toolisticon.aptk.tools.FilerUtils;
import io.toolisticon.aptk.tools.MessagerUtils;
import io.toolisticon.aptk.tools.generators.SimpleJavaWriter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class CustomCodeForJavaFileCreation {

    @CustomCodeMethod
    static void writeFile(JavaFileCreationAnnotationWrapper wrapper, String packageName) {


        // create Model
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("packageName", packageName);
        model.put("wrapper", wrapper);

        String filePath = packageName + "." + wrapper.className();

        try {
            SimpleJavaWriter javaWriter = FilerUtils.createSourceFile(filePath);
            javaWriter.writeTemplate("/classTemplate.tpl", model);
            javaWriter.close();
        } catch (IOException e) {
            MessagerUtils.error(null, "Wasn't able to write resource file '" + wrapper.className() + "' with content '" + wrapper.returnValue() + "'");
            return;
        }

    }

}
