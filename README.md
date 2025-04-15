# ⭐ RatingBar - A Customizable Star Rating Bar for Jetpack Compose

`RatingBar` is a Jetpack Compose library that provides a customizable star rating bar. It allows users to view or set ratings with intuitive star icons. Designed with flexibility in mind, it supports tinting, custom drawables, adjustable sizes, spacing, and optional interactivity.

---

## 🚀 Features

- ✅ Custom drawable resources for selected and unselected states  
- 🎨 Support for tint colors on both states  
- 📏 Adjustable icon size and spacing  
- ✨ Editable mode to allow user interaction  
- 🔄 Callback support to handle rating changes

---

## 📦 Installation

### Step 1: Add JitPack to your root `settings.gradle` file

```kotlin
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```
### Step 2: Add the dependency to your build.gradle (app module)
```
dependencies {
    implementation 'com.github.SumitaDas819:RatingBar:1.0.0'
}
```
## 🛠️ Parameters

| Parameter                 | Type                | Default              | Description                                           |
|--------------------------|---------------------|----------------------|-------------------------------------------------------|
| `modifier`               | `Modifier`          | _optional_           | Modifier for layout customization                     |
| `maxRating`              | `Int`               | `5`                  | Maximum number of rating items                        |
| `initialRating`          | `Int`               | `2`                  | Initial rating value (must not exceed `maxRating`)    |
| `selectedDrawableRes`    | `@DrawableRes Int`  | _required_           | Drawable resource for selected (filled) icon          |
| `unSelectedDrawableRes`  | `@DrawableRes Int`  | _required_           | Drawable resource for unselected (empty) icon         |
| `selectedDrawableTint`   | `Color`             | `Color(0xFFED8A19)`  | Tint color for selected icons                         |
| `unSelectedDrawableTint` | `Color`             | `Color.Gray`         | Tint color for unselected icons                       |
| `imageSize`              | `Dp`                | `30.dp`              | Size of each rating icon                              |
| `itemSpacing`            | `Dp`                | `10.dp`              | Spacing between icons                                 |
| `isEditable`             | `Boolean`           | `false`              | Enables rating input if `true`                        |
| `rating`                 | `(Int) -> Unit`     | _optional_           | Callback to receive the selected rating               |

## 🧩 Example Usage

## 📖 Read-Only Rating Bar
```
RatingBar(
    maxRating = 5,
    initialRating = 3,
    selectedDrawableRes = R.drawable.ic_star_filled,
    unSelectedDrawableRes = R.drawable.ic_star_outline
)
```
## ✍️ Editable Rating Bar with Callback
```
RatingBar(
    maxRating = 5,
    initialRating = 4,
    isEditable = true,
    selectedDrawableRes = R.drawable.ic_star_filled,
    unSelectedDrawableRes = R.drawable.ic_star_outline,
    rating = { newRating ->
        println("User selected rating: $newRating")
    }
)
```

## 📬 Contributing
Contributions are welcome and encouraged! If you'd like to help improve this project, please follow these steps:

1. Fork the repository
2. Create a new branch (`git checkout -b feature/your-feature-name`)
3. Make your changes
4. Commit your changes (`git commit -am 'Add new feature'`)
5. Push to the branch (`git push origin feature/your-feature-name`)
6. Open a Pull Request

**Before submitting your PR, make sure:**
- Your code follows the project's coding style
- You’ve added/updated tests if necessary
- Documentation is updated (if applicable)

Feel free to open an issue to discuss your ideas or report bugs.

## 📝 License
This project is licensed under the MIT License – see the LICENSE file for details.

## 🙋‍♀️ Author
Developed by Sumita Das

Feel free to contribute, suggest features, or report issues! ⭐
