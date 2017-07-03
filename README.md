# ChainOfResponsibility-Pattern
## 责任链模式
### 项目类图
![项目类图](https://github.com/qiaojiuyuan/ChainOfResponsibility-Pattern/raw/master/project_class.png)
### 定义
```
使多个对象都有机会处理请求，从而避免了请求的发送者和接受者之间的耦合关系。将这些
对象连成一条链，并沿着这条链传递该请求，直到有对象处理它为止。
```
### 优点
* 将请求和处理分开，两者解耦，提高系统灵活性
### 缺点
* 性能问题，每个请求都是从链头到链尾，特别是链比较长的时候，性能是一个非常大的问题。
* 调试很不方便，特别是链长的时候
### 注意事项
* 避免出现超长链
