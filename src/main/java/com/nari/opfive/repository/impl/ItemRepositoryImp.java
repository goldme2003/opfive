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
	
	Configuration config = new Configuration().configure();
	SessionFactory sessionfact = config.buildSessionFactory();
	Session session = sessionfact.openSession();

	@Override
	public List<Rootasseitem> getAllRootItems() {
	    String rootItemSql = "select * from rootasseitem";
	    NativeQuery<Rootasseitem> query = session.createNativeQuery(rootItemSql, Rootasseitem.class);
	    List<Rootasseitem> rootitemlist = query.getResultList();
	    
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

}
