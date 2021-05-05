package com.mega.mvc41;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ComputerController {

	@RequestMapping("computer")
	private void product(ComputerVO bag, Model model) {
		System.out.println("프로덕트 컨트롤러 까지 넘어옴" + bag);
		model.addAttribute("bag", bag);
	}
}
