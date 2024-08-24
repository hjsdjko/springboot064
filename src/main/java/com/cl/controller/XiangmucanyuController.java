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

import com.cl.entity.XiangmucanyuEntity;
import com.cl.entity.view.XiangmucanyuView;

import com.cl.service.XiangmucanyuService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 项目参与
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-08 15:02:25
 */
@RestController
@RequestMapping("/xiangmucanyu")
public class XiangmucanyuController {
    @Autowired
    private XiangmucanyuService xiangmucanyuService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XiangmucanyuEntity xiangmucanyu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaozhigong")) {
			xiangmucanyu.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XiangmucanyuEntity> ew = new EntityWrapper<XiangmucanyuEntity>();

		PageUtils page = xiangmucanyuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiangmucanyu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XiangmucanyuEntity xiangmucanyu, 
		HttpServletRequest request){
        EntityWrapper<XiangmucanyuEntity> ew = new EntityWrapper<XiangmucanyuEntity>();

		PageUtils page = xiangmucanyuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiangmucanyu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XiangmucanyuEntity xiangmucanyu){
       	EntityWrapper<XiangmucanyuEntity> ew = new EntityWrapper<XiangmucanyuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xiangmucanyu, "xiangmucanyu")); 
        return R.ok().put("data", xiangmucanyuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XiangmucanyuEntity xiangmucanyu){
        EntityWrapper< XiangmucanyuEntity> ew = new EntityWrapper< XiangmucanyuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xiangmucanyu, "xiangmucanyu")); 
		XiangmucanyuView xiangmucanyuView =  xiangmucanyuService.selectView(ew);
		return R.ok("查询项目参与成功").put("data", xiangmucanyuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XiangmucanyuEntity xiangmucanyu = xiangmucanyuService.selectById(id);
		xiangmucanyu = xiangmucanyuService.selectView(new EntityWrapper<XiangmucanyuEntity>().eq("id", id));
        return R.ok().put("data", xiangmucanyu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XiangmucanyuEntity xiangmucanyu = xiangmucanyuService.selectById(id);
		xiangmucanyu = xiangmucanyuService.selectView(new EntityWrapper<XiangmucanyuEntity>().eq("id", id));
        return R.ok().put("data", xiangmucanyu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XiangmucanyuEntity xiangmucanyu, HttpServletRequest request){
    	xiangmucanyu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xiangmucanyu);
        xiangmucanyuService.insert(xiangmucanyu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XiangmucanyuEntity xiangmucanyu, HttpServletRequest request){
    	xiangmucanyu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xiangmucanyu);
        xiangmucanyuService.insert(xiangmucanyu);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XiangmucanyuEntity xiangmucanyu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xiangmucanyu);
        xiangmucanyuService.updateById(xiangmucanyu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xiangmucanyuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
