import scala.io.StdIn

object BubbleSort {
  
  def bubbleSort(arr: Array[Int]): Array[Int] = {
    val n = arr.length
    
    for (i <- 0 until n - 1) {
      for (j <- 0 until n - i - 1) {
        if (arr(j) > arr(j + 1)) {
          val temp = arr(j)
          arr(j) = arr(j + 1)
          arr(j + 1) = temp
        }
      }
    }
    
    arr
  }
  
  def main(args: Array[String]): Unit = {
    println("Enter the number of elements:")
    val n = StdIn.readInt()
    
    println("Enter the elements:")
    val arr = new Array[Int](n)
    for (i <- 0 until n) {
      arr(i) = StdIn.readInt()
    }
    
    println("Original Array:")
    arr.foreach(println)
    
    val sortedArr = bubbleSort(arr)
    
    println("Sorted Array:")
    sortedArr.foreach(println)
  }
}