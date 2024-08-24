package com.cl.dao;

import com.cl.entity.JiaoshikebiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JiaoshikebiaoView;


/**
 * 教师课表
 * 
 * @author 
 * @email 
 * @date 2024-04-08 15:02:24
 */
public interface JiaoshikebiaoDao extends BaseMapper<JiaoshikebiaoEntity> {
	
	List<JiaoshikebiaoView> selectListView(@Param("ew") Wrapper<JiaoshikebiaoEntity> wrapper);

	List<JiaoshikebiaoView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoshikebiaoEntity> wrapper);
	
	JiaoshikebiaoView selectView(@Param("ew") Wrapper<JiaoshikebiaoEntity> wrapper);
	
	List<JiaoshikebiaoView> selectGroupBy(Pagination page,@Param("ew") Wrapper<JiaoshikebiaoEntity> wrapper);

}
