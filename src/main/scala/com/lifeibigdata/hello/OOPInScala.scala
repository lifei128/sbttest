package com.lifeibigdata.hello

/**
  * Created by lifei on 16/6/13.
  *
  * 必须有一个主主构造器
  *
  * scala内部类从属于对象,java的内部类从属于对象
  */
//class Teacher {
//  var name : String = _ //占位符
//  private var age = 27 // 默认生成私有的setter、getter,如果没有private会生成公有的getter,setter
//  private[this] val gender = "male"
//
//  //重载构造器
//  def this(name : String){
//    this //主构造器
//    this.name = name
//  }
//  //重载构造器必须调用主构造器
//
//  def sayHello(){
//    println(this.name + ":" + this.age + ":" + this.gender);
//  }
//}

object OOPInScala{
  def main(args: Array[String]) {
//    val s = new Teacher("tom",12) //如果主构造器有private,此处会报错
//    println(s.age)
    val s3 = new Teacher("tom",12,"male")
    println(s3.gender)
//    s.name = "tom"
//    s.sayHello()

    println("第一种访问方式：")
    val outer1 = new OuterClass("yy")
    val inner1 = new outer1.InnerClass("xx")
    inner1.info
    println("第二种访问方式：")
    val outer2 = new OuterClass2("yy2")
    val inner2 = new outer2.InnerClass2("xx2")
    inner2.info
  }

}


//构造器具有参数，这些参数会成为属性
class

Teacher private (val name : String, val age : Int){//private修饰后，主构造器将不能被调用
  println("This is the primary constructor!!!")
  var gender : String = _
  println(gender)

  //构造时，除了方法，其他都会被实例化，所以以上步骤会执行
  def this(name : String, age : Int, gender : String){
    this(name, age)   //主构造器,不能删除
    this.gender = gender
  }
}

/**
  * 第一种方式
  * 在内部类通过【外部类.this.成员名称】 访问外部类成员
  */
class OuterClass(val name:String){

  class InnerClass(val name:String){

    def info = println("Outer name :" + OuterClass.this.name + ",Inner Name :" + name);
  }
}

/**
  * 第二种方式
  * 在内部类通过【外部类别名】 访问外部类成员
  *
  */
class OuterClass2(val name:String){
  outer =>
  class InnerClass2(val name:String){

    def info = println("Outer name :" + outer.name + ",Inner Name :" + name);
  }
}

