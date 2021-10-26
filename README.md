# APSTACK-JAVA-CT

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.toolisticon.spiap/spiap-processor/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.toolisticon.spiap/spiap-processor)
[![Build Status](https://travis-ci.org/toolisticon/SPI-Annotation-Processor.svg?branch=master)](https://travis-ci.org/toolisticon/SPI-Annotation-Processor)
[![codecov](https://codecov.io/gh/toolisticon/SPI-Annotation-Processor/branch/master/graph/badge.svg)](https://codecov.io/gh/toolisticon/SPI-Annotation-Processor)

## Description
This project is used to test compatibility of the toolisticon annotation processor stack projects with all available Java versions.

- [APTK - Annotation Processor Toolkit](https://github.com/toolisticon/aptk)
- [CUTE - Compile-Time Unit Testing](https://github.com/toolisticon/cute)
- [SPIAP - Alternative for google auto](https://github.com/toolisticon/spiap)

All projects can currently be build with Java versions up to Java 12.
This is mainly not affected by the projects itself, but by the build tools used.
There are a lot of tools like Mockito, Jacoco, Javadoc,.. which aren't a 100% compatible with all Java versions.

Therefore, this project uses just a rudimentary setup, mainly focussing on the pure compilation and testing of a processor.

## Contributions

- (2021) Tobias Stamann (Holisticon AG)

# License

This project is released under the revised [MIT License](LICENSE).

This project includes and repackages the [Annotation-Processor-Toolkit](https://github.com/holisticon/annotation-processor-toolkit) released under the  [MIT License](/3rdPartyLicenses/annotation-processor-toolkit/LICENSE.txt).
