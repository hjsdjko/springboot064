package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.XuankezhongxinEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XuankezhongxinView;


/**
 * 选课中心
 *
 * @author 
 * @email 
 * @date 2024-04-08 15:02:24
 */
public interface XuankezhongxinService extends IService<XuankezhongxinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuankezhongxinView> selectListView(Wrapper<XuankezhongxinEntity> wrapper);
   	
   	XuankezhongxinView selectView(@Param("ew") Wrapper<XuankezhongxinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuankezhongxinEntity> wrapper);
   	
   	PageUtils queryPageGroupBy(Map<String, Object> params,Wrapper<XuankezhongxinEntity> wrapper);

}

