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

import com.cl.entity.TousujianyiEntity;
import com.cl.entity.view.TousujianyiView;

import com.cl.service.TousujianyiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 投诉建议
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-08 15:02:25
 */
@RestController
@RequestMapping("/tousujianyi")
public class TousujianyiController {
    @Autowired
    private TousujianyiService tousujianyiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TousujianyiEntity tousujianyi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			tousujianyi.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<TousujianyiEntity> ew = new EntityWrapper<TousujianyiEntity>();

		PageUtils page = tousujianyiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tousujianyi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TousujianyiEntity tousujianyi, 
		HttpServletRequest request){
        EntityWrapper<TousujianyiEntity> ew = new EntityWrapper<TousujianyiEntity>();

		PageUtils page = tousujianyiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tousujianyi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TousujianyiEntity tousujianyi){
       	EntityWrapper<TousujianyiEntity> ew = new EntityWrapper<TousujianyiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( tousujianyi, "tousujianyi")); 
        return R.ok().put("data", tousujianyiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TousujianyiEntity tousujianyi){
        EntityWrapper< TousujianyiEntity> ew = new EntityWrapper< TousujianyiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( tousujianyi, "tousujianyi")); 
		TousujianyiView tousujianyiView =  tousujianyiService.selectView(ew);
		return R.ok("查询投诉建议成功").put("data", tousujianyiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TousujianyiEntity tousujianyi = tousujianyiService.selectById(id);
		tousujianyi = tousujianyiService.selectView(new EntityWrapper<TousujianyiEntity>().eq("id", id));
        return R.ok().put("data", tousujianyi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TousujianyiEntity tousujianyi = tousujianyiService.selectById(id);
		tousujianyi = tousujianyiService.selectView(new EntityWrapper<TousujianyiEntity>().eq("id", id));
        return R.ok().put("data", tousujianyi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TousujianyiEntity tousujianyi, HttpServletRequest request){
    	tousujianyi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tousujianyi);
        tousujianyiService.insert(tousujianyi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TousujianyiEntity tousujianyi, HttpServletRequest request){
    	tousujianyi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tousujianyi);
        tousujianyiService.insert(tousujianyi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody TousujianyiEntity tousujianyi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(tousujianyi);
        tousujianyiService.updateById(tousujianyi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        tousujianyiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
