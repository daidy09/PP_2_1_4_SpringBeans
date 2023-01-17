package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Timer {


    private Long nanoTime = System.nanoTime();

    public Timer() {

    }

    public Long getTime() {
        return nanoTime;
    }
}
