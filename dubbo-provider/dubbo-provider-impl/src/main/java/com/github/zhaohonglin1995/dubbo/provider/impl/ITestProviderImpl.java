package com.github.zhaohonglin1995.dubbo.provider.impl;

import com.github.zhaohonglin1995.dubbo.provider.api.ITestProvider;

/**
 * 描述:interface的具体实现类,consumer方并不关心
 */
public class ITestProviderImpl implements ITestProvider {
    //sayHi方法
    public String sayHi(String name) {
        return "hello," + name;
    }
}
