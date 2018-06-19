package spittr.web;

import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/", "/homepage"})
public class HomeController {
	
	@RequestMapping(method=GET)
	public String home() {
		System.out.println("home start ...");
		return "home";
	}

}
