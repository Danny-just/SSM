package edu.just.controller;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.just.model.User;
import edu.just.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService=null;
	@RequestMapping("/showUser")
	public String getUser(Model model,HttpServletRequest request,HttpServletResponse reponse){
		int userId = Integer.parseInt(request.getParameter("id"));
	    User user = this.userService.getUserById(userId);
	    System.out.println(user);
	    model.addAttribute("user", user);
	    return "ShowUser";
	}
	@ResponseBody
	@RequestMapping(value="/list")
	public User User(HttpServletRequest request,HttpServletResponse response){
		int userId = Integer.parseInt(request.getParameter("id"));
	    User user = this.userService.getUserById(userId);
		return user;
	}
	@RequestMapping(value="/userAll", method = RequestMethod.GET)
	public String getAllUser(HttpServletRequest request,HttpServletResponse response,Model model){
		ArrayList<User> users = this.userService.selectAllUser();
		model.addAttribute("users", users);
		return "ShowUserAll";
	}
	@ResponseBody
	@RequestMapping(value="insertUser", method = RequestMethod.POST)
	public String insertUser(HttpServletRequest request,HttpServletResponse response,Model model){
		String userName= request.getParameter("userName");
		String password= request.getParameter("password");
		String tel= request.getParameter("tel");
		String email= request.getParameter("email");
		User user = new User(null,userName,password,tel,email);
		String insertUser = this.userService.insertUser(user);
		return insertUser;
	}
	@ResponseBody
	@RequestMapping(value = "delete", method = RequestMethod.DELETE)
	public String deleteById(HttpServletRequest request,HttpServletResponse response){
		
		return null;
	}
}
