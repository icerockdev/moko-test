![moko-test](img/logo.png)  
[![GitHub license](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](http://www.apache.org/licenses/LICENSE-2.0) [![Download](https://img.shields.io/maven-central/v/dev.icerock.moko/test-core) ](https://repo1.maven.org/maven2/dev/icerock/moko/test-core/) ![kotlin-version](https://kotlin-version.aws.icerock.dev/kotlin-version?group=dev.icerock.moko&name=test-core)

# Mobile Kotlin test utils

This is a Kotlin Multiplatform library that provides utilities for run tests.

## Table of Contents

- [Features](#features)
- [Requirements](#requirements)
- [Installation](#installation)
- [Usage](#usage)
- [Samples](#samples)
- [Set Up Locally](#set-up-locally)
- [Contributing](#contributing)
- [License](#license)

## Features

- **...** - ...;

## Requirements

- Gradle version 6.8+
- Android API 16+
- iOS version 11.0+

## Installation

root build.gradle

```groovy
allprojects {
    repositories {
        mavenCentral()
    }
}
```

project build.gradle

```groovy
dependencies {
    commonTestApi("dev.icerock.moko:test-core:0.4.0")
    commonTestApi("dev.icerock.moko:test-roboelectric:0.4.0") // for roboelectric tests support
}
```

## Usage

### runBlocking

```kotlin
import dev.icerock.moko.test.runBlocking

fun test() {
    runBlocking {
        // some suspend functions
    }
}
```

### TestCases

```kotlin
class MyTests : TestCases() {
    override val rules: List<Rule> = listOf(
        InstantTaskRule() // apply https://developer.android.com/reference/android/arch/core/executor/testing/InstantTaskExecutorRule for android
    )

    @Test
    fun `my test`() {
        // ...
    }
}
```

also available creation of own rules by inherit `dev.icerock.moko.test.cases.TestCases.Rule`

```kotlin
class InstantTaskRule : TestCases.Rule {

    override fun setup() {
        // do some action before each test
    }

    override fun tearDown() {
        // do some action after each test
    }
}
```

### Roboelectric support

```kotlin
class MyTests : RoboelectricTestCases() {
    override val rules: List<Rule> = listOf(
        // ...
    )

    @Test
    fun `my test`() {
        // ...
    }
}
```

## Samples

Please see more examples in the [sample directory](sample).

## Set Up Locally

- The [test directory](test) contains the `test` library;
- In [sample directory](sample) contains sample mpp-library with tests.

## Contributing

All development (both new features and bug fixes) is performed in the `develop` branch. This
way `master` always contains the sources of the most recently released version. Please send PRs with
bug fixes to the `develop` branch. Documentation fixes in the markdown files are an exception to
this rule. They are updated directly in `master`.

The `develop` branch is pushed to `master` on release.

For more details on contributing please see the [contributing guide](CONTRIBUTING.md).

## License

    Copyright 2021 IceRock MAG Inc.
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
       http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
