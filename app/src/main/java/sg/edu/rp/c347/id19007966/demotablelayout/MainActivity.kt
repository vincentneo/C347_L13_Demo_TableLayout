package sg.edu.rp.c347.id19007966.demotablelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonOnClick(view: View) {
        var message = ""
        val selected = view as Button
        when (selected.id) {
            button1.id -> message = "button 1 is clicked";
            button2.id -> message = "button 2 is clicked";
            button3.id -> message = "button 3 is clicked";
            button4.id -> message = "button 4 is clicked";
            button5.id -> message = "button 5 is clicked";
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}