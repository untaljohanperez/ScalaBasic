/**
  * Created by JohanPerez on 3/09/2016.
  */
trait Similarity {
  def isSimilar(x: Any): Boolean
  def isNotSimilar(x: Any): Boolean = !isSimilar(x)
}
