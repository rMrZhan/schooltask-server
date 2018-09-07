package service;

import java.sql.SQLException;

import cn.itcast.commons.CommonUtils;

import bean.User;

import dao.UserDao;

public class UserService {
	UserDao userDao = new UserDao();

	public User Login(String username, String password) throws SQLException, UserException {
		// TODO Auto-generated method stub
	    User user = userDao.find(username);
		if(user == null) throw new UserException("用户名不存在！");
		if(!user.getPassword().equals(password))
			throw new UserException("密码错误！");
		return user;
	}

	public void regist(String username,String password) throws SQLException, UserException {
		// TODO Auto-generated method stub
		User user = new User();
		user.setId(CommonUtils.uuid());
		user.setUsername(username);
		user.setPassword(password);
		if(user.getUsername() == null||user.getUsername().trim().isEmpty()) throw new UserException("用户名不能为空！");
		if(user.getPassword() == null||user.getPassword().trim().isEmpty()) throw new UserException("密码不能为空！");
		if(userDao.find(user.getUsername())!=null) throw new UserException("用户名已被注册！");
		for(int i=0;i<user.getUsername().length();i++){
			char a=user.getUsername().charAt(i);
			if(a>=48 && a<=57){
				
			}else if((a>=65 && a<=90) ||(a>=97 && a<=122)){
				
			}else{
				throw new UserException("用户名包含特殊字符！");
			}
		}
		userDao.add(user);
	}

	public User findname(String doid) throws SQLException {
		// TODO Auto-generated method stub
		return userDao.findname(doid);
	}
}
