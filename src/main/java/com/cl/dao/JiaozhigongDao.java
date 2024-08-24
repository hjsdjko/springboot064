package com.cl.dao;

import com.cl.entity.JiaozhigongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JiaozhigongView;


/**
 * 教职工
 * 
 * @author 
 * @email 
 * @date 2024-04-08 15:02:24
 */
public interface JiaozhigongDao extends BaseMapper<JiaozhigongEntity> {
	
	List<JiaozhigongView> selectListView(@Param("ew") Wrapper<JiaozhigongEntity> wrapper);

	List<JiaozhigongView> selectListView(Pagination page,@Param("ew") Wrapper<JiaozhigongEntity> wrapper);
	
	JiaozhigongView selectView(@Param("ew") Wrapper<JiaozhigongEntity> wrapper);
	
	List<JiaozhigongView> selectGroupBy(Pagination page,@Param("ew") Wrapper<JiaozhigongEntity> wrapper);

}
