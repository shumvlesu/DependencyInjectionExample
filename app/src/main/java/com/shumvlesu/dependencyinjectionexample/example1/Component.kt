package com.shumvlesu.dependencyinjectionexample.example1

//Component - это класс ответственный за создание объекта зависимотей
class Component {

    fun getComputer(): Computer{

        val monitor = Monitor()
        val keyboard = Keyboard()
        val mouse = Mouse()
        val computerTower = ComputerTower(
            Storage(),
            Memory(),
            Processor()
        )
       return Computer(monitor, computerTower, keyboard, mouse)

    }

    fun inject( activity:Activity ){
        activity.computer = getComputer()
        activity.keyboard = Keyboard()
    }

}