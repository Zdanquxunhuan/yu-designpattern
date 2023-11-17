package com.yu.designpattern.pipeline;

import com.yu.designpattern.pipeline.test.vegetable.Vegetable;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * @author zhongcanyu
 * @date 2023/11/17
 */
public class StandardPipelineContext implements PipelineContext {

    private Map<String, Vegetable> contentMap = new ConcurrentHashMap<>();

    @Override
    public void set(String contextKey, Vegetable vegetable) {
        contentMap.put(contextKey, vegetable);
    }

    @Override
    public Object get(String contextKey) {
        return contentMap.get(contextKey);
    }

    @Override
    public List<Vegetable> getAll() {
        return contentMap.values().stream().collect(Collectors.toList());
    }
}
