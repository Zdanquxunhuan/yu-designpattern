package com.yu.designpattern.pipeline;

/**
 * 用于每一个节点处理实际业务诉求
 *
 * @author zhongcanyu
 * @date 2023/11/17
 */
public interface PipelineValue {

    /**
     * node execution
     * @param pipelineContext
     * @return
     */
    boolean execute(PipelineContext pipelineContext);
}
