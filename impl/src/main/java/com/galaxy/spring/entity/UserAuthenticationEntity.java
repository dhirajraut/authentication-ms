package com.galaxy.spring.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table (name = "user_authentication")
public class UserAuthenticationEntity {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column (nullable = false, name = "user_id")
	private String userId;
	
	@Column (nullable = false, name = "password")
	private String password;
	
	@Column (nullable = false, name = "active")
	private boolean active;
	
	@ManyToMany (cascade = CascadeType.ALL)
	@JoinTable (name = "user_role_mapping",
				joinColumns = @JoinColumn (name = "user_id"),
				inverseJoinColumns = @JoinColumn (name = "role_id"))
	private Set<UserRolesEntity> roles;
}
