package pe.efact.ose.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/greeting")
	public String sayHello(Model model) {
		model.addAttribute("greeting", "Hello World!");
		
		return "hello";
	}

}
