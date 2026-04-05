package com.taskmanager;

import com.taskmanager.models.*;
import com.taskmanager.logic.TaskManager;

public class Main {
    public static void main(String[] args) {

        TaskManager manager = new TaskManager();
        User user = new User(1, "Garcia");

        Task t1 = new BasicTask(101, "Buy groceries");
        Task t2 = new WorkTask(102, "Finish report", "AI Project");
        Task t3 = new RecurringTask(103, "Workout", "Daily");

        manager.addTask(t1);
        manager.addTask(t2);
        manager.addTask(t3);

        user.addTask(t1);
        user.addTask(t2);
        user.addTask(t3);
        user.viewTasks();
        t3.markCompleted();
        user.viewTasks();

    }
}