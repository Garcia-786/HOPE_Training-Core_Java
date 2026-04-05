package com.taskmanager.models;

public class WorkTask extends Task {
    private String projectName;

    public WorkTask(int id, String title, String projectName) {
        super(id, title);
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    @Override
    public void displayTask() {
        System.out.println("[Work Task] " + getId() + ": " + getTitle() +
                " | Project: " + projectName +
                " | Completed: " + isCompleted());
    }
}