package com.geekbrains.tests

import com.geekbrains.tests.presenter.details.DetailsPresenter
import com.geekbrains.tests.view.details.ViewDetailsContract
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.MockitoAnnotations

class DetailsPresenterTest {

    private lateinit var presenter: DetailsPresenter

    @Mock
    private lateinit var viewContract: ViewDetailsContract

    @Before
    fun setUp() {
        MockitoAnnotations.openMocks(this)
        presenter = DetailsPresenter(7)
        presenter.onAttach(viewContract)
    }

    @Test
    fun `viewContract onAttached and viewContract call setCount(8) verify`() {
        presenter.onIncrement()
        verify(viewContract, times(1)).setCount(8)
    }

    @Test
    fun `viewContract onAttached and viewContract call setCount(6) verify`() {
        presenter.onDecrement()
        verify(viewContract, times(1)).setCount(6)
    }

    @Test
    fun `if presenter is onDetached viewContract not call setCount`() {
        presenter.onDetach(viewContract)
        presenter.onIncrement()
        presenter.onDecrement()
        verify(viewContract, never()).setCount(anyInt())
    }
}
