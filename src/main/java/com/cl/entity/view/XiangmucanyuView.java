package com.cl.entity.view;

import com.cl.entity.XiangmucanyuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 项目参与
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-08 15:02:25
 */
@TableName("xiangmucanyu")
public class XiangmucanyuView  extends XiangmucanyuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiangmucanyuView(){
	}
 
 	public XiangmucanyuView(XiangmucanyuEntity xiangmucanyuEntity){
 	try {
			BeanUtils.copyProperties(this, xiangmucanyuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
