// P25 (*) Generate a random permutation of the elements of a list.
//     Hint: Use the solution of problem P23.
//
//     Example:
//     scala> randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
//     res0: List[Symbol] = List('b, 'a, 'd, 'c, 'e, 'f)

import S99ExtractRandomlySelect.selectRandom1

object S99GenerateRandomPermutation{
	def main(args: Array[String]){
		println("The final output is: "+randomPermutation(List('a, 'b, 'c, 'd, 'e, 'f)))
		}
	def randomPermutation[A](ls:List[A]): List[A] = selectRandom1(ls.length,ls)
}
