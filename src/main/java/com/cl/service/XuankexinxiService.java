package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.XuankexinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XuankexinxiView;


/**
 * 选课信息
 *
 * @author 
 * @email 
 * @date 2024-04-08 15:02:24
 */
public interface XuankexinxiService extends IService<XuankexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuankexinxiView> selectListView(Wrapper<XuankexinxiEntity> wrapper);
   	
   	XuankexinxiView selectView(@Param("ew") Wrapper<XuankexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuankexinxiEntity> wrapper);
   	
   	PageUtils queryPageGroupBy(Map<String, Object> params,Wrapper<XuankexinxiEntity> wrapper);

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<XuankexinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<XuankexinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<XuankexinxiEntity> wrapper);



}

