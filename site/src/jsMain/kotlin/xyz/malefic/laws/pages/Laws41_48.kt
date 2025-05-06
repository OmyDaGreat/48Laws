package xyz.malefic.laws.pages

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
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.css.color
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
import xyz.malefic.laws.components.Navigation

@Page("/laws41-48")
@Composable
fun Laws41_48Page() {
    Column(
        modifier =
            Modifier
                .fillMaxSize()
                .backgroundColor(rgb(10, 10, 10)),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Navigation()

        Column(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .maxWidth(800.px)
                    .padding(top = 40.px, bottom = 40.px, left = 20.px, right = 20.px),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            H1 {
                Span({
                    style {
                        color(rgb(220, 0, 0))
                        fontWeight(800)
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

            Box(
                Modifier
                    .margin(bottom = 40.px)
                    .padding(top = 30.px, bottom = 30.px, left = 30.px, right = 30.px)
                    .backgroundColor(rgb(30, 0, 0))
                    .borderRadius(0.px)
                    .boxShadow(offsetX = 10.px, offsetY = 10.px, blurRadius = 0.px, color = rgb(100, 0, 0)),
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(255, 255, 255))
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
                                "To achieve greatness, establish your own identity and path rather than living in the shadow of those who came before you. This allows you to create your own legacy, free from any possible tainting of an outside influence as well as backed up by your own accomplishments and reputation.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 40.px, left = 60.px)
                    .padding(top = 30.px, bottom = 30.px, left = 30.px, right = 30.px)
                    .backgroundColor(rgb(40, 40, 40))
                    .borderRadius(0.px)
                    .boxShadow(offsetX = (-10).px, offsetY = 10.px, blurRadius = 0.px, color = rgb(100, 100, 100)),
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(220, 0, 0))
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
                                "Eliminate the source of opposition to weaken your enemies and secure your dominance. Rather than fighting every battle, focus on removing the instigator to create chaos and confusion among their followers. Without a leader to guide them, they will scatter and become disorganized, making them easier to control or put down.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 40.px, left = 30.px)
                    .padding(top = 30.px, bottom = 30.px, left = 30.px, right = 30.px)
                    .backgroundColor(rgb(30, 0, 0))
                    .borderRadius(0.px)
                    .boxShadow(offsetX = 10.px, offsetY = 10.px, blurRadius = 0.px, color = rgb(100, 0, 0)),
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(255, 255, 255))
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
                                "Win over others by appealing to their emotions and desires to secure loyalty and eliminate resistance. By understanding their motivations, you can manipulate their feelings and create a bond that makes them more likely to support you. This emotional connection can be more powerful than any logical argument or threat. Law 3 is basically the antithesis of this, proving to be the best counter against someone attempting to use Law 43.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 40.px, left = 90.px)
                    .padding(top = 30.px, bottom = 30.px, left = 30.px, right = 30.px)
                    .backgroundColor(rgb(40, 40, 40))
                    .borderRadius(0.px)
                    .boxShadow(offsetX = (-10).px, offsetY = 10.px, blurRadius = 0.px, color = rgb(100, 100, 100)),
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(220, 0, 0))
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
                                "Use imitation to confuse and provoke your enemies, gaining the upper hand in conflicts. By reflecting their actions and behaviors, you can disarm them and make them feel uncomfortable. This tactic can create doubt and insecurity in your opponents, making them question their own strategies and decisions. The mirror effect can also be used to build rapport with allies, as they may feel more connected to someone who reflects their own values and beliefs.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 40.px)
                    .padding(top = 30.px, bottom = 30.px, left = 30.px, right = 30.px)
                    .backgroundColor(rgb(30, 0, 0))
                    .borderRadius(0.px)
                    .boxShadow(offsetX = 10.px, offsetY = 10.px, blurRadius = 0.px, color = rgb(100, 0, 0)),
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(255, 255, 255))
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
                                "Introduce change gradually to avoid resistance and maintain control over your position. By easing people into new ideas and practices, you can minimize backlash and ensure a smoother transition. This approach allows you to maintain your influence while still promoting progress. Sudden changes can create chaos and uncertainty, leading to pushback and loss of support. By taking small steps, you can build trust and confidence in your leadership.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 40.px, left = 120.px)
                    .padding(top = 30.px, bottom = 30.px, left = 30.px, right = 30.px)
                    .backgroundColor(rgb(40, 40, 40))
                    .borderRadius(0.px)
                    .boxShadow(offsetX = (-10).px, offsetY = 10.px, blurRadius = 0.px, color = rgb(100, 100, 100)),
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(220, 0, 0))
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
                                "Show vulnerability to avoid envy and maintain the loyalty of those around you. By revealing some flaws or weaknesses, you can make yourself more relatable and approachable. This tactic can help you build stronger relationships and prevent others from feeling threatened by your success. When people perceive you as too perfect, they may become resentful or envious, leading to potential conflicts. By embracing your imperfections, you can foster loyalty and support from those around you.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 40.px, left = 60.px)
                    .padding(top = 30.px, bottom = 30.px, left = 30.px, right = 30.px)
                    .backgroundColor(rgb(30, 0, 0))
                    .borderRadius(0.px)
                    .boxShadow(offsetX = 10.px, offsetY = 10.px, blurRadius = 0.px, color = rgb(100, 0, 0)),
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(255, 255, 255))
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
                                "Exercise restraint in victory to avoid overreaching and creating new enemies. By knowing when to stop, you can consolidate your gains and maintain your position of power. Overextending yourself can lead to backlash and loss of support, as others may feel threatened by your ambition. By recognizing the limits of your success, you can ensure a more stable and secure position.",
                            )
                        }
                    }
                }
            }

            Box(
                Modifier
                    .margin(bottom = 40.px)
                    .padding(top = 30.px, bottom = 30.px, left = 30.px, right = 30.px)
                    .backgroundColor(rgb(40, 40, 40))
                    .borderRadius(0.px)
                    .boxShadow(offsetX = (-10).px, offsetY = 10.px, blurRadius = 0.px, color = rgb(100, 100, 100)),
            ) {
                Column {
                    H2 {
                        Span({
                            style {
                                color(rgb(220, 0, 0))
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
                                "Stay adaptable and unpredictable to maintain your advantage and avoid being targeted. By remaining fluid and flexible, you can respond to changing circumstances and keep your enemies off balance. This approach allows you to navigate challenges and seize opportunities as they arise. Embracing formlessness can also help you avoid being pigeonholed or constrained by others' expectations, allowing you to maintain your independence and control. Similar to Law 3 again, it allows you to adapt to the emotional manipulation of others and keep them guessing, especially with your intentions.",
                            )
                        }
                    }
                }
            }
        }
    }
}
