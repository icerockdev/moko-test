import org.gradle.api.Project
import org.gradle.api.artifacts.Configuration
import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.dependencies

// on CI for not linux machine we disable android target to speed up builds. so we should
// support optional dependencies
fun Project.androidMainApiOpt(dependency: Provider<MinimalExternalModuleDependency>) {
    val configuration: Configuration = configurations.findByName("androidMainApi") ?: return
    dependencies {
        configuration(dependency)
    }
}
