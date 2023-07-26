pipeline {
  agent {
    kubernetes {}
  }
  
  stages {
    stage('build') {
      steps {
          script {
            echo 'starting build'
            sh 'pwd'
            sh 'ls'
            sh './gradlew clean build'
          }
      }
    }
  }
}
