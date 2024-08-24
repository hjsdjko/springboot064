package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.YanjiuxiangmuEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YanjiuxiangmuView;


/**
 * 研究项目
 *
 * @author 
 * @email 
 * @date 2024-04-08 15:02:24
 */
public interface YanjiuxiangmuService extends IService<YanjiuxiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YanjiuxiangmuView> selectListView(Wrapper<YanjiuxiangmuEntity> wrapper);
   	
   	YanjiuxiangmuView selectView(@Param("ew") Wrapper<YanjiuxiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YanjiuxiangmuEntity> wrapper);
   	
   	PageUtils queryPageGroupBy(Map<String, Object> params,Wrapper<YanjiuxiangmuEntity> wrapper);

}

