pipeline {
    agent any
    tolls{
        maven '3.9.6'
    }
    stages {
        stages('Build'){
            steps{
                sh 'mvn -B -DeskipTests clean package'
            }
        }
    }
}