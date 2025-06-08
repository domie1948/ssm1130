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


import com.dao.KaiyaoxinxiDao;
import com.entity.KaiyaoxinxiEntity;
import com.service.KaiyaoxinxiService;
import com.entity.vo.KaiyaoxinxiVO;
import com.entity.view.KaiyaoxinxiView;

@Service("kaiyaoxinxiService")
public class KaiyaoxinxiServiceImpl extends ServiceImpl<KaiyaoxinxiDao, KaiyaoxinxiEntity> implements KaiyaoxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaiyaoxinxiEntity> page = this.selectPage(
                new Query<KaiyaoxinxiEntity>(params).getPage(),
                new EntityWrapper<KaiyaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaiyaoxinxiEntity> wrapper) {
		  Page<KaiyaoxinxiView> page =new Query<KaiyaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KaiyaoxinxiVO> selectListVO(Wrapper<KaiyaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KaiyaoxinxiVO selectVO(Wrapper<KaiyaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KaiyaoxinxiView> selectListView(Wrapper<KaiyaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaiyaoxinxiView selectView(Wrapper<KaiyaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
