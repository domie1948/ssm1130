package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 收费信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-09 14:04:05
 */
@TableName("shoufeixinxi")
public class ShoufeixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShoufeixinxiEntity() {
		
	}
	
	public ShoufeixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 挂号编号
	 */
					
	private String guahaobianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：挂号编号
	 */
	public void setGuahaobianhao(String guahaobianhao) {
		this.guahaobianhao = guahaobianhao;
	}
	/**
	 * 获取：挂号编号
	 */
	public String getGuahaobianhao() {
		return guahaobianhao;
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
