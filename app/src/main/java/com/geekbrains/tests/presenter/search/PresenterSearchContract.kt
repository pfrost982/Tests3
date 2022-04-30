package com.geekbrains.tests.presenter.search

import com.geekbrains.tests.presenter.PresenterContract
import com.geekbrains.tests.view.search.ViewSearchContract

interface PresenterSearchContract : PresenterContract {
    fun searchGitHub(searchQuery: String)
    fun onAttach(view: ViewSearchContract)
    fun onDetach(view: ViewSearchContract)
}
