package com.yu.designpattern.pipeline.test;

import com.yu.designpattern.pipeline.*;
import com.yu.designpattern.pipeline.test.vegetable.Cabbage;
import com.yu.designpattern.pipeline.test.vegetable.Spinach;

public class PipelineClient {

    public static void main(String[] args) {

        // 管道初始化
        Pipeline pipeline = new StandardPipeline();

        // value扩展
        PipelineNode pipelineValue = new WishVagetable();
        PipelineNode pipelineValue2 = new CutVagetable();

        // 上下文
        PipelineContext pipelineContext = new StandardPipelineContext();

        pipeline.addValue(pipelineValue);
        pipeline.addValue(pipelineValue2);
        pipelineContext.set("大白菜", new Cabbage());
        pipelineContext.set("空心菜",new Spinach());

        // 调用管道
        pipeline.invoke(pipelineContext);

    }
}
