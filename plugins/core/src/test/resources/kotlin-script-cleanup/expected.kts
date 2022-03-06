#!/usr/bin/env kotlin

@file:Repository("https://jcenter.bintray.com")
@file:Repository("https://jitpack.io")
@file:DependsOn("io.rsocket.kotlin:rsocket-core-jvm:0.13.0-SNAPSHOT")
@file:DependsOn("io.ktor:ktor-client-okhttp:1.5.2")
@file:DependsOn("com.squareup.wire:wire-moshi-adapter:3.4.0")
@file:CompilerOptions("-jvm-target", "17")

import org.jetbrains.kotlin.script.util.CompilerOptions
import org.jetbrains.kotlin.script.util.DependsOn
import org.jetbrains.kotlin.script.util.Repository

fun main() {
    println("Hello World")
}