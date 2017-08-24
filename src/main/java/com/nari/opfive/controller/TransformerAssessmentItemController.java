package com.nari.opfive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nari.opfive.service.TransformerAssessmentItemService;

@Controller
@RequestMapping("/")
public class TransformerAssessmentItemController {
	
	@Autowired
	private TransformerAssessmentItemService transAssItemServ;
	
	public ModelAndView rootItemList(Model model) {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("rootitem", transAssItemServ.getPrimaryItems());
		mav.setViewName("/");
		
		
		return mav;
		
	} 
	

}
