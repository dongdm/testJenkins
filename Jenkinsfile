pipeline {
  agent any
  stages {
    stage('deploy') {
      steps {
        sh '''pwd
tomcatPath="/root/tomcat/apache-tomcat-8.5.29/bin"
mvn package
mv ./target/*.war "${tomcatPath}/test.war"
cd "${tomcatPath}" 
ps -ef | grep tocmat 
pwd 
nohup /root/tomcat/apache-tomcat-8.5.29/bin/startup.sh
sleep 1000000


'''
      }
    }
    stage('end') {
      steps {
        sh 'echo "deploy end"'
      }
    }
  }
}