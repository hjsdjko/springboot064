package com.cl.dao;

import com.cl.entity.CanjiahuiyiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.CanjiahuiyiView;


/**
 * 参加会议
 * 
 * @author 
 * @email 
 * @date 2024-04-08 15:02:24
 */
public interface CanjiahuiyiDao extends BaseMapper<CanjiahuiyiEntity> {
	
	List<CanjiahuiyiView> selectListView(@Param("ew") Wrapper<CanjiahuiyiEntity> wrapper);

	List<CanjiahuiyiView> selectListView(Pagination page,@Param("ew") Wrapper<CanjiahuiyiEntity> wrapper);
	
	CanjiahuiyiView selectView(@Param("ew") Wrapper<CanjiahuiyiEntity> wrapper);
	
	List<CanjiahuiyiView> selectGroupBy(Pagination page,@Param("ew") Wrapper<CanjiahuiyiEntity> wrapper);

}
