package com.tokioschool.tokiocalendar;

import com.tokioschool.tokiocalendar.domain.Event;
import com.tokioschool.tokiocalendar.domain.Task;
import com.tokioschool.tokiocalendar.domain.User;

import java.util.Scanner;

public class Application {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        User[] users = new User[10];
        Task[] tasks = new Task[10];
        Event[] events = new Event[10];

        users[0] = new User("tokio", "tokio", "tokio", "938374", "alskdjakljsd", "administrador");
        users[1] = new User("tokio2", "tokio2", "tokio2", "443", "alskdsdfjakljsd", "user");

        String user = input.nextLine();
        String password = input.nextLine();
        // TODO Comprobar datos con la lista de usuarios

        do {
            System.out.println("TOKIO CALENDAR v1.0");
            System.out.println("1. Registrar tarea");
            System.out.println("2. Ver tareas");
            System.out.println("3. Registrar evento");
            System.out.println("4. Ver eventos");
            System.out.println("Q. Salir");
            String option = input.nextLine();

            // TODO 1. Solicitar informaciÃ³n para la tarea y aÃ±adirla al usuario
            // TODO 2 . . .

            if (option.equals("q"))
                break;
        } while (true);

        System.out.println("Saliendo . . .");
    }
}
