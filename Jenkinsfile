#!/usr/bin/env groovy

pipeline {
    
     agent {
        sudo usermod -a -G docker $USER
        docker 'gradle:3.4.1' 
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
