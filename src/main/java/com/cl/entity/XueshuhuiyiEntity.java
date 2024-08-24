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
 * 学术会议
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-08 15:02:24
 */
@TableName("xueshuhuiyi")
public class XueshuhuiyiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XueshuhuiyiEntity() {
		
	}
	
	public XueshuhuiyiEntity(T t) {
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
	 * 会议标题
	 */
					
	private String huiyibiaoti;
	
	/**
	 * 会议封面
	 */
					
	private String huiyifengmian;
	
	/**
	 * 会议详情
	 */
					
	private String huiyixiangqing;
	
	/**
	 * 会议时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date huiyishijian;
	
	/**
	 * 会议人数
	 */
					
	private Integer renshu;
	
	
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
	 * 设置：会议标题
	 */
	public void setHuiyibiaoti(String huiyibiaoti) {
		this.huiyibiaoti = huiyibiaoti;
	}
	/**
	 * 获取：会议标题
	 */
	public String getHuiyibiaoti() {
		return huiyibiaoti;
	}
	/**
	 * 设置：会议封面
	 */
	public void setHuiyifengmian(String huiyifengmian) {
		this.huiyifengmian = huiyifengmian;
	}
	/**
	 * 获取：会议封面
	 */
	public String getHuiyifengmian() {
		return huiyifengmian;
	}
	/**
	 * 设置：会议详情
	 */
	public void setHuiyixiangqing(String huiyixiangqing) {
		this.huiyixiangqing = huiyixiangqing;
	}
	/**
	 * 获取：会议详情
	 */
	public String getHuiyixiangqing() {
		return huiyixiangqing;
	}
	/**
	 * 设置：会议时间
	 */
	public void setHuiyishijian(Date huiyishijian) {
		this.huiyishijian = huiyishijian;
	}
	/**
	 * 获取：会议时间
	 */
	public Date getHuiyishijian() {
		return huiyishijian;
	}
	/**
	 * 设置：会议人数
	 */
	public void setRenshu(Integer renshu) {
		this.renshu = renshu;
	}
	/**
	 * 获取：会议人数
	 */
	public Integer getRenshu() {
		return renshu;
	}

}
