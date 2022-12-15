package com.shumvlesu.dependencyinjectionexample.example1

import com.shumvlesu.dependencyinjectionexample.example2.DaggerNewComponent
import javax.inject.Inject

class Activity {

   //Пример иньекции поля
   @Inject
   lateinit var keyboard: Keyboard //Если мы делаем иньекцию зависимости (объекта Keyboard) в поле keyboard, то его тоже помечаем аннотацией @Inject
   //переменная должна быть публичной иначе даггер не сможет вставить зависимость





    init {
       //Сама иньекция. В настоящей активити эта иньекция стояла бы в методе активити onCreate
       //Component().inject(this)

       //Иньекция с помощью даггера. При помощи класса сгенерированного даггером на основании написанного нами интерфейса NewComponent
       DaggerNewComponent.create().inject(this)

    }

}