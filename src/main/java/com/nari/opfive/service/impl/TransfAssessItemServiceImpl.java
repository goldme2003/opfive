package com.nari.opfive.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nari.opfive.domain.Judgementitem;
import com.nari.opfive.domain.Rootasseitem;
import com.nari.opfive.repository.ItemRepository;
import com.nari.opfive.service.TransformerAssessmentItemService;

@Service
public class TransfAssessItemServiceImpl implements TransformerAssessmentItemService{
	
	@Autowired
	private ItemRepository itemrep;

	
	public List<Rootasseitem> getPrimaryItems() {
		
		return itemrep.getAllRootItems();
	}

	
	public List<Judgementitem> getSecondaryItems(int rootItemID) {
		Map<Integer, List<Judgementitem>> itemMap = new HashMap<Integer, List<Judgementitem>>();
		List<Judgementitem> jItemList = new ArrayList<Judgementitem>();
		for(Rootasseitem rItem : itemrep.getAllRootItems()) {
			if(rItem.getRootAsseItemId() == rootItemID) {
				itemMap = itemrep.getRootRelatItems(rItem);
				jItemList = itemMap.get(rItem.getRootAsseItemId());
				
				break;
				
			}
		}
		
		return jItemList;
	
	}

	
	public Map<String, List<Judgementitem>> getAllItems() {


		return itemrep.getAllItems();
	}

}
