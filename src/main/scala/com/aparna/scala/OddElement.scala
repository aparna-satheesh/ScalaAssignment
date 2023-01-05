package com.aparna.scala

object OddElement{
    def oddElement(nums:List[Int]): List[Int] = {
      //As scala List is immutable, so we can’t delete elements from it, but
      //filter out element(s) as per requirement.
      var count :Int =0
      //println("Modified List :")
      //print(nums.zipWithIndex.collect {case (x, i) if i % 2 != 0 => x })
      return((nums.zipWithIndex.collect {case (x, i) if i % 2 != 0 => x }))
      //(nums.zipWithIndex.collect {case (x, i) if i % 2 != 0 => x }).size
    }
    def main(args: Array[String]): Unit = {
      val nums = List(1, 3, 5, 7, 9, 11, 14, 12)
      println("Original list:")
      println(nums)
      val nsize = nums.size
      val new_size :List[Int] = oddElement(nums)
      //println("Size of original :"+ nsize)
      //println("Size of filtered list :"+ new_size)
    }
}
