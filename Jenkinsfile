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
            sh './gradlew clean build'
          }
      }
    }
  }

  post {
    success {
      echo '${currentBuild.durationString}'
    }
  }
}
