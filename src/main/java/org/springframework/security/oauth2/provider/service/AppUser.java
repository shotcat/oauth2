package org.springframework.security.oauth2.provider.service;

import java.util.Collection;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/***
 * 认证后的用户实体
 * @author gaoyuandong
 * @date   2015年7月23日 下午5:43:01
 * @mail   466862016@qq.com
 */
public class AppUser implements UserDetails {

	private static final long serialVersionUID = 2053941784865663756L;
	private String username;
	private String password;
	private boolean enabled;
	
	private boolean accountNonExpired;
	private boolean credentialsNonExpired;
	private boolean accountNonLocked;
	private Set<GrantedAuthority> authorities;
	
	public AppUser(String username, String password, boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked, Set<GrantedAuthority> authorities) {
		super();
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.accountNonExpired = accountNonExpired;
		this.credentialsNonExpired = credentialsNonExpired;
		this.accountNonLocked = accountNonLocked;
		this.authorities = authorities;
	}

	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return accountNonExpired;
	}

	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}

	public boolean isCredentialsNonExpired() {
		return credentialsNonExpired;
	}

	public boolean isEnabled() {
		return enabled;
	}

	@Override
	public String toString() {
		return "AppUser [username=" + username + ", password=" + password + ", enabled=" + enabled
				+ ", accountNonExpired=" + accountNonExpired + ", credentialsNonExpired=" + credentialsNonExpired
				+ ", accountNonLocked=" + accountNonLocked + ", authorities=" + authorities + "]";
	}

}
