package kw.kng.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController 
{
		/*
		 =================================== Query Param Example =====================================
		 */	
	
	// http://localhost:8080/msg?name=ashok

		@GetMapping("/msg")
		public ModelAndView getMsg(@RequestParam String name) 
		{

			String msgTxt = "Good Evening, " +name;

			ModelAndView mav = new ModelAndView();
			mav.addObject("msg", msgTxt);
			mav.setViewName("index");

			return mav;
		}

		// http://localhost:8080/book?name=spring&author=johnson

		@GetMapping("/book")
		public ModelAndView getBookData(@RequestParam String name, @RequestParam String author) 
		{

			System.out.println("Name :: " + name);
			System.out.println("Author ::" + author);

			ModelAndView mav = new ModelAndView();
			mav.addObject("msg", name + " By " + author + " is out of stock...");
			mav.setViewName("index");

			return mav;
		}

}
