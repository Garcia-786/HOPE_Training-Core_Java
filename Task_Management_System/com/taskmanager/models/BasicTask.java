package com.taskmanager.models;

public class BasicTask extends Task {

    public BasicTask(int id, String title) {
        super(id, title);
    }

    @Override
    public void displayTask() { //Same method name, different behavior
        System.out.println("[Basic Task] " + getId() + ": " + getTitle() +
                " | Completed: " + isCompleted());
    }
}