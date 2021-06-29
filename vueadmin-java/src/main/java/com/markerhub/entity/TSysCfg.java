package com.markerhub.entity;

import java.time.LocalDateTime;

import com.markerhub.vueadminjava.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author 我的公众号：MarkerHub
 * @since 2021-04-29
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TSysCfg extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 配置编码
     */
    private String cfgCode;

    /**
     * 配置显示名称
     */
    private String cfgName;

    /**
     * 配置值
     */
    private String cfgValue;

    /**
     * 值的类型
     */
    private String valueType;

    /**
     * 配置分类
     */
    private String category;

    /**
     * 备注
     */
    private String remark;

    /**
     * 状态
     */
    private Integer state;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;

    /**
     * 更新时间
     */
    private LocalDateTime updatedAt;


}
