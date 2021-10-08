package com.tokioschool.tokiocalendar;

import com.tokioschool.tokiocalendar.domain.Event;
import com.tokioschool.tokiocalendar.domain.Task;
import com.tokioschool.tokiocalendar.domain.User;

public class TokioCalendar {
    private User[] users;
    private Task[] tasks;
    private Event[] events;
    private int userIndex;
    private int taskIndex;
    private int eventTask;

    public TokioCalendar() {
        users = new User[100];
        tasks = new Task[100];
        events = new Event[100];
        userIndex = 0;
        taskIndex = 0;
        eventTask = 0;

        // FIXME Sólo como prueba
        mockData();
    }

    private void mockData() {
        addUser(new User("tokio", "tokio", "tokio", "938374", "alskdjakljsd", "administrador"));
        addUser(new User("tokio2", "tokio2", "tokio2", "443", "alskdsdfjakljsd", "user"));

        User user = getUser("tokio");
        Task task = new Task("Ir a comprar el pan", "Comprar mucho pan", user);
        addTask(task);
        user.addTask(task);
    }

    public void addUser(User user) {
        users[userIndex] = user;
        userIndex++;
    }

    public void addTask(Task task) {
        tasks[taskIndex] = task;
        taskIndex++;
        task.getUser().addTask(task);
    }

    public Task[] getTasks(User user) {
        Task[] myTasks = new Task[100];
        int i = 0;
        for (Task task : tasks) {
            if (task == null)
                continue;

            if (task.getUser().equals(user)) {
                myTasks[i] = task;
                i++;
            }
        }

        return myTasks;
    }

    public User getUser(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username))
                return user;
        }

        return null;
    }

    public boolean isValidUser(String username, String password) {
        for (User user : users) {
            if (user == null)
                continue;

            if (user.getUsername().equals(username) && (user.getPassword().equals(password)))
                return true;
        }

        return false;
    }
}
