node {
        stage('git clone'){
            git branch: 'master', credentialsId: '0d926019-b1c1-4288-b928-e2373cbb9b6c', url: 'git@github.com:norwegianblackmetal/web-app1.git'
        }

        stage('whoami'){
            sh 'whoami'
        }

        stage('create python-virtual-env'){
            withEnv(["HOME=${env.WORKSPACE}"]) {
                sh 'python3 -m venv venv'
                sh 'source venv/bin/activate; pip install -r requirements.txt; pip install flask'
            }
        }

        stage('run webapp') {
            sh 'python main.py'
        }
}