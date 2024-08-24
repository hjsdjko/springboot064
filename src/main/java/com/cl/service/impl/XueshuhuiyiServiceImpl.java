package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.XueshuhuiyiDao;
import com.cl.entity.XueshuhuiyiEntity;
import com.cl.service.XueshuhuiyiService;
import com.cl.entity.view.XueshuhuiyiView;

@Service("xueshuhuiyiService")
public class XueshuhuiyiServiceImpl extends ServiceImpl<XueshuhuiyiDao, XueshuhuiyiEntity> implements XueshuhuiyiService {
	
	@Override
	public PageUtils queryPageGroupBy(Map<String, Object> params, Wrapper<XueshuhuiyiEntity> wrapper) {
		Page<XueshuhuiyiView> page =new Query<XueshuhuiyiView>(params).getPage();
        page.setRecords(baseMapper.selectGroupBy(page,wrapper));
    	PageUtils pageUtil = new PageUtils(page);
    	return pageUtil;
	}
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshuhuiyiEntity> page = this.selectPage(
                new Query<XueshuhuiyiEntity>(params).getPage(),
                new EntityWrapper<XueshuhuiyiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshuhuiyiEntity> wrapper) {
		  Page<XueshuhuiyiView> page =new Query<XueshuhuiyiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<XueshuhuiyiView> selectListView(Wrapper<XueshuhuiyiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshuhuiyiView selectView(Wrapper<XueshuhuiyiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
