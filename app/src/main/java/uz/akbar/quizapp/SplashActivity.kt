package uz.akbar.quizapp

import android.content.Intent
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val anim = AnimationUtils.loadAnimation(this,R.anim.anim_translate)
        val anim2 = AnimationUtils.loadAnimation(this,R.anim.anim_scale)

        quiz_logo.startAnimation(anim)

        txtV.visibility = View.VISIBLE
        txtV.startAnimation(anim2)

        TextV.visibility = View.VISIBLE
        TextV.startAnimation(anim2)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 5500)
    }
}