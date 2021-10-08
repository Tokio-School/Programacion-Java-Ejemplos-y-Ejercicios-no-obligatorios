package com.tokioschool.tokiocalendar;

import com.tokioschool.tokiocalendar.domain.Event;
import com.tokioschool.tokiocalendar.domain.Task;
import com.tokioschool.tokiocalendar.domain.User;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String args[]) {
        TokioCalendar calendar = new TokioCalendar();
        Scanner input = new Scanner(System.in);

        String username;
        String password;
        System.out.println("TOKIO CALENDAR\n");
        do {
            System.out.print("Usuario: ");
            username = input.nextLine();
            System.out.print("ContraseÃ±a: ");
            password = input.nextLine();
        } while (!calendar.isValidUser(username, password));

        User user = calendar.getUser(username);

        boolean salir = false;
        do {
            System.out.println("Usuario: " + user.getUsername());
            System.out.println("1. Registrar tarea");
            System.out.println("2. Ver tareas");
            System.out.println("3. Registrar evento");
            System.out.println("4. Ver eventos");
            System.out.println("Q. Salir");
            String option = input.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Nombre: ");
                    String name = input.nextLine();
                    System.out.print("DescripciÃ³n: ");
                    String description = input.nextLine();
                    Task task = new Task(name, description, user);
                    calendar.addTask(task);
                    break;
                case "2":
                    Task[] myTasks = calendar.getTasks(user);
                    System.out.println(Arrays.toString(myTasks));
                    break;
                case "q":
                    salir = true;
                    break;
                default:
                    break;
            }
        } while (!salir);

        System.out.println("Saliendo . . .");
    }
}
