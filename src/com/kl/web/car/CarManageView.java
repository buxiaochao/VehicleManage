package com.kl.web.car;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.bstek.dorado.annotation.DataProvider;

@Component
public class CarManageView {
	
	@DataProvider
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Collection<Map<String,BigDecimal>> getInfo(String worksheetId){
		
		List list=new ArrayList();
		Map map = new HashMap();
		for(int i=0 ;i<1;i++){
			map.put("info", "转让信息");
			list.add(map);
		}
		return list;
		
	}
	@DataProvider
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Collection<Map<String,BigDecimal>> getTreeNodes(String worksheetId){
		
		List list=new ArrayList();
		Map map = new HashMap();
		for(int i=0 ;i<4;i++){
			map.put("car", "贵HU0368\rXXXXX公司");
			list.add(map);
		}
		return list;
		
	}
	
	@DataProvider
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Collection<Map<String,BigDecimal>> getTreeSubNodes(String worksheetId){
		
		List list=new ArrayList();
		Map map = new HashMap();
		for(int i=0 ;i<4;i++){
			map.put("car", "贵HU0368子公司");
			list.add(map);
		}
		return list;
		
	}

	
	
}
