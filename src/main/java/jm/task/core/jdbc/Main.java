package jm.task.core.jdbc;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Александр", "Купцов", (byte) 28);
        userService.saveUser("Олег", "Зуев", (byte) 22);
        userService.saveUser("Игорь", "Лебедев", (byte) 25);
        userService.saveUser("Мария", "Сафронова", (byte) 26);

        for (User user : userService.getAllUsers()) {
            System.out.println(user);
        }

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
