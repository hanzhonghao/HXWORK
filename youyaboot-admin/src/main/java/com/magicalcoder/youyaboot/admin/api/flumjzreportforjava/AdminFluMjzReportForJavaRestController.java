package com.magicalcoder.youyaboot.admin.api.flumjzreportforjava;

import com.magicalcoder.youyaboot.core.service.CommonRestController;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.math.*;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import com.magicalcoder.youyaboot.core.common.constant.PageConstant;
import com.magicalcoder.youyaboot.core.common.exception.BusinessException;
import com.magicalcoder.youyaboot.core.serialize.ResponseMsg;
import com.magicalcoder.youyaboot.model.FluMjzReportForJava;
import com.magicalcoder.youyaboot.service.flumjzreportforjava.service.FluMjzReportForJavaService;

import com.magicalcoder.youyaboot.core.utils.ListUtil;
import com.magicalcoder.youyaboot.core.utils.MapUtil;
import com.magicalcoder.youyaboot.core.utils.StringUtil;


/**
* 代码为自动生成 Created by www.magicalcoder.com
* 软件作者：何栋宇 qq:709876443
* 如果你改变了此类 read 请将此行删除
* 欢迎加入官方QQ群:648595928
*/

@RequestMapping("/admin/FLU_MJZ_REPORT_FOR_JAVA_rest/")
@RestController
public class AdminFluMjzReportForJavaRestController extends CommonRestController<FluMjzReportForJava,String> implements InitializingBean
{

    @Resource
    private FluMjzReportForJavaService fluMjzReportForJavaService;

        //分页查询
    @RequestMapping(value={"page"}, method={RequestMethod.GET})
    public ResponseMsg page(
        @RequestParam(required = false,value ="p7502First")                            String p7502First ,
        @RequestParam int page,@RequestParam int limit,@RequestParam(required = false) String safeOrderBy
        ,HttpServletResponse response,@RequestParam(required = false) Integer queryType
    ){
        Map<String,Object> query = new HashMap();
        query.put("p7502First",coverBlankToNull(p7502First));
        Integer count = fluMjzReportForJavaService.getModelListCount(query);
        if(StringUtil.isBlank(safeOrderBy)){
            query.put("notSafeOrderBy","p7502 desc");
        }else{
            query.put("safeOrderBy",safeOrderBy);
        }
        if(queryType==null || queryType == QUERY_TYPE_SEARCH){//普通查询
            limit = Math.min(limit, PageConstant.MAX_LIMIT);
            query.put("start",(page - 1) * limit);query.put("limit",limit);
            return new ResponseMsg(count,fluMjzReportForJavaService.getModelList(query));
        }else if(queryType == QUERY_TYPE_EXPORT_EXCEL){
            query.put("start",(page - 1) * limit);query.put("limit",limit);
            exportExcel(response,fluMjzReportForJavaService.getModelList(query),"FLU_MJZ_REPORT_FOR_JAVA",
            new String[]{"p900","p6891","p686","p800","p7501","p7502","p4","P5","P6","P7","P7503","p13","p7504","p7505","p7506","p7507","p321","p322","p324","p325","p327","p328","p3291","p3292","p3294","p3295","p3297","p3298","p3281","p3282","p3284","p3285","p3287","p3288","p3271","p3272","p3274","p3275","P6911","P6912","P6913","P6914","P6915","P6916","P6917","P6918","P6919","P6920","P6921","P6922","P6923","P6924","P6925","P1","p7508","p7509","p7510","p7511","p7512","p8508","p8509"},
            new String[]{"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""});
        }
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        super.commonService = fluMjzReportForJavaService;
        super.primaryKey = "p7502";//硬编码此实体的主键名称
    }
}
