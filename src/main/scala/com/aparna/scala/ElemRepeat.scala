package com.aparna.scala

object ElemRepeat {
  def elemRepeat(mylist: List[Int], n: Int): List[Int] = {
      mylist flatMap { element => List.fill(n)(element) }
    }

def main(args:Array[String]):Unit={
  println("In Main func")
  val mylist: List[Int] = List(1, 2, 3, 4)
  println("n: ")
  var n = scala.io.StdIn.readInt()
  print(elemRepeat(mylist,n))
}
}
