package com.farias.imagelite.domain.service;

import com.farias.imagelite.domain.AccessToken;
import com.farias.imagelite.domain.entity.User;

public interface UserService {
    User getByEmail(String email);
    User save(User user);
    AccessToken authenticate(String email, String password);
}