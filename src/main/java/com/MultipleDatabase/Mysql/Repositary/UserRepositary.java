package com.MultipleDatabase.Mysql.Repositary;

import com.MultipleDatabase.Mysql.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositary extends JpaRepository<User,Integer> {
}
