package com.cl.entity.view;

import com.cl.entity.XueshengkebiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 学生课表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-08 15:02:24
 */
@TableName("xueshengkebiao")
public class XueshengkebiaoView  extends XueshengkebiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengkebiaoView(){
	}
 
 	public XueshengkebiaoView(XueshengkebiaoEntity xueshengkebiaoEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengkebiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
