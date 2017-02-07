package com.example.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.example.user.model.*;

public interface UserDao extends JpaRepository<User, Integer>,JpaSpecificationExecutor<User> {
}

