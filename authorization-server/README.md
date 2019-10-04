#### request:
```
POST /oauth/check_token?token=845f8697-f024-4801-8f5f-a99fdf8010b3 HTTP/1.1
Host: localhost:8100
```

#### reseponse:
```
{
    "scope": [
        "all"
    ],
    "active": true,
    "exp": 1569619317,
    "authorities": [
        "ROLE_A"
    ],
    "client_id": "a"
}
```