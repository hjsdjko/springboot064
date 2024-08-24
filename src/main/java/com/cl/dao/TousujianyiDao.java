package com.cl.dao;

import com.cl.entity.TousujianyiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.TousujianyiView;


/**
 * 投诉建议
 * 
 * @author 
 * @email 
 * @date 2024-04-08 15:02:25
 */
public interface TousujianyiDao extends BaseMapper<TousujianyiEntity> {
	
	List<TousujianyiView> selectListView(@Param("ew") Wrapper<TousujianyiEntity> wrapper);

	List<TousujianyiView> selectListView(Pagination page,@Param("ew") Wrapper<TousujianyiEntity> wrapper);
	
	TousujianyiView selectView(@Param("ew") Wrapper<TousujianyiEntity> wrapper);
	
	List<TousujianyiView> selectGroupBy(Pagination page,@Param("ew") Wrapper<TousujianyiEntity> wrapper);

}
