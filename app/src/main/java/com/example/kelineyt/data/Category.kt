package com.example.kelineyt.data

sealed class Category(val category: String) {

    object CPU: Category("CPU")
    object MainBoard: Category("MainBoard")
    object Headphone: Category("Headphone")
    object Power: Category("Power")
    object KeyBoard: Category("Keyboard")
}