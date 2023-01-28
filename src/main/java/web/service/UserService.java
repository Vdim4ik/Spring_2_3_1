package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    List<User> getUserList();

    void addUser(User user);

    void updateUser(long id, User updateUser);

    void deleteUser(long id);

    User getUserById(long id);
}
