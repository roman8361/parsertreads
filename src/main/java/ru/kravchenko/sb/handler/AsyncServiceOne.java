package ru.kravchenko.sb.handler;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author Roman Kravchenko
 */

@Component
public class AsyncServiceOne implements Runnable {

    public void handler() {
        System.out.println("AsyncHandler: " + Thread.currentThread().getId());
    }

    @Override
    public void run() {
        handler();
    }
}
