package com.magicalcoder.youyaboot.admin.api.flumjzreportforjava;

import com.magicalcoder.youyaboot.core.common.constant.PageConstant;
import com.magicalcoder.youyaboot.core.serialize.ResponseMsg;
import com.magicalcoder.youyaboot.core.service.CommonRestController;
import com.magicalcoder.youyaboot.core.utils.ExportPOIUtils;
import com.magicalcoder.youyaboot.core.utils.StringUtil;
import com.magicalcoder.youyaboot.model.FluMjzReportForJava;
import com.magicalcoder.youyaboot.service.flumjzreportforjava.service.FluMjzReportForJavaService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
* 代码为自动生成 Created by www.magicalcoder.com
* 软件作者：何栋宇 qq:709876443
* 如果你改变了此类 read 请将此行删除
* 欢迎加入官方QQ群:648595928
*/

@RequestMapping("/admin/FLU_MJZ_REPORT_FOR_JAVA_rest/")
@RestController
public class AdminFluMjzReportForJavaRestController extends CommonRestController<FluMjzReportForJava,Long> implements InitializingBean
{

    @Resource
    private FluMjzReportForJavaService fluMjzReportForJavaService;

        //分页查询
    @RequestMapping(value={"page"}, method={RequestMethod.GET})
    public ResponseMsg page(
        @RequestParam(required = false,value ="idFirst")                            Long idFirst ,
        @RequestParam(required = false,value ="p7502First")                            String p7502First ,
        @RequestParam int page,@RequestParam int limit,@RequestParam(required = false) String safeOrderBy
        ,HttpServletResponse response,@RequestParam(required = false) Integer queryType
    ){
        Map<String,Object> query = new HashMap();
        query.put("idFirst",idFirst);
        query.put("p7502First",coverBlankToNull(p7502First));
        Integer count = fluMjzReportForJavaService.getModelListCount(query);
        List<FluMjzReportForJava> list = fluMjzReportForJavaService.getList(query);
//        fluMjzReportForJavaService.setList(list);
        if(StringUtil.isBlank(safeOrderBy)){
            query.put("notSafeOrderBy","id desc,p7502 desc");
        }else{
            query.put("safeOrderBy",safeOrderBy);
        }
        if(queryType==null || queryType == QUERY_TYPE_SEARCH){//普通查询
            limit = Math.min(limit, PageConstant.MAX_LIMIT);
            query.put("start",(page - 1) * limit);query.put("limit",limit);
            return new ResponseMsg(count,list);
        }else if(queryType == QUERY_TYPE_EXPORT_EXCEL){
            query.put("start",(page - 1) * limit);query.put("limit",limit);
            String fileName = "flu Mjz Report For Java";
            // 列名
            String columnNames[] = {"编号","P900","P6891","P686","P800","P7501","P7502","P4","P5","P6","P7","P7503","P13","P7504","P7505","P7506","P7507","P321","P322","P324","P325","P327","P328","P3291","P3292","P3294","P3295","P3297","P3298","P3281","P3282","P3284","P3285","P3287","P3288","P3271","P3272","P3274","P3275","P6911","P6912","P6913","P6914","P6915","P6916","P6917","P6918","P6919","P6920","P6921","P6922","P6923","P6924","P6925","P1","P7508","P7509","P7510","P7511","P7512","P8508","P8509"};
            // map中的key
            String keys[] = { "numbers", "P900","P6891","P686","P800","P7501","P7502","P4","P5","P6","P7","P7503","P13","P7504","P7505","P7506","P7507","P321","P322","P324","P325","P327","P328","P3291","P3292","P3294","P3295","P3297","P3298","P3281","P3282","P3284","P3285","P3287","P3288","P3271","P3272","P3274","P3275","P6911","P6912","P6913","P6914","P6915","P6916","P6917","P6918","P6919","P6920","P6921","P6922","P6923","P6924","P6925","P1","P7508","P7509","P7510","P7511","P7512","P8508","P8509"};
            try {
                List<FluMjzReportForJava> commonSumList1 = fluMjzReportForJavaService.getList(query);
                for (int i=1;i<=commonSumList1.size();i++){
                    commonSumList1.get(i-1).setNumbers(i);
                }

                ExportPOIUtils.start_download(response, fileName, commonSumList1, columnNames, keys);
            } catch (IOException e) {

                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        super.commonService = fluMjzReportForJavaService;
        super.primaryKey = "id";//硬编码此实体的主键名称
    }
}
