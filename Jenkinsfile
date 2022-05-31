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

    
      parallel {
        stage('Test') {
          steps {
            sh 'mvn test'
          }
        }

        stage('Regression Test') {
          steps {
            sh 'mvn -Dtest=TrackerTest#testAdd test -pl core'
          }
        }

      }
    

    stage('Package') {
      steps {
        sh 'mvn package'
      }
    }

  }
  environment {
    maven = 'maven3.0.5'
  }
}
