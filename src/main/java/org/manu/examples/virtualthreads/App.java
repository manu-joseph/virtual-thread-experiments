package org.manu.examples.virtualthreads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class App {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("My First Java 19 App");
        JobRunner jobRunner = new JobRunner();
        Future<String> resultWrapper = jobRunner.submit(() -> "Result");
        System.out.println(resultWrapper.get());
    }
}
