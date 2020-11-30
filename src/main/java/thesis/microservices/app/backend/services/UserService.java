package thesis.microservices.app.backend.services;

import dtos.UserDTO;

import java.util.List;

public interface UserService {
    List<UserDTO> getAll();

    void addUser(UserDTO user);
}
