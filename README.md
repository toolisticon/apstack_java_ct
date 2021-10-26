# APSTACK-JAVA-CT

[![default](https://github.com/toolisticon/apstack_java_ct/actions/workflows/default.yml/badge.svg)](https://github.com/toolisticon/apstack_java_ct/actions/workflows/default.yml)

## Description
This project is used to test compatibility of the toolisticon annotation processor stack projects with all available Java versions.

- [APTK - Annotation Processor Toolkit](https://github.com/toolisticon/aptk)
- [CUTE - Compile-Time Unit Testing](https://github.com/toolisticon/cute)
- [SPIAP - Alternative for google auto](https://github.com/toolisticon/spiap)

All projects can currently be build with Java versions up to Java 12.
This is mainly not affected by the projects itself, but by the build tools used.
There are a lot of tools like Mockito, Jacoco, Javadoc,.. which are likely to be incompatible with different or new Java versions.

Therefore, this project uses just a rudimentary setup, mainly focussing on the pure compilation and testing of a processor.

## Contributions

- (2021) Tobias Stamann (Holisticon AG)

# License

This project is released under the revised [MIT License](LICENSE).

This project includes and repackages the [Annotation-Processor-Toolkit](https://github.com/holisticon/annotation-processor-toolkit) released under the  [MIT License](/3rdPartyLicenses/annotation-processor-toolkit/LICENSE.txt).
