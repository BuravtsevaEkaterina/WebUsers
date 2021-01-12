package web.dao;

import web.model.Role;
import web.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    List<User> getAllUsers();

    void deleteUser(User user);

    void updateUser(User user);

    User getUserById(Long id);

    User getUserByName(String name);

    Role getRoleByName(String role);

    void addRole(Role role);
}
