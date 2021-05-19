node {
    def registryProjet='registry.gitlab.com/remiliance/registrydockerimage'
    def IMAGE="${registryProjet}:version-${env.BUILD_ID}"
    stage('Clone') {
        git 'https://github.com/remiliance/projet_panier_produit.git'
    }
    stage('Build Maven') {
        echo 'debut du build'
        sh 'mvn -DskipTests=true package' 
        docker.build("$IMAGE", '.')
    }
    stage('Run') {
	    img.withRun("--name run-$BUILD_ID -p 9099:8080") { c->
		sh 'docker ps'
		sh 'netstat -ntaup'
		sh 'sleep 30s'
		sh 'curl 127.0.0.1:9099'
		sh 'docker ps'
	    }

    }
    stage('Push') {
	    docker.withRegistry('https://registry.gitlab.com','reg2') {
		img.push 'latest'
		img.push()
       }
    }
}
