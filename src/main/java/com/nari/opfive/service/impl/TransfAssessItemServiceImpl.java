package com.nari.opfive.service.impl;

import java.util.List;

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

	@Override
	public List<Rootasseitem> getPrimaryItems() {
		
		return itemrep.getAllRootItems();
	}

	@Override
	public List<Judgementitem> getSecondaryItems(int rootItemID) {
		// TODO Auto-generated method stub
		return null;
	}

}
