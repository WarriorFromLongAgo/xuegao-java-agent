package com.xuegao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;
import java.util.Objects;

/**
 * @author xuegao
 * @version 1.0
 * @date 2022/6/11 14:39
 */
public class MyTransformer implements ClassFileTransformer {
    private static final Logger log = LoggerFactory.getLogger(MyTransformer.class);

    private String packageName;

    public MyTransformer() {
    }

    public MyTransformer(String packageName) {
        this.packageName = packageName;
    }

    @Override
    public byte[] transform(ClassLoader loader,
                            String className,
                            Class<?> classBeingRedefined,
                            ProtectionDomain protectionDomain,
                            byte[] classfileBuffer) throws IllegalClassFormatException {
        if (Objects.nonNull(className) && className.contains("AgentTestApplication")){
            log.info("[java-agent][com.xuegao.MyTransformer][transform][className={}]", className);
        }
        return classfileBuffer;
    }
}