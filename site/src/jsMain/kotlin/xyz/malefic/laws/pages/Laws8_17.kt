@file:Suppress("ktlint:standard:max-line-length")

package xyz.malefic.laws.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import xyz.malefic.laws.components.LawBox
import xyz.malefic.laws.components.LawDescription
import xyz.malefic.laws.components.LawTitle
import xyz.malefic.laws.components.PageHeader
import xyz.malefic.laws.components.PageLayout
import xyz.malefic.laws.components.VerticalSpacer

@Page("/laws8-17")
@Composable
fun Laws8_17Page() {
    PageLayout {
        PageHeader(
            title = "LAWS 8-17: ACQUIRE POWER IN EVERY SOCIAL INTERACTION",
            subtitle = "These laws focus on how to use every opportunity to manipulate another person. Master these principles to influence and control social dynamics.",
        )

        VerticalSpacer(40)

        // Laws with power styling
        LawBox {
            LawTitle(title = "LAW 8: MAKE OTHERS COME TO YOU – USE BAIT IF NECESSARY")
            LawDescription(
                description = "Home court advantage is a real thing, and not just because you are used to your own environment. By making others come to you, you are in control of the situation and can manipulate it to your advantage. Furthermore, you are forcing the opponent to adapt and change their strategy to fit your own, which is a powerful position to be in.",
            )
        }

        LawBox {
            LawTitle(title = "LAW 9: WIN THROUGH YOUR ACTIONS, NEVER THROUGH ARGUMENT")
            LawDescription(
                description = "The best way to win an argument is to not have one. By using your actions to prove your point, you are not only avoiding the pitfalls of a verbal argument, but you are also showing the other person that you are willing to put in the work to prove your point. This shows both that you are not afraid of hard work and that you are willing to do what it takes to win.",
            )
        }

        LawBox {
            LawTitle(title = "LAW 10: INFECTION: AVOID THE UNHAPPY AND UNLUCKY")
            LawDescription(
                description = "Siding with the winning team is a great way to ensure that you are on the winning side. By associating with those who are unhappy or unlucky, you are only bringing yourself down and making it harder for yourself to succeed. Instead, surround yourself with those who are happy and successful, and you will find that you are much more likely to succeed as well.",
            )
        }

        LawBox {
            LawTitle(title = "LAW 11: LEARN TO KEEP PEOPLE DEPENDENT ON YOU")
            LawDescription(
                description = "Independence is like a drug in the sense that one taste of it can be incredibly addicting and leave a person with want for more. By stopping people from ever seeing it at all, keeping them dependent on you and your skills, you create a cycle that serves to give you the upper hand as the most knowledgeable at all times.",
            )
        }

        LawBox {
            LawTitle(title = "LAW 12: USE SELECTIVE HONESTY AND GENEROSITY TO DISARM YOUR VICTIM")
            LawDescription(
                description = "Actions that are honest and generous are often seen as a sign of weakness, but they can also be used to disarm your opponent. By showing a small amount of honesty or generosity, you can create a false sense of security in your opponent, which can then be exploited to your advantage. This is especially effective when paired with Law 3, as it allows you to gain information while also disarming your opponent.",
            )
        }

        LawBox {
            LawTitle(title = "LAW 13: WHEN ASKING FOR HELP, APPEAL TO PEOPLE'S SELF-INTEREST, NEVER TO THEIR MERCY")
            LawDescription(
                description = "When bargaining with someone, using a chip that actually benefits them will always be more reliable and potentially rewarding than leaving yourself at the other's mercy. This attitude itself is inherently lacking in power.",
            )
        }

        LawBox {
            LawTitle(title = "LAW 14: POSE AS A FRIEND, WORK AS A SPY")
            LawDescription(
                description = "As mentioned in Law 3, information is worth more than gold. The best way to obtain that information is through careful conversation and observation, which is easiest done when posing as a friend. This constant spying will allow you to detect weaknesses and intentions that can be used to your advantage in the future.",
            )
        }

        LawBox {
            LawTitle(title = "LAW 15: CRUSH YOUR ENEMY TOTALLY")
            LawDescription(
                description = "Allowing your enemy to escape with even a small amount of power or glimmer of hope gives them the opportunity to reconvene and rebel against your accumulation of their power. Only by completely destroying your enemy can you ensure that they will not return to haunt you and, if Law 2 is properly utilized, these enemies can become your greatest allies.",
            )
        }

        LawBox {
            LawTitle(title = "LAW 16: USE ABSENCE TO INCREASE RESPECT AND HONOR")
            LawDescription(
                description = "Extremely similar to Law 4, this one promotes the idea of using absence to increase your power. By removing yourself from a situation, you can create a sense of longing and desire for your presence. However, it is important to note that this can only be used once an established presence has been made, so that there is something to miss in the eyes of others.",
            )
        }

        LawBox {
            LawTitle(title = "LAW 17: KEEP OTHERS IN SUSPENDED TERROR: CULTIVATE AN AIR OF UNPREDICTABILITY")
            LawDescription(
                description = "If you are predictable, it is incredibly easy to be manipulated. Furthermore, when paired with Law 3, it becomes nearly impossible for anyone to put a profile of you together and therefore lack any amount of control over you whatsoever. Unpredictability makes you the limiting factor, so that others are forced to adapt to you and your whims, giving you immense power over their actions.",
            )
        }
    }
}
