package com.bajdcc.LALR1.grammar.runtime.service

import com.bajdcc.LALR1.grammar.runtime.RuntimeObject
import com.bajdcc.LALR1.grammar.runtime.data.RuntimeArray

/**
 * 【运行时】运行时用户服务接口
 *
 * @author bajdcc
 */
interface IRuntimeUserService {

    /**
     * 获取服务
     * @return 管道服务
     */
    val pipe: IRuntimeUserPipeService

    /**
     * 获取服务
     * @return 共享服务
     */
    val share: IRuntimeUserShareService

    /**
     * 获取服务
     * @return 文件服务
     */
    val file: IRuntimeUserFileService

    interface IRuntimeUserPipeService {
        /**
         * 读取管道
         * @param id 句柄
         * @return 读取的对象
         */
        fun read(id: Int): RuntimeObject

        /**
         * 写入管道
         * @param id 句柄
         * @param obj 写入的对象
         * @return 是否成功
         */
        fun write(id: Int, obj: RuntimeObject): Boolean
    }

    interface IRuntimeUserShareService {
        /**
         * 获取共享
         * @param id 句柄
         * @return 共享对象
         */
        operator fun get(id: Int): RuntimeObject?

        /**
         * 设置共享
         * @param id 句柄
         * @param obj 共享对象
         * @return 上次保存的内容
         */
        operator fun set(id: Int, obj: RuntimeObject?): RuntimeObject?

        /**
         * 锁定共享
         * @param id 句柄
         * @return 是否成功
         */
        fun lock(id: Int): Boolean

        /**
         * 解锁共享
         * @param id 句柄
         * @return 是否成功
         */
        fun unlock(id: Int): Boolean
    }

    interface IRuntimeUserFileService

    /**
     * 创建用户服务句柄
     *
     * @param name 用户服务名称
     * @param page 创建时的页面
     * @return 用户服务句柄
     */
    fun create(name: String, page: String): Int

    /**
     * 销毁用户服务
     */
    fun destroy()

    /**
     * 销毁用户服务句柄
     * @param id 用户服务句柄
     * @return 是否成功
     */
    fun destroy(id: Int): Boolean

    /**
     * 获取列表
     *
     * @param api 是否API调用
     * @return 列表
     */
    fun stat(api: Boolean): RuntimeArray
}