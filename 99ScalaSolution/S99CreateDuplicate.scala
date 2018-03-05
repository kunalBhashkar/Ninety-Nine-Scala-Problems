// P14 (*) Duplicate the elements of a list.
//     Example:
//     scala> duplicate(List('a, 'b, 'c, 'c, 'd))
//     res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)

object S99CreateDuplicate{
	def main(args: Array[String]){
		println("The Duplicate List is : "+createDuplicate(List('a, 'b, 'c, 'c, 'd)))	
	}
	def createDuplicate[A](ls: List[A]): List[A]=ls flatMap { e=> List(e,e)}
}
