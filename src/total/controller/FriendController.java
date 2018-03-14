package total.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import total.service.FriendService;

@Controller
@RequestMapping("/friend")
public class FriendController {

@Autowired
FriendService friendservice;


	public String friend01Handle(@RequestParam Map map,
			Model model) {
		
		try {
			boolean rst = friendservice.frinedDBInsert(map);
			if(rst) {
				model.addAttribute("other", map.get("other"));
				
				return "friend";
			}
			throw new Exception();
		}catch(Exception e) {
			
			
			return "friend";
		}
		
	}

	
}
