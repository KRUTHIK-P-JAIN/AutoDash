# AutoDash 🚗

**AutoDash** is a **sample Android Automotive (AAOS) dashboard app** built with **Kotlin**, *
*Jetpack Compose**, **Hilt**, and **Clean Architecture**.  
It demonstrates a simple dashboard UI for car displays, showing **mocked speed, fuel level, and
outside temperature**.

---

## Features

- ✅ Sample MVVM + Hilt architecture
- ✅ Jetpack Compose UI
- ✅ Reactive dashboard using `StateFlow`
- ✅ Modular layers: `data`, `domain`, `presentation`
- ✅ AAOS-ready layout for automotive displays
- ✅ Mocked data for Speed, Fuel, and Temperature

---

## Architecture
```
app/
├─ data/ → Repositories + Data Sources (mocked)
├─ domain/ → Models + Use Cases + Repository Interfaces
├─ presentation/ → UI Screens + ViewModels
├─ di/ → Hilt Modules
└─ MainActivity.kt → Entry point
```

- **Data Layer:** Provides **mocked car status**.
- **Domain Layer:** Business logic via Use Cases.
- **Presentation Layer:** Compose UI observes `StateFlow` from ViewModel.
- **DI Layer:** Hilt provides repositories and use cases.

---

## Tech Stack

- **Kotlin**
- **Jetpack Compose**
- **Hilt (Dependency Injection)**
- **StateFlow + ViewModel**
- **Material 3 UI**
- **Android Automotive OS (AAOS)**

---

## Setup

1. Clone the repository:

```bash
git clone https://github.com/KRUTHIK-P-JAIN/AutoDash.git
cd AutoDash
```

2. Open in Android Studio
3. Ensure Gradle sync is complete.
4. Build and run on Automotive Emulator (or AAOS device).
