package de.malvik

import org.apache.http.impl.client.DefaultHttpClient

object Trafikanten {

  def getStationsWithBeginning(beginningText: String): List[String] = {
	  val client = new DefaultHttpClient

	  List("1", "2", "3")
  }

}