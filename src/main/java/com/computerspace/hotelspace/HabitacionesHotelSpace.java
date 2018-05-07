package com.computerspace.hotelspace;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/habitaciones")
public class HabitacionesHotelSpace {
	
	@GetMapping
	public String habitaciones(){
		
		return "habitaciones";
	}

}
