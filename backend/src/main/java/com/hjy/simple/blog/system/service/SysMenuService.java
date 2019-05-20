package com.hjy.simple.blog.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hjy.simple.blog.system.entity.SysMenu;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author hjy
 * @since 2019-03-18
 */
public interface SysMenuService extends IService<SysMenu> {

    List<SysMenu> findUserPermissions(String userName);
}
