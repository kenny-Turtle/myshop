package com.itany.zshop.service.Impl;

import com.itany.zshop.vo.PasswordVo;
import org.apache.shiro.authc.credential.PasswordService;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author zfj
 * @create 2019/8/18 9:28
 */
@Service
//@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class PasswordServiceImpl implements PasswordService {

    @Value("${algorithmName}")
    private String algorithmName;
    @Value("${hashIterations}")
    private int hashIterations;

    public String encryptPassword(Object passwordVo) throws IllegalArgumentException {
        PasswordVo vo = (PasswordVo) passwordVo;
        return new SimpleHash(algorithmName,vo.getPassword(),vo.getSalt(),
                hashIterations).toBase64();
    }

    public boolean passwordsMatch(Object o, String s) {
        return false;
    }
}
