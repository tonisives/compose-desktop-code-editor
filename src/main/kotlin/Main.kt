import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.application
import androidx.compose.ui.window.singleWindowApplication

@OptIn(ExperimentalComposeUiApi::class)
fun main() = application {
    val state = rememberAppState()

    CodeEditorWindow(state)
}