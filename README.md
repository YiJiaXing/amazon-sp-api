# amazon-sp-api
关于亚马逊销售伙伴api   SDK

这是根据亚马逊官方文档生成的SDK

官方文档 github 地址：https://github.com/amzn/selling-partner-api-docs

官方文档地址：https://developer-docs.amazon.com/sp-api/docs

在使用这个sdk之前我们必须做一些准备工作：

https://github.com/amzn/selling-partner-api-docs/blob/main/guides/zh-CN/developer-guide/SellingPartnerApiDeveloperGuide(%E4%B8%AD%E6%96%87).md#registering-your-selling-partner-api-application

在这个文档中中 

![image-20220218095432175](..\amazon-sp-api\xingapapi\image-20220218095432175.png)





以上都弄好了之后，就可以引入我们这个sdk了

**`mvn clean package`**

会在

target目录下生成一个jar包

xingapapi-1.0-SNAPSHOT-jar-with-dependencies.jar

将这个jar包引入到你的项目中即可