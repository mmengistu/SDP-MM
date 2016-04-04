

package forecast

import scala.Vector

object MyForecastTest extends App{
  
def forecast(temp: Int): String =
  temp match{
    case 100 => "Sunny"
    case 80 => "Mostly Sunny"
    case 60 => "Partly sunny"
    case 20 => "Mostly cloudy"
    case 0 => "cloudy"
    case 15 => "Unknown"
  }
  
 
  val sunnyData = Vector(100,80,60,20,0,15)
  for(i<-sunnyData) {
    println(forecast(i))
  }

}