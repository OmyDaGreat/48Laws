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

@Page("/laws41-48")
@Composable
fun Laws41_48Page() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .backgroundColor(rgb(10, 10, 10)), // Almost black background for dramatic effect
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Navigation()

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .maxWidth(800.px)
                .padding(top = 40.px, bottom = 40.px, left = 20.px, right = 20.px),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            H1 {
                Span({
                    style {
                        color(rgb(220, 0, 0)) // Blood red for destruction
                        fontWeight(800) // Extra bold for greatness
                        fontSize(40.px)
                        letterSpacing(2.px)
                    }
                }) {
                    Text("Laws 41-48: Destroy your enemy and reach greatness")
                }
            }

            P {
                Span({
                    style {
                        color(rgb(200, 200, 200))
                        fontWeight(400)
                        fontSize(18.px)
                        letterSpacing(0.5.px)
                        textAlign("center")
                    }
                }) {
                    Text(
                        "The final laws focus on achieving ultimate power by eliminating threats and ascending to greatness. These laws teach you how to deal with enemies and secure your position at the top.",
                    )
                }
            }

            Spacer()
            Div({ style { height(40.px) } })

            // Dynamic layout with dramatic contrasts
            Box(
                Modifier
                    .margin(bottom = 40.px)
                    .padding(top = 30.px, bottom = 30.px, left = 30.px, right = 30.px)
                    .backgroundColor(rgb(30, 0, 0)) // Dark red background
                    .borderRadius(0.px) // Sharp edges for dramatic effect
                    .boxShadow(offsetX = 10.px, offsetY = 10.px, blurRadius = 0.px, color = rgb(100, 0, 0)) // Hard shadow
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(255, 255, 255)) // White for contrast
                                fontWeight(700)
                                fontSize(28.px)
                                letterSpacing(1.px)
                            }
                        }) {
                            Text("Law 41: Avoid Stepping into a Great Man's Shoes")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(200, 200, 200))
                                fontSize(16.px)
                                lineHeight("1.7")
                                fontWeight(400)
                            }
                        }) {
                            Text(
                                "What happens first always appears better and more original than what comes after. If you succeed a great man or have a famous parent, you will have to accomplish double their achievements to outshine them. Do not get lost in their shadow, or stuck in a past not of your own making: Establish your own name and identity by changing course. Slay the overbearing father, disparage his legacy, and gain power by shining in your own way.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 40.px, left = 60.px) // Offset for dynamic layout
                    .padding(top = 30.px, bottom = 30.px, left = 30.px, right = 30.px)
                    .backgroundColor(rgb(40, 40, 40)) // Dark gray
                    .borderRadius(0.px)
                    .boxShadow(offsetX = (-10).px, offsetY = 10.px, blurRadius = 0.px, color = rgb(100, 100, 100))
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(220, 0, 0)) // Red title
                                fontWeight(700)
                                fontSize(28.px)
                                letterSpacing(1.px)
                            }
                        }) {
                            Text("Law 42: Strike the Shepherd and the Sheep Will Scatter")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(200, 200, 200))
                                fontSize(16.px)
                                lineHeight("1.7")
                                fontWeight(400)
                            }
                        }) {
                            Text(
                                "Trouble can often be traced to a single strong individual – the stirrer, the arrogant underling, the poisoner of goodwill. If you allow such people room to operate, others will succumb to their influence. Do not wait for the troubles they cause to multiply, do not try to negotiate with them – they are irredeemable. Neutralize their influence by isolating or banishing them. Strike at the source of the trouble and the sheep will scatter.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 40.px, left = 30.px) // Slight offset
                    .padding(top = 30.px, bottom = 30.px, left = 30.px, right = 30.px)
                    .backgroundColor(rgb(30, 0, 0)) // Dark red background
                    .borderRadius(0.px)
                    .boxShadow(offsetX = 10.px, offsetY = 10.px, blurRadius = 0.px, color = rgb(100, 0, 0))
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(255, 255, 255)) // White for contrast
                                fontWeight(700)
                                fontSize(28.px)
                                letterSpacing(1.px)
                            }
                        }) {
                            Text("Law 43: Work on the Hearts and Minds of Others")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(200, 200, 200))
                                fontSize(16.px)
                                lineHeight("1.7")
                                fontWeight(400)
                            }
                        }) {
                            Text(
                                "Coercion creates a reaction that will eventually work against you. You must seduce others into wanting to move in your direction. A person you have seduced becomes your loyal pawn. And the way to seduce others is to operate on their individual psychologies and weaknesses. Soften up the resistant by working on their emotions, playing on what they hold dear and what they fear. Ignore the hearts and minds of others and they will grow to hate you.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 40.px, left = 90.px) // Larger offset
                    .padding(top = 30.px, bottom = 30.px, left = 30.px, right = 30.px)
                    .backgroundColor(rgb(40, 40, 40)) // Dark gray
                    .borderRadius(0.px)
                    .boxShadow(offsetX = (-10).px, offsetY = 10.px, blurRadius = 0.px, color = rgb(100, 100, 100))
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(220, 0, 0)) // Red title
                                fontWeight(700)
                                fontSize(28.px)
                                letterSpacing(1.px)
                            }
                        }) {
                            Text("Law 44: Disarm and Infuriate with the Mirror Effect")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(200, 200, 200))
                                fontSize(16.px)
                                lineHeight("1.7")
                                fontWeight(400)
                            }
                        }) {
                            Text(
                                "The mirror reflects reality, but it is also the perfect tool for deception: When you mirror your enemies, doing exactly as they do, they cannot figure out your strategy. The Mirror Effect mocks and humiliates them, making them overreact. By holding up a mirror to their psyches, you seduce them with the illusion that you share their values; by holding up a mirror to their actions, you teach them a lesson. Few can resist the power of the Mirror Effect.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 40.px)
                    .padding(top = 30.px, bottom = 30.px, left = 30.px, right = 30.px)
                    .backgroundColor(rgb(30, 0, 0)) // Dark red background
                    .borderRadius(0.px)
                    .boxShadow(offsetX = 10.px, offsetY = 10.px, blurRadius = 0.px, color = rgb(100, 0, 0))
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(255, 255, 255)) // White for contrast
                                fontWeight(700)
                                fontSize(28.px)
                                letterSpacing(1.px)
                            }
                        }) {
                            Text("Law 45: Preach the Need for Change, But Never Reform Too Much at Once")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(200, 200, 200))
                                fontSize(16.px)
                                lineHeight("1.7")
                                fontWeight(400)
                            }
                        }) {
                            Text(
                                "Everyone understands the need for change in the abstract, but on the day-to-day level people are creatures of habit. Too much innovation is traumatic, and will lead to revolt. If you are new to a position of power, or an outsider trying to build a power base, make a show of respecting the old way of doing things. If change is necessary, make it feel like a gentle improvement on the past.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 40.px, left = 120.px) // Largest offset
                    .padding(top = 30.px, bottom = 30.px, left = 30.px, right = 30.px)
                    .backgroundColor(rgb(40, 40, 40)) // Dark gray
                    .borderRadius(0.px)
                    .boxShadow(offsetX = (-10).px, offsetY = 10.px, blurRadius = 0.px, color = rgb(100, 100, 100))
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(220, 0, 0)) // Red title
                                fontWeight(700)
                                fontSize(28.px)
                                letterSpacing(1.px)
                            }
                        }) {
                            Text("Law 46: Never Appear Too Perfect")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(200, 200, 200))
                                fontSize(16.px)
                                lineHeight("1.7")
                                fontWeight(400)
                            }
                        }) {
                            Text(
                                "Appearing better than others is always dangerous, but most dangerous of all is to appear to have no faults or weaknesses. Envy creates silent enemies. It is smart to occasionally display defects, and admit to harmless vices, in order to deflect envy and appear more human and approachable. Only gods and the dead can seem perfect with impunity.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 40.px, left = 60.px) // Medium offset
                    .padding(top = 30.px, bottom = 30.px, left = 30.px, right = 30.px)
                    .backgroundColor(rgb(30, 0, 0)) // Dark red background
                    .borderRadius(0.px)
                    .boxShadow(offsetX = 10.px, offsetY = 10.px, blurRadius = 0.px, color = rgb(100, 0, 0))
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(255, 255, 255)) // White for contrast
                                fontWeight(700)
                                fontSize(28.px)
                                letterSpacing(1.px)
                            }
                        }) {
                            Text("Law 47: Do Not Go Past the Mark You Aimed For; In Victory, Learn When to Stop")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(200, 200, 200))
                                fontSize(16.px)
                                lineHeight("1.7")
                                fontWeight(400)
                            }
                        }) {
                            Text(
                                "The moment of victory is often the moment of greatest peril. In the heat of victory, arrogance and overconfidence can push you past the goal you had aimed for, and by going too far, you make more enemies than you defeat. Do not allow success to go to your head. There is no substitute for strategy and careful planning. Set a goal, and when you reach it, stop.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 40.px)
                    .padding(top = 30.px, bottom = 30.px, left = 30.px, right = 30.px)
                    .backgroundColor(rgb(40, 40, 40)) // Dark gray
                    .borderRadius(0.px)
                    .boxShadow(offsetX = (-10).px, offsetY = 10.px, blurRadius = 0.px, color = rgb(100, 100, 100))
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(220, 0, 0)) // Red title
                                fontWeight(700)
                                fontSize(28.px)
                                letterSpacing(1.px)
                            }
                        }) {
                            Text("Law 48: Assume Formlessness")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(200, 200, 200))
                                fontSize(16.px)
                                lineHeight("1.7")
                                fontWeight(400)
                            }
                        }) {
                            Text(
                                "By taking a shape, by having a visible plan, you open yourself to attack. Instead of taking a form for your enemy to grasp, keep yourself adaptable and on the move. Accept the fact that nothing is certain and no law is fixed. The best way to protect yourself is to be as fluid and formless as water; never bet on stability or lasting order. Everything changes.",
                            )
                        }
                    }
                }
            }
        }
    }
}
