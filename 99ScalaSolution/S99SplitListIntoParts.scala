// P17 (*) Split a list into two parts.
//     The length of the first part is given.  Use a Tuple for your result.
//
//     Example:
//     scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//     res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))

object S99SplitListIntoParts {
	def main(args: Array[String]){
		    println("The final output is: "+splitFun(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
    		    println("\nThe final output of Recursive Function is: "+splitRecursive(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
   		    println("\nThe final output of functional program is: "+splitFunctional(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))	
	}
	//Simple Program
	def splitFun[A](n:Int, ls:List[A]): (List[A],List[A]) = ls.splitAt(n)
	//Simple Recursion
	def splitRecursive[A](n:Int,ls:List[A]): (List[A],List[A]) = (n,ls) match {
		case (_,Nil)  => (Nil,Nil)
		case (0, list) => (Nil,list)
		case (n, h :: tail) => {
			val (pre,post) = splitRecursive(n-1,tail)
			(h :: pre,post)
		}
	}
	//Functional
	def splitFunctional[A](n:Int,ls:List[A]): (List[A],List[A])=(ls.take(n),ls.drop(n))
}
