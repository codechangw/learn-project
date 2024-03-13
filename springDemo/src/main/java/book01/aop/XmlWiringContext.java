package book01.aop;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @className XmlWiringContext
 * @description  
 * @author c.w
 * @date 2024/03/11
**/
public class XmlWiringContext {
    public static void main(String[] args){
        // 获取应用上下文
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("book01/aop.xml");
        // 通过应用上下文获取bean
        Knight bean = context.getBean(Knight.class);
        bean.DoTask();
    }
}


