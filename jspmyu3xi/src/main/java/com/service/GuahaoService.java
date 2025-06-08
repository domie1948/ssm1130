package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuahaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuahaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuahaoView;


/**
 * 挂号
 *
 * @author 
 * @email 
 * @date 2021-03-09 14:04:05
 */
public interface GuahaoService extends IService<GuahaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuahaoVO> selectListVO(Wrapper<GuahaoEntity> wrapper);
   	
   	GuahaoVO selectVO(@Param("ew") Wrapper<GuahaoEntity> wrapper);
   	
   	List<GuahaoView> selectListView(Wrapper<GuahaoEntity> wrapper);
   	
   	GuahaoView selectView(@Param("ew") Wrapper<GuahaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuahaoEntity> wrapper);
   	
}

