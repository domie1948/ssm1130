package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BinglikuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BinglikuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BinglikuView;


/**
 * 病例库
 *
 * @author 
 * @email 
 * @date 2021-03-09 14:04:05
 */
public interface BinglikuService extends IService<BinglikuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BinglikuVO> selectListVO(Wrapper<BinglikuEntity> wrapper);
   	
   	BinglikuVO selectVO(@Param("ew") Wrapper<BinglikuEntity> wrapper);
   	
   	List<BinglikuView> selectListView(Wrapper<BinglikuEntity> wrapper);
   	
   	BinglikuView selectView(@Param("ew") Wrapper<BinglikuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BinglikuEntity> wrapper);
   	
}

