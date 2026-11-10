@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemConsoleNapiAddon(): Boolean

private val _windowsWin32SystemConsoleNapiAvailable: Boolean = _initWindowsWin32SystemConsoleNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_addConsoleAliasA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_console_addConsoleAliasA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_addConsoleAliasW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_console_addConsoleAliasW(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_allocConsole()")
private external fun _wasm_windowssys_windows_win32_system_console_allocConsole(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_attachConsole(p0)")
private external fun _wasm_windowssys_windows_win32_system_console_attachConsole(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_closePseudoConsole(p0)")
private external fun _wasm_windowssys_windows_win32_system_console_closePseudoConsole(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_consoleControl(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_console_consoleControl(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_createConsoleScreenBuffer(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_console_createConsoleScreenBuffer(p0: Int, p1: Int, p2: String, p3: Int, p4: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_expungeConsoleCommandHistoryA(p0)")
private external fun _wasm_windowssys_windows_win32_system_console_expungeConsoleCommandHistoryA(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_expungeConsoleCommandHistoryW(p0)")
private external fun _wasm_windowssys_windows_win32_system_console_expungeConsoleCommandHistoryW(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_flushConsoleInputBuffer(p0)")
private external fun _wasm_windowssys_windows_win32_system_console_flushConsoleInputBuffer(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_freeConsole()")
private external fun _wasm_windowssys_windows_win32_system_console_freeConsole(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_generateConsoleCtrlEvent(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_console_generateConsoleCtrlEvent(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getConsoleAliasA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_console_getConsoleAliasA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getConsoleAliasExesA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_console_getConsoleAliasExesA(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getConsoleAliasExesLengthA()")
private external fun _wasm_windowssys_windows_win32_system_console_getConsoleAliasExesLengthA(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getConsoleAliasExesLengthW()")
private external fun _wasm_windowssys_windows_win32_system_console_getConsoleAliasExesLengthW(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getConsoleAliasExesW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_console_getConsoleAliasExesW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getConsoleAliasW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_console_getConsoleAliasW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getConsoleAliasesA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_console_getConsoleAliasesA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getConsoleAliasesLengthA(p0)")
private external fun _wasm_windowssys_windows_win32_system_console_getConsoleAliasesLengthA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getConsoleAliasesLengthW(p0)")
private external fun _wasm_windowssys_windows_win32_system_console_getConsoleAliasesLengthW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getConsoleAliasesW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_console_getConsoleAliasesW(p0: String, p1: Int, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getConsoleCP()")
private external fun _wasm_windowssys_windows_win32_system_console_getConsoleCP(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getConsoleCommandHistoryA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_console_getConsoleCommandHistoryA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getConsoleCommandHistoryLengthA(p0)")
private external fun _wasm_windowssys_windows_win32_system_console_getConsoleCommandHistoryLengthA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getConsoleCommandHistoryLengthW(p0)")
private external fun _wasm_windowssys_windows_win32_system_console_getConsoleCommandHistoryLengthW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getConsoleCommandHistoryW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_console_getConsoleCommandHistoryW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getConsoleCursorInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_console_getConsoleCursorInfo(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getConsoleDisplayMode(p0)")
private external fun _wasm_windowssys_windows_win32_system_console_getConsoleDisplayMode(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getConsoleHistoryInfo(p0)")
private external fun _wasm_windowssys_windows_win32_system_console_getConsoleHistoryInfo(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getConsoleMode(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_console_getConsoleMode(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getConsoleOriginalTitleA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_console_getConsoleOriginalTitleA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getConsoleOriginalTitleW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_console_getConsoleOriginalTitleW(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getConsoleOutputCP()")
private external fun _wasm_windowssys_windows_win32_system_console_getConsoleOutputCP(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getConsoleProcessList(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_console_getConsoleProcessList(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getConsoleScreenBufferInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_console_getConsoleScreenBufferInfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getConsoleScreenBufferInfoEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_console_getConsoleScreenBufferInfoEx(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getConsoleSelectionInfo(p0)")
private external fun _wasm_windowssys_windows_win32_system_console_getConsoleSelectionInfo(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getConsoleTitleA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_console_getConsoleTitleA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getConsoleTitleW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_console_getConsoleTitleW(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getConsoleWindow()")
private external fun _wasm_windowssys_windows_win32_system_console_getConsoleWindow(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getCurrentConsoleFont(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_console_getCurrentConsoleFont(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getCurrentConsoleFontEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_console_getCurrentConsoleFontEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getNumberOfConsoleInputEvents(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_console_getNumberOfConsoleInputEvents(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getNumberOfConsoleMouseButtons(p0)")
private external fun _wasm_windowssys_windows_win32_system_console_getNumberOfConsoleMouseButtons(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_getStdHandle(p0)")
private external fun _wasm_windowssys_windows_win32_system_console_getStdHandle(p0: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_peekConsoleInputA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_console_peekConsoleInputA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_peekConsoleInputW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_console_peekConsoleInputW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_readConsoleA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_console_readConsoleA(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_readConsoleInputA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_console_readConsoleInputA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_readConsoleInputW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_console_readConsoleInputW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_readConsoleW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_console_readConsoleW(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_setConsoleActiveScreenBuffer(p0)")
private external fun _wasm_windowssys_windows_win32_system_console_setConsoleActiveScreenBuffer(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_setConsoleCP(p0)")
private external fun _wasm_windowssys_windows_win32_system_console_setConsoleCP(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_setConsoleCtrlHandler(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_console_setConsoleCtrlHandler(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_setConsoleCursorInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_console_setConsoleCursorInfo(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_setConsoleDisplayMode(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_console_setConsoleDisplayMode(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_setConsoleHistoryInfo(p0)")
private external fun _wasm_windowssys_windows_win32_system_console_setConsoleHistoryInfo(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_setConsoleMode(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_console_setConsoleMode(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_setConsoleNumberOfCommandsA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_console_setConsoleNumberOfCommandsA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_setConsoleNumberOfCommandsW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_console_setConsoleNumberOfCommandsW(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_setConsoleOutputCP(p0)")
private external fun _wasm_windowssys_windows_win32_system_console_setConsoleOutputCP(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_setConsoleScreenBufferInfoEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_console_setConsoleScreenBufferInfoEx(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_setConsoleTextAttribute(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_console_setConsoleTextAttribute(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_setConsoleTitleA(p0)")
private external fun _wasm_windowssys_windows_win32_system_console_setConsoleTitleA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_setConsoleTitleW(p0)")
private external fun _wasm_windowssys_windows_win32_system_console_setConsoleTitleW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_setConsoleWindowInfo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_console_setConsoleWindowInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_setCurrentConsoleFontEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_console_setCurrentConsoleFontEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_setStdHandle(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_console_setStdHandle(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_setStdHandleEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_console_setStdHandleEx(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_writeConsoleA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_console_writeConsoleA(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_writeConsoleInputA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_console_writeConsoleInputA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_writeConsoleInputW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_console_writeConsoleInputW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_console_writeConsoleW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_console_writeConsoleW(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

public actual fun addConsoleAliasA(source: Pcstr, target: Pcstr, exename: Pcstr): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_addConsoleAliasA((source?.value ?: 0L).toString(), (target?.value ?: 0L).toString(), (exename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addConsoleAliasW(source: Pcwstr, target: Pcwstr, exename: Pcwstr): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_addConsoleAliasW((source?.value ?: 0L).toString(), (target?.value ?: 0L).toString(), (exename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allocConsole(): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_allocConsole() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun attachConsole(dwprocessid: UInt): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_attachConsole(dwprocessid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closePseudoConsole(hpc: Hpcon) {
    if (_windowsWin32SystemConsoleNapiAvailable) {
        _wasm_windowssys_windows_win32_system_console_closePseudoConsole(hpc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun consoleControl(command: Consolecontrol, consoleinformation: COpaquePointer?, consoleinformationlength: UInt): Ntstatus =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_consoleControl(command, (consoleinformation?.value ?: 0L).toString(), consoleinformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createConsoleScreenBuffer(dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: COpaquePointer?, dwflags: UInt, lpscreenbufferdata: COpaquePointer?): Handle =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_createConsoleScreenBuffer(dwdesiredaccess.toInt(), dwsharemode.toInt(), (lpsecurityattributes?.value ?: 0L).toString(), dwflags.toInt(), (lpscreenbufferdata?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPseudoConsole(size: Coord, hinput: Handle, houtput: Handle, dwflags: UInt, phpc: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun expungeConsoleCommandHistoryA(exename: Pcstr) {
    if (_windowsWin32SystemConsoleNapiAvailable) {
        _wasm_windowssys_windows_win32_system_console_expungeConsoleCommandHistoryA((exename?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun expungeConsoleCommandHistoryW(exename: Pcwstr) {
    if (_windowsWin32SystemConsoleNapiAvailable) {
        _wasm_windowssys_windows_win32_system_console_expungeConsoleCommandHistoryW((exename?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fillConsoleOutputAttribute(hconsoleoutput: Handle, wattribute: UShort, nlength: UInt, dwwritecoord: Coord, lpnumberofattrswritten: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fillConsoleOutputCharacterA(hconsoleoutput: Handle, ccharacter: Byte, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fillConsoleOutputCharacterW(hconsoleoutput: Handle, ccharacter: UShort, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushConsoleInputBuffer(hconsoleinput: Handle): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_flushConsoleInputBuffer((hconsoleinput?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeConsole(): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_freeConsole() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun generateConsoleCtrlEvent(dwctrlevent: UInt, dwprocessgroupid: UInt): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_generateConsoleCtrlEvent(dwctrlevent.toInt(), dwprocessgroupid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleAliasA(source: Pcstr, targetbuffer: Pstr, targetbufferlength: UInt, exename: Pcstr): UInt =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getConsoleAliasA((source?.value ?: 0L).toString(), (targetbuffer?.value ?: 0L).toString(), targetbufferlength.toInt(), (exename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleAliasExesA(exenamebuffer: Pstr, exenamebufferlength: UInt): UInt =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getConsoleAliasExesA((exenamebuffer?.value ?: 0L).toString(), exenamebufferlength.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleAliasExesLengthA(): UInt =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getConsoleAliasExesLengthA().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleAliasExesLengthW(): UInt =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getConsoleAliasExesLengthW().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleAliasExesW(exenamebuffer: Pwstr, exenamebufferlength: UInt): UInt =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getConsoleAliasExesW((exenamebuffer?.value ?: 0L).toString(), exenamebufferlength.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleAliasW(source: Pcwstr, targetbuffer: Pwstr, targetbufferlength: UInt, exename: Pcwstr): UInt =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getConsoleAliasW((source?.value ?: 0L).toString(), (targetbuffer?.value ?: 0L).toString(), targetbufferlength.toInt(), (exename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleAliasesA(aliasbuffer: Pstr, aliasbufferlength: UInt, exename: Pcstr): UInt =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getConsoleAliasesA((aliasbuffer?.value ?: 0L).toString(), aliasbufferlength.toInt(), (exename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleAliasesLengthA(exename: Pcstr): UInt =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getConsoleAliasesLengthA((exename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleAliasesLengthW(exename: Pcwstr): UInt =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getConsoleAliasesLengthW((exename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleAliasesW(aliasbuffer: Pwstr, aliasbufferlength: UInt, exename: Pcwstr): UInt =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getConsoleAliasesW((aliasbuffer?.value ?: 0L).toString(), aliasbufferlength.toInt(), (exename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleCP(): UInt =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getConsoleCP().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleCommandHistoryA(commands: Pstr, commandbufferlength: UInt, exename: Pcstr): UInt =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getConsoleCommandHistoryA((commands?.value ?: 0L).toString(), commandbufferlength.toInt(), (exename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleCommandHistoryLengthA(exename: Pcstr): UInt =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getConsoleCommandHistoryLengthA((exename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleCommandHistoryLengthW(exename: Pcwstr): UInt =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getConsoleCommandHistoryLengthW((exename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleCommandHistoryW(commands: Pwstr, commandbufferlength: UInt, exename: Pcwstr): UInt =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getConsoleCommandHistoryW((commands?.value ?: 0L).toString(), commandbufferlength.toInt(), (exename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleCursorInfo(hconsoleoutput: Handle, lpconsolecursorinfo: COpaquePointer?): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getConsoleCursorInfo((hconsoleoutput?.value ?: 0L).toString(), (lpconsolecursorinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleDisplayMode(lpmodeflags: COpaquePointer?): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getConsoleDisplayMode((lpmodeflags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleFontSize(hconsoleoutput: Handle, nfont: UInt): Coord =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleHistoryInfo(lpconsolehistoryinfo: COpaquePointer?): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getConsoleHistoryInfo((lpconsolehistoryinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleMode(hconsolehandle: Handle, lpmode: COpaquePointer?): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getConsoleMode((hconsolehandle?.value ?: 0L).toString(), (lpmode?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleOriginalTitleA(lpconsoletitle: Pstr, nsize: UInt): UInt =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getConsoleOriginalTitleA((lpconsoletitle?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleOriginalTitleW(lpconsoletitle: Pwstr, nsize: UInt): UInt =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getConsoleOriginalTitleW((lpconsoletitle?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleOutputCP(): UInt =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getConsoleOutputCP().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleProcessList(lpdwprocesslist: COpaquePointer?, dwprocesscount: UInt): UInt =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getConsoleProcessList((lpdwprocesslist?.value ?: 0L).toString(), dwprocesscount.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleScreenBufferInfo(hconsoleoutput: Handle, lpconsolescreenbufferinfo: COpaquePointer?): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getConsoleScreenBufferInfo((hconsoleoutput?.value ?: 0L).toString(), (lpconsolescreenbufferinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleScreenBufferInfoEx(hconsoleoutput: Handle, lpconsolescreenbufferinfoex: COpaquePointer?): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getConsoleScreenBufferInfoEx((hconsoleoutput?.value ?: 0L).toString(), (lpconsolescreenbufferinfoex?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleSelectionInfo(lpconsoleselectioninfo: COpaquePointer?): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getConsoleSelectionInfo((lpconsoleselectioninfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleTitleA(lpconsoletitle: Pstr, nsize: UInt): UInt =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getConsoleTitleA((lpconsoletitle?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleTitleW(lpconsoletitle: Pwstr, nsize: UInt): UInt =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getConsoleTitleW((lpconsoletitle?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleWindow(): Hwnd =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getConsoleWindow().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentConsoleFont(hconsoleoutput: Handle, bmaximumwindow: Bool, lpconsolecurrentfont: COpaquePointer?): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getCurrentConsoleFont((hconsoleoutput?.value ?: 0L).toString(), bmaximumwindow, (lpconsolecurrentfont?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentConsoleFontEx(hconsoleoutput: Handle, bmaximumwindow: Bool, lpconsolecurrentfontex: COpaquePointer?): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getCurrentConsoleFontEx((hconsoleoutput?.value ?: 0L).toString(), bmaximumwindow, (lpconsolecurrentfontex?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLargestConsoleWindowSize(hconsoleoutput: Handle): Coord =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumberOfConsoleInputEvents(hconsoleinput: Handle, lpnumberofevents: COpaquePointer?): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getNumberOfConsoleInputEvents((hconsoleinput?.value ?: 0L).toString(), (lpnumberofevents?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumberOfConsoleMouseButtons(lpnumberofmousebuttons: COpaquePointer?): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getNumberOfConsoleMouseButtons((lpnumberofmousebuttons?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStdHandle(nstdhandle: StdHandle): Handle =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_getStdHandle(nstdhandle.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peekConsoleInputA(hconsoleinput: Handle, lpbuffer: COpaquePointer?, nlength: UInt, lpnumberofeventsread: COpaquePointer?): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_peekConsoleInputA((hconsoleinput?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), nlength.toInt(), (lpnumberofeventsread?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peekConsoleInputW(hconsoleinput: Handle, lpbuffer: COpaquePointer?, nlength: UInt, lpnumberofeventsread: COpaquePointer?): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_peekConsoleInputW((hconsoleinput?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), nlength.toInt(), (lpnumberofeventsread?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readConsoleA(hconsoleinput: Handle, lpbuffer: COpaquePointer?, nnumberofcharstoread: UInt, lpnumberofcharsread: COpaquePointer?, pinputcontrol: COpaquePointer?): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_readConsoleA((hconsoleinput?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), nnumberofcharstoread.toInt(), (lpnumberofcharsread?.value ?: 0L).toString(), (pinputcontrol?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readConsoleInputA(hconsoleinput: Handle, lpbuffer: COpaquePointer?, nlength: UInt, lpnumberofeventsread: COpaquePointer?): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_readConsoleInputA((hconsoleinput?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), nlength.toInt(), (lpnumberofeventsread?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readConsoleInputW(hconsoleinput: Handle, lpbuffer: COpaquePointer?, nlength: UInt, lpnumberofeventsread: COpaquePointer?): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_readConsoleInputW((hconsoleinput?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), nlength.toInt(), (lpnumberofeventsread?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readConsoleOutputA(hconsoleoutput: Handle, lpbuffer: COpaquePointer?, dwbuffersize: Coord, dwbuffercoord: Coord, lpreadregion: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readConsoleOutputAttribute(hconsoleoutput: Handle, lpattribute: COpaquePointer?, nlength: UInt, dwreadcoord: Coord, lpnumberofattrsread: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readConsoleOutputCharacterA(hconsoleoutput: Handle, lpcharacter: Pstr, nlength: UInt, dwreadcoord: Coord, lpnumberofcharsread: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readConsoleOutputCharacterW(hconsoleoutput: Handle, lpcharacter: Pwstr, nlength: UInt, dwreadcoord: Coord, lpnumberofcharsread: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readConsoleOutputW(hconsoleoutput: Handle, lpbuffer: COpaquePointer?, dwbuffersize: Coord, dwbuffercoord: Coord, lpreadregion: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readConsoleW(hconsoleinput: Handle, lpbuffer: COpaquePointer?, nnumberofcharstoread: UInt, lpnumberofcharsread: COpaquePointer?, pinputcontrol: COpaquePointer?): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_readConsoleW((hconsoleinput?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), nnumberofcharstoread.toInt(), (lpnumberofcharsread?.value ?: 0L).toString(), (pinputcontrol?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resizePseudoConsole(hpc: Hpcon, size: Coord): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scrollConsoleScreenBufferA(hconsoleoutput: Handle, lpscrollrectangle: COpaquePointer?, lpcliprectangle: COpaquePointer?, dwdestinationorigin: Coord, lpfill: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scrollConsoleScreenBufferW(hconsoleoutput: Handle, lpscrollrectangle: COpaquePointer?, lpcliprectangle: COpaquePointer?, dwdestinationorigin: Coord, lpfill: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleActiveScreenBuffer(hconsoleoutput: Handle): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_setConsoleActiveScreenBuffer((hconsoleoutput?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleCP(wcodepageid: UInt): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_setConsoleCP(wcodepageid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleCtrlHandler(handlerroutine: PhandlerRoutine, add: Bool): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_setConsoleCtrlHandler(0L.toString(), add) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleCursorInfo(hconsoleoutput: Handle, lpconsolecursorinfo: COpaquePointer?): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_setConsoleCursorInfo((hconsoleoutput?.value ?: 0L).toString(), (lpconsolecursorinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleCursorPosition(hconsoleoutput: Handle, dwcursorposition: Coord): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleDisplayMode(hconsoleoutput: Handle, dwflags: UInt, lpnewscreenbufferdimensions: COpaquePointer?): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_setConsoleDisplayMode((hconsoleoutput?.value ?: 0L).toString(), dwflags.toInt(), (lpnewscreenbufferdimensions?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleHistoryInfo(lpconsolehistoryinfo: COpaquePointer?): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_setConsoleHistoryInfo((lpconsolehistoryinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleMode(hconsolehandle: Handle, dwmode: ConsoleMode): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_setConsoleMode((hconsolehandle?.value ?: 0L).toString(), dwmode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleNumberOfCommandsA(number: UInt, exename: Pcstr): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_setConsoleNumberOfCommandsA(number.toInt(), (exename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleNumberOfCommandsW(number: UInt, exename: Pcwstr): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_setConsoleNumberOfCommandsW(number.toInt(), (exename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleOutputCP(wcodepageid: UInt): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_setConsoleOutputCP(wcodepageid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleScreenBufferInfoEx(hconsoleoutput: Handle, lpconsolescreenbufferinfoex: COpaquePointer?): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_setConsoleScreenBufferInfoEx((hconsoleoutput?.value ?: 0L).toString(), (lpconsolescreenbufferinfoex?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleScreenBufferSize(hconsoleoutput: Handle, dwsize: Coord): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleTextAttribute(hconsoleoutput: Handle, wattributes: ConsoleCharacterAttributes): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_setConsoleTextAttribute((hconsoleoutput?.value ?: 0L).toString(), wattributes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleTitleA(lpconsoletitle: Pcstr): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_setConsoleTitleA((lpconsoletitle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleTitleW(lpconsoletitle: Pcwstr): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_setConsoleTitleW((lpconsoletitle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleWindowInfo(hconsoleoutput: Handle, babsolute: Bool, lpconsolewindow: COpaquePointer?): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_setConsoleWindowInfo((hconsoleoutput?.value ?: 0L).toString(), babsolute, (lpconsolewindow?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCurrentConsoleFontEx(hconsoleoutput: Handle, bmaximumwindow: Bool, lpconsolecurrentfontex: COpaquePointer?): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_setCurrentConsoleFontEx((hconsoleoutput?.value ?: 0L).toString(), bmaximumwindow, (lpconsolecurrentfontex?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setStdHandle(nstdhandle: StdHandle, hhandle: Handle): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_setStdHandle(nstdhandle.toInt(), (hhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setStdHandleEx(nstdhandle: StdHandle, hhandle: Handle, phprevvalue: COpaquePointer?): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_setStdHandleEx(nstdhandle.toInt(), (hhandle?.value ?: 0L).toString(), (phprevvalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeConsoleA(hconsoleoutput: Handle, lpbuffer: Pcstr, nnumberofcharstowrite: UInt, lpnumberofcharswritten: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_writeConsoleA((hconsoleoutput?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), nnumberofcharstowrite.toInt(), (lpnumberofcharswritten?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeConsoleInputA(hconsoleinput: Handle, lpbuffer: COpaquePointer?, nlength: UInt, lpnumberofeventswritten: COpaquePointer?): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_writeConsoleInputA((hconsoleinput?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), nlength.toInt(), (lpnumberofeventswritten?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeConsoleInputW(hconsoleinput: Handle, lpbuffer: COpaquePointer?, nlength: UInt, lpnumberofeventswritten: COpaquePointer?): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_writeConsoleInputW((hconsoleinput?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), nlength.toInt(), (lpnumberofeventswritten?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeConsoleOutputA(hconsoleoutput: Handle, lpbuffer: COpaquePointer?, dwbuffersize: Coord, dwbuffercoord: Coord, lpwriteregion: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeConsoleOutputAttribute(hconsoleoutput: Handle, lpattribute: COpaquePointer?, nlength: UInt, dwwritecoord: Coord, lpnumberofattrswritten: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeConsoleOutputCharacterA(hconsoleoutput: Handle, lpcharacter: Pcstr, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeConsoleOutputCharacterW(hconsoleoutput: Handle, lpcharacter: Pcwstr, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeConsoleOutputW(hconsoleoutput: Handle, lpbuffer: COpaquePointer?, dwbuffersize: Coord, dwbuffercoord: Coord, lpwriteregion: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeConsoleW(hconsoleoutput: Handle, lpbuffer: Pcwstr, nnumberofcharstowrite: UInt, lpnumberofcharswritten: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    if (_windowsWin32SystemConsoleNapiAvailable) _wasm_windowssys_windows_win32_system_console_writeConsoleW((hconsoleoutput?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), nnumberofcharstowrite.toInt(), (lpnumberofcharswritten?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
