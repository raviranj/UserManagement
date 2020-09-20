package com.mindtree.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.user.entity.OmfUser;

@Repository
public interface UserDao extends JpaRepository<OmfUser, Long>{

}
