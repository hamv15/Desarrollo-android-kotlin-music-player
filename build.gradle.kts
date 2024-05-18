// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript{
    dependencies{
        classpath (libs.androidx.androidx.navigation.safeargs.kotlin.gradle.plugin)
    }
} //Para pasar argumentos de manera segura *Es importante que esté arriba de pluins

plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
    alias(libs.plugins.safeargs.kotlin) apply false
}