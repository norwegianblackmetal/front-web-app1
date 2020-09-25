node {
        stage('git clone'){
            git branch: 'master', credentialsId: '0d926019-b1c1-4288-b928-e2373cbb9b6c', url: 'git@github.com:cemetery-team/dusty.git'
        }
        stage('ls'){
            sh 'ls .'
        }
        stage('run webapp') {
            sh 'python main.py'
        }
}