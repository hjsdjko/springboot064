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


import com.cl.dao.XiangmucanyuDao;
import com.cl.entity.XiangmucanyuEntity;
import com.cl.service.XiangmucanyuService;
import com.cl.entity.view.XiangmucanyuView;

@Service("xiangmucanyuService")
public class XiangmucanyuServiceImpl extends ServiceImpl<XiangmucanyuDao, XiangmucanyuEntity> implements XiangmucanyuService {
	
	@Override
	public PageUtils queryPageGroupBy(Map<String, Object> params, Wrapper<XiangmucanyuEntity> wrapper) {
		Page<XiangmucanyuView> page =new Query<XiangmucanyuView>(params).getPage();
        page.setRecords(baseMapper.selectGroupBy(page,wrapper));
    	PageUtils pageUtil = new PageUtils(page);
    	return pageUtil;
	}
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiangmucanyuEntity> page = this.selectPage(
                new Query<XiangmucanyuEntity>(params).getPage(),
                new EntityWrapper<XiangmucanyuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiangmucanyuEntity> wrapper) {
		  Page<XiangmucanyuView> page =new Query<XiangmucanyuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<XiangmucanyuView> selectListView(Wrapper<XiangmucanyuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiangmucanyuView selectView(Wrapper<XiangmucanyuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
