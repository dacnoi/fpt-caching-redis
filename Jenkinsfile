[code language="java"]
node {

    withMaven(maven:'maven') {

        stage('Checkout') {
            git url: 'https://github.com/dacnoi/fpt-caching-redis.git', branch: 'master'
        }
		
        stage('Build') {
            sh 'mvn clean install'

            def pom = readMavenPom file:'pom.xml'
            print pom.version
            env.version = pom.version
        }
    }

}