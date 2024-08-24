package com.cl.entity.view;

import com.cl.entity.KechengleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 课程类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-08 15:02:24
 */
@TableName("kechengleixing")
public class KechengleixingView  extends KechengleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KechengleixingView(){
	}
 
 	public KechengleixingView(KechengleixingEntity kechengleixingEntity){
 	try {
			BeanUtils.copyProperties(this, kechengleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
