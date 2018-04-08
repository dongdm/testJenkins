pipeline {
  agent any
  stages {
    stage('init') {
      steps {
        sh '''pwd
mvn package
cp ./target/testJenkins-0.0.1-SNAPSHOT.war /d/JAVA/apache-tomcat-7.0.79/wtpwebapps/testJenkins.war
status=`curl -I -m 10 -o /dev/null -s -w %{http_code} http://localhost:9090`
echo ${status}
cd /d/JAVA/apache-tomcat-7.0.79
if [ $status -eq 200 ] ; then 
  echo \'tomcat is started\'
  sh ./bin/shutdown.sh
 else 
  echo \'tomcat is stoped\'
fi
sh ./bin/startup.sh 
'''
      }
    }
  }
}