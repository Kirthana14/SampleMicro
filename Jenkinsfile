#!/usr/bin/env groovy

pipeline {
    
    agent  {
        
        docker {
            image 'gradle'
            args '-u root'
        }
    }
    
    stages {
        
        
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
