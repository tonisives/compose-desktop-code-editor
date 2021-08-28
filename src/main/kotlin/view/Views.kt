import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ImageButton(resourceName: String = "", action: (() -> Unit)? = null) {
    Button(
        modifier = Modifier.size(50.dp, 50.dp),
        onClick = { action?.invoke() }
    ) {
        Image(painterResource(resourceName), "")

    }
}