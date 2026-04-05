package com.taskmanager.models;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int userId;
    private String name;
    private List<Task> tasks;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void viewTasks() {
        System.out.println("\nTasks for " + name + " (User ID: " + userId + "):");
        for (Task t : tasks) {
            t.displayTask(); // Polymorphism
        }
    }
}