package com.community.demo.users;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    public void save(User user);

    public User findById(long userId);
}
