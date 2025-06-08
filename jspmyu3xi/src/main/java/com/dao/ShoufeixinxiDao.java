package com.dao;

import com.entity.ShoufeixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShoufeixinxiVO;
import com.entity.view.ShoufeixinxiView;


/**
 * 收费信息
 * 
 * @author 
 * @email 
 * @date 2021-03-09 14:04:05
 */
public interface ShoufeixinxiDao extends BaseMapper<ShoufeixinxiEntity> {
	
	List<ShoufeixinxiVO> selectListVO(@Param("ew") Wrapper<ShoufeixinxiEntity> wrapper);
	
	ShoufeixinxiVO selectVO(@Param("ew") Wrapper<ShoufeixinxiEntity> wrapper);
	
	List<ShoufeixinxiView> selectListView(@Param("ew") Wrapper<ShoufeixinxiEntity> wrapper);

	List<ShoufeixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShoufeixinxiEntity> wrapper);
	
	ShoufeixinxiView selectView(@Param("ew") Wrapper<ShoufeixinxiEntity> wrapper);
	
}
