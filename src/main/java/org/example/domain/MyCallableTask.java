package org.example.domain;

import java.util.concurrent.Callable;

public class MyCallableTask implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return 10;
    }
}
