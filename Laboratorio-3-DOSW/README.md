# 💻 Laboratorio 3 - DOSW-02

---

## 👥 Integrantes

- Maria Belén
- Juan Pablo Contreras
- Nikolas Martinez

---

## 📸 Evidencia de Commits

![Evidencia del historial de los commits](/Laboratorio-3-DOSW/docs/imagenes/historialCommits.png)

---

## 🚀 Evidencias de Desarrollo

### 🔐 Reto 1 - Sistema Bancario Simulado

---

## 📜 Reglas de Negocio

1. ✅ Los números de cuenta deben tener exactamente **10 dígitos**.
2. 🏦 Los **dos primeros dígitos** deben corresponder a un banco registrado:
    - `01` → **Bancolombia**
    - `02` → **Davivienda**
3. 🚫 Los saldos **no pueden ser negativos**.
4. 🔍 Solo se permiten **consultas y depósitos** en cuentas **creadas y validadas**.
5. 🔢 Los números de cuenta **no pueden contener letras ni caracteres especiales**.

---

## ⚙️ Funcionalidades Principales

### 🏦 1. Gestión de Cuentas
- Crear una cuenta bancaria (validando el número).
- Validar la existencia y formato de la cuenta.

### 💰 2. Servicios Financieros Básicos
- Consultar el saldo de una cuenta.
- Realizar un depósito en una cuenta existente.

### 🔒 3. Seguridad y Calidad del Código
- Implementación con **pruebas automatizadas**.
- Validación de reglas de negocio en **cada operación**.

---

## 🎭 Actores Principales

- 👤 Clientes
- 🖥️ Sistema Bankify
- 🏦 Bancos Asociados
- ⚙️ Sistema

---

## ⚠️ Precondiciones del Sistema

- Tener bancos asociados a Bankify.
- Disponer de un sistema que **automatice la generación** de números de cuenta.
- Contar con un medio para la **verificación de datos del usuario**.

---


### 💳 Reto 2 - Diseñando

## 📜 Historias de Usuario

**Cliente**
- Modificar datos de usuario:
    Como cliente quiero modificar mis datos de usuario (nombre, dirección, télefono, documento, etc) para poder mantener mi información personal actualizada.

- Gestionar cuentas bancarias:
    Como cliente quiero gestionar mis cuentas bancarias para llevar mejor mis finanzas personales.

- Gestionar servicios financieros:
    Como cliente quiero gestionar servicios financieros para poder mandarle plata a mi abuelita.


**Bancos**
- Consultar cuentas de usuarios:
    Como banco quiero consultar cuentas de usuarios para poder reconocer posibles casos de deuda o abonanza.

- Consultar  transacciones realizadas:
    Como banco quiero consultar transacciones realizadas para poder reconocer posibles casos de fraude.


**Sistema Bankify**
- Gestionar clientes:
    Como Bankify quiero gestionar clientes para poder tener una base de datos actualizada.

- Gestionar los bancos asociados:
    Como Bankify quiero gestionar los bancos asociados para mantener actualizada la información de las entidades bancarias con las que trabaja el sistema.

- Consultar transacciones:
    Como Bankify quiero consultar transacciones para poder monitorear posibles casos de fraude.

## 📸 Diagrama de Contexto

![Diagrama de Contexto](/Laboratorio-3-DOSW/docs/imagenes/historialCommits.png)