package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.XueshuhuiyiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XueshuhuiyiView;


/**
 * 学术会议
 *
 * @author 
 * @email 
 * @date 2024-04-08 15:02:24
 */
public interface XueshuhuiyiService extends IService<XueshuhuiyiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshuhuiyiView> selectListView(Wrapper<XueshuhuiyiEntity> wrapper);
   	
   	XueshuhuiyiView selectView(@Param("ew") Wrapper<XueshuhuiyiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshuhuiyiEntity> wrapper);
   	
   	PageUtils queryPageGroupBy(Map<String, Object> params,Wrapper<XueshuhuiyiEntity> wrapper);

}

