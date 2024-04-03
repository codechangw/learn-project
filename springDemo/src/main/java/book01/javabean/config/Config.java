package book01.javabean.config;


import book01.javabean.CompactDisc;
import book01.javabean.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @className Config 
 * @description  
 * @author c.w
 * @date 2024/03/15
**/
@Configuration      //没有了@ComponentScan ,是不会扫描组件的
public class Config {

    @Bean   //如果没有指定name属性，则此bean的ID为此方法名
            //
    //@Bean(name = "cdCdCd")
    public CompactDisc setCD(){
        return new SgtPeppers();
    }
}


