package yaoch.top.oauth;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author yaocanhong
 * @version 1.0.0
 * @data 2020/6/29 15:27
 */
public class SysGrantedAuthority implements GrantedAuthority {

    /**
     * 权限
     */
    private String authority;

    /**
     * 权限
     * @return authority
     */
    public String getAuthority() {
        return authority;
    }

    /**
     * 权限
     * @param authority 权限
     */
    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
