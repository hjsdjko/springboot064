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


import com.cl.dao.XuankezhongxinDao;
import com.cl.entity.XuankezhongxinEntity;
import com.cl.service.XuankezhongxinService;
import com.cl.entity.view.XuankezhongxinView;

@Service("xuankezhongxinService")
public class XuankezhongxinServiceImpl extends ServiceImpl<XuankezhongxinDao, XuankezhongxinEntity> implements XuankezhongxinService {
	
	@Override
	public PageUtils queryPageGroupBy(Map<String, Object> params, Wrapper<XuankezhongxinEntity> wrapper) {
		Page<XuankezhongxinView> page =new Query<XuankezhongxinView>(params).getPage();
        page.setRecords(baseMapper.selectGroupBy(page,wrapper));
    	PageUtils pageUtil = new PageUtils(page);
    	return pageUtil;
	}
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuankezhongxinEntity> page = this.selectPage(
                new Query<XuankezhongxinEntity>(params).getPage(),
                new EntityWrapper<XuankezhongxinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuankezhongxinEntity> wrapper) {
		  Page<XuankezhongxinView> page =new Query<XuankezhongxinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<XuankezhongxinView> selectListView(Wrapper<XuankezhongxinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuankezhongxinView selectView(Wrapper<XuankezhongxinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
