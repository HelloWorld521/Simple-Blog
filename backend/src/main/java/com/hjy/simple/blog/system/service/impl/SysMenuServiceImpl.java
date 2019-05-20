package com.hjy.simple.blog.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hjy.simple.blog.system.entity.SysMenu;
import com.hjy.simple.blog.system.mapper.SysMenuMapper;
import com.hjy.simple.blog.system.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu> implements SysMenuService {

    @Autowired
    private SysMenuMapper menuMapper;

    @Override
    public List<SysMenu> findUserPermissions(String userName) {
        return menuMapper.findUserPermissions(userName);
    }
}
