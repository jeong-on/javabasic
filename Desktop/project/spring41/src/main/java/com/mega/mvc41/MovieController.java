package com.mega.mvc41;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {

	@RequestMapping("movie")
	private String movie(String title, String price, Model model) {
		System.out.println("영화 제목 : " + title + "결제 금액 : " + price);
		model.addAttribute("title", title);
		model.addAttribute("price", price);
		
		return "list";
		
	}
}
