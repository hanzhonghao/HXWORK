
# FLU_MJZ_REPORT_FOR_JAVA FLU_MJZ_REPORT_FOR_JAVA模块 API
## 1.1 查询FLU_MJZ_REPORT_FOR_JAVA详情

> **描述**：根据ID查询FLU_MJZ_REPORT_FOR_JAVA详情。

> **url**：/admin/FLU_MJZ_REPORT_FOR_JAVA_rest/get/{id}
>
> **method**：GET

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1    | id       | Long     | ID，必填 |

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |
| 4        | data          | object   | FLU_MJZ_REPORT_FOR_JAVA详情对象            |
|          |               |          |                         |
| 字段解释 |               |          |                         |
| 1 | id              | Long          | id |
| 2 | p900              | String          | p900 |
| 3 | p6891              | String          | p6891 |
| 4 | p686              | String          | p686 |
| 5 | p800              | String          | p800 |
| 6 | p7501              | String          | p7501 |
| 7 | p7502              | String          | p7502 |
| 8 | p4              | String          | p4 |
| 9 | p5              | String          | P5 |
| 10 | p6              | String          | P6 |
| 11 | p7              | String          | P7 |
| 12 | p7503              | String          | P7503 |
| 13 | p13              | String          | p13 |
| 14 | p7504              | String          | p7504 |
| 15 | p7505              | String          | p7505 |
| 16 | p7506              | String          | p7506 |
| 17 | p7507              | String          | p7507 |
| 18 | p321              | String          | p321 |
| 19 | p322              | String          | p322 |
| 20 | p324              | String          | p324 |
| 21 | p325              | String          | p325 |
| 22 | p327              | String          | p327 |
| 23 | p328              | String          | p328 |
| 24 | p3291              | String          | p3291 |
| 25 | p3292              | String          | p3292 |
| 26 | p3294              | String          | p3294 |
| 27 | p3295              | String          | p3295 |
| 28 | p3297              | String          | p3297 |
| 29 | p3298              | String          | p3298 |
| 30 | p3281              | String          | p3281 |
| 31 | p3282              | String          | p3282 |
| 32 | p3284              | String          | p3284 |
| 33 | p3285              | String          | p3285 |
| 34 | p3287              | String          | p3287 |
| 35 | p3288              | String          | p3288 |
| 36 | p3271              | String          | p3271 |
| 37 | p3272              | String          | p3272 |
| 38 | p3274              | String          | p3274 |
| 39 | p3275              | String          | p3275 |
| 40 | p6911              | String          | P6911 |
| 41 | p6912              | String          | P6912 |
| 42 | p6913              | String          | P6913 |
| 43 | p6914              | String          | P6914 |
| 44 | p6915              | String          | P6915 |
| 45 | p6916              | String          | P6916 |
| 46 | p6917              | String          | P6917 |
| 47 | p6918              | String          | P6918 |
| 48 | p6919              | String          | P6919 |
| 49 | p6920              | String          | P6920 |
| 50 | p6921              | String          | P6921 |
| 51 | p6922              | String          | P6922 |
| 52 | p6923              | String          | P6923 |
| 53 | p6924              | String          | P6924 |
| 54 | p6925              | String          | P6925 |
| 55 | p1              | String          | P1 |
| 56 | p7508              | String          | p7508 |
| 57 | p7509              | String          | p7509 |
| 58 | p7510              | String          | p7510 |
| 59 | p7511              | String          | p7511 |
| 60 | p7512              | String          | p7512 |
| 61 | p8508              | String          | p8508 |
| 62 | p8509              | String          | p8509 |

## 1.2 保存FLU_MJZ_REPORT_FOR_JAVA详情

> **描述**：保存FLU_MJZ_REPORT_FOR_JAVA详情。

> **url**：/admin/FLU_MJZ_REPORT_FOR_JAVA_rest/save
>
> **method**：POST

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1| id  | Long  | id |
| 2| p900  | String  | p900 |
| 3| p6891  | String  | p6891 |
| 4| p686  | String  | p686 |
| 5| p800  | String  | p800 |
| 6| p7501  | String  | p7501 |
| 7| p7502  | String  | p7502 |
| 8| p4  | String  | p4 |
| 9| p5  | String  | P5 |
| 10| p6  | String  | P6 |
| 11| p7  | String  | P7 |
| 12| p7503  | String  | P7503 |
| 13| p13  | String  | p13 |
| 14| p7504  | String  | p7504 |
| 15| p7505  | String  | p7505 |
| 16| p7506  | String  | p7506 |
| 17| p7507  | String  | p7507 |
| 18| p321  | String  | p321 |
| 19| p322  | String  | p322 |
| 20| p324  | String  | p324 |
| 21| p325  | String  | p325 |
| 22| p327  | String  | p327 |
| 23| p328  | String  | p328 |
| 24| p3291  | String  | p3291 |
| 25| p3292  | String  | p3292 |
| 26| p3294  | String  | p3294 |
| 27| p3295  | String  | p3295 |
| 28| p3297  | String  | p3297 |
| 29| p3298  | String  | p3298 |
| 30| p3281  | String  | p3281 |
| 31| p3282  | String  | p3282 |
| 32| p3284  | String  | p3284 |
| 33| p3285  | String  | p3285 |
| 34| p3287  | String  | p3287 |
| 35| p3288  | String  | p3288 |
| 36| p3271  | String  | p3271 |
| 37| p3272  | String  | p3272 |
| 38| p3274  | String  | p3274 |
| 39| p3275  | String  | p3275 |
| 40| p6911  | String  | P6911 |
| 41| p6912  | String  | P6912 |
| 42| p6913  | String  | P6913 |
| 43| p6914  | String  | P6914 |
| 44| p6915  | String  | P6915 |
| 45| p6916  | String  | P6916 |
| 46| p6917  | String  | P6917 |
| 47| p6918  | String  | P6918 |
| 48| p6919  | String  | P6919 |
| 49| p6920  | String  | P6920 |
| 50| p6921  | String  | P6921 |
| 51| p6922  | String  | P6922 |
| 52| p6923  | String  | P6923 |
| 53| p6924  | String  | P6924 |
| 54| p6925  | String  | P6925 |
| 55| p1  | String  | P1 |
| 56| p7508  | String  | p7508 |
| 57| p7509  | String  | p7509 |
| 58| p7510  | String  | p7510 |
| 59| p7511  | String  | p7511 |
| 60| p7512  | String  | p7512 |
| 61| p8508  | String  | p8508 |
| 62| p8509  | String  | p8509 |

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |

## 1.3 更新FLU_MJZ_REPORT_FOR_JAVA详情

> **描述**：根据ID更新FLU_MJZ_REPORT_FOR_JAVA的任意属性值，确保要更新的参数不能为null。

> **url**：/admin/FLU_MJZ_REPORT_FOR_JAVA_rest/update/{id}
>
> **method**：POST

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1| id  | Long  | id |
| 2| p900  | String  | p900 |
| 3| p6891  | String  | p6891 |
| 4| p686  | String  | p686 |
| 5| p800  | String  | p800 |
| 6| p7501  | String  | p7501 |
| 7| p7502  | String  | p7502 |
| 8| p4  | String  | p4 |
| 9| p5  | String  | P5 |
| 10| p6  | String  | P6 |
| 11| p7  | String  | P7 |
| 12| p7503  | String  | P7503 |
| 13| p13  | String  | p13 |
| 14| p7504  | String  | p7504 |
| 15| p7505  | String  | p7505 |
| 16| p7506  | String  | p7506 |
| 17| p7507  | String  | p7507 |
| 18| p321  | String  | p321 |
| 19| p322  | String  | p322 |
| 20| p324  | String  | p324 |
| 21| p325  | String  | p325 |
| 22| p327  | String  | p327 |
| 23| p328  | String  | p328 |
| 24| p3291  | String  | p3291 |
| 25| p3292  | String  | p3292 |
| 26| p3294  | String  | p3294 |
| 27| p3295  | String  | p3295 |
| 28| p3297  | String  | p3297 |
| 29| p3298  | String  | p3298 |
| 30| p3281  | String  | p3281 |
| 31| p3282  | String  | p3282 |
| 32| p3284  | String  | p3284 |
| 33| p3285  | String  | p3285 |
| 34| p3287  | String  | p3287 |
| 35| p3288  | String  | p3288 |
| 36| p3271  | String  | p3271 |
| 37| p3272  | String  | p3272 |
| 38| p3274  | String  | p3274 |
| 39| p3275  | String  | p3275 |
| 40| p6911  | String  | P6911 |
| 41| p6912  | String  | P6912 |
| 42| p6913  | String  | P6913 |
| 43| p6914  | String  | P6914 |
| 44| p6915  | String  | P6915 |
| 45| p6916  | String  | P6916 |
| 46| p6917  | String  | P6917 |
| 47| p6918  | String  | P6918 |
| 48| p6919  | String  | P6919 |
| 49| p6920  | String  | P6920 |
| 50| p6921  | String  | P6921 |
| 51| p6922  | String  | P6922 |
| 52| p6923  | String  | P6923 |
| 53| p6924  | String  | P6924 |
| 54| p6925  | String  | P6925 |
| 55| p1  | String  | P1 |
| 56| p7508  | String  | p7508 |
| 57| p7509  | String  | p7509 |
| 58| p7510  | String  | p7510 |
| 59| p7511  | String  | p7511 |
| 60| p7512  | String  | p7512 |
| 61| p8508  | String  | p8508 |
| 62| p8509  | String  | p8509 |

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |

## 1.4 删除一条FLU_MJZ_REPORT_FOR_JAVA记录

> **描述**：根据ID删除一条FLU_MJZ_REPORT_FOR_JAVA记录。

> **url**：/admin/FLU_MJZ_REPORT_FOR_JAVA_rest/delete/{id}
>
> **method**：POST

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1    | id       | Long     | ID，必填 |

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |


## 1.5 批量删除多条FLU_MJZ_REPORT_FOR_JAVA记录

> **描述**：根据多个ID删除多条FLU_MJZ_REPORT_FOR_JAVA记录。

> **url**：/admin/FLU_MJZ_REPORT_FOR_JAVA_rest/batch_delete
>
> **method**：POST

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1    | ids[]       | Long     | ID，必填 |
| 2    | ids[]       | Long     | ID，必填 |
| ...    | ids[]       | Long     | ID，必填 |
| n    | ids[]       | Long     | ID，必填 |

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |


## 1.6 分页查询FLU_MJZ_REPORT_FOR_JAVA

> **描述**：分页查询FLU_MJZ_REPORT_FOR_JAVA。

> **url**：/admin/FLU_MJZ_REPORT_FOR_JAVA_rest/page
>
> **method**：GET

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1    |page      |int       |第几页 [1,n)   |
| 2    |limit      |int       |每页多少条 [0,100)   |
| 3    |safeOrderBy      |int       | 排序 例如 数据库字段名称 desc或asc   |
                |4|idFirst|   Long   |id|
                |5|p7502First|   String   |p7502|

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |
| 4        | data          | array   | FLU_MJZ_REPORT_FOR_JAVA详情数组对象            |
|          |               |          |                         |
| 字段解释 |               |          |                         |
| 1 | id              | Long          | id |
| 2 | p900              | String          | p900 |
| 3 | p6891              | String          | p6891 |
| 4 | p686              | String          | p686 |
| 5 | p800              | String          | p800 |
| 6 | p7501              | String          | p7501 |
| 7 | p7502              | String          | p7502 |
| 8 | p4              | String          | p4 |
| 9 | p5              | String          | P5 |
| 10 | p6              | String          | P6 |
| 11 | p7              | String          | P7 |
| 12 | p7503              | String          | P7503 |
| 13 | p13              | String          | p13 |
| 14 | p7504              | String          | p7504 |
| 15 | p7505              | String          | p7505 |
| 16 | p7506              | String          | p7506 |
| 17 | p7507              | String          | p7507 |
| 18 | p321              | String          | p321 |
| 19 | p322              | String          | p322 |
| 20 | p324              | String          | p324 |
| 21 | p325              | String          | p325 |
| 22 | p327              | String          | p327 |
| 23 | p328              | String          | p328 |
| 24 | p3291              | String          | p3291 |
| 25 | p3292              | String          | p3292 |
| 26 | p3294              | String          | p3294 |
| 27 | p3295              | String          | p3295 |
| 28 | p3297              | String          | p3297 |
| 29 | p3298              | String          | p3298 |
| 30 | p3281              | String          | p3281 |
| 31 | p3282              | String          | p3282 |
| 32 | p3284              | String          | p3284 |
| 33 | p3285              | String          | p3285 |
| 34 | p3287              | String          | p3287 |
| 35 | p3288              | String          | p3288 |
| 36 | p3271              | String          | p3271 |
| 37 | p3272              | String          | p3272 |
| 38 | p3274              | String          | p3274 |
| 39 | p3275              | String          | p3275 |
| 40 | p6911              | String          | P6911 |
| 41 | p6912              | String          | P6912 |
| 42 | p6913              | String          | P6913 |
| 43 | p6914              | String          | P6914 |
| 44 | p6915              | String          | P6915 |
| 45 | p6916              | String          | P6916 |
| 46 | p6917              | String          | P6917 |
| 47 | p6918              | String          | P6918 |
| 48 | p6919              | String          | P6919 |
| 49 | p6920              | String          | P6920 |
| 50 | p6921              | String          | P6921 |
| 51 | p6922              | String          | P6922 |
| 52 | p6923              | String          | P6923 |
| 53 | p6924              | String          | P6924 |
| 54 | p6925              | String          | P6925 |
| 55 | p1              | String          | P1 |
| 56 | p7508              | String          | p7508 |
| 57 | p7509              | String          | p7509 |
| 58 | p7510              | String          | p7510 |
| 59 | p7511              | String          | p7511 |
| 60 | p7512              | String          | p7512 |
| 61 | p8508              | String          | p8508 |
| 62 | p8509              | String          | p8509 |
