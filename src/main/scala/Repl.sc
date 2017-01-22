countChange(4, List(1,2))
def countChange(money: Int, coins: List[Int]): Int = {
  if(coins isEmpty) return 0
  if(money == 0) return 0
  return 0
}

def loop(iter: List[Int], iter2: List[Int], acc: List[List[Int]]): List[List[Int]] = {
  if(iter isEmpty) return acc
  if(iter2 isEmpty) return loop(iter.tail, iter.tail, acc)
  loop(iter, iter2.tail, List(iter.head, iter2.head) :: acc)
}


loop(List(1,2,3,4), List(1,2,3,4), List(List(1),List(2),List(3),List(4)))

loop(List(2,3,4), List(2,3,4), List())
/*
11
12
13
14



*/


