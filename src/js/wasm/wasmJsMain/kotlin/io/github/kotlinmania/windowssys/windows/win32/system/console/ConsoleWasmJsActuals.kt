@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemConsoleNapiAddon(): Boolean

private val windowsWin32SystemConsoleNapiAvailable: Boolean = initWindowsWin32SystemConsoleNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleAddConsoleAliasA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemConsoleAddConsoleAliasA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleAddConsoleAliasW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemConsoleAddConsoleAliasW(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleAllocConsole()")
private external fun wasmWindowssysWindowsWin32SystemConsoleAllocConsole(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleAttachConsole(p0)")
private external fun wasmWindowssysWindowsWin32SystemConsoleAttachConsole(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleClosePseudoConsole(p0)")
private external fun wasmWindowssysWindowsWin32SystemConsoleClosePseudoConsole(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleConsoleControl(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemConsoleConsoleControl(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleCreateConsoleScreenBuffer(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemConsoleCreateConsoleScreenBuffer(p0: Int, p1: Int, p2: String, p3: Int, p4: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleExpungeConsoleCommandHistoryA(p0)")
private external fun wasmWindowssysWindowsWin32SystemConsoleExpungeConsoleCommandHistoryA(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleExpungeConsoleCommandHistoryW(p0)")
private external fun wasmWindowssysWindowsWin32SystemConsoleExpungeConsoleCommandHistoryW(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleFlushConsoleInputBuffer(p0)")
private external fun wasmWindowssysWindowsWin32SystemConsoleFlushConsoleInputBuffer(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleFreeConsole()")
private external fun wasmWindowssysWindowsWin32SystemConsoleFreeConsole(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGenerateConsoleCtrlEvent(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemConsoleGenerateConsoleCtrlEvent(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetConsoleAliasA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetConsoleAliasA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetConsoleAliasExesA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetConsoleAliasExesA(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetConsoleAliasExesLengthA()")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetConsoleAliasExesLengthA(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetConsoleAliasExesLengthW()")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetConsoleAliasExesLengthW(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetConsoleAliasExesW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetConsoleAliasExesW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetConsoleAliasW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetConsoleAliasW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetConsoleAliasesA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetConsoleAliasesA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetConsoleAliasesLengthA(p0)")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetConsoleAliasesLengthA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetConsoleAliasesLengthW(p0)")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetConsoleAliasesLengthW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetConsoleAliasesW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetConsoleAliasesW(p0: String, p1: Int, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetConsoleCP()")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetConsoleCP(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryLengthA(p0)")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryLengthA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryLengthW(p0)")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryLengthW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetConsoleCursorInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetConsoleCursorInfo(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetConsoleDisplayMode(p0)")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetConsoleDisplayMode(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetConsoleHistoryInfo(p0)")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetConsoleHistoryInfo(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetConsoleMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetConsoleMode(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetConsoleOriginalTitleA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetConsoleOriginalTitleA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetConsoleOriginalTitleW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetConsoleOriginalTitleW(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetConsoleOutputCP()")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetConsoleOutputCP(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetConsoleProcessList(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetConsoleProcessList(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetConsoleScreenBufferInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetConsoleScreenBufferInfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetConsoleScreenBufferInfoEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetConsoleScreenBufferInfoEx(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetConsoleSelectionInfo(p0)")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetConsoleSelectionInfo(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetConsoleTitleA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetConsoleTitleA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetConsoleTitleW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetConsoleTitleW(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetConsoleWindow()")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetConsoleWindow(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetCurrentConsoleFont(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetCurrentConsoleFont(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetCurrentConsoleFontEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetCurrentConsoleFontEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetNumberOfConsoleInputEvents(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetNumberOfConsoleInputEvents(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetNumberOfConsoleMouseButtons(p0)")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetNumberOfConsoleMouseButtons(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleGetStdHandle(p0)")
private external fun wasmWindowssysWindowsWin32SystemConsoleGetStdHandle(p0: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsolePeekConsoleInputA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemConsolePeekConsoleInputA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsolePeekConsoleInputW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemConsolePeekConsoleInputW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleReadConsoleA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemConsoleReadConsoleA(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleReadConsoleInputA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemConsoleReadConsoleInputA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleReadConsoleInputW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemConsoleReadConsoleInputW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleReadConsoleW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemConsoleReadConsoleW(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleSetConsoleActiveScreenBuffer(p0)")
private external fun wasmWindowssysWindowsWin32SystemConsoleSetConsoleActiveScreenBuffer(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleSetConsoleCP(p0)")
private external fun wasmWindowssysWindowsWin32SystemConsoleSetConsoleCP(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleSetConsoleCtrlHandler(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemConsoleSetConsoleCtrlHandler(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleSetConsoleCursorInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemConsoleSetConsoleCursorInfo(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleSetConsoleDisplayMode(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemConsoleSetConsoleDisplayMode(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleSetConsoleHistoryInfo(p0)")
private external fun wasmWindowssysWindowsWin32SystemConsoleSetConsoleHistoryInfo(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleSetConsoleMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemConsoleSetConsoleMode(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleSetConsoleNumberOfCommandsA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemConsoleSetConsoleNumberOfCommandsA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleSetConsoleNumberOfCommandsW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemConsoleSetConsoleNumberOfCommandsW(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleSetConsoleOutputCP(p0)")
private external fun wasmWindowssysWindowsWin32SystemConsoleSetConsoleOutputCP(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleSetConsoleScreenBufferInfoEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemConsoleSetConsoleScreenBufferInfoEx(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleSetConsoleTextAttribute(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemConsoleSetConsoleTextAttribute(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleSetConsoleTitleA(p0)")
private external fun wasmWindowssysWindowsWin32SystemConsoleSetConsoleTitleA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleSetConsoleTitleW(p0)")
private external fun wasmWindowssysWindowsWin32SystemConsoleSetConsoleTitleW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleSetConsoleWindowInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemConsoleSetConsoleWindowInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleSetCurrentConsoleFontEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemConsoleSetCurrentConsoleFontEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleSetStdHandle(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemConsoleSetStdHandle(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleSetStdHandleEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemConsoleSetStdHandleEx(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleWriteConsoleA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemConsoleWriteConsoleA(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleWriteConsoleInputA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemConsoleWriteConsoleInputA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleWriteConsoleInputW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemConsoleWriteConsoleInputW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemConsoleWriteConsoleW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemConsoleWriteConsoleW(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

public actual fun addConsoleAliasA(source: Pcstr, target: Pcstr, exename: Pcstr): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleAddConsoleAliasA(source.rawAddress.toString(), target.rawAddress.toString(), exename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addConsoleAliasW(source: Pcwstr, target: Pcwstr, exename: Pcwstr): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleAddConsoleAliasW(source.rawAddress.toString(), target.rawAddress.toString(), exename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allocConsole(): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleAllocConsole() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun attachConsole(dwprocessid: UInt): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleAttachConsole(dwprocessid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closePseudoConsole(hpc: Hpcon) {
    if (windowsWin32SystemConsoleNapiAvailable) {
        wasmWindowssysWindowsWin32SystemConsoleClosePseudoConsole(hpc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun consoleControl(command: Consolecontrol, consoleinformation: ConstPtr<CVoid>, consoleinformationlength: UInt): Ntstatus =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleConsoleControl(command, consoleinformation.rawAddress.toString(), consoleinformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createConsoleScreenBuffer(dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>, dwflags: UInt, lpscreenbufferdata: ConstPtr<CVoid>): Handle =
    if (windowsWin32SystemConsoleNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemConsoleCreateConsoleScreenBuffer(dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes.rawAddress.toString(), dwflags.toInt(), lpscreenbufferdata.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPseudoConsole(size: Coord, hinput: Handle, houtput: Handle, dwflags: UInt, phpc: MutPtr<Hpcon>): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun expungeConsoleCommandHistoryA(exename: Pcstr) {
    if (windowsWin32SystemConsoleNapiAvailable) {
        wasmWindowssysWindowsWin32SystemConsoleExpungeConsoleCommandHistoryA(exename.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun expungeConsoleCommandHistoryW(exename: Pcwstr) {
    if (windowsWin32SystemConsoleNapiAvailable) {
        wasmWindowssysWindowsWin32SystemConsoleExpungeConsoleCommandHistoryW(exename.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fillConsoleOutputAttribute(hconsoleoutput: Handle, wattribute: UShort, nlength: UInt, dwwritecoord: Coord, lpnumberofattrswritten: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fillConsoleOutputCharacterA(hconsoleoutput: Handle, ccharacter: Byte, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fillConsoleOutputCharacterW(hconsoleoutput: Handle, ccharacter: UShort, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushConsoleInputBuffer(hconsoleinput: Handle): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleFlushConsoleInputBuffer(hconsoleinput.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeConsole(): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleFreeConsole() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun generateConsoleCtrlEvent(dwctrlevent: UInt, dwprocessgroupid: UInt): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleGenerateConsoleCtrlEvent(dwctrlevent.toInt(), dwprocessgroupid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleAliasA(source: Pcstr, targetbuffer: Pstr, targetbufferlength: UInt, exename: Pcstr): UInt =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleGetConsoleAliasA(source.rawAddress.toString(), targetbuffer.rawAddress.toString(), targetbufferlength.toInt(), exename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleAliasExesA(exenamebuffer: Pstr, exenamebufferlength: UInt): UInt =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleGetConsoleAliasExesA(exenamebuffer.rawAddress.toString(), exenamebufferlength.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleAliasExesLengthA(): UInt =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleGetConsoleAliasExesLengthA().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleAliasExesLengthW(): UInt =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleGetConsoleAliasExesLengthW().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleAliasExesW(exenamebuffer: Pwstr, exenamebufferlength: UInt): UInt =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleGetConsoleAliasExesW(exenamebuffer.rawAddress.toString(), exenamebufferlength.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleAliasW(source: Pcwstr, targetbuffer: Pwstr, targetbufferlength: UInt, exename: Pcwstr): UInt =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleGetConsoleAliasW(source.rawAddress.toString(), targetbuffer.rawAddress.toString(), targetbufferlength.toInt(), exename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleAliasesA(aliasbuffer: Pstr, aliasbufferlength: UInt, exename: Pcstr): UInt =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleGetConsoleAliasesA(aliasbuffer.rawAddress.toString(), aliasbufferlength.toInt(), exename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleAliasesLengthA(exename: Pcstr): UInt =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleGetConsoleAliasesLengthA(exename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleAliasesLengthW(exename: Pcwstr): UInt =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleGetConsoleAliasesLengthW(exename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleAliasesW(aliasbuffer: Pwstr, aliasbufferlength: UInt, exename: Pcwstr): UInt =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleGetConsoleAliasesW(aliasbuffer.rawAddress.toString(), aliasbufferlength.toInt(), exename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleCP(): UInt =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleGetConsoleCP().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleCommandHistoryA(commands: Pstr, commandbufferlength: UInt, exename: Pcstr): UInt =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryA(commands.rawAddress.toString(), commandbufferlength.toInt(), exename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleCommandHistoryLengthA(exename: Pcstr): UInt =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryLengthA(exename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleCommandHistoryLengthW(exename: Pcwstr): UInt =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryLengthW(exename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleCommandHistoryW(commands: Pwstr, commandbufferlength: UInt, exename: Pcwstr): UInt =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryW(commands.rawAddress.toString(), commandbufferlength.toInt(), exename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleCursorInfo(hconsoleoutput: Handle, lpconsolecursorinfo: MutPtr<ConsoleCursorInfo>): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleGetConsoleCursorInfo(hconsoleoutput.rawAddress.toString(), lpconsolecursorinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleDisplayMode(lpmodeflags: MutPtr<UInt>): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleGetConsoleDisplayMode(lpmodeflags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleFontSize(hconsoleoutput: Handle, nfont: UInt): Coord =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleHistoryInfo(lpconsolehistoryinfo: MutPtr<ConsoleHistoryInfo>): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleGetConsoleHistoryInfo(lpconsolehistoryinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleMode(hconsolehandle: Handle, lpmode: MutPtr<ConsoleMode>): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleGetConsoleMode(hconsolehandle.rawAddress.toString(), lpmode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleOriginalTitleA(lpconsoletitle: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleGetConsoleOriginalTitleA(lpconsoletitle.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleOriginalTitleW(lpconsoletitle: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleGetConsoleOriginalTitleW(lpconsoletitle.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleOutputCP(): UInt =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleGetConsoleOutputCP().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleProcessList(lpdwprocesslist: MutPtr<UInt>, dwprocesscount: UInt): UInt =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleGetConsoleProcessList(lpdwprocesslist.rawAddress.toString(), dwprocesscount.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleScreenBufferInfo(hconsoleoutput: Handle, lpconsolescreenbufferinfo: MutPtr<ConsoleScreenBufferInfo>): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleGetConsoleScreenBufferInfo(hconsoleoutput.rawAddress.toString(), lpconsolescreenbufferinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleScreenBufferInfoEx(hconsoleoutput: Handle, lpconsolescreenbufferinfoex: MutPtr<ConsoleScreenBufferInfoex>): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleGetConsoleScreenBufferInfoEx(hconsoleoutput.rawAddress.toString(), lpconsolescreenbufferinfoex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleSelectionInfo(lpconsoleselectioninfo: MutPtr<ConsoleSelectionInfo>): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleGetConsoleSelectionInfo(lpconsoleselectioninfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleTitleA(lpconsoletitle: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleGetConsoleTitleA(lpconsoletitle.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleTitleW(lpconsoletitle: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleGetConsoleTitleW(lpconsoletitle.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleWindow(): Hwnd =
    if (windowsWin32SystemConsoleNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemConsoleGetConsoleWindow().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentConsoleFont(hconsoleoutput: Handle, bmaximumwindow: Bool, lpconsolecurrentfont: MutPtr<ConsoleFontInfo>): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleGetCurrentConsoleFont(hconsoleoutput.rawAddress.toString(), bmaximumwindow, lpconsolecurrentfont.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentConsoleFontEx(hconsoleoutput: Handle, bmaximumwindow: Bool, lpconsolecurrentfontex: MutPtr<ConsoleFontInfoex>): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleGetCurrentConsoleFontEx(hconsoleoutput.rawAddress.toString(), bmaximumwindow, lpconsolecurrentfontex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLargestConsoleWindowSize(hconsoleoutput: Handle): Coord =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumberOfConsoleInputEvents(hconsoleinput: Handle, lpnumberofevents: MutPtr<UInt>): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleGetNumberOfConsoleInputEvents(hconsoleinput.rawAddress.toString(), lpnumberofevents.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumberOfConsoleMouseButtons(lpnumberofmousebuttons: MutPtr<UInt>): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleGetNumberOfConsoleMouseButtons(lpnumberofmousebuttons.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStdHandle(nstdhandle: StdHandle): Handle =
    if (windowsWin32SystemConsoleNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemConsoleGetStdHandle(nstdhandle.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peekConsoleInputA(hconsoleinput: Handle, lpbuffer: MutPtr<InputRecord>, nlength: UInt, lpnumberofeventsread: MutPtr<UInt>): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsolePeekConsoleInputA(hconsoleinput.rawAddress.toString(), lpbuffer.rawAddress.toString(), nlength.toInt(), lpnumberofeventsread.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peekConsoleInputW(hconsoleinput: Handle, lpbuffer: MutPtr<InputRecord>, nlength: UInt, lpnumberofeventsread: MutPtr<UInt>): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsolePeekConsoleInputW(hconsoleinput.rawAddress.toString(), lpbuffer.rawAddress.toString(), nlength.toInt(), lpnumberofeventsread.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readConsoleA(hconsoleinput: Handle, lpbuffer: MutPtr<CVoid>, nnumberofcharstoread: UInt, lpnumberofcharsread: MutPtr<UInt>, pinputcontrol: ConstPtr<ConsoleReadconsoleControl>): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleReadConsoleA(hconsoleinput.rawAddress.toString(), lpbuffer.rawAddress.toString(), nnumberofcharstoread.toInt(), lpnumberofcharsread.rawAddress.toString(), pinputcontrol.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readConsoleInputA(hconsoleinput: Handle, lpbuffer: MutPtr<InputRecord>, nlength: UInt, lpnumberofeventsread: MutPtr<UInt>): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleReadConsoleInputA(hconsoleinput.rawAddress.toString(), lpbuffer.rawAddress.toString(), nlength.toInt(), lpnumberofeventsread.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readConsoleInputW(hconsoleinput: Handle, lpbuffer: MutPtr<InputRecord>, nlength: UInt, lpnumberofeventsread: MutPtr<UInt>): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleReadConsoleInputW(hconsoleinput.rawAddress.toString(), lpbuffer.rawAddress.toString(), nlength.toInt(), lpnumberofeventsread.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readConsoleOutputA(hconsoleoutput: Handle, lpbuffer: MutPtr<CharInfo>, dwbuffersize: Coord, dwbuffercoord: Coord, lpreadregion: MutPtr<SmallRect>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readConsoleOutputAttribute(hconsoleoutput: Handle, lpattribute: MutPtr<UShort>, nlength: UInt, dwreadcoord: Coord, lpnumberofattrsread: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readConsoleOutputCharacterA(hconsoleoutput: Handle, lpcharacter: Pstr, nlength: UInt, dwreadcoord: Coord, lpnumberofcharsread: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readConsoleOutputCharacterW(hconsoleoutput: Handle, lpcharacter: Pwstr, nlength: UInt, dwreadcoord: Coord, lpnumberofcharsread: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readConsoleOutputW(hconsoleoutput: Handle, lpbuffer: MutPtr<CharInfo>, dwbuffersize: Coord, dwbuffercoord: Coord, lpreadregion: MutPtr<SmallRect>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readConsoleW(hconsoleinput: Handle, lpbuffer: MutPtr<CVoid>, nnumberofcharstoread: UInt, lpnumberofcharsread: MutPtr<UInt>, pinputcontrol: ConstPtr<ConsoleReadconsoleControl>): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleReadConsoleW(hconsoleinput.rawAddress.toString(), lpbuffer.rawAddress.toString(), nnumberofcharstoread.toInt(), lpnumberofcharsread.rawAddress.toString(), pinputcontrol.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resizePseudoConsole(hpc: Hpcon, size: Coord): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scrollConsoleScreenBufferA(hconsoleoutput: Handle, lpscrollrectangle: ConstPtr<SmallRect>, lpcliprectangle: ConstPtr<SmallRect>, dwdestinationorigin: Coord, lpfill: ConstPtr<CharInfo>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scrollConsoleScreenBufferW(hconsoleoutput: Handle, lpscrollrectangle: ConstPtr<SmallRect>, lpcliprectangle: ConstPtr<SmallRect>, dwdestinationorigin: Coord, lpfill: ConstPtr<CharInfo>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleActiveScreenBuffer(hconsoleoutput: Handle): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleSetConsoleActiveScreenBuffer(hconsoleoutput.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleCP(wcodepageid: UInt): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleSetConsoleCP(wcodepageid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleCtrlHandler(handlerroutine: PhandlerRoutine, add: Bool): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleSetConsoleCtrlHandler(0L.toString(), add) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleCursorInfo(hconsoleoutput: Handle, lpconsolecursorinfo: ConstPtr<ConsoleCursorInfo>): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleSetConsoleCursorInfo(hconsoleoutput.rawAddress.toString(), lpconsolecursorinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleCursorPosition(hconsoleoutput: Handle, dwcursorposition: Coord): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleDisplayMode(hconsoleoutput: Handle, dwflags: UInt, lpnewscreenbufferdimensions: MutPtr<Coord>): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleSetConsoleDisplayMode(hconsoleoutput.rawAddress.toString(), dwflags.toInt(), lpnewscreenbufferdimensions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleHistoryInfo(lpconsolehistoryinfo: ConstPtr<ConsoleHistoryInfo>): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleSetConsoleHistoryInfo(lpconsolehistoryinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleMode(hconsolehandle: Handle, dwmode: ConsoleMode): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleSetConsoleMode(hconsolehandle.rawAddress.toString(), dwmode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleNumberOfCommandsA(number: UInt, exename: Pcstr): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleSetConsoleNumberOfCommandsA(number.toInt(), exename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleNumberOfCommandsW(number: UInt, exename: Pcwstr): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleSetConsoleNumberOfCommandsW(number.toInt(), exename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleOutputCP(wcodepageid: UInt): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleSetConsoleOutputCP(wcodepageid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleScreenBufferInfoEx(hconsoleoutput: Handle, lpconsolescreenbufferinfoex: ConstPtr<ConsoleScreenBufferInfoex>): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleSetConsoleScreenBufferInfoEx(hconsoleoutput.rawAddress.toString(), lpconsolescreenbufferinfoex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleScreenBufferSize(hconsoleoutput: Handle, dwsize: Coord): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleTextAttribute(hconsoleoutput: Handle, wattributes: ConsoleCharacterAttributes): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleSetConsoleTextAttribute(hconsoleoutput.rawAddress.toString(), wattributes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleTitleA(lpconsoletitle: Pcstr): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleSetConsoleTitleA(lpconsoletitle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleTitleW(lpconsoletitle: Pcwstr): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleSetConsoleTitleW(lpconsoletitle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleWindowInfo(hconsoleoutput: Handle, babsolute: Bool, lpconsolewindow: ConstPtr<SmallRect>): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleSetConsoleWindowInfo(hconsoleoutput.rawAddress.toString(), babsolute, lpconsolewindow.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCurrentConsoleFontEx(hconsoleoutput: Handle, bmaximumwindow: Bool, lpconsolecurrentfontex: ConstPtr<ConsoleFontInfoex>): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleSetCurrentConsoleFontEx(hconsoleoutput.rawAddress.toString(), bmaximumwindow, lpconsolecurrentfontex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setStdHandle(nstdhandle: StdHandle, hhandle: Handle): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleSetStdHandle(nstdhandle.toInt(), hhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setStdHandleEx(nstdhandle: StdHandle, hhandle: Handle, phprevvalue: MutPtr<Handle>): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleSetStdHandleEx(nstdhandle.toInt(), hhandle.rawAddress.toString(), phprevvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeConsoleA(hconsoleoutput: Handle, lpbuffer: Pcstr, nnumberofcharstowrite: UInt, lpnumberofcharswritten: MutPtr<UInt>, lpreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleWriteConsoleA(hconsoleoutput.rawAddress.toString(), lpbuffer.rawAddress.toString(), nnumberofcharstowrite.toInt(), lpnumberofcharswritten.rawAddress.toString(), lpreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeConsoleInputA(hconsoleinput: Handle, lpbuffer: ConstPtr<InputRecord>, nlength: UInt, lpnumberofeventswritten: MutPtr<UInt>): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleWriteConsoleInputA(hconsoleinput.rawAddress.toString(), lpbuffer.rawAddress.toString(), nlength.toInt(), lpnumberofeventswritten.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeConsoleInputW(hconsoleinput: Handle, lpbuffer: ConstPtr<InputRecord>, nlength: UInt, lpnumberofeventswritten: MutPtr<UInt>): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleWriteConsoleInputW(hconsoleinput.rawAddress.toString(), lpbuffer.rawAddress.toString(), nlength.toInt(), lpnumberofeventswritten.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeConsoleOutputA(hconsoleoutput: Handle, lpbuffer: ConstPtr<CharInfo>, dwbuffersize: Coord, dwbuffercoord: Coord, lpwriteregion: MutPtr<SmallRect>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeConsoleOutputAttribute(hconsoleoutput: Handle, lpattribute: ConstPtr<UShort>, nlength: UInt, dwwritecoord: Coord, lpnumberofattrswritten: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeConsoleOutputCharacterA(hconsoleoutput: Handle, lpcharacter: Pcstr, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeConsoleOutputCharacterW(hconsoleoutput: Handle, lpcharacter: Pcwstr, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeConsoleOutputW(hconsoleoutput: Handle, lpbuffer: ConstPtr<CharInfo>, dwbuffersize: Coord, dwbuffercoord: Coord, lpwriteregion: MutPtr<SmallRect>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeConsoleW(hconsoleoutput: Handle, lpbuffer: Pcwstr, nnumberofcharstowrite: UInt, lpnumberofcharswritten: MutPtr<UInt>, lpreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemConsoleNapiAvailable) wasmWindowssysWindowsWin32SystemConsoleWriteConsoleW(hconsoleoutput.rawAddress.toString(), lpbuffer.rawAddress.toString(), nnumberofcharstowrite.toInt(), lpnumberofcharswritten.rawAddress.toString(), lpreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
