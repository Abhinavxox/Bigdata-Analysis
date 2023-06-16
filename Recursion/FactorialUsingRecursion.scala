import scala.io.StdIn

object FactorialCalculator {
  // Recursive factorial
  def factorialRecursive(n: Int): Int = {
    if (n <= 1) 1
    else n * factorialRecursive(n - 1)
  }

  // Tail-recursive factorial helper function
  def factorialTailRecursive(n: Int): Int = {
    def factorialHelper(x: Int, accumulator: Int): Int = {
      if (x <= 1) accumulator
      else factorialHelper(x - 1, x * accumulator)
    }

    factorialHelper(n, 1)
  }

  def main(args: Array[String]): Unit = {
    println("Enter a number to calculate its factorial:")
    val number = StdIn.readInt()

    val recursiveFactorial = factorialRecursive(number)
    val tailRecursiveFactorial = factorialTailRecursive(number)

    println(s"Factorial of $number (using recursion): $recursiveFactorial")
    println(s"Factorial of $number (using tail-recursion): $tailRecursiveFactorial")
  }
}
