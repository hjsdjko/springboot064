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


import com.cl.dao.JiaozhigongDao;
import com.cl.entity.JiaozhigongEntity;
import com.cl.service.JiaozhigongService;
import com.cl.entity.view.JiaozhigongView;

@Service("jiaozhigongService")
public class JiaozhigongServiceImpl extends ServiceImpl<JiaozhigongDao, JiaozhigongEntity> implements JiaozhigongService {
	
	@Override
	public PageUtils queryPageGroupBy(Map<String, Object> params, Wrapper<JiaozhigongEntity> wrapper) {
		Page<JiaozhigongView> page =new Query<JiaozhigongView>(params).getPage();
        page.setRecords(baseMapper.selectGroupBy(page,wrapper));
    	PageUtils pageUtil = new PageUtils(page);
    	return pageUtil;
	}
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaozhigongEntity> page = this.selectPage(
                new Query<JiaozhigongEntity>(params).getPage(),
                new EntityWrapper<JiaozhigongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaozhigongEntity> wrapper) {
		  Page<JiaozhigongView> page =new Query<JiaozhigongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<JiaozhigongView> selectListView(Wrapper<JiaozhigongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaozhigongView selectView(Wrapper<JiaozhigongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
