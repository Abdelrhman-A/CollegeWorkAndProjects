x=c(1,2,4,6,8)
y=c(4,3,1,2,0)

Sum = function(x){
  s=0
  for (n in x){
    s = n + s
  }
  return(s)
}

SumSquared =function(x){
  s=0
  for (n in x){
    s = n^2 + s
  }
  return(s)
}

Sumxy = function(x,y){
  s=0
  for (i in 1:length(x)){
    s = x[i]*y[i] + s
  }
  return(s)
}

Sxy= function(x,y){
  s=0
  for (i in 1:length(x)){
    s = (x[i]-Sum(x)/length(x))*y[i] + s
  }
  return(s)
}

Xbar=Sum(x)/length(x)

Ybar=Sum(y)/length(y)

S_xy=Sxy(x,y)
S_xy

Sxx=SumSquared(x)-length(x)*(Xbar)^2
Sxx

Syy=SumSquared(y)-length(y)*(Ybar)^2
Syy

B1=S_xy/Sxx
B1

B0=(Ybar)-B1*(Xbar)
B0

SSR=B1*S_xy
SSR

SSE= Syy-SSR
SSE


MSE = SSE/(length(x)-2)
MSE

Xn = as.numeric(readline("Enter the X for mean response: "))
RatX=B0+B1*Xn
RatX

alpha = 0.05
t=qt(alpha/2, length(x)-2,lower.tail = F)
t

CL = as.numeric((1-alpha)*100)
L= RatX - t * sqrt(MSE*(1/length(x)+(Xn-Xbar)^2/Sxx))
U=RatX+ t * sqrt(MSE*(1/length(x)+(Xn-Xbar)^2/Sxx))

print(paste("Confidence Intervat for mean response at confidence level", CL,"%"))
print(paste("[",L, ",",U,"]"))

Xnew = as.numeric(readline("Enter the X for new observation: "))
RatXnew=B0+B1*Xnew
RatXnew

alpha = 0.05
t=qt(alpha/2, length(x)-2,lower.tail = F)
t

CL = as.numeric((1-alpha)*100)
Lnew= RatXnew - t * sqrt(MSE*(1+1/length(x)+(Xnew-Xbar)^2/Sxx))
Unew= RatXnew + t * sqrt(MSE*(1+1/length(x)+(Xnew-Xbar)^2/Sxx))

print(paste("Confidence Intervat for new observation at confidence level", CL,"%"))
print(paste("[",Lnew, ",",Unew,"]"))
