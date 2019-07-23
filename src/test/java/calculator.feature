Feature: Rest based Calculator Application
              
         Scenario: Addition
                   Given rest api "http://localhost:9000/api/addition?first=10&second=20"
                   When i invoke api  
                   Then expected result 30.0 
           
         Scenario: Subtraction
                   Given rest api "http://localhost:9000/api/subtraction?first=20&second=10"
                   When i invoke api  
                   Then expected result 10.0



         Scenario: Multiplication
                   Given rest api "http://localhost:9000/api/Multiplication?first=20&second=10"
                   When i invoke api  
                   Then expected result 200.0
