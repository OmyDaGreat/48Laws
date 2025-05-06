package xyz.malefic.laws.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.boxShadow
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.css.fontFamily
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.fontStyle
import org.jetbrains.compose.web.css.fontWeight
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.letterSpacing
import org.jetbrains.compose.web.css.lineHeight
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.rgb
import org.jetbrains.compose.web.css.rgba
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

/**
 * A component that displays a secret law box with alternating styles.
 */
@Composable
fun SecretLawBox(
    isEven: Boolean = false,
    leftOffset: Int = if (isEven) 80 else 20,
    content: @Composable () -> Unit
) {
    val backgroundColor = if (isEven) rgba(30, 30, 50, 0.8) else rgba(40, 40, 60, 0.7)
    val shadowOffsetX = if (isEven) (-5).px else 5.px

    Box(
        Modifier
            .margin(bottom = 40.px, left = leftOffset.px)
            .padding(20.px)
            .backgroundColor(backgroundColor)
            .borderRadius(4.px)
            .boxShadow(offsetX = shadowOffsetX, offsetY = 5.px, blurRadius = 10.px, color = rgba(0, 0, 0, 0.5)),
    ) {
        Column {
            content()
        }
    }
}

/**
 * A component that displays a secret law title.
 */
@Composable
fun SecretLawTitle(
    title: String,
    isEven: Boolean = false
) {
    val titleColor = if (isEven) rgb(160, 160, 200) else rgb(180, 180, 220)

    H2 {
        Span({
            style {
                color(titleColor)
                fontWeight(400)
                fontSize(22.px)
                letterSpacing(1.px)
                fontStyle("italic")
            }
        }) {
            Text(title)
        }
    }
}

/**
 * A component that displays a secret law description.
 */
@Composable
fun SecretLawDescription(
    description: String,
    isEven: Boolean = false
) {
    val descriptionColor = if (isEven) rgb(190, 190, 210) else rgb(200, 200, 220)

    P {
        Span({
            style {
                color(descriptionColor)
                fontSize(16.px)
                lineHeight("1.7")
                fontWeight(300)
            }
        }) {
            Text(description)
        }
    }
}

/**
 * A component that displays a secret page header.
 */
@Composable
fun SecretPageHeader(
    title: String,
    subtitle: String
) {
    H1 {
        Span({
            style {
                color(rgb(150, 150, 180))
                fontWeight(300)
                fontSize(34.px)
                fontStyle("italic")
                letterSpacing(2.px)
            }
        }) {
            Text(title)
        }
    }

    P {
        Span({
            style {
                color(rgb(180, 180, 200))
                fontWeight(300)
                fontSize(18.px)
                letterSpacing(0.5.px)
                fontStyle("italic")
            }
        }) {
            Text(subtitle)
        }
    }
}

/**
 * A component that displays a secret page layout.
 */
@Composable
fun SecretPageLayout(
    content: @Composable () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .backgroundColor(rgb(20, 20, 25)),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Navigation()

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .maxWidth(800.px)
                .padding(top = 40.px, bottom = 40.px, left = 20.px, right = 20.px),
            horizontalAlignment = Alignment.Start,
        ) {
            content()
        }
    }
}
