package io.toolisticon.apstackct.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Contains all kind of attributes.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ApStackCtAnnotation {

    int intValue() default 0;

    long longValue() default 0L;

    float floatValue() default 0.0f;

    double doubleValue() default 0.0;

    String stringValue() default "default";

    Class<?> classValue() default Object.class;

    TestEnum enumValue() default TestEnum.ONE;


    int[] intArrayValue() default 0;

    long[] longArrayValue() default 0L;

    float[] floatArrayValue() default 0.0f;

    double[] doubleArrayValue() default 0.0;

    String[] stringArrayValue() default "default";

    Class<?>[] classArrayValue() default Object.class;

    TestEnum[] enumArrayValue() default TestEnum.ONE;


}
