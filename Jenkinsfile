pipeline {
  agent any
  stages {
    stage('input') {
      steps {
        input(message: 'input your name', id: 'name')
      }
    }
    stage('print') {
      steps {
        sh 'echo "${name}"'
        echo 'name'
      }
    }
  }
}