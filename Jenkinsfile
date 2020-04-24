node {
    def registryProjet='registry.gitlab.com/remiliance/registrydockerimage'
    def IMAGE="${registryProjet}:version-${env.BUILD_ID}"
    stage('Clone') {
        git 'https://github.com/remiliance/projet_panier_produit.git'
    }
    def img=stage('Build') {
        echo 'debut du build'
        sh 'mvn -DskipTests=true package' 
        docker.build("$IMAGE", '.')
    }
    stage('Run') {
	    img.withRun("--name run-$BUILD_ID -p 9099:8080") 
    }
    stage('Push') {
	    docker.withRegistry('https://registry.gitlab.com','reg1') {
		img.push 'latest'
		img.push()
       }
    }
}
