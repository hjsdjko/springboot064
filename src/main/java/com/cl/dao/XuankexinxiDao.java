package com.cl.dao;

import com.cl.entity.XuankexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XuankexinxiView;


/**
 * 选课信息
 * 
 * @author 
 * @email 
 * @date 2024-04-08 15:02:24
 */
public interface XuankexinxiDao extends BaseMapper<XuankexinxiEntity> {
	
	List<XuankexinxiView> selectListView(@Param("ew") Wrapper<XuankexinxiEntity> wrapper);

	List<XuankexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XuankexinxiEntity> wrapper);
	
	XuankexinxiView selectView(@Param("ew") Wrapper<XuankexinxiEntity> wrapper);
	
	List<XuankexinxiView> selectGroupBy(Pagination page,@Param("ew") Wrapper<XuankexinxiEntity> wrapper);

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XuankexinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XuankexinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XuankexinxiEntity> wrapper);



}
