package com.hjy.simple.blog.system.service.impl;

import com.hjy.simple.blog.system.entity.SysUser;
import com.hjy.simple.blog.system.entity.UserOnline;
import com.hjy.simple.blog.system.service.SessionService;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.SessionDAO;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.subject.support.DefaultSubjectContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * example
 *
 * @author hjy
 * @date 2019/4/1
 **/
@Service("sessionService")
public class SessionServiceImpl implements SessionService {
    @Autowired
    private SessionDAO sessionDAO;

    @Override
    public List<UserOnline> list() {
        List<UserOnline> list = new ArrayList<>();
        Collection<Session> activeSessions = sessionDAO.getActiveSessions();
        for (Session session : activeSessions) {
            UserOnline userOnline = new UserOnline();
            if (session.getAttribute(DefaultSubjectContext.PRINCIPALS_SESSION_KEY) == null) {
                continue;
            } else {
                SimplePrincipalCollection principalCollection = (SimplePrincipalCollection) session.getAttribute(DefaultSubjectContext.PRINCIPALS_SESSION_KEY);
                SysUser user = (SysUser) principalCollection.getPrimaryPrincipal();
                userOnline.setUserId(user.getUserId().toString());
                userOnline.setUsername(user.getUsername());
            }
            userOnline.setId((String) session.getId());
            userOnline.setHost(session.getHost());
            userOnline.setStartTimestamp(session.getStartTimestamp());
            userOnline.setLastAccessTime(session.getLastAccessTime());
            long timeout = session.getTimeout();
            if (timeout == 01) {
                userOnline.setStatus("离线");
            } else {
                userOnline.setStatus("在线");
            }
            userOnline.setTimeout(timeout);
            list.add(userOnline);
        }
        return list;
    }

    @Override
    public boolean forceLogout(String sessionId) {
        Session session = sessionDAO.readSession(sessionId);
        sessionDAO.delete(session);
        return true;
    }
}
