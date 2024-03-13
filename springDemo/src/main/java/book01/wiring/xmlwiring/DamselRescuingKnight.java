package book01.wiring.xmlwiring;
 

/**
 * @className DamselRescuingKnight 
 * @description 拯救公主骑士 
 * @author c.w
 * @date 2024/03/04
**/
public class DamselRescuingKnight implements Knight{
    private Queue queue;
    //public DamselRescuingKnight(){
    //    queue = new Queue() {         自行创建管理依赖，这里就只能使用new Object 不可使用interface，例如下面的方法
    //    }
    //}

    //public DamselRescuingKnight(){
    //    queue = new KillTrigger();    依赖的实现类固定，紧耦合
    //}
    public DamselRescuingKnight(Queue q){   //构造器注入，不必理会是哪种实现类
        this.queue = q;
    }

    public void DoTask(){
        queue.task();
    }
}


