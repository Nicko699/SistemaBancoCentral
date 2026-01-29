🏦 Banco Central - Sistema de Gestión Bancaria
Sistema bancario desarrollado en Java que permite la gestión de cuentas de ahorro e inversión, con autenticación de usuarios y administración de información de empleados.
📋 Descripción
Banco Central es una aplicación de consola que simula las operaciones básicas de un banco, incluyendo depósitos, retiros y consultas de saldo para dos tipos de cuentas diferentes: Cuenta de Ahorro y Cuenta de Inversión. El sistema también permite visualizar información del personal del banco.
✨ Características

Autenticación de Usuario: Sistema de login con validación de credenciales
Cuenta de Ahorro:

Depósito inicial mínimo: $1,000
Saldo mínimo para retiro: $500
Consulta de saldo


Cuenta de Inversión:

Depósito inicial mínimo: $25,000
Saldo mínimo para retiro: $10,000
Opción de retiro total
Consulta de saldo


Gestión de Empleados: Visualización de información del personal (ID, nombre, puesto, salario, días de vacaciones, antigüedad)

🛠️ Tecnologías

Java
POO (Programación Orientada a Objetos)
Herencia y Abstracción
Manejo de Excepciones

📦 Estructura del Proyecto
BancoCentral/
├── BancoCentral.java          # Clase principal con menú de navegación
├── Cuenta.java                # Clase abstracta base
├── Cuenta_ahorro.java         # Implementación cuenta de ahorro
├── Cuenta_inversion.java      # Implementación cuenta de inversión
├── Empleado.java              # Modelo de empleados
└── Ingreso_banco.java         # Gestión de autenticación
🚀 Cómo Usar

Compilar el proyecto:

bash   javac BancoCentral/*.java

Ejecutar la aplicación:

bash   java BancoCentral.BancoCentral

Credenciales de acceso:

Usuario: Nick678993


Navegar por el menú:

Opción 1: Gestión de Cuenta de Ahorro
Opción 2: Gestión de Cuenta de Inversión
Opción 3: Información de Empleados
Opción 4: Salir del sistema



💡 Ejemplo de Uso
Ingrese su Nombre
> Juan Pérez

Ingrese su Usuario
> Nick678993

BIENVENIDO AL BANCO CENTRAL

Seleccione una opcion
1.Cuenta Ahorro
2.Cuenta Inversion
3.Informacion Empleado
4.Salir
> 1
🔒 Validaciones

Validación de entrada numérica con manejo de excepciones
Verificación de montos mínimos para depósitos y retiros
Validación de saldo suficiente antes de realizar retiros
Control de acceso mediante usuario

👥 Empleados del Sistema
El sistema incluye 7 empleados registrados:

Nick - Supervisor
Juan - Recepcionista
Alex - Cajero
Rick - Administrador
Luz - Desarrolladora
Santi - Administrador BD
María - Analista

📝 Notas

El sistema utiliza un único usuario hardcodeado para demostración
Los saldos se mantienen durante la ejecución del programa
La validación primer_deposito es estática y se reinicia al reiniciar la aplicación

🤝 Contribuciones
Este es un proyecto para la demostración de java POO con una fuerte lógica de programación. Las sugerencias de mejora son bienvenidas.
📄 Licencia
Proyecto de uso libre.
