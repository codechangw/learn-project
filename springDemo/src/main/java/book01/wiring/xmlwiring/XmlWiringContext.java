package book01.wiring.xmlwiring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @className XmlWiringContext
 * @description  
 * @author c.w
 * @date 2024/03/11
**/
public class XmlWiringContext {
    public static void main(String[] args){
        // 获取应用上下文
        //  从类路径下加载应用上下文
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("book01/knight.xml");
        //  从文件系统下加载应用上下文
        ApplicationContext context = new FileSystemXmlApplicationContext("E:\\Learnspace\\learn-project\\springDemo\\src\\main\\resources\\book01\\knight.xml");
        // 通过应用上下文获取bean
        Knight bean = context.getBean(Knight.class);
        bean.DoTask();
    }
}


