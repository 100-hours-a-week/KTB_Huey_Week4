package com.community.demo.auth.temp;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class AuthRepositoryV1 implements AuthRepository {
    Map<String, Auth> authDb = new HashMap<>();

    @Override
    public void save(Auth auth) {
        String email = auth.getEmail();
        authDb.put(email, auth);
    }

    @Override
    public Auth findByEmail(String email) {
        return authDb.get(email);
    }

    @Override
    public Auth findById(long userId) {
        return null;
    }
}
