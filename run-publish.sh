OS=$1

if [ "$OS" == "macos-latest" ]; then
  ./gradlew publishIosArm32PublicationToSonatypeRepository \
    publishIosArm64PublicationToSonatypeRepository \
    publishIosSimulatorArm64PublicationToSonatypeRepository \
    publishIosX64PublicationToSonatypeRepository \
    publishMacosArm64PublicationToSonatypeRepository \
    publishMacosX64PublicationToSonatypeRepository \
    publishTvosArm64PublicationToSonatypeRepository \
    publishTvosSimulatorArm64PublicationToSonatypeRepository \
    publishTvosX64PublicationToSonatypeRepository \
    publishWatchosArm32PublicationToSonatypeRepository \
    publishWatchosArm64PublicationToSonatypeRepository \
    publishWatchosSimulatorArm64PublicationToSonatypeRepository \
    publishWatchosX64PublicationToSonatypeRepository \
    publishWatchosX86PublicationToSonatypeRepository \
    closeAndReleaseStagingRepository
elif [ "$OS" == "windows-latest" ]; then
  ./gradlew publishMingwX64PublicationToSonatypeRepository \
    closeAndReleaseStagingRepository
elif [ "$OS" == "ubuntu-latest" ]; then
  ./gradlew publishToSonatype \
    closeAndReleaseStagingRepository
else
  ./gradlew publishToSonatype \
    closeAndReleaseStagingRepository
fi