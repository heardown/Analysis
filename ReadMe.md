

## crash-report
### use guide
+ 引入方式
    > 1. 先在根项目build.gradle文件中添加仓库 `` maven { url  "http://maven.sayweee.net:8081/repository/maven-releases/" } ``
    > 2. 在使用的module中添加依赖 implementation 'com.sayweee.libs:crash-report:0.0.1'   0.0.1是指版本，建议用最新版本
    > 3. 在清单文件中注册mateData，暂时仅支持bugly，key为report_key_bugly，value为申请的bugly的appId
+ 使用方式
    > 引入成功后即自动启用


## track
### use guide
+ 引入方式
    > 1. 先在根项目build.gradle文件中添加仓库 `` maven { url  "http://maven.sayweee.net:8081/repository/maven-releases/" } ``
    > 2. 在使用的module中添加依赖 `` implementation 'com.sayweee.libs:track:0.0.1' ``  0.0.1是指版本，建议用最新版本
+ 使用方式      
    > 1. 在Application中初始化TrackManager，设置要启用的平台及初始化参数，根据需要设置拦截
    > 2. 如需按照平台转换对应平台标准事件，请使用TrackEvent中对应的事件
    > 3. 如是自定义事件，请注意去重，避免污染标准事件
    > 4. 部分平台可能未提供某些特定的API，若未生效可查看日志具体方法调用输出
        
+ 实现        
    > TrackConfig -> TrackManager - > TrackManagerIml   设置参数，构建实例       
    > IPlatform -> xxxPlatform      对应的平台
    > IConverter -> xxxConverter    转换器，用于事件名称和具体参数的转换      
    > Interceptor -> DefaultInterceptor     拦截器，拦截事件，若不处理需主动回掉事件，默认拦截器用于默认事件和转剧的执行      
    > InterceptorService -> InterceptorServiceIml   分发事件用于拦截器处理     
