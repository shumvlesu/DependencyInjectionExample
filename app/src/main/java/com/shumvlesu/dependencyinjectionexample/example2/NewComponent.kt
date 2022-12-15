package com.shumvlesu.dependencyinjectionexample.example2


import com.shumvlesu.dependencyinjectionexample.example1.Activity
import com.shumvlesu.dependencyinjectionexample.example1.Keyboard
import dagger.Component

@Component
interface NewComponent {

    fun inject (activity: Activity)

}