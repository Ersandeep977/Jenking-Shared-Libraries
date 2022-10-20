def newgit(repo)
{
  git "${repo}"
}

def mvn()
{
  sh 'mvn package'
}

def scp1()
{
  sh 'scp /var/lib/jenkins/sa.txt ubuntu@172.31.20.2:/home/ubuntu'
}

def scp()
{
  sh 'scp /var/lib/jenkins/workspace/Shared-Lib-2/webapp/target/webapp.war ubuntu@172.31.20.2:/var/lib/tomcat9/webapps/testapp.war'
}
