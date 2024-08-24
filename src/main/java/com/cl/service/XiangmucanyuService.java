package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.XiangmucanyuEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XiangmucanyuView;


/**
 * 项目参与
 *
 * @author 
 * @email 
 * @date 2024-04-08 15:02:25
 */
public interface XiangmucanyuService extends IService<XiangmucanyuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiangmucanyuView> selectListView(Wrapper<XiangmucanyuEntity> wrapper);
   	
   	XiangmucanyuView selectView(@Param("ew") Wrapper<XiangmucanyuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiangmucanyuEntity> wrapper);
   	
   	PageUtils queryPageGroupBy(Map<String, Object> params,Wrapper<XiangmucanyuEntity> wrapper);

}

