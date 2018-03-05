// P20 (*) Remove the Kth element from a list.
//     Return the list and the removed element in a Tuple.  Elements are
//     numbered from 0.
//
//     Example:
//     scala> removeAt(1, List('a, 'b, 'c, 'd))
//     res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)

object S99RemoveKthElement{
	def main(args: Array[String]){
		  println("The final output of method one is: "+removeKth(1, List('a, 'b, 'c, 'd)))
 		  println("The final output of method second is: "+removeKthNew(1, List('a, 'b, 'c, 'd)))
	}
	def removeKth[A](n:Int,ls:List[A]): (List[A],A) =ls.splitAt(n) match {
		case (Nil,_) if n<0 => throw new NoSuchElementException
		case (pre,e :: post) => (pre ::: post,e)
		case (pre,Nil)  => throw new NoSuchElementException		
		}
	//Another Method	
	def removeKthNew[A](n:Int,ls:List[A]): (List[A],A) = 
		if (n<0) throw new NoSuchElementException
		else (n,ls) match {
			case (_,Nil) => throw new NoSuchElementException
			case (0,h :: tail) => (tail,h)
			case (_,h :: tail) => {
				val (t,e) =removeKthNew(n-1,ls.tail)
				(ls.head :: t,e)
				}			
			}
}
