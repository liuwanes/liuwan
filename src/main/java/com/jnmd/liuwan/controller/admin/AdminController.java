package com.jnmd.liuwan.controller.admin;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jnmd.liuwan.domain.User;
import com.jnmd.liuwan.service.UserService;

@Controller
@Scope("prototype")
public class AdminController {

	@Resource
	private UserService userService;

	// 进入机票管理
	@RequestMapping("/insertAdmin")
	public String insertAdmin() {
		return "forward:/WEB-INF/jsp/admin/insert.jsp";
	}

	// 管理员登陆
	@RequestMapping("/adminLogin")
	public String adminLogin() {
		return "forward:/WEB-INF/jsp/admin/adminLogin.jsp";
	}

	@RequestMapping("/login")
	public String login() {
		return "forward:/WEB-INF/jsp/admin/admin.jsp";
	}

	// 进入管理员管理用户界面
	@RequestMapping("/AdminUser")
	public String AdminUser() {
		return "forward:/WEB-INF/jsp/admin/adminUser.jsp";
	}

	// 根据id获得详情
	@RequestMapping("/{uid}/getUser")
	public ModelAndView getUser(@PathVariable("uid") int id) {
		User user = userService.getUser(id);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("userInfo");
		mv.addObject("user", user);
		return mv;
	}

	//根据时间范围查询user用户
	@RequestMapping("/getAllTime")
	public ModelAndView getAllTime(HttpServletRequest request) throws ParseException{
		  String s=request.getParameter("start");
		  String e=request.getParameter("end");
		  SimpleDateFormat  formatter=new SimpleDateFormat("yyyy-MM-dd");
		  Date  start=formatter.parse(s);
		  Date  end=formatter.parse(e);
		  Map<String,Object> map =new HashMap<String,Object>();
		  map.put("start", start);
		  map.put("end", end);
		  List<User> users = userService.getAllTime(map);
		  System.out.println(users);
	      ModelAndView mv = new ModelAndView();
	      mv.setViewName("timeUser");
	      mv.addObject("users", users);
	      return mv;
	}

	// 分页查询全部的用户
	@RequestMapping("/getUsers")
	public ModelAndView getUsers(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		int pageNum = Integer.parseInt(request.getParameter("pageNum"));
		int start = (pageNum - 1) * 6;
		map.put("start", start);
		map.put("pagesize", 6);
		List<User> users = userService.getUsers(map);
		System.out.println(users);
		int maxNum = userService.maxNum();
		int pageMax = (int) (Math.ceil(maxNum * 1.0 / 6));
		ModelAndView mv = new ModelAndView();
		mv.setViewName("adminUser");
		mv.addObject("users", users);
		mv.addObject("pageNum", pageNum);
		mv.addObject("pageMax", pageMax);
		return mv;
	}

}
