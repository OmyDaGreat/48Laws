package xyz.malefic.laws.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import xyz.malefic.laws.components.Navigation

@Page
@Composable
fun HomePage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .backgroundColor(rgb(240, 240, 240)), // Light gray background - neutral
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Navigation()

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .maxWidth(800.px)
                .padding(30.px)
                .backgroundColor(rgb(248, 248, 248)) // Slightly lighter gray for content area
                .borderRadius(6.px) // Subtle rounded corners
                .boxShadow(offsetX = 0.px, offsetY = 2.px, blurRadius = 10.px, color = rgba(0, 0, 0, 0.1)), // Subtle shadow
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            H1 {
                Span({
                    style {
                        color(rgb(70, 70, 70)) // Medium dark gray - neutral
                        fontWeight(500) // Medium weight - not too bold or light
                        fontSize(32.px)
                        letterSpacing(0.5.px)
                    }
                }) {
                    Text("The 48 Laws of Power")
                }
            }

            P {
                Span({
                    style {
                        color(rgb(90, 90, 90)) // Medium gray for text
                        fontSize(16.px)
                        lineHeight("1.6")
                        textAlign("center")
                    }
                }) {
                    Text("Welcome to the 48 Laws of Power, a collection of timeless principles for achieving and maintaining power in any situation. These laws, derived from the writings of Robert Greene, provide insights into the dynamics of power, influence, and strategic thinking.")
                }
            }

            P {
                Span({
                    style {
                        color(rgb(90, 90, 90))
                        fontSize(16.px)
                        lineHeight("1.6")
                        textAlign("center")
                    }
                }) {
                    Text("The laws have been organized into six thematic groups, each focusing on a different aspect of power dynamics. Explore each section to learn how to master the art of power.")
                }
            }

            Spacer()
            Div({ style { height(30.px) } })

            // Law groups with neutral styling
            Box(
                Modifier
                    .margin(bottom = 25.px)
                    .padding(15.px)
                    .fillMaxWidth()
                    .backgroundColor(rgb(245, 245, 245)) // Very light gray
                    .borderRadius(4.px)
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(80, 80, 80))
                                fontWeight(500)
                                fontSize(20.px)
                            }
                        }) {
                            Text("Laws 1-7: Watch your words and actions")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(100, 100, 100))
                                fontSize(15.px)
                                lineHeight("1.5")
                            }
                        }) {
                            Text("These laws focus on the importance of being mindful of what you say and do. Your words and actions can either build your power or destroy it.")
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 25.px)
                    .padding(15.px)
                    .fillMaxWidth()
                    .backgroundColor(rgb(245, 245, 245))
                    .borderRadius(4.px)
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(80, 80, 80))
                                fontWeight(500)
                                fontSize(20.px)
                            }
                        }) {
                            Text("Laws 8-17: Acquire power in every social interaction")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(100, 100, 100))
                                fontSize(15.px)
                                lineHeight("1.5")
                            }
                        }) {
                            Text("These laws focus on how to gain and maintain power in social situations. Master these principles to influence and control social dynamics.")
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 25.px)
                    .padding(15.px)
                    .fillMaxWidth()
                    .backgroundColor(rgb(245, 245, 245))
                    .borderRadius(4.px)
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(80, 80, 80))
                                fontWeight(500)
                                fontSize(20.px)
                            }
                        }) {
                            Text("Laws 18-24: Mask your intentions and obtain valuable intel")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(100, 100, 100))
                                fontSize(15.px)
                                lineHeight("1.5")
                            }
                        }) {
                            Text("These laws teach you how to conceal your true intentions while gathering information that gives you an advantage. The art of deception and intelligence gathering is crucial to maintaining power.")
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 25.px)
                    .padding(15.px)
                    .fillMaxWidth()
                    .backgroundColor(rgb(245, 245, 245))
                    .borderRadius(4.px)
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(80, 80, 80))
                                fontWeight(500)
                                fontSize(20.px)
                            }
                        }) {
                            Text("Laws 25-32: People's image of you can grant you control")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(100, 100, 100))
                                fontSize(15.px)
                                lineHeight("1.5")
                            }
                        }) {
                            Text("These laws focus on how to shape others' perception of you. By controlling your image and how others see you, you can gain significant power and influence.")
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 25.px)
                    .padding(15.px)
                    .fillMaxWidth()
                    .backgroundColor(rgb(245, 245, 245))
                    .borderRadius(4.px)
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(80, 80, 80))
                                fontWeight(500)
                                fontSize(20.px)
                            }
                        }) {
                            Text("Laws 33-40: Stand firm and win over people's hearts")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(100, 100, 100))
                                fontSize(15.px)
                                lineHeight("1.5")
                            }
                        }) {
                            Text("These laws teach you how to maintain your position of power by standing firm in your convictions while winning the hearts and minds of those around you.")
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 25.px)
                    .padding(15.px)
                    .fillMaxWidth()
                    .backgroundColor(rgb(245, 245, 245))
                    .borderRadius(4.px)
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(80, 80, 80))
                                fontWeight(500)
                                fontSize(20.px)
                            }
                        }) {
                            Text("Laws 41-48: Destroy your enemy and reach greatness")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(100, 100, 100))
                                fontSize(15.px)
                                lineHeight("1.5")
                            }
                        }) {
                            Text("The final laws focus on achieving ultimate power by eliminating threats and ascending to greatness. These laws teach you how to deal with enemies and secure your position at the top.")
                        }
                    }
                }
            }
        }
    }
}
