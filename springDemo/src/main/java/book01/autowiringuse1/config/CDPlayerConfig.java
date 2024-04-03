package book01.autowiringuse1.config;


import book01.javabean.IScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @className CDPlayerConfig 
 * @description 组件扫描config 
 * @author c.w
 * @date 2024/03/13
**/
@Configuration
//@ComponentScan("book01.autowiringuse1")  //通过包名指定要扫描的包
//@ComponentScan(basePackageClasses = CompactDisc.class)      //通过类名指定要扫描的包
@ComponentScan(basePackageClasses = IScan.class)    //通过空标记接口扫描 此接口所在包
public class CDPlayerConfig {
}


