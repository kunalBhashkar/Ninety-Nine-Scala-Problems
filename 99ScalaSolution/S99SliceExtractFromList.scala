// P18 (**) Extract a slice from a list.
//     Given two indices, I and K, the slice is the list containing the elements
//     from and including the Ith element up to but not including the Kth
//     element of the original list.  Start counting the elements with 0.
//
//     Example:
//     scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//     res0: List[Symbol] = List('d, 'e, 'f, 'g)

object S99SliceExtractFromList{
	def main(args: Array[String]){
		  println("The final output  for simple slice is: "+extractSlice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
 		  println("\nThe final output for Recursive is: "+sliceRecursive(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  		  println("\nThe final output for Functional slice is: "+sliceFunctional(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
	
	}
	//Simple slicing
	def extractSlice[A](start:Int,end:Int,ls:List[A]): List[A] = ls.slice(start,end)
	//Simple Recursive	
	def sliceRecursive[A](start:Int,end:Int,ls:List[A]): List[A]=(start,end,ls) match {
		case (_,_,Nil)		=> Nil
		case (_,e,_)	if e <= 0 =>Nil
		case (s,e,h :: tail) if s <=0 => h :: sliceRecursive(0,e-1,tail)
		case (s,e,h :: tail)		=> sliceRecursive(s-1,e-1,tail)		
		}
	//Functional Program
	def sliceFunctional[A](s:Int,e:Int,ls:List[A]): List[A]= ls drop s take (e - (s max 0))
		
}
