package com.hjy.simple.blog.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hjy.simple.blog.system.entity.SysRole;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author hjy
 * @since 2019-03-18
 */
public interface SysRoleMapper extends BaseMapper<SysRole> {

    List<SysRole> findUserRole(String userName);
}
