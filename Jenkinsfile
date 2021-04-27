pipeline {
    agent any
    tools {
        maven "maven3.8.1"
    }
    stages {
        stage('Build') {
            steps {
                echo 'THis is Build step'
                git credentialsId: '1f1e0701-9e2a-4e7b-8ed3-a7b04a8a0c80', url: 'https://github.com/sdakinedi/time-tracker.git'
            }
        }
        
        stage('Test') {
            steps {
                echo 'This will test'
                 bat 'mvn clean test'
            }
        }
        
        stage('Results') {
            steps {
                echo 'This will show Results'
                 junit '**/*.xml'
                 
            }
        }
        
        stage('Package') {
            steps {
                echo 'This will Package'
                 bat 'mvn package'
                 archiveArtifacts artifacts: '**/*.war', followSymlinks: false
            }
        }
		
		stage('Deploy') {
            steps {
                echo 'This will Package'
                 deploy adapters: [tomcat9(credentialsId: 'TOMCAT_DEPLOYER', path: '', url: 'http://18.156.163.149:8090/')], contextPath: null, war: '**/*.war'
            }
        }
		

    }
}
