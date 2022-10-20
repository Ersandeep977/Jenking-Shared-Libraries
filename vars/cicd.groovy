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
  sh 'scp /home/ubuntu/.jenkins/workspace/DeclarativePipeline3/webapp/target/webapp.war ubuntu@172.31.20.211:/var/lib/tomcat9/webapps/testapp.war'
}
