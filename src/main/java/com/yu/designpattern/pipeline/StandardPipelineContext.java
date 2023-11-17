package com.yu.designpattern.pipeline;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhongcanyu
 * @date 2023/11/17
 */
public class StandardPipelineContext implements PipelineContext {

    private Map<String, Object> contentMap = new ConcurrentHashMap<>();

    @Override
    public void set(String contextKey, Object contextValue) {
        contentMap.put(contextKey, contextValue);
    }

    @Override
    public Object get(String contextKey) {
        return contentMap.get(contextKey);
    }
}
