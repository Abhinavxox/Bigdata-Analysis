import scala.annotation.tailrec

object QuickSort {
  // Tail-recursive QuickSort implementation
  def quickSort(arr: Array[Int]): Array[Int] = {
    @tailrec
    def sortHelper(stack: List[(Int, Int)]): Array[Int] = {
      if (stack.isEmpty) arr
      else {
        val (low, high) = stack.head
        val pivotIndex = partition(low, high)
        val newStack = if (pivotIndex - 1 > low) (low, pivotIndex - 1) :: stack.tail else stack.tail
        if (pivotIndex + 1 < high) sortHelper((pivotIndex + 1, high) :: newStack) else sortHelper(newStack)
      }
    }

    def partition(low: Int, high: Int): Int = {
      val pivot = arr(high)
      var i = low - 1
      for (j <- low until high) {
        if (arr(j) <= pivot) {
          i += 1
          val temp = arr(i)
          arr(i) = arr(j)
          arr(j) = temp
        }
      }
      val temp = arr(i + 1)
      arr(i + 1) = arr(high)
      arr(high) = temp
      i + 1
    }

    val stack = List((0, arr.length - 1))
    sortHelper(stack)
  }

  def main(args: Array[String]): Unit = {
    println("Enter the elements of the array, separated by spaces:")
    val input = scala.io.StdIn.readLine()
    val arr = input.split(" ").map(_.toInt)
    val sortedArray = quickSort(arr)

    println("Sorted array:")
    sortedArray.foreach(println)
  }
}
