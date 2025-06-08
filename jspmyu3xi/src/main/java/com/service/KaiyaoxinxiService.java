package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaiyaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaiyaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaiyaoxinxiView;


/**
 * 开药信息
 *
 * @author 
 * @email 
 * @date 2021-03-09 14:04:05
 */
public interface KaiyaoxinxiService extends IService<KaiyaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaiyaoxinxiVO> selectListVO(Wrapper<KaiyaoxinxiEntity> wrapper);
   	
   	KaiyaoxinxiVO selectVO(@Param("ew") Wrapper<KaiyaoxinxiEntity> wrapper);
   	
   	List<KaiyaoxinxiView> selectListView(Wrapper<KaiyaoxinxiEntity> wrapper);
   	
   	KaiyaoxinxiView selectView(@Param("ew") Wrapper<KaiyaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaiyaoxinxiEntity> wrapper);
   	
}

