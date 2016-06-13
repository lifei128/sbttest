package com.lifeibigdata.hello

import java.io.File

import scala.collection.mutable.ArrayBuffer
import scala.io.Source
import scala.util.Sorting

/**
  * Created by lifei on 16/6/8.
  */
object HelloScala {

  //入口函数   参数名 : 数组[类型] : 返回值 unit(可以省略)
  def main(args: Array[String]) {//函数体
//    println("hello world ...")   //没必须写分号
    //通过程序program argument传参
//    for (arg <- args) println(arg)

//    doWhile   //没有参数一般不加括号

//    println(looper(100,298))

//      val file = if(!args.isEmpty) args(0) else "Spark.xml"  //三元表达式
//      println(file)
//      println(if(!args.isEmpty) args(0) else "Spark.xml")

//    for(i <- 1 to 10) println(i)
//    for(i <- 1.to(10)) println(i) //scala一切皆对象

//    val files = (new File(".")).listFiles()
//    for(file <- files) println(file)

    //
//    try catch finally case

//    val n = 99
//    try{
//      val half = if(n%2 == 0) n/2 else throw new RuntimeException("N must be event")
//    } catch {
//      case e : Exception => println("The exception is :"+e.getMessage)
//    } finally {
//      println("done ...")
//    }

//    val pair = (100,"scala","spark")
//    println(pair._1)
//    println(pair._2)
//    println(pair._3)

//    val array = Array(1,2,3,4,5)
//    for (i <- 0 until array.length) println(array(i))  //中括号 until
//    for(elem : array) println(elem)

//    val ages = Map("Rocky" -> 10,"Tom" -> 20)
//    for ((k,v) <- ages) println("key is "+k+",value is "+v)
//    for ((k,_) <- ages) println("key is "+k)   //占位符

//    val file = Source.fromFile("/Users/lifei/githubproject/sbttest/build.sbt")//也可以指定网址
//    for(line <- file.getLines) println(line)

//    for(i <- 1 to 2; j <- 1 to 2) print(i*100+2+"   ")
//    println()

//    for(i <- 1 to 2; j <- 1 to 2;if i != j) print(i*100+j+"   ")
//    println()

//    def addA(x : Int) = x+ 100;  //返回值可以推断,不用谢返回值,递归除外
//    val add = (x : Int) => x+100;  //在scala更加通用,匿名函数,函数是有值得

//    def fac(x : Int):Int = if(x <= 0) 1 else x * fac(x - 1) //递归除外

//    def combine(x : String,left : String = "[",right :String = "]")= left+x+right//默认值
//
//    def sum(x : Int*)={//可变参数
//      var rst = 0
//      for(arg <- x) rst += arg
//      rst
//
//    }

    //延迟执行
//    lazy val file = Source.fromFile("/Users/lifei/githubproject/sbttest/build.sbt")//也可以指定网址
//    println("scala")

//    val nums = new Array[Int](10)
//    val b = ArrayBuffer()

//    val c = Array(1,2,3,4)
//    val rst1 = for(elem <- c) yield elem*2
//    val rst2 = for(elem <- c if elem %2==0) yield elem*2
//    c.filter(_%2 == 0).map(2 * _)  //更为常用,每次循环一个元素可以用占位符


//    Array(4,5,6).sum
//    ArrayBuffer(1,2,3,4).max
//    val b = ArrayBuffer(1,3,4,5)
//    b.sorted
//    Sorting.quickSort(c)
//    c.mkString("and")
//    c.mkString("< ",",",">")

//    val m = Array.ofDim[Double](3,4)//矩阵


    //zip

  }

  def looper(x: Long, y: Long): Long = {
    var a = x
    var b = y
    while (a != 0) {
      val temp = a
      a = b % a
      b = temp
    }
    b
  }

  def doWhile(): Unit = {
    var line = ""
    do {
      line = readLine()
      println("Read:"+line)
    } while (line != "")
  }

}
