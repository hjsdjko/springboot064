package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.CanjiahuiyiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.CanjiahuiyiView;


/**
 * 参加会议
 *
 * @author 
 * @email 
 * @date 2024-04-08 15:02:24
 */
public interface CanjiahuiyiService extends IService<CanjiahuiyiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CanjiahuiyiView> selectListView(Wrapper<CanjiahuiyiEntity> wrapper);
   	
   	CanjiahuiyiView selectView(@Param("ew") Wrapper<CanjiahuiyiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CanjiahuiyiEntity> wrapper);
   	
   	PageUtils queryPageGroupBy(Map<String, Object> params,Wrapper<CanjiahuiyiEntity> wrapper);

}

