import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.jetbrainsCompose)
    alias(libs.plugins.compose.compiler)
}

kotlin {
    jvm("opium")

    sourceSets {
        val opiumMain by getting

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
        opiumMain.dependencies {
            implementation(libs.coil)
            implementation(compose.desktop.currentOs)
            implementation(libs.kotlinx.coroutines.swing)
            implementation(libs.okkhttp)
        }
    }
}

compose.desktop {
    application {
        mainClass = "org.sigma.project.MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "org.sigma.project"
            packageVersion = "1.0.0"

            macOS {
                iconFile.set(projectDir.resolve("resources/opium.icns"))
            }

            windows {
                iconFile.set(projectDir.resolve("composeResources/files/opium.ico"))
            }
        }

        jvmArgs(
            "--add-opens", "java.base/sun.net.www.protocol.https=ALL-UNNAMED"
        )
    }
}