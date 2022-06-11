# Java Agent实现打印对象大小

## 一、使用方法

- 获取agent包 自己打包 agent-demo-1, mvn clean package 在target目录下将生成对应的 agent-demo-1.jar

- agent Jar启动方式 vm启动参数 -javaagent:E:\MyGit\xuegao-java-agent\agent-test\lib\agent-demo-1.jar

- maven 启动方式 将agent放在lib目录下，然后修改配置文件将其拉进来

- maven依赖引入 将agent放在lib目录下，然后修改依赖文件将其拉进来

## 以下是从网上抄的说明

javar -javaaget:[agent-demo-1.jar电脑文件系统全路径]=@M|C|P-包全名|类全名$方法1,方法2...方法N -jar [可执行Jar的全路径]

示例： java -javaagent:/code/open/exec-timer/target/exec-timer.jar=@P-com.ayg.contract.service -jar contract-web.jar

- 命令说明

a.指定类方法打印执行时长： __@M-类全名$方法1,方法2__
示例：@M-com.ayg.contract.service.ContractService$addContract,updateContract

b.指定类所有方法打印执行时长： __@C-类全名__
示例：@C-com.ayg.contract.service.ContractService

c.指定包下所有类所有方法打印执行时长： __@P-包名__
示例：@M-com.ayg.contract.service

__多个命令用双竖线||间隔__ 




