package com.dao;

import com.entity.GuahaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuahaoVO;
import com.entity.view.GuahaoView;


/**
 * 挂号
 * 
 * @author 
 * @email 
 * @date 2021-03-09 14:04:05
 */
public interface GuahaoDao extends BaseMapper<GuahaoEntity> {
	
	List<GuahaoVO> selectListVO(@Param("ew") Wrapper<GuahaoEntity> wrapper);
	
	GuahaoVO selectVO(@Param("ew") Wrapper<GuahaoEntity> wrapper);
	
	List<GuahaoView> selectListView(@Param("ew") Wrapper<GuahaoEntity> wrapper);

	List<GuahaoView> selectListView(Pagination page,@Param("ew") Wrapper<GuahaoEntity> wrapper);
	
	GuahaoView selectView(@Param("ew") Wrapper<GuahaoEntity> wrapper);
	
}
