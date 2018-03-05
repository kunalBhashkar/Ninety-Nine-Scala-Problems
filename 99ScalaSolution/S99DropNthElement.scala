// P16 (**) Drop every Nth element from a list.
//     Example:
//     scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//     res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)

object S99DropNthElement {
	def main(args: Array[String]){
		    println("The output of Recursive program is : "+dropRecursive(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
    		    println("The output of Functional Program is : "+dropFunctional(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
	}
	//Simple Recursive Program
	def dropRecursive[A](n:Int, ls:List[A]): List[A] ={
		def dropR(c:Int, curList: List[A]): List[A]=(c,curList) match {
			case (_,Nil) => Nil
			case (1,_ :: tail) => dropR(n,tail)
			case (_,h :: tail) => h :: dropR(c-1,tail)
		  }	
		  dropR(n,ls)
	}
	//Functional Program
	def dropFunctional[A](n:Int,ls:List[A]): List[A] =
		ls.zipWithIndex filter { v => (v._2+1) % n!=0} map { _._1}
}
