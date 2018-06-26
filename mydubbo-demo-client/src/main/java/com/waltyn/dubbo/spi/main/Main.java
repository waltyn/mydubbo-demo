package com.waltyn.dubbo.spi.main;

import java.util.ServiceLoader;

import com.waltyn.dubbo.spi.container.Container;

public class Main {
	public static void main(String[] args) {
		ServiceLoader<Container> containers=ServiceLoader.load(Container.class);
		for(Container c:containers){
			c.onStart();
		}
	}
}
