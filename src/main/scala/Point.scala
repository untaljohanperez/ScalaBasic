/**
  * Created by JohanPerez on 3/09/2016.
  */
class Point(var x: Int, var y: Int) extends Similarity{ //class parameterized with constructor arguments
  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }

  override def toString: String = {
    "(" + x + "," + y + ")"
  }

  def isSimilar(obj: Any): Boolean = obj.isInstanceOf[Point] & obj.asInstanceOf[Point].x == x
}