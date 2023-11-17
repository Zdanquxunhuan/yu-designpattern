package com.yu.designpattern.pipeline.test;

import com.yu.designpattern.pipeline.AbstractPipelineNode;
import com.yu.designpattern.pipeline.PipelineContext;
import com.yu.designpattern.pipeline.test.vegetable.Vegetable;

/**
 * @author zhongcanyu
 * @date 2023/11/17
 */
public class CutVagetable extends AbstractPipelineNode {
    @Override
    public boolean doExec(PipelineContext pipelineContext) {

        for (Vegetable vegetable : pipelineContext.getAll()) {
            System.out.println("切菜-----" + vegetable.getClass().getSimpleName());
        }
        return true;
    }
}
