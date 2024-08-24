package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.XueshengkebiaoEntity;
import com.cl.entity.view.XueshengkebiaoView;

import com.cl.service.XueshengkebiaoService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 学生课表
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-08 15:02:24
 */
@RestController
@RequestMapping("/xueshengkebiao")
public class XueshengkebiaoController {
    @Autowired
    private XueshengkebiaoService xueshengkebiaoService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XueshengkebiaoEntity xueshengkebiao,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			xueshengkebiao.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XueshengkebiaoEntity> ew = new EntityWrapper<XueshengkebiaoEntity>();

		PageUtils page = xueshengkebiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshengkebiao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XueshengkebiaoEntity xueshengkebiao, 
		HttpServletRequest request){
        EntityWrapper<XueshengkebiaoEntity> ew = new EntityWrapper<XueshengkebiaoEntity>();

		PageUtils page = xueshengkebiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshengkebiao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XueshengkebiaoEntity xueshengkebiao){
       	EntityWrapper<XueshengkebiaoEntity> ew = new EntityWrapper<XueshengkebiaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xueshengkebiao, "xueshengkebiao")); 
        return R.ok().put("data", xueshengkebiaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XueshengkebiaoEntity xueshengkebiao){
        EntityWrapper< XueshengkebiaoEntity> ew = new EntityWrapper< XueshengkebiaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xueshengkebiao, "xueshengkebiao")); 
		XueshengkebiaoView xueshengkebiaoView =  xueshengkebiaoService.selectView(ew);
		return R.ok("查询学生课表成功").put("data", xueshengkebiaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XueshengkebiaoEntity xueshengkebiao = xueshengkebiaoService.selectById(id);
		xueshengkebiao = xueshengkebiaoService.selectView(new EntityWrapper<XueshengkebiaoEntity>().eq("id", id));
        return R.ok().put("data", xueshengkebiao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XueshengkebiaoEntity xueshengkebiao = xueshengkebiaoService.selectById(id);
		xueshengkebiao = xueshengkebiaoService.selectView(new EntityWrapper<XueshengkebiaoEntity>().eq("id", id));
        return R.ok().put("data", xueshengkebiao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XueshengkebiaoEntity xueshengkebiao, HttpServletRequest request){
    	xueshengkebiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xueshengkebiao);
        xueshengkebiaoService.insert(xueshengkebiao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XueshengkebiaoEntity xueshengkebiao, HttpServletRequest request){
    	xueshengkebiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xueshengkebiao);
        xueshengkebiaoService.insert(xueshengkebiao);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XueshengkebiaoEntity xueshengkebiao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xueshengkebiao);
        xueshengkebiaoService.updateById(xueshengkebiao);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xueshengkebiaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
