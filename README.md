# Shahrukh Auto Care — Spring Boot Full Stack
Open `http://localhost:8080` after running `mvn spring-boot:run`.
The frontend is served by Spring Boot. POST `/api/queries` saves enquiries; GET `/api/queries` lists them; GET `/api/health` is the health check.
Local development uses H2. Production deployment is prepared with Docker + Render + PostgreSQL via `render.yaml`.
The image is previewed in the browser; only its filename is stored by the current API, not the image bytes.
A public URL cannot be generated from this chat without access to a hosting account/project; the included Render configuration makes deployment ready.