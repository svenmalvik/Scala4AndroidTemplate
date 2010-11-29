package de.malvik

<<<<<<< HEAD
import android.os.AsyncTask


object Trafikanten extends AsyncTask[String, Integer, String] {

  def doInBackground(params: String*): String = {
	  System.out.println("Hallo Trafikanten")
	  return "Hallo Trafikanten"
=======
import org.apache.http.impl.client.DefaultHttpClient

object Trafikanten {

  def getStationsWithBeginning(beginningText: String): List[String] = {
	  val client = new DefaultHttpClient

	  List("1", "2", "3")
>>>>>>> 5325f93f0d9d1251e1df1bccfa439dbc4852eed2
  }

}