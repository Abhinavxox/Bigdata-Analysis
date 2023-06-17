object q08{
def removeDuplicates(num_list : List[Int]) : List[Int] = {
return num_list.foldLeft(List[Int]())((a,b) => if (a.contains(b)) a
else a:+b)
}
def main(args: Array[String]): Unit = {
println("Enter the number of elements: ")
val count = scala.io.StdIn.readInt()
var num_list = List[Int]()
for (i <- 0 until count) {
print(s"Enter element ${i + 1}: ")
num_list = num_list :+ scala.io.StdIn.readInt()
}
println("List without duplicates: "+removeDuplicates(num_list))
}
}