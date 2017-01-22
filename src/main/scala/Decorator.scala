/**
  * Created by JohanPerez on 3/09/2016.
  */
class Decorator {
  def layout[T](x: T): String = "[" +  x.toString() + "]"
}
