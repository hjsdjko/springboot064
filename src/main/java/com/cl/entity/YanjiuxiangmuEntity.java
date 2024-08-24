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
 * 研究项目
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-08 15:02:24
 */
@TableName("yanjiuxiangmu")
public class YanjiuxiangmuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YanjiuxiangmuEntity() {
		
	}
	
	public YanjiuxiangmuEntity(T t) {
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
	 * 项目名称
	 */
					
	private String xiangmumingcheng;
	
	/**
	 * 项目封面
	 */
					
	private String xiangmufengmian;
	
	/**
	 * 参与条件
	 */
					
	private String canyutiaojian;
	
	/**
	 * 项目详情
	 */
					
	private String xiangmuxiangqing;
	
	/**
	 * 项目时间
	 */
					
	private String xiangmushijian;
	
	/**
	 * 参与人数
	 */
					
	private Integer baomingrenshu;
	
	
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
	 * 设置：项目名称
	 */
	public void setXiangmumingcheng(String xiangmumingcheng) {
		this.xiangmumingcheng = xiangmumingcheng;
	}
	/**
	 * 获取：项目名称
	 */
	public String getXiangmumingcheng() {
		return xiangmumingcheng;
	}
	/**
	 * 设置：项目封面
	 */
	public void setXiangmufengmian(String xiangmufengmian) {
		this.xiangmufengmian = xiangmufengmian;
	}
	/**
	 * 获取：项目封面
	 */
	public String getXiangmufengmian() {
		return xiangmufengmian;
	}
	/**
	 * 设置：参与条件
	 */
	public void setCanyutiaojian(String canyutiaojian) {
		this.canyutiaojian = canyutiaojian;
	}
	/**
	 * 获取：参与条件
	 */
	public String getCanyutiaojian() {
		return canyutiaojian;
	}
	/**
	 * 设置：项目详情
	 */
	public void setXiangmuxiangqing(String xiangmuxiangqing) {
		this.xiangmuxiangqing = xiangmuxiangqing;
	}
	/**
	 * 获取：项目详情
	 */
	public String getXiangmuxiangqing() {
		return xiangmuxiangqing;
	}
	/**
	 * 设置：项目时间
	 */
	public void setXiangmushijian(String xiangmushijian) {
		this.xiangmushijian = xiangmushijian;
	}
	/**
	 * 获取：项目时间
	 */
	public String getXiangmushijian() {
		return xiangmushijian;
	}
	/**
	 * 设置：参与人数
	 */
	public void setBaomingrenshu(Integer baomingrenshu) {
		this.baomingrenshu = baomingrenshu;
	}
	/**
	 * 获取：参与人数
	 */
	public Integer getBaomingrenshu() {
		return baomingrenshu;
	}

}
