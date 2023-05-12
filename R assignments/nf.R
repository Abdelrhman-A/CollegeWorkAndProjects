load(url("http://bit.ly/dasi_nc"))

gained_clean  =  na.omit(nc$gained)

n  =  length(gained_clean)

boot_means =rep(NA, 100)
for(i in 1:100){
  boot_sample= sample(gained_clean, n,replace=TRUE)
  boot_means[i]= mean(boot_sample)
}

hist(boot_means,probability=T)
grid()
box()

standard_error_boot=sd(boot_means)
standard_error_boot

cibootstrap_per = quantile(boot_means,c(0.05,0.95))
cibootstrap_per
