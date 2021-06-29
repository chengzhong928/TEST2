package com.markerhub.service;

import com.markerhub.entity.SysMenu;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 我的公众号：MarkerHub
 * @since 2021-04-29
 */
public interface SysMenuService extends IService<SysMenu> {

    SysMenu selectInfo();

}
