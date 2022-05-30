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
        sh 'mvn -Dtest=TrackerTest#testadd test -pl core'
        withMaven(jdk: 'jdk1.8.312', maven: 'Maven3.0.5')
      }
    }

  }
}