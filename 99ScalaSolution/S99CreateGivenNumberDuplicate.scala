// P15 (**) Duplicate the elements of a list a given number of times.
// Example:
// scala> duplicateN (3, list ('a,' b, 'c,' c, 'd))
// res0: List [Symbol] = List ('a,' a, 'a,' b, b, b, c, c, c, c, c, c, 'd,' d)

object S99CreateGivenNumberDuplicate{
	def main(args: Array[String]){
		 println("The Duplicate List is: "+duplicateNumber(3, List('a, 'b, 'c, 'c, 'd)))
 		 println("\nThe Duplicate List of Method two is: "+duplicateNumberNew(3, List('a, 'b, 'c, 'c, 'd)))
	}
	def duplicateNumber[A](n:Int,l:List[A]):List[A]={
		l flatMap { e => List.fill(n)(e)}	
	}
	def duplicateNumberNew[A](n:Int,l:List[A]): List[A] ={
		l flatMap {List.fill(n)(_)}	
	}
}
