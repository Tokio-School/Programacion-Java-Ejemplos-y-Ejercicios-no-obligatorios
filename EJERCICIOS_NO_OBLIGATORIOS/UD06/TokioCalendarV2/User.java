package com.tokioschool.tokiocalendar.domain;

public class User {
    private String username;
    private String password;
    private String email;
    private String mobile;
    private String address;
    private String type;
    private Task[] tasks;
    private Event[] events;
    private int taskIndex;
    private int taskEvent;

    public User(String username, String password, String email, String mobile, String address, String type) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
        this.type = type;
        tasks = new Task[10];
        events = new Event[10];
        taskIndex = 0;
        taskEvent = 0;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    public Task[] getTasks() {
        return tasks;
    }

    public Event[] getEvents() {
        return events;
    }

    @Override
    public int hashCode() {
        return username.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) return false;
        if (!(object instanceof User)) return false;

        User user = (User) object;
        if (!user.getUsername().equals(username))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return username;
    }

    /**
     * Añade una tarea al usuario
     * @param task La tarea que se añade
     */
    public void addTask(Task task) {
        tasks[taskIndex] = task;
        taskIndex++;
    }

    public void removeTask(Task task) {
        // TODO Eliminar la tarea de la lista de tareas del usuario
    }

    public void addEvent(Event event) {
        // TODO Añadir un evento al usuario
    }

    public void removeEvent(Event event) {
        // TODO Eliminar la tarea de la lista de eventos del usuario
    }
}
