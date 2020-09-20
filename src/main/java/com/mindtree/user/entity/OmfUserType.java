package com.mindtree.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "userType")
public class OmfUserType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userTypeId")
	@Getter
	@Setter
	private Long userTypeId;

	@Column(name = "type")
	@Getter
	@Setter
	private String type;

	@OneToOne(mappedBy = "omgUserType")
	@Getter
	@Setter
	private OmfUser user;
}
