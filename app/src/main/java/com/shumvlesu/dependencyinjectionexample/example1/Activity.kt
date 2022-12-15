package com.shumvlesu.dependencyinjectionexample.example1

import com.shumvlesu.dependencyinjectionexample.example2.DaggerNewComponent
import javax.inject.Inject

class Activity {

   //Пример иньекции поля Методом Inject
   //@Inject
   //lateinit var keyboard: Keyboard //Если мы делаем иньекцию зависимости (объекта Keyboard) в поле keyboard, то его тоже помечаем аннотацией @Inject
   //переменная должна быть публичной иначе даггер не сможет вставить зависимость

    //ДЗ
    @Inject
    lateinit var monitor: Monitor
    init {
       DaggerNewComponent.create().inject(this)
    }



    //Пример иньекции поля через get метод.
    val component = DaggerNewComponent.create()
    val keyboard: Keyboard = component.getKeyboard()
    val mouse: Mouse = component.getMouse()

    //Когда инжектишь через get нет нужды в init
    /*init {
       //Сама иньекция. В настоящей активити эта иньекция стояла бы в методе активити onCreate
       //Component().inject(this)

       //Иньекция с помощью даггера. При помощи класса сгенерированного даггером на основании написанного нами интерфейса NewComponent
       DaggerNewComponent.create().inject(this)

    }*/

}