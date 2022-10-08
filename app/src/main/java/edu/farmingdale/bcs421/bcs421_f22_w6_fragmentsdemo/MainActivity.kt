package edu.farmingdale.bcs421.bcs421_f22_w6_fragmentsdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView



class MainActivity : AppCompatActivity() {
    val SHAREDPREF_FILENAME= "MYSHAREDPREF_FILE"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.helloWorldBtn).setOnClickListener{
            storeInSharedPref()
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }

    private fun storeInSharedPref(){
        var sharedpref= getSharedPreferences(SHAREDPREF_FILENAME, MODE_PRIVATE)
        var editor=sharedpref.edit()
        editor.putString("KEY", "This value is stored in shared pref")
        editor.commit()
    }
}