package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.KechengleixingEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.KechengleixingView;


/**
 * 课程类型
 *
 * @author 
 * @email 
 * @date 2024-04-08 15:02:24
 */
public interface KechengleixingService extends IService<KechengleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KechengleixingView> selectListView(Wrapper<KechengleixingEntity> wrapper);
   	
   	KechengleixingView selectView(@Param("ew") Wrapper<KechengleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KechengleixingEntity> wrapper);
   	
   	PageUtils queryPageGroupBy(Map<String, Object> params,Wrapper<KechengleixingEntity> wrapper);

}

