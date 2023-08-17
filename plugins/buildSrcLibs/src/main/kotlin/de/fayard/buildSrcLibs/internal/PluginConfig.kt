package de.fayard.buildSrcLibs.internal


@Suppress("unused")
internal object PluginConfig {

    const val REFRESH_VERSIONS = "refreshVersions"
    const val BUILD_SRC_LIBS = "buildSrcLibs"

    /** Documentation **/
    internal fun issue(number: Int): String = "$refreshVersionsUrl/issues/$number"

    const val refreshVersionsUrl = "https://github.com/Splitties/refreshVersions"


    val INITIAL_GITIGNORE = """
        |.gradle/
        |build/
        """.trimMargin()

    val KDOC_LIBS = """
        |Generated by
        |   $ ./gradlew $BUILD_SRC_LIBS
        |Re-run when you add a new dependency to the build
        |
        |Find which updates are available by running
        |    $ ./gradlew $REFRESH_VERSIONS
        |And edit the file `versions.properties`
        |
        |See $refreshVersionsUrl
    """.trimMargin()

    //
    val KDOC_VERSIONS = """

        |And edit the file `versions.properties`

    """.trimMargin()


    val INITIAL_BUILD_GRADLE_KTS = """
        |plugins {
        |    `kotlin-dsl`
        |}
        |repositories {
        |    mavenCentral()
        |}
        """.trimMargin()


}
