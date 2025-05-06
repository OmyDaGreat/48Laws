package xyz.malefic.laws.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.navigation.Link
import org.jetbrains.compose.web.css.px

@Composable
fun Navigation() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.px, bottom = 16.px),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Link(path = "/", text = "Home")
        Link(path = "/laws1-7", text = "Laws 1-7")
        Link(path = "/laws8-17", text = "Laws 8-17")
        Link(path = "/laws18-24", text = "Laws 18-24")
        Link(path = "/laws25-32", text = "Laws 25-32")
        Link(path = "/laws33-40", text = "Laws 33-40")
        Link(path = "/laws41-48", text = "Laws 41-48")
        Link(path = "/about", text = "About")
    }
}
