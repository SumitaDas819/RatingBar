Overview

The RatingBar composable function is a customizable star rating bar that allows users to view or modify ratings. It supports different drawable resources for selected and unselected states, tint colors, and spacing between rating items. Optionally, the rating can be editable, enabling user interaction.

Parameters

modifier: Modifier (optional) - Allows customization of the layout.

maxRating: Int (default: 5) - Defines the maximum number of rating items.

initialRating: Int (default: 2) - The initial rating value displayed. Must not exceed maxRating.

selectedDrawableRes: @DrawableRes Int - Resource ID for the selected (filled) rating item.

unSelectedDrawableRes: @DrawableRes Int - Resource ID for the unselected (empty) rating item.

selectedDrawableTint: Color (default: Color(0xFFED8A19)) - Tint color for the selected rating items.

unSelectedDrawableTint: Color (default: Color.Gray) - Tint color for the unselected rating items.

imageSize: Dp (default: 30.dp) - Size of each rating icon.

itemSpacing: Dp (default: 10.dp) - Spacing between rating items.

isEditable: Boolean (default: false) - Determines if the rating bar is interactive.

rating: (Int) -> Unit - Callback function to receive the selected rating value.

Example Usage

1. Read-Only Rating Bar

RatingBar(
    maxRating = 5,
    initialRating = 3
)

2. Editable Rating Bar with Callback

RatingBar(
    maxRating = 5,
    initialRating = 4,
    isEditable = true,
    rating = { newRating ->
        println("User selected rating: $newRating")
    }
)


How to Use 

Add it in your root settings.gradle at the end of repositories:

	dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}

Add the dependency

	dependencies {
	        implementation 'com.github.SumitaDas819:RatingBar:1.0.0'
	}
