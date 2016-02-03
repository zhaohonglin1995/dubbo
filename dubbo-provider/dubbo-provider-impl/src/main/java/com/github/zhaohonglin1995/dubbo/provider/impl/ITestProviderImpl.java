package com.github.zhaohonglin1995.dubbo.provider.impl;

import com.github.zhaohonglin1995.dubbo.provider.api.ITestProvider;

/**
 * 描述:
 *
 * @author 赵红林(OF1116)
 */
public class ITestProviderImpl implements ITestProvider {
    public String sayHi(String name) {
        return "dubbo," + name;
    }
}
