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


import com.cl.dao.XuankexinxiDao;
import com.cl.entity.XuankexinxiEntity;
import com.cl.service.XuankexinxiService;
import com.cl.entity.view.XuankexinxiView;

@Service("xuankexinxiService")
public class XuankexinxiServiceImpl extends ServiceImpl<XuankexinxiDao, XuankexinxiEntity> implements XuankexinxiService {
	
	@Override
	public PageUtils queryPageGroupBy(Map<String, Object> params, Wrapper<XuankexinxiEntity> wrapper) {
		Page<XuankexinxiView> page =new Query<XuankexinxiView>(params).getPage();
        page.setRecords(baseMapper.selectGroupBy(page,wrapper));
    	PageUtils pageUtil = new PageUtils(page);
    	return pageUtil;
	}
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuankexinxiEntity> page = this.selectPage(
                new Query<XuankexinxiEntity>(params).getPage(),
                new EntityWrapper<XuankexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuankexinxiEntity> wrapper) {
		  Page<XuankexinxiView> page =new Query<XuankexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<XuankexinxiView> selectListView(Wrapper<XuankexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuankexinxiView selectView(Wrapper<XuankexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<XuankexinxiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<XuankexinxiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<XuankexinxiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
