package com.cl.dao;

import com.cl.entity.XueshuhuiyiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XueshuhuiyiView;


/**
 * 学术会议
 * 
 * @author 
 * @email 
 * @date 2024-04-08 15:02:24
 */
public interface XueshuhuiyiDao extends BaseMapper<XueshuhuiyiEntity> {
	
	List<XueshuhuiyiView> selectListView(@Param("ew") Wrapper<XueshuhuiyiEntity> wrapper);

	List<XueshuhuiyiView> selectListView(Pagination page,@Param("ew") Wrapper<XueshuhuiyiEntity> wrapper);
	
	XueshuhuiyiView selectView(@Param("ew") Wrapper<XueshuhuiyiEntity> wrapper);
	
	List<XueshuhuiyiView> selectGroupBy(Pagination page,@Param("ew") Wrapper<XueshuhuiyiEntity> wrapper);

}
