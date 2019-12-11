
# GOODS GOODS模块 API
## 1.1 查询GOODS详情

> **描述**：根据ID查询GOODS详情。

> **url**：/admin/GOODS_rest/get/{id}
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
| 4        | data          | object   | GOODS详情对象            |
|          |               |          |                         |
| 字段解释 |               |          |                         |
| 1 | id              | Long          | ID |
| 2 | goodsName              | String          | 商品名称 |
| 3 | publishStatus              | Boolean          | 发布状态 |
| 4 | goodsStatus              | Byte          | 商品状态 |
| 5 | price              | BigDecimal          | 价格 |
| 6 | storeCount              | Short          | 库存 |
| 7 | shortBrief              | String          | 简介 |
| 8 | goodsDescription              | String          | 描述 |
| 9 | createTime              | Timestamp          | 创建时间 |
| 10 | updateTime              | Timestamp          | 更新时间 |
| 11 | imgSrc              | String          | 图片 |
| 12 | goodsCategoryId              | Long          | 所属分类 |

## 1.2 保存GOODS详情

> **描述**：保存GOODS详情。

> **url**：/admin/GOODS_rest/save
>
> **method**：POST

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1| id  | Long  | ID |
| 2| goodsName  | String  | 商品名称 |
| 3| publishStatus  | Boolean  | 发布状态 |
| 4| goodsStatus  | Byte  | 商品状态 |
| 5| price  | BigDecimal  | 价格 |
| 6| storeCount  | Short  | 库存 |
| 7| shortBrief  | String  | 简介 |
| 8| goodsDescription  | String  | 描述 |
| 9| createTime  | Timestamp  | 创建时间 |
| 10| updateTime  | Timestamp  | 更新时间 |
| 11| imgSrc  | String  | 图片 |
| 12| goodsCategoryId  | Long  | 所属分类 |

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |

## 1.3 更新GOODS详情

> **描述**：根据ID更新GOODS的任意属性值，确保要更新的参数不能为null。

> **url**：/admin/GOODS_rest/update/{id}
>
> **method**：POST

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1| id  | Long  | ID |
| 2| goodsName  | String  | 商品名称 |
| 3| publishStatus  | Boolean  | 发布状态 |
| 4| goodsStatus  | Byte  | 商品状态 |
| 5| price  | BigDecimal  | 价格 |
| 6| storeCount  | Short  | 库存 |
| 7| shortBrief  | String  | 简介 |
| 8| goodsDescription  | String  | 描述 |
| 9| createTime  | Timestamp  | 创建时间 |
| 10| updateTime  | Timestamp  | 更新时间 |
| 11| imgSrc  | String  | 图片 |
| 12| goodsCategoryId  | Long  | 所属分类 |

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |

## 1.4 删除一条GOODS记录

> **描述**：根据ID删除一条GOODS记录。

> **url**：/admin/GOODS_rest/delete/{id}
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


## 1.5 批量删除多条GOODS记录

> **描述**：根据多个ID删除多条GOODS记录。

> **url**：/admin/GOODS_rest/batch_delete
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


## 1.6 分页查询GOODS

> **描述**：分页查询GOODS。

> **url**：/admin/GOODS_rest/page
>
> **method**：GET

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1    |page      |int       |第几页 [1,n)   |
| 2    |limit      |int       |每页多少条 [0,100)   |
| 3    |safeOrderBy      |int       | 排序 例如 数据库字段名称 desc或asc   |
                |4|idFirst|   Long   |ID|

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |
| 4        | data          | array   | GOODS详情数组对象            |
|          |               |          |                         |
| 字段解释 |               |          |                         |
| 1 | id              | Long          | ID |
| 2 | goodsName              | String          | 商品名称 |
| 3 | publishStatus              | Boolean          | 发布状态 |
| 4 | goodsStatus              | Byte          | 商品状态 |
| 5 | price              | BigDecimal          | 价格 |
| 6 | storeCount              | Short          | 库存 |
| 7 | shortBrief              | String          | 简介 |
| 8 | goodsDescription              | String          | 描述 |
| 9 | createTime              | Timestamp          | 创建时间 |
| 10 | updateTime              | Timestamp          | 更新时间 |
| 11 | imgSrc              | String          | 图片 |
| 12 | goodsCategoryId              | Long          | 所属分类 |
