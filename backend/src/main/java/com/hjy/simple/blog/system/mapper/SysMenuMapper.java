package com.hjy.simple.blog.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hjy.simple.blog.system.entity.SysMenu;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author hjy
 * @since 2019-03-18
 */
public interface SysMenuMapper extends BaseMapper<SysMenu> {

    List<SysMenu> findUserPermissions(String userName);
}
