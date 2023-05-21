install.packages("dplyr")
library(dplyr)
install.packages("arules")
library(arules)


path <- readline("Enter the file path: ")
dataB <- read.csv(path)
transacions <- select(dataB, items)

tablepath <- readline("Enter the table saving path: ")
write.table(transacions, tablepath , row.names = FALSE, col.names= FALSE , quote = FALSE )
tdata <-read.transactions(tablepath , sep=",")

Support <- as.numeric(readline("Enter the minimum support: "))
Confidince <- as.numeric(readline("Enter the minimum confidince: "))

apriori_rules <- apriori(tdata, parameter = list(supp = Support, conf = Confidince,minlen=2))
inspect(apriori_rules)
                
               
             
             