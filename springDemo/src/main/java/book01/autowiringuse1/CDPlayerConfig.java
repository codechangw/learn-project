package book01.autowiringuse1;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @className CDPlayerConfig 
 * @description 组件扫描config 
 * @author c.w
 * @date 2024/03/13
**/
@Configuration
@ComponentScan  //如果没有其他配置，ComponentScan默认扫描与配置相同的包
public class CDPlayerConfig {
}


