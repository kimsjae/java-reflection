package ex02;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // 어노테이션 실행 시에 발동됨.
@Target(ElementType.METHOD)
public @interface RequestMapping {
    String uri();
}
