package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShoufeixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShoufeixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShoufeixinxiView;


/**
 * 收费信息
 *
 * @author 
 * @email 
 * @date 2021-03-09 14:04:05
 */
public interface ShoufeixinxiService extends IService<ShoufeixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShoufeixinxiVO> selectListVO(Wrapper<ShoufeixinxiEntity> wrapper);
   	
   	ShoufeixinxiVO selectVO(@Param("ew") Wrapper<ShoufeixinxiEntity> wrapper);
   	
   	List<ShoufeixinxiView> selectListView(Wrapper<ShoufeixinxiEntity> wrapper);
   	
   	ShoufeixinxiView selectView(@Param("ew") Wrapper<ShoufeixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShoufeixinxiEntity> wrapper);
   	
}

