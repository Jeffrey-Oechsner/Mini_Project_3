# Mini_Project_3
We have created 2 services:
- OrderService
- StorageService

We are using RabbitMQ as our MOM.

## Process
Whenever a purchase has been made, OrderService will create an event to a queue StorageService listen to. Storage will thereafter update it's DB/storage according to the order created.
