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


import com.cl.dao.KechengleixingDao;
import com.cl.entity.KechengleixingEntity;
import com.cl.service.KechengleixingService;
import com.cl.entity.view.KechengleixingView;

@Service("kechengleixingService")
public class KechengleixingServiceImpl extends ServiceImpl<KechengleixingDao, KechengleixingEntity> implements KechengleixingService {
	
	@Override
	public PageUtils queryPageGroupBy(Map<String, Object> params, Wrapper<KechengleixingEntity> wrapper) {
		Page<KechengleixingView> page =new Query<KechengleixingView>(params).getPage();
        page.setRecords(baseMapper.selectGroupBy(page,wrapper));
    	PageUtils pageUtil = new PageUtils(page);
    	return pageUtil;
	}
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KechengleixingEntity> page = this.selectPage(
                new Query<KechengleixingEntity>(params).getPage(),
                new EntityWrapper<KechengleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KechengleixingEntity> wrapper) {
		  Page<KechengleixingView> page =new Query<KechengleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<KechengleixingView> selectListView(Wrapper<KechengleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KechengleixingView selectView(Wrapper<KechengleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
