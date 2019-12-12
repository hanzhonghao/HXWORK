package com.magicalcoder.youyaboot.service.flumjzreportforjava.service.impl;

import com.magicalcoder.youyaboot.service.flumjzreportforjava.mapper.FluMjzReportForJavaMapper;
import com.magicalcoder.youyaboot.service.flumjzreportforjava.service.FluMjzReportForJavaService;
import com.magicalcoder.youyaboot.model.FluMjzReportForJava;
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
public class FluMjzReportForJavaServiceImpl extends CommonServiceImpl<FluMjzReportForJava,Long> implements FluMjzReportForJavaService,InitializingBean{
    @Resource
    private FluMjzReportForJavaMapper fluMjzReportForJavaMapper;

    @Override
    public void afterPropertiesSet() {
        super.commonMapper = fluMjzReportForJavaMapper;
    }

    @Override
    public List<FluMjzReportForJava> getList(Map<String, Object> query) {
        List<FluMjzReportForJava> list= fluMjzReportForJavaMapper.getList(query);
        return list;
    }

    @Override
    public Boolean setList(List<FluMjzReportForJava> list) {
        for(FluMjzReportForJava cs: list) {
            fluMjzReportForJavaMapper.setList(cs);
        }
        return null;
    }

    @Override
    public List<FluMjzReportForJava>  getModelListFromDB(Map<String, Object> query) {
        List<FluMjzReportForJava> list = fluMjzReportForJavaMapper.getListFromDB(query);
        return list;
    }


    @Override
    public List<FluMjzReportForJava> getListForExcel(Map<String, Object> query) {
        List<FluMjzReportForJava> list= fluMjzReportForJavaMapper.getList(query);
        return list;
    }
}
