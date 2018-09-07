package servlet;


import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.processors.JsonBeanProcessor;

import bean.Order;

import service.OrderService;
import service.UserException;

import cn.itcast.commons.CommonUtils;
import cn.itcast.servlet.BaseServlet;

public class OrderServlet extends BaseServlet {
	OrderService orderService = new OrderService();
	public void add(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Order order = CommonUtils.toBean(request.getParameterMap(), Order.class);
		order.setId(CommonUtils.uuid());
		try {
			orderService.add(order);
			response.getWriter().print("下单成功");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			response.getWriter().print("下单失败");
			response.getWriter().print(e.getMessage());
	}
}
	public void findall(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		List<Order> order = orderService.findall();
		JSONArray jsonArray = JSONArray.fromObject(order);
		response.getWriter().println(jsonArray);
		
	}
	public void findtake(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		List<Order> order = orderService.findtake();
		JSONArray jsonArray = JSONArray.fromObject(order);
		response.getWriter().println(jsonArray);
	}
	public void findById(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		String userid = request.getParameter("userid");
		List<Order> order = orderService.findById(userid);
		JSONArray jsonArray = JSONArray.fromObject(order);
		response.getWriter().println(jsonArray);
	}
	public void findByMy(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		String doid = request.getParameter("userid");
		List<Order> order = orderService.findByMy(doid);
		JSONArray jsonArray = JSONArray.fromObject(order);
		response.getWriter().println(jsonArray);
	}
	public void confirm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		String taskid = request.getParameter("taskid");
		orderService.confirm(taskid);
		response.getWriter().println("订单完成，支付成功");
	}
	public void finish(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		String taskid = request.getParameter("taskid");
		orderService.finish(taskid);
		response.getWriter().println("已完成订单，等待单主确认");
	}
	public void take(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		String taskid = request.getParameter("taskid");
		String userid = request.getParameter("userid");
		orderService.take(taskid,userid);
		response.getWriter().println("接单成功");
	}
	

       
}
