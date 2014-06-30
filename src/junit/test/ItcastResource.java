package junit.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 
 * �Լ�������ע��
 * @author young
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,	ElementType.METHOD})
public @interface ItcastResource {
	public String name() default "";
}
