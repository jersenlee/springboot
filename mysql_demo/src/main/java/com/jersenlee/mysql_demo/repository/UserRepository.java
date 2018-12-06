package com.jersenlee.mysql_demo.repository;

import com.jersenlee.mysql_demo.domain.User;

import java.util.List;

public interface UserRepository {
    User saveOrUpdateUser(User user);

    void deleteUser(Long id);

    User getUserById(Long id);

    List<User> userList ();
}
