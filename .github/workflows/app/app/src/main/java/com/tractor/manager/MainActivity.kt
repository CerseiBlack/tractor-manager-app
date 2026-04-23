package com.tractor.manager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TractorApp()
        }
    }
}

@Composable
fun TractorApp() {
    var lang by remember { mutableStateOf("EN") }

    val title = if (lang == "EN") "Tractor Manager" else "إدارة الجرار"

    Column(modifier = androidx.compose.ui.Modifier.padding(20.dp)) {

        Text(title, style = MaterialTheme.typography.headlineMedium)

        Spacer(Modifier.height(20.dp))

        Button(onClick = { lang = if (lang == "EN") "AR" else "EN" }) {
            Text(if (lang == "EN") "Switch to Arabic" else "التبديل إلى الإنجليزية")
        }

        Spacer(Modifier.height(20.dp))

        Text(if (lang == "EN") "Dashboard" else "لوحة التحكم")
        Text(if (lang == "EN") "Add Job" else "إضافة عملية")
        Text(if (lang == "EN") "Jobs" else "العمليات")
    }
}
