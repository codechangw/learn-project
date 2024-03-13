package book01.wiring.javaclasswiring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @className KnightConfig
 * @description  
 * @author c.w
 * @date 2024/03/11
**/

@Configuration
public class KnightConfig {

    @Bean
    public Knight knight(){
        return new BraveKnight(queue());
    }

    @Bean
    public Queue queue(){
        return new KillTrigger(System.out);
    }

}


