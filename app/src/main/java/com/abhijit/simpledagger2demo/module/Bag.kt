package com.abhijit.simpledagger2demo.module

import com.abhijit.simpledagger2demo.Info
import dagger.Module
import dagger.Provides
import javax.inject.Named


@Module
class Bag {

    @Provides
    fun sayLoveDagger2(): Info {
        return Info("Love Dagger 2");
    }

    @Provides @Named("HELLO")
    fun sayHellowDagger2():Info{
        return Info("Hello Dagger 2")
    }

    @Provides @Named("ABHIJIT")
    fun sayHelloFromAbhijit():Info{
        return Info("Hello from Abhijit")
    }
}