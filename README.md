# diceroller
Simple spring boot API to roll some dice!

GET /roll - Get all rolls

POST /roll - Create a roll with body:
  {
    "name": "roll",
    "dice": "d6",
    "modifiers": [1]
  }
  
GET /roll/{rollName}  - get specific roll by name

Run "make run" to spin up api in docker.
