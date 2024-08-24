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


import com.cl.dao.TousujianyiDao;
import com.cl.entity.TousujianyiEntity;
import com.cl.service.TousujianyiService;
import com.cl.entity.view.TousujianyiView;

@Service("tousujianyiService")
public class TousujianyiServiceImpl extends ServiceImpl<TousujianyiDao, TousujianyiEntity> implements TousujianyiService {
	
	@Override
	public PageUtils queryPageGroupBy(Map<String, Object> params, Wrapper<TousujianyiEntity> wrapper) {
		Page<TousujianyiView> page =new Query<TousujianyiView>(params).getPage();
        page.setRecords(baseMapper.selectGroupBy(page,wrapper));
    	PageUtils pageUtil = new PageUtils(page);
    	return pageUtil;
	}
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TousujianyiEntity> page = this.selectPage(
                new Query<TousujianyiEntity>(params).getPage(),
                new EntityWrapper<TousujianyiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TousujianyiEntity> wrapper) {
		  Page<TousujianyiView> page =new Query<TousujianyiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<TousujianyiView> selectListView(Wrapper<TousujianyiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TousujianyiView selectView(Wrapper<TousujianyiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
