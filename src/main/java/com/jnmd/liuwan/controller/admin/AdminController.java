package com.jnmd.liuwan.controller.admin;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.Session;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jnmd.liuwan.domain.Admininsert;
import com.jnmd.liuwan.domain.PlaneAirport;
import com.jnmd.liuwan.domain.PlaneCompany;
import com.jnmd.liuwan.domain.PlaneOil;
import com.jnmd.liuwan.domain.Province;
import com.jnmd.liuwan.domain.User;
import com.jnmd.liuwan.service.AdminService;
import com.jnmd.liuwan.service.UserService;

@Controller
@Scope("prototype")
public class AdminController {

	@Resource
	private AdminService airport;
	@Resource
	private UserService userService;

	// 进入机票管理
	@RequestMapping("/insertAdmin")
	public String insertAdmin() {
		return "forward:/WEB-INF/jsp/admin/insert.jsp";
	}
	
	@RequestMapping("/insert")
	public String insert(Admininsert admininsert){
	    airport.insertPlane(admininsert);
	    return "forward:/WEB-INF/jsp/admin/insertSucc.jsp";
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
	
	//修改机票信息
	@RequestMapping("/redactEnd")
        public String redactEnd() {
                return "forward:/WEB-INF/jsp/admin/redactEnd.jsp";
        }
	@RequestMapping("/{pmid}/updateplane")
	public String update(Admininsert admininsert){
	    airport.updateplane(admininsert);
	    return "forward:/WEB-INF/jsp/admin/redactEnd.jsp";
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
        
        //删除
        @RequestMapping("/getDeletes")
        public ModelAndView getDeletes(int pmid){
                airport.getDeletes(pmid);
                ModelAndView mv = new ModelAndView();
                mv.setViewName("delete");
                return mv;
        }
	
	//机票
	@RequestMapping("/getairports")
	    public ModelAndView getairport(){
	            List<PlaneAirport> airports=airport.getairport();
	            List<Province> provinces=airport.getprovince();
	            List<PlaneCompany> planecompanys=airport.getplanecompany();
	            List<PlaneOil> planeoils=airport.getplaneoil();
	            ModelAndView mv = new ModelAndView();
	            mv.setViewName("insert");
	            mv.addObject("airports", airports);
	            mv.addObject("provinces", provinces);
	            mv.addObject("planecompanys", planecompanys);
	            mv.addObject("planeoils", planeoils);
	            return mv;
	        }
	
	//分页查询全部的机票
	@RequestMapping("/getAdmininserts")
        public ModelAndView getAdmininserts(HttpServletRequest request){
                Map<String,Object> mapd = new HashMap<String,Object>();
                List<PlaneAirport> airports=airport.getairport();
                List<Province> provinces=airport.getprovince();
                List<PlaneCompany> planecompanys=airport.getplanecompany();
                List<PlaneOil> planeoils=airport.getplaneoil();
                int pageNum = Integer.parseInt(request.getParameter("pageNum"));
                int start = (pageNum-1)*6;
                mapd.put("start",start);  
                mapd.put("pagesize",6);
                List<Admininsert> Admininserts = airport.getAdmininserts(mapd);
                int maxNum = airport.maxNum();
                int pageMax = (int)(Math.ceil(maxNum*1.0/6));
                ModelAndView mv = new ModelAndView();
                mv.setViewName("select");
                mv.addObject("Admininserts", Admininserts);
                mv.addObject("pageNum",pageNum);
                mv.addObject("pageMax", pageMax);
                mv.addObject("airports", airports);
                mv.addObject("provinces", provinces);
                mv.addObject("planecompanys", planecompanys);
                mv.addObject("planeoils", planeoils);
                return mv;
        }

	
	//分页查询全部的用户
	@RequestMapping("/getUsers")
	public ModelAndView getUsers(HttpServletRequest request){
		Map<String,Object> map = new HashMap<String,Object>();
		int pageNum = Integer.parseInt(request.getParameter("pageNum"));
		int start = (pageNum-1)*6;
		map.put("start",start);  
                map.put("pagesize",6);
		List<User> users = userService.getUsers(map);
		int maxNum = userService.maxNum();
		int pageMax = (int)(Math.ceil(maxNum*1.0/6));
		ModelAndView mv = new ModelAndView();
		mv.setViewName("adminUser");
		mv.addObject("users", users);
		mv.addObject("pageNum",pageNum);
		mv.addObject("pageMax", pageMax);
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
              System.out.println(map);
              List<User> users = userService.getAllTime(map);
              ModelAndView mv = new ModelAndView();
              mv.setViewName("timeUser");
              mv.addObject("users", users);
              return mv;
        }
        
      //根据时间范围查询plane用户
        @RequestMapping("/getAllTimes")
        public ModelAndView getAllTimes(HttpServletRequest request) throws ParseException{
              List<PlaneAirport> airports=airport.getairport();
              List<Province> provinces=airport.getprovince();
              List<PlaneCompany> planecompanys=airport.getplanecompany();
              List<PlaneOil> planeoils=airport.getplaneoil();
              String start=request.getParameter("start");
              String end=request.getParameter("end");
              SimpleDateFormat  formatter=new SimpleDateFormat("HH:mm");
              Map<String,Object> map =new HashMap<String,Object>();
              map.put("start", start);
              map.put("end", end);
              System.out.println(start+" "+end);
              List<Admininsert> AllTimes = airport.getAllTime(map);
              ModelAndView mv = new ModelAndView();
              mv.setViewName("timePlane");
              mv.addObject("AllTimes", AllTimes);
              mv.addObject("airports", airports);
              mv.addObject("provinces", provinces);
              mv.addObject("planecompanys", planecompanys);
              mv.addObject("planeoils", planeoils);
              return mv;
        }
        
        @RequestMapping("/{pmid}/getredact")
        public ModelAndView getReadact(@PathVariable("pmid")int pmid) {
            List<Admininsert> airports=airport.getredact(pmid);
            List<PlaneAirport> airportss=airport.getairport();
            List<Province> provinces=airport.getprovince();
            List<PlaneCompany> planecompanys=airport.getplanecompany();
            List<PlaneOil> planeoils=airport.getplaneoil();
            System.out.println(airports);
            ModelAndView mv = new ModelAndView();
            mv.setViewName("redact");
            mv.addObject("airports", airports);
            mv.addObject("airportss", airportss);
            mv.addObject("provinces", provinces);
            mv.addObject("planecompanys", planecompanys);
            mv.addObject("planeoils", planeoils);
            return mv;
            
        }

}
