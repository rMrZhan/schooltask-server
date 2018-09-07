package service;

import java.sql.SQLException;
import java.util.List;

import bean.Order;

import dao.OrderDao;

public class OrderService {
	OrderDao orderDao = new OrderDao();
	public List<Order> findall() throws SQLException {
		// TODO Auto-generated method stub
		List<Order> order = orderDao.findall();
		return order;
	}
	public List<Order> findById(String userid) throws SQLException {
		// TODO Auto-generated method stub
		List<Order> order = orderDao.findById(userid);
		return order;
	}
	public List<Order> findByMy(String doid) throws SQLException {
		// TODO Auto-generated method stub
		List<Order> order = orderDao.findByMy(doid);
		return order;
	}
	public void add(Order order) throws SQLException {
		// TODO Auto-generated method stub
		orderDao.add(order);
	}
	public void confirm(String taskid) throws SQLException {
		// TODO Auto-generated method stub
		orderDao.confirm(taskid);
	}
	public void finish(String taskid) throws SQLException {
		// TODO Auto-generated method stub
		orderDao.finish(taskid);
	}
	public void take(String taskid,String userid) throws SQLException {
		// TODO Auto-generated method stub
		orderDao.take(taskid, userid);
		
	}
	public List<Order> findtake() throws SQLException {
		return orderDao.findtake();
		
	}

}
