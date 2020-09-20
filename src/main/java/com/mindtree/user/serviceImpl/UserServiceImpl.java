package com.mindtree.user.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.user.dao.UserDao;
import com.mindtree.user.entity.OmfUser;
import com.mindtree.user.mapperImpl.UserMapperImpl;
import com.mindtree.user.service.UserService;
import com.mindtree.user.util.UserDto;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapperImpl mapper;

	@Autowired
	private UserDao dao;

	@Override
	public void createUser(UserDto userDto) {
		dao.save(mapper.mapToUser(userDto));
	}

	@Override
	public List<UserDto> findUsers() {
		List<OmfUser> userList = dao.findAll();
		return mapper.mapToUserDtoList(userList);
	}

	@Override
	public UserDto findUser(Long id) {
		Optional<OmfUser> Optuser = dao.findById(id);
		UserDto userDto = null;
		if (Optuser.isPresent())
			userDto = mapper.mapToUserDto(Optuser.get());
		return userDto;
	}

	@Override
	public void updateUser(UserDto userDto) {
		if (userDto.getUserId() != null) {
			Optional<OmfUser> Optuser = dao.findById(userDto.getUserId());
			if (Optuser.isPresent())
				dao.save(mapper.mapToUpdateUser(Optuser.get(), userDto));
		}
	}

	@Override
	public void deleteUser(Long id) {
		dao.deleteById(id);
	}

}
