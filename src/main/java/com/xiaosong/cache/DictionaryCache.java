package com.xiaosong.cache;

import java.util.List;

import com.xiaosong.constant.Constant;
import com.xiaosong.model.VDictionaries;

public class DictionaryCache {
	public void intoCache() {
		List<VDictionaries> list = VDictionaries.dao.findByCache(Constant.DICTIONARY_MENU, "dictionary", "select * from v_dictionaries");
		System.out.println(list.get(0).getDictionariesKey());
	}
	
}
