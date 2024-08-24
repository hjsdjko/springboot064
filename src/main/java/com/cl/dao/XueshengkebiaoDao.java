package com.cl.dao;

import com.cl.entity.XueshengkebiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XueshengkebiaoView;


/**
 * 学生课表
 * 
 * @author 
 * @email 
 * @date 2024-04-08 15:02:24
 */
public interface XueshengkebiaoDao extends BaseMapper<XueshengkebiaoEntity> {
	
	List<XueshengkebiaoView> selectListView(@Param("ew") Wrapper<XueshengkebiaoEntity> wrapper);

	List<XueshengkebiaoView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengkebiaoEntity> wrapper);
	
	XueshengkebiaoView selectView(@Param("ew") Wrapper<XueshengkebiaoEntity> wrapper);
	
	List<XueshengkebiaoView> selectGroupBy(Pagination page,@Param("ew") Wrapper<XueshengkebiaoEntity> wrapper);

}
