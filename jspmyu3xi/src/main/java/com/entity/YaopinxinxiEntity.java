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
 * 药品信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-09 14:04:05
 */
@TableName("yaopinxinxi")
public class YaopinxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YaopinxinxiEntity() {
		
	}
	
	public YaopinxinxiEntity(T t) {
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
	 * 药品编码
	 */
					
	private String yaopinbianma;
	
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
