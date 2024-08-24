package com.cl.dao;

import com.cl.entity.XiangmucanyuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XiangmucanyuView;


/**
 * 项目参与
 * 
 * @author 
 * @email 
 * @date 2024-04-08 15:02:25
 */
public interface XiangmucanyuDao extends BaseMapper<XiangmucanyuEntity> {
	
	List<XiangmucanyuView> selectListView(@Param("ew") Wrapper<XiangmucanyuEntity> wrapper);

	List<XiangmucanyuView> selectListView(Pagination page,@Param("ew") Wrapper<XiangmucanyuEntity> wrapper);
	
	XiangmucanyuView selectView(@Param("ew") Wrapper<XiangmucanyuEntity> wrapper);
	
	List<XiangmucanyuView> selectGroupBy(Pagination page,@Param("ew") Wrapper<XiangmucanyuEntity> wrapper);

}
