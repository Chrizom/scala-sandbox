
import org.scalatest.{Matchers, WordSpec}

class tree_suite extends WordSpec with Matchers {

  "TreeBuilder" should {

    "creating a tree" when {

      "a branch count given" in {
        val tree = new TreeHandler().createTree(4)

        tree shouldBe a [Treeb]
      }

    }

    "folding a tree" when {

      "given a tree" in {
        val treeHandler = new TreeHandler()
        val tree = treeHandler.createTree(10)

        treeHandler.collectUniqueLeaves(tree)

        treeHandler.uniques
      }

    }
  }

}
