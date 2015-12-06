package com.jeecms.cms.dao.assist;

import java.util.List;

import com.jeecms.cms.entity.assist.CmsPlug;
import com.jeecms.common.hibernate3.Updater;
import com.jeecms.common.page.Pagination;

public interface CmsPlugDao {
	public Pagination getPage(int pageNo, int pageSize);
	
	public List<CmsPlug> getList(String author,Boolean used);

	public CmsPlug findById(Integer id);
	
	public CmsPlug findByPath(String plugPath);

	public CmsPlug save(CmsPlug bean);

	public CmsPlug updateByUpdater(Updater<CmsPlug> updater);

	public CmsPlug deleteById(Integer id);
}