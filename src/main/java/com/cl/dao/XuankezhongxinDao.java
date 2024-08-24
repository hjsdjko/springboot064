package com.cl.dao;

import com.cl.entity.XuankezhongxinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XuankezhongxinView;


/**
 * 选课中心
 * 
 * @author 
 * @email 
 * @date 2024-04-08 15:02:24
 */
public interface XuankezhongxinDao extends BaseMapper<XuankezhongxinEntity> {
	
	List<XuankezhongxinView> selectListView(@Param("ew") Wrapper<XuankezhongxinEntity> wrapper);

	List<XuankezhongxinView> selectListView(Pagination page,@Param("ew") Wrapper<XuankezhongxinEntity> wrapper);
	
	XuankezhongxinView selectView(@Param("ew") Wrapper<XuankezhongxinEntity> wrapper);
	
	List<XuankezhongxinView> selectGroupBy(Pagination page,@Param("ew") Wrapper<XuankezhongxinEntity> wrapper);

}
