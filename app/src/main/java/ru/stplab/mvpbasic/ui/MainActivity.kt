package ru.stplab.mvpbasic.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import ru.stplab.mvpbasic.R
import ru.stplab.mvpbasic.presenter.Presenter
import ru.stplab.mvpbasic.view.IView

class MainActivity : AppCompatActivity(), IView {

    private val presenter = Presenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setAction()
    }

    private fun setAction(){
        button1.setOnClickListener {
            presenter.clickButton1()
        }
        button2.setOnClickListener {
            presenter.clickButton2()
        }
        button3.setOnClickListener {
            presenter.clickButton3()
        }
    }

    override fun setButton1Text(text: String) {
        button1.text = text
    }

    override fun setButton2Text(text: String) {
        button2.text = text
    }

    override fun setButton3Text(text: String) {
        button3.text = text
    }

}