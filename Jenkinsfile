pipeline {
  agent any
  tools {
          maven "MAVEN_HOME"
          }

  stages {
    stage('build') {
        steps {
        git branch: 'myself', credentialsId: '5b9319da-8c4f-4392-8560-98d63bbc8bfc', url: 'https://github.com/guptarame/time-tracker.git'
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

    //stage('test') {
    //  steps {
    //    sh 'mvn -Dtest=TrackerTest test -pl core'
    //  }
    //}

    //stage('package') {
    //  steps {
    //    sh 'mvn package'
    //  }
    //}

  }

}