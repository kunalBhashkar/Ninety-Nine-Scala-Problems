// P05 (*) Reverse a list.
//     Example:
//     scala> reverse(List(1, 1, 2, 3, 5, 8))
//     res0: List[Int] = List(8, 5, 3, 2, 1, 1)

object S99FindReverse {
	def main(args: Array[String]){
	  	println("The Reverse of List is: "+reverseList(List(1, 1, 2, 3, 5, 8)))
  		println("\nThe Reverse of list using recursive is: "+reverseRecursive(List(1, 1, 2, 3, 5, 8)))
  		println("\nThe Reverse of list using functional is: "+reverseFunctional(List(1, 1, 2, 3, 5, 8)))
	}
	//Simple Method
	def reverseList[A](ls: List[A]): List[A] = ls.reverse
	//Simple Recursive	
	def reverseRecursive[A](ls: List[A]): List[A]=ls match{
		case Nil => Nil
		case h :: tail => reverseRecursive(tail) ::: List(h)
	}
	//Functional 
	def reverseFunctional[A](ls: List[A]): List[A]=
		ls.foldLeft(List[A]()) {(r,h) => h :: r}

}
