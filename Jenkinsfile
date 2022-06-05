pipeline {
  agent any
  stages {
    stage('build') {
      agent any
      steps {
        git(url: 'https://github.com/guptarame/time-tracker.git', branch: 'master')
      }
    }

    stage('Compile') {
      steps {
        sh 'mvn compile'
      }
    }

    stage('Regression Test') {
      parallel {
        stage('Regression Test') {
          steps {
            sh 'mvn -Dtest=TrackerTest#testMe test -pl core'
          }
        }

        stage('test2') {
          steps {
            sh 'mvn -Dtest=TrackerTest#testAdd test -pl core'
          }
        }

      }
    }

    stage('test') {
      steps {
        sh 'mvn -Dtest=TrackerTest#testAdd test -pl core'
      }
    }

    stage('package') {
      steps {
        sh 'mvn package'
      }
    }

  }
  environment {
    maven = 'maven3.0.5'
  }
}