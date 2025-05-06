@file:Suppress("ktlint:standard:max-line-length")

package xyz.malefic.laws.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import xyz.malefic.laws.components.GradientLawBox
import xyz.malefic.laws.components.GradientLawDescription
import xyz.malefic.laws.components.GradientLawTitle
import xyz.malefic.laws.components.GradientPageHeader
import xyz.malefic.laws.components.GradientPageLayout
import xyz.malefic.laws.components.VerticalSpacer

@Page("/laws25-32")
@Composable
fun Laws25_32Page() {
    GradientPageLayout {
        GradientPageHeader(
            title = "Laws 25-32: People's image of you can grant you control",
            subtitle = "These laws focus on how to shape others' perception of you. By controlling your image and how others see you, you can greatly affect the influence you have over them.",
        )

        VerticalSpacer(40)

        GradientLawBox(isEven = false) {
            GradientLawTitle(title = "Law 25: Re-Create Yourself")
            GradientLawDescription(
                description = "Shape how others perceive you by crafting a compelling identity that commands attention and admiration. Control your image to maintain influence and power.",
            )
        }

        GradientLawBox(isEven = true) {
            GradientLawTitle(title = "Law 26: Keep Your Hands Clean")
            GradientLawDescription(
                description = "Maintain a flawless image by ensuring others associate you with success and civility, while concealing any involvement in unpleasant actions.",
            )
        }

        GradientLawBox(isEven = false) {
            GradientLawTitle(title = "Law 27: Play on People's Need to Believe to Create a Cultlike Following")
            GradientLawDescription(
                description = "Control others' perception by becoming the center of their belief, offering them a cause or vision that strengthens your influence over them.",
            )
        }

        GradientLawBox(isEven = true) {
            GradientLawTitle(title = "Law 28: Enter Action with Boldness")
            GradientLawDescription(
                description = "Project confidence and decisiveness to shape how others see you as a leader. Boldness inspires trust and admiration, reinforcing your control.",
            )
        }

        GradientLawBox(isEven = false) {
            GradientLawTitle(title = "Law 29: Plan All the Way to the End")
            GradientLawDescription(
                description = "Demonstrate foresight and control by planning every step, ensuring others see you as a master strategist who shapes outcomes to your advantage.",
            )
        }

        GradientLawBox(isEven = true) {
            GradientLawTitle(title = "Law 30: Make Your Accomplishments Seem Effortless")
            GradientLawDescription(
                description = "Cultivate an image of effortless success to inspire awe and admiration, ensuring others perceive you as naturally gifted and in control.",
            )
        }

        GradientLawBox(isEven = false) {
            GradientLawTitle(title = "Law 31: Control the Options: Get Others to Play with the Cards You Deal")
            GradientLawDescription(
                description = "Shape others' perception of control by offering choices that always lead to outcomes in your favor, reinforcing your dominance in any situation.",
            )
        }

        GradientLawBox(isEven = true) {
            GradientLawTitle(title = "Law 32: Play to People's Fantasies")
            GradientLawDescription(
                description = "Influence others by presenting an idealized image that aligns with their desires, making you indispensable as the source of their dreams.",
            )
        }
    }
}
