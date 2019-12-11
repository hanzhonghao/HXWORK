package com.magicalcoder.youyaboot.service.flumzdata.service.impl;

import com.magicalcoder.youyaboot.service.flumzdata.mapper.FluMzdataMapper;
import com.magicalcoder.youyaboot.service.flumzdata.service.FluMzdataService;
import com.magicalcoder.youyaboot.model.FluMzdata;
import com.magicalcoder.youyaboot.core.service.CommonServiceImpl;
import com.magicalcoder.youyaboot.core.utils.StringUtil;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import com.magicalcoder.youyaboot.core.utils.CopyUtil;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.math.*;
/**
* 代码为自动生成 Created by www.magicalcoder.com
* 软件作者：何栋宇 qq:709876443
* 如果你改变了此类 read 请将此行删除
* 欢迎加入官方QQ群:648595928
*/

@Service
public class FluMzdataServiceImpl extends CommonServiceImpl<FluMzdata,String> implements FluMzdataService,InitializingBean{
    @Resource
    private FluMzdataMapper fluMzdataMapper;

    @Override
    public void afterPropertiesSet() {
        super.commonMapper = fluMzdataMapper;
    }
}
