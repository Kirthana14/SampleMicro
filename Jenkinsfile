#!/usr/bin/env groovy

pipeline {
    
    agent  any
    
    stages {
         stage("Permisiion") {
              steps {
                sh 'chmod 666 /var/run/docker.sock'
                    }
        
        
         stage("Gradle") {
              steps {
                sh 'docker pull gradle'
                    }
            
              
         }
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
