package com.liukunpeng.pattern.observer.plan2;

import java.util.Observable;

public class 被观察者 extends Observable {
    public void sendBlog(String title, String context) {
        this.setChanged();
        Blog blog = new Blog(title, context);
        //通知观察者，我已经改变了
        this.notifyObservers(blog);

    }
}
