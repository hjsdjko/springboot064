package com.cl.dao;

import com.cl.entity.YanjiuxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YanjiuxiangmuView;


/**
 * 研究项目
 * 
 * @author 
 * @email 
 * @date 2024-04-08 15:02:24
 */
public interface YanjiuxiangmuDao extends BaseMapper<YanjiuxiangmuEntity> {
	
	List<YanjiuxiangmuView> selectListView(@Param("ew") Wrapper<YanjiuxiangmuEntity> wrapper);

	List<YanjiuxiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<YanjiuxiangmuEntity> wrapper);
	
	YanjiuxiangmuView selectView(@Param("ew") Wrapper<YanjiuxiangmuEntity> wrapper);
	
	List<YanjiuxiangmuView> selectGroupBy(Pagination page,@Param("ew") Wrapper<YanjiuxiangmuEntity> wrapper);

}
