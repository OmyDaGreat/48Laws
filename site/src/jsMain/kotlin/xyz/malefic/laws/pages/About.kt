package xyz.malefic.laws.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
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
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.css.color
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
import xyz.malefic.laws.components.Navigation

@Page("/about")
@Composable
fun AboutPage() {
    Column(
        modifier =
            Modifier
                .fillMaxSize()
                .backgroundColor(rgb(25, 25, 50)), // Deep blue-purple background
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Navigation()

        Column(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .maxWidth(850.px)
                    .padding(40.px)
                    .backgroundColor(rgba(255, 255, 255, 0.05)) // Translucent white overlay
                    .borderRadius(15.px) // Rounded corners
                    .boxShadow(offsetX = 0.px, offsetY = 0.px, blurRadius = 30.px, color = rgba(0, 0, 0, 0.3)),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            // Creative title with vibrant color
            H1 {
                Span({
                    style {
                        color(rgb(255, 100, 200)) // Vibrant pink
                        fontWeight(800) // Extra bold
                        fontSize(48.px)
                        letterSpacing(2.px)
                    }
                }) {
                    Text("About This Project")
                }
            }

            Div({ style { height(50.px) } }) // Spacer

            // Content without box container
            Column(
                modifier =
                    Modifier
                        .margin(bottom = 35.px)
                        .padding(30.px)
                        .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    H2 {
                        Span({
                            style {
                                color(rgb(255, 255, 255))
                                fontWeight(700)
                                fontSize(28.px)
                                letterSpacing(1.px)
                                textAlign("center")
                            }
                        }) {
                            Text("Created by Om Gupta")
                        }
                    }

                    Div({ style { height(15.px) } }) // Smaller spacer

                    P {
                        Span({
                            style {
                                color(rgb(200, 200, 255)) // Light blue-purple
                                fontSize(18.px)
                                lineHeight("1.6")
                                textAlign("center")
                            }
                        }) {
                            Text("For AP Psychology")
                        }
                    }

                    Div({ style { height(15.px) } }) // Spacer

                    P {
                        Span({
                            style {
                                color(rgb(255, 200, 230)) // Light pink
                                fontSize(18.px)
                                lineHeight("1.6")
                                fontStyle("italic")
                                textAlign("center")
                            }
                        }) {
                            Text("Thanks Mr. Taylor!")
                        }
                    }

                    Div({ style { height(25.px) } }) // Spacer between sections

                    // Decorative divider
                    Box(
                        Modifier
                            .maxWidth(600.px)
                            .margin(bottom = 25.px)
                            .backgroundColor(rgb(150, 100, 255))
                            .padding(top = 2.px),
                    )

                    Div({ style { height(15.px) } }) // Spacer after divider

                    P {
                        Span({
                            style {
                                color(rgb(220, 220, 255)) // Light blue-white
                                fontSize(18.px)
                                lineHeight("1.8")
                                letterSpacing(0.5.px)
                                textAlign("center")
                            }
                        }) {
                            Text(
                                "This project presents Robert Greene's 48 Laws of Power in a structured format, organized into thematic groups to help understand the principles of power dynamics.",
                            )
                        }
                    }

                    Div({ style { height(40.px) } }) // Spacer before tools section

                    // Tools section box
                    Box(
                        Modifier
                            .maxWidth(600.px)
                            .margin(top = 10.px)
                            .padding(20.px)
                            .backgroundColor(rgba(150, 100, 255, 0.15)) // Light purple with transparency
                            .borderRadius(10.px)
                            .boxShadow(offsetX = 0.px, offsetY = 2.px, blurRadius = 8.px, color = rgba(0, 0, 0, 0.2)),
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            H2 {
                                Span({
                                    style {
                                        color(rgb(200, 180, 255)) // Light purple
                                        fontWeight(600)
                                        fontSize(22.px)
                                        letterSpacing(0.5.px)
                                        textAlign("center")
                                    }
                                }) {
                                    Text("Built With")
                                }
                            }

                            Div({ style { height(10.px) } }) // Small spacer

                            P {
                                Span({
                                    style {
                                        color(rgb(230, 230, 255)) // Very light blue-white
                                        fontSize(16.px)
                                        lineHeight("1.6")
                                        textAlign("center")
                                    }
                                }) {
                                    Text("Kotlin + Compose for Web + Kobweb Framework")
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
