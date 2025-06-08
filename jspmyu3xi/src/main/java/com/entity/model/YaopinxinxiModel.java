package com.entity.model;

import com.entity.YaopinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 药品信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-09 14:04:05
 */
public class YaopinxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 药品名称
	 */
	
	private String yaopinmingcheng;
		
	/**
	 * 药品分类
	 */
	
	private String yaopinfenlei;
		
	/**
	 * 单价
	 */
	
	private Integer danjia;
		
	/**
	 * 总量
	 */
	
	private Integer zongliang;
		
	/**
	 * 用完数量
	 */
	
	private Integer yongwanshuliang;
		
	/**
	 * 库存剩余
	 */
	
	private Integer kucunshengyu;
				
	
	/**
	 * 设置：药品名称
	 */
	 
	public void setYaopinmingcheng(String yaopinmingcheng) {
		this.yaopinmingcheng = yaopinmingcheng;
	}
	
	/**
	 * 获取：药品名称
	 */
	public String getYaopinmingcheng() {
		return yaopinmingcheng;
	}
				
	
	/**
	 * 设置：药品分类
	 */
	 
	public void setYaopinfenlei(String yaopinfenlei) {
		this.yaopinfenlei = yaopinfenlei;
	}
	
	/**
	 * 获取：药品分类
	 */
	public String getYaopinfenlei() {
		return yaopinfenlei;
	}
				
	
	/**
	 * 设置：单价
	 */
	 
	public void setDanjia(Integer danjia) {
		this.danjia = danjia;
	}
	
	/**
	 * 获取：单价
	 */
	public Integer getDanjia() {
		return danjia;
	}
				
	
	/**
	 * 设置：总量
	 */
	 
	public void setZongliang(Integer zongliang) {
		this.zongliang = zongliang;
	}
	
	/**
	 * 获取：总量
	 */
	public Integer getZongliang() {
		return zongliang;
	}
				
	
	/**
	 * 设置：用完数量
	 */
	 
	public void setYongwanshuliang(Integer yongwanshuliang) {
		this.yongwanshuliang = yongwanshuliang;
	}
	
	/**
	 * 获取：用完数量
	 */
	public Integer getYongwanshuliang() {
		return yongwanshuliang;
	}
				
	
	/**
	 * 设置：库存剩余
	 */
	 
	public void setKucunshengyu(Integer kucunshengyu) {
		this.kucunshengyu = kucunshengyu;
	}
	
	/**
	 * 获取：库存剩余
	 */
	public Integer getKucunshengyu() {
		return kucunshengyu;
	}
			
}
