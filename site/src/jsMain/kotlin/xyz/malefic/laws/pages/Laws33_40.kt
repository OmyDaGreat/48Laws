@file:Suppress("ktlint:standard:max-line-length")

package xyz.malefic.laws.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import xyz.malefic.laws.components.VerticalSpacer
import xyz.malefic.laws.components.WarmLawBox
import xyz.malefic.laws.components.WarmLawDescription
import xyz.malefic.laws.components.WarmLawRow
import xyz.malefic.laws.components.WarmLawTitle
import xyz.malefic.laws.components.WarmLeftColumn
import xyz.malefic.laws.components.WarmPageHeader
import xyz.malefic.laws.components.WarmPageLayout
import xyz.malefic.laws.components.WarmRightColumn

@Page("/laws33-40")
@Composable
fun Laws33_40Page() {
    WarmPageLayout {
        WarmPageHeader(
            title = "Laws 33-40: Stand firm and win over people's hearts",
            subtitle = "These laws teach you how to maintain your position of power by standing firm in your convictions while winning the hearts and minds of those around you.",
        )

        VerticalSpacer(40)

        WarmLawRow {
            WarmLeftColumn {
                WarmLawBox(isEven = false) {
                    WarmLawTitle(title = "Law 33: Discover Each Man's Thumbscrew")
                    WarmLawDescription(
                        description = "Identify people's vulnerabilities to gain influence over them. By understanding their weaknesses, you can subtly control their actions and decisions.",
                    )
                }
            }

            WarmRightColumn {
                WarmLawBox(isEven = true) {
                    WarmLawTitle(title = "Law 34: Be Royal in Your Own Fashion: Act Like a King to Be Treated Like One")
                    WarmLawDescription(
                        description = "Carry yourself with confidence and dignity to inspire respect and loyalty. Acting regally ensures others see you as a natural leader.",
                    )
                }
            }
        }

        WarmLawRow {
            WarmLeftColumn {
                WarmLawBox(isEven = true) {
                    WarmLawTitle(title = "Law 35: Master the Art of Timing")
                    WarmLawDescription(
                        description = "Exhibit patience and act at the right moment to maximize your impact. Knowing when to wait and when to strike is key to maintaining control.",
                    )
                }
            }

            WarmRightColumn {
                WarmLawBox(isEven = false) {
                    WarmLawTitle(title = "Law 36: Disdain Things You Cannot Have: Ignoring Them Is the Best Revenge")
                    WarmLawDescription(
                        description = "Show indifference to what you cannot have to maintain your composure and superiority. Ignoring unattainable things keeps you focused and respected.",
                    )
                }
            }
        }

        WarmLawRow {
            WarmLeftColumn {
                WarmLawBox(isEven = false) {
                    WarmLawTitle(title = "Law 37: Create Compelling Spectacles")
                    WarmLawDescription(
                        description = "Use striking visuals and grand gestures to captivate attention and solidify your influence. Spectacles inspire loyalty and admiration.",
                    )
                }
            }

            WarmRightColumn {
                WarmLawBox(isEven = true) {
                    WarmLawTitle(title = "Law 38: Think as You Like But Behave Like Others")
                    WarmLawDescription(
                        description = "Blend in with others to avoid alienation while keeping your thoughts private. Conforming outwardly ensures trust and acceptance.",
                    )
                }
            }
        }

        WarmLawRow {
            WarmLeftColumn {
                WarmLawBox(isEven = true) {
                    WarmLawTitle(title = "Law 39: Stir Up Waters to Catch Fish")
                    WarmLawDescription(
                        description = "Stay calm while provoking emotions in others to gain control. Unsettling your enemies gives you an advantage and earns admiration.",
                    )
                }
            }

            WarmRightColumn {
                WarmLawBox(isEven = false) {
                    WarmLawTitle(title = "Law 40: Despise the Free Lunch")
                    WarmLawDescription(
                        description = "Pay for what has value to show independence and generosity. Avoid free offers to maintain dignity and inspire trust in your leadership.",
                    )
                }
            }
        }
    }
}
