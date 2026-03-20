# Native FSR Mod для Minecraft 1.20.1

Мод добавляет нативную поддержку AMD FidelityFX Super Resolution (FSR) для Minecraft 1.20.1.

## Требования

- Minecraft 1.20.1
- Fabric Loader 0.15.0 или выше
- Fabric API
- Java 17 или выше

## Установка

1. Установите [Fabric Loader](https://fabricmc.net/use/)
2. Скачайте и установите [Fabric API](https://modrinth.com/mod/fabric-api)
3. Поместите файл мода `.jar` в папку `mods` вашего экземпляра Minecraft

## Сборка из исходников

```bash
./gradlew build
```

Собранный файл будет находиться в `build/libs/`

## Использование

После установки мод автоматически активирует FSR при запуске игры. 
Настройки масштабирования доступны в меню видео-настроек Minecraft.

## Лицензия

MIT License

## Примечание

Этот мод является базовой реализацией. Для полноценной работы FSR требуется интеграция с AMD FSR SDK и дополнительные шейдеры.