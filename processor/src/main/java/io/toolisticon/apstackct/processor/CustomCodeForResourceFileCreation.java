package io.toolisticon.apstackct.processor;

import io.toolisticon.aptk.annotationwrapper.api.CustomCodeMethod;
import io.toolisticon.aptk.tools.FilerUtils;
import io.toolisticon.aptk.tools.MessagerUtils;
import io.toolisticon.aptk.tools.generators.SimpleResourceWriter;

import javax.tools.StandardLocation;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class CustomCodeForResourceFileCreation {

    @CustomCodeMethod
    static void writeFile(ResourceFileCreationAnnotationWrapper wrapper, String packageName) {

        try {

            // write service provider file by using a template
            SimpleResourceWriter writer = FilerUtils.createResource(StandardLocation.CLASS_OUTPUT, packageName, wrapper.fileName());

            Map<String, Object> model = new HashMap<String, Object>();
            model.put("content", wrapper.content());

            writer.writeTemplateString("${content}", model);
            writer.close();

        } catch (IOException e) {
            MessagerUtils.error(null, "Wasn't able to write resource file '" + wrapper.fileName() + "' with content '" + wrapper.content() + "'");
            return;
        }

    }

}
