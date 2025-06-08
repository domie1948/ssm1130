package com.dao;

import com.entity.KaiyaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaiyaoxinxiVO;
import com.entity.view.KaiyaoxinxiView;


/**
 * 开药信息
 * 
 * @author 
 * @email 
 * @date 2021-03-09 14:04:05
 */
public interface KaiyaoxinxiDao extends BaseMapper<KaiyaoxinxiEntity> {
	
	List<KaiyaoxinxiVO> selectListVO(@Param("ew") Wrapper<KaiyaoxinxiEntity> wrapper);
	
	KaiyaoxinxiVO selectVO(@Param("ew") Wrapper<KaiyaoxinxiEntity> wrapper);
	
	List<KaiyaoxinxiView> selectListView(@Param("ew") Wrapper<KaiyaoxinxiEntity> wrapper);

	List<KaiyaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<KaiyaoxinxiEntity> wrapper);
	
	KaiyaoxinxiView selectView(@Param("ew") Wrapper<KaiyaoxinxiEntity> wrapper);
	
}
