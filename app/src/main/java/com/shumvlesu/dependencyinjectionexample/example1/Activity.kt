package com.shumvlesu.dependencyinjectionexample.example1

class Activity {

    //Первый способ получения зависимотси через метод get компонента
    val computer : Computer = Component().getComputer()

}