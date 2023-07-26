pipeline {
  agent {
    kubernetes {}
  }
  
  stages {
    stage('build') {
      steps {
          script {
            sh 'echo 'starting build''
            sh 'pwd'
            sh 'ls'
          }
      }
    }
  }
}
