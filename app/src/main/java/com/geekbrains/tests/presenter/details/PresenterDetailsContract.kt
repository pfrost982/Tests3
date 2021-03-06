package com.geekbrains.tests.presenter.details

import com.geekbrains.tests.presenter.PresenterContract

interface PresenterDetailsContract : PresenterContract {
    fun setCounter(count: Int)
    fun onIncrement()
    fun onDecrement()
}
