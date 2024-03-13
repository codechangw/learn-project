package book01.wiring.javaclasswiring;


/**
 * @author c.w
 * @className BraveKnight
 * @description
 * @date 2024/03/11
 **/
public class BraveKnight implements Knight {
    Queue q;

    public BraveKnight(Queue q) {
        this.q = q;
    }

    @Override
    public void DoTask() {
        q.task();
    }
}


