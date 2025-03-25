package com.jingom.kotlin.myfirstkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform