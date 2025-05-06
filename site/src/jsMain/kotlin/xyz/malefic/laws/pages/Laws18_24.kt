@file:Suppress("ktlint:standard:max-line-length")

package xyz.malefic.laws.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import xyz.malefic.laws.components.SecretLawBox
import xyz.malefic.laws.components.SecretLawDescription
import xyz.malefic.laws.components.SecretLawTitle
import xyz.malefic.laws.components.SecretPageHeader
import xyz.malefic.laws.components.SecretPageLayout
import xyz.malefic.laws.components.VerticalSpacer

@Page("/laws18-24")
@Composable
fun Laws18_24Page() {
    SecretPageLayout {
        SecretPageHeader(
            title = "Laws 18-24: Mask your intentions and obtain valuable intel",
            subtitle = "These laws teach you how to conceal your true intentions while gathering information that gives you an advantage. The art of deception is crucial to maintaining power.",
        )

        VerticalSpacer(40)

        SecretLawBox(isEven = false, leftOffset = 0) {
            SecretLawTitle(
                title = "Law 18: Do Not Build Fortresses to Protect Yourself – Isolation is Dangerous",
                isEven = false,
            )
            SecretLawDescription(
                description = "Isolation blinds you to critical information and makes you vulnerable. Stay among people to gather intel and conceal your true position. Furthermore, a person alone will always stand out more than one who is a part of a croud.",
                isEven = false,
            )
        }

        SecretLawBox(isEven = true, leftOffset = 60) {
            SecretLawTitle(
                title = "Law 19: Know Who You're Dealing with – Do Not Offend the Wrong Person",
                isEven = true,
            )
            SecretLawDescription(
                description = "Understanding others' intentions and reactions is key to avoiding unnecessary conflicts and maintaining control over situations. Status and hierarchy matter, and offending the wrong person can have dire consequences, including upending years' worth of work following any set of rules.",
                isEven = true,
            )
        }

        SecretLawBox(isEven = false, leftOffset = 20) {
            SecretLawTitle(
                title = "Law 20: Do Not Commit to Anyone",
                isEven = false,
            )
            SecretLawDescription(
                description = "By staying independent, you can manipulate others' intentions and gather information without revealing your own, in line with Law 3 while expanding on it with a perspective that allows you to join the winning side, no matter which one it may be.",
                isEven = false,
            )
        }

        SecretLawBox(isEven = true, leftOffset = 80) {
            SecretLawTitle(
                title = "Law 21: Play a Sucker to Catch a Sucker – Seem Dumber Than Your Mark",
                isEven = true,
            )
            SecretLawDescription(
                description = "Feigning ignorance allows you to extract valuable information while keeping your true intentions hidden, again following Law 3. If you can make others feel superior, as expressed in Law 1, they will reveal their secrets and intentions to you, allowing you to gather intel without raising suspicion.",
                isEven = true,
            )
        }

        SecretLawBox(isEven = false, leftOffset = 40) {
            SecretLawTitle(
                title = "Law 22: Use the Surrender Tactic: Transform Weakness into Power",
                isEven = false,
            )
            SecretLawDescription(
                description = "Surrender strategically to mask your intentions, bide your time, and gather insights to turn the situation in your favor. Giving you a similar position to that of Law 20, the act of surrendering allows one to switch the side they support in the case of fighting an uphill battle without too much suspicion.",
                isEven = false,
            )
        }

        SecretLawBox(isEven = true, leftOffset = 100) {
            SecretLawTitle(
                title = "Law 23: Concentrate Your Forces",
                isEven = true,
            )
            SecretLawDescription(
                description = "Focus your efforts on key sources of power to gain leverage and gather critical information for strategic advantage. This law emphasizes the importance of concentrating your resources and attention on the most influential individuals or groups, allowing you to gather intel and maintain control over your environment without spreading yourself too thin.",
                isEven = true,
            )
        }

        SecretLawBox(isEven = false, leftOffset = 30) {
            SecretLawTitle(
                title = "Law 24: Play the Perfect Courtier",
                isEven = false,
            )
            SecretLawDescription(
                description = "Master subtlety and indirection to gather intel and influence others without revealing your true motives. A combination of Laws 18 through 23, this law teaches you how to navigate the complex dynamics of power and influence.",
                isEven = false,
            )
        }
    }
}
