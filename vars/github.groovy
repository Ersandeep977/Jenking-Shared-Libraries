def gitmaven()
{
  git 'https://github.com/Ersandeep977/DevOps-Maven-code.git'
}

def gitfunction()
{
 git 'https://github.com/Ersandeep977/DevOps-FunctionTesting-code.git'
}

def MvnPack()
{
  sh 'mvn package'
}

def scp(WORKSPACE)
{
  sh 'scp ${WORKSPACE}/webapp/target/webapp.war ubuntu@172.31.20.2:/var/lib/tomcat9/webapps/testapp.war'
}

def SelTesting()
{
  sh 'java -jar /var/lib/jenkins/workspace/test-1/testing.jar'
}



