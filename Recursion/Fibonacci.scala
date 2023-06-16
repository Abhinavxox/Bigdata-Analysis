import scala.annotation.tailrec

object Fibonacci {
  // Tail-recursive Fibonacci calculation
  def fibonacciSeries(n: Int): List[Long] = {
    @tailrec
    def fibHelper(n: Int, a: Long, b: Long, acc: List[Long]): List[Long] = {
      if (n == 0) acc.reverse
      else fibHelper(n - 1, b, a + b, a :: acc)
    }

    fibHelper(n, 0, 1, List.empty[Long])
  }

  def main(args: Array[String]): Unit = {
    println("Enter the number of Fibonacci numbers to generate:")
    val n = scala.io.StdIn.readInt()

    val fibonacci = fibonacciSeries(n)
    println(s"The Fibonacci series up to $n numbers is:")
    fibonacci.foreach(println)
  }
}
