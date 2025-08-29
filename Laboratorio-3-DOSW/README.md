# Laboratorio-3-DOSW-02

---

## Integrantes:
- Maria Belen
- Juan Pablo Contreras
- Nikolas Martinez

---

## Evidencias commits:
![Evidencia del historial de los commits](/Laboratorio-3-DOSW/docs/imagenes/historialCommits.png)

## Evidencias:

---

# **Reto 1**

## Las reglas de negocio serían:
1. Los números de cuenta deben tener exactamente 10 dígitos y no pueden tener letras ni caracteres especiales.
2. Los dos primeros dígitos tienen que corresponder a un banco registrado. Ahí dan el ejemplo de que a Bancolombia le corresponde 01 y a Davivienda 02.
3. Los saldos de las cuentas no pueden ser negativos.
4. Solo se pueden realizar consultas y depósito en cuentas creadas y validadas.

Funcionalidades Principales

 ### 1. Gestión de cuentas

    - Crear una cuenta bancaria (validando el número).

    - Validar la existencia y el formato de la cuenta.



### 2. Servicios financieros básicos

    - Consultar el saldo de una cuenta.

    - Realizar un depósito en una cuenta existente.



### . Seguridad y calidad de código

    - Implementación con pruebas automatizadas.

    - Validación de reglas de negocio en cada operación.

## Actores principales:

- Clientes

- Bancos asociados

## Precondiciones necesarias para el sistema:

- Tener bancos asociados a Bankify

- Contar con un medio (virtual, presencial o telefónico) para que un cliente se inscriba a Bankify

- Disponer de un sistema que automatice la generación de números de cuenta

- Contar con un medio para la verificación de datos del usuario

- Tener servidores que soporten las transacciones realizadas por los clientes