pipeline {
  agent any
  stages {
    stage('init') {
      steps {
        sh '''pwd
mvn package
dir
cp ./target/*.war /D:/JAVA/apache-tomcat-7.0.79/wtpwebapps/'''
      }
    }
  }
}