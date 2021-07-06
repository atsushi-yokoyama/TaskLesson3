package jp.techacademy.yokoyama.atsushi.tasklesson3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var human1 = Human("太郎", 20)

        human1.say()

        var human2 = Human("花子", 18)

        human2. think()
    }
}