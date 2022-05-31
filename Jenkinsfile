pipeline {
  agent any
  stages {
    stage('build') {
      agent any
      steps {
        git(url: 'https://github.com/guptarame/time-tracker.git', branch: 'master')
      }
    }

    stage('Test') {
      parallel {
        stage('Test') {
          steps {
            sh 'mvn test'
          }
        }

        stage('Regression Test') {
          steps {
            sh 'sh \'mvn -Dtest=TrackerTest#testAdd test -pl core\''
          }
        }

      }
    }

    stage('Package') {
      steps {
        sh 'mvn package'
      }
    }

  }
}