package book01.aop;


import java.io.PrintStream;

/**
 * @className KillTrigger 
 * @description  
 * @author c.w
 * @date 2024/03/04
**/
public class KillTrigger implements Queue {

    private PrintStream stream;

    public KillTrigger(PrintStream stream){
        this.stream = stream;
    }
    @Override
    public void task() {
        stream.println("kill trigger");
    }
}


