package com.PolKevich.ITBcampAPI.repository;

import com.PolKevich.ITBcampAPI.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Page<User> findAllByOrderByEmailAsc(Pageable pageable);
}
