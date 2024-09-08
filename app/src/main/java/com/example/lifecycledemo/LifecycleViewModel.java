package com.example.lifecycledemo;

import androidx.lifecycle.ViewModel;

public class LifecycleViewModel extends ViewModel {
    private String lastLifecycleState = "onCreate";

    public String getLastLifecycleState() {
        return lastLifecycleState;
    }

    public void setLastLifecycleState(String lifecycleState) {
        this.lastLifecycleState = lifecycleState;
    }
}
