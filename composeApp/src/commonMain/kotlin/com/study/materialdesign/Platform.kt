package com.study.materialdesign

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform