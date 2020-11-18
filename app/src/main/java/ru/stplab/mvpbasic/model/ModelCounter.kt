package ru.stplab.mvpbasic.model

class ModelCounter() {

    private val counters = mutableListOf(0, 0, 0)

    private fun getCurrentCounter(index: Int) = counters[index]

    fun incCounter(index: Int): Int {
        counters[index]++
        return getCurrentCounter(index)
    }
}