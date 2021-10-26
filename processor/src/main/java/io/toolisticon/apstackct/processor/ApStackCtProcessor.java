package io.toolisticon.apstackct.processor;

import io.toolisticon.apstackct.api.ApStackCtAnnotation;
import io.toolisticon.apstackct.api.JavaFileCreationAnnotation;
import io.toolisticon.apstackct.api.ResourceFileCreationAnnotation;
import io.toolisticon.aptk.tools.AbstractAnnotationProcessor;
import io.toolisticon.aptk.tools.ElementUtils;
import io.toolisticon.aptk.tools.TypeUtils;

import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import java.util.Set;

/**
 * Annotation Processor Stack Compliance Test for testing compliance with different java versions
 */
public class ApStackCtProcessor extends AbstractAnnotationProcessor {

    private final static Set<String> SUPPORTED_ANNOTATIONS = createSupportedAnnotationSet(JavaFileCreationAnnotation.class, ResourceFileCreationAnnotation.class, ApStackCtAnnotation.class);


    @Override
    public Set<String> getSupportedAnnotationTypes() {
        return SUPPORTED_ANNOTATIONS;
    }

    @Override
    public boolean processAnnotations(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {

        if (annotations.contains(TypeUtils.TypeRetrieval.getTypeElement(JavaFileCreationAnnotation.class))) {
            for (Element element : roundEnv.getElementsAnnotatedWith(JavaFileCreationAnnotation.class)) {
                JavaFileCreationAnnotationWrapper wrapper = JavaFileCreationAnnotationWrapper.wrapAnnotationOfElement(element);
                String packageName = ((PackageElement)element).getQualifiedName().toString();
                wrapper.writeFile(packageName);
            }
        }
        if (annotations.contains(TypeUtils.TypeRetrieval.getTypeElement(ResourceFileCreationAnnotation.class))) {
            for (Element element : roundEnv.getElementsAnnotatedWith(ResourceFileCreationAnnotation.class)) {
                ResourceFileCreationAnnotationWrapper wrapper = ResourceFileCreationAnnotationWrapper.wrapAnnotationOfElement(element);
                String packageName = ((PackageElement)element).getQualifiedName().toString();
                wrapper.writeFile(packageName);
            }
        }
        if (annotations.contains(TypeUtils.TypeRetrieval.getTypeElement(ApStackCtAnnotation.class))) {

        }


        return false;

    }


}
