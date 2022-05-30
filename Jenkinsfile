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
        sh 'mvn -Dtest=TrackerTest#testAdd test'
        withMaven(jdk: 'jdk1.8.0_312', maven: 'Maven3.0.5')
      }
    }

  }
}