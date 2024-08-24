package com.cl.entity.view;

import com.cl.entity.XuankezhongxinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 选课中心
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-08 15:02:24
 */
@TableName("xuankezhongxin")
public class XuankezhongxinView  extends XuankezhongxinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XuankezhongxinView(){
	}
 
 	public XuankezhongxinView(XuankezhongxinEntity xuankezhongxinEntity){
 	try {
			BeanUtils.copyProperties(this, xuankezhongxinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
