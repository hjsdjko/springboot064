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
 * 学生课表
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-08 15:02:24
 */
@TableName("xueshengkebiao")
public class XueshengkebiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XueshengkebiaoEntity() {
		
	}
	
	public XueshengkebiaoEntity(T t) {
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
	 * 课程名称
	 */
					
	private String kechengmingcheng;
	
	/**
	 * 上课地点
	 */
					
	private String shangkedidian;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
	/**
	 * 周次
	 */
					
	private String zhouci;
	
	/**
	 * 星期
	 */
					
	private String xingqi;
	
	/**
	 * 节数
	 */
					
	private String jieshu;
	
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
	 * 设置：上课地点
	 */
	public void setShangkedidian(String shangkedidian) {
		this.shangkedidian = shangkedidian;
	}
	/**
	 * 获取：上课地点
	 */
	public String getShangkedidian() {
		return shangkedidian;
	}
	/**
	 * 设置：教师姓名
	 */
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
	/**
	 * 设置：周次
	 */
	public void setZhouci(String zhouci) {
		this.zhouci = zhouci;
	}
	/**
	 * 获取：周次
	 */
	public String getZhouci() {
		return zhouci;
	}
	/**
	 * 设置：星期
	 */
	public void setXingqi(String xingqi) {
		this.xingqi = xingqi;
	}
	/**
	 * 获取：星期
	 */
	public String getXingqi() {
		return xingqi;
	}
	/**
	 * 设置：节数
	 */
	public void setJieshu(String jieshu) {
		this.jieshu = jieshu;
	}
	/**
	 * 获取：节数
	 */
	public String getJieshu() {
		return jieshu;
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

}
