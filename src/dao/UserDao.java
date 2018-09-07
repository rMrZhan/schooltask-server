package dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import bean.User;

import cn.itcast.jdbc.TxQueryRunner;

public class UserDao {
	QueryRunner qr = new TxQueryRunner();
	public User find(String name) throws SQLException{
		String sql = "select * from user where username=?";
		User user=qr.query(sql, new BeanHandler<User>(User.class),name);
		return user;
	}
	public void add(User user) throws SQLException {
		String sql = "insert user values(?,?,?,?,?,?)";
		Object[] params = {
				user.getId(),
				user.getUsername(),
				user.getPassword(),
				"暂无",
				"暂无",
				"暂无"
		};
		qr.update(sql,params);
	}
	public User findname(String doid) throws SQLException {
		String sql = "select * from user where id=?";
		
		User user=qr.query(sql, new BeanHandler<User>(User.class),doid);
		return user;
	}

}
