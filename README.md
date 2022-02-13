# charterassignment
This is created for Charter Assignment, will be taken down after the validation is completed.
Here are the details :

Sample End point: http://localhost:8080/rewards/calculaterewards

Request Type : POST

Content Type: application/json

Request Body:


     {
      "name": "Bob",
      "orders":[
         {
          "orderId": "100",
          "orderTotal": "120",
          "orderDate" : "2022-01-22" 
        },
        {
          "orderId": "101",
          "orderTotal": "200",
          "orderDate" : "2022-01-19" 
        },
        {
          "orderId": "102",
          "orderTotal": "300",
          "orderDate" : "2022-02-02" 
        }
      ]
     }

Response :

     {
      "name": "Bob",
      "totalRewards": 790,
      "monthlyRewards": {
        "JANUARY": 340,
        "FEBRUARY": 450
      }
      }
