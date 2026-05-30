package pl.wsb.fitnesstracker.user.api;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface UserService {

    User createUser(User user);

    Optional<User> getUser(Long userId);

    Optional<User> getUserByEmail(String email);

    List<User> findAllUsers();

    List<User> findUsersByEmailFragment(String email);

    List<User> findUsersOlderThan(LocalDate date);

    void deleteUser(Long userId);

    User updateUser(Long userId, User updatedUser);
}