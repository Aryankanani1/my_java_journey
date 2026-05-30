# Phase 4 — HTTP & REST

Understanding how the web talks — before writing any Spring endpoints.

## Goals

By the end of this phase I should be able to:
- Explain the HTTP request/response lifecycle from memory
- Make GET, POST, PUT, DELETE requests using Java's built-in HttpClient
- Parse and build JSON using Jackson
- Consume a real public REST API in plain Java
- Handle auth headers (API key, Basic, Bearer token)

## Topics

1. **HTTP Basics** — methods (GET/POST/PUT/DELETE/PATCH), status codes, headers, body
2. **JSON** — structure, data types, serialization/deserialization with Jackson
3. **Java HttpClient** — `java.net.http.HttpClient` (Java 11+), sync vs async requests
4. **REST Client** — consuming a public API, query params, path params, response handling
5. **Auth** — API keys, Basic auth (Base64), Bearer tokens

## Structure

```
phase-04-http-rest/
├── 01-practice/
│   ├── HTTP_Basics/     ← HttpBasicsDemo.java
│   ├── JSON/            ← JsonDemo.java
│   ├── HttpClient/      ← HttpClientDemo.java
│   ├── REST_Client/     ← RestClientDemo.java
│   └── Auth/            ← AuthDemo.java
└── Notes/
    └── HTTP/            ← screenshots & handwritten notes
```
