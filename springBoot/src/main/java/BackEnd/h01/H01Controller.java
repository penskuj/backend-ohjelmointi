package BackEnd.h01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class H01Controller {

	@RequestMapping("index")
	@ResponseBody
	public String indexMessage() {
		return "This is the main page";
	}
	
	@RequestMapping("contact")
	@ResponseBody
	public String contactMessage() {
		return "This is the contact page";
	}
	
	@RequestMapping("hello")
	@ResponseBody
	public String returnGreeting(@RequestParam (required=false, defaultValue="moon") String location, @RequestParam (required=false, defaultValue="John") String name) {
		return "Welcome to the " + location + " " + name + "!";
	}
}

