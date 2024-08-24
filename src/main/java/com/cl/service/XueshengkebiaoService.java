package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.XueshengkebiaoEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XueshengkebiaoView;


/**
 * 学生课表
 *
 * @author 
 * @email 
 * @date 2024-04-08 15:02:24
 */
public interface XueshengkebiaoService extends IService<XueshengkebiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengkebiaoView> selectListView(Wrapper<XueshengkebiaoEntity> wrapper);
   	
   	XueshengkebiaoView selectView(@Param("ew") Wrapper<XueshengkebiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengkebiaoEntity> wrapper);
   	
   	PageUtils queryPageGroupBy(Map<String, Object> params,Wrapper<XueshengkebiaoEntity> wrapper);

}

