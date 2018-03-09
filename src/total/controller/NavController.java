package total.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import total.service.NavService;

@Controller
@RequestMapping("/join")
public class NavController {
@Autowired
NavService navservice;




@RequestMapping(method= RequestMethod.POST)
public String Nav01Handle(Model model,
		@RequestParam Map<String, String> param) {
	
	
	
	model.addAttribute("Member", param.get("id"));
	
	return "nav";
}


}
