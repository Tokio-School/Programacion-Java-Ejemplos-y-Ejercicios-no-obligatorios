package com.tokioschool.tokiocalendar.domain;

import com.tokioschool.tokiocalendar.util.Constants;

import java.time.LocalDateTime;

import static com.tokioschool.tokiocalendar.domain.ReminderType.*;
import static com.tokioschool.tokiocalendar.util.Constants.DEFAULT_EVENT_DESCRIPTION;
import static com.tokioschool.tokiocalendar.util.Constants.REMINDER_TIME_DEFAULT;

public class Event {
    private String name;
    private String description;
    private LocalDateTime dateTime;
    private Contact[] contacts;
    private int reminderType;
    private int reminderTime;
    private User user;

    public Event(String name, String description, LocalDateTime dateTime, int reminderType, int reminderTime, User user) {
        this.name = name;
        this.description = description;
        this.dateTime = dateTime;
        this.reminderType = reminderType;
        this.reminderTime = reminderTime;
        this.user = user;
    }

    public Event(String name, LocalDateTime dateTime, User user) {
        this.name = name;
        description = DEFAULT_EVENT_DESCRIPTION;
        this.dateTime = dateTime;
        reminderType = EMAIL;
        reminderTime = REMINDER_TIME_DEFAULT;
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public int getReminderType() {
        return reminderType;
    }

    public int getReminderTime() {
        return reminderTime;
    }

    @Override
    public int hashCode() {
        return (name + dateTime.toString()).hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) return false;
        if (!(object instanceof Event)) return false;

        Event event = (Event) object;
        if (!event.getName().equals(name))
            return false;
        if (!event.getDateTime().equals(dateTime))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return name + " (" + dateTime.toString() + ")";
    }

    public void checkReminder() {
        // TODO Comprobar si es el momento de lanzar el recordatorio
        showReminder();
    }

    public void showReminder() {
        switch (reminderType) {
            case EMAIL:
                System.out.println("Envia email al usuario " + user.getEmail());
                for (Contact contact : contacts) {
                    System.out.println("Envia email al contacto " + contact.getEmail());
                }
                break;
            case SMS:
                System.out.println("Envia SMS al usuario " + user.getMobile());
                for (Contact contact : contacts) {
                    System.out.println("Envia SMS al contacto " + contact.getPhone());
                }
                break;
            case DISPLAY:
                System.out.println("Muestra aviso por pantalla");
                break;
        }
    }
}
