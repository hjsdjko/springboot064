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

import com.cl.entity.XuankezhongxinEntity;
import com.cl.entity.view.XuankezhongxinView;

import com.cl.service.XuankezhongxinService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 选课中心
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-08 15:02:24
 */
@RestController
@RequestMapping("/xuankezhongxin")
public class XuankezhongxinController {
    @Autowired
    private XuankezhongxinService xuankezhongxinService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XuankezhongxinEntity xuankezhongxin,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaozhigong")) {
			xuankezhongxin.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XuankezhongxinEntity> ew = new EntityWrapper<XuankezhongxinEntity>();

		PageUtils page = xuankezhongxinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuankezhongxin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XuankezhongxinEntity xuankezhongxin, 
		HttpServletRequest request){
        EntityWrapper<XuankezhongxinEntity> ew = new EntityWrapper<XuankezhongxinEntity>();

		PageUtils page = xuankezhongxinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuankezhongxin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XuankezhongxinEntity xuankezhongxin){
       	EntityWrapper<XuankezhongxinEntity> ew = new EntityWrapper<XuankezhongxinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xuankezhongxin, "xuankezhongxin")); 
        return R.ok().put("data", xuankezhongxinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XuankezhongxinEntity xuankezhongxin){
        EntityWrapper< XuankezhongxinEntity> ew = new EntityWrapper< XuankezhongxinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xuankezhongxin, "xuankezhongxin")); 
		XuankezhongxinView xuankezhongxinView =  xuankezhongxinService.selectView(ew);
		return R.ok("查询选课中心成功").put("data", xuankezhongxinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XuankezhongxinEntity xuankezhongxin = xuankezhongxinService.selectById(id);
		xuankezhongxin = xuankezhongxinService.selectView(new EntityWrapper<XuankezhongxinEntity>().eq("id", id));
        return R.ok().put("data", xuankezhongxin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XuankezhongxinEntity xuankezhongxin = xuankezhongxinService.selectById(id);
		xuankezhongxin = xuankezhongxinService.selectView(new EntityWrapper<XuankezhongxinEntity>().eq("id", id));
        return R.ok().put("data", xuankezhongxin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XuankezhongxinEntity xuankezhongxin, HttpServletRequest request){
    	xuankezhongxin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xuankezhongxin);
        xuankezhongxinService.insert(xuankezhongxin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XuankezhongxinEntity xuankezhongxin, HttpServletRequest request){
    	xuankezhongxin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xuankezhongxin);
        xuankezhongxinService.insert(xuankezhongxin);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XuankezhongxinEntity xuankezhongxin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xuankezhongxin);
        xuankezhongxinService.updateById(xuankezhongxin);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xuankezhongxinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	






    /**
     * 总数量
     */
    @RequestMapping("/count")
    public R count(@RequestParam Map<String, Object> params,XuankezhongxinEntity xuankezhongxin, HttpServletRequest request){
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("jiaozhigong")) {
            xuankezhongxin.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
        }
        EntityWrapper<XuankezhongxinEntity> ew = new EntityWrapper<XuankezhongxinEntity>();
        int count = xuankezhongxinService.selectCount(MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuankezhongxin), params), params));
        return R.ok().put("data", count);
    }


}
