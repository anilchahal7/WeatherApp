package android.hopscotch.`in`.weatherapp.domain.commands

interface Command<out T> {
    fun execute(): T
}