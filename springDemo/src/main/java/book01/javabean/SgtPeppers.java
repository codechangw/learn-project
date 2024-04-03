package book01.javabean;


import org.springframework.stereotype.Component;

/**
 * @className SgtPeppers 
 * @description  
 * @author c.w
 * @date 2024/03/13
**/
@Component  //定义为组件
public class SgtPeppers implements CompactDisc {
    @Override
    public void play() {
        System.out.println("Sgt play CD ");
    }
}


