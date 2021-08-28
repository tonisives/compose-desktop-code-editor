import androidx.compose.runtime.*
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.runtime.Composable

@Composable
fun rememberAppState() = remember {
    AppState()
}

class AppState {
    val editorText = mutableStateOf("@plantuml\n\n@end")
    var showSettings by mutableStateOf(true)

    val run = {
        println("run: ${editorText.value}")
    }

    val close = {

    }
}
