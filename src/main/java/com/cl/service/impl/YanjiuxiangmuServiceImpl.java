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


import com.cl.dao.YanjiuxiangmuDao;
import com.cl.entity.YanjiuxiangmuEntity;
import com.cl.service.YanjiuxiangmuService;
import com.cl.entity.view.YanjiuxiangmuView;

@Service("yanjiuxiangmuService")
public class YanjiuxiangmuServiceImpl extends ServiceImpl<YanjiuxiangmuDao, YanjiuxiangmuEntity> implements YanjiuxiangmuService {
	
	@Override
	public PageUtils queryPageGroupBy(Map<String, Object> params, Wrapper<YanjiuxiangmuEntity> wrapper) {
		Page<YanjiuxiangmuView> page =new Query<YanjiuxiangmuView>(params).getPage();
        page.setRecords(baseMapper.selectGroupBy(page,wrapper));
    	PageUtils pageUtil = new PageUtils(page);
    	return pageUtil;
	}
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YanjiuxiangmuEntity> page = this.selectPage(
                new Query<YanjiuxiangmuEntity>(params).getPage(),
                new EntityWrapper<YanjiuxiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YanjiuxiangmuEntity> wrapper) {
		  Page<YanjiuxiangmuView> page =new Query<YanjiuxiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<YanjiuxiangmuView> selectListView(Wrapper<YanjiuxiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YanjiuxiangmuView selectView(Wrapper<YanjiuxiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
