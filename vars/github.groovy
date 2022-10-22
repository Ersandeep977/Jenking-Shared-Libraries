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

def ScpData(WORKSPACE,ip)
{
  sh 'scp ${WORKSPACE}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/testapp.war'
}

def SelTesting(WORKSPACE)
{
  sh 'java -jar ${WORKSPACE}/testing.jar'
}



