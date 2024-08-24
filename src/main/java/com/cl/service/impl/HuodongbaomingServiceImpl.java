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


import com.cl.dao.HuodongbaomingDao;
import com.cl.entity.HuodongbaomingEntity;
import com.cl.service.HuodongbaomingService;
import com.cl.entity.view.HuodongbaomingView;

@Service("huodongbaomingService")
public class HuodongbaomingServiceImpl extends ServiceImpl<HuodongbaomingDao, HuodongbaomingEntity> implements HuodongbaomingService {
	
	@Override
	public PageUtils queryPageGroupBy(Map<String, Object> params, Wrapper<HuodongbaomingEntity> wrapper) {
		Page<HuodongbaomingView> page =new Query<HuodongbaomingView>(params).getPage();
        page.setRecords(baseMapper.selectGroupBy(page,wrapper));
    	PageUtils pageUtil = new PageUtils(page);
    	return pageUtil;
	}
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuodongbaomingEntity> page = this.selectPage(
                new Query<HuodongbaomingEntity>(params).getPage(),
                new EntityWrapper<HuodongbaomingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuodongbaomingEntity> wrapper) {
		  Page<HuodongbaomingView> page =new Query<HuodongbaomingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<HuodongbaomingView> selectListView(Wrapper<HuodongbaomingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuodongbaomingView selectView(Wrapper<HuodongbaomingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<HuodongbaomingEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<HuodongbaomingEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<HuodongbaomingEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
