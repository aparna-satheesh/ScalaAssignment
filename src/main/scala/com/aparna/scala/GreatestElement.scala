package com.aparna.scala

object GreatestElement {
  def greatestElement(arr:Array[Int]): Array[Int] = {
    val size = arr.length;
    var max_from_right_num = arr(size - 1);
    arr(size - 1) = -1;
    var temp = 0
    for (i <- size - 2 to 0 by -1) {
      temp = arr(i);
      arr(i) = max_from_right_num;
      if (max_from_right_num < temp)
        max_from_right_num = temp;
    }
    arr;
  }
  def main(args: Array[String]): Unit = {
    val nums = Array(9, 5, 8, 4, -10, 21, 6, 17, 11)
    println("Original array:");
    for (x <- nums) {
      print(s"${x}, ")    }
    val result = greatestElement(nums);
    println("\nThe modified array:");
    for (x <- result) {
      print(s"${x}, ")
    }
  }
}
