[![Latest version](https://img.shields.io/maven-central/v/com.xdev-software/xapi-fx)](https://mvnrepository.com/artifact/com.xdev-software/xapi-fx)
[![Build](https://img.shields.io/github/workflow/status/xdev-software/xapi-fx/Check%20Build/develop)](https://github.com/xdev-software/xapi-fx/actions/workflows/checkBuild.yml?query=branch%3Adevelop)
[![javadoc](https://javadoc.io/badge2/com.xdev-software/xapi-fx/javadoc.svg)](https://javadoc.io/doc/com.xdev-software/xapi-fx) 

# XDEV Application Framework JavaFX
This is the JavaFX part of the XDEV Application Framework. All other components are in https://github.com/xdev-software/xapi

This repository has a branch for every supported Java LTS version. Make sure to get the version the matches your Java runtime.

## Contributing

We would absolutely love to get the community involved, and we welcome any form of contributions – comments and questions on different communication channels, issues and pull request in the repositories, and anything that you build and share using our components.

### Get in touch with the team

Twitter: https://twitter.com/xdevsoftware<br/>
Mail: opensource@xdev-software.de

### Some ways to help:

- **Report bugs**: File issues on GitHub.
- **Send pull requests**: If you want to contribute code, check out the development instructions below.

We encourage you to read the [contribution instructions by GitHub](https://guides.github.com/activities/contributing-to-open-source/#contributing) also.

## Dependencies and Licenses
The XDEV Application Framework is released under [GNU Lesser General Public License version 3](https://www.gnu.org/licenses/lgpl-3.0.en.html) aka LGPL 3<br/>
View the [summary of all dependencies online](https://xdev-software.github.io/xapi-fx/dependencies/)

## Releasing [![Build](https://img.shields.io/github/workflow/status/xdev-software/xapi-fx/Release?label=Release)](https://github.com/xdev-software/xapi-fx/actions/workflows/release.yml)
Consider doing a [test-deployment](https://github.com/xdev-software/xapi-fx/actions/workflows/test-deploy.yml?query=branch%3Adevelop) before actually releasing.

If the ``develop`` is ready for release, create a pull request to the ``master``-Branch and merge the changes.

When the release is finished do the following:
* Merge the auto-generated PR (with the incremented version number) back into the ``develop``
* Add the release notes to the [GitHub release](https://github.com/xdev-software/xapi-fx/releases/latest)
