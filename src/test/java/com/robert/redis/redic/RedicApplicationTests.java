package com.robert.redis.redic;

import com.robert.redis.redic.core.Redic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedicApplicationTests {

    @Autowired
    private Redic redic;

    @Test
    public void testRedic() {
        if (redic == null) {
            System.out.println("fault");
        }

        redic.set("b", "This is test");
        String a = redic.get("b");
        System.out.println(a);
    }

}
