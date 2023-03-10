package kw.kng.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kw.kng.app.entities.User;
import kw.kng.app.service.UserService;

@Controller
public class UserController 
{
	@Autowired
	UserService us;

		@GetMapping("/")
		public String loadForm(HttpServletRequest req) 
		{
			return "index";
		}

		@PostMapping("/user")
		public String handleSubmitBtn(User user, Model model)
		{

			System.out.println(user);
			us.saveUser(user);
			model.addAttribute("msg", "User saved into DB");
			return "index";
		}
}


