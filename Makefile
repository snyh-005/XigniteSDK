run:
	mvn spring-boot:run

install:
	mvn clean install -DskipTests

test:
	mvn clean test

package:
	mvn clean package spring-boot:repackage -DskipTests
	mvn clean install -Dmaven.repo.local=false -DskipTests
