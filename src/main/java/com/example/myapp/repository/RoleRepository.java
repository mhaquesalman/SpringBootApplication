package com.example.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.myapp.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
