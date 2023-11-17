package com.yu.designpattern.pipeline;

/**
 * 用于串联阀门的管道通路
 *
 * @author zhongcanyu
 * @date 2023/11/17
 */
public interface Pipeline {

    /**
     * 执行
     * @param pipelineContext
     * @return
     */
    boolean invoke(PipelineContext pipelineContext);

    /**
     * add Value
     * @param pipelineValue
     * @return
     */
    boolean addValue(PipelineNode pipelineValue);

    /**
     * remove Value
     * @param pipelineValue
     * @return
     */
    boolean removeValue(PipelineNode pipelineValue);
}
