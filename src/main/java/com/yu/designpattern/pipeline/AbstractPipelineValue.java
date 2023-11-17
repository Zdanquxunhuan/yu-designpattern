package com.yu.designpattern.pipeline;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhongcanyu
 * @date 2023/11/17
 */
@Slf4j
public abstract class AbstractPipelineValue implements PipelineValue {

    @Override
    public boolean execute(PipelineContext pipelineContext) {

        log.info("{} start", this.getClass().getSimpleName());

        boolean executeSuccess = doExec(pipelineContext);

        log.info("{} end", this.getClass().getSimpleName());

        return executeSuccess;
    }

    protected abstract boolean doExec(PipelineContext pipelineContext);
}
