package com.galaxy.spring.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.galaxy.spring.entity.UserRolesEntity;

/**
 * JPA Repository for UserRolesEntity.
 */
public interface IUserRolesRepository extends JpaRepository<UserRolesEntity, Long> {

}
