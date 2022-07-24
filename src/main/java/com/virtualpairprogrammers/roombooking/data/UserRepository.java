package com.virtualpairprogrammers.roombooking.data;

import com.virtualpairprogrammers.roombooking.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
