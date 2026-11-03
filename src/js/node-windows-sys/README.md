# @kotlinmania/windows-sys-native-bindings

N-API C++ addon providing Win32 system bindings for Kotlin/JS and Kotlin/WASM.

## Architecture
- Shared between Kotlin/JS (`nodeMain`) and Kotlin/WASM (`wasmJsMain` via Node.js).
- Wraps direct Win32 C/C++ library calls (`kernel32.dll`, `oleaut32.dll`, `advapi32.dll`).
- Built via `node-gyp`.
