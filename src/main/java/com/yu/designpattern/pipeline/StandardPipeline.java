package com.yu.designpattern.pipeline;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhongcanyu
 * @date 2023/11/17
 */
@Data
@Slf4j
public class StandardPipeline implements Pipeline {

    private List<PipelineNode> pipelineValueList = new ArrayList<>();

    @Override
    public boolean invoke(PipelineContext pipelineContext) {
        boolean invokeSuccess = true;
        for (PipelineNode pipelineValue : pipelineValueList) {
            try {
                invokeSuccess = pipelineValue.execute(pipelineContext);
                if (!invokeSuccess) {
                    log.error("{},exec is wrong", pipelineValue.getClass().getSimpleName());
                }
            } catch (Exception e) {
                log.error(e.getMessage(), e);
            }
        }
        return invokeSuccess;
    }

    @Override
    public boolean addValue(PipelineNode pipelineValue) {
        if (pipelineValueList.contains(pipelineValue)) {
            return true;
        }
        return pipelineValueList.add(pipelineValue);
    }

    @Override
    public boolean removeValue(PipelineNode pipelineValue) {
        return pipelineValueList.remove(pipelineValue);
    }
}
