
# **Bank Account Synchronization**

**This project simulates a multi-threaded banking system that supports concurrent 
deposits and withdrawals from shared bank accounts. It ensures thread-safety, 
prevents overdrawing, and logs transactions for each account.**

# **Features**

* Thread-Safe Transactions: Simulates concurrent deposits and withdrawals using multiple threads,
  ensuring thread-safety with ReentrantLock.

* Transaction Logging: Logs deposits, withdrawals, and failed withdrawals with timestamps.

* Multiple Accounts: Supports multiple bank accounts with independent balances.

* Graceful Handling of Overdraws: Ensures that no account balance goes below zero.

* Customizable Users (Threads): Simulates user actions via threads performing transactions concurrently.

# **Assumptions**

* No overdrawing: Withdrawals are rejected if the balance is insufficient.

* Transaction logging: Each deposit and withdrawal (including failed withdrawals) is logged with a timestamp.

* Thread Safety: Every account has a ReentrantLock to ensure that deposit and withdrawal operations are 
  performed safely in multi-threaded environments.

* Multiple threads for users: The simulation uses threads to represent multiple users performing 
  transactions on different accounts concurrently.

# **Build and Run Instructions**

To run the program, first compile the source files by navigating to the directory containing the src folder 
and running javac -d bin src/*.java from the command line to compile the .java files. After compilation, 
run the program using the command java -cp bin Main, which will execute the Main class and start the simulation. 
The program will display the transaction logs and final balances for each bank account after multiple threads 
have concurrently performed deposits and withdrawals. The logs will include timestamps, deposit and withdrawal 
amounts, and any failed withdrawal attempts due to insufficient balance.