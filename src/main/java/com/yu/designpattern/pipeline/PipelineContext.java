package com.yu.designpattern.pipeline;

import com.yu.designpattern.pipeline.test.vegetable.Vegetable;

import java.util.List;

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
     * @param vegetable
     */
    void set(String contextKey, Vegetable vegetable);

    /**
     * get
     *
     * @param contextKey
     * @return
     */
    Object get(String contextKey);

    /**
     * get all
     * @return
     */
    List<Vegetable> getAll();
}
