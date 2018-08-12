package com.waltyn.dubbo.container;

public class ContainerMain {
	public static void main(String[] args) {
		//1.第一行代码
		com.alibaba.dubbo.container.Main.main(args);
		//2.研究AdaptiveExtension，起点：com.alibaba.dubbo.config.ServiceConfig<T> 第二个视频18.37
		
		//关于main启动的理解文档：https://www.jianshu.com/p/2f4eeb8ef93a
	}
}

//备注：
//1.jdk_home要配置成为jdk路径，不是jre
//2.编译路径是E:\StudyAndWork\WorkSpaces\Learning\dubbo-source
//
//
//
//
//
//
//
