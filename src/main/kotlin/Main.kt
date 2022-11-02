// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.apollographql.apollo3.ApolloClient
import com.apollographql.apollo3.api.toJsonString
import com.example.apollo.LaunchListQuery
import kotlinx.coroutines.launch

val apolloClient = ApolloClient.Builder()
    .serverUrl("https://apollo-fullstack-tutorial.herokuapp.com/graphql")
    .build()

@Composable
@Preview
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }

    rememberCoroutineScope().launch {
        val response = apolloClient.query(LaunchListQuery()).execute()

        println(response.data?.toJsonString())
    }

    MaterialTheme {
        Button(onClick = {
            text = "Hello, Desktop!"
        }) {
            Text(text)
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
