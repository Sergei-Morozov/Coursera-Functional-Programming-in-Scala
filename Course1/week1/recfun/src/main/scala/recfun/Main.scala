package recfun

object Main {
  def main(args: Array[String]) {
//    println("Pascal's Triangle")
//    for (row <- 0 to 10) {
//      for (col <- 0 to row)
//        print(pascal(col, row) + " ")
//      println()
//    }
    print(countChange(4,List(1,2)))
  }

  /**
   * Exercise 1
   */
    def pascal(col: Int, row: Int): Int = {
      if (col > row) return 0
      if (row < 2) return 1
      if (col > 0) return pascal(col-1, row-1 )+pascal(col, row-1)
      return pascal(col, row-1)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def balanced(left: Int, data: List[Char]): Boolean = {
        if (data.isEmpty) return left == 0
        if ( data.head == '(' ) return balanced(left+1, data.tail)
        if ( data.head == ')')
          if (left > 0) return  balanced(left-1, data.tail)
          else return false
        return balanced(left, data.tail)
      }
      balanced(0,chars)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      if (money == 0) return 1
      if (coins.isEmpty || money < 0) return 0
      return countChange(money, coins.tail) + countChange(money - coins.head, coins)
    }
  }
