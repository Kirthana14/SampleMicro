#!/usr/bin/env groovy

pipeline {
    agent any
  
    
    stages {
               stage('Build') {
            steps {
                echo 'Building'
               
                
            }
        }
                 stage('Test') {
            steps {
                echo 'Testing'
               
                
            }
        } 
      
        stage('Deploy') {
            steps {
                echo 'Delivering...'
                //sh 'java -jar build/libs/gs-securing-web-0.1.0.jar '
             
            }
        }
        stages {
     stage('Copy Archive') {
         steps {
             script {
                 step ([$class: 'CopyArtifact',
                 projectName: 'Sample-project',
                 filter: "build/libs/*.jar",
                 target: 'var/www']);
             }
         }
     }
    }

