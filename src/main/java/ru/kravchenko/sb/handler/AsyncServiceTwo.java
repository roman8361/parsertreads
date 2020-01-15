package ru.kravchenko.sb.handler;

import org.springframework.stereotype.Component;
import ru.kravchenko.sb.event.SyncEvent;

/**
 * @author Roman Kravchenko
 */
@Component
public class AsyncServiceTwo implements Runnable {

    public void handler() {
        System.out.println("SyncHandler: " + Thread.currentThread().getId());
    }

    @Override
    public void run() {
        handler();
    }

}
