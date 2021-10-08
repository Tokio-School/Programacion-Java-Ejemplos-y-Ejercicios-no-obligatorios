package com.tokioschool.tokiocalendar.domain;

import static com.tokioschool.tokiocalendar.util.Constants.DEFAULT_EVENT_DESCRIPTION;
import static com.tokioschool.tokiocalendar.util.Constants.DEFAULT_TASK_DESCRIPTION;

public class Task {
    private String name;
    private String description;
    private Contact[] contacts;
    private User user;

    public Task(String name, String description, User user) {
        this.name = name;
        this.description = description;
        this.user = user;
    }

    public Task(String name, User user) {
        this.name = name;
        description = DEFAULT_TASK_DESCRIPTION;
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public User getUser() { return user; }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) return false;
        if (!(object instanceof Task)) return false;

        Task task = (Task) object;
        if (!task.getName().equals(name))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return name;
    }
}
