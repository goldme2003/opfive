package com.nari.opfive.repository.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.springframework.stereotype.Repository;

import com.nari.opfive.domain.Judgementitem;
import com.nari.opfive.domain.Rootasseitem;
import com.nari.opfive.repository.ItemRepository;

@Repository
public class ItemRepositoryImp implements ItemRepository{
	
	Configuration config = new Configuration().configure("hibernate.cfg.xml");
	SessionFactory sessionfact = config.buildSessionFactory();
	Session session = sessionfact.openSession();

	@Override
	public List<Rootasseitem> getAllRootItems() {
	    String rootItemSql = "select * from rootasseitem";
	    NativeQuery<Rootasseitem> query = session.createNativeQuery(rootItemSql, Rootasseitem.class);
	    List<Rootasseitem> rootitemlist = query.getResultList();
	    if(rootitemlist != null) {
	    	System.out.println("loading data completed!!");
	    }
//	    session.close();
	    	    
	    
		return rootitemlist;
	}

	@Override
	public Map<Integer, List<Judgementitem>> getRootRelatItems(Rootasseitem rootitem) {
		Map<Integer, List<Judgementitem>> rootJudgeMap = new HashMap<Integer, List<Judgementitem>>();
		int rootItemId = rootitem.getRootAsseItemId();
		String judgeItemsql = "select * from judgementitem where RootAsseItemID = " + String.valueOf(rootItemId);
		NativeQuery<Judgementitem> rootJudgeItem = session.createNativeQuery(judgeItemsql, Judgementitem.class);
		List<Judgementitem> judgeItemList = rootJudgeItem.getResultList();
		rootJudgeMap.put(rootItemId, judgeItemList);
		
		return rootJudgeMap;
	}

	@Override
	public Map<String, List<Judgementitem>> getAllItems() {
		
		Map<String, List<Judgementitem>> itemMap = new HashMap<String, List<Judgementitem>>();
	    String rootItemSql = "select * from rootasseitem";
	    NativeQuery<Rootasseitem> query = session.createNativeQuery(rootItemSql, Rootasseitem.class);
	    List<Rootasseitem> rootitemlist = query.getResultList();
	    if(rootitemlist != null) {
	    	System.out.println("loading data completed,and ready for combining into items map!!");
	    }
	    
	    for(Rootasseitem rootItem : rootitemlist) {
			String rootItemName = rootItem.getRootAsseItemName();
			int rootItemId = rootItem.getRootAsseItemId();

			String judgeItemsql = "select * from judgementitem where RootAsseItemID = " + String.valueOf(rootItemId);
			NativeQuery<Judgementitem> rootJudgeItem = session.createNativeQuery(judgeItemsql, Judgementitem.class);
			itemMap.put(rootItemName, rootJudgeItem.getResultList());
	    	
	    }
	    
	    return itemMap;
	    


	}

}
