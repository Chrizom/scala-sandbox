case class One(name: String, value: Int)
case class Two(name: String, value: Int)

class Tax(income: Float, costs: Float, rate: Int) {

   def calculate() : Float = ((income - costs) * (100 + rate)) / 100

   def patternMatch(x: Any) = x match {
      case One("Jozsi", _) => println("one")
      case Two(_, _) => println("two")
   }

}
