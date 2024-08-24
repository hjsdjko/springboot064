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


import com.cl.dao.XueshengkebiaoDao;
import com.cl.entity.XueshengkebiaoEntity;
import com.cl.service.XueshengkebiaoService;
import com.cl.entity.view.XueshengkebiaoView;

@Service("xueshengkebiaoService")
public class XueshengkebiaoServiceImpl extends ServiceImpl<XueshengkebiaoDao, XueshengkebiaoEntity> implements XueshengkebiaoService {
	
	@Override
	public PageUtils queryPageGroupBy(Map<String, Object> params, Wrapper<XueshengkebiaoEntity> wrapper) {
		Page<XueshengkebiaoView> page =new Query<XueshengkebiaoView>(params).getPage();
        page.setRecords(baseMapper.selectGroupBy(page,wrapper));
    	PageUtils pageUtil = new PageUtils(page);
    	return pageUtil;
	}
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengkebiaoEntity> page = this.selectPage(
                new Query<XueshengkebiaoEntity>(params).getPage(),
                new EntityWrapper<XueshengkebiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengkebiaoEntity> wrapper) {
		  Page<XueshengkebiaoView> page =new Query<XueshengkebiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<XueshengkebiaoView> selectListView(Wrapper<XueshengkebiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengkebiaoView selectView(Wrapper<XueshengkebiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
