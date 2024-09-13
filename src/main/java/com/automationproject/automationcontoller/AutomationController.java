package com.automationproject.automationcontoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutomationController {
	@GetMapping(value="/getMessage")
	public String getMessage() {
		return "Hai Hello";
	}
}
