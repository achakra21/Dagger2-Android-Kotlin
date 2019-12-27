package com.abhijit.simpledagger2demo

import javax.inject.Inject

class Car @Inject constructor(engine: Engine,wheel: Wheel) {
    var isCarReady = "Car is Ready"+" "+engine.isEngineReady+" "+wheel.isWheelREeady+"!!!!"
}