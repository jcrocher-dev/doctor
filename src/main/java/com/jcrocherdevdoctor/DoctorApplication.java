package com.jcrocherdevdoctor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller	
@SpringBootApplication
public class DoctorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorApplication.class, args);
	}

	
	@RequestMapping("/doctor")
    @ResponseBody
    public String index() {
		return "<h1>Doctor Who</h1>"
        		+ "<p> "
        		+ "<ul> "
        		+ "<li><a href='/doctor/1'>number 1</a></li>"
        		+ "<li><a href='/doctor/2'>number 2</a></li>"
        		+ "<li><a href='/doctor/3'>number 3</a></li>"
        		+ "<li><a href='/doctor/4'>number 4</a></li>"
        		+ "</ul> "
        		+ "</p>";
        			
    }
	
	@GetMapping("/doctor/1")
    @ResponseBody
    public String page1() {
		return "<h1>William Hartnell</h1>"
				+ "<p>"
				+ "<img src=\"//upload.wikimedia.org/wikipedia/en/thumb/a/aa/William_Hartnell.jpg/220px-William_Hartnell.jpg\"></img>"
				+ "</p>";
    }
	
	@GetMapping("/doctor/2")
    @ResponseBody
    public String page2() {
		return "<h1>Tom Backer</h1>"
				+ "<p>"
				+ "<img src=\"//upload.wikimedia.org/wikipedia/commons/thumb/4/43/Tom_Baker.jpg/220px-Tom_Baker.jpg\"></img>"
				+ "</p>";
    }
	
	@GetMapping("/doctor/3")
    @ResponseBody
    public String page3() {
		return "<h1>Matt Smith</h1>"+ "<p>"
				+ "<img src=\"//upload.wikimedia.org/wikipedia/commons/thumb/8/89/Matt_Smith_by_Gage_Skidmore_2.jpg/220px-Matt_Smith_by_Gage_Skidmore_2.jpg\"></img>"
				+ "</p>";
    }
	
	@GetMapping("/doctor/4")
    @ResponseBody
    public String page4() {
		return "<h1>Jodie Whittaker</h1>"
				+ "<p>"
				+ "<img src=\"//upload.wikimedia.org/wikipedia/commons/thumb/7/72/Jodie_Whittaker_by_Gage_Skidmore.jpg/220px-Jodie_Whittaker_by_Gage_Skidmore.jpg\"></img>"
				+ "</p>";
    }
	

}



