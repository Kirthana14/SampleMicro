#!/usr/bin/env groovy

pipeline {
    
     agent {
       
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
