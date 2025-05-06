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

@Page("/laws8-17")
@Composable
fun Laws8_17Page() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .backgroundColor(rgb(30, 30, 50)), // Dark blue-black for power
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Navigation()

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .maxWidth(850.px) // Wider for dominance
                .padding(top = 40.px, bottom = 40.px, left = 20.px, right = 20.px)
                .backgroundColor(rgb(40, 40, 60)) // Slightly lighter background for content
                .borderRadius(0.px), // Sharp edges for power
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            H1 {
                Span({
                    style {
                        color(rgb(220, 0, 0)) // Strong red for power
                        fontWeight(700) // Bold for dominance
                        fontSize(36.px)
                        letterSpacing(1.px)
                    }
                }) {
                    Text("LAWS 8-17: ACQUIRE POWER IN EVERY SOCIAL INTERACTION")
                }
            }

            P {
                Span({
                    style {
                        color(rgb(200, 200, 200)) // Light gray
                        fontWeight(500)
                        fontSize(18.px)
                        letterSpacing(0.5.px)
                        textAlign("center")
                    }
                }) {
                    Text(
                        "These laws focus on how to GAIN and MAINTAIN power in social situations. Master these principles to INFLUENCE and CONTROL social dynamics.",
                    )
                }
            }

            Spacer()
            Div({ style { height(40.px) } })

            // Laws with power styling
            Box(
                Modifier
                    .margin(bottom = 30.px)
                    .padding(20.px)
                    .backgroundColor(rgb(50, 50, 70))
                    .borderRadius(4.px)
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(255, 50, 50)) // Bright red
                                fontWeight(700)
                                fontSize(24.px)
                                letterSpacing(0.8.px)
                            }
                        }) {
                            Text("LAW 8: MAKE OTHERS COME TO YOU – USE BAIT IF NECESSARY")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(220, 220, 220))
                                fontSize(16.px)
                                lineHeight("1.6")
                                fontWeight(500)
                            }
                        }) {
                            Text(
                                "When you FORCE the other person to act, YOU are the one in CONTROL. It is always better to make your opponent come to you, abandoning his own plans in the process. LURE him with fabulous gains – then ATTACK.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 30.px)
                    .padding(20.px)
                    .backgroundColor(rgb(50, 50, 70))
                    .borderRadius(4.px)
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(255, 50, 50))
                                fontWeight(700)
                                fontSize(24.px)
                                letterSpacing(0.8.px)
                            }
                        }) {
                            Text("LAW 9: WIN THROUGH YOUR ACTIONS, NEVER THROUGH ARGUMENT")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(220, 220, 220))
                                fontSize(16.px)
                                lineHeight("1.6")
                                fontWeight(500)
                            }
                        }) {
                            Text(
                                "Any momentary triumph you think you have gained through argument is really a Pyrrhic victory: The resentment and ill will you stir up is STRONGER and lasts LONGER than any momentary change of opinion. It is much more POWERFUL to get others to agree with you through your ACTIONS, without saying a word.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 30.px)
                    .padding(20.px)
                    .backgroundColor(rgb(50, 50, 70))
                    .borderRadius(4.px)
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(255, 50, 50))
                                fontWeight(700)
                                fontSize(24.px)
                                letterSpacing(0.8.px)
                            }
                        }) {
                            Text("LAW 10: INFECTION: AVOID THE UNHAPPY AND UNLUCKY")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(220, 220, 220))
                                fontSize(16.px)
                                lineHeight("1.6")
                                fontWeight(500)
                            }
                        }) {
                            Text(
                                "You can DIE from someone else's misery – emotional states are as infectious as diseases. You may feel you are helping the drowning man but you are only precipitating your own DISASTER. The unfortunate sometimes draw misfortune on themselves; they will also draw it on YOU. Associate with the HAPPY and FORTUNATE instead.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 30.px)
                    .padding(20.px)
                    .backgroundColor(rgb(50, 50, 70))
                    .borderRadius(4.px)
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(255, 50, 50))
                                fontWeight(700)
                                fontSize(24.px)
                                letterSpacing(0.8.px)
                            }
                        }) {
                            Text("LAW 11: LEARN TO KEEP PEOPLE DEPENDENT ON YOU")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(220, 220, 220))
                                fontSize(16.px)
                                lineHeight("1.6")
                                fontWeight(500)
                            }
                        }) {
                            Text(
                                "To maintain your independence you must always be NEEDED and WANTED. The more you are relied on, the more FREEDOM you have. Make people depend on you for their happiness and prosperity and you have NOTHING TO FEAR. Never teach them enough so that they can do without you.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 30.px)
                    .padding(20.px)
                    .backgroundColor(rgb(50, 50, 70))
                    .borderRadius(4.px)
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(255, 50, 50))
                                fontWeight(700)
                                fontSize(24.px)
                                letterSpacing(0.8.px)
                            }
                        }) {
                            Text("LAW 12: USE SELECTIVE HONESTY AND GENEROSITY TO DISARM YOUR VICTIM")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(220, 220, 220))
                                fontSize(16.px)
                                lineHeight("1.6")
                                fontWeight(500)
                            }
                        }) {
                            Text(
                                "One sincere and honest move will cover over dozens of dishonest ones. Open-hearted gestures of honesty and generosity bring down the guard of even the most suspicious people. Once your selective honesty opens a hole in their armor, you can DECEIVE and MANIPULATE them at will.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 30.px)
                    .padding(20.px)
                    .backgroundColor(rgb(50, 50, 70))
                    .borderRadius(4.px)
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(255, 50, 50))
                                fontWeight(700)
                                fontSize(24.px)
                                letterSpacing(0.8.px)
                            }
                        }) {
                            Text("LAW 13: WHEN ASKING FOR HELP, APPEAL TO PEOPLE'S SELF-INTEREST, NEVER TO THEIR MERCY")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(220, 220, 220))
                                fontSize(16.px)
                                lineHeight("1.6")
                                fontWeight(500)
                            }
                        }) {
                            Text(
                                "If you need to turn to an ally for help, do not bother to remind him of your past assistance and good deeds. He will find a way to IGNORE you. Instead, uncover something in your request, or in your alliance with him, that will BENEFIT him, and emphasize it out of all proportion. He will respond ENTHUSIASTICALLY when he sees something to be gained for himself.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 30.px)
                    .padding(20.px)
                    .backgroundColor(rgb(50, 50, 70))
                    .borderRadius(4.px)
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(255, 50, 50))
                                fontWeight(700)
                                fontSize(24.px)
                                letterSpacing(0.8.px)
                            }
                        }) {
                            Text("LAW 14: POSE AS A FRIEND, WORK AS A SPY")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(220, 220, 220))
                                fontSize(16.px)
                                lineHeight("1.6")
                                fontWeight(500)
                            }
                        }) {
                            Text(
                                "Knowing about your rival is CRITICAL. Use spies to gather valuable information that will keep you a step ahead. Better still: Play the spy yourself. In polite social encounters, learn to PROBE. Ask indirect questions to get people to reveal their weaknesses and intentions. There is no occasion that is not an opportunity for ARTFUL SPYING.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 30.px)
                    .padding(20.px)
                    .backgroundColor(rgb(50, 50, 70))
                    .borderRadius(4.px)
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(255, 50, 50))
                                fontWeight(700)
                                fontSize(24.px)
                                letterSpacing(0.8.px)
                            }
                        }) {
                            Text("LAW 15: CRUSH YOUR ENEMY TOTALLY")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(220, 220, 220))
                                fontSize(16.px)
                                lineHeight("1.6")
                                fontWeight(500)
                            }
                        }) {
                            Text(
                                "All great leaders since Moses have known that a feared enemy must be CRUSHED COMPLETELY. (Sometimes they have learned this the hard way.) If one ember is left alight, no matter how dimly it smolders, a fire will eventually break out. More is lost through stopping halfway than through TOTAL ANNIHILATION: The enemy will recover, and will seek revenge. CRUSH him, not only in body but in spirit.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 30.px)
                    .padding(20.px)
                    .backgroundColor(rgb(50, 50, 70))
                    .borderRadius(4.px)
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(255, 50, 50))
                                fontWeight(700)
                                fontSize(24.px)
                                letterSpacing(0.8.px)
                            }
                        }) {
                            Text("LAW 16: USE ABSENCE TO INCREASE RESPECT AND HONOR")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(220, 220, 220))
                                fontSize(16.px)
                                lineHeight("1.6")
                                fontWeight(500)
                            }
                        }) {
                            Text(
                                "Too much circulation makes the price go down: The more you are seen and heard from, the more COMMON you appear. If you are already established in a group, temporary withdrawal from it will make you more talked about, even more ADMIRED. You must learn when to LEAVE. Create value through SCARCITY.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 30.px)
                    .padding(20.px)
                    .backgroundColor(rgb(50, 50, 70))
                    .borderRadius(4.px)
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(255, 50, 50))
                                fontWeight(700)
                                fontSize(24.px)
                                letterSpacing(0.8.px)
                            }
                        }) {
                            Text("LAW 17: KEEP OTHERS IN SUSPENDED TERROR: CULTIVATE AN AIR OF UNPREDICTABILITY")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(220, 220, 220))
                                fontSize(16.px)
                                lineHeight("1.6")
                                fontWeight(500)
                            }
                        }) {
                            Text(
                                "Humans are creatures of habit with an insatiable need to see familiarity in other people's actions. Your predictability gives them a sense of CONTROL. Turn the tables: Be deliberately UNPREDICTABLE. Behavior that seems to have no consistency or purpose will keep them OFF-BALANCE, and they will wear themselves out trying to explain your moves. Taken to an extreme, this strategy can INTIMIDATE and TERRORIZE.",
                            )
                        }
                    }
                }
            }
        }
    }
}
