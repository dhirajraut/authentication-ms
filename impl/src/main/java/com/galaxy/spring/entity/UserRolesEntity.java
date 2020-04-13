package com.galaxy.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/* Lombok Annotations. */
@Getter
@Setter
@NoArgsConstructor
@ToString

/* JPA Annotations. */
@Entity
@Table (name = "user_roles")
public class UserRolesEntity {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column (nullable = false, name = "role_name")
	private String roleName;
	
	@Column (nullable = false, name = "active")
	private boolean active;
}
