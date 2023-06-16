import scala.io.StdIn

object GCDCalculator {
  // Recursive GCD calculation
  def gcdRecursive(a: Int, b: Int): Int = {
    if (b == 0) a
    else gcdRecursive(b, a % b)
  }

  // Tail-recursive GCD calculation
  def gcdTailRecursive(a: Int, b: Int): Int = {
    def gcdHelper(x: Int, y: Int): Int = {
      if (y == 0) x
      else gcdHelper(y, x % y)
    }

    gcdHelper(a, b)
  }

  def main(args: Array[String]): Unit = {
    println("Enter two numbers:")
    val a = StdIn.readInt()
    val b = StdIn.readInt()

    val recursiveGCD = gcdRecursive(a, b)
    println(s"The GCD of $a and $b (using recursion) is: $recursiveGCD")

    val tailRecursiveGCD = gcdTailRecursive(a, b)
    println(s"The GCD of $a and $b (using tail recursion) is: $tailRecursiveGCD")
  }
}

