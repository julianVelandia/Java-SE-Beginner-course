package model;

//Clases abstractas
public abstract class User {
    static int id;
    static String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        User.id = id;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        User.name = name;
    }
}
