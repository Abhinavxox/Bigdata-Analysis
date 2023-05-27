import scala.io.StdIn

object AnonymousFunctionAndClosure {
  
  def main(args: Array[String]): Unit = {
    // Anonymous Function
    println("Enter two numbers:")
    val a = StdIn.readInt()
    val b = StdIn.readInt()
    
    val addFunc = (x: Int, y: Int) => x + y
    val result1 = addFunc(a, b)
    println(s"Result of addFunc: $result1")
    
    // Closure
    println("Enter a number:")
    val x = StdIn.readInt()
    
    val multiplyFunc = (y: Int) => y * x
    val result2 = multiplyFunc(a)
    println(s"Result of multiplyFunc: $result2")
  }
}
