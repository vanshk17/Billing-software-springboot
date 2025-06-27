package in.bushansirgur.billingsoftware.service;

import in.bushansirgur.billingsoftware.io.UserRequest;
import in.bushansirgur.billingsoftware.io.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse createUser(UserRequest request);

    String getUserRole(String email);

    List<UserResponse> readUsers();

    void deleteUser(String id);
}
