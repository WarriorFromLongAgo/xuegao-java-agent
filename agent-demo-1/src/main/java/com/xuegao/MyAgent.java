package com.xuegao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.instrument.Instrumentation;

/**
 * @author xuegao
 * @version 1.0
 * @date 2022/6/11 14:48
 */
public class MyAgent {
    private static final Logger log = LoggerFactory.getLogger(MyAgent.class);

    private static Instrumentation _inst;

    public static void premain(String agentArgs, Instrumentation inst) {
        log.info("[java-agent][MyAgent][premain][agentArgs={}]", agentArgs);
        inst.addTransformer(new MyTransformer(agentArgs));
        _inst = inst;
    }

    public static void premain(String agentArgs) {
    }

    public static long sizeOf(Object o) {
        return _inst.getObjectSize(o);
    }
}