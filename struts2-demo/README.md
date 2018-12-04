# struts2-demo

IDEA Community Edition + Maven + Struts2 + Tomcat 实现一个简单的管理系统

1. Maven 生成一个 Web 模板
2. pom.xml 添加 `tomcat7-maven-plugin` plugin，配置路径及可用的端口
3. pom.xml 添加 `struts2-core` dependency，因为安全问题，版本推荐 [2.3.35,*)
4. WEB-INF/web.xml 配置 Struts2 过滤器: `org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter`
5. src/main/resources/struts.xml 添加 Struts2 相关配置及 Action 映射

项目目录满足但不全包含 Maven 搭建的基本项目目录，参考如下：

```
struts2-demo
|
|___ pom.xml
|
|___ src
     |
     |___ main
     |     |___ java
     |     |
     |     |___ resources
     |     |     |
     |     |     |___ struts.xml
     |     |
     |     |___ webapp
     |          |
     |          |___ WEB-INF
     |          |    |
     |          |    |___ web.xml
     |          |    |
     |          |    |___ lib
     |          |    |
     |          |    |___ classes
     |          |
     |          |___ xxx.jsp
     |___ test
          |
          |___ java
          |
          |___ resources

```