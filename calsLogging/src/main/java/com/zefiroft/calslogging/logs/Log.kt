package com.zefiroft.calslogging.logs

import android.util.Log

object Log {
    fun logVerbose(tag: String, message: String) {
        Log.d(tag, message)
    }
}

