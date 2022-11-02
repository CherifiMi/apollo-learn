// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.apollographql.apollo3.ApolloClient
import com.example.apollo.LaunchListQuery

val apolloClient = ApolloClient.Builder()
    .serverUrl("https://apollo-fullstack-tutorial.herokuapp.com/graphql")
    .build()

@Composable
@Preview
fun App() {

    var result by remember { mutableStateOf<List<LaunchListQuery.Launch>?>(emptyList()) }

    LaunchedEffect(Unit){
        val response = apolloClient.query(LaunchListQuery()).execute()
        result = response.data?.launches?.launches?.filterNotNull()
    }

    LazyColumn (modifier = Modifier.fillMaxSize()){
        items(result!!){
            Text(it.site!!)
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        MaterialTheme {
            App()
        }
    }
}
