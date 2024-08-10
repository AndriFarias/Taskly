package me.dio.Taskly.service;

import me.dio.Taskly.domain.model.User;
import java.util.List;
import java.util.Optional;


public interface UserService {
    User createUser(User user);
    Optional<User> getUserById(Long id);
    List<User> getAllUsers();
    User updateUser(Long id, User user);
    void deleteUser(Long id);
}
