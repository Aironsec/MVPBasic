package ru.stplab.mvpbasic.presenter

import ru.stplab.mvpbasic.model.ModelCounter
import ru.stplab.mvpbasic.view.IView

class Presenter(private val iView: IView) {

    private val model = ModelCounter()

    fun clickButton1() {
        val index = 0
        val incCounter = model.incCounter(index)
        iView.setButton1Text(incCounter.toString())
    }

    fun clickButton2() {
        val index = 1
        val incCounter = model.incCounter(index)
        iView.setButton2Text(incCounter.toString())
    }

    fun clickButton3() {
        val index = 2
        val incCounter = model.incCounter(index)
        iView.setButton3Text(incCounter.toString())
    }
}