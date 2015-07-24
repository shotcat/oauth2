package org.springframework.security.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/***
 * 用户信息服务类
 * @author gaoyuandong
 * @date   2015年7月24日 上午9:10:00
 * @mail   466862016@qq.com
 */
@Controller
@RequestMapping("/api/user")
public class UserController {

	@RequestMapping(value="/addUser.json",method={RequestMethod.POST})
	public String addUser() {
		return "addUser";
	}
}
