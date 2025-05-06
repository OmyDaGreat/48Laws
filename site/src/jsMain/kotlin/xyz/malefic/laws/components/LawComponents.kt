package xyz.malefic.laws.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.css.fontFamily
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.fontWeight
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.letterSpacing
import org.jetbrains.compose.web.css.lineHeight
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.rgb
import org.jetbrains.compose.web.css.textAlign
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

/**
 * A component that displays a law box with a title and description.
 */
@Composable
fun LawBox(
    modifier: Modifier = Modifier,
    backgroundColor: CSSColorValue = rgb(50, 50, 70),
    borderRadius: Int = 4,
    content: @Composable () -> Unit
) {
    Box(
        modifier
            .margin(bottom = 30.px)
            .padding(20.px)
            .backgroundColor(backgroundColor)
            .borderRadius(borderRadius.px)
    ) {
        Column {
            content()
        }
    }
}

/**
 * A component that displays a law title.
 */
@Composable
fun LawTitle(
    title: String,
    color: CSSColorValue = rgb(255, 50, 50),
    fontWeight: Int = 700,
    fontSize: Int = 24,
    letterSpacing: Double = 0.8,
    fontFamily: String = "Impact, Arial Black, Helvetica, sans-serif"
) {
    H2 {
        Span({
            style {
                color(color)
                fontWeight(fontWeight)
                fontSize(fontSize.px)
                letterSpacing(letterSpacing.px)
                fontFamily(fontFamily)
            }
        }) {
            Text(title)
        }
    }
}

/**
 * A component that displays a law description.
 */
@Composable
fun LawDescription(
    description: String,
    color: CSSColorValue = rgb(220, 220, 220),
    fontSize: Int = 16,
    lineHeight: String = "1.6",
    fontWeight: Int = 500
) {
    P {
        Span({
            style {
                color(color)
                fontSize(fontSize.px)
                lineHeight(lineHeight)
                fontWeight(fontWeight)
            }
        }) {
            Text(description)
        }
    }
}

/**
 * A component that displays a page header.
 */
@Composable
fun PageHeader(
    title: String,
    subtitle: String,
    titleColor: CSSColorValue = rgb(220, 0, 0),
    titleFontWeight: Int = 700,
    titleFontSize: Int = 36,
    titleLetterSpacing: Double = 1.0,
    titleFontFamily: String = "Impact, Arial Black, Helvetica, sans-serif",
    subtitleColor: CSSColorValue = rgb(200, 200, 200),
    subtitleFontWeight: Int = 500,
    subtitleFontSize: Int = 18,
    subtitleLetterSpacing: Double = 0.5
) {
    H1 {
        Span({
            style {
                color(titleColor)
                fontWeight(titleFontWeight)
                fontSize(titleFontSize.px)
                letterSpacing(titleLetterSpacing.px)
                fontFamily(titleFontFamily)
            }
        }) {
            Text(title)
        }
    }

    P {
        Span({
            style {
                color(subtitleColor)
                fontWeight(subtitleFontWeight)
                fontSize(subtitleFontSize.px)
                letterSpacing(subtitleLetterSpacing.px)
                textAlign("center")
            }
        }) {
            Text(subtitle)
        }
    }
}

/**
 * A component that displays a spacer.
 */
@Composable
fun VerticalSpacer(height: Int = 40) {
    Spacer()
    Div({ style { this.height(height.px) } })
}

/**
 * A component that displays a page layout.
 */
@Composable
fun PageLayout(
    backgroundColor: CSSColorValue = rgb(30, 30, 50),
    contentBackgroundColor: CSSColorValue = rgb(40, 40, 60),
    maxWidth: Int = 850,
    content: @Composable () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .backgroundColor(backgroundColor),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Navigation()

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .maxWidth(maxWidth.px)
                .padding(top = 40.px, bottom = 40.px, left = 20.px, right = 20.px)
                .backgroundColor(contentBackgroundColor)
                .borderRadius(0.px),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            content()
        }
    }
}
