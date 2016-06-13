package com.lifeibigdata.hello

/**
  * Created by lifei on 16/6/13.
  *
  * 1
  * 在Scala里面，可以允许有多个class，而且默认是public级别的
  * 2
  * var age = 0
    在scala里面，定义一个属性必须要手动赋值，不像在java里面，会默认赋值0
    这里，scala默认属性是private的，而且也会默认生成共有的setter、getter方法。
    但是如果属性被显示声明为private，那么默认会生成private的getter、setter
  *3
  * val age = 0
    对于val，scala会默认加上final，并且只生成getter方法，没有setter方法
  *4
  * private[this] var age = 0
    scala特有，对象私有属性，这种属性只有本对象可以访问，该类的其它对象不能访问。通过这种机制实现实例成员的隔离
  *
  */
class Person{
  private var age = 0
  def increment(){age += 1}
  def current = age
}
class Student{
  var age = 0     //默认私有字段
}
object HelloOOP {

  def main(args: Array[String]) {
    val p = new Person
    p.increment()
    p.increment()
    println(p.current)

    var s = new Student()
    s.age = 10      //age_函数
    println(s.age)  //此处age是函数,取出成员age的值
  }
}
