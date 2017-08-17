
import org.scalatest.{Matchers, WordSpec}

class intersector_suite extends WordSpec with Matchers {

  "Intersector" should {

    "return data" when {

      "tree has an element" in {
        Intersector.doIntersect(Leaf()) shouldEqual Seq.empty[Int]
      }

      "tree has one element" in {
        Intersector.doIntersect(Leaf(1)) shouldEqual Seq(1)
      }

      "tree has two element" in {
        Intersector.doIntersect(Leaf(1,2)) shouldEqual Seq(1,2)
      }

      "tree has no leaf" in {
        Intersector.doIntersect(Leaf()) shouldEqual Seq.empty[Int]
      }

      "tree has one empty leaf" in {
        Intersector.doIntersect(Leaf()) shouldEqual Seq.empty[Int]
      }

    }

  }

}
