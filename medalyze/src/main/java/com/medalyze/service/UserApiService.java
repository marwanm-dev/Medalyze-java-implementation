package com.medalyze.service;

import com.medalyze.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserApiService {

    private final List<UserDTO> users = new ArrayList<>();

    public UserApiService() {
        users.add(
                new UserDTO(
                        1L,
                        "Ahmed Ali",
                        "ahmed@example.com",
                        "Patient",
                        "01012345678"
                )
        );
    }

    public List<UserDTO> getAllUsers() {
        return users;
    }

    public UserDTO getUserById(Long id) {
        return users.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public UserDTO createUser(UserDTO user) {
        user.setId((long) (users.size() + 1));
        users.add(user);
        return user;
    }

    public UserDTO updateUser(Long id, UserDTO updatedUser) {
        for (UserDTO user : users) {
            if (user.getId().equals(id)) {
                user.setName(updatedUser.getName());
                user.setEmail(updatedUser.getEmail());
                user.setRole(updatedUser.getRole());
                user.setPhoneNumber(updatedUser.getPhoneNumber());
                return user;
            }
        }
        return null;
    }

    public boolean deleteUser(Long id) {
        return users.removeIf(u -> u.getId().equals(id));
    }
}