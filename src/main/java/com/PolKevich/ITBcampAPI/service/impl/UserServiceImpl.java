package com.PolKevich.ITBcampAPI.service.impl;

import com.PolKevich.ITBcampAPI.model.Role;
import com.PolKevich.ITBcampAPI.model.User;
import com.PolKevich.ITBcampAPI.repository.RoleRepository;
import com.PolKevich.ITBcampAPI.repository.UserRepository;
import com.PolKevich.ITBcampAPI.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Log4j2
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

   private final UserRepository userRepository;
   private final RoleRepository roleRepository;


    @Override
    @Transactional
    public void create(User user) {
        log.info("Create new user: {}", user.toString());

        Optional<Role> userRole = roleRepository.findRoleByName(user.getRole().toString());

        if (userRole.isPresent()) {
            user.setRole(userRole.get());
            log.info("Role sets successful {}", userRole.get().getName());
        }

        userRepository.save(user);
    }


    @Override
    public Page<User> findAll(int page) {

        log.info("Get all users");
        Pageable pageable = PageRequest.of(page, 10);

        return userRepository.findAllByOrderByEmailAsc(pageable);
    }


}
