package com.mindtree.user.mapper;

import java.util.List;

import com.mindtree.user.entity.OmfUser;
import com.mindtree.user.util.UserDto;

public interface UserMapper {

	public OmfUser mapToUser(UserDto userDto);
	public UserDto mapToUserDto(OmfUser user);
	public List<UserDto> mapToUserDtoList(List<OmfUser> userList);
	public OmfUser mapToUpdateUser(OmfUser user, UserDto userDto);
}
