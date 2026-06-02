package com.ecommerceapplication.ecommerceapplication.repositories;

import com.ecommerceapplication.ecommerceapplication.entites.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
