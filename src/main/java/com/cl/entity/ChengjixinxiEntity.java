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
 * 成绩信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-08 15:02:24
 */
@TableName("chengjixinxi")
public class ChengjixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChengjixinxiEntity() {
		
	}
	
	public ChengjixinxiEntity(T t) {
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
	 * 课程名称
	 */
					
	private String kechengmingcheng;
	
	/**
	 * 成绩
	 */
					
	private Integer chengji;
	
	/**
	 * 学分
	 */
					
	private Integer xuefen;
	
	/**
	 * 总学时
	 */
					
	private Integer zongxueshi;
	
	/**
	 * 绩点
	 */
					
	private Double jidian;
	
	
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
	 * 设置：课程名称
	 */
	public void setKechengmingcheng(String kechengmingcheng) {
		this.kechengmingcheng = kechengmingcheng;
	}
	/**
	 * 获取：课程名称
	 */
	public String getKechengmingcheng() {
		return kechengmingcheng;
	}
	/**
	 * 设置：成绩
	 */
	public void setChengji(Integer chengji) {
		this.chengji = chengji;
	}
	/**
	 * 获取：成绩
	 */
	public Integer getChengji() {
		return chengji;
	}
	/**
	 * 设置：学分
	 */
	public void setXuefen(Integer xuefen) {
		this.xuefen = xuefen;
	}
	/**
	 * 获取：学分
	 */
	public Integer getXuefen() {
		return xuefen;
	}
	/**
	 * 设置：总学时
	 */
	public void setZongxueshi(Integer zongxueshi) {
		this.zongxueshi = zongxueshi;
	}
	/**
	 * 获取：总学时
	 */
	public Integer getZongxueshi() {
		return zongxueshi;
	}
	/**
	 * 设置：绩点
	 */
	public void setJidian(Double jidian) {
		this.jidian = jidian;
	}
	/**
	 * 获取：绩点
	 */
	public Double getJidian() {
		return jidian;
	}

}
