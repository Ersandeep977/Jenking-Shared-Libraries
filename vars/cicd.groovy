def newgit(repo)
{
  git "${repo}"
}

def mvn()
{
  sh 'mvn package'
}

def scp()
{
  sh 'scp /var/lib/jenkins/sa.txt ubuntu@172.31.20.2:/home/ubuntu'
}
