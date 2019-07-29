package root.iv.kotlinapp

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        button.text = "GO"

        button.setOnClickListener {
            Toast.makeText(this, "Сообщение", Toast.LENGTH_SHORT).show()
            val r: Int = Random().nextInt(6) + 1

            viewTextResult(r)
            viewImageResult(r)
        }
    }

    private fun viewTextResult(r: Int) {
        val resultText: TextView = findViewById(R.id.textView)
        resultText.text = r.toString()
    }

    private fun viewImageResult(r: Int) {
        val resultImage: ImageView = findViewById(R.id.image);
        val draw: Int = when (r) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        resultImage.setImageDrawable(getDrawable(draw))
    }
}
