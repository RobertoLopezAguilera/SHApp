package com.example.heroapp

import android.graphics.Typeface
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.res.ResourcesCompat
import com.example.heroapp.ui.theme.HeroAppTheme
import kotlin.coroutines.coroutineContext

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //val fuente = ResourcesCompat.getFont(this, R.font.loved_by_the_king)

        setContent {
            HeroAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background,
                ) {
                    HeApp()
                }
            }
        }
    }
}

@Composable
fun HeApp(){
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar()
        }
    ) {
        val heroes = HeroesRepository.heroes
        HeroesList(heroes = heroes, Modifier.padding(it))

    }
}

@Composable
fun TopAppBar(modifier: Modifier = Modifier){
    Box(
        modifier = modifier
            .fillMaxWidth()
            .size(50.dp),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Heroes",
            style = MaterialTheme.typography.h1
        )
    }
}

/*@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}*/

@Preview(showBackground = true)
@Composable
fun HeroAppPreview() {
    HeroAppTheme {

    }
}

