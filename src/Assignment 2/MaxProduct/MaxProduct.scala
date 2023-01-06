package com.aparna.scala

object MaxProduct {
  def maxProduct(nums: Array[Int]): Int = {
    var max_pair_product = Integer.MIN_VALUE;
    var max_i = -1
    var max_j = -1
    for (i <- 0 to nums.length - 1) {
      for (j <- i + 1 to nums.length - 1) {
        if (max_pair_product < nums(i) * nums(j)) {
          max_pair_product = nums(i) * nums(j)
          max_i = i
          max_j = j
        }
      }
    }
    println(s"\nPair :(${nums(max_i)} , ${nums(max_j)}), \nMaximum Product:  ${(nums(max_i) * nums(max_j))}");
    return nums(max_i)*nums(max_j)
  }
  def main(args:Array[String]):Unit={
    val nums = Array(2, 3, 5, 7, -7, -5);
    println("Original array:")
    for (x <- nums) {
      print(s"${x}, ")
    }
    val result = maxProduct(nums)
  }

}
