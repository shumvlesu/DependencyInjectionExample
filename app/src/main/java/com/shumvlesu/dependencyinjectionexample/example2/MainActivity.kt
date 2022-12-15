package com.shumvlesu.dependencyinjectionexample.example2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shumvlesu.dependencyinjectionexample.R
import com.shumvlesu.dependencyinjectionexample.example1.Activity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //На основе урока по DI и Dagger2 из урока Андрея Сумина
        //https://github.com/sumin93/DependencyInjectionStart


        val activity = Activity()
        activity.keyboard.toString() //Инжектим клавиатуру в MainActivity.
        
    }
}