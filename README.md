# Mikroservis Port ve Endpoint Bilgileri

## Portlar
- User Service: 8081
- Cart Service: 8082
- Order Service: 8083
- Eureka Server: 8761
- Gateway Server: 8888

## Örnek GET
- Direkt order servisi:
  - GET http://localhost:8083/api/orders
  - Örnek curl:
    - curl http://localhost:8083/api/orders

- Gateway üzerinden order servisi:
  - GET http://localhost:8888/orders
  - Örnek curl:
    - curl http://localhost:8888/orders

## Notlar
- Order service controller path'i `/api/orders` olarak tanımlıdır.
- Gateway route `/orders/**` ile order-service'e yönlendirir.
