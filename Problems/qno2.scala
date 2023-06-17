object q02{
def filterEvenNumbers(num_list : List[Int]) : List[Int] = {
return num_list.filter(_%2==0)
}
def main(args: Array[String]): Unit = {
println("Enter the number of elements: ")
val count = scala.io.StdIn.readInt()
var num_list = List[Int]()
for (i <- 0 until count) {
print(s"Enter element ${i + 1}: ")
num_list = num_list :+ scala.io.StdIn.readInt()
}
println("Even Numbers: "+filterEvenNumbers(num_list))
}
}