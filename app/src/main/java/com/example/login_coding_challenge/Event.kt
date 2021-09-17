package com.example.login_coding_challenge

/**
 * Used as a wrapper for data that is exposed via a LiveData that represents an event.
 */
open class Event<out T>(private val content: T) {

    var hasBeenHandled = false
        private set // Allow external read but not write

    /**
     * Returns the content and prevents its use again.
     */
    fun getContentIfNotHandled(): T? {
        return if (hasBeenHandled) {
            null
        } else {
            hasBeenHandled = true
            content
        }
    }

    /**
     * Returns the content, even if it's already been handled.
     */
    fun peekContent(): T = content

    fun consumeEventIfNotHandled(callback: (T) -> Unit) {
        getContentIfNotHandled()?.let{
            callback(it)
        }
    }

    fun peekEvent(callback: (T) -> Unit) {
        callback(peekContent())
    }
}