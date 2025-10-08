# Juego del Ahorcado (Hangman Game)

Un juego clásico del ahorcado implementado en Java donde el jugador debe adivinar una palabra secreta letra por letra.

## Descripción

Este programa implementa el juego del ahorcado donde:
- El jugador tiene 10 intentos máximos
- Debe adivinar la palabra secreta "inteligencia"
- Por cada letra incorrecta se reduce el número de intentos
- El juego termina cuando se adivina la palabra completa o se agotan los intentos

## Estructura del Proyecto

```
├── README.md
├── .vscode/
│   └── settings.json        # Configuración de VS Code para Java
├── bin/
│   └── Ahorcado.class      # Archivo compilado
├── lib/                    # Dependencias (vacío)
└── src/
    └── Ahorcado.java       # Código fuente principal
```

## Requisitos

- Java 8 o superior
- Visual Studio Code con extensión de Java (opcional)

## Cómo ejecutar

### Opción 1: Usando VS Code
1. Abrir el proyecto en VS Code
2. Presionar `F5` o hacer clic en "Run" en el archivo `Ahorcado.java`

### Opción 2: Línea de comandos
```bash
# Compilar
javac src/Ahorcado.java -d bin

# Ejecutar
java -cp bin Ahorcado
```

## Cómo jugar

1. Al iniciar el programa, verás guiones bajos (`_`) que representan cada letra de la palabra secreta
2. Ingresa una letra cuando se te solicite
3. Si la letra está en la palabra, se revelará en su posición correcta
4. Si la letra no está en la palabra, perderás un intento
5. Tienes 10 intentos para adivinar la palabra completa
6. Ganas si completas la palabra antes de agotar los intentos

## Ejemplo de ejecución

```
_ _ _ _ _ _ _ _ _ _ _ _
Adivina una letra: 
e
_ _ _ e _ _ _ e _ _ _ _
Adivina una letra: 
i
i _ _ e _ i _ e _ _ i _
```

## Características del código

- Uso de arrays para almacenar las letras adivinadas
- Estructuras de control (bucles `for` y `while`)
- Manejo de entrada del usuario con `Scanner`
- Validación de condiciones de victoria y derrota

## Autor

Desarrollado como proyecto de práctica de Java.