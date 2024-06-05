package com.ejemplo.tienda.modelo;

import java.util.HashMap;
import java.util.Map;

public class UserDatabase {
	
    private static Map<String, User> users = new HashMap<>();

    public static void addUser(String username, String password) {
        users.put(username, new User(username, password));
    }

    public static User getUser(String username) {
        return users.get(username);
    }

    public static boolean authenticate(String username, String password) {
        User user = users.get(username);
        return user != null && user.getPassword().equals(password);
    }
}
