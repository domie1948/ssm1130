package com.entity.model;

import com.entity.ZhenduanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 诊断信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-09 14:04:05
 */
public class ZhenduanxinxiModel  implements Serializable {
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
	 * 体温
	 */
	
	private String tiwen;
		
	/**
	 * 血压
	 */
	
	private String xueya;
		
	/**
	 * 病因
	 */
	
	private String bingyin;
				
	
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
	 * 设置：体温
	 */
	 
	public void setTiwen(String tiwen) {
		this.tiwen = tiwen;
	}
	
	/**
	 * 获取：体温
	 */
	public String getTiwen() {
		return tiwen;
	}
				
	
	/**
	 * 设置：血压
	 */
	 
	public void setXueya(String xueya) {
		this.xueya = xueya;
	}
	
	/**
	 * 获取：血压
	 */
	public String getXueya() {
		return xueya;
	}
				
	
	/**
	 * 设置：病因
	 */
	 
	public void setBingyin(String bingyin) {
		this.bingyin = bingyin;
	}
	
	/**
	 * 获取：病因
	 */
	public String getBingyin() {
		return bingyin;
	}
			
}
