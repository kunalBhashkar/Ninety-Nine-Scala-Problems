// P23 (**) Extract a given number of randomly selected elements from a list.
//     Example:
//     scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
//     res0: List[Symbol] = List('e, 'd, 'a)
//

import S99RemoveKthElement.removeKth
object S99ExtractRandomlySelect{
	def main(args: Array[String]){
		
  		println("The final output of first method is: "+selectRandom1(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h)))
  		println("\nThe final output of second method is: "+selectRandom2(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h)))

	}
	def selectRandom1[A](n:Int,ls:List[A]): List[A] = 
		if (n<=0) Nil
		else {
			val (rest,e) = removeKth((new util.Random).nextInt(ls.length), ls )
			e :: selectRandom1(n-1,rest)
			}

	//Another Method
	def selectRandom2[A](n:Int, ls:List[A]): List[A] = {
		def randomSelectR(n:Int,ls:List[A],r:util.Random): List[A] =
			if (n<=0) Nil
			else {
				val (rest,e) =removeKth(r.nextInt(ls.length),ls)
				e :: randomSelectR(n-1,rest,r)			
				}
		randomSelectR(n,ls,new util.Random)
		}
}
