package com.dao;

import com.entity.BinglikuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BinglikuVO;
import com.entity.view.BinglikuView;


/**
 * 病例库
 * 
 * @author 
 * @email 
 * @date 2021-03-09 14:04:05
 */
public interface BinglikuDao extends BaseMapper<BinglikuEntity> {
	
	List<BinglikuVO> selectListVO(@Param("ew") Wrapper<BinglikuEntity> wrapper);
	
	BinglikuVO selectVO(@Param("ew") Wrapper<BinglikuEntity> wrapper);
	
	List<BinglikuView> selectListView(@Param("ew") Wrapper<BinglikuEntity> wrapper);

	List<BinglikuView> selectListView(Pagination page,@Param("ew") Wrapper<BinglikuEntity> wrapper);
	
	BinglikuView selectView(@Param("ew") Wrapper<BinglikuEntity> wrapper);
	
}
