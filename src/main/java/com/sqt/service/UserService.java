package com.sqt.service;

import java.util.List;

import com.sqt.pojo.User;

public interface UserService {
	/**查询用户
	 * @param user
	 * @return
	 */
	User findUser(User user);
	
	/**查询所有用户
	 * @return
	 */
	List<User> findList();
}
