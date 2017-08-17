trait Tree
case class Node(elements: Tree*) extends Tree
case class Leaf(num: Int*) extends Tree

object Intersector {

   def doIntersect(tree: Tree): Seq[Int] = {
      tree match {
         case Leaf(x @ _*) => x
         case Node() => Seq.empty[Int]
         case Node(x) => doIntersect(x)
         case Node(x @ _*) => x.map(doIntersect).reduce((x, y) => x.intersect(y))
      }
   }

}

