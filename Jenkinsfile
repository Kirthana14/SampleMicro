#!/usr/bin/env groovy

pipeline {
    
    agent  {
        
        docker {
            image 'gradle'
            args '-u root'
            //sh 'chmod 666 /var/run/docker.sock'
            //sh 'sudo usermod -a -G docker kirthana'
        }
    }
    
    stages {
        
        
        
        stage('Build') {
            steps {
                echo 'Building...'
                sh 'gradle build'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                sh 'java -jar build/libs/gs-securing-web-0.1.0.jar'
            }
        }
    }
}
