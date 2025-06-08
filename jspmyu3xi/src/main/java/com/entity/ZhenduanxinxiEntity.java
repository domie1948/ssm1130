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
 * 诊断信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-09 14:04:05
 */
@TableName("zhenduanxinxi")
public class ZhenduanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhenduanxinxiEntity() {
		
	}
	
	public ZhenduanxinxiEntity(T t) {
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
