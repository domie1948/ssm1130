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


import com.dao.GuahaoDao;
import com.entity.GuahaoEntity;
import com.service.GuahaoService;
import com.entity.vo.GuahaoVO;
import com.entity.view.GuahaoView;

@Service("guahaoService")
public class GuahaoServiceImpl extends ServiceImpl<GuahaoDao, GuahaoEntity> implements GuahaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuahaoEntity> page = this.selectPage(
                new Query<GuahaoEntity>(params).getPage(),
                new EntityWrapper<GuahaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuahaoEntity> wrapper) {
		  Page<GuahaoView> page =new Query<GuahaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuahaoVO> selectListVO(Wrapper<GuahaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuahaoVO selectVO(Wrapper<GuahaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuahaoView> selectListView(Wrapper<GuahaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuahaoView selectView(Wrapper<GuahaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
