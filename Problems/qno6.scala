object q06{
def findMaxValue(num_list : List[Int]) : Int = {
return num_list.reduce((x,y) => if (x>y) x else y)
}
def main(args: Array[String]): Unit = {
println("Enter the number of elements: ")
val count = scala.io.StdIn.readInt()
var num_list = List[Int]()
for (i <- 0 until count) {
print(s"Enter element ${i + 1}: ")
num_list = num_list :+ scala.io.StdIn.readInt()
}
println("Max value in List: "+findMaxValue(num_list))
}
}