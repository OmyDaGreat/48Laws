package xyz.malefic.laws.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import xyz.malefic.laws.components.Navigation

@Page("/laws1-7")
@Composable
fun Laws1_7Page() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .backgroundColor(rgb(245, 245, 240)), // Soft off-white background for mindfulness
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Navigation()

        Column(
            modifier = Modifier
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
                        "The first seven laws focus on the importance of being mindful of what you say and do. Your words and actions can either build your power or destroy it.",
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
                                "Always make those above you feel comfortably superior. In your desire to please and impress them, do not go too far in displaying your talents or you might accomplish the opposite – inspire fear and insecurity.",
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
                                "Be wary of friends-they will betray you more quickly, for they are easily aroused to envy. They also become spoiled and tyrannical. But hire a former enemy and he will be more loyal than a friend, because he has more to prove.",
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
                                "Keep people off-balance and in the dark by never revealing the purpose behind your actions. If they have no clue what you are up to, they cannot prepare a defense.",
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
                                "When you are trying to impress people with words, the more you say, the more common you appear, and the less in control. Even if you are saying something banal, it will seem original if you make it vague, open-ended, and sphinx-like.",
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
                                "Reputation is the cornerstone of power. Through reputation alone you can intimidate and win; once it slips, however, you are vulnerable, and will be attacked on all sides.",
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
                                "Everything is judged by its appearance; what is unseen counts for nothing. Never let yourself get lost in the crowd, then, or buried in oblivion. Stand out. Be conspicuous, at all cost.",
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
                                "Use the wisdom, knowledge, and legwork of other people to further your own cause. Not only will such assistance save you valuable time and energy, it will give you a godlike aura of efficiency and speed.",
                            )
                        }
                    }
                }
            }
        }
    }
}
