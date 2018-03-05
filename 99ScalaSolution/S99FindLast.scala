// P01 (*) Find the last element of a list.
//     Example:
//     scala> last(List(1, 1, 2, 3, 5, 8))
//     res0: Int = 8

object S99FindLast {
	def main(args: Array[String])
	{
		println("The Last element of List is: "+lastElement(List(1, 1, 2, 3, 5, 8)))	
		println("\nThe Last Element using Recursive Method is: "+lastRecursive(List(1, 1, 2, 3, 5, 8)))
	}
	def lastElement[A](ls: List[A]): A =ls.last

	def lastRecursive[A](ls: List[A]): A = ls match{
	   case h :: Nil => h
	   case _ :: tail => lastRecursive(tail)
	   case _         => throw new NoSuchElementException	
	
	}	
}

