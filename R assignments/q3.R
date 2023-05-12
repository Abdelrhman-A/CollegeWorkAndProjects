Females= c(110, 111, 107, 108, 110, 105, 107, 106, 111, 111 )
Males= c(120, 107, 110, 116, 114, 111, 113, 117, 114, 112 )

install.packages("bootstrap",dependencies = TRUE)
library(bootstrap)

install.packages("boot",dependencies = TRUE)
library(boot)

boot_data_calc_mean=function(data,idx){
  mean(data[idx])
}

set.seed(61)
bootstrap_dataM <- boot(Males, boot_data_calc_mean, R = 8128)
bootstrap_dataM

print("Confidence Interval for Males")
boot.ci(boot.out = bootstrap_dataM,type = "perc")


set.seed(61)
bootstrap_dataF <- boot(Females, boot_data_calc_mean, R = 8128)
bootstrap_dataF

print("Confidence Interval for Females")
boot.ci(boot.out = bootstrap_dataF,type = "perc")

# Males mean
mean(Males)
# Jackknife the mean
jackmeanM <- jackknife(Males,mean)
jackmeanM

#Mean
jack_esM=mean(jackmeanM$jack.values)
jack_esM

#bias
jackmeanM$jack.bias

#standard error
jackmeanM$jack.se

t_val <- qt(0.975, length(Males) - 1)
ci_jkM <- c(mean(Males) - t_val * jackmeanM$jack.se, mean(Males) + t_val * jackmeanM$jack.se)
print(paste("Confidence Intervat"))
print(paste("[",ci_jkM[1], ",",ci_jkM[2],"]"))

# Females mean
mean(Females)
# Jackknife the mean
jackmeanF <- jackknife(Females,mean)
jackmeanF

#Mean
jack_esF=mean(jackmeanF$jack.values)
jack_esF

#bias
jackmeanF$jack.bias

#standard error
jackmeanF$jack.se

t_val <- qt(0.975, length(Females) - 1)
ci_jkF <- c(mean(Females) - t_val * jackmeanF$jack.se, mean(Females) + t_val * jackmeanF$jack.se)
print(paste("Confidence Intervat"))
print(paste("[",ci_jkF[1], ",",ci_jkF[2],"]"))



