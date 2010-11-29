package de.malvik

import android.os.AsyncTask


object Trafikanten extends AsyncTask[String, Integer, String] {

  def doInBackground(params: String*): String = {
	  System.out.println("Hallo Trafikanten")
	  return "Hallo Trafikanten"
  }

}