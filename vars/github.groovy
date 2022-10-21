def gitmaven()
{
  git 'https://github.com/Ersandeep977/DevOps-Maven-code.git'
}

def gitfunction()
{
 git 'https://github.com/Ersandeep977/DevOps-FunctionTesting-code.git'
}

def mvn()
{
  sh 'mvn package'
}

def scp()
{
  sh 'scp /var/lib/jenkins/workspace/test-1/webapp/target/webapp.war ubuntu@172.31.20.2:/var/lib/tomcat9/webapps/testapp.war'
}

