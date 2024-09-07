import org.jetbrains.compose.desktop.application.dsl.TargetFormat

        plugins {
            alias(libs.plugins.kotlinMultiplatform)
            alias(libs.plugins.jetbrainsCompose)
            alias(libs.plugins.compose.compiler)
        }

kotlin {
    jvm("desktop")

    sourceSets {
        val desktopMain by getting

        commonMain.dependencies {
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material)
            implementation(compose.ui)
            implementation(compose.components.resources)
            implementation(compose.components.uiToolingPreview)
            implementation(libs.androidx.lifecycle.viewmodel)
            implementation(libs.androidx.lifecycle.runtime.compose)
        }
        desktopMain.dependencies {
            implementation(compose.desktop.currentOs)
            implementation(libs.kotlinx.coroutines.swing)
        }
    }
}

compose.desktop {
    application {
        mainClass = "org.example.project.MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "org.example.project"
            packageVersion = "1.0.0"

            macOS {
                iconFile.set(project.file("rinfy.icns"))
            }

            windows {
                iconFile.set(project.file("opium.ico"))
        }
    }
}}