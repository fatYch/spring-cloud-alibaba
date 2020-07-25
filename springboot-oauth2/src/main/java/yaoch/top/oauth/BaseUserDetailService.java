package yaoch.top.oauth;

import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

/**
 * 自定义用户校验
 * @author yaocanhong
 * @version 1.0.0
 * @data 2020/6/29 15:03
 */
@Log4j2
public class BaseUserDetailService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("此时用户id:" + username);
        SysUserAuthentication user = null;
        if("admin".equals(username)) {
            //然后根据当前登录方式type 然后创建一个sysuserauthentication 重新设置 username 和 password
            //比如使用手机验证码登录的， username就是手机号 password就是6位的验证码{noop}000000
            List<GrantedAuthority> list = AuthorityUtils.createAuthorityList("admin_role1"); //所谓的角色，只是增加ROLE_前缀
            user = new SysUserAuthentication();
            user.setUsername(username);
            user.setPassword("{noop}123456");
            user.setAuthorities(list);
            user.setAccountNonExpired(true);
            user.setAccountNonLocked(true);
            user.setCredentialsNonExpired(true);
            user.setEnabled(true);

            //这里会根据user属性抛出锁定，禁用等异常
        }
        return user;//返回UserDetails的实现user不为空，则验证通过
    }
}
