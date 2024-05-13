package com.iggyzxc.todomanagement.repository;

import com.iggyzxc.todomanagement.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}


