package com.abhijit.simpledagger2demo.component

import com.abhijit.simpledagger2demo.MainActivity
import com.abhijit.simpledagger2demo.module.Bag
import dagger.Component

@Component(modules = [Bag::class])
interface MagicBox {
    fun poke(app: MainActivity)
}