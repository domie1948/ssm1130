package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.KaiyaoxinxiEntity;
import com.entity.view.KaiyaoxinxiView;

import com.service.KaiyaoxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 开药信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-09 14:04:05
 */
@RestController
@RequestMapping("/kaiyaoxinxi")
public class KaiyaoxinxiController {
    @Autowired
    private KaiyaoxinxiService kaiyaoxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,KaiyaoxinxiEntity kaiyaoxinxi, HttpServletRequest request){

        EntityWrapper<KaiyaoxinxiEntity> ew = new EntityWrapper<KaiyaoxinxiEntity>();
    	PageUtils page = kaiyaoxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kaiyaoxinxi), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,KaiyaoxinxiEntity kaiyaoxinxi, HttpServletRequest request){
        EntityWrapper<KaiyaoxinxiEntity> ew = new EntityWrapper<KaiyaoxinxiEntity>();
    	PageUtils page = kaiyaoxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kaiyaoxinxi), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( KaiyaoxinxiEntity kaiyaoxinxi){
       	EntityWrapper<KaiyaoxinxiEntity> ew = new EntityWrapper<KaiyaoxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( kaiyaoxinxi, "kaiyaoxinxi")); 
        return R.ok().put("data", kaiyaoxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KaiyaoxinxiEntity kaiyaoxinxi){
        EntityWrapper< KaiyaoxinxiEntity> ew = new EntityWrapper< KaiyaoxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( kaiyaoxinxi, "kaiyaoxinxi")); 
		KaiyaoxinxiView kaiyaoxinxiView =  kaiyaoxinxiService.selectView(ew);
		return R.ok("查询开药信息成功").put("data", kaiyaoxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        KaiyaoxinxiEntity kaiyaoxinxi = kaiyaoxinxiService.selectById(id);
        return R.ok().put("data", kaiyaoxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        KaiyaoxinxiEntity kaiyaoxinxi = kaiyaoxinxiService.selectById(id);
        return R.ok().put("data", kaiyaoxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KaiyaoxinxiEntity kaiyaoxinxi, HttpServletRequest request){
    	kaiyaoxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kaiyaoxinxi);

        kaiyaoxinxiService.insert(kaiyaoxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KaiyaoxinxiEntity kaiyaoxinxi, HttpServletRequest request){
    	kaiyaoxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kaiyaoxinxi);

        kaiyaoxinxiService.insert(kaiyaoxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody KaiyaoxinxiEntity kaiyaoxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(kaiyaoxinxi);
        kaiyaoxinxiService.updateById(kaiyaoxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        kaiyaoxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<KaiyaoxinxiEntity> wrapper = new EntityWrapper<KaiyaoxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = kaiyaoxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
