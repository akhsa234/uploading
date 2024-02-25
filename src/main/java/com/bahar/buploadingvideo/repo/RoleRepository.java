package com.bahar.buploadingvideo.repo;

import com.bahar.buploadingvideo.model.ERole;
import com.bahar.buploadingvideo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(ERole name);
}