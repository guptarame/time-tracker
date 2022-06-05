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
      steps {
        sh 'mvn -Dtest=TrackerTest#testMe test -pl core'
      }
    }

    stage('Package') {
      parallel {
        stage('Package') {
          steps {
            sh 'mvn package'
          }
        }

        stage('test') {
          steps {
            sh 'mvn -Dtest=TrackerTest#testAdd test -pl core'
          }
        }

      }
    }

    stage('') {
      steps {
        echo 'aa'
      }
    }

  }
  environment {
    maven = 'maven3.0.5'
  }
}