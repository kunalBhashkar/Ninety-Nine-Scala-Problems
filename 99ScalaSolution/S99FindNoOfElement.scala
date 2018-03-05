// P04 (*) Find the number of elements of a list.
//     Example:
//     scala> length(List(1, 1, 2, 3, 5, 8))
//     res0: Int = 6

object S99FindNoOfElement{
	def main(args: Array[String]){
		println("The length of List is: "+lengthOfList(List(1, 1, 2, 3, 5, 8)))
		println("\nThe length of List is using Recursive Methos is : "+lengthRecursive(List(1, 1, 2, 3, 5, 8)))
		println("\nThe length of List using Functional solution is: "+lengthFunctional(List(1, 1, 2, 3, 5, 8)))
		println("\nThe length of List using Tail Recursive is : "+lengthTailRecursive(List(1, 1, 2, 3, 5, 8)))
	}
	def lengthOfList[A](ls: List[A]): Int =ls.length
	def lengthRecursive[A](ls: List[A]): Int =ls match {
		case Nil => 0
		case _ :: tail => 1+lengthRecursive(tail)	
	}
	//Functional Solution	
	def lengthFunctional[A](ls: List[A]): Int =ls.foldLeft(0) { (c,_) => c+1 }
	//using Tail Recursive Method
	def lengthTailRecursive[A](ls: List[A]): Int ={
		def lengthR(result:Int, curList: List[A]): Int =curList match {
			case Nil => result
			case _ :: tail => lengthR(result +1, tail)
	}	
		lengthR(0,ls)
	}
}
