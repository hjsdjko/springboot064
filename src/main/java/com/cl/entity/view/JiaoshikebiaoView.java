package com.cl.entity.view;

import com.cl.entity.JiaoshikebiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 教师课表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-08 15:02:24
 */
@TableName("jiaoshikebiao")
public class JiaoshikebiaoView  extends JiaoshikebiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoshikebiaoView(){
	}
 
 	public JiaoshikebiaoView(JiaoshikebiaoEntity jiaoshikebiaoEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoshikebiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
