package com.yu.designpattern.pipeline.test;

import com.yu.designpattern.pipeline.AbstractPipelineValue;
import com.yu.designpattern.pipeline.PipelineContext;

/**
 * @author zhongcanyu
 * @date 2023/11/17
 */
public class ForTestValue extends AbstractPipelineValue {
    @Override
    public boolean doExec(PipelineContext pipelineContext) {

        return true;
    }
}
