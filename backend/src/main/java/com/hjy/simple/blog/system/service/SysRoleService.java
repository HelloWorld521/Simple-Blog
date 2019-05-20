package com.hjy.simple.blog.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hjy.simple.blog.system.entity.SysRole;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author hjy
 * @since 2019-03-18
 */
public interface SysRoleService extends IService<SysRole> {

    List<SysRole> findUserRole(String userName);
}
