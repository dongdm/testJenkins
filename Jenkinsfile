pipeline {
  agent any
  stages {
    stage('init') {
      steps {
        sh '''mvn package
cp ./target/testJenkins-0.0.1-SNAPSHOT.war /d/JAVA/apache-tomcat-7.0.79/wtpwebapps/testJenkins.war
sleep 
rm -rf /d/JAVA/apache-tomcat-7.0.79/webapps/testJenkins
sleep 1'''
      }
    }
  }
}