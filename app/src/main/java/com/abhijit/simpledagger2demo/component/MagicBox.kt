package com.abhijit.simpledagger2demo.component

import com.abhijit.simpledagger2demo.MainActivity
import dagger.Component

@Component
interface MagicBox {
    fun poke(app: MainActivity)
}