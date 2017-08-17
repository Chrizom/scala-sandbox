abstract class Treeb
case class Branch(left: Treeb, right: Treeb) extends Treeb
case class Leafb(x: Int) extends Treeb

class TreeHandler() {

   var uniques: Set[Int] = Set[Int]()

   def createTree(branchCount: Int): Treeb = {
      if(branchCount == 0) {
         Leafb(util.Random.nextInt(10))
      } else {
         val branchCountAtLeft = util.Random.nextInt(branchCount)
         val branchCountAtRight = branchCount - 1 - branchCountAtLeft
         Branch(createTree(branchCountAtLeft), createTree(branchCountAtRight))
      }
   }

   def collectUniqueLeaves(tree: Treeb): Unit = tree match {
      case Branch(left, right) => {
         collectUniqueLeaves(left)
         collectUniqueLeaves(right)
      }
      case Leafb(x) => uniques += x
   }

}


