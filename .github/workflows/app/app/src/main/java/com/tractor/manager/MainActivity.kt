package com.tractor.manager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

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
    val dashboard = if (lang == "EN") "Dashboard" else "لوحة التحكم"
    val addJob = if (lang == "EN") "Add Job" else "إضافة عملية"
    val jobs = if (lang == "EN") "Jobs" else "العمليات"

    Column(modifier = Modifier.padding(20.dp)) {

        Text(title, style = MaterialTheme.typography.headlineMedium)

        Spacer(Modifier.height(20.dp))

        Button(onClick = {
            lang = if (lang == "EN") "AR" else "EN"
        }) {
            Text(if (lang == "EN") "Switch Language" else "تغيير اللغة")
        }

        Spacer(Modifier.height(20.dp))

        Text(dashboard)
        Text(addJob)
        Text(jobs)
    }
}
