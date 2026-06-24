# Desarrollo de un microservicio REST en un contexto de banca

Estás trabajando en un equipo de desarrollo de una institución financiera que está migrando sus servicios a una arquitectura basada en microservicios. Tu tarea es crear un microservicio REST que gestione las solicitudes de préstamos. El microservicio debe recibir solicitudes de préstamo, validar los datos de entrada, persistir las solicitudes en una base de datos y responder con un estado de aceptación o rechazo. Los datos de entrada incluyen el monto del préstamo, la tasa de interés y el plazo. El microservicio debe asegurar que no se acepten solicitudes con montos negativos o tasas de interés inválidas. Además, debe manejar la persistencia de las solicitudes de manera idempotente para evitar duplicados en caso de reintentos.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Java Spring Boot |
| **Nivel** | junior-l1 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Configuración del microservicio

**Objetivo:** Configurar el entorno del microservicio y establecer las rutas básicas para recibir solicitudes de préstamo.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Configura el proyecto Spring Boot para crear un microservicio REST.
- Define las rutas para recibir solicitudes de préstamo POST /loans y para consultar el estado de una solicitud GET /loans/{id}.
- Asegura que el microservicio responda con un mensaje de bienvenida en la ruta raíz GET /.

**Entregable:** Microservicio configurado con rutas básicas operativas.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que las solicitudes deben ser idempotentes.
- Considera cómo manejarás los errores de validación.

</details>

### Fase 2: Validación y persistencia de solicitudes

**Objetivo:** Implementar la validación de los datos de entrada y la persistencia de las solicitudes de préstamo en una base de datos.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Valida los datos de entrada para asegurar que el monto del préstamo sea positivo y la tasa de interés sea válida.
- Persiste las solicitudes de préstamo en una base de datos H2.
- Asegura que la persistencia sea idempotente para evitar duplicados en caso de reintentos.

**Entregable:** Microservicio con validación de datos y persistencia idempotente de solicitudes de préstamo.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que la idempotencia implica que múltiples invocaciones con la misma clave produzcan el mismo resultado.
- Considera cómo manejarías los errores de persistencia.

</details>

### Fase 3: Respuesta y estado de las solicitudes

**Objetivo:** Implementar la respuesta del microservicio con el estado de aceptación o rechazo de las solicitudes de préstamo.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Define la lógica para aceptar o rechazar una solicitud de préstamo basada en las validaciones y la persistencia.
- Responde con el estado de la solicitud en la ruta GET /loans/{id}.
- Asegura que el microservicio maneje correctamente los casos de error y los muestre en la respuesta.

**Entregable:** Microservicio que responde con el estado de aceptación o rechazo de las solicitudes de préstamo.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo comunicarías el estado de la solicitud al usuario.
- Piensa en los posibles casos de error y cómo los manejarías en la respuesta.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es un microservicio REST y cuál es su propósito en este contexto?
- **paraQueSirve**: ¿Para qué sirve la validación de datos en el microservicio?
- **comoSeUsa**: ¿Cómo se usa la idempotencia en la persistencia de las solicitudes de préstamo?
- **erroresComunes**: ¿Cuáles son los errores comunes que podrían ocurrir durante la validación y persistencia de las solicitudes?
- **queDecisionesImplica**: ¿Qué decisiones implica la aceptación o rechazo de una solicitud de préstamo?

## Criterios de Evaluacion

- Configuración correcta del microservicio con rutas básicas operativas.
- Implementación de la validación de datos y persistencia idempotente de solicitudes de préstamo.
- Respuesta correcta del microservicio con el estado de aceptación o rechazo de las solicitudes.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
