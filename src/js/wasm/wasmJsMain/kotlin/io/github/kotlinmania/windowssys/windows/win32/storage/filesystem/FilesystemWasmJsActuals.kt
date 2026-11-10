@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.io.LpoverlappedCompletionRoutine

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32StorageFilesystemNapiAddon(): Boolean

private val _windowsWin32StorageFilesystemNapiAvailable: Boolean = _initWindowsWin32StorageFilesystemNapiAddon()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_addLogContainer(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_addLogContainer(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_addLogContainerSet(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_addLogContainerSet(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_addUsersToEncryptedFile(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_addUsersToEncryptedFile(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_advanceLogBase(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_advanceLogBase(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_alignReservedLog(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_alignReservedLog(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_allocReservedLog(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_allocReservedLog(p0: String, p1: Int, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_areFileApisANSI()")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_areFileApisANSI(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_areShortNamesEnabled(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_areShortNamesEnabled(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_backupRead(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_backupRead(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_backupSeek(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_backupSeek(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_backupWrite(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_backupWrite(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_buildIoRingRegisterBuffers(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_buildIoRingRegisterBuffers(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_buildIoRingRegisterFileHandles(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_buildIoRingRegisterFileHandles(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_checkNameLegalDOS8Dot3A(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_checkNameLegalDOS8Dot3A(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_checkNameLegalDOS8Dot3W(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_checkNameLegalDOS8Dot3W(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_closeAndResetLogFile(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_closeAndResetLogFile(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_closeEncryptedFileRaw(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_closeEncryptedFileRaw(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_closeIoRing(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_closeIoRing(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_commitComplete(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_commitComplete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_commitEnlistment(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_commitEnlistment(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_commitTransaction(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_commitTransaction(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_commitTransactionAsync(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_commitTransactionAsync(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_compareFileTime(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_compareFileTime(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_copyFile2(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_copyFile2(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_copyFileA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_copyFileA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_copyFileExA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_copyFileExA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_copyFileExW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_copyFileExW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_copyFileFromAppW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_copyFileFromAppW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_copyFileTransactedA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_copyFileTransactedA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_copyFileTransactedW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_copyFileTransactedW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_copyFileW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_copyFileW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_copyLZFile(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_copyLZFile(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_createDirectoryA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_createDirectoryA(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_createDirectoryExA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_createDirectoryExA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_createDirectoryExW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_createDirectoryExW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_createDirectoryFromAppW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_createDirectoryFromAppW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_createDirectoryTransactedA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_createDirectoryTransactedA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_createDirectoryTransactedW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_createDirectoryTransactedW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_createDirectoryW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_createDirectoryW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_createEnlistment(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_createEnlistment(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_createFile2(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_createFile2(p0: String, p1: Int, p2: Int, p3: Int, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_createFile2FromAppW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_createFile2FromAppW(p0: String, p1: Int, p2: Int, p3: Int, p4: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_createFileA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_createFileA(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: Int, p6: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_createFileFromAppW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_createFileFromAppW(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: Int, p6: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_createFileTransactedA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_createFileTransactedA(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: Int, p6: String, p7: String, p8: String, p9: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_createFileTransactedW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_createFileTransactedW(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: Int, p6: String, p7: String, p8: String, p9: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_createFileW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_createFileW(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: Int, p6: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_createHardLinkA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_createHardLinkA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_createHardLinkTransactedA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_createHardLinkTransactedA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_createHardLinkTransactedW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_createHardLinkTransactedW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_createHardLinkW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_createHardLinkW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_createLogContainerScanContext(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_createLogContainerScanContext(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_createLogFile(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_createLogFile(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_createLogMarshallingArea(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_createLogMarshallingArea(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_createResourceManager(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_createResourceManager(p0: String, p1: String, p2: Int, p3: String, p4: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_createSymbolicLinkA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_createSymbolicLinkA(p0: String, p1: String, p2: Int): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_createSymbolicLinkTransactedA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_createSymbolicLinkTransactedA(p0: String, p1: String, p2: Int, p3: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_createSymbolicLinkTransactedW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_createSymbolicLinkTransactedW(p0: String, p1: String, p2: Int, p3: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_createSymbolicLinkW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_createSymbolicLinkW(p0: String, p1: String, p2: Int): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_createTapePartition(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_createTapePartition(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_createTransaction(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_createTransaction(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_createTransactionManager(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_createTransactionManager(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_decryptFileA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_decryptFileA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_decryptFileW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_decryptFileW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_defineDosDeviceA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_defineDosDeviceA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_defineDosDeviceW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_defineDosDeviceW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_deleteFileA(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_deleteFileA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_deleteFileFromAppW(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_deleteFileFromAppW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_deleteFileTransactedA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_deleteFileTransactedA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_deleteFileTransactedW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_deleteFileTransactedW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_deleteFileW(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_deleteFileW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_deleteLogByHandle(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_deleteLogByHandle(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_deleteLogFile(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_deleteLogFile(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_deleteLogMarshallingArea(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_deleteLogMarshallingArea(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_deleteVolumeMountPointA(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_deleteVolumeMountPointA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_deleteVolumeMountPointW(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_deleteVolumeMountPointW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_deregisterManageableLogClient(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_deregisterManageableLogClient(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_duplicateEncryptionInfoFile(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_duplicateEncryptionInfoFile(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_encryptFileA(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_encryptFileA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_encryptFileW(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_encryptFileW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_encryptionDisable(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_encryptionDisable(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_eraseTape(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_eraseTape(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_fileEncryptionStatusA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_fileEncryptionStatusA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_fileEncryptionStatusW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_fileEncryptionStatusW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_fileTimeToLocalFileTime(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_fileTimeToLocalFileTime(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_findClose(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_findClose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_findCloseChangeNotification(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_findCloseChangeNotification(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_findFirstChangeNotificationA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_findFirstChangeNotificationA(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_findFirstChangeNotificationW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_findFirstChangeNotificationW(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_findFirstFileA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_findFirstFileA(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_findFirstFileExA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_findFirstFileExA(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_findFirstFileExFromAppW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_findFirstFileExFromAppW(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_findFirstFileExW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_findFirstFileExW(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_findFirstFileNameTransactedW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_findFirstFileNameTransactedW(p0: String, p1: Int, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_findFirstFileNameW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_findFirstFileNameW(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_findFirstFileTransactedA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_findFirstFileTransactedA(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_findFirstFileTransactedW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_findFirstFileTransactedW(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_findFirstFileW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_findFirstFileW(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_findFirstStreamTransactedW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_findFirstStreamTransactedW(p0: String, p1: Int, p2: String, p3: Int, p4: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_findFirstStreamW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_findFirstStreamW(p0: String, p1: Int, p2: String, p3: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_findFirstVolumeA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_findFirstVolumeA(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_findFirstVolumeMountPointA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_findFirstVolumeMountPointA(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_findFirstVolumeMountPointW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_findFirstVolumeMountPointW(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_findFirstVolumeW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_findFirstVolumeW(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_findNextChangeNotification(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_findNextChangeNotification(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_findNextFileA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_findNextFileA(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_findNextFileNameW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_findNextFileNameW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_findNextFileW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_findNextFileW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_findNextStreamW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_findNextStreamW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_findNextVolumeA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_findNextVolumeA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_findNextVolumeMountPointA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_findNextVolumeMountPointA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_findNextVolumeMountPointW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_findNextVolumeMountPointW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_findNextVolumeW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_findNextVolumeW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_findVolumeClose(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_findVolumeClose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_findVolumeMountPointClose(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_findVolumeMountPointClose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_flushFileBuffers(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_flushFileBuffers(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_flushLogBuffers(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_flushLogBuffers(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_flushLogToLsn(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_flushLogToLsn(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_freeEncryptedFileMetadata(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_freeEncryptedFileMetadata(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_freeEncryptionCertificateHashList(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_freeEncryptionCertificateHashList(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_freeReservedLog(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_freeReservedLog(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getBinaryTypeA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getBinaryTypeA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getBinaryTypeW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getBinaryTypeW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getCompressedFileSizeA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getCompressedFileSizeA(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getCompressedFileSizeTransactedA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getCompressedFileSizeTransactedA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getCompressedFileSizeTransactedW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getCompressedFileSizeTransactedW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getCompressedFileSizeW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getCompressedFileSizeW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getCurrentClockTransactionManager(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getCurrentClockTransactionManager(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getDiskFreeSpaceA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getDiskFreeSpaceA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getDiskFreeSpaceExA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getDiskFreeSpaceExA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getDiskFreeSpaceExW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getDiskFreeSpaceExW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getDiskFreeSpaceW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getDiskFreeSpaceW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getDiskSpaceInformationA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getDiskSpaceInformationA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getDiskSpaceInformationW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getDiskSpaceInformationW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getDriveTypeA(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getDriveTypeA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getDriveTypeW(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getDriveTypeW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getEncryptedFileMetadata(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getEncryptedFileMetadata(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getEnlistmentId(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getEnlistmentId(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getEnlistmentRecoveryInformation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getEnlistmentRecoveryInformation(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getExpandedNameA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getExpandedNameA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getExpandedNameW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getExpandedNameW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getFileAttributesA(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getFileAttributesA(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getFileAttributesExA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getFileAttributesExA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getFileAttributesExFromAppW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getFileAttributesExFromAppW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getFileAttributesExW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getFileAttributesExW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getFileAttributesTransactedA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getFileAttributesTransactedA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getFileAttributesTransactedW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getFileAttributesTransactedW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getFileAttributesW(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getFileAttributesW(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getFileBandwidthReservation(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getFileBandwidthReservation(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getFileInformationByHandle(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getFileInformationByHandle(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getFileInformationByHandleEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getFileInformationByHandleEx(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getFileSize(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getFileSize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getFileSizeEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getFileSizeEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getFileTime(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getFileTime(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getFileType(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getFileType(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getFileVersionInfoA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getFileVersionInfoA(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getFileVersionInfoExA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getFileVersionInfoExA(p0: Int, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getFileVersionInfoExW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getFileVersionInfoExW(p0: Int, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getFileVersionInfoSizeA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getFileVersionInfoSizeA(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getFileVersionInfoSizeExA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getFileVersionInfoSizeExA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getFileVersionInfoSizeExW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getFileVersionInfoSizeExW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getFileVersionInfoSizeW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getFileVersionInfoSizeW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getFileVersionInfoW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getFileVersionInfoW(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getFinalPathNameByHandleA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getFinalPathNameByHandleA(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getFinalPathNameByHandleW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getFinalPathNameByHandleW(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getFullPathNameA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getFullPathNameA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getFullPathNameTransactedA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getFullPathNameTransactedA(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getFullPathNameTransactedW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getFullPathNameTransactedW(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getFullPathNameW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getFullPathNameW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getIoRingInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getIoRingInfo(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getLogContainerName(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getLogContainerName(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getLogFileInformation(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getLogFileInformation(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getLogIoStatistics(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getLogIoStatistics(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getLogReservationInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getLogReservationInfo(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getLogicalDriveStringsA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getLogicalDriveStringsA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getLogicalDriveStringsW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getLogicalDriveStringsW(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getLogicalDrives()")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getLogicalDrives(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getLongPathNameA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getLongPathNameA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getLongPathNameTransactedA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getLongPathNameTransactedA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getLongPathNameTransactedW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getLongPathNameTransactedW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getLongPathNameW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getLongPathNameW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getNextLogArchiveExtent(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getNextLogArchiveExtent(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getNotificationResourceManager(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getNotificationResourceManager(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getNotificationResourceManagerAsync(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getNotificationResourceManagerAsync(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getShortPathNameA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getShortPathNameA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getShortPathNameW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getShortPathNameW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getTapeParameters(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getTapeParameters(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getTapePosition(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getTapePosition(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getTapeStatus(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getTapeStatus(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getTempFileNameA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getTempFileNameA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getTempFileNameW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getTempFileNameW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getTempPath2A(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getTempPath2A(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getTempPath2W(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getTempPath2W(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getTempPathA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getTempPathA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getTempPathW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getTempPathW(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getTransactionId(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getTransactionId(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getTransactionInformation(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getTransactionInformation(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getTransactionManagerId(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getTransactionManagerId(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getVolumeInformationA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getVolumeInformationA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getVolumeInformationByHandleW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getVolumeInformationByHandleW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getVolumeInformationW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getVolumeInformationW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getVolumeNameForVolumeMountPointA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getVolumeNameForVolumeMountPointA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getVolumeNameForVolumeMountPointW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getVolumeNameForVolumeMountPointW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getVolumePathNameA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getVolumePathNameA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getVolumePathNameW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getVolumePathNameW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getVolumePathNamesForVolumeNameA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getVolumePathNamesForVolumeNameA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_getVolumePathNamesForVolumeNameW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_getVolumePathNamesForVolumeNameW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_handleLogFull(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_handleLogFull(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_installLogPolicy(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_installLogPolicy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_isIoRingOpSupported(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_isIoRingOpSupported(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_lZClose(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_lZClose(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_lZCopy(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_lZCopy(p0: Int, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_lZDone()")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_lZDone()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_lZInit(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_lZInit(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_lZOpenFileA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_lZOpenFileA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_lZOpenFileW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_lZOpenFileW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_lZRead(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_lZRead(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_lZSeek(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_lZSeek(p0: Int, p1: Int, p2: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_lZStart()")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_lZStart(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_localFileTimeToFileTime(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_localFileTimeToFileTime(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_lockFile(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_lockFile(p0: String, p1: Int, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_lockFileEx(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_lockFileEx(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_logTailAdvanceFailure(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_logTailAdvanceFailure(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_lsnBlockOffset(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_lsnBlockOffset(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_lsnContainer(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_lsnContainer(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_lsnEqual(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_lsnEqual(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_lsnGreater(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_lsnGreater(p0: String, p1: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_lsnInvalid(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_lsnInvalid(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_lsnLess(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_lsnLess(p0: String, p1: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_lsnNull(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_lsnNull(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_lsnRecordSequence(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_lsnRecordSequence(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_moveFileA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_moveFileA(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_moveFileExA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_moveFileExA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_moveFileExW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_moveFileExW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_moveFileFromAppW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_moveFileFromAppW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_moveFileTransactedA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_moveFileTransactedA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_moveFileTransactedW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_moveFileTransactedW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_moveFileW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_moveFileW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_moveFileWithProgressA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_moveFileWithProgressA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_moveFileWithProgressW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_moveFileWithProgressW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_netConnectionEnum(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_netConnectionEnum(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_netFileClose(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_netFileClose(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_netFileEnum(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_netFileEnum(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_netFileGetInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_netFileGetInfo(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_netServerAliasAdd(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_netServerAliasAdd(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_netServerAliasDel(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_netServerAliasDel(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_netServerAliasEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_netServerAliasEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_netSessionDel(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_netSessionDel(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_netSessionEnum(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_netSessionEnum(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_netSessionGetInfo(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_netSessionGetInfo(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_netShareAdd(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_netShareAdd(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_netShareCheck(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_netShareCheck(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_netShareDel(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_netShareDel(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_netShareDelEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_netShareDelEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_netShareDelSticky(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_netShareDelSticky(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_netShareEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_netShareEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_netShareEnumSticky(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_netShareEnumSticky(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_netShareGetInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_netShareGetInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_netShareSetInfo(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_netShareSetInfo(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_netStatisticsGet(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_netStatisticsGet(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_openEncryptedFileRawA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_openEncryptedFileRawA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_openEncryptedFileRawW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_openEncryptedFileRawW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_openEnlistment(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_openEnlistment(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_openFile(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_openFile(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_openFileById(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_openFileById(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_openResourceManager(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_openResourceManager(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_openTransaction(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_openTransaction(p0: Int, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_openTransactionManager(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_openTransactionManager(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_openTransactionManagerById(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_openTransactionManagerById(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_popIoRingCompletion(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_popIoRingCompletion(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_prePrepareComplete(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_prePrepareComplete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_prePrepareEnlistment(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_prePrepareEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_prepareComplete(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_prepareComplete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_prepareEnlistment(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_prepareEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_prepareLogArchive(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_prepareLogArchive(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: String, p11: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_prepareTape(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_prepareTape(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_queryDosDeviceA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_queryDosDeviceA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_queryDosDeviceW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_queryDosDeviceW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_queryIoRingCapabilities(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_queryIoRingCapabilities(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_queryLogPolicy(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_queryLogPolicy(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_queryRecoveryAgentsOnEncryptedFile(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_queryRecoveryAgentsOnEncryptedFile(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_queryUsersOnEncryptedFile(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_queryUsersOnEncryptedFile(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_reOpenFile(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_reOpenFile(p0: String, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_readDirectoryChangesExW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_readDirectoryChangesExW(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_readDirectoryChangesW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_readDirectoryChangesW(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_readEncryptedFileRaw(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_readEncryptedFileRaw(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_readFile(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_readFile(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_readFileEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_readFileEx(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_readFileScatter(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_readFileScatter(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_readLogArchiveMetadata(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_readLogArchiveMetadata(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_readLogNotification(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_readLogNotification(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_readLogRecord(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_readLogRecord(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_readLogRestartArea(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_readLogRestartArea(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_readNextLogRecord(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_readNextLogRecord(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_readOnlyEnlistment(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_readOnlyEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_readPreviousLogRestartArea(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_readPreviousLogRestartArea(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_recoverEnlistment(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_recoverEnlistment(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_recoverResourceManager(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_recoverResourceManager(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_recoverTransactionManager(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_recoverTransactionManager(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_registerForLogWriteNotification(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_registerForLogWriteNotification(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_registerManageableLogClient(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_registerManageableLogClient(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_removeDirectoryA(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_removeDirectoryA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_removeDirectoryFromAppW(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_removeDirectoryFromAppW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_removeDirectoryTransactedA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_removeDirectoryTransactedA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_removeDirectoryTransactedW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_removeDirectoryTransactedW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_removeDirectoryW(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_removeDirectoryW(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_removeLogContainer(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_removeLogContainer(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_removeLogContainerSet(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_removeLogContainerSet(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_removeLogPolicy(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_removeLogPolicy(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_removeUsersFromEncryptedFile(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_removeUsersFromEncryptedFile(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_renameTransactionManager(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_renameTransactionManager(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_replaceFileA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_replaceFileA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_replaceFileFromAppW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_replaceFileFromAppW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_replaceFileW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_replaceFileW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_reserveAndAppendLog(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_reserveAndAppendLog(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String, p7: Int, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_reserveAndAppendLogAligned(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_reserveAndAppendLogAligned(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: Int, p7: String, p8: Int, p9: String, p10: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_rollbackComplete(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_rollbackComplete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_rollbackEnlistment(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_rollbackEnlistment(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_rollbackTransaction(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_rollbackTransaction(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_rollbackTransactionAsync(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_rollbackTransactionAsync(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_rollforwardTransactionManager(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_rollforwardTransactionManager(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_scanLogContainers(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_scanLogContainers(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_searchPathA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_searchPathA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_searchPathW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_searchPathW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setEncryptedFileMetadata(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setEncryptedFileMetadata(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setEndOfFile(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setEndOfFile(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setEndOfLog(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setEndOfLog(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setEnlistmentRecoveryInformation(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setEnlistmentRecoveryInformation(p0: String, p1: Int, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setFileApisToANSI()")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setFileApisToANSI()

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setFileApisToOEM()")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setFileApisToOEM()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setFileAttributesA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setFileAttributesA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setFileAttributesFromAppW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setFileAttributesFromAppW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setFileAttributesTransactedA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setFileAttributesTransactedA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setFileAttributesTransactedW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setFileAttributesTransactedW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setFileAttributesW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setFileAttributesW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setFileBandwidthReservation(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setFileBandwidthReservation(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setFileCompletionNotificationModes(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setFileCompletionNotificationModes(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setFileInformationByHandle(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setFileInformationByHandle(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setFileIoOverlappedRange(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setFileIoOverlappedRange(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setFilePointer(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setFilePointer(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setFilePointerEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setFilePointerEx(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setFileShortNameA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setFileShortNameA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setFileShortNameW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setFileShortNameW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setFileTime(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setFileTime(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setFileValidData(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setFileValidData(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setIoRingCompletionEvent(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setIoRingCompletionEvent(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setLogArchiveMode(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setLogArchiveMode(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setLogArchiveTail(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setLogArchiveTail(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setLogFileSizeWithPolicy(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setLogFileSizeWithPolicy(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setResourceManagerCompletionPort(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setResourceManagerCompletionPort(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setSearchPathMode(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setSearchPathMode(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setTapeParameters(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setTapeParameters(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setTapePosition(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setTapePosition(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setTransactionInformation(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setTransactionInformation(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setUserFileEncryptionKey(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setUserFileEncryptionKey(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setUserFileEncryptionKeyEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setUserFileEncryptionKeyEx(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setVolumeLabelA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setVolumeLabelA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setVolumeLabelW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setVolumeLabelW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setVolumeMountPointA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setVolumeMountPointA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_setVolumeMountPointW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_setVolumeMountPointW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_singlePhaseReject(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_singlePhaseReject(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_submitIoRing(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_submitIoRing(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_terminateLogArchive(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_terminateLogArchive(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_terminateReadLog(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_terminateReadLog(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_truncateLog(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_truncateLog(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_txfGetThreadMiniVersionForCreate(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_txfGetThreadMiniVersionForCreate(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_txfLogDestroyReadContext(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_txfLogDestroyReadContext(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_txfLogReadRecords(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_txfLogReadRecords(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_txfLogRecordGetFileName(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_txfLogRecordGetFileName(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_txfLogRecordGetGenericType(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_txfLogRecordGetGenericType(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_txfReadMetadataInfo(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_txfReadMetadataInfo(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_txfSetThreadMiniVersionForCreate(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_txfSetThreadMiniVersionForCreate(p0: Int)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_unlockFile(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_unlockFile(p0: String, p1: Int, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_unlockFileEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_unlockFileEx(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_validateLog(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_validateLog(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_verFindFileA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_verFindFileA(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_verFindFileW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_verFindFileW(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_verInstallFileA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_verInstallFileA(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_verInstallFileW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_verInstallFileW(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_verLanguageNameA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_verLanguageNameA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_verLanguageNameW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_verLanguageNameW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_verQueryValueA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_verQueryValueA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_verQueryValueW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_verQueryValueW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_wofEnumEntries(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_wofEnumEntries(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_wofFileEnumFiles(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_wofFileEnumFiles(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_wofGetDriverVersion(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_wofGetDriverVersion(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_wofIsExternalFile(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_wofIsExternalFile(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_wofSetFileDataLocation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_wofSetFileDataLocation(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_wofShouldCompressBinaries(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_wofShouldCompressBinaries(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_wofWimAddEntry(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_wofWimAddEntry(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_wofWimEnumFiles(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_wofWimEnumFiles(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_wofWimRemoveEntry(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_wofWimRemoveEntry(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_wofWimSuspendEntry(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_wofWimSuspendEntry(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_wofWimUpdateEntry(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_wofWimUpdateEntry(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_wow64DisableWow64FsRedirection(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_wow64DisableWow64FsRedirection(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_wow64EnableWow64FsRedirection(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_wow64EnableWow64FsRedirection(p0: Boolean): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_wow64RevertWow64FsRedirection(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_wow64RevertWow64FsRedirection(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_writeEncryptedFileRaw(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_writeEncryptedFileRaw(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_writeFile(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_writeFile(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_writeFileEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_writeFileEx(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_writeFileGather(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_writeFileGather(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_writeLogRestartArea(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_writeLogRestartArea(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filesystem_writeTapemark(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_filesystem_writeTapemark(p0: String, p1: Int, p2: Int, p3: Int): Int

public actual fun addLogContainer(hlog: Handle, pcbcontainer: COpaquePointer?, pwszcontainerpath: Pcwstr, preserved: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_addLogContainer((hlog?.value ?: 0L).toString(), (pcbcontainer?.value ?: 0L).toString(), (pwszcontainerpath?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addLogContainerSet(hlog: Handle, ccontainer: UShort, pcbcontainer: COpaquePointer?, rgwszcontainerpath: COpaquePointer?, preserved: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_addLogContainerSet((hlog?.value ?: 0L).toString(), ccontainer.toInt(), (pcbcontainer?.value ?: 0L).toString(), (rgwszcontainerpath?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addUsersToEncryptedFile(lpfilename: Pcwstr, pencryptioncertificates: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_addUsersToEncryptedFile((lpfilename?.value ?: 0L).toString(), (pencryptioncertificates?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun advanceLogBase(pvmarshal: COpaquePointer?, plsnbase: COpaquePointer?, fflags: UInt, poverlapped: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_advanceLogBase((pvmarshal?.value ?: 0L).toString(), (plsnbase?.value ?: 0L).toString(), fflags.toInt(), (poverlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alignReservedLog(pvmarshal: COpaquePointer?, creservedrecords: UInt, rgcbreservation: COpaquePointer?, pcbalignreservation: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_alignReservedLog((pvmarshal?.value ?: 0L).toString(), creservedrecords.toInt(), (rgcbreservation?.value ?: 0L).toString(), (pcbalignreservation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allocReservedLog(pvmarshal: COpaquePointer?, creservedrecords: UInt, pcbadjustment: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_allocReservedLog((pvmarshal?.value ?: 0L).toString(), creservedrecords.toInt(), (pcbadjustment?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun areFileApisANSI(): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_areFileApisANSI() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun areShortNamesEnabled(handle: Handle, enabled: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_areShortNamesEnabled((handle?.value ?: 0L).toString(), (enabled?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backupRead(hfile: Handle, lpbuffer: COpaquePointer?, nnumberofbytestoread: UInt, lpnumberofbytesread: COpaquePointer?, babort: Bool, bprocesssecurity: Bool, lpcontext: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_backupRead((hfile?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), nnumberofbytestoread.toInt(), (lpnumberofbytesread?.value ?: 0L).toString(), babort, bprocesssecurity, (lpcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backupSeek(hfile: Handle, dwlowbytestoseek: UInt, dwhighbytestoseek: UInt, lpdwlowbyteseeked: COpaquePointer?, lpdwhighbyteseeked: COpaquePointer?, lpcontext: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_backupSeek((hfile?.value ?: 0L).toString(), dwlowbytestoseek.toInt(), dwhighbytestoseek.toInt(), (lpdwlowbyteseeked?.value ?: 0L).toString(), (lpdwhighbyteseeked?.value ?: 0L).toString(), (lpcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backupWrite(hfile: Handle, lpbuffer: COpaquePointer?, nnumberofbytestowrite: UInt, lpnumberofbyteswritten: COpaquePointer?, babort: Bool, bprocesssecurity: Bool, lpcontext: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_backupWrite((hfile?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), nnumberofbytestowrite.toInt(), (lpnumberofbyteswritten?.value ?: 0L).toString(), babort, bprocesssecurity, (lpcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildIoRingCancelRequest(ioring: Hioring, file: IoringHandleRef, optocancel: ULong, userdata: ULong): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildIoRingFlushFile(ioring: Hioring, fileref: IoringHandleRef, flushmode: FileFlushMode, userdata: ULong, sqeflags: IoringSqeFlags): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildIoRingReadFile(ioring: Hioring, fileref: IoringHandleRef, dataref: IoringBufferRef, numberofbytestoread: UInt, fileoffset: ULong, userdata: ULong, sqeflags: IoringSqeFlags): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildIoRingRegisterBuffers(ioring: Hioring, count: UInt, buffers: COpaquePointer?, userdata: ULong): Hresult =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_buildIoRingRegisterBuffers((ioring?.value ?: 0L).toString(), count.toInt(), (buffers?.value ?: 0L).toString(), userdata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildIoRingRegisterFileHandles(ioring: Hioring, count: UInt, handles: COpaquePointer?, userdata: ULong): Hresult =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_buildIoRingRegisterFileHandles((ioring?.value ?: 0L).toString(), count.toInt(), (handles?.value ?: 0L).toString(), userdata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildIoRingWriteFile(ioring: Hioring, fileref: IoringHandleRef, bufferref: IoringBufferRef, numberofbytestowrite: UInt, fileoffset: ULong, writeflags: FileWriteFlags, userdata: ULong, sqeflags: IoringSqeFlags): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkNameLegalDOS8Dot3A(lpname: Pcstr, lpoemname: Pstr, oemnamesize: UInt, pbnamecontainsspaces: COpaquePointer?, pbnamelegal: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_checkNameLegalDOS8Dot3A((lpname?.value ?: 0L).toString(), (lpoemname?.value ?: 0L).toString(), oemnamesize.toInt(), (pbnamecontainsspaces?.value ?: 0L).toString(), (pbnamelegal?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkNameLegalDOS8Dot3W(lpname: Pcwstr, lpoemname: Pstr, oemnamesize: UInt, pbnamecontainsspaces: COpaquePointer?, pbnamelegal: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_checkNameLegalDOS8Dot3W((lpname?.value ?: 0L).toString(), (lpoemname?.value ?: 0L).toString(), oemnamesize.toInt(), (pbnamecontainsspaces?.value ?: 0L).toString(), (pbnamelegal?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeAndResetLogFile(hlog: Handle): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_closeAndResetLogFile((hlog?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeEncryptedFileRaw(pvcontext: COpaquePointer?) {
    if (_windowsWin32StorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_win32_storage_filesystem_closeEncryptedFileRaw((pvcontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closeIoRing(ioring: Hioring): Hresult =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_closeIoRing((ioring?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commitComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_commitComplete((enlistmenthandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commitEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_commitEnlistment((enlistmenthandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commitTransaction(transactionhandle: Handle): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_commitTransaction((transactionhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commitTransactionAsync(transactionhandle: Handle): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_commitTransactionAsync((transactionhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compareFileTime(lpfiletime1: COpaquePointer?, lpfiletime2: COpaquePointer?): Int =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_compareFileTime((lpfiletime1?.value ?: 0L).toString(), (lpfiletime2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyFile2(pwszexistingfilename: Pcwstr, pwsznewfilename: Pcwstr, pextendedparameters: COpaquePointer?): Hresult =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_copyFile2((pwszexistingfilename?.value ?: 0L).toString(), (pwsznewfilename?.value ?: 0L).toString(), (pextendedparameters?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyFileA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, bfailifexists: Bool): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_copyFileA((lpexistingfilename?.value ?: 0L).toString(), (lpnewfilename?.value ?: 0L).toString(), bfailifexists) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyFileExA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: COpaquePointer?, pbcancel: COpaquePointer?, dwcopyflags: CopyfileFlags): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_copyFileExA((lpexistingfilename?.value ?: 0L).toString(), (lpnewfilename?.value ?: 0L).toString(), 0L.toString(), (lpdata?.value ?: 0L).toString(), (pbcancel?.value ?: 0L).toString(), dwcopyflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyFileExW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: COpaquePointer?, pbcancel: COpaquePointer?, dwcopyflags: CopyfileFlags): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_copyFileExW((lpexistingfilename?.value ?: 0L).toString(), (lpnewfilename?.value ?: 0L).toString(), 0L.toString(), (lpdata?.value ?: 0L).toString(), (pbcancel?.value ?: 0L).toString(), dwcopyflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyFileFromAppW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, bfailifexists: Bool): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_copyFileFromAppW((lpexistingfilename?.value ?: 0L).toString(), (lpnewfilename?.value ?: 0L).toString(), bfailifexists) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyFileTransactedA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: COpaquePointer?, pbcancel: COpaquePointer?, dwcopyflags: UInt, htransaction: Handle): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_copyFileTransactedA((lpexistingfilename?.value ?: 0L).toString(), (lpnewfilename?.value ?: 0L).toString(), 0L.toString(), (lpdata?.value ?: 0L).toString(), (pbcancel?.value ?: 0L).toString(), dwcopyflags.toInt(), (htransaction?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyFileTransactedW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: COpaquePointer?, pbcancel: COpaquePointer?, dwcopyflags: UInt, htransaction: Handle): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_copyFileTransactedW((lpexistingfilename?.value ?: 0L).toString(), (lpnewfilename?.value ?: 0L).toString(), 0L.toString(), (lpdata?.value ?: 0L).toString(), (pbcancel?.value ?: 0L).toString(), dwcopyflags.toInt(), (htransaction?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyFileW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, bfailifexists: Bool): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_copyFileW((lpexistingfilename?.value ?: 0L).toString(), (lpnewfilename?.value ?: 0L).toString(), bfailifexists) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyLZFile(hfsource: Int, hfdest: Int): Int =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_copyLZFile(hfsource, hfdest) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDirectoryA(lppathname: Pcstr, lpsecurityattributes: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_createDirectoryA((lppathname?.value ?: 0L).toString(), (lpsecurityattributes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDirectoryExA(lptemplatedirectory: Pcstr, lpnewdirectory: Pcstr, lpsecurityattributes: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_createDirectoryExA((lptemplatedirectory?.value ?: 0L).toString(), (lpnewdirectory?.value ?: 0L).toString(), (lpsecurityattributes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDirectoryExW(lptemplatedirectory: Pcwstr, lpnewdirectory: Pcwstr, lpsecurityattributes: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_createDirectoryExW((lptemplatedirectory?.value ?: 0L).toString(), (lpnewdirectory?.value ?: 0L).toString(), (lpsecurityattributes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDirectoryFromAppW(lppathname: Pcwstr, lpsecurityattributes: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_createDirectoryFromAppW((lppathname?.value ?: 0L).toString(), (lpsecurityattributes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDirectoryTransactedA(lptemplatedirectory: Pcstr, lpnewdirectory: Pcstr, lpsecurityattributes: COpaquePointer?, htransaction: Handle): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_createDirectoryTransactedA((lptemplatedirectory?.value ?: 0L).toString(), (lpnewdirectory?.value ?: 0L).toString(), (lpsecurityattributes?.value ?: 0L).toString(), (htransaction?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDirectoryTransactedW(lptemplatedirectory: Pcwstr, lpnewdirectory: Pcwstr, lpsecurityattributes: COpaquePointer?, htransaction: Handle): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_createDirectoryTransactedW((lptemplatedirectory?.value ?: 0L).toString(), (lpnewdirectory?.value ?: 0L).toString(), (lpsecurityattributes?.value ?: 0L).toString(), (htransaction?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDirectoryW(lppathname: Pcwstr, lpsecurityattributes: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_createDirectoryW((lppathname?.value ?: 0L).toString(), (lpsecurityattributes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEnlistment(lpenlistmentattributes: COpaquePointer?, resourcemanagerhandle: Handle, transactionhandle: Handle, notificationmask: UInt, createoptions: UInt, enlistmentkey: COpaquePointer?): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_createEnlistment((lpenlistmentattributes?.value ?: 0L).toString(), (resourcemanagerhandle?.value ?: 0L).toString(), (transactionhandle?.value ?: 0L).toString(), notificationmask.toInt(), createoptions.toInt(), (enlistmentkey?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFile2(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, dwcreationdisposition: FileCreationDisposition, pcreateexparams: COpaquePointer?): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_createFile2((lpfilename?.value ?: 0L).toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), dwcreationdisposition.toInt(), (pcreateexparams?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFile2FromAppW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationdisposition: UInt, pcreateexparams: COpaquePointer?): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_createFile2FromAppW((lpfilename?.value ?: 0L).toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), dwcreationdisposition.toInt(), (pcreateexparams?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileA(lpfilename: Pcstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: COpaquePointer?, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_createFileA((lpfilename?.value ?: 0L).toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), (lpsecurityattributes?.value ?: 0L).toString(), dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), (htemplatefile?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileFromAppW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: COpaquePointer?, dwcreationdisposition: UInt, dwflagsandattributes: UInt, htemplatefile: Handle): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_createFileFromAppW((lpfilename?.value ?: 0L).toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), (lpsecurityattributes?.value ?: 0L).toString(), dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), (htemplatefile?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileTransactedA(lpfilename: Pcstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: COpaquePointer?, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle, htransaction: Handle, pusminiversion: COpaquePointer?, lpextendedparameter: COpaquePointer?): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_createFileTransactedA((lpfilename?.value ?: 0L).toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), (lpsecurityattributes?.value ?: 0L).toString(), dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), (htemplatefile?.value ?: 0L).toString(), (htransaction?.value ?: 0L).toString(), (pusminiversion?.value ?: 0L).toString(), (lpextendedparameter?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileTransactedW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: COpaquePointer?, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle, htransaction: Handle, pusminiversion: COpaquePointer?, lpextendedparameter: COpaquePointer?): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_createFileTransactedW((lpfilename?.value ?: 0L).toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), (lpsecurityattributes?.value ?: 0L).toString(), dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), (htemplatefile?.value ?: 0L).toString(), (htransaction?.value ?: 0L).toString(), (pusminiversion?.value ?: 0L).toString(), (lpextendedparameter?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: COpaquePointer?, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_createFileW((lpfilename?.value ?: 0L).toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), (lpsecurityattributes?.value ?: 0L).toString(), dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), (htemplatefile?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createHardLinkA(lpfilename: Pcstr, lpexistingfilename: Pcstr, lpsecurityattributes: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_createHardLinkA((lpfilename?.value ?: 0L).toString(), (lpexistingfilename?.value ?: 0L).toString(), (lpsecurityattributes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createHardLinkTransactedA(lpfilename: Pcstr, lpexistingfilename: Pcstr, lpsecurityattributes: COpaquePointer?, htransaction: Handle): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_createHardLinkTransactedA((lpfilename?.value ?: 0L).toString(), (lpexistingfilename?.value ?: 0L).toString(), (lpsecurityattributes?.value ?: 0L).toString(), (htransaction?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createHardLinkTransactedW(lpfilename: Pcwstr, lpexistingfilename: Pcwstr, lpsecurityattributes: COpaquePointer?, htransaction: Handle): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_createHardLinkTransactedW((lpfilename?.value ?: 0L).toString(), (lpexistingfilename?.value ?: 0L).toString(), (lpsecurityattributes?.value ?: 0L).toString(), (htransaction?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createHardLinkW(lpfilename: Pcwstr, lpexistingfilename: Pcwstr, lpsecurityattributes: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_createHardLinkW((lpfilename?.value ?: 0L).toString(), (lpexistingfilename?.value ?: 0L).toString(), (lpsecurityattributes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIoRing(ioringversion: IoringVersion, flags: IoringCreateFlags, submissionqueuesize: UInt, completionqueuesize: UInt, h: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createLogContainerScanContext(hlog: Handle, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: COpaquePointer?, poverlapped: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_createLogContainerScanContext((hlog?.value ?: 0L).toString(), cfromcontainer.toInt(), ccontainers.toInt(), escanmode.toInt(), (pcxscan?.value ?: 0L).toString(), (poverlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createLogFile(pszlogfilename: Pcwstr, fdesiredaccess: UInt, dwsharemode: FileShareMode, psalogfile: COpaquePointer?, fcreatedisposition: FileCreationDisposition, fflagsandattributes: FileFlagsAndAttributes): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_createLogFile((pszlogfilename?.value ?: 0L).toString(), fdesiredaccess.toInt(), dwsharemode.toInt(), (psalogfile?.value ?: 0L).toString(), fcreatedisposition.toInt(), fflagsandattributes.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createLogMarshallingArea(hlog: Handle, pfnallocbuffer: ClfsBlockAllocation, pfnfreebuffer: ClfsBlockDeallocation, pvblockalloccontext: COpaquePointer?, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshal: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_createLogMarshallingArea((hlog?.value ?: 0L).toString(), 0L.toString(), 0L.toString(), (pvblockalloccontext?.value ?: 0L).toString(), cbmarshallingbuffer.toInt(), cmaxwritebuffers.toInt(), cmaxreadbuffers.toInt(), (ppvmarshal?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createResourceManager(lpresourcemanagerattributes: COpaquePointer?, resourcemanagerid: COpaquePointer?, createoptions: UInt, tmhandle: Handle, description: Pcwstr): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_createResourceManager((lpresourcemanagerattributes?.value ?: 0L).toString(), (resourcemanagerid?.value ?: 0L).toString(), createoptions.toInt(), (tmhandle?.value ?: 0L).toString(), (description?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSymbolicLinkA(lpsymlinkfilename: Pcstr, lptargetfilename: Pcstr, dwflags: SymbolicLinkFlags): Boolean =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_createSymbolicLinkA((lpsymlinkfilename?.value ?: 0L).toString(), (lptargetfilename?.value ?: 0L).toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSymbolicLinkTransactedA(lpsymlinkfilename: Pcstr, lptargetfilename: Pcstr, dwflags: SymbolicLinkFlags, htransaction: Handle): Boolean =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_createSymbolicLinkTransactedA((lpsymlinkfilename?.value ?: 0L).toString(), (lptargetfilename?.value ?: 0L).toString(), dwflags.toInt(), (htransaction?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSymbolicLinkTransactedW(lpsymlinkfilename: Pcwstr, lptargetfilename: Pcwstr, dwflags: SymbolicLinkFlags, htransaction: Handle): Boolean =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_createSymbolicLinkTransactedW((lpsymlinkfilename?.value ?: 0L).toString(), (lptargetfilename?.value ?: 0L).toString(), dwflags.toInt(), (htransaction?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSymbolicLinkW(lpsymlinkfilename: Pcwstr, lptargetfilename: Pcwstr, dwflags: SymbolicLinkFlags): Boolean =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_createSymbolicLinkW((lpsymlinkfilename?.value ?: 0L).toString(), (lptargetfilename?.value ?: 0L).toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createTapePartition(hdevice: Handle, dwpartitionmethod: CreateTapePartitionMethod, dwcount: UInt, dwsize: UInt): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_createTapePartition((hdevice?.value ?: 0L).toString(), dwpartitionmethod.toInt(), dwcount.toInt(), dwsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createTransaction(lptransactionattributes: COpaquePointer?, uow: COpaquePointer?, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: UInt, description: Pcwstr): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_createTransaction((lptransactionattributes?.value ?: 0L).toString(), (uow?.value ?: 0L).toString(), createoptions.toInt(), isolationlevel.toInt(), isolationflags.toInt(), timeout.toInt(), (description?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createTransactionManager(lptransactionattributes: COpaquePointer?, logfilename: Pcwstr, createoptions: UInt, commitstrength: UInt): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_createTransactionManager((lptransactionattributes?.value ?: 0L).toString(), (logfilename?.value ?: 0L).toString(), createoptions.toInt(), commitstrength.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun decryptFileA(lpfilename: Pcstr, dwreserved: UInt): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_decryptFileA((lpfilename?.value ?: 0L).toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun decryptFileW(lpfilename: Pcwstr, dwreserved: UInt): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_decryptFileW((lpfilename?.value ?: 0L).toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defineDosDeviceA(dwflags: DefineDosDeviceFlags, lpdevicename: Pcstr, lptargetpath: Pcstr): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_defineDosDeviceA(dwflags.toInt(), (lpdevicename?.value ?: 0L).toString(), (lptargetpath?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defineDosDeviceW(dwflags: DefineDosDeviceFlags, lpdevicename: Pcwstr, lptargetpath: Pcwstr): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_defineDosDeviceW(dwflags.toInt(), (lpdevicename?.value ?: 0L).toString(), (lptargetpath?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteFileA(lpfilename: Pcstr): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_deleteFileA((lpfilename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteFileFromAppW(lpfilename: Pcwstr): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_deleteFileFromAppW((lpfilename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteFileTransactedA(lpfilename: Pcstr, htransaction: Handle): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_deleteFileTransactedA((lpfilename?.value ?: 0L).toString(), (htransaction?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteFileTransactedW(lpfilename: Pcwstr, htransaction: Handle): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_deleteFileTransactedW((lpfilename?.value ?: 0L).toString(), (htransaction?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteFileW(lpfilename: Pcwstr): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_deleteFileW((lpfilename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteLogByHandle(hlog: Handle): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_deleteLogByHandle((hlog?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteLogFile(pszlogfilename: Pcwstr, pvreserved: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_deleteLogFile((pszlogfilename?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteLogMarshallingArea(pvmarshal: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_deleteLogMarshallingArea((pvmarshal?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteVolumeMountPointA(lpszvolumemountpoint: Pcstr): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_deleteVolumeMountPointA((lpszvolumemountpoint?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteVolumeMountPointW(lpszvolumemountpoint: Pcwstr): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_deleteVolumeMountPointW((lpszvolumemountpoint?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deregisterManageableLogClient(hlog: Handle): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_deregisterManageableLogClient((hlog?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplicateEncryptionInfoFile(srcfilename: Pcwstr, dstfilename: Pcwstr, dwcreationdistribution: UInt, dwattributes: UInt, lpsecurityattributes: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_duplicateEncryptionInfoFile((srcfilename?.value ?: 0L).toString(), (dstfilename?.value ?: 0L).toString(), dwcreationdistribution.toInt(), dwattributes.toInt(), (lpsecurityattributes?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun encryptFileA(lpfilename: Pcstr): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_encryptFileA((lpfilename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun encryptFileW(lpfilename: Pcwstr): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_encryptFileW((lpfilename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun encryptionDisable(dirpath: Pcwstr, disable: Bool): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_encryptionDisable((dirpath?.value ?: 0L).toString(), disable) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eraseTape(hdevice: Handle, dwerasetype: EraseTapeType, bimmediate: Bool): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_eraseTape((hdevice?.value ?: 0L).toString(), dwerasetype.toInt(), bimmediate).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileEncryptionStatusA(lpfilename: Pcstr, lpstatus: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_fileEncryptionStatusA((lpfilename?.value ?: 0L).toString(), (lpstatus?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileEncryptionStatusW(lpfilename: Pcwstr, lpstatus: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_fileEncryptionStatusW((lpfilename?.value ?: 0L).toString(), (lpstatus?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileTimeToLocalFileTime(lpfiletime: COpaquePointer?, lplocalfiletime: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_fileTimeToLocalFileTime((lpfiletime?.value ?: 0L).toString(), (lplocalfiletime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findClose(hfindfile: Handle): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_findClose((hfindfile?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findCloseChangeNotification(hchangehandle: Handle): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_findCloseChangeNotification((hchangehandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstChangeNotificationA(lppathname: Pcstr, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_findFirstChangeNotificationA((lppathname?.value ?: 0L).toString(), bwatchsubtree, dwnotifyfilter.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstChangeNotificationW(lppathname: Pcwstr, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_findFirstChangeNotificationW((lppathname?.value ?: 0L).toString(), bwatchsubtree, dwnotifyfilter.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstFileA(lpfilename: Pcstr, lpfindfiledata: COpaquePointer?): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_findFirstFileA((lpfilename?.value ?: 0L).toString(), (lpfindfiledata?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstFileExA(lpfilename: Pcstr, finfolevelid: FindexInfoLevels, lpfindfiledata: COpaquePointer?, fsearchop: FindexSearchOps, lpsearchfilter: COpaquePointer?, dwadditionalflags: FindFirstExFlags): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_findFirstFileExA((lpfilename?.value ?: 0L).toString(), finfolevelid, (lpfindfiledata?.value ?: 0L).toString(), fsearchop, (lpsearchfilter?.value ?: 0L).toString(), dwadditionalflags.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstFileExFromAppW(lpfilename: Pcwstr, finfolevelid: FindexInfoLevels, lpfindfiledata: COpaquePointer?, fsearchop: FindexSearchOps, lpsearchfilter: COpaquePointer?, dwadditionalflags: UInt): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_findFirstFileExFromAppW((lpfilename?.value ?: 0L).toString(), finfolevelid, (lpfindfiledata?.value ?: 0L).toString(), fsearchop, (lpsearchfilter?.value ?: 0L).toString(), dwadditionalflags.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstFileExW(lpfilename: Pcwstr, finfolevelid: FindexInfoLevels, lpfindfiledata: COpaquePointer?, fsearchop: FindexSearchOps, lpsearchfilter: COpaquePointer?, dwadditionalflags: FindFirstExFlags): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_findFirstFileExW((lpfilename?.value ?: 0L).toString(), finfolevelid, (lpfindfiledata?.value ?: 0L).toString(), fsearchop, (lpsearchfilter?.value ?: 0L).toString(), dwadditionalflags.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstFileNameTransactedW(lpfilename: Pcwstr, dwflags: UInt, stringlength: COpaquePointer?, linkname: Pwstr, htransaction: Handle): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_findFirstFileNameTransactedW((lpfilename?.value ?: 0L).toString(), dwflags.toInt(), (stringlength?.value ?: 0L).toString(), (linkname?.value ?: 0L).toString(), (htransaction?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstFileNameW(lpfilename: Pcwstr, dwflags: UInt, stringlength: COpaquePointer?, linkname: Pwstr): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_findFirstFileNameW((lpfilename?.value ?: 0L).toString(), dwflags.toInt(), (stringlength?.value ?: 0L).toString(), (linkname?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstFileTransactedA(lpfilename: Pcstr, finfolevelid: FindexInfoLevels, lpfindfiledata: COpaquePointer?, fsearchop: FindexSearchOps, lpsearchfilter: COpaquePointer?, dwadditionalflags: UInt, htransaction: Handle): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_findFirstFileTransactedA((lpfilename?.value ?: 0L).toString(), finfolevelid, (lpfindfiledata?.value ?: 0L).toString(), fsearchop, (lpsearchfilter?.value ?: 0L).toString(), dwadditionalflags.toInt(), (htransaction?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstFileTransactedW(lpfilename: Pcwstr, finfolevelid: FindexInfoLevels, lpfindfiledata: COpaquePointer?, fsearchop: FindexSearchOps, lpsearchfilter: COpaquePointer?, dwadditionalflags: UInt, htransaction: Handle): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_findFirstFileTransactedW((lpfilename?.value ?: 0L).toString(), finfolevelid, (lpfindfiledata?.value ?: 0L).toString(), fsearchop, (lpsearchfilter?.value ?: 0L).toString(), dwadditionalflags.toInt(), (htransaction?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstFileW(lpfilename: Pcwstr, lpfindfiledata: COpaquePointer?): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_findFirstFileW((lpfilename?.value ?: 0L).toString(), (lpfindfiledata?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstStreamTransactedW(lpfilename: Pcwstr, infolevel: StreamInfoLevels, lpfindstreamdata: COpaquePointer?, dwflags: UInt, htransaction: Handle): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_findFirstStreamTransactedW((lpfilename?.value ?: 0L).toString(), infolevel, (lpfindstreamdata?.value ?: 0L).toString(), dwflags.toInt(), (htransaction?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstStreamW(lpfilename: Pcwstr, infolevel: StreamInfoLevels, lpfindstreamdata: COpaquePointer?, dwflags: UInt): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_findFirstStreamW((lpfilename?.value ?: 0L).toString(), infolevel, (lpfindstreamdata?.value ?: 0L).toString(), dwflags.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstVolumeA(lpszvolumename: Pstr, cchbufferlength: UInt): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_findFirstVolumeA((lpszvolumename?.value ?: 0L).toString(), cchbufferlength.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstVolumeMountPointA(lpszrootpathname: Pcstr, lpszvolumemountpoint: Pstr, cchbufferlength: UInt): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_findFirstVolumeMountPointA((lpszrootpathname?.value ?: 0L).toString(), (lpszvolumemountpoint?.value ?: 0L).toString(), cchbufferlength.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstVolumeMountPointW(lpszrootpathname: Pcwstr, lpszvolumemountpoint: Pwstr, cchbufferlength: UInt): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_findFirstVolumeMountPointW((lpszrootpathname?.value ?: 0L).toString(), (lpszvolumemountpoint?.value ?: 0L).toString(), cchbufferlength.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstVolumeW(lpszvolumename: Pwstr, cchbufferlength: UInt): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_findFirstVolumeW((lpszvolumename?.value ?: 0L).toString(), cchbufferlength.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextChangeNotification(hchangehandle: Handle): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_findNextChangeNotification((hchangehandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextFileA(hfindfile: Handle, lpfindfiledata: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_findNextFileA((hfindfile?.value ?: 0L).toString(), (lpfindfiledata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextFileNameW(hfindstream: Handle, stringlength: COpaquePointer?, linkname: Pwstr): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_findNextFileNameW((hfindstream?.value ?: 0L).toString(), (stringlength?.value ?: 0L).toString(), (linkname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextFileW(hfindfile: Handle, lpfindfiledata: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_findNextFileW((hfindfile?.value ?: 0L).toString(), (lpfindfiledata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextStreamW(hfindstream: Handle, lpfindstreamdata: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_findNextStreamW((hfindstream?.value ?: 0L).toString(), (lpfindstreamdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextVolumeA(hfindvolume: Handle, lpszvolumename: Pstr, cchbufferlength: UInt): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_findNextVolumeA((hfindvolume?.value ?: 0L).toString(), (lpszvolumename?.value ?: 0L).toString(), cchbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextVolumeMountPointA(hfindvolumemountpoint: Handle, lpszvolumemountpoint: Pstr, cchbufferlength: UInt): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_findNextVolumeMountPointA((hfindvolumemountpoint?.value ?: 0L).toString(), (lpszvolumemountpoint?.value ?: 0L).toString(), cchbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextVolumeMountPointW(hfindvolumemountpoint: Handle, lpszvolumemountpoint: Pwstr, cchbufferlength: UInt): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_findNextVolumeMountPointW((hfindvolumemountpoint?.value ?: 0L).toString(), (lpszvolumemountpoint?.value ?: 0L).toString(), cchbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextVolumeW(hfindvolume: Handle, lpszvolumename: Pwstr, cchbufferlength: UInt): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_findNextVolumeW((hfindvolume?.value ?: 0L).toString(), (lpszvolumename?.value ?: 0L).toString(), cchbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findVolumeClose(hfindvolume: Handle): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_findVolumeClose((hfindvolume?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findVolumeMountPointClose(hfindvolumemountpoint: Handle): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_findVolumeMountPointClose((hfindvolumemountpoint?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushFileBuffers(hfile: Handle): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_flushFileBuffers((hfile?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushLogBuffers(pvmarshal: COpaquePointer?, poverlapped: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_flushLogBuffers((pvmarshal?.value ?: 0L).toString(), (poverlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushLogToLsn(pvmarshalcontext: COpaquePointer?, plsnflush: COpaquePointer?, plsnlastflushed: COpaquePointer?, poverlapped: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_flushLogToLsn((pvmarshalcontext?.value ?: 0L).toString(), (plsnflush?.value ?: 0L).toString(), (plsnlastflushed?.value ?: 0L).toString(), (poverlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeEncryptedFileMetadata(pbmetadata: COpaquePointer?) {
    if (_windowsWin32StorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_win32_storage_filesystem_freeEncryptedFileMetadata((pbmetadata?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freeEncryptionCertificateHashList(pusers: COpaquePointer?) {
    if (_windowsWin32StorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_win32_storage_filesystem_freeEncryptionCertificateHashList((pusers?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freeReservedLog(pvmarshal: COpaquePointer?, creservedrecords: UInt, pcbadjustment: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_freeReservedLog((pvmarshal?.value ?: 0L).toString(), creservedrecords.toInt(), (pcbadjustment?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBinaryTypeA(lpapplicationname: Pcstr, lpbinarytype: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getBinaryTypeA((lpapplicationname?.value ?: 0L).toString(), (lpbinarytype?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBinaryTypeW(lpapplicationname: Pcwstr, lpbinarytype: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getBinaryTypeW((lpapplicationname?.value ?: 0L).toString(), (lpbinarytype?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCompressedFileSizeA(lpfilename: Pcstr, lpfilesizehigh: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getCompressedFileSizeA((lpfilename?.value ?: 0L).toString(), (lpfilesizehigh?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCompressedFileSizeTransactedA(lpfilename: Pcstr, lpfilesizehigh: COpaquePointer?, htransaction: Handle): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getCompressedFileSizeTransactedA((lpfilename?.value ?: 0L).toString(), (lpfilesizehigh?.value ?: 0L).toString(), (htransaction?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCompressedFileSizeTransactedW(lpfilename: Pcwstr, lpfilesizehigh: COpaquePointer?, htransaction: Handle): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getCompressedFileSizeTransactedW((lpfilename?.value ?: 0L).toString(), (lpfilesizehigh?.value ?: 0L).toString(), (htransaction?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCompressedFileSizeW(lpfilename: Pcwstr, lpfilesizehigh: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getCompressedFileSizeW((lpfilename?.value ?: 0L).toString(), (lpfilesizehigh?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentClockTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getCurrentClockTransactionManager((transactionmanagerhandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDiskFreeSpaceA(lprootpathname: Pcstr, lpsectorspercluster: COpaquePointer?, lpbytespersector: COpaquePointer?, lpnumberoffreeclusters: COpaquePointer?, lptotalnumberofclusters: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getDiskFreeSpaceA((lprootpathname?.value ?: 0L).toString(), (lpsectorspercluster?.value ?: 0L).toString(), (lpbytespersector?.value ?: 0L).toString(), (lpnumberoffreeclusters?.value ?: 0L).toString(), (lptotalnumberofclusters?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDiskFreeSpaceExA(lpdirectoryname: Pcstr, lpfreebytesavailabletocaller: COpaquePointer?, lptotalnumberofbytes: COpaquePointer?, lptotalnumberoffreebytes: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getDiskFreeSpaceExA((lpdirectoryname?.value ?: 0L).toString(), (lpfreebytesavailabletocaller?.value ?: 0L).toString(), (lptotalnumberofbytes?.value ?: 0L).toString(), (lptotalnumberoffreebytes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDiskFreeSpaceExW(lpdirectoryname: Pcwstr, lpfreebytesavailabletocaller: COpaquePointer?, lptotalnumberofbytes: COpaquePointer?, lptotalnumberoffreebytes: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getDiskFreeSpaceExW((lpdirectoryname?.value ?: 0L).toString(), (lpfreebytesavailabletocaller?.value ?: 0L).toString(), (lptotalnumberofbytes?.value ?: 0L).toString(), (lptotalnumberoffreebytes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDiskFreeSpaceW(lprootpathname: Pcwstr, lpsectorspercluster: COpaquePointer?, lpbytespersector: COpaquePointer?, lpnumberoffreeclusters: COpaquePointer?, lptotalnumberofclusters: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getDiskFreeSpaceW((lprootpathname?.value ?: 0L).toString(), (lpsectorspercluster?.value ?: 0L).toString(), (lpbytespersector?.value ?: 0L).toString(), (lpnumberoffreeclusters?.value ?: 0L).toString(), (lptotalnumberofclusters?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDiskSpaceInformationA(rootpath: Pcstr, diskspaceinfo: COpaquePointer?): Hresult =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getDiskSpaceInformationA((rootpath?.value ?: 0L).toString(), (diskspaceinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDiskSpaceInformationW(rootpath: Pcwstr, diskspaceinfo: COpaquePointer?): Hresult =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getDiskSpaceInformationW((rootpath?.value ?: 0L).toString(), (diskspaceinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDriveTypeA(lprootpathname: Pcstr): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getDriveTypeA((lprootpathname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDriveTypeW(lprootpathname: Pcwstr): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getDriveTypeW((lprootpathname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEncryptedFileMetadata(lpfilename: Pcwstr, pcbmetadata: COpaquePointer?, ppbmetadata: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getEncryptedFileMetadata((lpfilename?.value ?: 0L).toString(), (pcbmetadata?.value ?: 0L).toString(), (ppbmetadata?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnlistmentId(enlistmenthandle: Handle, enlistmentid: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getEnlistmentId((enlistmenthandle?.value ?: 0L).toString(), (enlistmentid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnlistmentRecoveryInformation(enlistmenthandle: Handle, buffersize: UInt, buffer: COpaquePointer?, bufferused: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getEnlistmentRecoveryInformation((enlistmenthandle?.value ?: 0L).toString(), buffersize.toInt(), (buffer?.value ?: 0L).toString(), (bufferused?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getExpandedNameA(lpszsource: Pcstr, lpszbuffer: Pstr): Int =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getExpandedNameA((lpszsource?.value ?: 0L).toString(), (lpszbuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getExpandedNameW(lpszsource: Pcwstr, lpszbuffer: Pwstr): Int =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getExpandedNameW((lpszsource?.value ?: 0L).toString(), (lpszbuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileAttributesA(lpfilename: Pcstr): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getFileAttributesA((lpfilename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileAttributesExA(lpfilename: Pcstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getFileAttributesExA((lpfilename?.value ?: 0L).toString(), finfolevelid, (lpfileinformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileAttributesExFromAppW(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getFileAttributesExFromAppW((lpfilename?.value ?: 0L).toString(), finfolevelid, (lpfileinformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileAttributesExW(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getFileAttributesExW((lpfilename?.value ?: 0L).toString(), finfolevelid, (lpfileinformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileAttributesTransactedA(lpfilename: Pcstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: COpaquePointer?, htransaction: Handle): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getFileAttributesTransactedA((lpfilename?.value ?: 0L).toString(), finfolevelid, (lpfileinformation?.value ?: 0L).toString(), (htransaction?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileAttributesTransactedW(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: COpaquePointer?, htransaction: Handle): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getFileAttributesTransactedW((lpfilename?.value ?: 0L).toString(), finfolevelid, (lpfileinformation?.value ?: 0L).toString(), (htransaction?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileAttributesW(lpfilename: Pcwstr): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getFileAttributesW((lpfilename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileBandwidthReservation(hfile: Handle, lpperiodmilliseconds: COpaquePointer?, lpbytesperperiod: COpaquePointer?, pdiscardable: COpaquePointer?, lptransfersize: COpaquePointer?, lpnumoutstandingrequests: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getFileBandwidthReservation((hfile?.value ?: 0L).toString(), (lpperiodmilliseconds?.value ?: 0L).toString(), (lpbytesperperiod?.value ?: 0L).toString(), (pdiscardable?.value ?: 0L).toString(), (lptransfersize?.value ?: 0L).toString(), (lpnumoutstandingrequests?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileInformationByHandle(hfile: Handle, lpfileinformation: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getFileInformationByHandle((hfile?.value ?: 0L).toString(), (lpfileinformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileInformationByHandleEx(hfile: Handle, fileinformationclass: FileInfoByHandleClass, lpfileinformation: COpaquePointer?, dwbuffersize: UInt): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getFileInformationByHandleEx((hfile?.value ?: 0L).toString(), fileinformationclass, (lpfileinformation?.value ?: 0L).toString(), dwbuffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileSize(hfile: Handle, lpfilesizehigh: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getFileSize((hfile?.value ?: 0L).toString(), (lpfilesizehigh?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileSizeEx(hfile: Handle, lpfilesize: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getFileSizeEx((hfile?.value ?: 0L).toString(), (lpfilesize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileTime(hfile: Handle, lpcreationtime: COpaquePointer?, lplastaccesstime: COpaquePointer?, lplastwritetime: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getFileTime((hfile?.value ?: 0L).toString(), (lpcreationtime?.value ?: 0L).toString(), (lplastaccesstime?.value ?: 0L).toString(), (lplastwritetime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileType(hfile: Handle): FileType =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getFileType((hfile?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileVersionInfoA(lptstrfilename: Pcstr, dwhandle: UInt, dwlen: UInt, lpdata: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getFileVersionInfoA((lptstrfilename?.value ?: 0L).toString(), dwhandle.toInt(), dwlen.toInt(), (lpdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileVersionInfoExA(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcstr, dwhandle: UInt, dwlen: UInt, lpdata: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getFileVersionInfoExA(dwflags.toInt(), (lpwstrfilename?.value ?: 0L).toString(), dwhandle.toInt(), dwlen.toInt(), (lpdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileVersionInfoExW(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcwstr, dwhandle: UInt, dwlen: UInt, lpdata: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getFileVersionInfoExW(dwflags.toInt(), (lpwstrfilename?.value ?: 0L).toString(), dwhandle.toInt(), dwlen.toInt(), (lpdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileVersionInfoSizeA(lptstrfilename: Pcstr, lpdwhandle: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getFileVersionInfoSizeA((lptstrfilename?.value ?: 0L).toString(), (lpdwhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileVersionInfoSizeExA(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcstr, lpdwhandle: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getFileVersionInfoSizeExA(dwflags.toInt(), (lpwstrfilename?.value ?: 0L).toString(), (lpdwhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileVersionInfoSizeExW(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcwstr, lpdwhandle: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getFileVersionInfoSizeExW(dwflags.toInt(), (lpwstrfilename?.value ?: 0L).toString(), (lpdwhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileVersionInfoSizeW(lptstrfilename: Pcwstr, lpdwhandle: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getFileVersionInfoSizeW((lptstrfilename?.value ?: 0L).toString(), (lpdwhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileVersionInfoW(lptstrfilename: Pcwstr, dwhandle: UInt, dwlen: UInt, lpdata: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getFileVersionInfoW((lptstrfilename?.value ?: 0L).toString(), dwhandle.toInt(), dwlen.toInt(), (lpdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFinalPathNameByHandleA(hfile: Handle, lpszfilepath: Pstr, cchfilepath: UInt, dwflags: GetfinalpathnamebyhandleFlags): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getFinalPathNameByHandleA((hfile?.value ?: 0L).toString(), (lpszfilepath?.value ?: 0L).toString(), cchfilepath.toInt(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFinalPathNameByHandleW(hfile: Handle, lpszfilepath: Pwstr, cchfilepath: UInt, dwflags: GetfinalpathnamebyhandleFlags): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getFinalPathNameByHandleW((hfile?.value ?: 0L).toString(), (lpszfilepath?.value ?: 0L).toString(), cchfilepath.toInt(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFullPathNameA(lpfilename: Pcstr, nbufferlength: UInt, lpbuffer: Pstr, lpfilepart: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getFullPathNameA((lpfilename?.value ?: 0L).toString(), nbufferlength.toInt(), (lpbuffer?.value ?: 0L).toString(), (lpfilepart?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFullPathNameTransactedA(lpfilename: Pcstr, nbufferlength: UInt, lpbuffer: Pstr, lpfilepart: COpaquePointer?, htransaction: Handle): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getFullPathNameTransactedA((lpfilename?.value ?: 0L).toString(), nbufferlength.toInt(), (lpbuffer?.value ?: 0L).toString(), (lpfilepart?.value ?: 0L).toString(), (htransaction?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFullPathNameTransactedW(lpfilename: Pcwstr, nbufferlength: UInt, lpbuffer: Pwstr, lpfilepart: COpaquePointer?, htransaction: Handle): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getFullPathNameTransactedW((lpfilename?.value ?: 0L).toString(), nbufferlength.toInt(), (lpbuffer?.value ?: 0L).toString(), (lpfilepart?.value ?: 0L).toString(), (htransaction?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFullPathNameW(lpfilename: Pcwstr, nbufferlength: UInt, lpbuffer: Pwstr, lpfilepart: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getFullPathNameW((lpfilename?.value ?: 0L).toString(), nbufferlength.toInt(), (lpbuffer?.value ?: 0L).toString(), (lpfilepart?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIoRingInfo(ioring: Hioring, info: COpaquePointer?): Hresult =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getIoRingInfo((ioring?.value ?: 0L).toString(), (info?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLogContainerName(hlog: Handle, cidlogicalcontainer: UInt, pwstrcontainername: Pcwstr, clencontainername: UInt, pcactuallencontainername: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getLogContainerName((hlog?.value ?: 0L).toString(), cidlogicalcontainer.toInt(), (pwstrcontainername?.value ?: 0L).toString(), clencontainername.toInt(), (pcactuallencontainername?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLogFileInformation(hlog: Handle, pinfobuffer: COpaquePointer?, cbbuffer: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getLogFileInformation((hlog?.value ?: 0L).toString(), (pinfobuffer?.value ?: 0L).toString(), (cbbuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLogIoStatistics(hlog: Handle, pvstatsbuffer: COpaquePointer?, cbstatsbuffer: UInt, estatsclass: ClfsIostatsClass, pcbstatswritten: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getLogIoStatistics((hlog?.value ?: 0L).toString(), (pvstatsbuffer?.value ?: 0L).toString(), cbstatsbuffer.toInt(), estatsclass, (pcbstatswritten?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLogReservationInfo(pvmarshal: COpaquePointer?, pcbrecordnumber: COpaquePointer?, pcbuserreservation: COpaquePointer?, pcbcommitreservation: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getLogReservationInfo((pvmarshal?.value ?: 0L).toString(), (pcbrecordnumber?.value ?: 0L).toString(), (pcbuserreservation?.value ?: 0L).toString(), (pcbcommitreservation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLogicalDriveStringsA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getLogicalDriveStringsA(nbufferlength.toInt(), (lpbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLogicalDriveStringsW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getLogicalDriveStringsW(nbufferlength.toInt(), (lpbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLogicalDrives(): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getLogicalDrives().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLongPathNameA(lpszshortpath: Pcstr, lpszlongpath: Pstr, cchbuffer: UInt): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getLongPathNameA((lpszshortpath?.value ?: 0L).toString(), (lpszlongpath?.value ?: 0L).toString(), cchbuffer.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLongPathNameTransactedA(lpszshortpath: Pcstr, lpszlongpath: Pstr, cchbuffer: UInt, htransaction: Handle): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getLongPathNameTransactedA((lpszshortpath?.value ?: 0L).toString(), (lpszlongpath?.value ?: 0L).toString(), cchbuffer.toInt(), (htransaction?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLongPathNameTransactedW(lpszshortpath: Pcwstr, lpszlongpath: Pwstr, cchbuffer: UInt, htransaction: Handle): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getLongPathNameTransactedW((lpszshortpath?.value ?: 0L).toString(), (lpszlongpath?.value ?: 0L).toString(), cchbuffer.toInt(), (htransaction?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLongPathNameW(lpszshortpath: Pcwstr, lpszlongpath: Pwstr, cchbuffer: UInt): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getLongPathNameW((lpszshortpath?.value ?: 0L).toString(), (lpszlongpath?.value ?: 0L).toString(), cchbuffer.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNextLogArchiveExtent(pvarchivecontext: COpaquePointer?, rgadextent: COpaquePointer?, cdescriptors: UInt, pcdescriptorsreturned: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getNextLogArchiveExtent((pvarchivecontext?.value ?: 0L).toString(), (rgadextent?.value ?: 0L).toString(), cdescriptors.toInt(), (pcdescriptorsreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: COpaquePointer?, notificationlength: UInt, dwmilliseconds: UInt, returnlength: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getNotificationResourceManager((resourcemanagerhandle?.value ?: 0L).toString(), (transactionnotification?.value ?: 0L).toString(), notificationlength.toInt(), dwmilliseconds.toInt(), (returnlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNotificationResourceManagerAsync(resourcemanagerhandle: Handle, transactionnotification: COpaquePointer?, transactionnotificationlength: UInt, returnlength: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getNotificationResourceManagerAsync((resourcemanagerhandle?.value ?: 0L).toString(), (transactionnotification?.value ?: 0L).toString(), transactionnotificationlength.toInt(), (returnlength?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getShortPathNameA(lpszlongpath: Pcstr, lpszshortpath: Pstr, cchbuffer: UInt): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getShortPathNameA((lpszlongpath?.value ?: 0L).toString(), (lpszshortpath?.value ?: 0L).toString(), cchbuffer.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getShortPathNameW(lpszlongpath: Pcwstr, lpszshortpath: Pwstr, cchbuffer: UInt): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getShortPathNameW((lpszlongpath?.value ?: 0L).toString(), (lpszshortpath?.value ?: 0L).toString(), cchbuffer.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTapeParameters(hdevice: Handle, dwoperation: GetTapeDriveParametersOperation, lpdwsize: COpaquePointer?, lptapeinformation: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getTapeParameters((hdevice?.value ?: 0L).toString(), dwoperation.toInt(), (lpdwsize?.value ?: 0L).toString(), (lptapeinformation?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTapePosition(hdevice: Handle, dwpositiontype: TapePositionType, lpdwpartition: COpaquePointer?, lpdwoffsetlow: COpaquePointer?, lpdwoffsethigh: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getTapePosition((hdevice?.value ?: 0L).toString(), dwpositiontype.toInt(), (lpdwpartition?.value ?: 0L).toString(), (lpdwoffsetlow?.value ?: 0L).toString(), (lpdwoffsethigh?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTapeStatus(hdevice: Handle): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getTapeStatus((hdevice?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTempFileNameA(lppathname: Pcstr, lpprefixstring: Pcstr, uunique: UInt, lptempfilename: Pstr): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getTempFileNameA((lppathname?.value ?: 0L).toString(), (lpprefixstring?.value ?: 0L).toString(), uunique.toInt(), (lptempfilename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTempFileNameW(lppathname: Pcwstr, lpprefixstring: Pcwstr, uunique: UInt, lptempfilename: Pwstr): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getTempFileNameW((lppathname?.value ?: 0L).toString(), (lpprefixstring?.value ?: 0L).toString(), uunique.toInt(), (lptempfilename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTempPath2A(bufferlength: UInt, buffer: Pstr): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getTempPath2A(bufferlength.toInt(), (buffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTempPath2W(bufferlength: UInt, buffer: Pwstr): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getTempPath2W(bufferlength.toInt(), (buffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTempPathA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getTempPathA(nbufferlength.toInt(), (lpbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTempPathW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getTempPathW(nbufferlength.toInt(), (lpbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTransactionId(transactionhandle: Handle, transactionid: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getTransactionId((transactionhandle?.value ?: 0L).toString(), (transactionid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTransactionInformation(transactionhandle: Handle, outcome: COpaquePointer?, isolationlevel: COpaquePointer?, isolationflags: COpaquePointer?, timeout: COpaquePointer?, bufferlength: UInt, description: Pwstr): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getTransactionInformation((transactionhandle?.value ?: 0L).toString(), (outcome?.value ?: 0L).toString(), (isolationlevel?.value ?: 0L).toString(), (isolationflags?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString(), bufferlength.toInt(), (description?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTransactionManagerId(transactionmanagerhandle: Handle, transactionmanagerid: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getTransactionManagerId((transactionmanagerhandle?.value ?: 0L).toString(), (transactionmanagerid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVolumeInformationA(lprootpathname: Pcstr, lpvolumenamebuffer: Pstr, nvolumenamesize: UInt, lpvolumeserialnumber: COpaquePointer?, lpmaximumcomponentlength: COpaquePointer?, lpfilesystemflags: COpaquePointer?, lpfilesystemnamebuffer: Pstr, nfilesystemnamesize: UInt): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getVolumeInformationA((lprootpathname?.value ?: 0L).toString(), (lpvolumenamebuffer?.value ?: 0L).toString(), nvolumenamesize.toInt(), (lpvolumeserialnumber?.value ?: 0L).toString(), (lpmaximumcomponentlength?.value ?: 0L).toString(), (lpfilesystemflags?.value ?: 0L).toString(), (lpfilesystemnamebuffer?.value ?: 0L).toString(), nfilesystemnamesize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVolumeInformationByHandleW(hfile: Handle, lpvolumenamebuffer: Pwstr, nvolumenamesize: UInt, lpvolumeserialnumber: COpaquePointer?, lpmaximumcomponentlength: COpaquePointer?, lpfilesystemflags: COpaquePointer?, lpfilesystemnamebuffer: Pwstr, nfilesystemnamesize: UInt): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getVolumeInformationByHandleW((hfile?.value ?: 0L).toString(), (lpvolumenamebuffer?.value ?: 0L).toString(), nvolumenamesize.toInt(), (lpvolumeserialnumber?.value ?: 0L).toString(), (lpmaximumcomponentlength?.value ?: 0L).toString(), (lpfilesystemflags?.value ?: 0L).toString(), (lpfilesystemnamebuffer?.value ?: 0L).toString(), nfilesystemnamesize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVolumeInformationW(lprootpathname: Pcwstr, lpvolumenamebuffer: Pwstr, nvolumenamesize: UInt, lpvolumeserialnumber: COpaquePointer?, lpmaximumcomponentlength: COpaquePointer?, lpfilesystemflags: COpaquePointer?, lpfilesystemnamebuffer: Pwstr, nfilesystemnamesize: UInt): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getVolumeInformationW((lprootpathname?.value ?: 0L).toString(), (lpvolumenamebuffer?.value ?: 0L).toString(), nvolumenamesize.toInt(), (lpvolumeserialnumber?.value ?: 0L).toString(), (lpmaximumcomponentlength?.value ?: 0L).toString(), (lpfilesystemflags?.value ?: 0L).toString(), (lpfilesystemnamebuffer?.value ?: 0L).toString(), nfilesystemnamesize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVolumeNameForVolumeMountPointA(lpszvolumemountpoint: Pcstr, lpszvolumename: Pstr, cchbufferlength: UInt): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getVolumeNameForVolumeMountPointA((lpszvolumemountpoint?.value ?: 0L).toString(), (lpszvolumename?.value ?: 0L).toString(), cchbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVolumeNameForVolumeMountPointW(lpszvolumemountpoint: Pcwstr, lpszvolumename: Pwstr, cchbufferlength: UInt): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getVolumeNameForVolumeMountPointW((lpszvolumemountpoint?.value ?: 0L).toString(), (lpszvolumename?.value ?: 0L).toString(), cchbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVolumePathNameA(lpszfilename: Pcstr, lpszvolumepathname: Pstr, cchbufferlength: UInt): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getVolumePathNameA((lpszfilename?.value ?: 0L).toString(), (lpszvolumepathname?.value ?: 0L).toString(), cchbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVolumePathNameW(lpszfilename: Pcwstr, lpszvolumepathname: Pwstr, cchbufferlength: UInt): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getVolumePathNameW((lpszfilename?.value ?: 0L).toString(), (lpszvolumepathname?.value ?: 0L).toString(), cchbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVolumePathNamesForVolumeNameA(lpszvolumename: Pcstr, lpszvolumepathnames: Pstr, cchbufferlength: UInt, lpcchreturnlength: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getVolumePathNamesForVolumeNameA((lpszvolumename?.value ?: 0L).toString(), (lpszvolumepathnames?.value ?: 0L).toString(), cchbufferlength.toInt(), (lpcchreturnlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVolumePathNamesForVolumeNameW(lpszvolumename: Pcwstr, lpszvolumepathnames: Pwstr, cchbufferlength: UInt, lpcchreturnlength: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_getVolumePathNamesForVolumeNameW((lpszvolumename?.value ?: 0L).toString(), (lpszvolumepathnames?.value ?: 0L).toString(), cchbufferlength.toInt(), (lpcchreturnlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun handleLogFull(hlog: Handle): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_handleLogFull((hlog?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun installLogPolicy(hlog: Handle, ppolicy: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_installLogPolicy((hlog?.value ?: 0L).toString(), (ppolicy?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isIoRingOpSupported(ioring: Hioring, op: IoringOpCode): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_isIoRingOpSupported((ioring?.value ?: 0L).toString(), op) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lZClose(hfile: Int) {
    if (_windowsWin32StorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_win32_storage_filesystem_lZClose(hfile)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun lZCopy(hfsource: Int, hfdest: Int): Int =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_lZCopy(hfsource, hfdest) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lZDone() {
    if (_windowsWin32StorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_win32_storage_filesystem_lZDone()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun lZInit(hfsource: Int): Int =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_lZInit(hfsource) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lZOpenFileA(lpfilename: Pcstr, lpreopenbuf: COpaquePointer?, wstyle: LzopenfileStyle): Int =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_lZOpenFileA((lpfilename?.value ?: 0L).toString(), (lpreopenbuf?.value ?: 0L).toString(), wstyle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lZOpenFileW(lpfilename: Pcwstr, lpreopenbuf: COpaquePointer?, wstyle: LzopenfileStyle): Int =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_lZOpenFileW((lpfilename?.value ?: 0L).toString(), (lpreopenbuf?.value ?: 0L).toString(), wstyle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lZRead(hfile: Int, lpbuffer: Pstr, cbread: Int): Int =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_lZRead(hfile, (lpbuffer?.value ?: 0L).toString(), cbread) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lZSeek(hfile: Int, loffset: Int, iorigin: Int): Int =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_lZSeek(hfile, loffset, iorigin) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lZStart(): Int =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_lZStart() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localFileTimeToFileTime(lplocalfiletime: COpaquePointer?, lpfiletime: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_localFileTimeToFileTime((lplocalfiletime?.value ?: 0L).toString(), (lpfiletime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lockFile(hfile: Handle, dwfileoffsetlow: UInt, dwfileoffsethigh: UInt, nnumberofbytestolocklow: UInt, nnumberofbytestolockhigh: UInt): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_lockFile((hfile?.value ?: 0L).toString(), dwfileoffsetlow.toInt(), dwfileoffsethigh.toInt(), nnumberofbytestolocklow.toInt(), nnumberofbytestolockhigh.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lockFileEx(hfile: Handle, dwflags: LockFileFlags, dwreserved: UInt, nnumberofbytestolocklow: UInt, nnumberofbytestolockhigh: UInt, lpoverlapped: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_lockFileEx((hfile?.value ?: 0L).toString(), dwflags.toInt(), dwreserved.toInt(), nnumberofbytestolocklow.toInt(), nnumberofbytestolockhigh.toInt(), (lpoverlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun logTailAdvanceFailure(hlog: Handle, dwreason: UInt): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_logTailAdvanceFailure((hlog?.value ?: 0L).toString(), dwreason.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsnBlockOffset(plsn: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_lsnBlockOffset((plsn?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsnContainer(plsn: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_lsnContainer((plsn?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): ClsLsn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsnEqual(plsn1: COpaquePointer?, plsn2: COpaquePointer?): Boolean =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_lsnEqual((plsn1?.value ?: 0L).toString(), (plsn2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsnGreater(plsn1: COpaquePointer?, plsn2: COpaquePointer?): Boolean =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_lsnGreater((plsn1?.value ?: 0L).toString(), (plsn2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsnIncrement(plsn: COpaquePointer?): ClsLsn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsnInvalid(plsn: COpaquePointer?): Boolean =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_lsnInvalid((plsn?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsnLess(plsn1: COpaquePointer?, plsn2: COpaquePointer?): Boolean =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_lsnLess((plsn1?.value ?: 0L).toString(), (plsn2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsnNull(plsn: COpaquePointer?): Boolean =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_lsnNull((plsn?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsnRecordSequence(plsn: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_lsnRecordSequence((plsn?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveFileA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_moveFileA((lpexistingfilename?.value ?: 0L).toString(), (lpnewfilename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveFileExA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, dwflags: MoveFileFlags): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_moveFileExA((lpexistingfilename?.value ?: 0L).toString(), (lpnewfilename?.value ?: 0L).toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveFileExW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, dwflags: MoveFileFlags): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_moveFileExW((lpexistingfilename?.value ?: 0L).toString(), (lpnewfilename?.value ?: 0L).toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveFileFromAppW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_moveFileFromAppW((lpexistingfilename?.value ?: 0L).toString(), (lpnewfilename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveFileTransactedA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: COpaquePointer?, dwflags: MoveFileFlags, htransaction: Handle): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_moveFileTransactedA((lpexistingfilename?.value ?: 0L).toString(), (lpnewfilename?.value ?: 0L).toString(), 0L.toString(), (lpdata?.value ?: 0L).toString(), dwflags.toInt(), (htransaction?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveFileTransactedW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: COpaquePointer?, dwflags: MoveFileFlags, htransaction: Handle): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_moveFileTransactedW((lpexistingfilename?.value ?: 0L).toString(), (lpnewfilename?.value ?: 0L).toString(), 0L.toString(), (lpdata?.value ?: 0L).toString(), dwflags.toInt(), (htransaction?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveFileW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_moveFileW((lpexistingfilename?.value ?: 0L).toString(), (lpnewfilename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveFileWithProgressA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: COpaquePointer?, dwflags: MoveFileFlags): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_moveFileWithProgressA((lpexistingfilename?.value ?: 0L).toString(), (lpnewfilename?.value ?: 0L).toString(), 0L.toString(), (lpdata?.value ?: 0L).toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveFileWithProgressW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: COpaquePointer?, dwflags: MoveFileFlags): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_moveFileWithProgressW((lpexistingfilename?.value ?: 0L).toString(), (lpnewfilename?.value ?: 0L).toString(), 0L.toString(), (lpdata?.value ?: 0L).toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netConnectionEnum(servername: Pcwstr, qualifier: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_netConnectionEnum((servername?.value ?: 0L).toString(), (qualifier?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString(), prefmaxlen.toInt(), (entriesread?.value ?: 0L).toString(), (totalentries?.value ?: 0L).toString(), (resumeHandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netFileClose(servername: Pcwstr, fileid: UInt): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_netFileClose((servername?.value ?: 0L).toString(), fileid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netFileEnum(servername: Pcwstr, basepath: Pcwstr, username: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_netFileEnum((servername?.value ?: 0L).toString(), (basepath?.value ?: 0L).toString(), (username?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString(), prefmaxlen.toInt(), (entriesread?.value ?: 0L).toString(), (totalentries?.value ?: 0L).toString(), (resumeHandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netFileGetInfo(servername: Pcwstr, fileid: UInt, level: UInt, bufptr: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_netFileGetInfo((servername?.value ?: 0L).toString(), fileid.toInt(), level.toInt(), (bufptr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerAliasAdd(servername: Pcwstr, level: UInt, buf: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_netServerAliasAdd((servername?.value ?: 0L).toString(), level.toInt(), (buf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerAliasDel(servername: Pcwstr, level: UInt, buf: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_netServerAliasDel((servername?.value ?: 0L).toString(), level.toInt(), (buf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerAliasEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_netServerAliasEnum((servername?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString(), prefmaxlen.toInt(), (entriesread?.value ?: 0L).toString(), (totalentries?.value ?: 0L).toString(), (resumehandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netSessionDel(servername: Pcwstr, uncclientname: Pcwstr, username: Pcwstr): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_netSessionDel((servername?.value ?: 0L).toString(), (uncclientname?.value ?: 0L).toString(), (username?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netSessionEnum(servername: Pcwstr, uncclientname: Pcwstr, username: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_netSessionEnum((servername?.value ?: 0L).toString(), (uncclientname?.value ?: 0L).toString(), (username?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString(), prefmaxlen.toInt(), (entriesread?.value ?: 0L).toString(), (totalentries?.value ?: 0L).toString(), (resumeHandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netSessionGetInfo(servername: Pcwstr, uncclientname: Pcwstr, username: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_netSessionGetInfo((servername?.value ?: 0L).toString(), (uncclientname?.value ?: 0L).toString(), (username?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netShareAdd(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_netShareAdd((servername?.value ?: 0L).toString(), level.toInt(), (buf?.value ?: 0L).toString(), (parmErr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netShareCheck(servername: Pcwstr, device: Pcwstr, type: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_netShareCheck((servername?.value ?: 0L).toString(), (device?.value ?: 0L).toString(), (type?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netShareDel(servername: Pcwstr, netname: Pcwstr, reserved: UInt): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_netShareDel((servername?.value ?: 0L).toString(), (netname?.value ?: 0L).toString(), reserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netShareDelEx(servername: Pcwstr, level: UInt, buf: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_netShareDelEx((servername?.value ?: 0L).toString(), level.toInt(), (buf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netShareDelSticky(servername: Pcwstr, netname: Pcwstr, reserved: UInt): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_netShareDelSticky((servername?.value ?: 0L).toString(), (netname?.value ?: 0L).toString(), reserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netShareEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_netShareEnum((servername?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString(), prefmaxlen.toInt(), (entriesread?.value ?: 0L).toString(), (totalentries?.value ?: 0L).toString(), (resumeHandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netShareEnumSticky(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_netShareEnumSticky((servername?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString(), prefmaxlen.toInt(), (entriesread?.value ?: 0L).toString(), (totalentries?.value ?: 0L).toString(), (resumeHandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netShareGetInfo(servername: Pcwstr, netname: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_netShareGetInfo((servername?.value ?: 0L).toString(), (netname?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netShareSetInfo(servername: Pcwstr, netname: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_netShareSetInfo((servername?.value ?: 0L).toString(), (netname?.value ?: 0L).toString(), level.toInt(), (buf?.value ?: 0L).toString(), (parmErr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netStatisticsGet(servername: COpaquePointer?, service: COpaquePointer?, level: UInt, options: UInt, buffer: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_netStatisticsGet((servername?.value ?: 0L).toString(), (service?.value ?: 0L).toString(), level.toInt(), options.toInt(), (buffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openEncryptedFileRawA(lpfilename: Pcstr, ulflags: UInt, pvcontext: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_openEncryptedFileRawA((lpfilename?.value ?: 0L).toString(), ulflags.toInt(), (pvcontext?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openEncryptedFileRawW(lpfilename: Pcwstr, ulflags: UInt, pvcontext: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_openEncryptedFileRawW((lpfilename?.value ?: 0L).toString(), ulflags.toInt(), (pvcontext?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openEnlistment(dwdesiredaccess: UInt, resourcemanagerhandle: Handle, enlistmentid: COpaquePointer?): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_openEnlistment(dwdesiredaccess.toInt(), (resourcemanagerhandle?.value ?: 0L).toString(), (enlistmentid?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openFile(lpfilename: Pcstr, lpreopenbuff: COpaquePointer?, ustyle: UInt): Int =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_openFile((lpfilename?.value ?: 0L).toString(), (lpreopenbuff?.value ?: 0L).toString(), ustyle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openFileById(hvolumehint: Handle, lpfileid: COpaquePointer?, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: COpaquePointer?, dwflagsandattributes: FileFlagsAndAttributes): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_openFileById((hvolumehint?.value ?: 0L).toString(), (lpfileid?.value ?: 0L).toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), (lpsecurityattributes?.value ?: 0L).toString(), dwflagsandattributes.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openResourceManager(dwdesiredaccess: UInt, tmhandle: Handle, resourcemanagerid: COpaquePointer?): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_openResourceManager(dwdesiredaccess.toInt(), (tmhandle?.value ?: 0L).toString(), (resourcemanagerid?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTransaction(dwdesiredaccess: UInt, transactionid: COpaquePointer?): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_openTransaction(dwdesiredaccess.toInt(), (transactionid?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTransactionManager(logfilename: Pcwstr, desiredaccess: UInt, openoptions: UInt): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_openTransactionManager((logfilename?.value ?: 0L).toString(), desiredaccess.toInt(), openoptions.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTransactionManagerById(transactionmanagerid: COpaquePointer?, desiredaccess: UInt, openoptions: UInt): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_openTransactionManagerById((transactionmanagerid?.value ?: 0L).toString(), desiredaccess.toInt(), openoptions.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popIoRingCompletion(ioring: Hioring, cqe: COpaquePointer?): Hresult =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_popIoRingCompletion((ioring?.value ?: 0L).toString(), (cqe?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_prePrepareComplete((enlistmenthandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_prePrepareEnlistment((enlistmenthandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prepareComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_prepareComplete((enlistmenthandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_prepareEnlistment((enlistmenthandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prepareLogArchive(hlog: Handle, pszbaselogfilename: Pwstr, clen: UInt, plsnlow: COpaquePointer?, plsnhigh: COpaquePointer?, pcactuallength: COpaquePointer?, poffbaselogfiledata: COpaquePointer?, pcbbaselogfilelength: COpaquePointer?, plsnbase: COpaquePointer?, plsnlast: COpaquePointer?, plsncurrentarchivetail: COpaquePointer?, ppvarchivecontext: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_prepareLogArchive((hlog?.value ?: 0L).toString(), (pszbaselogfilename?.value ?: 0L).toString(), clen.toInt(), (plsnlow?.value ?: 0L).toString(), (plsnhigh?.value ?: 0L).toString(), (pcactuallength?.value ?: 0L).toString(), (poffbaselogfiledata?.value ?: 0L).toString(), (pcbbaselogfilelength?.value ?: 0L).toString(), (plsnbase?.value ?: 0L).toString(), (plsnlast?.value ?: 0L).toString(), (plsncurrentarchivetail?.value ?: 0L).toString(), (ppvarchivecontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prepareTape(hdevice: Handle, dwoperation: PrepareTapeOperation, bimmediate: Bool): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_prepareTape((hdevice?.value ?: 0L).toString(), dwoperation.toInt(), bimmediate).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryDosDeviceA(lpdevicename: Pcstr, lptargetpath: Pstr, ucchmax: UInt): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_queryDosDeviceA((lpdevicename?.value ?: 0L).toString(), (lptargetpath?.value ?: 0L).toString(), ucchmax.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryDosDeviceW(lpdevicename: Pcwstr, lptargetpath: Pwstr, ucchmax: UInt): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_queryDosDeviceW((lpdevicename?.value ?: 0L).toString(), (lptargetpath?.value ?: 0L).toString(), ucchmax.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryIoRingCapabilities(capabilities: COpaquePointer?): Hresult =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_queryIoRingCapabilities((capabilities?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryLogPolicy(hlog: Handle, epolicytype: ClfsMgmtPolicyType, ppolicybuffer: COpaquePointer?, pcbpolicybuffer: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_queryLogPolicy((hlog?.value ?: 0L).toString(), epolicytype, (ppolicybuffer?.value ?: 0L).toString(), (pcbpolicybuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryRecoveryAgentsOnEncryptedFile(lpfilename: Pcwstr, precoveryagents: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_queryRecoveryAgentsOnEncryptedFile((lpfilename?.value ?: 0L).toString(), (precoveryagents?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryUsersOnEncryptedFile(lpfilename: Pcwstr, pusers: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_queryUsersOnEncryptedFile((lpfilename?.value ?: 0L).toString(), (pusers?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reOpenFile(horiginalfile: Handle, dwdesiredaccess: UInt, dwsharemode: FileShareMode, dwflagsandattributes: FileFlagsAndAttributes): Handle =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_reOpenFile((horiginalfile?.value ?: 0L).toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), dwflagsandattributes.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readDirectoryChangesExW(hdirectory: Handle, lpbuffer: COpaquePointer?, nbufferlength: UInt, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange, lpbytesreturned: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpoverlappedCompletionRoutine, readdirectorynotifyinformationclass: ReadDirectoryNotifyInformationClass): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_readDirectoryChangesExW((hdirectory?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), nbufferlength.toInt(), bwatchsubtree, dwnotifyfilter.toInt(), (lpbytesreturned?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString(), 0L.toString(), readdirectorynotifyinformationclass) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readDirectoryChangesW(hdirectory: Handle, lpbuffer: COpaquePointer?, nbufferlength: UInt, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange, lpbytesreturned: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpoverlappedCompletionRoutine): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_readDirectoryChangesW((hdirectory?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), nbufferlength.toInt(), bwatchsubtree, dwnotifyfilter.toInt(), (lpbytesreturned?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readEncryptedFileRaw(pfexportcallback: PfeExportFunc, pvcallbackcontext: COpaquePointer?, pvcontext: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_readEncryptedFileRaw(0L.toString(), (pvcallbackcontext?.value ?: 0L).toString(), (pvcontext?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readFile(hfile: Handle, lpbuffer: COpaquePointer?, nnumberofbytestoread: UInt, lpnumberofbytesread: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_readFile((hfile?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), nnumberofbytestoread.toInt(), (lpnumberofbytesread?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readFileEx(hfile: Handle, lpbuffer: COpaquePointer?, nnumberofbytestoread: UInt, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpoverlappedCompletionRoutine): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_readFileEx((hfile?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), nnumberofbytestoread.toInt(), (lpoverlapped?.value ?: 0L).toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readFileScatter(hfile: Handle, asegmentarray: COpaquePointer?, nnumberofbytestoread: UInt, lpreserved: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_readFileScatter((hfile?.value ?: 0L).toString(), (asegmentarray?.value ?: 0L).toString(), nnumberofbytestoread.toInt(), (lpreserved?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readLogArchiveMetadata(pvarchivecontext: COpaquePointer?, cboffset: UInt, cbbytestoread: UInt, pbreadbuffer: COpaquePointer?, pcbbytesread: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_readLogArchiveMetadata((pvarchivecontext?.value ?: 0L).toString(), cboffset.toInt(), cbbytestoread.toInt(), (pbreadbuffer?.value ?: 0L).toString(), (pcbbytesread?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readLogNotification(hlog: Handle, pnotification: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_readLogNotification((hlog?.value ?: 0L).toString(), (pnotification?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readLogRecord(pvmarshal: COpaquePointer?, plsnfirst: COpaquePointer?, econtextmode: ClfsContextMode, ppvreadbuffer: COpaquePointer?, pcbreadbuffer: COpaquePointer?, perecordtype: COpaquePointer?, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, ppvreadcontext: COpaquePointer?, poverlapped: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_readLogRecord((pvmarshal?.value ?: 0L).toString(), (plsnfirst?.value ?: 0L).toString(), econtextmode, (ppvreadbuffer?.value ?: 0L).toString(), (pcbreadbuffer?.value ?: 0L).toString(), (perecordtype?.value ?: 0L).toString(), (plsnundonext?.value ?: 0L).toString(), (plsnprevious?.value ?: 0L).toString(), (ppvreadcontext?.value ?: 0L).toString(), (poverlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readLogRestartArea(pvmarshal: COpaquePointer?, ppvrestartbuffer: COpaquePointer?, pcbrestartbuffer: COpaquePointer?, plsn: COpaquePointer?, ppvcontext: COpaquePointer?, poverlapped: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_readLogRestartArea((pvmarshal?.value ?: 0L).toString(), (ppvrestartbuffer?.value ?: 0L).toString(), (pcbrestartbuffer?.value ?: 0L).toString(), (plsn?.value ?: 0L).toString(), (ppvcontext?.value ?: 0L).toString(), (poverlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readNextLogRecord(pvreadcontext: COpaquePointer?, ppvbuffer: COpaquePointer?, pcbbuffer: COpaquePointer?, perecordtype: COpaquePointer?, plsnuser: COpaquePointer?, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, plsnrecord: COpaquePointer?, poverlapped: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_readNextLogRecord((pvreadcontext?.value ?: 0L).toString(), (ppvbuffer?.value ?: 0L).toString(), (pcbbuffer?.value ?: 0L).toString(), (perecordtype?.value ?: 0L).toString(), (plsnuser?.value ?: 0L).toString(), (plsnundonext?.value ?: 0L).toString(), (plsnprevious?.value ?: 0L).toString(), (plsnrecord?.value ?: 0L).toString(), (poverlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_readOnlyEnlistment((enlistmenthandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readPreviousLogRestartArea(pvreadcontext: COpaquePointer?, ppvrestartbuffer: COpaquePointer?, pcbrestartbuffer: COpaquePointer?, plsnrestart: COpaquePointer?, poverlapped: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_readPreviousLogRestartArea((pvreadcontext?.value ?: 0L).toString(), (ppvrestartbuffer?.value ?: 0L).toString(), (pcbrestartbuffer?.value ?: 0L).toString(), (plsnrestart?.value ?: 0L).toString(), (poverlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recoverEnlistment(enlistmenthandle: Handle, enlistmentkey: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_recoverEnlistment((enlistmenthandle?.value ?: 0L).toString(), (enlistmentkey?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recoverResourceManager(resourcemanagerhandle: Handle): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_recoverResourceManager((resourcemanagerhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recoverTransactionManager(transactionmanagerhandle: Handle): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_recoverTransactionManager((transactionmanagerhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerForLogWriteNotification(hlog: Handle, cbthreshold: UInt, fenable: Bool): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_registerForLogWriteNotification((hlog?.value ?: 0L).toString(), cbthreshold.toInt(), fenable) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerManageableLogClient(hlog: Handle, pcallbacks: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_registerManageableLogClient((hlog?.value ?: 0L).toString(), (pcallbacks?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeDirectoryA(lppathname: Pcstr): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_removeDirectoryA((lppathname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeDirectoryFromAppW(lppathname: Pcwstr): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_removeDirectoryFromAppW((lppathname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeDirectoryTransactedA(lppathname: Pcstr, htransaction: Handle): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_removeDirectoryTransactedA((lppathname?.value ?: 0L).toString(), (htransaction?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeDirectoryTransactedW(lppathname: Pcwstr, htransaction: Handle): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_removeDirectoryTransactedW((lppathname?.value ?: 0L).toString(), (htransaction?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeDirectoryW(lppathname: Pcwstr): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_removeDirectoryW((lppathname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeLogContainer(hlog: Handle, pwszcontainerpath: Pcwstr, fforce: Bool, preserved: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_removeLogContainer((hlog?.value ?: 0L).toString(), (pwszcontainerpath?.value ?: 0L).toString(), fforce, (preserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeLogContainerSet(hlog: Handle, ccontainer: UShort, rgwszcontainerpath: COpaquePointer?, fforce: Bool, preserved: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_removeLogContainerSet((hlog?.value ?: 0L).toString(), ccontainer.toInt(), (rgwszcontainerpath?.value ?: 0L).toString(), fforce, (preserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeLogPolicy(hlog: Handle, epolicytype: ClfsMgmtPolicyType): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_removeLogPolicy((hlog?.value ?: 0L).toString(), epolicytype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeUsersFromEncryptedFile(lpfilename: Pcwstr, phashes: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_removeUsersFromEncryptedFile((lpfilename?.value ?: 0L).toString(), (phashes?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renameTransactionManager(logfilename: Pcwstr, existingtransactionmanagerguid: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_renameTransactionManager((logfilename?.value ?: 0L).toString(), (existingtransactionmanagerguid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun replaceFileA(lpreplacedfilename: Pcstr, lpreplacementfilename: Pcstr, lpbackupfilename: Pcstr, dwreplaceflags: ReplaceFileFlags, lpexclude: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_replaceFileA((lpreplacedfilename?.value ?: 0L).toString(), (lpreplacementfilename?.value ?: 0L).toString(), (lpbackupfilename?.value ?: 0L).toString(), dwreplaceflags.toInt(), (lpexclude?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun replaceFileFromAppW(lpreplacedfilename: Pcwstr, lpreplacementfilename: Pcwstr, lpbackupfilename: Pcwstr, dwreplaceflags: UInt, lpexclude: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_replaceFileFromAppW((lpreplacedfilename?.value ?: 0L).toString(), (lpreplacementfilename?.value ?: 0L).toString(), (lpbackupfilename?.value ?: 0L).toString(), dwreplaceflags.toInt(), (lpexclude?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun replaceFileW(lpreplacedfilename: Pcwstr, lpreplacementfilename: Pcwstr, lpbackupfilename: Pcwstr, dwreplaceflags: ReplaceFileFlags, lpexclude: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_replaceFileW((lpreplacedfilename?.value ?: 0L).toString(), (lpreplacementfilename?.value ?: 0L).toString(), (lpbackupfilename?.value ?: 0L).toString(), dwreplaceflags.toInt(), (lpexclude?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reserveAndAppendLog(pvmarshal: COpaquePointer?, rgwriteentries: COpaquePointer?, cwriteentries: UInt, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, creserverecords: UInt, rgcbreservation: COpaquePointer?, fflags: ClfsFlag, plsn: COpaquePointer?, poverlapped: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_reserveAndAppendLog((pvmarshal?.value ?: 0L).toString(), (rgwriteentries?.value ?: 0L).toString(), cwriteentries.toInt(), (plsnundonext?.value ?: 0L).toString(), (plsnprevious?.value ?: 0L).toString(), creserverecords.toInt(), (rgcbreservation?.value ?: 0L).toString(), fflags.toInt(), (plsn?.value ?: 0L).toString(), (poverlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reserveAndAppendLogAligned(pvmarshal: COpaquePointer?, rgwriteentries: COpaquePointer?, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, creserverecords: UInt, rgcbreservation: COpaquePointer?, fflags: ClfsFlag, plsn: COpaquePointer?, poverlapped: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_reserveAndAppendLogAligned((pvmarshal?.value ?: 0L).toString(), (rgwriteentries?.value ?: 0L).toString(), cwriteentries.toInt(), cbentryalignment.toInt(), (plsnundonext?.value ?: 0L).toString(), (plsnprevious?.value ?: 0L).toString(), creserverecords.toInt(), (rgcbreservation?.value ?: 0L).toString(), fflags.toInt(), (plsn?.value ?: 0L).toString(), (poverlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rollbackComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_rollbackComplete((enlistmenthandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_rollbackEnlistment((enlistmenthandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rollbackTransaction(transactionhandle: Handle): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_rollbackTransaction((transactionhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rollbackTransactionAsync(transactionhandle: Handle): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_rollbackTransactionAsync((transactionhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_rollforwardTransactionManager((transactionmanagerhandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scanLogContainers(pcxscan: COpaquePointer?, escanmode: UByte, preserved: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_scanLogContainers((pcxscan?.value ?: 0L).toString(), escanmode.toInt(), (preserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun searchPathA(lppath: Pcstr, lpfilename: Pcstr, lpextension: Pcstr, nbufferlength: UInt, lpbuffer: Pstr, lpfilepart: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_searchPathA((lppath?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString(), (lpextension?.value ?: 0L).toString(), nbufferlength.toInt(), (lpbuffer?.value ?: 0L).toString(), (lpfilepart?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun searchPathW(lppath: Pcwstr, lpfilename: Pcwstr, lpextension: Pcwstr, nbufferlength: UInt, lpbuffer: Pwstr, lpfilepart: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_searchPathW((lppath?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString(), (lpextension?.value ?: 0L).toString(), nbufferlength.toInt(), (lpbuffer?.value ?: 0L).toString(), (lpfilepart?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEncryptedFileMetadata(lpfilename: Pcwstr, pboldmetadata: COpaquePointer?, pbnewmetadata: COpaquePointer?, pownerhash: COpaquePointer?, dwoperation: UInt, pcertificatesadded: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setEncryptedFileMetadata((lpfilename?.value ?: 0L).toString(), (pboldmetadata?.value ?: 0L).toString(), (pbnewmetadata?.value ?: 0L).toString(), (pownerhash?.value ?: 0L).toString(), dwoperation.toInt(), (pcertificatesadded?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEndOfFile(hfile: Handle): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setEndOfFile((hfile?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEndOfLog(hlog: Handle, plsnend: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setEndOfLog((hlog?.value ?: 0L).toString(), (plsnend?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEnlistmentRecoveryInformation(enlistmenthandle: Handle, buffersize: UInt, buffer: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setEnlistmentRecoveryInformation((enlistmenthandle?.value ?: 0L).toString(), buffersize.toInt(), (buffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileApisToANSI() {
    if (_windowsWin32StorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_win32_storage_filesystem_setFileApisToANSI()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setFileApisToOEM() {
    if (_windowsWin32StorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_win32_storage_filesystem_setFileApisToOEM()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setFileAttributesA(lpfilename: Pcstr, dwfileattributes: FileFlagsAndAttributes): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setFileAttributesA((lpfilename?.value ?: 0L).toString(), dwfileattributes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileAttributesFromAppW(lpfilename: Pcwstr, dwfileattributes: UInt): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setFileAttributesFromAppW((lpfilename?.value ?: 0L).toString(), dwfileattributes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileAttributesTransactedA(lpfilename: Pcstr, dwfileattributes: UInt, htransaction: Handle): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setFileAttributesTransactedA((lpfilename?.value ?: 0L).toString(), dwfileattributes.toInt(), (htransaction?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileAttributesTransactedW(lpfilename: Pcwstr, dwfileattributes: UInt, htransaction: Handle): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setFileAttributesTransactedW((lpfilename?.value ?: 0L).toString(), dwfileattributes.toInt(), (htransaction?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileAttributesW(lpfilename: Pcwstr, dwfileattributes: FileFlagsAndAttributes): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setFileAttributesW((lpfilename?.value ?: 0L).toString(), dwfileattributes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileBandwidthReservation(hfile: Handle, nperiodmilliseconds: UInt, nbytesperperiod: UInt, bdiscardable: Bool, lptransfersize: COpaquePointer?, lpnumoutstandingrequests: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setFileBandwidthReservation((hfile?.value ?: 0L).toString(), nperiodmilliseconds.toInt(), nbytesperperiod.toInt(), bdiscardable, (lptransfersize?.value ?: 0L).toString(), (lpnumoutstandingrequests?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileCompletionNotificationModes(filehandle: Handle, flags: UByte): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setFileCompletionNotificationModes((filehandle?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileInformationByHandle(hfile: Handle, fileinformationclass: FileInfoByHandleClass, lpfileinformation: COpaquePointer?, dwbuffersize: UInt): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setFileInformationByHandle((hfile?.value ?: 0L).toString(), fileinformationclass, (lpfileinformation?.value ?: 0L).toString(), dwbuffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileIoOverlappedRange(filehandle: Handle, overlappedrangestart: COpaquePointer?, length: UInt): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setFileIoOverlappedRange((filehandle?.value ?: 0L).toString(), (overlappedrangestart?.value ?: 0L).toString(), length.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFilePointer(hfile: Handle, ldistancetomove: Int, lpdistancetomovehigh: COpaquePointer?, dwmovemethod: SetFilePointerMoveMethod): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setFilePointer((hfile?.value ?: 0L).toString(), ldistancetomove, (lpdistancetomovehigh?.value ?: 0L).toString(), dwmovemethod.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFilePointerEx(hfile: Handle, lidistancetomove: Long, lpnewfilepointer: COpaquePointer?, dwmovemethod: SetFilePointerMoveMethod): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setFilePointerEx((hfile?.value ?: 0L).toString(), lidistancetomove.toString(), (lpnewfilepointer?.value ?: 0L).toString(), dwmovemethod.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileShortNameA(hfile: Handle, lpshortname: Pcstr): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setFileShortNameA((hfile?.value ?: 0L).toString(), (lpshortname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileShortNameW(hfile: Handle, lpshortname: Pcwstr): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setFileShortNameW((hfile?.value ?: 0L).toString(), (lpshortname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileTime(hfile: Handle, lpcreationtime: COpaquePointer?, lplastaccesstime: COpaquePointer?, lplastwritetime: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setFileTime((hfile?.value ?: 0L).toString(), (lpcreationtime?.value ?: 0L).toString(), (lplastaccesstime?.value ?: 0L).toString(), (lplastwritetime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileValidData(hfile: Handle, validdatalength: Long): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setFileValidData((hfile?.value ?: 0L).toString(), validdatalength.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIoRingCompletionEvent(ioring: Hioring, hevent: Handle): Hresult =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setIoRingCompletionEvent((ioring?.value ?: 0L).toString(), (hevent?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setLogArchiveMode(hlog: Handle, emode: ClfsLogArchiveMode): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setLogArchiveMode((hlog?.value ?: 0L).toString(), emode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setLogArchiveTail(hlog: Handle, plsnarchivetail: COpaquePointer?, preserved: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setLogArchiveTail((hlog?.value ?: 0L).toString(), (plsnarchivetail?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setLogFileSizeWithPolicy(hlog: Handle, pdesiredsize: COpaquePointer?, presultingsize: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setLogFileSizeWithPolicy((hlog?.value ?: 0L).toString(), (pdesiredsize?.value ?: 0L).toString(), (presultingsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setResourceManagerCompletionPort(resourcemanagerhandle: Handle, iocompletionporthandle: Handle, completionkey: ULong): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setResourceManagerCompletionPort((resourcemanagerhandle?.value ?: 0L).toString(), (iocompletionporthandle?.value ?: 0L).toString(), completionkey.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSearchPathMode(flags: UInt): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setSearchPathMode(flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTapeParameters(hdevice: Handle, dwoperation: TapeInformationType, lptapeinformation: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setTapeParameters((hdevice?.value ?: 0L).toString(), dwoperation.toInt(), (lptapeinformation?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTapePosition(hdevice: Handle, dwpositionmethod: TapePositionMethod, dwpartition: UInt, dwoffsetlow: UInt, dwoffsethigh: UInt, bimmediate: Bool): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setTapePosition((hdevice?.value ?: 0L).toString(), dwpositionmethod.toInt(), dwpartition.toInt(), dwoffsetlow.toInt(), dwoffsethigh.toInt(), bimmediate).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTransactionInformation(transactionhandle: Handle, isolationlevel: UInt, isolationflags: UInt, timeout: UInt, description: Pcwstr): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setTransactionInformation((transactionhandle?.value ?: 0L).toString(), isolationlevel.toInt(), isolationflags.toInt(), timeout.toInt(), (description?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUserFileEncryptionKey(pencryptioncertificate: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setUserFileEncryptionKey((pencryptioncertificate?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUserFileEncryptionKeyEx(pencryptioncertificate: COpaquePointer?, dwcapabilities: UInt, dwflags: UInt, pvreserved: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setUserFileEncryptionKeyEx((pencryptioncertificate?.value ?: 0L).toString(), dwcapabilities.toInt(), dwflags.toInt(), (pvreserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setVolumeLabelA(lprootpathname: Pcstr, lpvolumename: Pcstr): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setVolumeLabelA((lprootpathname?.value ?: 0L).toString(), (lpvolumename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setVolumeLabelW(lprootpathname: Pcwstr, lpvolumename: Pcwstr): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setVolumeLabelW((lprootpathname?.value ?: 0L).toString(), (lpvolumename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setVolumeMountPointA(lpszvolumemountpoint: Pcstr, lpszvolumename: Pcstr): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setVolumeMountPointA((lpszvolumemountpoint?.value ?: 0L).toString(), (lpszvolumename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setVolumeMountPointW(lpszvolumemountpoint: Pcwstr, lpszvolumename: Pcwstr): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_setVolumeMountPointW((lpszvolumemountpoint?.value ?: 0L).toString(), (lpszvolumename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun singlePhaseReject(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_singlePhaseReject((enlistmenthandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun submitIoRing(ioring: Hioring, waitoperations: UInt, milliseconds: UInt, submittedentries: COpaquePointer?): Hresult =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_submitIoRing((ioring?.value ?: 0L).toString(), waitoperations.toInt(), milliseconds.toInt(), (submittedentries?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun terminateLogArchive(pvarchivecontext: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_terminateLogArchive((pvarchivecontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun terminateReadLog(pvcursorcontext: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_terminateReadLog((pvcursorcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun truncateLog(pvmarshal: COpaquePointer?, plsnend: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_truncateLog((pvmarshal?.value ?: 0L).toString(), (plsnend?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun txfGetThreadMiniVersionForCreate(miniversion: COpaquePointer?) {
    if (_windowsWin32StorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_win32_storage_filesystem_txfGetThreadMiniVersionForCreate((miniversion?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun txfLogCreateFileReadContext(logpath: Pcwstr, beginninglsn: ClsLsn, endinglsn: ClsLsn, txffileid: COpaquePointer?, txflogcontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun txfLogCreateRangeReadContext(logpath: Pcwstr, beginninglsn: ClsLsn, endinglsn: ClsLsn, beginningvirtualclock: COpaquePointer?, endingvirtualclock: COpaquePointer?, recordtypemask: UInt, txflogcontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun txfLogDestroyReadContext(txflogcontext: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_txfLogDestroyReadContext((txflogcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun txfLogReadRecords(txflogcontext: COpaquePointer?, bufferlength: UInt, buffer: COpaquePointer?, bytesused: COpaquePointer?, recordcount: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_txfLogReadRecords((txflogcontext?.value ?: 0L).toString(), bufferlength.toInt(), (buffer?.value ?: 0L).toString(), (bytesused?.value ?: 0L).toString(), (recordcount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun txfLogRecordGetFileName(recordbuffer: COpaquePointer?, recordbufferlengthinbytes: UInt, namebuffer: Pwstr, namebufferlengthinbytes: COpaquePointer?, txfid: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_txfLogRecordGetFileName((recordbuffer?.value ?: 0L).toString(), recordbufferlengthinbytes.toInt(), (namebuffer?.value ?: 0L).toString(), (namebufferlengthinbytes?.value ?: 0L).toString(), (txfid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun txfLogRecordGetGenericType(recordbuffer: COpaquePointer?, recordbufferlengthinbytes: UInt, generictype: COpaquePointer?, virtualclock: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_txfLogRecordGetGenericType((recordbuffer?.value ?: 0L).toString(), recordbufferlengthinbytes.toInt(), (generictype?.value ?: 0L).toString(), (virtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun txfReadMetadataInfo(filehandle: Handle, txffileid: COpaquePointer?, lastlsn: COpaquePointer?, transactionstate: COpaquePointer?, lockingtransaction: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_txfReadMetadataInfo((filehandle?.value ?: 0L).toString(), (txffileid?.value ?: 0L).toString(), (lastlsn?.value ?: 0L).toString(), (transactionstate?.value ?: 0L).toString(), (lockingtransaction?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun txfSetThreadMiniVersionForCreate(miniversion: UShort) {
    if (_windowsWin32StorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_win32_storage_filesystem_txfSetThreadMiniVersionForCreate(miniversion.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unlockFile(hfile: Handle, dwfileoffsetlow: UInt, dwfileoffsethigh: UInt, nnumberofbytestounlocklow: UInt, nnumberofbytestounlockhigh: UInt): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_unlockFile((hfile?.value ?: 0L).toString(), dwfileoffsetlow.toInt(), dwfileoffsethigh.toInt(), nnumberofbytestounlocklow.toInt(), nnumberofbytestounlockhigh.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlockFileEx(hfile: Handle, dwreserved: UInt, nnumberofbytestounlocklow: UInt, nnumberofbytestounlockhigh: UInt, lpoverlapped: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_unlockFileEx((hfile?.value ?: 0L).toString(), dwreserved.toInt(), nnumberofbytestounlocklow.toInt(), nnumberofbytestounlockhigh.toInt(), (lpoverlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun validateLog(pszlogfilename: Pcwstr, psalogfile: COpaquePointer?, pinfobuffer: COpaquePointer?, pcbbuffer: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_validateLog((pszlogfilename?.value ?: 0L).toString(), (psalogfile?.value ?: 0L).toString(), (pinfobuffer?.value ?: 0L).toString(), (pcbbuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verFindFileA(uflags: VerFindFileFlags, szfilename: Pcstr, szwindir: Pcstr, szappdir: Pcstr, szcurdir: Pstr, pucurdirlen: COpaquePointer?, szdestdir: Pstr, pudestdirlen: COpaquePointer?): VerFindFileStatus =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_verFindFileA(uflags.toInt(), (szfilename?.value ?: 0L).toString(), (szwindir?.value ?: 0L).toString(), (szappdir?.value ?: 0L).toString(), (szcurdir?.value ?: 0L).toString(), (pucurdirlen?.value ?: 0L).toString(), (szdestdir?.value ?: 0L).toString(), (pudestdirlen?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verFindFileW(uflags: VerFindFileFlags, szfilename: Pcwstr, szwindir: Pcwstr, szappdir: Pcwstr, szcurdir: Pwstr, pucurdirlen: COpaquePointer?, szdestdir: Pwstr, pudestdirlen: COpaquePointer?): VerFindFileStatus =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_verFindFileW(uflags.toInt(), (szfilename?.value ?: 0L).toString(), (szwindir?.value ?: 0L).toString(), (szappdir?.value ?: 0L).toString(), (szcurdir?.value ?: 0L).toString(), (pucurdirlen?.value ?: 0L).toString(), (szdestdir?.value ?: 0L).toString(), (pudestdirlen?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verInstallFileA(uflags: VerInstallFileFlags, szsrcfilename: Pcstr, szdestfilename: Pcstr, szsrcdir: Pcstr, szdestdir: Pcstr, szcurdir: Pcstr, sztmpfile: Pstr, putmpfilelen: COpaquePointer?): VerInstallFileStatus =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_verInstallFileA(uflags.toInt(), (szsrcfilename?.value ?: 0L).toString(), (szdestfilename?.value ?: 0L).toString(), (szsrcdir?.value ?: 0L).toString(), (szdestdir?.value ?: 0L).toString(), (szcurdir?.value ?: 0L).toString(), (sztmpfile?.value ?: 0L).toString(), (putmpfilelen?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verInstallFileW(uflags: VerInstallFileFlags, szsrcfilename: Pcwstr, szdestfilename: Pcwstr, szsrcdir: Pcwstr, szdestdir: Pcwstr, szcurdir: Pcwstr, sztmpfile: Pwstr, putmpfilelen: COpaquePointer?): VerInstallFileStatus =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_verInstallFileW(uflags.toInt(), (szsrcfilename?.value ?: 0L).toString(), (szdestfilename?.value ?: 0L).toString(), (szsrcdir?.value ?: 0L).toString(), (szdestdir?.value ?: 0L).toString(), (szcurdir?.value ?: 0L).toString(), (sztmpfile?.value ?: 0L).toString(), (putmpfilelen?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verLanguageNameA(wlang: UInt, szlang: Pstr, cchlang: UInt): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_verLanguageNameA(wlang.toInt(), (szlang?.value ?: 0L).toString(), cchlang.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verLanguageNameW(wlang: UInt, szlang: Pwstr, cchlang: UInt): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_verLanguageNameW(wlang.toInt(), (szlang?.value ?: 0L).toString(), cchlang.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verQueryValueA(pblock: COpaquePointer?, lpsubblock: Pcstr, lplpbuffer: COpaquePointer?, pulen: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_verQueryValueA((pblock?.value ?: 0L).toString(), (lpsubblock?.value ?: 0L).toString(), (lplpbuffer?.value ?: 0L).toString(), (pulen?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verQueryValueW(pblock: COpaquePointer?, lpsubblock: Pcwstr, lplpbuffer: COpaquePointer?, pulen: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_verQueryValueW((pblock?.value ?: 0L).toString(), (lpsubblock?.value ?: 0L).toString(), (lplpbuffer?.value ?: 0L).toString(), (pulen?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wofEnumEntries(volumename: Pcwstr, provider: UInt, enumproc: WofEnumEntryProc, userdata: COpaquePointer?): Hresult =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_wofEnumEntries((volumename?.value ?: 0L).toString(), provider.toInt(), 0L.toString(), (userdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wofFileEnumFiles(volumename: Pcwstr, algorithm: UInt, enumproc: WofEnumFilesProc, userdata: COpaquePointer?): Hresult =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_wofFileEnumFiles((volumename?.value ?: 0L).toString(), algorithm.toInt(), 0L.toString(), (userdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wofGetDriverVersion(fileorvolumehandle: Handle, provider: UInt, wofversion: COpaquePointer?): Hresult =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_wofGetDriverVersion((fileorvolumehandle?.value ?: 0L).toString(), provider.toInt(), (wofversion?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wofIsExternalFile(filepath: Pcwstr, isexternalfile: COpaquePointer?, provider: COpaquePointer?, externalfileinfo: COpaquePointer?, bufferlength: COpaquePointer?): Hresult =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_wofIsExternalFile((filepath?.value ?: 0L).toString(), (isexternalfile?.value ?: 0L).toString(), (provider?.value ?: 0L).toString(), (externalfileinfo?.value ?: 0L).toString(), (bufferlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wofSetFileDataLocation(filehandle: Handle, provider: UInt, externalfileinfo: COpaquePointer?, length: UInt): Hresult =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_wofSetFileDataLocation((filehandle?.value ?: 0L).toString(), provider.toInt(), (externalfileinfo?.value ?: 0L).toString(), length.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wofShouldCompressBinaries(volume: Pcwstr, algorithm: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_wofShouldCompressBinaries((volume?.value ?: 0L).toString(), (algorithm?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wofWimAddEntry(volumename: Pcwstr, wimpath: Pcwstr, wimtype: UInt, wimindex: UInt, datasourceid: COpaquePointer?): Hresult =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_wofWimAddEntry((volumename?.value ?: 0L).toString(), (wimpath?.value ?: 0L).toString(), wimtype.toInt(), wimindex.toInt(), (datasourceid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wofWimEnumFiles(volumename: Pcwstr, datasourceid: Long, enumproc: WofEnumFilesProc, userdata: COpaquePointer?): Hresult =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_wofWimEnumFiles((volumename?.value ?: 0L).toString(), datasourceid.toString(), 0L.toString(), (userdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wofWimRemoveEntry(volumename: Pcwstr, datasourceid: Long): Hresult =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_wofWimRemoveEntry((volumename?.value ?: 0L).toString(), datasourceid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wofWimSuspendEntry(volumename: Pcwstr, datasourceid: Long): Hresult =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_wofWimSuspendEntry((volumename?.value ?: 0L).toString(), datasourceid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wofWimUpdateEntry(volumename: Pcwstr, datasourceid: Long, newwimpath: Pcwstr): Hresult =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_wofWimUpdateEntry((volumename?.value ?: 0L).toString(), datasourceid.toString(), (newwimpath?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wow64DisableWow64FsRedirection(oldvalue: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_wow64DisableWow64FsRedirection((oldvalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wow64EnableWow64FsRedirection(wow64fsenableredirection: Boolean): Boolean =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_wow64EnableWow64FsRedirection(wow64fsenableredirection) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wow64RevertWow64FsRedirection(olvalue: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_wow64RevertWow64FsRedirection((olvalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeEncryptedFileRaw(pfimportcallback: PfeImportFunc, pvcallbackcontext: COpaquePointer?, pvcontext: COpaquePointer?): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_writeEncryptedFileRaw(0L.toString(), (pvcallbackcontext?.value ?: 0L).toString(), (pvcontext?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeFile(hfile: Handle, lpbuffer: COpaquePointer?, nnumberofbytestowrite: UInt, lpnumberofbyteswritten: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_writeFile((hfile?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), nnumberofbytestowrite.toInt(), (lpnumberofbyteswritten?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeFileEx(hfile: Handle, lpbuffer: COpaquePointer?, nnumberofbytestowrite: UInt, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpoverlappedCompletionRoutine): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_writeFileEx((hfile?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), nnumberofbytestowrite.toInt(), (lpoverlapped?.value ?: 0L).toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeFileGather(hfile: Handle, asegmentarray: COpaquePointer?, nnumberofbytestowrite: UInt, lpreserved: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_writeFileGather((hfile?.value ?: 0L).toString(), (asegmentarray?.value ?: 0L).toString(), nnumberofbytestowrite.toInt(), (lpreserved?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeLogRestartArea(pvmarshal: COpaquePointer?, pvrestartbuffer: COpaquePointer?, cbrestartbuffer: UInt, plsnbase: COpaquePointer?, fflags: ClfsFlag, pcbwritten: COpaquePointer?, plsnnext: COpaquePointer?, poverlapped: COpaquePointer?): Bool =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_writeLogRestartArea((pvmarshal?.value ?: 0L).toString(), (pvrestartbuffer?.value ?: 0L).toString(), cbrestartbuffer.toInt(), (plsnbase?.value ?: 0L).toString(), fflags.toInt(), (pcbwritten?.value ?: 0L).toString(), (plsnnext?.value ?: 0L).toString(), (poverlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeTapemark(hdevice: Handle, dwtapemarktype: TapemarkType, dwtapemarkcount: UInt, bimmediate: Bool): UInt =
    if (_windowsWin32StorageFilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_filesystem_writeTapemark((hdevice?.value ?: 0L).toString(), dwtapemarktype.toInt(), dwtapemarkcount.toInt(), bimmediate).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
