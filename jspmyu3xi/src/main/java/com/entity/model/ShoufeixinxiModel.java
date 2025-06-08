package com.entity.model;

import com.entity.ShoufeixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 收费信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-09 14:04:05
 */
public class ShoufeixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 挂号类型
	 */
	
	private String guahaoleixing;
		
	/**
	 * 挂号费用
	 */
	
	private Integer guahaofeiyong;
		
	/**
	 * 药品收费
	 */
	
	private Integer yaopinshoufei;
		
	/**
	 * 总收费
	 */
	
	private Integer zongshoufei;
		
	/**
	 * 病人姓名
	 */
	
	private String bingrenxingming;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 身份证
	 */
	
	private String shenfenzheng;
				
	
	/**
	 * 设置：挂号类型
	 */
	 
	public void setGuahaoleixing(String guahaoleixing) {
		this.guahaoleixing = guahaoleixing;
	}
	
	/**
	 * 获取：挂号类型
	 */
	public String getGuahaoleixing() {
		return guahaoleixing;
	}
				
	
	/**
	 * 设置：挂号费用
	 */
	 
	public void setGuahaofeiyong(Integer guahaofeiyong) {
		this.guahaofeiyong = guahaofeiyong;
	}
	
	/**
	 * 获取：挂号费用
	 */
	public Integer getGuahaofeiyong() {
		return guahaofeiyong;
	}
				
	
	/**
	 * 设置：药品收费
	 */
	 
	public void setYaopinshoufei(Integer yaopinshoufei) {
		this.yaopinshoufei = yaopinshoufei;
	}
	
	/**
	 * 获取：药品收费
	 */
	public Integer getYaopinshoufei() {
		return yaopinshoufei;
	}
				
	
	/**
	 * 设置：总收费
	 */
	 
	public void setZongshoufei(Integer zongshoufei) {
		this.zongshoufei = zongshoufei;
	}
	
	/**
	 * 获取：总收费
	 */
	public Integer getZongshoufei() {
		return zongshoufei;
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
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
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
			
}
