package Task1;

import java.lang.annotation.*;

@Inherited
@Target(value =ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface AnnotationForMathOperation {
int num1() default  5;
int num2() default 5;

}
