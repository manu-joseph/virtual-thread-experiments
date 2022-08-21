package org.manu.examples.virtualthreads;

import java.util.concurrent.*;

public class JobRunner {

    private ExecutorService executor;

    public JobRunner() {
        executor = Executors.newVirtualThreadPerTaskExecutor();
    }

    public <T> Future<T> submit(Callable<T> task) {
        return executor.submit(task);
    }
}
