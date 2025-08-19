package com.coding.challenge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.coding.challenge.ui.theme.CodingChallengeTheme
import kotlinx.coroutines.runBlocking

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { CodingChallengeTheme { MainScreen() } }
    }
}

@Composable
private fun MainScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        val listState: LazyListState = rememberLazyListState()
        val films by rememberSaveable { mutableStateOf(emptyList<Film>()) }

        LaunchedEffect(key1 = true, block = {
            films.toMutableList().addAll(
                runBlocking {
                    NetworkHelper().createRetrofit().create(GhibliFilmsService::class.java).films()
                }
            )
        })
        FilmsList(films, listState)
    }
}

// ===== FILMS LIST COMPOSABLES =====

@Composable
fun FilmsList(list: List<Film>, listState: LazyListState, onClick: () -> Unit = {}) {
    LazyColumn(Modifier.fillMaxWidth(), listState) {
        this.items(list, { item -> item.id }) { film ->
            FilmItem(
                title = film.title,
                releaseYear = film.release_date,
                director = film.director,
                onClick = onClick
            )
        }
    }
}

@Composable
fun FilmItem(
    title: String,
    releaseYear: String,
    director: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
) = Row(modifier.clickable { onClick() }, verticalAlignment = Alignment.CenterVertically) {
    Text(
        title,
        Modifier
            .weight(1f)
            .padding(start = 16.dp),
    )
    Text(
        releaseYear,
        Modifier
            .weight(1f)
            .padding(start = 16.dp),
    )
    Text(
        director,
        Modifier
            .weight(1f)
            .padding(start = 16.dp),
    )

}

// ===== PREVIEW =====

@Preview(showBackground = true)
@Composable
fun GhibliPreview() {
    CodingChallengeTheme { MainScreen() }
}
