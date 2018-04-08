pipeline {
  agent any
  stages {
    stage('init') {
      steps {
        sh '''pwd
mvn package
dir
cp ./target/*.war /d/JAVA/apache-tomcat-7.0.79/wtpwebapps/
status=`curl -I -m 10 -o /dev/null -s -w %{http_code} http://localhost:9090`
echo ${status}
if [ $status -eq 200 ] ; then 
  echo \'tomcat is started\'
 else 
  echo \'tomcat is stoped\'
fi
'''
      }
    }
  }
}