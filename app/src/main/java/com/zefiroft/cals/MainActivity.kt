package com.zefiroft.cals

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.zefiroft.cals.ui.theme.CalsTheme
import com.zefiroft.calslogging.logs.Log
import com.zefiroft.calssecurity.Encrypt

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.logVerbose("HOLA", "Mi primer tag desde libreria jitpack :D")
        Log.logVerbose(
            "HOLA",
            "ahora voy a encriptar esto con una libreria propia en jitpack: " + Encrypt.encryptString(
                "HOLA"
            )
        )
        enableEdgeToEdge()
        setContent {
            CalsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CalsTheme {
        Greeting("Android")
    }
}
