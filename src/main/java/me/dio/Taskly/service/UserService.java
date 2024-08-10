package me.dio.Taskly.service;

import me.dio.Taskly.domain.model.User;
import me.dio.Taskly.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {


    public User createUser(User user) ;

    public Optional<User> getUserById(Long id) ;

    public List<User> getAllUsers() ;

    public User updateUser(Long id, User user) ;


    public void deleteUser(Long id) ;
}
