pipeline {
  agent any
  stages {
    stage('git') {
      steps {
        sh 'git --version'
      }
    }
    stage('javaTest') {
      steps {
        sh '''java -version
echo "Hello" 
mvn --v'''
      }
    }
  }
}