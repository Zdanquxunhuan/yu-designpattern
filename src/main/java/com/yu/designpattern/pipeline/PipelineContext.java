package com.yu.designpattern.pipeline;

/**
 * 用于管道上下文中数据的扭转
 *
 * @author zhongcanyu
 * @date 2023/11/17
 */
public interface PipelineContext {

    String FOR_TEST = "forTest";

    /**
     * set
     *
     * @param contextKey
     * @param contextValue
     */
    void set(String contextKey, Object contextValue);

    /**
     * get
     *
     * @param contextKey
     * @return
     */
    Object get(String contextKey);
}
