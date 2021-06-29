package com.markerhub.service.impl;

import com.markerhub.entity.SysMenu;
import com.markerhub.mapper.SysMenuMapper;
import com.markerhub.service.SysMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 我的公众号：MarkerHub
 * @since 2021-04-29
 */
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu> implements SysMenuService {

    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Override
    public SysMenu selectInfo() {

        SysMenu selectsadf = sysMenuMapper.selectsadf();

        return selectsadf;
    }
}
