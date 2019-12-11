
# FLU_MZDATA FLU_MZDATA模块 API
## 1.1 查询FLU_MZDATA详情

> **描述**：根据ADMID查询FLU_MZDATA详情。

> **url**：/admin/FLU_MZDATA_rest/get/{admid}
>
> **method**：GET

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1    | id       | String     | ADMID，必填 |

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |
| 4        | data          | object   | FLU_MZDATA详情对象            |
|          |               |          |                         |
| 字段解释 |               |          |                         |
| 1 | admid              | String          | ADMID |
| 2 | patype              | String          | PATYPE |
| 3 | patdept              | String          | PATDEPT |
| 4 | patientname              | String          | PATIENTNAME |
| 5 | sex              | String          | SEX |
| 6 | papmino              | String          | PAPMINO |
| 7 | birthdate              | String          | BIRTHDATE |
| 8 | age              | String          | AGE |
| 9 | iszd              | String          | ISZD |
| 10 | patidno              | String          | PATIDNO |
| 11 | admdat              | String          | ADMDAT |
| 12 | patzs              | String          | PATZS |

## 1.2 保存FLU_MZDATA详情

> **描述**：保存FLU_MZDATA详情。

> **url**：/admin/FLU_MZDATA_rest/save
>
> **method**：POST

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1| admid  | String  | ADMID |
| 2| patype  | String  | PATYPE |
| 3| patdept  | String  | PATDEPT |
| 4| patientname  | String  | PATIENTNAME |
| 5| sex  | String  | SEX |
| 6| papmino  | String  | PAPMINO |
| 7| birthdate  | String  | BIRTHDATE |
| 8| age  | String  | AGE |
| 9| iszd  | String  | ISZD |
| 10| patidno  | String  | PATIDNO |
| 11| admdat  | String  | ADMDAT |
| 12| patzs  | String  | PATZS |

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |

## 1.3 更新FLU_MZDATA详情

> **描述**：根据ADMID更新FLU_MZDATA的任意属性值，确保要更新的参数不能为null。

> **url**：/admin/FLU_MZDATA_rest/update/{admid}
>
> **method**：POST

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1| admid  | String  | ADMID |
| 2| patype  | String  | PATYPE |
| 3| patdept  | String  | PATDEPT |
| 4| patientname  | String  | PATIENTNAME |
| 5| sex  | String  | SEX |
| 6| papmino  | String  | PAPMINO |
| 7| birthdate  | String  | BIRTHDATE |
| 8| age  | String  | AGE |
| 9| iszd  | String  | ISZD |
| 10| patidno  | String  | PATIDNO |
| 11| admdat  | String  | ADMDAT |
| 12| patzs  | String  | PATZS |

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |

## 1.4 删除一条FLU_MZDATA记录

> **描述**：根据ADMID删除一条FLU_MZDATA记录。

> **url**：/admin/FLU_MZDATA_rest/delete/{admid}
>
> **method**：POST

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1    | id       | String     | ADMID，必填 |

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |


## 1.5 批量删除多条FLU_MZDATA记录

> **描述**：根据多个ADMID删除多条FLU_MZDATA记录。

> **url**：/admin/FLU_MZDATA_rest/batch_delete
>
> **method**：POST

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1    | ids[]       | String     | ADMID，必填 |
| 2    | ids[]       | String     | ADMID，必填 |
| ...    | ids[]       | String     | ADMID，必填 |
| n    | ids[]       | String     | ADMID，必填 |

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |


## 1.6 分页查询FLU_MZDATA

> **描述**：分页查询FLU_MZDATA。

> **url**：/admin/FLU_MZDATA_rest/page
>
> **method**：GET

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1    |page      |int       |第几页 [1,n)   |
| 2    |limit      |int       |每页多少条 [0,100)   |
| 3    |safeOrderBy      |int       | 排序 例如 数据库字段名称 desc或asc   |
                |4|admidFirst|   String   |ADMID|

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |
| 4        | data          | array   | FLU_MZDATA详情数组对象            |
|          |               |          |                         |
| 字段解释 |               |          |                         |
| 1 | admid              | String          | ADMID |
| 2 | patype              | String          | PATYPE |
| 3 | patdept              | String          | PATDEPT |
| 4 | patientname              | String          | PATIENTNAME |
| 5 | sex              | String          | SEX |
| 6 | papmino              | String          | PAPMINO |
| 7 | birthdate              | String          | BIRTHDATE |
| 8 | age              | String          | AGE |
| 9 | iszd              | String          | ISZD |
| 10 | patidno              | String          | PATIDNO |
| 11 | admdat              | String          | ADMDAT |
| 12 | patzs              | String          | PATZS |
