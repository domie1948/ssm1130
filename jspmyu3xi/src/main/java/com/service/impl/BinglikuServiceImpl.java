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


import com.dao.BinglikuDao;
import com.entity.BinglikuEntity;
import com.service.BinglikuService;
import com.entity.vo.BinglikuVO;
import com.entity.view.BinglikuView;

@Service("binglikuService")
public class BinglikuServiceImpl extends ServiceImpl<BinglikuDao, BinglikuEntity> implements BinglikuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BinglikuEntity> page = this.selectPage(
                new Query<BinglikuEntity>(params).getPage(),
                new EntityWrapper<BinglikuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BinglikuEntity> wrapper) {
		  Page<BinglikuView> page =new Query<BinglikuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BinglikuVO> selectListVO(Wrapper<BinglikuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BinglikuVO selectVO(Wrapper<BinglikuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BinglikuView> selectListView(Wrapper<BinglikuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BinglikuView selectView(Wrapper<BinglikuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
