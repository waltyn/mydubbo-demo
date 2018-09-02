package com.waltyn.dubbo.container;

import com.alibaba.dubbo.rpc.Exporter;

public class ContainerMain {
	public static void main(String[] args) {
		//1.第一行代码
		com.alibaba.dubbo.container.Main.main(args);
		
		//2.研究AdaptiveExtension，起点：com.alibaba.dubbo.config.ServiceConfig<T> 第二个视频9.43秒开始
		//	2.1生成的Protocol$Adptive需要拷贝到dubbo源码中，路径目前在：/dubbo-demo-provider/src/test/java/com/alibaba/dubbo/rpc/Protocol$Adpative.java
		
		//3.dubble的IOC研究入口：Exporter com.alibaba.dubbo.rpc.Protocol$Adpative.export(Invoker arg0) throws RpcException
		
		
		
	}
}

//备注：
//关于main启动的理解文档：https://www.jianshu.com/p/2f4eeb8ef93a
//1.jdk_home要配置成为jdk路径，不是jre
//2.编译路径是E:\StudyAndWork\WorkSpaces\Learning\dubbo-source
//
//
//
//
//
//
//
