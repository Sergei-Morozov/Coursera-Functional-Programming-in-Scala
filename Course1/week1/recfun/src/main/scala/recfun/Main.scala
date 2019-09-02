package recfun

object Main {
  def main(args: Array[String]) {

//    Ex 1:
//    println("Pascal's Triangle")
//    for (row <- 0 to 10) {
//      for (col <- 0 to row)
//        print(pascal(col, row) + " ")
//      println()
//    }
//    Ex 2:
//   print(balance("())(".toList))
//    Ex 3
    print(countChange(4, List(1,2,4)))
  }

  /**
   * Exercise 1
   */
    def pascal(column: Int, row: Int): Int = {

      // leftmost
      if (column < 0) return 0
      // rightmost
      if (column > row) return 0
      // base case
      if (row < 2) return 1
      // middle
      return pascal(column - 1, row - 1) + pascal(column, row - 1)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def balanced(acc: Int, data: List[Char]): Boolean = {
        if (acc < 0) return false
        // base case: empty array
        if (data.length == 0) return acc == 0
        // increase acc if '('
        else if (data.head == '(') return balanced(acc+1, data.tail)
        // decrease acc if ')'
        else if (data.head == ')') return balanced(acc-1, data.tail)
        // continue for any other character
        else return balanced(acc, data.tail)
      }
      balanced(0,chars)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      if (money == 0) return 1
      if (coins.isEmpty || money < 0) return 0
      return countChange(money - coins.head, coins) + countChange(money, coins.tail)
    }
    def countChange(money: Int, coins: List[Int]): Int = {
      for i in
      if (money == 0) return 1
      if (coins.isEmpty || money < 0) return 0
      return countChange(money - coins.head, coins) + countChange(money, coins.tail)
    }
  }
