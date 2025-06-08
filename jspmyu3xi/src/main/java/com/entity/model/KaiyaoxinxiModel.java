package com.entity.model;

import com.entity.KaiyaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 开药信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-09 14:04:05
 */
public class KaiyaoxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 就诊科室
	 */
	
	private String jiuzhenkeshi;
		
	/**
	 * 病人姓名
	 */
	
	private String bingrenxingming;
		
	/**
	 * 身份证
	 */
	
	private String shenfenzheng;
		
	/**
	 * 药品编码
	 */
	
	private String yaopinbianma;
		
	/**
	 * 药品分类
	 */
	
	private String yaopinfenlei;
		
	/**
	 * 药品名称
	 */
	
	private String yaopinmingcheng;
		
	/**
	 * 开药数量
	 */
	
	private String kaiyaoshuliang;
		
	/**
	 * 使用说明
	 */
	
	private String shiyongshuoming;
				
	
	/**
	 * 设置：就诊科室
	 */
	 
	public void setJiuzhenkeshi(String jiuzhenkeshi) {
		this.jiuzhenkeshi = jiuzhenkeshi;
	}
	
	/**
	 * 获取：就诊科室
	 */
	public String getJiuzhenkeshi() {
		return jiuzhenkeshi;
	}
				
	
	/**
	 * 设置：病人姓名
	 */
	 
	public void setBingrenxingming(String bingrenxingming) {
		this.bingrenxingming = bingrenxingming;
	}
	
	/**
	 * 获取：病人姓名
	 */
	public String getBingrenxingming() {
		return bingrenxingming;
	}
				
	
	/**
	 * 设置：身份证
	 */
	 
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
				
	
	/**
	 * 设置：药品编码
	 */
	 
	public void setYaopinbianma(String yaopinbianma) {
		this.yaopinbianma = yaopinbianma;
	}
	
	/**
	 * 获取：药品编码
	 */
	public String getYaopinbianma() {
		return yaopinbianma;
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
	 * 设置：开药数量
	 */
	 
	public void setKaiyaoshuliang(String kaiyaoshuliang) {
		this.kaiyaoshuliang = kaiyaoshuliang;
	}
	
	/**
	 * 获取：开药数量
	 */
	public String getKaiyaoshuliang() {
		return kaiyaoshuliang;
	}
				
	
	/**
	 * 设置：使用说明
	 */
	 
	public void setShiyongshuoming(String shiyongshuoming) {
		this.shiyongshuoming = shiyongshuoming;
	}
	
	/**
	 * 获取：使用说明
	 */
	public String getShiyongshuoming() {
		return shiyongshuoming;
	}
			
}
