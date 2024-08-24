package com.cl.dao;

import com.cl.entity.KechengleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.KechengleixingView;


/**
 * 课程类型
 * 
 * @author 
 * @email 
 * @date 2024-04-08 15:02:24
 */
public interface KechengleixingDao extends BaseMapper<KechengleixingEntity> {
	
	List<KechengleixingView> selectListView(@Param("ew") Wrapper<KechengleixingEntity> wrapper);

	List<KechengleixingView> selectListView(Pagination page,@Param("ew") Wrapper<KechengleixingEntity> wrapper);
	
	KechengleixingView selectView(@Param("ew") Wrapper<KechengleixingEntity> wrapper);
	
	List<KechengleixingView> selectGroupBy(Pagination page,@Param("ew") Wrapper<KechengleixingEntity> wrapper);

}
