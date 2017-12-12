package com.nari.opfive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/insertitem")
public class ItemInsertController {
	
	@RequestMapping()
	public ModelAndView showInsertView(Model model){
		
		ModelAndView mav_insert = new ModelAndView();
		mav_insert.setViewName("insertPage");
		
		
		return mav_insert;
		
	} 

}
