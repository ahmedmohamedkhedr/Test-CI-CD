package com.arpuplus.testci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.arpuplus.testci.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val ui by lazy {
        ActivityMainBinding.inflate(LayoutInflater.from(this))
    }
    private val viewModel by lazy {
        ViewModelProvider(this)[MainViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ui.root)
        ui.editTextTextPersonName.addTextChangedListener {
            viewModel.email = it.toString()

        }
    }
}