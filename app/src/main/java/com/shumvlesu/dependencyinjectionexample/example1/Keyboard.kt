package com.shumvlesu.dependencyinjectionexample.example1

import javax.inject.Inject

//Иньекция в Конструктор класса
//Мы говорим даггеру если какому-то компоненту нужна зависимость клавиатура, т.е. объект класса клавиатура,
//то создай его, вызвав конструктор
class Keyboard  @Inject constructor() {
}