package com.example.sample.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

	@GetMapping("/")
	@ResponseBody // json으로 변환해서 리터해줌
	public String getIndex() {
		return "index";
	}
	
}
