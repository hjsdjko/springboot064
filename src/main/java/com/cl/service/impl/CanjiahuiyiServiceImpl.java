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


import com.cl.dao.CanjiahuiyiDao;
import com.cl.entity.CanjiahuiyiEntity;
import com.cl.service.CanjiahuiyiService;
import com.cl.entity.view.CanjiahuiyiView;

@Service("canjiahuiyiService")
public class CanjiahuiyiServiceImpl extends ServiceImpl<CanjiahuiyiDao, CanjiahuiyiEntity> implements CanjiahuiyiService {
	
	@Override
	public PageUtils queryPageGroupBy(Map<String, Object> params, Wrapper<CanjiahuiyiEntity> wrapper) {
		Page<CanjiahuiyiView> page =new Query<CanjiahuiyiView>(params).getPage();
        page.setRecords(baseMapper.selectGroupBy(page,wrapper));
    	PageUtils pageUtil = new PageUtils(page);
    	return pageUtil;
	}
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CanjiahuiyiEntity> page = this.selectPage(
                new Query<CanjiahuiyiEntity>(params).getPage(),
                new EntityWrapper<CanjiahuiyiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CanjiahuiyiEntity> wrapper) {
		  Page<CanjiahuiyiView> page =new Query<CanjiahuiyiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<CanjiahuiyiView> selectListView(Wrapper<CanjiahuiyiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CanjiahuiyiView selectView(Wrapper<CanjiahuiyiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
