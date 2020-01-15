package ru.kravchenko.sb.event;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author Roman Kravchenko
 */


@Component
public class AsyncComponent {

    @Async
    public void asyncMethod() {
        System.out.println("AsyncComponent");
        System.out.println("Thread.currentThread().getId() " + Thread.currentThread().getId());
        System.out.println("Thread.currentThread().getName() " + Thread.currentThread().getName());
    }

}


