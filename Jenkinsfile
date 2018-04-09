pipeline {
  agent any
  stages {
    stage('init') {
      steps {
        sh '''mvn package
cp ./target/testJenkins-0.0.1-SNAPSHOT.war /d/JAVA/apache-tomcat-7.0.79/wtpwebapps/testJenkins.war
sleep 1 
rm -rf /d/JAVA/apache-tomcat-7.0.79/webapps/testJenkins
sleep 1
status=`curl -I -m 10 -o /dev/null -s -w %{http_code} http://localhost:9090`
echo "result$?"
echo $status 
if false; then 
if [ $status -eq 200 ]; then
  sh /d/JAVA/apache-tomcat-7.0.79/bin/shutdown.sh
fi
sleep 1
sh /d/JAVA/apache-tomcat-7.0.79/bin/startup.sh &
fi
'''
      }
    }
  }
}