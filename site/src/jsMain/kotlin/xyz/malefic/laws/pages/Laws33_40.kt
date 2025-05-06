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

@Page("/laws33-40")
@Composable
fun Laws33_40Page() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .backgroundColor(rgb(60, 40, 30)), // Warm brown background for emotional connection
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
                        color(rgb(255, 220, 180)) // Warm golden color
                        fontWeight(500)
                        fontSize(36.px)
                        letterSpacing(0.5.px)
                    }
                }) {
                    Text("Laws 33-40: Stand firm and win over people's hearts")
                }
            }

            P {
                Span({
                    style {
                        color(rgb(240, 210, 180))
                        fontWeight(400)
                        fontSize(18.px)
                        letterSpacing(0.5.px)
                        textAlign("center")
                    }
                }) {
                    Text(
                        "These laws teach you how to maintain your position of power by standing firm in your convictions while winning the hearts and minds of those around you.",
                    )
                }
            }

            Spacer()
            Div({ style { height(40.px) } })

            // Balanced layout with two columns for stability
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .margin(bottom = 30.px),
            ) {
                // Left column
                Column(
                    modifier = Modifier
                        .fillMaxWidth(50.percent)
                        .padding(right = 15.px),
                ) {
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .padding(20.px)
                            .backgroundColor(rgba(80, 50, 30, 0.8)) // Warm brown
                            .borderRadius(8.px)
                            .boxShadow(offsetX = 0.px, offsetY = 0.px, blurRadius = 10.px, color = rgba(0, 0, 0, 0.2))
                    ) {
                        Column {
                            H2 {
                                Span({
                                    style {
                                        color(rgb(255, 220, 180))
                                        fontWeight(500)
                                        fontSize(22.px)
                                        letterSpacing(0.5.px)
                                    }
                                }) {
                                    Text("Law 33: Discover Each Man's Thumbscrew")
                                }
                            }
                            P {
                                Span({
                                    style {
                                        color(rgb(230, 210, 190))
                                        fontSize(16.px)
                                        lineHeight("1.6")
                                        fontWeight(400)
                                    }
                                }) {
                                    Text(
                                        "Everyone has a weakness, a gap in the castle wall. That weakness is usually an insecurity, an uncontrollable emotion or need; it can also be a small secret pleasure. Either way, once found, it is a thumbscrew you can turn to your advantage.",
                                    )
                                }
                            }
                        }
                    }
                }

                // Right column
                Column(
                    modifier = Modifier
                        .fillMaxWidth(50.percent)
                        .padding(left = 15.px),
                ) {
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .padding(20.px)
                            .backgroundColor(rgba(90, 60, 40, 0.8)) // Slightly darker warm brown
                            .borderRadius(8.px)
                            .boxShadow(offsetX = 0.px, offsetY = 0.px, blurRadius = 10.px, color = rgba(0, 0, 0, 0.2))
                    ) {
                        Column {
                            H2 {
                                Span({
                                    style {
                                        color(rgb(255, 220, 180))
                                        fontWeight(500)
                                        fontSize(22.px)
                                        letterSpacing(0.5.px)
                                    }
                                }) {
                                    Text("Law 34: Be Royal in Your Own Fashion: Act Like a King to Be Treated Like One")
                                }
                            }
                            P {
                                Span({
                                    style {
                                        color(rgb(230, 210, 190))
                                        fontSize(16.px)
                                        lineHeight("1.6")
                                        fontWeight(400)
                                    }
                                }) {
                                    Text(
                                        "The way you carry yourself will often determine how you are treated: In the long run, appearing vulgar or common will make people disrespect you. For a king respects himself and inspires the same sentiment in others. By acting regally and confident of your powers, you make yourself seem destined to wear a crown.",
                                    )
                                }
                            }
                        }
                    }
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .margin(bottom = 30.px),
            ) {
                // Left column
                Column(
                    modifier = Modifier
                        .fillMaxWidth(50.percent)
                        .padding(right = 15.px),
                ) {
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .padding(20.px)
                            .backgroundColor(rgba(90, 60, 40, 0.8)) // Slightly darker warm brown
                            .borderRadius(8.px)
                            .boxShadow(offsetX = 0.px, offsetY = 0.px, blurRadius = 10.px, color = rgba(0, 0, 0, 0.2))
                    ) {
                        Column {
                            H2 {
                                Span({
                                    style {
                                        color(rgb(255, 220, 180))
                                        fontWeight(500)
                                        fontSize(22.px)
                                        letterSpacing(0.5.px)
                                    }
                                }) {
                                    Text("Law 35: Master the Art of Timing")
                                }
                            }
                            P {
                                Span({
                                    style {
                                        color(rgb(230, 210, 190))
                                        fontSize(16.px)
                                        lineHeight("1.6")
                                        fontWeight(400)
                                    }
                                }) {
                                    Text(
                                        "Never seem to be in a hurry – hurrying betrays a lack of control over yourself, and over time. Always seem patient, as if you know that everything will come to you eventually. Become a detective of the right moment; sniff out the spirit of the times, the trends that will carry you to power. Learn to stand back when the time is not yet ripe, and to strike fiercely when it has reached fruition.",
                                    )
                                }
                            }
                        }
                    }
                }

                // Right column
                Column(
                    modifier = Modifier
                        .fillMaxWidth(50.percent)
                        .padding(left = 15.px),
                ) {
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .padding(20.px)
                            .backgroundColor(rgba(80, 50, 30, 0.8)) // Warm brown
                            .borderRadius(8.px)
                            .boxShadow(offsetX = 0.px, offsetY = 0.px, blurRadius = 10.px, color = rgba(0, 0, 0, 0.2))
                    ) {
                        Column {
                            H2 {
                                Span({
                                    style {
                                        color(rgb(255, 220, 180))
                                        fontWeight(500)
                                        fontSize(22.px)
                                        letterSpacing(0.5.px)
                                    }
                                }) {
                                    Text("Law 36: Disdain Things You Cannot Have: Ignoring Them Is the Best Revenge")
                                }
                            }
                            P {
                                Span({
                                    style {
                                        color(rgb(230, 210, 190))
                                        fontSize(16.px)
                                        lineHeight("1.6")
                                        fontWeight(400)
                                    }
                                }) {
                                    Text(
                                        "By acknowledging a petty problem you give it existence and credibility. The more attention you pay an enemy, the stronger you make him; and a small mistake is often made worse and more visible when you try to fix it. It is sometimes best to leave things alone. If there is something you want but cannot have, show contempt for it. The less interest you reveal, the more superior you seem.",
                                    )
                                }
                            }
                        }
                    }
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .margin(bottom = 30.px),
            ) {
                // Left column
                Column(
                    modifier = Modifier
                        .fillMaxWidth(50.percent)
                        .padding(right = 15.px),
                ) {
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .padding(20.px)
                            .backgroundColor(rgba(80, 50, 30, 0.8)) // Warm brown
                            .borderRadius(8.px)
                            .boxShadow(offsetX = 0.px, offsetY = 0.px, blurRadius = 10.px, color = rgba(0, 0, 0, 0.2))
                    ) {
                        Column {
                            H2 {
                                Span({
                                    style {
                                        color(rgb(255, 220, 180))
                                        fontWeight(500)
                                        fontSize(22.px)
                                        letterSpacing(0.5.px)
                                    }
                                }) {
                                    Text("Law 37: Create Compelling Spectacles")
                                }
                            }
                            P {
                                Span({
                                    style {
                                        color(rgb(230, 210, 190))
                                        fontSize(16.px)
                                        lineHeight("1.6")
                                        fontWeight(400)
                                    }
                                }) {
                                    Text(
                                        "Striking imagery and grand symbolic gestures create the aura of power – everyone responds to them. Stage spectacles for those around you, then, full of arresting visuals and radiant symbols that heighten your presence. Dazzled by appearances, no one will notice what you are really doing.",
                                    )
                                }
                            }
                        }
                    }
                }

                // Right column
                Column(
                    modifier = Modifier
                        .fillMaxWidth(50.percent)
                        .padding(left = 15.px),
                ) {
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .padding(20.px)
                            .backgroundColor(rgba(90, 60, 40, 0.8)) // Slightly darker warm brown
                            .borderRadius(8.px)
                            .boxShadow(offsetX = 0.px, offsetY = 0.px, blurRadius = 10.px, color = rgba(0, 0, 0, 0.2))
                    ) {
                        Column {
                            H2 {
                                Span({
                                    style {
                                        color(rgb(255, 220, 180))
                                        fontWeight(500)
                                        fontSize(22.px)
                                        letterSpacing(0.5.px)
                                    }
                                }) {
                                    Text("Law 38: Think as You Like But Behave Like Others")
                                }
                            }
                            P {
                                Span({
                                    style {
                                        color(rgb(230, 210, 190))
                                        fontSize(16.px)
                                        lineHeight("1.6")
                                        fontWeight(400)
                                    }
                                }) {
                                    Text(
                                        "If you make a show of going against the times, flaunting your unconventional ideas and unorthodox ways, people will think that you only want attention and that you look down upon them. They will find a way to punish you for making them feel inferior. It is far safer to blend in and nurture the common touch. Share your originality only with tolerant friends and those who are sure to appreciate your uniqueness.",
                                    )
                                }
                            }
                        }
                    }
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .margin(bottom = 30.px),
            ) {
                // Left column
                Column(
                    modifier = Modifier
                        .fillMaxWidth(50.percent)
                        .padding(right = 15.px),
                ) {
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .padding(20.px)
                            .backgroundColor(rgba(90, 60, 40, 0.8)) // Slightly darker warm brown
                            .borderRadius(8.px)
                            .boxShadow(offsetX = 0.px, offsetY = 0.px, blurRadius = 10.px, color = rgba(0, 0, 0, 0.2))
                    ) {
                        Column {
                            H2 {
                                Span({
                                    style {
                                        color(rgb(255, 220, 180))
                                        fontWeight(500)
                                        fontSize(22.px)
                                        letterSpacing(0.5.px)
                                    }
                                }) {
                                    Text("Law 39: Stir Up Waters to Catch Fish")
                                }
                            }
                            P {
                                Span({
                                    style {
                                        color(rgb(230, 210, 190))
                                        fontSize(16.px)
                                        lineHeight("1.6")
                                        fontWeight(400)
                                    }
                                }) {
                                    Text(
                                        "Anger and emotion are strategically counterproductive. You must always stay calm and objective. But if you can make your enemies angry while staying calm yourself, you gain a decided advantage. Put your enemies off-balance: Find the chink in their vanity through which you can rattle them and you hold the strings.",
                                    )
                                }
                            }
                        }
                    }
                }

                // Right column
                Column(
                    modifier = Modifier
                        .fillMaxWidth(50.percent)
                        .padding(left = 15.px),
                ) {
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .padding(20.px)
                            .backgroundColor(rgba(80, 50, 30, 0.8)) // Warm brown
                            .borderRadius(8.px)
                            .boxShadow(offsetX = 0.px, offsetY = 0.px, blurRadius = 10.px, color = rgba(0, 0, 0, 0.2))
                    ) {
                        Column {
                            H2 {
                                Span({
                                    style {
                                        color(rgb(255, 220, 180))
                                        fontWeight(500)
                                        fontSize(22.px)
                                        letterSpacing(0.5.px)
                                    }
                                }) {
                                    Text("Law 40: Despise the Free Lunch")
                                }
                            }
                            P {
                                Span({
                                    style {
                                        color(rgb(230, 210, 190))
                                        fontSize(16.px)
                                        lineHeight("1.6")
                                        fontWeight(400)
                                    }
                                }) {
                                    Text(
                                        "What is offered for free is dangerous – it usually involves either a trick or a hidden obligation. What has worth is worth paying for. By paying your own way you stay clear of gratitude, guilt, and deceit. It is also often wise to pay the full price – there is no cutting corners with excellence. Be lavish with your money and keep it circulating, for generosity is a sign and a magnet for power.",
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
