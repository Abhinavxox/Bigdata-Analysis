import scala.io.StdIn

object Factorial {
  def main(args: Array[String]): Unit = {
    println("Enter a number:")
    val number = StdIn.readInt()

    val factorial = calculateFactorial(number)
    println("Factorial: " + factorial)
  }

  def calculateFactorial(n: Int): Int = {
    if (n == 0 || n == 1)
      1
    else
      n * calculateFactorial(n - 1)
  }
}
