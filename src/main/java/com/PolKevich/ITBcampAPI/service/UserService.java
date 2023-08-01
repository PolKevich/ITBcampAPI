package com.PolKevich.ITBcampAPI.service;

import com.PolKevich.ITBcampAPI.model.User;
import org.springframework.data.domain.Page;

public interface UserService {

    void create(User user);

    Page<User> findAll(int page);

}
