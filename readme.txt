dagger2

三个东西

1, Module 类(我理解是对象工厂，生产对象的地方)


2, Component 接口(管理module 与 对象引用类关联,将使用者对象传给它)


3, 使用者(Activity), 需要注入一个对象(Inject)Cloth, 通过component组件来帮我生成


至于如何生成引用对象实例，首先从module中找方法(由返回值类型来确定)，

然后在类中找构造函数是否有inject