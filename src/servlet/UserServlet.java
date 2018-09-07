package servlet;


import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import bean.User;

import service.UserException;
import service.UserService;

import cn.itcast.servlet.BaseServlet;

public class UserServlet extends BaseServlet {
	UserService userService = new UserService();
	String username ;
	String password;
	public void regist(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		username = request.getParameter("username");
		password = request.getParameter("password");
		try {
			userService.regist(username,password);
			request.setAttribute("msg", "注册成功");
			response.getWriter().print("注册成功");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			response.getWriter().print(e.getCause());
	}
		catch (UserException e) {
			// TODO Auto-generated catch block
//			response.getWriter().print("用户名或密码错误，清重新登录");
			response.getWriter().print(e.getCause());
	}
}
	public void Login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException, UserException {
		// TODO Auto-generated method stub
		username = request.getParameter("username");
		password = request.getParameter("password");
		User user = userService.Login(username,password) ;
		JSONObject jsonObject = JSONObject.fromObject(user);
		response.getWriter().print(jsonObject);
	}
	public void findname(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException, UserException {
		// TODO Auto-generated method stub
		String doid = request.getParameter("doid");
		password = request.getParameter("password");
		User user = userService.findname(doid) ;
		response.getWriter().print(user.getUsername());
	}
}
