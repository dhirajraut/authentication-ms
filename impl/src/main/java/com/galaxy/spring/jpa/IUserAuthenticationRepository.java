package com.galaxy.spring.jpa;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.galaxy.spring.entity.UserAuthenticationEntity;

/**
 * JPA Repository for UserAuthenticationEntity.
 */
public interface IUserAuthenticationRepository extends JpaRepository<UserAuthenticationEntity, Long> {

    Optional<UserAuthenticationEntity> findByUserId(String userId);
}
