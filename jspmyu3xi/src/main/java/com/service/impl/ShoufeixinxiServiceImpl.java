package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShoufeixinxiDao;
import com.entity.ShoufeixinxiEntity;
import com.service.ShoufeixinxiService;
import com.entity.vo.ShoufeixinxiVO;
import com.entity.view.ShoufeixinxiView;

@Service("shoufeixinxiService")
public class ShoufeixinxiServiceImpl extends ServiceImpl<ShoufeixinxiDao, ShoufeixinxiEntity> implements ShoufeixinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShoufeixinxiEntity> page = this.selectPage(
                new Query<ShoufeixinxiEntity>(params).getPage(),
                new EntityWrapper<ShoufeixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShoufeixinxiEntity> wrapper) {
		  Page<ShoufeixinxiView> page =new Query<ShoufeixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShoufeixinxiVO> selectListVO(Wrapper<ShoufeixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShoufeixinxiVO selectVO(Wrapper<ShoufeixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShoufeixinxiView> selectListView(Wrapper<ShoufeixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShoufeixinxiView selectView(Wrapper<ShoufeixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
