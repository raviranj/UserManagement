package com.mindtree.user.service;

import java.util.List;

import com.mindtree.user.util.UserDto;

public interface UserService {
	
	public void createUser(UserDto userDto);
	public List<UserDto> findUsers();
	public UserDto findUser(Long id);
	public void updateUser(UserDto userDto);
	public void deleteUser(Long id);
	

}
