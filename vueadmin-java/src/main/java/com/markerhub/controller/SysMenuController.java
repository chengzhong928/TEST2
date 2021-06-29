package com.markerhub.controller;


import com.markerhub.entity.SysMenu;
import com.markerhub.service.SysMenuService;
import com.markerhub.vueadminjava.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 我的公众号：MarkerHub
 * @since 2021-04-29
 */
@RestController
@RequestMapping("/sys-menu")
public class SysMenuController extends BaseController {

    @Autowired
    private SysMenuService sysMenuService;

    @GetMapping("list")
    public SysMenu list() {

        SysMenu byId = sysMenuService.selectInfo();

        return byId;
    }


    @GetMapping("list2")
    public SysMenu list2() {

        SysMenu byId = sysMenuService.selectInfo();

        return byId;
    }


}
