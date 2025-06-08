package com.entity.model;

import com.entity.GuahaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 挂号
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-09 14:04:05
 */
public class GuahaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 就诊科室
	 */
	
	private String jiuzhenkeshi;
		
	/**
	 * 挂号费用
	 */
	
	private Integer guahaofeiyong;
		
	/**
	 * 挂号类型
	 */
	
	private String guahaoleixing;
		
	/**
	 * 病人姓名
	 */
	
	private String bingrenxingming;
		
	/**
	 * 身份证
	 */
	
	private String shenfenzheng;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 年龄
	 */
	
	private String nianling;
		
	/**
	 * 小孩信息
	 */
	
	private String xiaohaixinxi;
		
	/**
	 * 小孩家长
	 */
	
	private String xiaohaijiazhang;
		
	/**
	 * 就诊日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiuzhenriqi;
				
	
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
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：小孩信息
	 */
	 
	public void setXiaohaixinxi(String xiaohaixinxi) {
		this.xiaohaixinxi = xiaohaixinxi;
	}
	
	/**
	 * 获取：小孩信息
	 */
	public String getXiaohaixinxi() {
		return xiaohaixinxi;
	}
				
	
	/**
	 * 设置：小孩家长
	 */
	 
	public void setXiaohaijiazhang(String xiaohaijiazhang) {
		this.xiaohaijiazhang = xiaohaijiazhang;
	}
	
	/**
	 * 获取：小孩家长
	 */
	public String getXiaohaijiazhang() {
		return xiaohaijiazhang;
	}
				
	
	/**
	 * 设置：就诊日期
	 */
	 
	public void setJiuzhenriqi(Date jiuzhenriqi) {
		this.jiuzhenriqi = jiuzhenriqi;
	}
	
	/**
	 * 获取：就诊日期
	 */
	public Date getJiuzhenriqi() {
		return jiuzhenriqi;
	}
			
}
