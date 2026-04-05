package com.taskmanager.logic;

import com.taskmanager.models.Task;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> allTasks = new ArrayList<>();

    public void addTask(Task task) {
        allTasks.add(task);
    }

    public Task getTaskById(int id) {
        for (Task t : allTasks) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }

    public void showAllTasks() {
        for (Task t : allTasks) {
            t.displayTask();
        }
    }
}