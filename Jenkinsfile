pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building for SIT enviroment...'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing in SIT enviroment'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying in SIT to move to UAT'
            }
        }
    }
}
Shivani Shukla11:28 PM
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building for Dev enviroment...'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing in DEV enviroment'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying in Dev to move to UAT'
            }
        }
    }
}