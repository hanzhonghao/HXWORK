当前版本 - v101

youyaboot_oracle是youyaboot系列框架，默认数据库引擎采用oracle,如需要其他数据库，请至www.magicalcoder.com下载对应引擎
配置模板时 请设置 模板版本=youyaboot_oracle

相关技术栈：
后端：springboot2.x +mybatis+redis+oracle
前端：layui2.4.5+jquery
工具：magicalcoder前后端代码生成器+magicaldrag前端布局器

1 如何启动
    管理后台：youyaboot-admin
        
        安装环境
            框架需要redis服务，请自行下载或者双击project/redis/redis-启动.bat
        配置环境
           youyaboot\youyaboot-admin\src\main\resources\application-publish.yml
           请根据实际情况配置 oracle redis
        导入数据库
            youyaboot\youyaboot.sql 导入上面配置的数据库
        运行
            youyaboot\youyaboot-admin\src\main\java\com\magicalcoder\youyaboot\admin\YouyaBootAdminApplication.java
            main函数即可启动
        
        也可以打成jar启动也行
        方式1 java -jar youyaboot-admin.jar
        方式2 nohup>nohupGps java -jar youyaboot-admin.jar --spring.profiles.active=deploy 2>&1 &
        
        启动成功后 浏览器访问
        http://localhost:18080/youyaboot-admin
            默认 admin/admin登陆
        
2 声明
    youyaboot 为开源项目，会持续不断的更新，在使用过程中遇到问题 欢迎联系作者 QQ 799374340

如果你熟练掌握oracle，你一定理解自增主键
oracle如何设置自增主键：以GOODS表为例
第一步：创建序列 每个表要单独创建一个
    create sequence SEQ_GOODS
    minvalue 1
    maxvalue 999999999
    start with 1
    increment by 1
    nocache;
说明：SEQ_GOODS是自定义的自增序列名称

第二步: 创建获取序列的函数 这个全局只要创建一次即可
    create or replace function GET_SEQ_V_A_L_ (seq_name in varchar2) return number
    is
      l_res number ;
      begin
        execute immediate 'select '|| seq_name|| '.nextval from dual' into l_res ;
        return l_res ;
      end ;
说明：GET_SEQ_V_A_L_ 获取序列的值 之所以取这么奇怪的名字 主要是最大化避免与您当前库里的函数冲突

  
-- 其他方法：不推荐使用创建触发器 性能稍有损耗 这里列举处理供参考
create or replace trigger TRI_GOODS_ID
  before insert on GOODS
  for each row
declare
  nextid number;
begin
  IF :new.ID IS NULL or :new.ID=0 THEN 
    select SEQ_GOODS.nextval
    into nextid
    from sys.dual;
    :new.ID:=nextid;
  end if;
end TRI_GOODS_ID;
说明：  TRI_GOODS_ID 触发器名称
        ID是GOODS列名
        SEQ_GOODS 是第一步的自增序列


无缝简单升级方法 
1 升级java 
    更新youyaboot最新包，把youyaboot-core覆盖您本地，前提是您未修改youyaboot-core已经存在的类
2  升级js html
    更新youyaboot最新包，把
     youyaboot-admin\src\main\resources\static\assets\magicalcoder\vxxx 
     youyaboot-admin\src\main\resources\templates\magicalcoder\vxxx
     覆盖您本地
3 升级模板
    magicalcoder软件包soft\vms\youyaboot_xxx会发布最新版本模板，更换至最新模板即可

当然如果您不希望进行任何升级 无需改动任何内容

版本更新记录：您可以根据记录来升级您当前的版本 查看版本在 /youyaboot_mysql/README.md 如果不想升级 请做好老版本vms下的模板备份
#v101 - 2019/1/15
## 1 支持excel导出功能 
## 2 重构js模块，之前版本限制太多，现在完全开放，更大程度满足扩展性
## 变更文件记录  您可以根据此文件来进行手动更新老版本 使用idea文件差异（Ctrl选中2文件夹 Ctrl+D）对比即可完成更新
        modified:   pom.xml
        modified:   youyaboot-core/pom.xml
        modified:   youyaboot-core/src/main/java/com/magicalcoder/youyaboot/core/common/dto/KeyValue.java
        modified:   youyaboot-core/src/main/java/com/magicalcoder/youyaboot/core/service/CommonRestController.java
        new file:   youyaboot-core/src/main/java/com/magicalcoder/youyaboot/core/utils/POIUtil.java
        new folder: youyaboot-admin/src/main/resources/templates/magicalcoder/v101/
        new folder: youyaboot-admin/src/main/resources/static/assets/magicalcoder/v101/

## 开发文档
    ##1 如何自定义新页面 并配置跳转规则
    我们拿goods_category表来讲解
    templates/goodscategory/goodscategory-edit.html
    templates/goodscategory/goodscategory-list.html
    注意goodscategory文件夹要小写
    
    URL规则/admin/page/{tableName}/{editOrList}
    跳转规则由 AdminRmpController.mapping来定制规则
        return {tableName}.replaceAll("_","") +"/"+ {tableName}.replaceAll("_","") +"-"+ {editOrList};
    示例：/admin/page/goods_category/list
    goods_category中的_会被替换成空 然后映射到对应文件夹 和对应是页面
