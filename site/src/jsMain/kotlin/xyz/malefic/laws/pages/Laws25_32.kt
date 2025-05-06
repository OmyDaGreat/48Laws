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

@Page("/laws25-32")
@Composable
fun Laws25_32Page() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .backgroundColor(rgb(30, 40, 80)), // Deep blue background for visual appeal
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
                        color(rgb(240, 240, 255)) // Bright white-blue
                        fontWeight(600)
                        fontSize(36.px)
                        letterSpacing(1.px)
                    }
                }) {
                    Text("Laws 25-32: People's image of you can grant you control")
                }
            }

            P {
                Span({
                    style {
                        color(rgb(220, 220, 240))
                        fontWeight(400)
                        fontSize(18.px)
                        letterSpacing(0.5.px)
                        textAlign("center")
                    }
                }) {
                    Text(
                        "These laws focus on how to shape others' perception of you. By controlling your image and how others see you, you can gain significant power and influence.",
                    )
                }
            }

            Spacer()
            Div({ style { height(40.px) } })

            // Laws with image-focused styling - alternating colors
            Box(
                Modifier
                    .margin(bottom = 30.px)
                    .padding(25.px)
                    .backgroundColor(rgba(40, 80, 120, 0.8)) // Blue-purple gradient effect
                    .borderRadius(8.px)
                    .boxShadow(offsetX = 0.px, offsetY = 0.px, blurRadius = 15.px, color = rgba(0, 0, 0, 0.3))
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(220, 220, 255))
                                fontWeight(600)
                                fontSize(24.px)
                                letterSpacing(0.8.px)
                            }
                        }) {
                            Text("Law 25: Re-Create Yourself")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(200, 200, 230))
                                fontSize(16.px)
                                lineHeight("1.7")
                                fontWeight(400)
                            }
                        }) {
                            Text(
                                "Do not accept the roles that society foists on you. Re-create yourself by forging a new identity, one that commands attention and never bores the audience. Be the master of your own image rather than letting others define it for you. Incorporate dramatic devices into your public gestures and actions – your power will be enhanced and your character will seem larger than life.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 30.px)
                    .padding(25.px)
                    .backgroundColor(rgba(80, 40, 100, 0.8)) // Purple-blue gradient effect
                    .borderRadius(8.px)
                    .boxShadow(offsetX = 0.px, offsetY = 0.px, blurRadius = 15.px, color = rgba(0, 0, 0, 0.3))
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(220, 220, 255))
                                fontWeight(600)
                                fontSize(24.px)
                                letterSpacing(0.8.px)
                            }
                        }) {
                            Text("Law 26: Keep Your Hands Clean")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(200, 200, 230))
                                fontSize(16.px)
                                lineHeight("1.7")
                                fontWeight(400)
                            }
                        }) {
                            Text(
                                "You must seem a paragon of civility and efficiency: Your hands are never soiled by mistakes and nasty deeds. Maintain such a spotless appearance by using others as scapegoats and cat's-paws to disguise your involvement.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 30.px)
                    .padding(25.px)
                    .backgroundColor(rgba(40, 80, 120, 0.8)) // Blue-purple gradient effect
                    .borderRadius(8.px)
                    .boxShadow(offsetX = 0.px, offsetY = 0.px, blurRadius = 15.px, color = rgba(0, 0, 0, 0.3))
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(220, 220, 255))
                                fontWeight(600)
                                fontSize(24.px)
                                letterSpacing(0.8.px)
                            }
                        }) {
                            Text("Law 27: Play on People's Need to Believe to Create a Cultlike Following")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(200, 200, 230))
                                fontSize(16.px)
                                lineHeight("1.7")
                                fontWeight(400)
                            }
                        }) {
                            Text(
                                "People have an overwhelming desire to believe in something. Become the focal point of such desire by offering them a cause, a new faith to follow. Keep your words vague but full of promise; emphasize enthusiasm over rationality and clear thinking. Give your new disciples rituals to perform, ask them to make sacrifices on your behalf. In the absence of organized religion and grand causes, your new belief system will bring you untold power.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 30.px)
                    .padding(25.px)
                    .backgroundColor(rgba(80, 40, 100, 0.8)) // Purple-blue gradient effect
                    .borderRadius(8.px)
                    .boxShadow(offsetX = 0.px, offsetY = 0.px, blurRadius = 15.px, color = rgba(0, 0, 0, 0.3))
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(220, 220, 255))
                                fontWeight(600)
                                fontSize(24.px)
                                letterSpacing(0.8.px)
                            }
                        }) {
                            Text("Law 28: Enter Action with Boldness")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(200, 200, 230))
                                fontSize(16.px)
                                lineHeight("1.7")
                                fontWeight(400)
                            }
                        }) {
                            Text(
                                "If you are unsure of a course of action, do not attempt it. Your doubts and hesitations will infect your execution. Timidity is dangerous: Better to enter with boldness. Any mistakes you commit through audacity are easily corrected with more audacity. Everyone admires the bold; no one honors the timid.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 30.px)
                    .padding(25.px)
                    .backgroundColor(rgba(40, 80, 120, 0.8)) // Blue-purple gradient effect
                    .borderRadius(8.px)
                    .boxShadow(offsetX = 0.px, offsetY = 0.px, blurRadius = 15.px, color = rgba(0, 0, 0, 0.3))
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(220, 220, 255))
                                fontWeight(600)
                                fontSize(24.px)
                                letterSpacing(0.8.px)
                            }
                        }) {
                            Text("Law 29: Plan All the Way to the End")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(200, 200, 230))
                                fontSize(16.px)
                                lineHeight("1.7")
                                fontWeight(400)
                            }
                        }) {
                            Text(
                                "The ending is everything. Plan all the way to it, taking into account all the possible consequences, obstacles, and twists of fortune that might reverse your hard work and give the glory to others. By planning to the end you will not be overwhelmed by circumstances and you will know when to stop. Gently guide fortune and help determine the future by thinking far ahead.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 30.px)
                    .padding(25.px)
                    .backgroundColor(rgba(80, 40, 100, 0.8)) // Purple-blue gradient effect
                    .borderRadius(8.px)
                    .boxShadow(offsetX = 0.px, offsetY = 0.px, blurRadius = 15.px, color = rgba(0, 0, 0, 0.3))
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(220, 220, 255))
                                fontWeight(600)
                                fontSize(24.px)
                                letterSpacing(0.8.px)
                            }
                        }) {
                            Text("Law 30: Make Your Accomplishments Seem Effortless")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(200, 200, 230))
                                fontSize(16.px)
                                lineHeight("1.7")
                                fontWeight(400)
                            }
                        }) {
                            Text(
                                "Your actions must seem natural and executed with ease. All the toil and practice, the obstacles, the frustrations and disgusts, must be concealed. When you act, act effortlessly, as if you could do much more. Avoid the temptation of revealing how hard you work – it only raises questions. Teach no one your tricks or they will be used against you.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 30.px)
                    .padding(25.px)
                    .backgroundColor(rgba(40, 80, 120, 0.8)) // Blue-purple gradient effect
                    .borderRadius(8.px)
                    .boxShadow(offsetX = 0.px, offsetY = 0.px, blurRadius = 15.px, color = rgba(0, 0, 0, 0.3))
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(220, 220, 255))
                                fontWeight(600)
                                fontSize(24.px)
                                letterSpacing(0.8.px)
                            }
                        }) {
                            Text("Law 31: Control the Options: Get Others to Play with the Cards You Deal")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(200, 200, 230))
                                fontSize(16.px)
                                lineHeight("1.7")
                                fontWeight(400)
                            }
                        }) {
                            Text(
                                "The best deceptions are the ones that seem to give the other person a choice: Your victims feel they are in control, but are actually your puppets. Give people options that come out in your favor whichever one they choose. Force them to make choices between the lesser of two evils, both of which serve your purpose. Put them on the horns of a dilemma: They are gored wherever they turn.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 30.px)
                    .padding(25.px)
                    .backgroundColor(rgba(80, 40, 100, 0.8)) // Purple-blue gradient effect
                    .borderRadius(8.px)
                    .boxShadow(offsetX = 0.px, offsetY = 0.px, blurRadius = 15.px, color = rgba(0, 0, 0, 0.3))
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(220, 220, 255))
                                fontWeight(600)
                                fontSize(24.px)
                                letterSpacing(0.8.px)
                            }
                        }) {
                            Text("Law 32: Play to People's Fantasies")
                        }
                    }
                    P {
                        Span({
                            style {
                                color(rgb(200, 200, 230))
                                fontSize(16.px)
                                lineHeight("1.7")
                                fontWeight(400)
                            }
                        }) {
                            Text(
                                "The truth is often avoided because it is ugly and unpleasant. Never appeal to truth and reality unless you are prepared for the anger that comes from disenchantment. Life is so harsh and distressing that people who can manufacture romance or conjure up fantasy are like oases in the desert: Everyone flocks to them. There is great power in tapping into the fantasies of the masses.",
                            )
                        }
                    }
                }
            }
        }
    }
}
