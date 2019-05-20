package com.hjy.simple.blog.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hjy.simple.blog.system.entity.SysRole;
import com.hjy.simple.blog.system.mapper.SysRoleMapper;
import com.hjy.simple.blog.system.service.SysRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author hjy
 * @since 2019-03-18
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

    @Resource
    private SysRoleMapper roleMapper;

    @Override
    public List<SysRole> findUserRole(String userName) {
        return roleMapper.findUserRole(userName);
    }
}
