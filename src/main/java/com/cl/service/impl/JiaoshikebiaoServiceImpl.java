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


import com.cl.dao.JiaoshikebiaoDao;
import com.cl.entity.JiaoshikebiaoEntity;
import com.cl.service.JiaoshikebiaoService;
import com.cl.entity.view.JiaoshikebiaoView;

@Service("jiaoshikebiaoService")
public class JiaoshikebiaoServiceImpl extends ServiceImpl<JiaoshikebiaoDao, JiaoshikebiaoEntity> implements JiaoshikebiaoService {
	
	@Override
	public PageUtils queryPageGroupBy(Map<String, Object> params, Wrapper<JiaoshikebiaoEntity> wrapper) {
		Page<JiaoshikebiaoView> page =new Query<JiaoshikebiaoView>(params).getPage();
        page.setRecords(baseMapper.selectGroupBy(page,wrapper));
    	PageUtils pageUtil = new PageUtils(page);
    	return pageUtil;
	}
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoshikebiaoEntity> page = this.selectPage(
                new Query<JiaoshikebiaoEntity>(params).getPage(),
                new EntityWrapper<JiaoshikebiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoshikebiaoEntity> wrapper) {
		  Page<JiaoshikebiaoView> page =new Query<JiaoshikebiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<JiaoshikebiaoView> selectListView(Wrapper<JiaoshikebiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoshikebiaoView selectView(Wrapper<JiaoshikebiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
