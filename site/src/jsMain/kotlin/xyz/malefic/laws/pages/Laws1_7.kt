package xyz.malefic.laws.pages

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
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text
import xyz.malefic.laws.components.Navigation

@Page("/laws1-7")
@Composable
fun Laws1_7Page() {
    Column(
        modifier =
            Modifier
                .fillMaxSize()
                .backgroundColor(rgb(245, 245, 240)),
        // Soft off-white background for mindfulness
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Navigation()

        Column(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .maxWidth(700.px) // Slightly narrower for minimalist feel
                    .padding(top = 40.px, bottom = 40.px, left = 20.px, right = 20.px)
                    .borderRadius(4.px),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            H1 {
                Span({
                    style {
                        color(rgb(90, 90, 90)) // Muted dark gray
                        fontWeight(300) // Lighter weight for mindfulness
                        fontSize(32.px)
                        letterSpacing(1.5.px)
                    }
                }) {
                    Text("Laws 1-7: Watch your words and actions")
                }
            }

            P {
                Span({
                    style {
                        color(rgb(100, 100, 100))
                        fontStyle("italic")
                        fontSize(18.px)
                        letterSpacing(0.5.px)
                    }
                }) {
                    Text(
                        "The maintenance of your reputation depends on constant upkeep as well as thought to the words you use and the actions you take.",
                    )
                }
            }

            Spacer()
            Div({ style { height(40.px) } })

            // Laws with minimalist styling
            Box(Modifier.margin(bottom = 30.px)) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(80, 80, 80))
                                fontWeight(400)
                                fontSize(22.px)
                                letterSpacing(0.8.px)
                            }
                        }) {
                            Text("Law 1: Never Outshine the Master")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(110, 110, 110))
                                fontSize(16.px)
                                lineHeight("1.6")
                            }
                        }) {
                            Text(
                                "Make sure to keep those above you in power and influence have the feeling of superiority. However, never let too much of your talent show lest comfort turns into fear.",
                            )
                        }
                    }
                }
            }

            Box(Modifier.margin(bottom = 30.px).padding(left = 20.px)) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(80, 80, 80))
                                fontWeight(400)
                                fontSize(22.px)
                                letterSpacing(0.8.px)
                            }
                        }) {
                            Text("Law 2: Never Put Too Much Trust in Friends, Learn How to Use Enemies")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(110, 110, 110))
                                fontSize(16.px)
                                lineHeight("1.6")
                            }
                        }) {
                            Text(
                                "Compared to prior enemies, friends have much less to prove and thus are more likely to betray you. Enemies, on the other hand, are often more loyal thanks to the opposite. This law can be considered extremely similar to the common saying: \"Keep your friends close, but your enemies closer.\"",
                            )
                        }
                    }
                }
            }

            Box(Modifier.margin(bottom = 30.px)) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(80, 80, 80))
                                fontWeight(400)
                                fontSize(22.px)
                                letterSpacing(0.8.px)
                            }
                        }) {
                            Text("Law 3: Conceal Your Intentions")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(110, 110, 110))
                                fontSize(16.px)
                                lineHeight("1.6")
                            }
                        }) {
                            Text(
                                "Information is worth more than gold, and that also applies to motivations. If your rivals are unable to decipher them, they can not create a proper counter strategy. This is especially true in the case of a negotiation.",
                            )
                        }
                    }
                }
            }

            Box(Modifier.margin(bottom = 30.px).padding(left = 20.px)) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(80, 80, 80))
                                fontWeight(400)
                                fontSize(22.px)
                                letterSpacing(0.8.px)
                            }
                        }) {
                            Text("Law 4: Always Say Less Than Necessary")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(110, 110, 110))
                                fontSize(16.px)
                                lineHeight("1.6")
                            }
                        }) {
                            Text(
                                "Less is more, and that definitely applies to words as well. Being able to explain a complicated topic in few words is in itself a power move, and the lack of that ability can be taken as a sign of weakness or commonality.",
                            )
                        }
                    }
                }
            }

            Box(Modifier.margin(bottom = 30.px)) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(80, 80, 80))
                                fontWeight(400)
                                fontSize(22.px)
                                letterSpacing(0.8.px)
                            }
                        }) {
                            Text("Law 5: So Much Depends on Reputation – Guard It with Your Life")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(110, 110, 110))
                                fontSize(16.px)
                                lineHeight("1.6")
                            }
                        }) {
                            Text(
                                "The prior four laws themselves were already so centered on reputation that seeing where this one is going is not too difficult. If information is worth more than gold, reputation is akin to diamonds. Without a reputation, you are nothing. With a good reputation, you can do anything.",
                            )
                        }
                    }
                }
            }

            Box(Modifier.margin(bottom = 30.px).padding(left = 20.px)) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(80, 80, 80))
                                fontWeight(400)
                                fontSize(22.px)
                                letterSpacing(0.8.px)
                            }
                        }) {
                            Text("Law 6: Court Attention at All Cost")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(110, 110, 110))
                                fontSize(16.px)
                                lineHeight("1.6")
                            }
                        }) {
                            Text(
                                "Pretty simply put, power can only come to those who are seen. Without the spotlight, it is impossible to achieve anything.",
                            )
                        }
                    }
                }
            }

            Box(Modifier.margin(bottom = 30.px)) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(80, 80, 80))
                                fontWeight(400)
                                fontSize(22.px)
                                letterSpacing(0.8.px)
                            }
                        }) {
                            Text("Law 7: Get Others to Do the Work for You, But Always Take the Credit")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(110, 110, 110))
                                fontSize(16.px)
                                lineHeight("1.6")
                            }
                        }) {
                            Text(
                                "Another simple one, but one that is often overlooked because of pesky \"morals.\" To truly obtain power, you must be able to throw those aside in favor of being the most efficient with your own time. Of course, that does not always need to factor in others' time.",
                            )
                        }
                    }
                }
            }
        }
    }
}
