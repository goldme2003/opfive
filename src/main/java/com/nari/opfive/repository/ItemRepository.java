package com.nari.opfive.repository;

import java.util.List;
import java.util.Map;

import com.nari.opfive.domain.Judgementitem;
import com.nari.opfive.domain.Rootasseitem;

public interface ItemRepository {
	
	public List<Rootasseitem> getAllRootItems();
	
	public Map<Integer, List<Judgementitem>> getRootRelatItems(Rootasseitem rootitem);
	
	
	

}
