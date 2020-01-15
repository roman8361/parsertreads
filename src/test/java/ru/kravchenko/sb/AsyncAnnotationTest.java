package ru.kravchenko.sb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import ru.kravchenko.sb.event.AsyncComponent;
import ru.kravchenko.sb.service.SpringAsyncConfig;

/**
 * @author Roman Kravchenko
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringAsyncConfig.class}, loader = AnnotationConfigContextLoader.class)
public class AsyncAnnotationTest {

    @Autowired
    AsyncComponent asyncComponent;

    @Test
    public void testMethod() throws InterruptedException {
        System.out.println("Thread.currentThread().getId() " + Thread.currentThread().getId());
        asyncComponent.asyncMethod();
         Thread.sleep(10);
    }

}
