// P03 (*) Find the Kth element of a list.
//     By convention, the first element in the list is element 0.
//
//     Example:
//     scala> nth(2, List(1, 1, 2, 3, 5, 8))
//     res0: Int = 2

object S99FindKthElement {
	def main(args: Array[String]){
		println("Output is: "+kthElement(2, List(1, 1, 2, 3, 5, 8)))
  		println("\nOutput is for Recursive function is : "+nthRecursive(2, List(1, 1, 2, 3, 5, 8)))
			
	}
	def kthElement[A](n: Int, ls: List[A]): A =
		if (n>=0) ls(n)
		else throw new NoSuchElementException

	def nthRecursive[A](n: Int, ls: List[A]): A = (n,ls) match {
		case (0,h :: _ ) => h	
		case (n, _ :: tail) => nthRecursive(n-1, tail)
		case (_, Nil  )    => throw new NoSuchElementException
	}
}
