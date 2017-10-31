package com.nari.opfive.service;

import java.util.List;
import java.util.Map;

import com.nari.opfive.domain.Judgementitem;
import com.nari.opfive.domain.Judgementsubitem;
import com.nari.opfive.domain.Rootasseitem;


public interface TransformerAssessmentItemService {
	
	List<Rootasseitem> getPrimaryItems();
	
	List<Judgementitem> getSecondaryItems(int rootItemID);
	
	List<Judgementsubitem> getSubItems(int judItemID);
	
	Map<String, List<Judgementitem>> getAllItems();

}
