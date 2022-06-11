package com.xuegao.agenttest;

import com.xuegao.MyAgent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class AgentTestApplication {
    private static final Logger log = LoggerFactory.getLogger(AgentTestApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AgentTestApplication.class, args);
        log.info("[java-agent][AgentTestApplication][main][size={}]", MyAgent.sizeOf(new ObjectA()));
    }

    @RequestMapping("/test/get")
    @ResponseBody
    public String get() {
        return "adasdsaas";
    }
}
