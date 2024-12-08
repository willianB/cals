package com.zefiroft.calssecurity

object Encrypt {
    fun encryptString(string: String): String {
        val encryptedString = string.reversed()
        return encryptedString
    }
}