pipeline {
  agent any
  stages {
    stage('init') {
      steps {
        sh '''mvn package
cp ./target/testJenkins-0.0.1-SNAPSHOT.war /d/JAVA/apache-tomcat-7.0.79/wtpwebapps/testJenkins.war
sleep 1
status=`curl -I -m 10 -o /dev/null -s -w %{http_code} http://localhost:9090`
cd /d/JAVA/apache-tomcat-7.0.79
rm -rf ./webapps/testJenkins
sleep 1
status=""$status
echo $status
if [ $status = "200"x ] ; then 
  echo \'tomcat is started\'
  ./bin/shutdown.sh
 else 
  echo \'tomcat is stoped\'
fi
sleep 1'''
      }
    }
    stage('start') {
      steps {
        sh '''sleep 1 
cd /d/JAVA/apache-tomcat-7.0.79
./bin/startup.sh &'''
      }
    }
  }
}