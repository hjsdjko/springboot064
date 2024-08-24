package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 费用信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-08 15:02:24
 */
@TableName("feiyongxinxi")
public class FeiyongxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FeiyongxinxiEntity() {
		
	}
	
	public FeiyongxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 费用名称
	 */
					
	private String feiyongmingcheng;
	
	/**
	 * 费用类型
	 */
					
	private String feiyongleixing;
	
	/**
	 * 费用
	 */
					
	private Double feiyong;
	
	/**
	 * 费用详情
	 */
					
	private String feiyongxiangqing;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 学生姓名
	 */
					
	private String xueshengxingming;
	
	/**
	 * 班级
	 */
					
	private String banji;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：费用名称
	 */
	public void setFeiyongmingcheng(String feiyongmingcheng) {
		this.feiyongmingcheng = feiyongmingcheng;
	}
	/**
	 * 获取：费用名称
	 */
	public String getFeiyongmingcheng() {
		return feiyongmingcheng;
	}
	/**
	 * 设置：费用类型
	 */
	public void setFeiyongleixing(String feiyongleixing) {
		this.feiyongleixing = feiyongleixing;
	}
	/**
	 * 获取：费用类型
	 */
	public String getFeiyongleixing() {
		return feiyongleixing;
	}
	/**
	 * 设置：费用
	 */
	public void setFeiyong(Double feiyong) {
		this.feiyong = feiyong;
	}
	/**
	 * 获取：费用
	 */
	public Double getFeiyong() {
		return feiyong;
	}
	/**
	 * 设置：费用详情
	 */
	public void setFeiyongxiangqing(String feiyongxiangqing) {
		this.feiyongxiangqing = feiyongxiangqing;
	}
	/**
	 * 获取：费用详情
	 */
	public String getFeiyongxiangqing() {
		return feiyongxiangqing;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：学生姓名
	 */
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
	/**
	 * 设置：班级
	 */
	public void setBanji(String banji) {
		this.banji = banji;
	}
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
