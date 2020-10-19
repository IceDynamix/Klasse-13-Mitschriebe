---
title: Dateisysteme 1
---

## Dateisystem

- Anleitung für die Organistion der Daten
- Daten sollen schnell wiedergefunden werden
- Vor unberechtigtem Zugriff schützen
- Unbeabsichtigte Änderungen vermeiden

## Massenspeicher Festplatte

- HDD - Hard Disk Drive
    - Besteht aus Scheiben, Zugriffsarm, Lese- und Schreibkopf, Spuren und
      Sektoren, Zylinder
- SSD - Solid State Disk

## Speicherkapazität einer HDD

- K_Spur = Sektorgröße * Sektoren pro Spur
- K_Oberfläche = K_Spur * Spuren pro Oberfläche
- K_Platte = K_Oberfläche * Anzahl Oberflächen

## Lesen und Schreiben der HDD

- Änderungen in der Magnetisierung der Oberfläche durch elektromagnetische
  Induktion verursachen einen Spannungsimpuls
- Longitudinale Aufzeichnung -> parallel zur Rotationsrichtung
- Senkrechte Aufzeichnung -> senkrecht zur Rotationsrichtung

## Low-level Formatierung

- Bevor der Benutzung einer Festplatte muss diese formatiert werden
- CHS-Addressierung, Nummerierung nach Zylinder, Kopf, Spector
- LBA-Addressierung, Durchnummerierung bei 0 beginnend, unabhängig von der
  Festplattengeo
