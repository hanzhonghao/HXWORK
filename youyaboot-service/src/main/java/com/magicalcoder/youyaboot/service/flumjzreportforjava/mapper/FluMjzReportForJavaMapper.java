package com.magicalcoder.youyaboot.service.flumjzreportforjava.mapper;

import com.magicalcoder.youyaboot.core.service.ICommonMapper;
import com.magicalcoder.youyaboot.model.FluMjzReportForJava;
import java.util.List;
import java.util.Map;
import java.math.*;
/**
* 代码为自动生成 Created by www.magicalcoder.com
* 软件作者：何栋宇 qq:709876443
* 如果你改变了此类 read 请将此行删除
* 欢迎加入官方QQ群:648595928
*/

public interface FluMjzReportForJavaMapper extends ICommonMapper<FluMjzReportForJava,Long>{

    List<FluMjzReportForJava> getList(Map query);

    List<FluMjzReportForJava> getListForExcel(Map query);

    Boolean setList(FluMjzReportForJava list);

    List<FluMjzReportForJava> getListFromDB(Map<String, Object> query);
}
