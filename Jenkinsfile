pipeline {
  agent any
  stages {
    stage('deploy') {
      steps {
        sh '''tomcatPath=/root/tomcat/apache-tomcat-8.5.29/
appPath=$tomcatPath/webapps
binPath=$tomcatPath/bin
mvn package
pidList = `ps -ef |grep tomcat  |grep -v "grep"|awk \'{print $2}\'`
kill -9 $pidList
rm -rf ${appPath}/test.war
mv ./target/*.war "${appPath}/test.war"
nohup /root/tomcat/apache-tomcat-8.5.29/bin/startup.sh &

'''
      }
    }
  }
}