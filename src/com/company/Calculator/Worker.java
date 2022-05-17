package com.company.Calculator;

import com.company.Worker.OnTaskDoneListener;

public class Worker {
    
    public OnTaskDoneListener callback;
    
    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }
    
    public void start() {
        for (int i = 0; i < 5; i++) {
            callback.onDone("Task " + i + " is done");
        }
    }
}
