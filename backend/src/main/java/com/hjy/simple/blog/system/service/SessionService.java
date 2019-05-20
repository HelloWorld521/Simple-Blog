package com.hjy.simple.blog.system.service;

import com.hjy.simple.blog.system.entity.UserOnline;

import java.util.List;

public interface SessionService {

    List<UserOnline> list();

    boolean forceLogout(String sessionId);
}