//program14
#include<iostream>
#include<cmath>
using namespace std;
class queue                           
{
	private:
	float lambda,mu,rho,rho1,pO,pn,sum,l,lq,n,w,wq,busy;
	public:
	int c;
	int fun(int a)                        //finding factorial
	{
		int fact=1;
		for(int i=1;i<=a;i++)
		fact*=i;
		return fact;
	}
void Server1()                       //function to implement single server
{
	cout<<"\nM|M|1 is the queueing system. Assumptions are :";
	cout<<"\n- Number of arrivals follows poisson probability distribution.";
	cout<<"\n- Service time follows exponential probability distribution.";
	cout<<"\n- There is a single server.";
	cout<<"\n- Queue discipline is FcFs.";
	cout<<"\n- System capacity is infinite.";
        cout<<"\n- The average service rate (mu) is more than the average arrival rate (lambda).";
	cout<<"\n\nWhere lambda and mu are constants, dt is incremental element, O(dt)is quantity which is negligible as compared to dt";
	cout<<"\n\nEnter the number of arrivals in the system by time t ( n = ) ";
	cin>>n;
	cout<<"\nEnter the average arrival rate ( lambda = ) ";
	cin>>lambda;
	cout<<"\nEnter the average service rate ( mu = ) ";
	cin>>mu;
        // calculating traffic intensity and expected number of busy servers
	rho=lambda/mu;
	rho1=lambda/mu;
	if(rho>=1)
		cout<<"\nThe model cannot be computed.";
	else
	{
		/*calculating expected number of units and expected waiting time of the units
		in the system and in the queue*/
		l=(rho)/(1-(rho));
		lq=pow(rho,2)/(1-rho);
		w=l/lambda;
		wq=lq/lambda;
		// calculating the expected number of busy servers
		busy=floor(rho1);
		//calculating the number of customers at time t (n>=0)
		pn=pow(rho,n)*(1-rho);
		cout<<"\nOffered load of the system = "<<rho;
		cout<<"\nCarried load of the system = "<<rho1;
		cout<<"\nTraffic intensity = "<<rho;
		cout<<"\nUtilisation factor of the system = "<<rho;
		cout<<"\nProbability of n arrivals till time t = "<<pn;
		cout<<"\nExpected number of customers waiting in the system = "<<l;
		cout<<"\nExpected number of customers waiting in the queue = "<<lq;
		cout<<"\nExpected waiting time in the system = "<<w;
		cout<<"\nExpected waiting time in the queue = "<<wq;
	}
}
void ServerC()                    //function to implement multiple (c) servers
{
	cout<<"\nM|M|C is the queueing system. Assumptions are :";
	cout<<"\n- Number of arrivals follows poisson probability distribution.";
	cout<<"\n- Service time follows exponential probability distribution.";
	cout<<"\n- Number of servers is finite & equal to C.";
	cout<<"\n- Queue discipline is FcFs.";
	cout<<"\n- System capacity is infinite.";
        cout<<"\n- The average service rate (mu) is more than the average arrival rate (lambda).";
	cout<<"\n\nWhere lambda and mu are constants, dt is incremental element, O(dt)is quantity which is negligible as compared to dt";
	cout<<"\n\nEnter the number of arrivals in the system by time t ( n = ) ";
	cin>>n;
	cout<<"\nEnter the average arrival rate (number of arrivals per unit time) ( lambda = ) ";
	cin>>lambda;
	cout<<"\nEnter the average service rate (number of services per unit time) ( mu = ) ";
	cin>>mu;
	// calculating traffic intensity and expected number of busy servers
	rho =lambda/(c*mu);
	rho1=lambda/mu;
	if(rho>=1)
		cout<<"\nThe model cannot be computed.";
	else
	{
		busy=floor(rho1);
	//calculating p(0 arrivals in the system by time t)
	for (int j=0;j<c-1;j++)
	sum+=pow(rho,j)/fun(j);
	pO=1/(sum+(pow(rho*c,c)))/((1-rho)*fun(c));
	//calculating p(n arrivals in the system by time t)
	//for n<c and for n>=c
	if (n<c)
		pn=(pow(rho1,n)*pO)/fun(n);
	else
		pn=(pow(rho1,n)*pO)/(fun(c)*pow(c,n-c));
	/*calculating expected number of units and expected waiting time of the units
	in the system and in the queue*/
	lq=(pow(rho1,c))*(lambda*mu*pO)/(fun(c-1)*(c*mu-lambda)*(c*mu-lambda));
	wq=lq/lambda;
	w=wq+(1/mu);
	l=lambda*w;
	cout<<"\nOffered load of the system = "<<rho;
	cout<<"\nCarried load of the system = "<<rho1;
	cout<<"\nTraffic intensity = "<<rho;
	cout<<"\nUtilisation factor of the system = "<<rho;
	cout<<"\nProbability of zero arrivals till time t = "<<pO;
	cout<<"\nProbability of n arrivals till time t = "<<pn;
	cout<<"\nExpected number of customers waiting in the system = "<<l;
	cout<<"\nExpected number of customers waiting in the queue = "<<lq;
	cout<<"\nExpected waiting time in the system = "<<w;
	cout<<"\nExpected waiting time in the queue = "<<wq;
	}
}
void Serverinfi()                   //function to implement infinite servers
{
	cout<<"\nM|M|~ is the queueing system. Assumptions are :";
	cout<<"\n- Number of arrivals follows poisson probability distribution.";
	cout<<"\n- Service time follows exponential probability distribution.";
	cout<<"\n- Number of servers is infinite.";
	cout<<"\n- Queue discipline is FcFs.";
	cout<<"\n- System capacity is infinite.";
        cout<<"\n- The average service rate (mu) is more than the average arrival rate (lambda).";
	cout<<"\n\nWhere lambda and mu are constants, dt is incremental element, O(dt)is quantity which is negligible as compared to dt";
	cout<<"\n\nEnter the number of arrivals in the system by time t ( n = ) ";
	cin>>n;
	cout<<"\nEnter the average arrival rate (number of arrivals per unit time) ( lambda = ) ";
	cin>>lambda;
	cout<<"\nEnter the average service rate (number of services per unit time) ( mu = ) ";
	cin>>mu;
        // calculating traffic intensity and expected number of busy servers
	rho=lambda/mu;
	rho1=lambda/mu;
	/*calculating expected number of units and expected waiting time of the units
	in the system and in the queue*/
	l=rho;
	lq=0;
	w=l/lambda;
	wq=0;
	// calculating the expected number of busy servers
	busy=floor(rho1);
	//calculating the number of customers at time t (n>=0)
	pn=(pow(rho,n)*exp(-rho))/fun(n);
	cout<<"\nOffered load of the system = "<<rho;
	cout<<"\nCarried load of the system = "<<rho1;
	cout<<"\nTraffic intensity = "<<rho;
	cout<<"\nUtilisation factor of the system = "<<rho;
	cout<<"\nProbability of n arrivals till time t = "<<pn;
	cout<<"\nExpected number of customers waiting in the system = "<<l;
	cout<<"\nExpected number of customers waiting in the queue = "<<lq;
	cout<<"\nExpected waiting time in the system = "<<w;
	cout<<"\nExpected waiting time in the system = "<<wq;
}
};
int main()
{
	queue a;
	char ch;
	do
	{
		cout<<"\n\nEnter the number of servers ( C = ) ";
		cin>>a.c;
		if(a.c==1)
			a.Server1();
		else if ((a.c>1)&&(a.c<15))
			a.ServerC();
		else if ((a.c)>=15)
			a.Serverinfi();
	cout<<"\nDo you want to continue?(y/n) ";
	cin>>ch;
	}
	while((ch=='y')||(ch=='Y'));
        return 0;
}
