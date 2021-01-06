package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> getUsers();

    void delete(int id);

    void update(User user);

    User getById(int id);
}
