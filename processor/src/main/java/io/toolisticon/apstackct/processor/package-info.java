/**
 * This package contains the annotation processors.
 */
@AnnotationWrapper(value = {ApStackCtAnnotation.class}
        , bindCustomCode = {
        @BindCustomCode(annotation = ResourceFileCreationAnnotation.class, customCodeClass = CustomCodeForResourceFileCreation.class),
        @BindCustomCode(annotation = JavaFileCreationAnnotation.class, customCodeClass = CustomCodeForJavaFileCreation.class)
})
package io.toolisticon.apstackct.processor;

import io.toolisticon.apstackct.api.ApStackCtAnnotation;
import io.toolisticon.apstackct.api.JavaFileCreationAnnotation;
import io.toolisticon.apstackct.api.ResourceFileCreationAnnotation;
import io.toolisticon.aptk.annotationwrapper.api.AnnotationWrapper;
import io.toolisticon.aptk.annotationwrapper.api.BindCustomCode;