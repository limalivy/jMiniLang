package com.bajdcc.LALR1.grammar.runtime.service;

/**
 * 【运行时】运行时用户服务接口
 *
 * @author bajdcc
 */
public interface IRuntimeUserService {

	/**
	 * 创建用户服务句柄
	 *
	 * @param name 用户服务名称
	 * @param page 创建时的页面
	 * @return 用户服务句柄
	 */
	int create(String name, String page);

	/**
	 * 销毁用户服务
	 */
	void destroy();

	/**
	 * 销毁用户服务句柄
	 * @param id 用户服务句柄
	 * @return 是否成功
	 */
	boolean destroy(int id);
}
