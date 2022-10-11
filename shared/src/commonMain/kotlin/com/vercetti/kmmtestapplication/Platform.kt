package com.vercetti.kmmtestapplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform