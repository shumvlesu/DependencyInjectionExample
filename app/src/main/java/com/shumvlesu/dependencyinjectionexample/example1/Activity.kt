package com.shumvlesu.dependencyinjectionexample.example1

class Activity {

    //Лучший способ доставки зависимотсти - "снаружи" через иньекцию
    lateinit var computer : Computer
    lateinit var keyboard: Keyboard

    init {
       //Сама иньекция. В настоящей активити эта иньекция стояла бы в методе активити onCreate
       Component().inject(this)
    }

}