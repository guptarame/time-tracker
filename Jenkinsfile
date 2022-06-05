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

    stage('test me') {
      parallel {
        stage('test me') {
          steps {
            sh 'mvn -Dtest=TrackerTest#testMe test -pl core'
          }
        }

        stage('test me core config') {
          steps {
            sh 'mvn -Dtest=TrackerCoreConfigTest#testMe test -pl core'
          }
        }

      }
    }

    stage('test') {
      steps {
        sh 'mvn test'
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