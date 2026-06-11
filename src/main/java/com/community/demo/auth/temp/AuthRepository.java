package com.community.demo.auth.temp;

import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository {
    public void save(Auth auth);

    public Auth findByEmail(String email);

    public Auth findById(long userId);
}
