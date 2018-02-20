#!/usr/bin/env groovy

pipeline {
    
    agent  any
    
    stages {
         stage("Gradle") {
             agent {
                docker 'gradle'
                   }
               steps {
                sh ' usermod -a -G docker $USER'
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
