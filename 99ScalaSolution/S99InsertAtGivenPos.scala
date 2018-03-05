// P21 (*) Insert an element at a given position into a list.
//     Example:
//     scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
//     res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)

object S99InsertAtGivenPos {
	def main(args:Array[String]){
		println("The modified list is: "+insertAt('new, 1, List('a, 'b, 'c, 'd)))
	}
	def insertAt[A](e:A,n:Int,ls:List[A]): List[A] =ls.splitAt(n) match {
		case (pre,post) => pre ::: e :: post	
	}
}
