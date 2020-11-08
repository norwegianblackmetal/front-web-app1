package krabkrab.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@GetMapping("/link")
	public String link() {
		return "link";
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "hello";
	}

	@GetMapping("/metallica")
	public String metallica(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "metallica";
	}
}