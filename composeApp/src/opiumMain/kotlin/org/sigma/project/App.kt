import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.TooltipArea
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.sigma.project.requests.MainRequests
import androidx.compose.foundation.border
import coil.compose.*

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun App() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF161616))
            .border(1.dp, Color.Black),
        contentAlignment = Alignment.TopStart
    ) {
        TooltipArea(
            tooltip = {
                Box(
                    modifier = Modifier
                        .background(MaterialTheme.colors.surface)
                        .padding(8.dp)
                ) {
                    Text(MainRequests.statusCode)
                }
            },
            delayMillis = 600
        ) {
            IconButton(
                onClick = {},
                modifier = Modifier.padding(start = 10.dp, top = 10.dp)
            ) {
                val painter = rememberImagePainter("https://media.discordapp.net/attachments/1196903744026181692/1282132133212590121/menuimg.png?ex=66de3e19&is=66dcec99&hm=cbdce6d7660e5a86b18c527c06a930a2b57099e4bf77bc3ce30b3f0b45957ee2&=&format=webp&quality=lossless")
                Icon(
                    painter = painter,
                    contentDescription = ":owl:"
                )
            }
        }
    }
}