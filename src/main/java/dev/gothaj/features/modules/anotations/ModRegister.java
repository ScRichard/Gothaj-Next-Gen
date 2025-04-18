package dev.gothaj.features.modules.anotations;

import dev.gothaj.features.modules.Category;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ModRegister {
    String name();
    String description() default "";
    Category category() default Category.OTHER;
    int key() default 0;
}
