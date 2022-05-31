pipeline {
  agent any
  stages {
    stage('build') {
      agent any
      steps {
        git(url: 'https://github.com/guptarame/time-tracker.git', branch: 'master')
      }
    }

    stage('test') {
      steps {
        sh 'mvn -Dtest=TrackerTest#testAdd test -pl core'
      }
    }

    stage('integration test') {
      steps {
        sh 'mvn test'
      }
    }

  }
}