package com.cl.dao;

import com.cl.entity.HuodongbaomingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.HuodongbaomingView;


/**
 * 活动报名
 * 
 * @author 
 * @email 
 * @date 2024-04-08 15:02:24
 */
public interface HuodongbaomingDao extends BaseMapper<HuodongbaomingEntity> {
	
	List<HuodongbaomingView> selectListView(@Param("ew") Wrapper<HuodongbaomingEntity> wrapper);

	List<HuodongbaomingView> selectListView(Pagination page,@Param("ew") Wrapper<HuodongbaomingEntity> wrapper);
	
	HuodongbaomingView selectView(@Param("ew") Wrapper<HuodongbaomingEntity> wrapper);
	
	List<HuodongbaomingView> selectGroupBy(Pagination page,@Param("ew") Wrapper<HuodongbaomingEntity> wrapper);

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HuodongbaomingEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HuodongbaomingEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HuodongbaomingEntity> wrapper);



}
