package junit.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 
 * 自己开发的注解
 * @author young
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,	ElementType.METHOD})
public @interface ItcastResource {
	public String name() default "";
}
