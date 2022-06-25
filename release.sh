export JAVA_HOME=/home/rodislav/Apps/jdk-11.0.11+9/

mvn clean release:prepare -P ossrh

mvn release:perform -P ossrh

git push origin main
