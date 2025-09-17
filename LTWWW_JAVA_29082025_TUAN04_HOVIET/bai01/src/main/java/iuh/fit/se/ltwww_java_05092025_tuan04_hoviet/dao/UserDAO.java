package iuh.fit.se.ltwww_java_05092025_tuan04_hoviet.dao;

import iuh.fit.se.ltwww_java_05092025_tuan04_hoviet.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private static List<User> users = new ArrayList<>();
    private static int idCounter = 1;

    public void addUser(User user) {
        user.setId(idCounter++);
        users.add(user);
    }

    public List<User> getAllUsers() {
        return users;
    }
}
