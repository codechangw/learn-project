package book01.aop;


import java.io.PrintStream;

/**
 * @className ShiRen 
 * @description  
 * @author c.w
 * @date 2024/03/11
**/
public class ShiRen {
    private PrintStream stream;

    public ShiRen(PrintStream stream){
        this.stream = stream;
    }

    public void before(){
        stream.println("before  a b c d e f g ");
    }

    public void after(){
        stream.println("after h i j k l m n ");
    }
}


