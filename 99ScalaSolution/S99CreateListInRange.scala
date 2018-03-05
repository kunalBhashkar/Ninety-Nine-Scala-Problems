// P22 (*) Create a list containing all integers within a given range.
//     Example:
//     scala> range(4, 9)
//     res0: List[Int] = List(4, 5, 6, 7, 8, 9)

object S99CreateListInRange {
	def main(args:Array[String]){
		  println("The final output for range List is: "+rangeList(4, 9))
  		  println("\nThe final output for recursive List is: "+recursiveRange(4, 9))  
  		  println("\nThe final output for functional Programming is: "+rangeFunctional(4, 9))
	
	}
	def rangeList(start:Int,end:Int): List[Int]=List.range(start,end+1)
	//Recursive Example	
	def recursiveRange(start:Int,end:Int): List[Int]=
		if (end<start) Nil
		else start :: recursiveRange(start+1,end)
	//Classic Functional	
	def unfoldRight[A,B](s:B)(f: B=> Option[(A,B)]): List[A]=
		f(s) match {
			case None	=> Nil
			case Some((r,n)) => r :: unfoldRight(n)(f)			
		}
	//Functional
	def rangeFunctional(start:Int,end:Int): List[Int] =
		unfoldRight(start) { n=>
			if (n>end) None
			else Some((n,n+1))
			}
}
