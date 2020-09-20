package com.mindtree.user.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user")
public class OmfUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userId")
	@Getter
	@Setter
	private Long userId;

	@Column(name = "name")
	@Getter
	@Setter
	private String name;

	@Column(name = "contactNumber")
	@Getter
	@Setter
	private Long contactNumber;

	@Column(name = "email")
	@Getter
	@Setter
	private String email;

	@Column(name = "password")
	@Getter
	@Setter
	private String password;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userType_id", referencedColumnName = "userTypeId")
	@Getter
	@Setter
	private OmfUserType omgUserType;
	
	
}
