package com.tka.SpringBoot_API_Testing;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/Hostar")
public class MyController {
    @GetMapping("/home")
	public String Home() {
		return "This is a Hostar Home page";
	}
    @PostMapping("/search")
     public String Search() {
    	 return "Search in Anything";
     }
     @PutMapping("/tv")
     public String TV() {
    	 return "This is a Live TV Shows";
     }
     @DeleteMapping("/movies")
     public String Movies() {
    	 return "Hostar released movies free and paid";
     }
     @PostMapping("/sports")
     public String Sports() {
    	 return "Hostar Live Sports";
     }
     @DeleteMapping("/myspace")
     public String MySpace() {
    	 return "Regular Watching TV,Sports,Movies,Cartun Shows";
     }
     @PutMapping("catagories")
     public String Categories() {
    	 return "Popular Languages, Popular Sports, Popular Channels,Popular Generes ";
     }

}
