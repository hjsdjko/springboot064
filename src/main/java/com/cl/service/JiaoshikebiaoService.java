package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.JiaoshikebiaoEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JiaoshikebiaoView;


/**
 * 教师课表
 *
 * @author 
 * @email 
 * @date 2024-04-08 15:02:24
 */
public interface JiaoshikebiaoService extends IService<JiaoshikebiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoshikebiaoView> selectListView(Wrapper<JiaoshikebiaoEntity> wrapper);
   	
   	JiaoshikebiaoView selectView(@Param("ew") Wrapper<JiaoshikebiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoshikebiaoEntity> wrapper);
   	
   	PageUtils queryPageGroupBy(Map<String, Object> params,Wrapper<JiaoshikebiaoEntity> wrapper);

}

