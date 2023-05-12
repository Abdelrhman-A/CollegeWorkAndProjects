# Define a function to simulate rolling a pair of dice
dicerolls <- function() {
  sum(sample(1:6, 2, replace = TRUE))
}

# Define a function to simulate rolling until all possible sums are seen
roll_until_all_seen <- function() {
  # Initialize variables
  rolls <- 0
  seen_sums <- numeric(11)  # one element for each possible sum from 2 to 12
  all_sums_seen <- FALSE
  
  # Roll dice until all possible sums are seen
  while (!all_sums_seen) {
    # Roll the dice
    roll_sum <- roll_dice()
    rolls <- rolls + 1
    
    # Update the list of seen sums
    seen_sums[roll_sum-1] <- 1
    if (all(seen_sums > 0)) {
      all_sums_seen <- TRUE
    }
  }
  
  return(rolls)
}
# Simulate rolling until all possible sums are seen 8128 times
n_sims <- 8128
neededrolls <- replicate(n_sims, roll_until_all_seen())

# Plot a histogram of the number of rolls needed
hist(neededrolls, xlab = "No. Rolls", main = "No. of Rolls Needed\nUntil All Sums are Seen")

# Estimate the expected number of rolls needed
neededrolls <- neededrolls
mean(neededrolls)