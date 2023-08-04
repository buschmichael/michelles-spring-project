pipeline {
  agent {
    kubernetes {
//      yaml '.jenkins/agent-base.yaml'
    }
  }
  
  stages {
    stage('init') {
      steps {
        script {
          echo 'welcome, lets do this'
        }
      }
    }
    stage('build') {
      steps {
          script {
            echo 'starting build'
            sh 'pwd'
            sh 'ls'
//            sh './gradlew clean build'
          }
      }
    }
  }

  post {
    success {
      echo '$BUILD_URL'
      echo '$BUILD_RESULT'
      echo '$JENKINS_URL'
      echo '$GIT_URL'
      echo '$WORKSPACE'
    }
  }
}
