package aceituno.rojo.mynavigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun HomeScreen (onClickListerner: () -> Unit){
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.weight(1f))
        Text(text = "HOME SCREEN")
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = { onClickListerner() }) {
            Text(text = "Ir a Login Screen")
        }
        Spacer(modifier = Modifier.weight(1f))

    }
}