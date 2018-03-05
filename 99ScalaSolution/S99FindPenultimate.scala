// P02 (*) Find the last but one element of a list.
//     Example:
//     scala> penultimate(List(1, 1, 2, 3, 5, 8))
//     res0: Int = 5

object S99FindPenultimate {
	def main(args: Array[String]){
		println("The Penultimate of List is : "+findPenultimate(List(1, 1, 2, 3, 5, 8)))
		println("\nThe Penultimate of List using Recursive Method is : "+penultimateRecursive(List(1, 1, 2, 3, 5, 8)))
	}
	def findPenultimate[A](ls: List[A]): A =
		if (ls.isEmpty) throw new NoSuchElementException
		else ls.init.last
	def penultimateRecursive[A](ls: List[A]): A =ls match {
		case h :: _ :: Nil => h
		case _ :: tail     => penultimateRecursive(tail)
		case _ 		   => throw new NoSuchElementException
	}
}
