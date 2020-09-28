---
title: Harmonischer Oszillator
---

## Wissen

Ein harmonischer Oszillator ist ein schwingfähiges System für das gilt

$$
F = -D \cdot x \qquad \text{(Die Rückstellkraft ist proportional zur Auslenkung)}
$$

Die Proportionalitätskonstante $D$ nennt man allgemein Richtgröße. Das
Zeit-Elongationsgesetz $x(t) = \hat{x} \sin(\omega t)$ mit $\omega =
\sqrt{\frac{D}{m}}$ löst die Differentialgleichung.

$$
m\ddot{x}(t) + Dx(t) = 0
$$

Daraus folgt allgemein, dass die Schwingungen harmonisch sind (sinusförmig).

## Aufgabe

In einem U-Rohr konstanten Querschnitts befindet sich eine Flüssigkeitssäule der
Gesamtlänge $l$. Wenn man kurz in ein Rohrende bläst, so beginnt sie zu
schwingen. $A$ ist der Durchmesser des Rohrs und $s$ ist die Strecke der
Auslenkung.

### Beweise, dass die Schwingung harmonisch ist

$$
F = mg = \rho V g \\
\rho = \frac{m}{V} \rightarrow m = \rho V \\
$$

V ist das Volumen oberhalb des Pegels im benachbarten Rohrstück

$$
\begin{aligned}
    V &= 2sA \\
    F &= -\rho 2 s A g \\
    &= -2\rho A g \cdot s \\
    &= -D \cdot s \\
\end{aligned}
$$

Die Rückstellkraft ist proportional zur Auslenkung $\rightarrow$ Schwingung ist
harmonisch

### Zeige, dass die Schwingungsdauer nur von der Gesamtlänge abhängt (auf der Erde).

Solange man weiß, dass die Schwingung harmonisch ist, kann man folgende
Zeit-Funktion verwenden.

$$
T = 2 \pi \sqrt{\frac{m}{D}}
$$

$m$ ist die Masse der gesamten bewegten Flüssigkeit

$$
\begin{aligned}
    m &= \rho V = \rho l A \\
    \rightarrow T &= 2 \pi \sqrt{\frac{m}{D}} \\
    &= 2 \pi \sqrt{\frac{\rho l A}{2 \rho A g}} \\
    &= 2 \pi \sqrt{\frac{l}{2 g}}
\end{aligned}
$$

### Exkurs: Beispiel einer nichtharmonischen Schwingung

Ball auf einem V förmigen Hügel.

Ist eine Schwingung, aber keine harmonische!

Die Rückstellkraft ist die Hangabtriebskraft. Sie hängt nicht von der Auslenkung
ab.

### Wie muss man die Länge der Säule von 100cm verändern, damit sich die Schwingungsdauer halbiert?

$$
T = 2 \pi \sqrt{\frac{l}{2g}}
$$

Wenn man die Länge viertelt, halbiert sich T! Also $l = 25cm$

### Die Dauer soll eine Sekunde betragen.

Länge der Flüssigkeitssäule:

$$
\begin{aligned}
    1 &= 2 \pi \sqrt{\frac{l}{2g}} \qquad &|& :2\pi \\
    \frac{1}{2\pi} &= \sqrt{\frac{l}{2g}} \qquad &|& ^2 \\
    (\frac{1}{2\pi})^2 &= \frac{l}{2g} \qquad &|& \cdot 2g \\
    (\frac{1}{2\pi})^2 \cdot 2g &= l \\
    &= 0.50m
\end{aligned}
$$

Zum Zeitpunkt $t=0$ durchläuft die Flüssigkeitssäule die Ruhelage. Die Amplitude
beträgt 5cm. Geben Sie die Zeit-Elongationsfunktion an.

$$
\begin{aligned}
    s(t) &= 0.05m \cdot \sin(\frac{2 \pi}{T} \cdot t) \\
    v(t) &= 0.05m \cdot \frac{2\pi}{T} \cos(\omega \cdot t) \\
    \rightarrow v_{max} &= 0.05m \cdot \frac{2\pi}{T} \\
    &= 0.1\pi \frac{m}{s} \\
    &= 0.241 \frac{m}{s}
\end{aligned}
$$

## Ball harmonisch oder nicht?

> Ein Ball prallt ohne Energieverlist zwischen dem Erdboden und einer Platte in
> der Höhe $h$ ($h \ll \text{Erdradius}$) hin und her.

> Geben Sie an, ob es sich bei dieser Bewegung um eine harmonische Schwingung handelt. Begründen Sie Ihre Entscheidung.

Die Rückstellkraft ist nicht proportional zur Auslenkung (immer gleich).

> Leiten Sie eine Formel für die Zeitdauer her, die der Bal für eine Hin- und
> Herbewegung benötigt. (Randbedingung $v(h) = 0$)

$$
\begin{aligned}
    s &= \frac{1}{2} gt^2
    t &= \sqrt{\frac{2h}{g}}
    T &= 2 \cdot \sqrt{\frac{2h}{g}}
\end{aligned}
$$

> Skizzieren Sie die Zeit-Auslenkungsfunktion.
