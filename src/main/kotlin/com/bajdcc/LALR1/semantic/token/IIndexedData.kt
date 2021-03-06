package com.bajdcc.LALR1.semantic.token

/**
 * 索引数据操作接口
 *
 * @author bajdcc
 */
interface IIndexedData {

    /**
     * 获得对应位置的数据
     *
     * @param index 索引
     * @return 单词包
     */
    operator fun get(index: Int): TokenBag

    /**
     * 是否存在对应位置的数据
     *
     * @param index 索引
     * @return 若存在则返回是，应对可选或并列选项，可能返回否
     */
    fun exists(index: Int): Boolean
}
