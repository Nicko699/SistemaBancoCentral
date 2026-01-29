# 🏦 Banco Central - Sistema de Gestión Bancaria

**Banco Central** es una aplicación de consola desarrollada en **Java** que simula las operaciones básicas de un banco.  
Permite la **gestión de cuentas de ahorro e inversión**, la **autenticación de usuarios** y la **visualización de información del personal bancario**.

---

## 📋 Descripción General

El sistema ofrece una experiencia interactiva en consola donde los usuarios pueden:

- Autenticarse con credenciales válidas.  
- Realizar **depósitos, retiros y consultas de saldo**.  
- Administrar dos tipos de cuentas: **Ahorro** e **Inversión**.  
- Consultar la información de los **empleados del banco**.  

Diseñado bajo los principios de **Programación Orientada a Objetos (POO)**, el proyecto utiliza **herencia, abstracción y manejo de excepciones** para representar entidades bancarias y operaciones reales de forma estructurada.

---

## ✨ Características Principales

### 🔐 Autenticación de Usuario
- Validación de credenciales (usuario hardcodeado para demostración).  
- Acceso restringido a las funcionalidades principales del sistema.

### 💰 Cuenta de Ahorro
- **Depósito inicial mínimo:** `$1,000`  
- **Saldo mínimo para retiro:** `$500`  
- **Funciones disponibles:** depósito, retiro, consulta de saldo  

### 📈 Cuenta de Inversión
- **Depósito inicial mínimo:** `$25,000`  
- **Saldo mínimo para retiro:** `$10,000`  
- **Funciones disponibles:** depósito, retiro total o parcial, consulta de saldo  

### 👥 Gestión de Empleados
- Visualización de la información del personal:  
  - ID, nombre, puesto, salario, días de vacaciones y antigüedad.  
- Incluye **7 empleados predefinidos**.  

---

## 🧰 Tecnologías Utilizadas

- ☕ **Java**  
- 🧩 **POO (Programación Orientada a Objetos)**  
- 🏗️ **Herencia y Abstracción**  
- ⚙️ **Manejo de Excepciones**

---

## 🚀 Ejecución del Proyecto

### 🔧 Compilar el código

```bash
javac BancoCentral/*.java
```

### ▶️ Ejecutar la aplicación

```bash
java BancoCentral.BancoCentral
```

### 🔑 Credenciales de acceso

**Usuario:** `Nick678993`

---

## 🧭 Navegación del Menú Principal

| Opción | Descripción                      |
|--------|----------------------------------|
| 1      | Gestión de Cuenta de Ahorro      |
| 2      | Gestión de Cuenta de Inversión   |
| 3      | Información de Empleados         |
| 4      | Salir del sistema                |

---

## 💡 Ejemplo de Uso

```
Ingrese su Nombre
> Juan Pérez

Ingrese su Usuario
> Nick678993

BIENVENIDO AL BANCO CENTRAL

Seleccione una opción:
1. Cuenta Ahorro
2. Cuenta Inversión
3. Información Empleado
4. Salir
> 1
```

### 🧾 Validaciones Implementadas:

✅ Control de acceso mediante usuario autenticado  
✅ Validación de montos mínimos en depósitos y retiros  
✅ Verificación de saldo suficiente antes de retirar  
✅ Manejo de excepciones para entradas numéricas inválidas  
✅ Validación del primer depósito (reiniciable por sesión)

---

## 👨‍💼 Empleados del Sistema

| ID | Nombre | Puesto            |
|----|--------|-------------------|
| 1  | Nick   | Supervisor        |
| 2  | Juan   | Recepcionista     |
| 3  | Alex   | Cajero            |
| 4  | Rick   | Administrador     |
| 5  | Luz    | Desarrolladora    |
| 6  | Santi  | Administrador BD  |
| 7  | María  | Analista          |

---

## 🧠 Notas Técnicas

- El sistema utiliza un único usuario hardcodeado para fines demostrativos.
- Los saldos se mantienen solo durante la ejecución del programa.
- La validación del primer depósito es estática y se reinicia al cerrar la aplicación.

---

## 🤝 Contribuciones

Este proyecto fue creado como una **demostración de lógica y POO en Java**.  
Las contribuciones o sugerencias para mejorar la estructura, diseño o validaciones son **bienvenidas**.

---

## 🪪 Licencia

Proyecto de **uso libre y educativo**.  
Puedes modificarlo y adaptarlo para tus propios fines de aprendizaje.
