package com.example.spring.registrationlogin.repository;

import com.example.spring.registrationlogin.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);

}
