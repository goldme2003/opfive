package com.nari.opfive.controller;

import java.util.ArrayList;
import java.util.List;


import com.nari.opfive.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.nari.opfive.domain.Rootasseitem;
import com.nari.opfive.service.TransformerAssessmentItemService;

@Controller
@RequestMapping(value = "/item")
public class TransformerAssessmentItemController {
	
	@Autowired
	private TransformerAssessmentItemService transAsseItemServ;
	
	@RequestMapping()
	public ModelAndView rootItemList(Model model) {
		
		List<Rootasseitem> testRootitemList = new ArrayList<Rootasseitem>();
		Checkmethod testCheck = new Checkmethod();
		Checkresult testCheckR = new Checkresult();
		Equipment testEquip = new Equipment();
		Judgementitem testJudItem = new Judgementitem();
		Judgementsubitem testJudSubItem = new Judgementsubitem();
		
		Task testTask = new Task();
		Taskoperator testTaskoper = new Taskoperator();
		Rootasseitem testRootAsItem1 = new Rootasseitem(1, testTask, "检查文档1");
		Rootasseitem testRootAsItem2 = new Rootasseitem(2, testTask, "检查文档2");
		Rootasseitem testRootAsItem3 = new Rootasseitem(3, testTask, "检查文档3");
		
		testRootitemList.add(testRootAsItem1);
		System.out.println("item 1 added!");
		testRootitemList.add(testRootAsItem2);
		System.out.println("item 2 added!");
		testRootitemList.add(testRootAsItem3);
		System.out.println("item 3 added!");
		
		
		
		ModelAndView mav = new ModelAndView();
		
//		mav.addObject("rootitem", transAsseItemServ.getPrimaryItems());
		mav.addObject("alllevitems", transAsseItemServ.getAllItems());
		mav.setViewName("main");
		
		
		return mav;
		
	}
	
	@RequestMapping(value="/subitem/{subItemId}", method = RequestMethod.GET)
	public @ResponseBody List<Judgementsubitem>  getSubItemList(@PathVariable(value="subItemId") String subItemId, Model subItemModel) {
		//subItemModel.addAttribute("subItemId", subItemId);
		System.out.println("RESTful service started.");
		return transAsseItemServ.getSubItems(Integer.valueOf(subItemId));
		
	}


}
