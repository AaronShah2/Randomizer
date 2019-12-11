package www.github.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import kotlin.random.Random

// layout class
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // following line of connects layout with activity
        setContentView(R.layout.activity_main)

        // gets variables assigned from layout
        val rollButton = findViewById<Button>(R.id.rollButton)
        val resultsTextView = findViewById<TextView>(R.id.resultsTextView)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)

        // allows roll button to generate random value between 0 and seekbar val
        rollButton.setOnClickListener {
            val rand = Random.nextInt(seekBar.progress)
            resultsTextView.text = rand.toString()

        }
    }
}
