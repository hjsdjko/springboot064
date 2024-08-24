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

import com.cl.entity.YanjiuxiangmuEntity;
import com.cl.entity.view.YanjiuxiangmuView;

import com.cl.service.YanjiuxiangmuService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 研究项目
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-08 15:02:24
 */
@RestController
@RequestMapping("/yanjiuxiangmu")
public class YanjiuxiangmuController {
    @Autowired
    private YanjiuxiangmuService yanjiuxiangmuService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YanjiuxiangmuEntity yanjiuxiangmu,
		HttpServletRequest request){
        EntityWrapper<YanjiuxiangmuEntity> ew = new EntityWrapper<YanjiuxiangmuEntity>();

		PageUtils page = yanjiuxiangmuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yanjiuxiangmu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YanjiuxiangmuEntity yanjiuxiangmu, 
		HttpServletRequest request){
        EntityWrapper<YanjiuxiangmuEntity> ew = new EntityWrapper<YanjiuxiangmuEntity>();

		PageUtils page = yanjiuxiangmuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yanjiuxiangmu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YanjiuxiangmuEntity yanjiuxiangmu){
       	EntityWrapper<YanjiuxiangmuEntity> ew = new EntityWrapper<YanjiuxiangmuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yanjiuxiangmu, "yanjiuxiangmu")); 
        return R.ok().put("data", yanjiuxiangmuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YanjiuxiangmuEntity yanjiuxiangmu){
        EntityWrapper< YanjiuxiangmuEntity> ew = new EntityWrapper< YanjiuxiangmuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yanjiuxiangmu, "yanjiuxiangmu")); 
		YanjiuxiangmuView yanjiuxiangmuView =  yanjiuxiangmuService.selectView(ew);
		return R.ok("查询研究项目成功").put("data", yanjiuxiangmuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YanjiuxiangmuEntity yanjiuxiangmu = yanjiuxiangmuService.selectById(id);
		yanjiuxiangmu = yanjiuxiangmuService.selectView(new EntityWrapper<YanjiuxiangmuEntity>().eq("id", id));
        return R.ok().put("data", yanjiuxiangmu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YanjiuxiangmuEntity yanjiuxiangmu = yanjiuxiangmuService.selectById(id);
		yanjiuxiangmu = yanjiuxiangmuService.selectView(new EntityWrapper<YanjiuxiangmuEntity>().eq("id", id));
        return R.ok().put("data", yanjiuxiangmu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YanjiuxiangmuEntity yanjiuxiangmu, HttpServletRequest request){
    	yanjiuxiangmu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yanjiuxiangmu);
        yanjiuxiangmuService.insert(yanjiuxiangmu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YanjiuxiangmuEntity yanjiuxiangmu, HttpServletRequest request){
    	yanjiuxiangmu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yanjiuxiangmu);
        yanjiuxiangmuService.insert(yanjiuxiangmu);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YanjiuxiangmuEntity yanjiuxiangmu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yanjiuxiangmu);
        yanjiuxiangmuService.updateById(yanjiuxiangmu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yanjiuxiangmuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
