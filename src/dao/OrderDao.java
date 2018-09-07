package dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import bean.Order;

import com.sun.org.apache.bcel.internal.generic.NEW;

import cn.itcast.jdbc.TxQueryRunner;

public class OrderDao {
	QueryRunner qr = new TxQueryRunner();
	public List<Order> findall() throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from task";
		List<Order> order = qr.query(sql, new BeanListHandler<Order>(Order.class));
		return order;
	}
	public List<Order> findtake() throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from task where accept = ?";
		List<Order> order = qr.query(sql, new BeanListHandler<Order>(Order.class),false);
		return order;
	}
	public List<Order> findById(String userid) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from task where userid=? and end=?";
		Object[] params = {
				userid,
				false
		};
		List<Order> order = qr.query(sql, new BeanListHandler<Order>(Order.class),params);
		return order;
	}
	public List<Order> findByMy(String doid) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from task where doid=?";
		List<Order> order = qr.query(sql, new BeanListHandler<Order>(Order.class),doid);
		return order;
	}
	public void add(Order order) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "insert task values(?,?,?,?,?,?,?,?,?,?,?,?)";
		Object[] params = {
				null,
				order.getId(),
				order.getName(),
				order.getImg(),
				order.getMoney(),
				order.getAddress(),
				order.getDetail(),
				order.getUserid(),
				order.getTime(),
				false,
				false,
				false
		};
		qr.update(sql,params);
	}
	public void confirm(String taskid) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "update task set end = ? where id = ?";
		Object[] params = {
			true,
			taskid
		};
		qr.update(sql,params);
	}
	public void finish(String taskid) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "update task set finish = ? where id = ?";
		Object[] params = {
			1,
			taskid
		};
		qr.update(sql,params);
	}
	public void take(String taskid,String userid) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "update task set accept = ?,doid = ? where id = ?";
		Object[] params = {
			true,
			userid,
			taskid
		};
		qr.update(sql,params);
	}
	
}
