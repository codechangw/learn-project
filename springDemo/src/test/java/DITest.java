import book01.wiring.xmlwiring.DamselRescuingKnight;
import book01.wiring.xmlwiring.Queue;
import org.junit.Test;

import static org.mockito.Mockito.*;
public class DITest {

    //测试
    @Test
    public void DITest(){
        Queue q = mock(Queue.class);
        DamselRescuingKnight knight = new DamselRescuingKnight(q);
        knight.DoTask();
        //保证测试方法只执行一次
        verify(q,times(1)).task();
    }
}