package com.example.kaanapos.base;

public class BasePresenter<V> {

    protected V view;

    public void attachView(V view) {
        this.view = view;
    }
}
