package com.taskmanager.models;

public class RecurringTask extends Task {
    private String frequency;

    public RecurringTask(int id, String title, String frequency) {
        super(id, title);
        this.frequency = frequency;
    }

    @Override
    public void displayTask() {
        System.out.println("[Recurring Task] " + getId() + ": " + getTitle() +
                " | Frequency: " + frequency +
                " | Completed: " + isCompleted());
    }
}