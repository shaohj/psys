## 模块
``` 
psys
├── psys-ui -- 前端工程[8080]
├── psys-auth -- 授权服务提供[18083]
├── psys-common -- 系统公共模块 
├    ├── psys-common-bom -- 公共依赖版本
├    ├── psys-common-core -- 公共工具类核心包
├    ├── psys-common-data -- 数据相关
├    ├── psys-common-log -- 日志服务
├    └── psys-common-security -- 安全工具类
├    └── psys-common-swagger -- Swagger Api文档生成
├── psys-config -- 配置中心[18081]
├── psys-eureka -- 服务注册与发现[18080]
├── psys-gateway -- Spring Cloud Gateway网关[18082]
├── psys-upms -- 通用用户权限管理模块
├    └── psys-upms-api -- 通用用户权限管理系统公共api模块
├    └── psys-upms-biz -- 通用用户权限管理系统业务处理模块[18084]
└── psys-visual  -- 图形化模块 
├    ├── psys-monitor -- Spring Boot Admin监控 [18085]
	 
```
