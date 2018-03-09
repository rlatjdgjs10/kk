package total.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class indexController {
	
	@RequestMapping("/01")
	public String index01Handle(Model model) {
		
		model.addAttribute("view", "view");
		
		return "index";
	}
}
