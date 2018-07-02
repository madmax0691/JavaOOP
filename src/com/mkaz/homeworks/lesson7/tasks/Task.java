package com.mkaz.homeworks.lesson7.tasks;

import java.time.LocalDate;

public class Task {
    private final long id;
    private final String name;
    private final String description;
    private final LocalDate deadline;
    private final Priority priority;

    public Task(long id, String name, String description, LocalDate deadline, Priority priority) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.deadline = deadline;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public Priority getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", deadline=" + deadline +
                ", priority=" + priority +
                '}';
    }
}
