package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void add(User user);

    List<User> getUsers();

    void delete(User user);

    void update(User user);

    User getById(int id);
}
