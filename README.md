# Spring RabbitMQ

## Start the RabbitMQ broker

run this command to start all services in the correct order.

```bash
$ docker-compose up -d
```
## Get the list of exchanges

```
$ docker exec rabbitmq rabbitmqadmin list exchanges name durable type auto_delete
```

## Get the list of queues


```
$ docker exec rabbitmq rabbitmqadmin list queues vhost name node messages message_stats.publish_details.rate
```

## Create an exchange


```
$ docker exec rabbitmq rabbitmqadmin declare exchange name=my-new-exchange type=fanout
```

## Create a queue with optional parameters


```
$ docker exec rabbitmq rabbitmqadmin declare queue name=my-new-queue durable=false
```

## Publish a message


```
$ docker exec rabbitmq rabbitmqadmin publish exchange=amq.default routing_key=test payload="hello, world"
```

## Get a message


```
$ docker exec rabbitmq rabbitmqadmin get queue=test ackmode=ack_requeue_false
```

## Export Configuration (Definitions)

```
$ docker exec rabbitmq rabbitmqadmin export rabbit.definitions.json
```
 
## Import Configuration (Definitions), quietly

```
$ docker exec rabbitmq rabbitmqadmin -q import rabbit.definitions.json
```
