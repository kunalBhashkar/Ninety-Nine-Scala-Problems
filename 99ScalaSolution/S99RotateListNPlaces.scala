// P19 (**) Rotate a list N places to the left.
//     Examples:
//     scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//     res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
//
//     scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//     res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)

object S99RotateListNPlaces {
	def main(args: Array[String]){
		println("The final output is: "+rotateList(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
	}
	def rotateList[A](n:Int,ls:List[A]): List[A] ={
		val nBounded = if (ls.isEmpty) 0 else n % ls.length
		if (nBounded<0) rotateList(nBounded+ls.length,ls)
		else (ls drop nBounded) ::: (ls take nBounded)	
	}
}
