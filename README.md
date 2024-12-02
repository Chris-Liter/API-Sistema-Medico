# 🏥 API-Sistema-Medico

## 📄 Descripción
Este proyecto es una API para un sistema médico que permite la gestión de pacientes, doctores, citas y otros recursos médicos. La API está diseñada para ser utilizada por aplicaciones frontend que necesitan interactuar con los datos del sistema médico.

## 🚀 Características
- **Gestión de pacientes**: creación, actualización, eliminación y consulta de pacientes.
- **Gestión de doctores**: creación, actualización, eliminación y consulta de doctores.
- **Gestión de citas**: programación, actualización, cancelación y consulta de citas médicas.
- **Autenticación y autorización**: manejo de usuarios y roles con JWT.
- **Documentación de la API**: generada automáticamente con Swagger.

## 🛠️ Tecnologías Utilizadas
- **Node.js**: entorno de ejecución para JavaScript en el servidor.
- **Express.js**: framework para construir aplicaciones web y APIs.
- **MongoDB**: base de datos NoSQL para almacenar los datos del sistema médico.
- **Mongoose**: ODM (Object Data Modeling) para MongoDB y Node.js.
- **JWT**: para la autenticación y autorización de usuarios.
- **Swagger**: para la documentación interactiva de la API.

## 📥Instalación
1. Clona nuestro repositorio ⬇️:
    ```bash
    git clone https://github.com/tu-usuario/API-Sistema-Medico.git
    ```
2. Navega al directorio del proyecto:
    ```bash
    cd API-Sistema-Medico
    ```
3. Instala las dependencias:
    ```bash
    npm install
    ```

## ⚙️ Configuración
1. Crea un archivo `.env` en la raíz del proyecto con las siguientes variables de entorno:
    ```env
    PORT=3000
    MONGODB_URI=mongodb://localhost:27017/sistema-medico
    JWT_SECRET=tu_secreto_jwt
    ```

## ▶️ Uso
1. Inicia el servidor:
    ```bash
    npm start
    ```
2. La API estará disponible en `http://localhost:3000`.

## 🔗 Endpoints Principales
- **Pacientes** 🧑‍🤝‍🧑
  - `GET /pacientes`: Obtener todos los pacientes.
  - `POST /pacientes`: Crear un nuevo paciente.
  - `GET /pacientes/:id`: Obtener un paciente por ID.
  - `PUT /pacientes/:id`: Actualizar un paciente por ID.
  - `DELETE /pacientes/:id`: Eliminar un paciente por ID.

- **Doctores** 🩺
  - `GET /doctores`: Obtener todos los doctores.
  - `POST /doctores`: Crear un nuevo doctor.
  - `GET /doctores/:id`: Obtener un doctor por ID.
  - `PUT /doctores/:id`: Actualizar un doctor por ID.
  - `DELETE /doctores/:id`: Eliminar un doctor por ID.

- **Citas** 📅
  - `GET /citas`: Obtener todas las citas.
  - `POST /citas`: Crear una nueva cita.
  - `GET /citas/:id`: Obtener una cita por ID.
  - `PUT /citas/:id`: Actualizar una cita por ID.
  - `DELETE /citas/:id`: Cancelar una cita por ID.
