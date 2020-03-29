sonar:
	mvn sonar:sonar -Dsonar.login=114b33508b27fc8cc43fc5bb79b79d8d6d894398 -Dsonar.projectKey=maven-multi-modules-jacoco-sonar -Dsonar.projectName="Maven multi modules with sonar"
clean:
	mvn clean
all:
	mvn install

