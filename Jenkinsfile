pipeline {
  agent any
  stages {
    stage('deploy') {
      steps {
        sh '''pwd
tomcatPath="/root/tomcat/apache-tomcat-8.5.29/webapps"
mvn package
mv ./target/*.war "${tomcatPath}/test.war"
cd "${tomcatPath}" 
ps -ef | grep tocmat 
pwd 
nohup ../bin/startup.sh & 


'''
      }
    }
  }
}