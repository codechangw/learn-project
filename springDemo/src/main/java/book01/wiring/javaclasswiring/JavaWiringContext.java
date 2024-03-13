package book01.wiring.javaclasswiring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @className JavaWiringContext
 * @description  
 * @author c.w
 * @date 2024/03/11
**/
public class JavaWiringContext {
    public static void main(String[] args) {
        // 通过Java类  获取上下文
        ApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight bean = context.getBean(Knight.class);
        bean.DoTask();
    }
}


