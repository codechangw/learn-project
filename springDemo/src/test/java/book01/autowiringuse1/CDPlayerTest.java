package book01.autowiringuse1;


import book01.autowiringuse1.config.CDPlayerConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * @className CDPlayerTest 
 * @description 自动装配测试 
 * @author c.w
 * @date 2024/03/13
**/
//这里运行需要此module jdk7  spring3.2
@RunWith(SpringJUnit4ClassRunner.class)     //测试开始时自动创建应用上下文
@ContextConfiguration(classes = CDPlayerConfig.class)   // 在CDPlayerConfig 中加载配置
public class CDPlayerTest {

    @Autowired
    CompactDisc compactDisc;
    @Test
    public void testCDPlayer(){
        compactDisc.play();
        assertNotNull(compactDisc);
    }
}


