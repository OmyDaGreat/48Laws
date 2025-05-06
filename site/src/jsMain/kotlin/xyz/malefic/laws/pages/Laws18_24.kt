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

@Page("/laws18-24")
@Composable
fun Laws18_24Page() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .backgroundColor(rgb(20, 20, 25)), // Very dark background for secrecy
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Navigation()

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .maxWidth(800.px)
                .padding(top = 40.px, bottom = 40.px, left = 20.px, right = 20.px),
            horizontalAlignment = Alignment.Start, // Left-aligned for asymmetry
        ) {
            H1 {
                Span({
                    style {
                        color(rgb(150, 150, 180)) // Muted purple-blue for mystery
                        fontWeight(300) // Light weight for secrecy
                        fontSize(34.px)
                        fontStyle("italic") // Italic for deception
                        letterSpacing(2.px)
                    }
                }) {
                    Text("Laws 18-24: Mask your intentions and obtain valuable intel")
                }
            }

            P {
                Span({
                    style {
                        color(rgb(180, 180, 200)) // Light purple-blue
                        fontWeight(300)
                        fontSize(18.px)
                        letterSpacing(0.5.px)
                        fontStyle("italic")
                    }
                }) {
                    Text(
                        "These laws teach you how to conceal your true intentions while gathering information that gives you an advantage. The art of deception and intelligence gathering is crucial to maintaining power.",
                    )
                }
            }

            Spacer()
            Div({ style { height(40.px) } })

            // Laws with secrecy styling - asymmetrical layout with alternating styles
            Box(
                Modifier
                    .margin(bottom = 40.px, left = 0.px)
                    .padding(20.px)
                    .backgroundColor(rgba(40, 40, 60, 0.7)) // Semi-transparent for mystery
                    .borderRadius(4.px)
                    .boxShadow(offsetX = 5.px, offsetY = 5.px, blurRadius = 10.px, color = rgba(0, 0, 0, 0.5))
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(180, 180, 220))
                                fontWeight(400)
                                fontSize(22.px)
                                letterSpacing(1.px)
                                fontStyle("italic")
                            }
                        }) {
                            Text("Law 18: Do Not Build Fortresses to Protect Yourself – Isolation is Dangerous")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(200, 200, 220))
                                fontSize(16.px)
                                lineHeight("1.7")
                                fontWeight(300)
                            }
                        }) {
                            Text(
                                "The world is dangerous and enemies are everywhere – everyone has to protect themselves. A fortress seems the safest. But isolation exposes you to more dangers than it protects you from – it cuts you off from valuable information, it makes you conspicuous and an easy target. Better to circulate among people, find allies, mingle. You are shielded from your enemies by the crowd.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 40.px, left = 60.px) // Offset for asymmetry
                    .padding(20.px)
                    .backgroundColor(rgba(30, 30, 50, 0.8))
                    .borderRadius(4.px)
                    .boxShadow(offsetX = (-5).px, offsetY = 5.px, blurRadius = 10.px, color = rgba(0, 0, 0, 0.5))
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(160, 160, 200))
                                fontWeight(400)
                                fontSize(22.px)
                                letterSpacing(1.px)
                                fontStyle("italic")
                            }
                        }) {
                            Text("Law 19: Know Who You're Dealing with – Do Not Offend the Wrong Person")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(190, 190, 210))
                                fontSize(16.px)
                                lineHeight("1.7")
                                fontWeight(300)
                            }
                        }) {
                            Text(
                                "There are many different kinds of people in the world, and you can never assume that everyone will react to your strategies in the same way. Deceive or outmaneuver some people and they will spend the rest of their lives seeking revenge. They are wolves in lambs' clothing. Choose your victims and opponents carefully, then – never offend or deceive the wrong person.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 40.px, left = 20.px) // Slight offset
                    .padding(20.px)
                    .backgroundColor(rgba(40, 40, 60, 0.7))
                    .borderRadius(4.px)
                    .boxShadow(offsetX = 5.px, offsetY = 5.px, blurRadius = 10.px, color = rgba(0, 0, 0, 0.5))
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(180, 180, 220))
                                fontWeight(400)
                                fontSize(22.px)
                                letterSpacing(1.px)
                                fontStyle("italic")
                            }
                        }) {
                            Text("Law 20: Do Not Commit to Anyone")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(200, 200, 220))
                                fontSize(16.px)
                                lineHeight("1.7")
                                fontWeight(300)
                            }
                        }) {
                            Text(
                                "It is the fool who always rushes to take sides. Do not commit to any side or cause but yourself. By maintaining your independence, you become the master of others – playing people against one another, making them pursue you.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 40.px, left = 80.px) // Larger offset
                    .padding(20.px)
                    .backgroundColor(rgba(30, 30, 50, 0.8))
                    .borderRadius(4.px)
                    .boxShadow(offsetX = (-5).px, offsetY = 5.px, blurRadius = 10.px, color = rgba(0, 0, 0, 0.5))
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(160, 160, 200))
                                fontWeight(400)
                                fontSize(22.px)
                                letterSpacing(1.px)
                                fontStyle("italic")
                            }
                        }) {
                            Text("Law 21: Play a Sucker to Catch a Sucker – Seem Dumber Than Your Mark")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(190, 190, 210))
                                fontSize(16.px)
                                lineHeight("1.7")
                                fontWeight(300)
                            }
                        }) {
                            Text(
                                "No one likes feeling stupider than the next person. The trick, then, is to make your victims feel smart – and not just smart, but smarter than you are. Once convinced of this, they will never suspect that you may have ulterior motives.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 40.px, left = 40.px) // Medium offset
                    .padding(20.px)
                    .backgroundColor(rgba(40, 40, 60, 0.7))
                    .borderRadius(4.px)
                    .boxShadow(offsetX = 5.px, offsetY = 5.px, blurRadius = 10.px, color = rgba(0, 0, 0, 0.5))
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(180, 180, 220))
                                fontWeight(400)
                                fontSize(22.px)
                                letterSpacing(1.px)
                                fontStyle("italic")
                            }
                        }) {
                            Text("Law 22: Use the Surrender Tactic: Transform Weakness into Power")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(200, 200, 220))
                                fontSize(16.px)
                                lineHeight("1.7")
                                fontWeight(300)
                            }
                        }) {
                            Text(
                                "When you are weaker, never fight for honor's sake; choose surrender instead. Surrender gives you time to recover, time to torment and irritate your conqueror, time to wait for his power to wane. Do not give him the satisfaction of fighting and defeating you – surrender first. By turning the other cheek you infuriate and unsettle him. Make surrender a tool of power.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 40.px, left = 100.px) // Largest offset
                    .padding(20.px)
                    .backgroundColor(rgba(30, 30, 50, 0.8))
                    .borderRadius(4.px)
                    .boxShadow(offsetX = (-5).px, offsetY = 5.px, blurRadius = 10.px, color = rgba(0, 0, 0, 0.5))
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(160, 160, 200))
                                fontWeight(400)
                                fontSize(22.px)
                                letterSpacing(1.px)
                                fontStyle("italic")
                            }
                        }) {
                            Text("Law 23: Concentrate Your Forces")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(190, 190, 210))
                                fontSize(16.px)
                                lineHeight("1.7")
                                fontWeight(300)
                            }
                        }) {
                            Text(
                                "Conserve your forces and energies by keeping them concentrated at their strongest point. You gain more by finding a rich mine and mining it deeper, than by flitting from one shallow mine to another – intensity defeats extensity every time. When looking for sources of power to elevate you, find the one key patron, the fat cow who will give you milk for a long time to come.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 40.px, left = 30.px) // Medium offset
                    .padding(20.px)
                    .backgroundColor(rgba(40, 40, 60, 0.7))
                    .borderRadius(4.px)
                    .boxShadow(offsetX = 5.px, offsetY = 5.px, blurRadius = 10.px, color = rgba(0, 0, 0, 0.5))
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(180, 180, 220))
                                fontWeight(400)
                                fontSize(22.px)
                                letterSpacing(1.px)
                                fontStyle("italic")
                            }
                        }) {
                            Text("Law 24: Play the Perfect Courtier")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(200, 200, 220))
                                fontSize(16.px)
                                lineHeight("1.7")
                                fontWeight(300)
                            }
                        }) {
                            Text(
                                "The perfect courtier thrives in a world where everything revolves around power and political dexterity. He has mastered the art of indirection; he flatters, yields to superiors, and asserts power over others in the most oblique and graceful manner. Learn and apply the laws of courtiership and there will be no limit to how far you can rise in the court.",
                            )
                        }
                    }
                }
            }
        }
    }
}
