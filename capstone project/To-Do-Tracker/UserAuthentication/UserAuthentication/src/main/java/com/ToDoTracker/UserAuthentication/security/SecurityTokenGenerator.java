package com.ToDoTracker.UserAuthentication.security;

import com.ToDoTracker.UserAuthentication.domain.User;

import java.util.Map;

public interface SecurityTokenGenerator {
    Map<String, String> generateToken(User user);
}
