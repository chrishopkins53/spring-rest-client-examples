package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;

import java.util.List;

/**
 * 23452453
 */
public interface ApiService {

    List<User> getUsers(Integer limit);
}
