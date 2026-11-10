@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.jet

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetApiPtr
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetHandle
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetTableid

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32StorageJetNapiAddon(): Boolean

private val _windowsWin32StorageJetNapiAvailable: Boolean = _initWindowsWin32StorageJetNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetAddColumnA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetAddColumnA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetAddColumnW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetAddColumnW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetAttachDatabase2A(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetAttachDatabase2A(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetAttachDatabase2W(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetAttachDatabase2W(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetAttachDatabaseA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetAttachDatabaseA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetAttachDatabaseW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetAttachDatabaseW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetBackupA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetBackupA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetBackupInstanceA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetBackupInstanceA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetBackupInstanceW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetBackupInstanceW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetBackupW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetBackupW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetBeginExternalBackup(p0)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetBeginExternalBackup(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetBeginExternalBackupInstance(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetBeginExternalBackupInstance(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetBeginSessionA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetBeginSessionA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetBeginSessionW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetBeginSessionW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetBeginTransaction(p0)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetBeginTransaction(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetBeginTransaction2(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetBeginTransaction2(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetBeginTransaction3(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetBeginTransaction3(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCloseDatabase(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCloseDatabase(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCloseFile(p0)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCloseFile(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCloseFileInstance(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCloseFileInstance(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCloseTable(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCloseTable(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCommitTransaction(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCommitTransaction(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCommitTransaction2(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCommitTransaction2(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCompactA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCompactA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCompactW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCompactW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetComputeStats(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetComputeStats(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetConfigureProcessForCrashDump(p0)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetConfigureProcessForCrashDump(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCreateDatabase2A(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCreateDatabase2A(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCreateDatabase2W(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCreateDatabase2W(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCreateDatabaseA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCreateDatabaseA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCreateDatabaseW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCreateDatabaseW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCreateIndex2A(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCreateIndex2A(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCreateIndex2W(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCreateIndex2W(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCreateIndex3A(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCreateIndex3A(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCreateIndex3W(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCreateIndex3W(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCreateIndex4A(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCreateIndex4A(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCreateIndex4W(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCreateIndex4W(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCreateIndexA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCreateIndexA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCreateIndexW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCreateIndexW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCreateInstance2A(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCreateInstance2A(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCreateInstance2W(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCreateInstance2W(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCreateInstanceA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCreateInstanceA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCreateInstanceW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCreateInstanceW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCreateTableA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCreateTableA(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex2A(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex2A(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex2W(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex2W(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex3A(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex3A(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex3W(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex3W(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex4A(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex4A(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex4W(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex4W(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCreateTableColumnIndexA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCreateTableColumnIndexA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCreateTableColumnIndexW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCreateTableColumnIndexW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetCreateTableW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetCreateTableW(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetDefragment2A(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetDefragment2A(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetDefragment2W(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetDefragment2W(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetDefragment3A(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetDefragment3A(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetDefragment3W(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetDefragment3W(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetDefragmentA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetDefragmentA(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetDefragmentW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetDefragmentW(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetDelete(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetDelete(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetDeleteColumn2A(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetDeleteColumn2A(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetDeleteColumn2W(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetDeleteColumn2W(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetDeleteColumnA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetDeleteColumnA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetDeleteColumnW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetDeleteColumnW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetDeleteIndexA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetDeleteIndexA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetDeleteIndexW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetDeleteIndexW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetDeleteTableA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetDeleteTableA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetDeleteTableW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetDeleteTableW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetDetachDatabase2A(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetDetachDatabase2A(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetDetachDatabase2W(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetDetachDatabase2W(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetDetachDatabaseA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetDetachDatabaseA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetDetachDatabaseW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetDetachDatabaseW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetDupCursor(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetDupCursor(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetDupSession(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetDupSession(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetEnableMultiInstanceA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetEnableMultiInstanceA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetEnableMultiInstanceW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetEnableMultiInstanceW(p0: String, p1: Int, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetEndExternalBackup()")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetEndExternalBackup(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetEndExternalBackupInstance(p0)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetEndExternalBackupInstance(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetEndExternalBackupInstance2(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetEndExternalBackupInstance2(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetEndSession(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetEndSession(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetEnumerateColumns(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetEnumerateColumns(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String, p8: Int, p9: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetEscrowUpdate(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetEscrowUpdate(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetExternalRestore2A(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetExternalRestore2A(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetExternalRestore2W(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetExternalRestore2W(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetExternalRestoreA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetExternalRestoreA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetExternalRestoreW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetExternalRestoreW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Int, p7: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetFreeBuffer(p0)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetFreeBuffer(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetAttachInfoA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetAttachInfoA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetAttachInfoInstanceA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetAttachInfoInstanceA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetAttachInfoInstanceW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetAttachInfoInstanceW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetAttachInfoW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetAttachInfoW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetBookmark(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetBookmark(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetColumnInfoA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetColumnInfoA(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetColumnInfoW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetColumnInfoW(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetCurrentIndexA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetCurrentIndexA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetCurrentIndexW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetCurrentIndexW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetCursorInfo(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetCursorInfo(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetDatabaseFileInfoA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetDatabaseFileInfoA(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetDatabaseFileInfoW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetDatabaseFileInfoW(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetDatabaseInfoA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetDatabaseInfoA(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetDatabaseInfoW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetDatabaseInfoW(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetErrorInfoW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetErrorInfoW(p0: String, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetIndexInfoA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetIndexInfoA(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetIndexInfoW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetIndexInfoW(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetInstanceInfoA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetInstanceInfoA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetInstanceInfoW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetInstanceInfoW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetInstanceMiscInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetInstanceMiscInfo(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetLS(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetLS(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetLock(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetLock(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetLogInfoA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetLogInfoA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetLogInfoInstance2A(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetLogInfoInstance2A(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetLogInfoInstance2W(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetLogInfoInstance2W(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetLogInfoInstanceA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetLogInfoInstanceA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetLogInfoInstanceW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetLogInfoInstanceW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetLogInfoW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetLogInfoW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetObjectInfoA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetObjectInfoA(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: Int, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetObjectInfoW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetObjectInfoW(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: Int, p7: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetRecordPosition(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetRecordPosition(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetRecordSize(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetRecordSize(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetRecordSize2(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetRecordSize2(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetSecondaryIndexBookmark(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetSecondaryIndexBookmark(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetSessionParameter(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetSessionParameter(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetSystemParameterA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetSystemParameterA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetSystemParameterW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetSystemParameterW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetTableColumnInfoA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetTableColumnInfoA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetTableColumnInfoW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetTableColumnInfoW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetTableIndexInfoA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetTableIndexInfoA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetTableIndexInfoW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetTableIndexInfoW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetTableInfoA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetTableInfoA(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetTableInfoW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetTableInfoW(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetThreadStats(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetThreadStats(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetTruncateLogInfoInstanceA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetTruncateLogInfoInstanceA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetTruncateLogInfoInstanceW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetTruncateLogInfoInstanceW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGetVersion(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGetVersion(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGotoBookmark(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGotoBookmark(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGotoPosition(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGotoPosition(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGotoSecondaryIndexBookmark(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGotoSecondaryIndexBookmark(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetGrowDatabase(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetGrowDatabase(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetIdle(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetIdle(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetIndexRecordCount(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetIndexRecordCount(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetInit(p0)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetInit(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetInit2(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetInit2(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetInit3A(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetInit3A(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetInit3W(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetInit3W(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetIntersectIndexes(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetIntersectIndexes(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetMakeKey(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetMakeKey(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetMove(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetMove(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetOSSnapshotAbort(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetOSSnapshotAbort(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetOSSnapshotEnd(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetOSSnapshotEnd(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetOSSnapshotFreezeA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetOSSnapshotFreezeA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetOSSnapshotFreezeW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetOSSnapshotFreezeW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetOSSnapshotGetFreezeInfoA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetOSSnapshotGetFreezeInfoA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetOSSnapshotGetFreezeInfoW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetOSSnapshotGetFreezeInfoW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetOSSnapshotPrepare(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetOSSnapshotPrepare(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetOSSnapshotPrepareInstance(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetOSSnapshotPrepareInstance(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetOSSnapshotThaw(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetOSSnapshotThaw(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetOSSnapshotTruncateLog(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetOSSnapshotTruncateLog(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetOSSnapshotTruncateLogInstance(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetOSSnapshotTruncateLogInstance(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetOpenDatabaseA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetOpenDatabaseA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetOpenDatabaseW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetOpenDatabaseW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetOpenFileA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetOpenFileA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetOpenFileInstanceA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetOpenFileInstanceA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetOpenFileInstanceW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetOpenFileInstanceW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetOpenFileW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetOpenFileW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetOpenTableA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetOpenTableA(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetOpenTableW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetOpenTableW(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetOpenTempTable(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetOpenTempTable(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetOpenTempTable2(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetOpenTempTable2(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetOpenTempTable3(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetOpenTempTable3(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetOpenTemporaryTable(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetOpenTemporaryTable(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetOpenTemporaryTable2(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetOpenTemporaryTable2(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetPrepareUpdate(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetPrepareUpdate(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetPrereadIndexRanges(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetPrereadIndexRanges(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetPrereadKeys(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetPrereadKeys(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetReadFile(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetReadFile(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetReadFileInstance(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetReadFileInstance(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetRegisterCallback(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetRegisterCallback(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetRenameColumnA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetRenameColumnA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetRenameColumnW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetRenameColumnW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetRenameTableA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetRenameTableA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetRenameTableW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetRenameTableW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetResetSessionContext(p0)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetResetSessionContext(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetResetTableSequential(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetResetTableSequential(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetResizeDatabase(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetResizeDatabase(p0: String, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetRestore2A(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetRestore2A(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetRestore2W(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetRestore2W(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetRestoreA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetRestoreA(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetRestoreInstanceA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetRestoreInstanceA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetRestoreInstanceW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetRestoreInstanceW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetRestoreW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetRestoreW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetRetrieveColumn(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetRetrieveColumn(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetRetrieveColumns(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetRetrieveColumns(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetRetrieveKey(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetRetrieveKey(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetRollback(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetRollback(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetSeek(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetSeek(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetSetColumn(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetSetColumn(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetSetColumnDefaultValueA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetSetColumnDefaultValueA(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetSetColumnDefaultValueW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetSetColumnDefaultValueW(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetSetColumns(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetSetColumns(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetSetCurrentIndex2A(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetSetCurrentIndex2A(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetSetCurrentIndex2W(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetSetCurrentIndex2W(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetSetCurrentIndex3A(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetSetCurrentIndex3A(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetSetCurrentIndex3W(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetSetCurrentIndex3W(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetSetCurrentIndex4A(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetSetCurrentIndex4A(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetSetCurrentIndex4W(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetSetCurrentIndex4W(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetSetCurrentIndexA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetSetCurrentIndexA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetSetCurrentIndexW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetSetCurrentIndexW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetSetCursorFilter(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetSetCursorFilter(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetSetDatabaseSizeA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetSetDatabaseSizeA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetSetDatabaseSizeW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetSetDatabaseSizeW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetSetIndexRange(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetSetIndexRange(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetSetLS(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetSetLS(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetSetSessionContext(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetSetSessionContext(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetSetSessionParameter(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetSetSessionParameter(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetSetSystemParameterA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetSetSystemParameterA(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetSetSystemParameterW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetSetSystemParameterW(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetSetTableSequential(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetSetTableSequential(p0: String, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetStopBackup()")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetStopBackup(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetStopBackupInstance(p0)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetStopBackupInstance(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetStopService()")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetStopService(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetStopServiceInstance(p0)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetStopServiceInstance(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetStopServiceInstance2(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetStopServiceInstance2(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetTerm(p0)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetTerm(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetTerm2(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetTerm2(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetTruncateLog()")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetTruncateLog(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetTruncateLogInstance(p0)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetTruncateLogInstance(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetUnregisterCallback(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetUnregisterCallback(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetUpdate(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetUpdate(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_jet_jetUpdate2(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_jet_jetUpdate2(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

public actual fun jetAddColumnA(sesid: JetSesid, tableid: JetTableid, szcolumnname: COpaquePointer?, pcolumndef: COpaquePointer?, pvdefault: COpaquePointer?, cbdefault: UInt, pcolumnid: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetAddColumnA(sesid.toString(), tableid.toString(), (szcolumnname?.value ?: 0L).toString(), (pcolumndef?.value ?: 0L).toString(), (pvdefault?.value ?: 0L).toString(), cbdefault.toInt(), (pcolumnid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetAddColumnW(sesid: JetSesid, tableid: JetTableid, szcolumnname: COpaquePointer?, pcolumndef: COpaquePointer?, pvdefault: COpaquePointer?, cbdefault: UInt, pcolumnid: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetAddColumnW(sesid.toString(), tableid.toString(), (szcolumnname?.value ?: 0L).toString(), (pcolumndef?.value ?: 0L).toString(), (pvdefault?.value ?: 0L).toString(), cbdefault.toInt(), (pcolumnid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetAttachDatabase2A(sesid: JetSesid, szfilename: COpaquePointer?, cpgdatabasesizemax: UInt, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetAttachDatabase2A(sesid.toString(), (szfilename?.value ?: 0L).toString(), cpgdatabasesizemax.toInt(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetAttachDatabase2W(sesid: JetSesid, szfilename: COpaquePointer?, cpgdatabasesizemax: UInt, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetAttachDatabase2W(sesid.toString(), (szfilename?.value ?: 0L).toString(), cpgdatabasesizemax.toInt(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetAttachDatabaseA(sesid: JetSesid, szfilename: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetAttachDatabaseA(sesid.toString(), (szfilename?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetAttachDatabaseW(sesid: JetSesid, szfilename: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetAttachDatabaseW(sesid.toString(), (szfilename?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBackupA(szbackuppath: COpaquePointer?, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetBackupA((szbackuppath?.value ?: 0L).toString(), grbit.toInt(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBackupInstanceA(instance: JetInstance, szbackuppath: COpaquePointer?, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetBackupInstanceA(instance.toString(), (szbackuppath?.value ?: 0L).toString(), grbit.toInt(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBackupInstanceW(instance: JetInstance, szbackuppath: COpaquePointer?, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetBackupInstanceW(instance.toString(), (szbackuppath?.value ?: 0L).toString(), grbit.toInt(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBackupW(szbackuppath: COpaquePointer?, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetBackupW((szbackuppath?.value ?: 0L).toString(), grbit.toInt(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBeginExternalBackup(grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetBeginExternalBackup(grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBeginExternalBackupInstance(instance: JetInstance, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetBeginExternalBackupInstance(instance.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBeginSessionA(instance: JetInstance, psesid: COpaquePointer?, szusername: COpaquePointer?, szpassword: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetBeginSessionA(instance.toString(), (psesid?.value ?: 0L).toString(), (szusername?.value ?: 0L).toString(), (szpassword?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBeginSessionW(instance: JetInstance, psesid: COpaquePointer?, szusername: COpaquePointer?, szpassword: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetBeginSessionW(instance.toString(), (psesid?.value ?: 0L).toString(), (szusername?.value ?: 0L).toString(), (szpassword?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBeginTransaction(sesid: JetSesid): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetBeginTransaction(sesid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBeginTransaction2(sesid: JetSesid, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetBeginTransaction2(sesid.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBeginTransaction3(sesid: JetSesid, trxid: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetBeginTransaction3(sesid.toString(), trxid.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCloseDatabase(sesid: JetSesid, dbid: UInt, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCloseDatabase(sesid.toString(), dbid.toInt(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCloseFile(hffile: JetHandle): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCloseFile(hffile.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCloseFileInstance(instance: JetInstance, hffile: JetHandle): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCloseFileInstance(instance.toString(), hffile.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCloseTable(sesid: JetSesid, tableid: JetTableid): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCloseTable(sesid.toString(), tableid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCommitTransaction(sesid: JetSesid, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCommitTransaction(sesid.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCommitTransaction2(sesid: JetSesid, grbit: UInt, cmsecdurablecommit: UInt, pcommitid: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCommitTransaction2(sesid.toString(), grbit.toInt(), cmsecdurablecommit.toInt(), (pcommitid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCompactA(sesid: JetSesid, szdatabasesrc: COpaquePointer?, szdatabasedest: COpaquePointer?, pfnstatus: JetPfnstatus, pconvert: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCompactA(sesid.toString(), (szdatabasesrc?.value ?: 0L).toString(), (szdatabasedest?.value ?: 0L).toString(), 0L.toString(), (pconvert?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCompactW(sesid: JetSesid, szdatabasesrc: COpaquePointer?, szdatabasedest: COpaquePointer?, pfnstatus: JetPfnstatus, pconvert: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCompactW(sesid.toString(), (szdatabasesrc?.value ?: 0L).toString(), (szdatabasedest?.value ?: 0L).toString(), 0L.toString(), (pconvert?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetComputeStats(sesid: JetSesid, tableid: JetTableid): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetComputeStats(sesid.toString(), tableid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetConfigureProcessForCrashDump(grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetConfigureProcessForCrashDump(grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateDatabase2A(sesid: JetSesid, szfilename: COpaquePointer?, cpgdatabasesizemax: UInt, pdbid: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCreateDatabase2A(sesid.toString(), (szfilename?.value ?: 0L).toString(), cpgdatabasesizemax.toInt(), (pdbid?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateDatabase2W(sesid: JetSesid, szfilename: COpaquePointer?, cpgdatabasesizemax: UInt, pdbid: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCreateDatabase2W(sesid.toString(), (szfilename?.value ?: 0L).toString(), cpgdatabasesizemax.toInt(), (pdbid?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateDatabaseA(sesid: JetSesid, szfilename: COpaquePointer?, szconnect: COpaquePointer?, pdbid: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCreateDatabaseA(sesid.toString(), (szfilename?.value ?: 0L).toString(), (szconnect?.value ?: 0L).toString(), (pdbid?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateDatabaseW(sesid: JetSesid, szfilename: COpaquePointer?, szconnect: COpaquePointer?, pdbid: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCreateDatabaseW(sesid.toString(), (szfilename?.value ?: 0L).toString(), (szconnect?.value ?: 0L).toString(), (pdbid?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateIndex2A(sesid: JetSesid, tableid: JetTableid, pindexcreate: COpaquePointer?, cindexcreate: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCreateIndex2A(sesid.toString(), tableid.toString(), (pindexcreate?.value ?: 0L).toString(), cindexcreate.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateIndex2W(sesid: JetSesid, tableid: JetTableid, pindexcreate: COpaquePointer?, cindexcreate: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCreateIndex2W(sesid.toString(), tableid.toString(), (pindexcreate?.value ?: 0L).toString(), cindexcreate.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateIndex3A(sesid: JetSesid, tableid: JetTableid, pindexcreate: COpaquePointer?, cindexcreate: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCreateIndex3A(sesid.toString(), tableid.toString(), (pindexcreate?.value ?: 0L).toString(), cindexcreate.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateIndex3W(sesid: JetSesid, tableid: JetTableid, pindexcreate: COpaquePointer?, cindexcreate: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCreateIndex3W(sesid.toString(), tableid.toString(), (pindexcreate?.value ?: 0L).toString(), cindexcreate.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateIndex4A(sesid: JetSesid, tableid: JetTableid, pindexcreate: COpaquePointer?, cindexcreate: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCreateIndex4A(sesid.toString(), tableid.toString(), (pindexcreate?.value ?: 0L).toString(), cindexcreate.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateIndex4W(sesid: JetSesid, tableid: JetTableid, pindexcreate: COpaquePointer?, cindexcreate: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCreateIndex4W(sesid.toString(), tableid.toString(), (pindexcreate?.value ?: 0L).toString(), cindexcreate.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, grbit: UInt, szkey: Pcstr, cbkey: UInt, ldensity: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCreateIndexA(sesid.toString(), tableid.toString(), (szindexname?.value ?: 0L).toString(), grbit.toInt(), (szkey?.value ?: 0L).toString(), cbkey.toInt(), ldensity.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, grbit: UInt, szkey: Pcwstr, cbkey: UInt, ldensity: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCreateIndexW(sesid.toString(), tableid.toString(), (szindexname?.value ?: 0L).toString(), grbit.toInt(), (szkey?.value ?: 0L).toString(), cbkey.toInt(), ldensity.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateInstance2A(pinstance: COpaquePointer?, szinstancename: COpaquePointer?, szdisplayname: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCreateInstance2A((pinstance?.value ?: 0L).toString(), (szinstancename?.value ?: 0L).toString(), (szdisplayname?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateInstance2W(pinstance: COpaquePointer?, szinstancename: COpaquePointer?, szdisplayname: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCreateInstance2W((pinstance?.value ?: 0L).toString(), (szinstancename?.value ?: 0L).toString(), (szdisplayname?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateInstanceA(pinstance: COpaquePointer?, szinstancename: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCreateInstanceA((pinstance?.value ?: 0L).toString(), (szinstancename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateInstanceW(pinstance: COpaquePointer?, szinstancename: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCreateInstanceW((pinstance?.value ?: 0L).toString(), (szinstancename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableA(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, lpages: UInt, ldensity: UInt, ptableid: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCreateTableA(sesid.toString(), dbid.toInt(), (sztablename?.value ?: 0L).toString(), lpages.toInt(), ldensity.toInt(), (ptableid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableColumnIndex2A(sesid: JetSesid, dbid: UInt, ptablecreate: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex2A(sesid.toString(), dbid.toInt(), (ptablecreate?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableColumnIndex2W(sesid: JetSesid, dbid: UInt, ptablecreate: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex2W(sesid.toString(), dbid.toInt(), (ptablecreate?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableColumnIndex3A(sesid: JetSesid, dbid: UInt, ptablecreate: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex3A(sesid.toString(), dbid.toInt(), (ptablecreate?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableColumnIndex3W(sesid: JetSesid, dbid: UInt, ptablecreate: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex3W(sesid.toString(), dbid.toInt(), (ptablecreate?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableColumnIndex4A(sesid: JetSesid, dbid: UInt, ptablecreate: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex4A(sesid.toString(), dbid.toInt(), (ptablecreate?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableColumnIndex4W(sesid: JetSesid, dbid: UInt, ptablecreate: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex4W(sesid.toString(), dbid.toInt(), (ptablecreate?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableColumnIndexA(sesid: JetSesid, dbid: UInt, ptablecreate: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCreateTableColumnIndexA(sesid.toString(), dbid.toInt(), (ptablecreate?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableColumnIndexW(sesid: JetSesid, dbid: UInt, ptablecreate: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCreateTableColumnIndexW(sesid.toString(), dbid.toInt(), (ptablecreate?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableW(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, lpages: UInt, ldensity: UInt, ptableid: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetCreateTableW(sesid.toString(), dbid.toInt(), (sztablename?.value ?: 0L).toString(), lpages.toInt(), ldensity.toInt(), (ptableid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDefragment2A(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, pcpasses: COpaquePointer?, pcseconds: COpaquePointer?, callback: JetCallback, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetDefragment2A(sesid.toString(), dbid.toInt(), (sztablename?.value ?: 0L).toString(), (pcpasses?.value ?: 0L).toString(), (pcseconds?.value ?: 0L).toString(), 0L.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDefragment2W(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, pcpasses: COpaquePointer?, pcseconds: COpaquePointer?, callback: JetCallback, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetDefragment2W(sesid.toString(), dbid.toInt(), (sztablename?.value ?: 0L).toString(), (pcpasses?.value ?: 0L).toString(), (pcseconds?.value ?: 0L).toString(), 0L.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDefragment3A(sesid: JetSesid, szdatabasename: COpaquePointer?, sztablename: COpaquePointer?, pcpasses: COpaquePointer?, pcseconds: COpaquePointer?, callback: JetCallback, pvcontext: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetDefragment3A(sesid.toString(), (szdatabasename?.value ?: 0L).toString(), (sztablename?.value ?: 0L).toString(), (pcpasses?.value ?: 0L).toString(), (pcseconds?.value ?: 0L).toString(), 0L.toString(), (pvcontext?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDefragment3W(sesid: JetSesid, szdatabasename: COpaquePointer?, sztablename: COpaquePointer?, pcpasses: COpaquePointer?, pcseconds: COpaquePointer?, callback: JetCallback, pvcontext: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetDefragment3W(sesid.toString(), (szdatabasename?.value ?: 0L).toString(), (sztablename?.value ?: 0L).toString(), (pcpasses?.value ?: 0L).toString(), (pcseconds?.value ?: 0L).toString(), 0L.toString(), (pvcontext?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDefragmentA(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, pcpasses: COpaquePointer?, pcseconds: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetDefragmentA(sesid.toString(), dbid.toInt(), (sztablename?.value ?: 0L).toString(), (pcpasses?.value ?: 0L).toString(), (pcseconds?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDefragmentW(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, pcpasses: COpaquePointer?, pcseconds: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetDefragmentW(sesid.toString(), dbid.toInt(), (sztablename?.value ?: 0L).toString(), (pcpasses?.value ?: 0L).toString(), (pcseconds?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDelete(sesid: JetSesid, tableid: JetTableid): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetDelete(sesid.toString(), tableid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDeleteColumn2A(sesid: JetSesid, tableid: JetTableid, szcolumnname: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetDeleteColumn2A(sesid.toString(), tableid.toString(), (szcolumnname?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDeleteColumn2W(sesid: JetSesid, tableid: JetTableid, szcolumnname: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetDeleteColumn2W(sesid.toString(), tableid.toString(), (szcolumnname?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDeleteColumnA(sesid: JetSesid, tableid: JetTableid, szcolumnname: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetDeleteColumnA(sesid.toString(), tableid.toString(), (szcolumnname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDeleteColumnW(sesid: JetSesid, tableid: JetTableid, szcolumnname: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetDeleteColumnW(sesid.toString(), tableid.toString(), (szcolumnname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDeleteIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetDeleteIndexA(sesid.toString(), tableid.toString(), (szindexname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDeleteIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetDeleteIndexW(sesid.toString(), tableid.toString(), (szindexname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDeleteTableA(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetDeleteTableA(sesid.toString(), dbid.toInt(), (sztablename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDeleteTableW(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetDeleteTableW(sesid.toString(), dbid.toInt(), (sztablename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDetachDatabase2A(sesid: JetSesid, szfilename: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetDetachDatabase2A(sesid.toString(), (szfilename?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDetachDatabase2W(sesid: JetSesid, szfilename: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetDetachDatabase2W(sesid.toString(), (szfilename?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDetachDatabaseA(sesid: JetSesid, szfilename: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetDetachDatabaseA(sesid.toString(), (szfilename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDetachDatabaseW(sesid: JetSesid, szfilename: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetDetachDatabaseW(sesid.toString(), (szfilename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDupCursor(sesid: JetSesid, tableid: JetTableid, ptableid: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetDupCursor(sesid.toString(), tableid.toString(), (ptableid?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDupSession(sesid: JetSesid, psesid: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetDupSession(sesid.toString(), (psesid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetEnableMultiInstanceA(psetsysparam: COpaquePointer?, csetsysparam: UInt, pcsetsucceed: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetEnableMultiInstanceA((psetsysparam?.value ?: 0L).toString(), csetsysparam.toInt(), (pcsetsucceed?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetEnableMultiInstanceW(psetsysparam: COpaquePointer?, csetsysparam: UInt, pcsetsucceed: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetEnableMultiInstanceW((psetsysparam?.value ?: 0L).toString(), csetsysparam.toInt(), (pcsetsucceed?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetEndExternalBackup(): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetEndExternalBackup() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetEndExternalBackupInstance(instance: JetInstance): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetEndExternalBackupInstance(instance.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetEndExternalBackupInstance2(instance: JetInstance, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetEndExternalBackupInstance2(instance.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetEndSession(sesid: JetSesid, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetEndSession(sesid.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetEnumerateColumns(sesid: JetSesid, tableid: JetTableid, cenumcolumnid: UInt, rgenumcolumnid: COpaquePointer?, pcenumcolumn: COpaquePointer?, prgenumcolumn: COpaquePointer?, pfnrealloc: JetPfnrealloc, pvrealloccontext: COpaquePointer?, cbdatamost: UInt, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetEnumerateColumns(sesid.toString(), tableid.toString(), cenumcolumnid.toInt(), (rgenumcolumnid?.value ?: 0L).toString(), (pcenumcolumn?.value ?: 0L).toString(), (prgenumcolumn?.value ?: 0L).toString(), 0L.toString(), (pvrealloccontext?.value ?: 0L).toString(), cbdatamost.toInt(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetEscrowUpdate(sesid: JetSesid, tableid: JetTableid, columnid: UInt, pv: COpaquePointer?, cbmax: UInt, pvold: COpaquePointer?, cboldmax: UInt, pcboldactual: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetEscrowUpdate(sesid.toString(), tableid.toString(), columnid.toInt(), (pv?.value ?: 0L).toString(), cbmax.toInt(), (pvold?.value ?: 0L).toString(), cboldmax.toInt(), (pcboldactual?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetExternalRestore2A(szcheckpointfilepath: COpaquePointer?, szlogpath: COpaquePointer?, rgrstmap: COpaquePointer?, crstfilemap: Int, szbackuplogpath: COpaquePointer?, ploginfo: COpaquePointer?, sztargetinstancename: COpaquePointer?, sztargetinstancelogpath: COpaquePointer?, sztargetinstancecheckpointpath: COpaquePointer?, pfn: JetPfnstatus): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetExternalRestore2A((szcheckpointfilepath?.value ?: 0L).toString(), (szlogpath?.value ?: 0L).toString(), (rgrstmap?.value ?: 0L).toString(), crstfilemap, (szbackuplogpath?.value ?: 0L).toString(), (ploginfo?.value ?: 0L).toString(), (sztargetinstancename?.value ?: 0L).toString(), (sztargetinstancelogpath?.value ?: 0L).toString(), (sztargetinstancecheckpointpath?.value ?: 0L).toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetExternalRestore2W(szcheckpointfilepath: COpaquePointer?, szlogpath: COpaquePointer?, rgrstmap: COpaquePointer?, crstfilemap: Int, szbackuplogpath: COpaquePointer?, ploginfo: COpaquePointer?, sztargetinstancename: COpaquePointer?, sztargetinstancelogpath: COpaquePointer?, sztargetinstancecheckpointpath: COpaquePointer?, pfn: JetPfnstatus): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetExternalRestore2W((szcheckpointfilepath?.value ?: 0L).toString(), (szlogpath?.value ?: 0L).toString(), (rgrstmap?.value ?: 0L).toString(), crstfilemap, (szbackuplogpath?.value ?: 0L).toString(), (ploginfo?.value ?: 0L).toString(), (sztargetinstancename?.value ?: 0L).toString(), (sztargetinstancelogpath?.value ?: 0L).toString(), (sztargetinstancecheckpointpath?.value ?: 0L).toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetExternalRestoreA(szcheckpointfilepath: COpaquePointer?, szlogpath: COpaquePointer?, rgrstmap: COpaquePointer?, crstfilemap: Int, szbackuplogpath: COpaquePointer?, genlow: Int, genhigh: Int, pfn: JetPfnstatus): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetExternalRestoreA((szcheckpointfilepath?.value ?: 0L).toString(), (szlogpath?.value ?: 0L).toString(), (rgrstmap?.value ?: 0L).toString(), crstfilemap, (szbackuplogpath?.value ?: 0L).toString(), genlow, genhigh, 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetExternalRestoreW(szcheckpointfilepath: COpaquePointer?, szlogpath: COpaquePointer?, rgrstmap: COpaquePointer?, crstfilemap: Int, szbackuplogpath: COpaquePointer?, genlow: Int, genhigh: Int, pfn: JetPfnstatus): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetExternalRestoreW((szcheckpointfilepath?.value ?: 0L).toString(), (szlogpath?.value ?: 0L).toString(), (rgrstmap?.value ?: 0L).toString(), crstfilemap, (szbackuplogpath?.value ?: 0L).toString(), genlow, genhigh, 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetFreeBuffer(pbbuf: Pcstr): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetFreeBuffer((pbbuf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetAttachInfoA(szzdatabases: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetAttachInfoA((szzdatabases?.value ?: 0L).toString(), cbmax.toInt(), (pcbactual?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetAttachInfoInstanceA(instance: JetInstance, szzdatabases: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetAttachInfoInstanceA(instance.toString(), (szzdatabases?.value ?: 0L).toString(), cbmax.toInt(), (pcbactual?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetAttachInfoInstanceW(instance: JetInstance, szzdatabases: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetAttachInfoInstanceW(instance.toString(), (szzdatabases?.value ?: 0L).toString(), cbmax.toInt(), (pcbactual?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetAttachInfoW(wszzdatabases: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetAttachInfoW((wszzdatabases?.value ?: 0L).toString(), cbmax.toInt(), (pcbactual?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetBookmark(sesid: JetSesid, tableid: JetTableid, pvbookmark: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetBookmark(sesid.toString(), tableid.toString(), (pvbookmark?.value ?: 0L).toString(), cbmax.toInt(), (pcbactual?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetColumnInfoA(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, pcolumnnameorid: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetColumnInfoA(sesid.toString(), dbid.toInt(), (sztablename?.value ?: 0L).toString(), (pcolumnnameorid?.value ?: 0L).toString(), (pvresult?.value ?: 0L).toString(), cbmax.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetColumnInfoW(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, pwcolumnnameorid: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetColumnInfoW(sesid.toString(), dbid.toInt(), (sztablename?.value ?: 0L).toString(), (pwcolumnnameorid?.value ?: 0L).toString(), (pvresult?.value ?: 0L).toString(), cbmax.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetCurrentIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, cbindexname: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetCurrentIndexA(sesid.toString(), tableid.toString(), (szindexname?.value ?: 0L).toString(), cbindexname.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetCurrentIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, cbindexname: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetCurrentIndexW(sesid.toString(), tableid.toString(), (szindexname?.value ?: 0L).toString(), cbindexname.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetCursorInfo(sesid: JetSesid, tableid: JetTableid, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetCursorInfo(sesid.toString(), tableid.toString(), (pvresult?.value ?: 0L).toString(), cbmax.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetDatabaseFileInfoA(szdatabasename: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetDatabaseFileInfoA((szdatabasename?.value ?: 0L).toString(), (pvresult?.value ?: 0L).toString(), cbmax.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetDatabaseFileInfoW(szdatabasename: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetDatabaseFileInfoW((szdatabasename?.value ?: 0L).toString(), (pvresult?.value ?: 0L).toString(), cbmax.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetDatabaseInfoA(sesid: JetSesid, dbid: UInt, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetDatabaseInfoA(sesid.toString(), dbid.toInt(), (pvresult?.value ?: 0L).toString(), cbmax.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetDatabaseInfoW(sesid: JetSesid, dbid: UInt, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetDatabaseInfoW(sesid.toString(), dbid.toInt(), (pvresult?.value ?: 0L).toString(), cbmax.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetErrorInfoW(pvcontext: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetErrorInfoW((pvcontext?.value ?: 0L).toString(), (pvresult?.value ?: 0L).toString(), cbmax.toInt(), infolevel.toInt(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetIndexInfoA(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, szindexname: COpaquePointer?, pvresult: COpaquePointer?, cbresult: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetIndexInfoA(sesid.toString(), dbid.toInt(), (sztablename?.value ?: 0L).toString(), (szindexname?.value ?: 0L).toString(), (pvresult?.value ?: 0L).toString(), cbresult.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetIndexInfoW(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, szindexname: COpaquePointer?, pvresult: COpaquePointer?, cbresult: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetIndexInfoW(sesid.toString(), dbid.toInt(), (sztablename?.value ?: 0L).toString(), (szindexname?.value ?: 0L).toString(), (pvresult?.value ?: 0L).toString(), cbresult.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetInstanceInfoA(pcinstanceinfo: COpaquePointer?, painstanceinfo: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetInstanceInfoA((pcinstanceinfo?.value ?: 0L).toString(), (painstanceinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetInstanceInfoW(pcinstanceinfo: COpaquePointer?, painstanceinfo: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetInstanceInfoW((pcinstanceinfo?.value ?: 0L).toString(), (painstanceinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetInstanceMiscInfo(instance: JetInstance, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetInstanceMiscInfo(instance.toString(), (pvresult?.value ?: 0L).toString(), cbmax.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetLS(sesid: JetSesid, tableid: JetTableid, pls: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetLS(sesid.toString(), tableid.toString(), (pls?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetLock(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetLock(sesid.toString(), tableid.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetLogInfoA(szzlogs: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetLogInfoA((szzlogs?.value ?: 0L).toString(), cbmax.toInt(), (pcbactual?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetLogInfoInstance2A(instance: JetInstance, szzlogs: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?, ploginfo: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetLogInfoInstance2A(instance.toString(), (szzlogs?.value ?: 0L).toString(), cbmax.toInt(), (pcbactual?.value ?: 0L).toString(), (ploginfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetLogInfoInstance2W(instance: JetInstance, wszzlogs: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?, ploginfo: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetLogInfoInstance2W(instance.toString(), (wszzlogs?.value ?: 0L).toString(), cbmax.toInt(), (pcbactual?.value ?: 0L).toString(), (ploginfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetLogInfoInstanceA(instance: JetInstance, szzlogs: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetLogInfoInstanceA(instance.toString(), (szzlogs?.value ?: 0L).toString(), cbmax.toInt(), (pcbactual?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetLogInfoInstanceW(instance: JetInstance, wszzlogs: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetLogInfoInstanceW(instance.toString(), (wszzlogs?.value ?: 0L).toString(), cbmax.toInt(), (pcbactual?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetLogInfoW(szzlogs: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetLogInfoW((szzlogs?.value ?: 0L).toString(), cbmax.toInt(), (pcbactual?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetObjectInfoA(sesid: JetSesid, dbid: UInt, objtyp: UInt, szcontainername: COpaquePointer?, szobjectname: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetObjectInfoA(sesid.toString(), dbid.toInt(), objtyp.toInt(), (szcontainername?.value ?: 0L).toString(), (szobjectname?.value ?: 0L).toString(), (pvresult?.value ?: 0L).toString(), cbmax.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetObjectInfoW(sesid: JetSesid, dbid: UInt, objtyp: UInt, szcontainername: COpaquePointer?, szobjectname: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetObjectInfoW(sesid.toString(), dbid.toInt(), objtyp.toInt(), (szcontainername?.value ?: 0L).toString(), (szobjectname?.value ?: 0L).toString(), (pvresult?.value ?: 0L).toString(), cbmax.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetRecordPosition(sesid: JetSesid, tableid: JetTableid, precpos: COpaquePointer?, cbrecpos: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetRecordPosition(sesid.toString(), tableid.toString(), (precpos?.value ?: 0L).toString(), cbrecpos.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetRecordSize(sesid: JetSesid, tableid: JetTableid, precsize: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetRecordSize(sesid.toString(), tableid.toString(), (precsize?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetRecordSize2(sesid: JetSesid, tableid: JetTableid, precsize: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetRecordSize2(sesid.toString(), tableid.toString(), (precsize?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetSecondaryIndexBookmark(sesid: JetSesid, tableid: JetTableid, pvsecondarykey: COpaquePointer?, cbsecondarykeymax: UInt, pcbsecondarykeyactual: COpaquePointer?, pvprimarybookmark: COpaquePointer?, cbprimarybookmarkmax: UInt, pcbprimarybookmarkactual: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetSecondaryIndexBookmark(sesid.toString(), tableid.toString(), (pvsecondarykey?.value ?: 0L).toString(), cbsecondarykeymax.toInt(), (pcbsecondarykeyactual?.value ?: 0L).toString(), (pvprimarybookmark?.value ?: 0L).toString(), cbprimarybookmarkmax.toInt(), (pcbprimarybookmarkactual?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetSessionParameter(sesid: JetSesid, sesparamid: UInt, pvparam: COpaquePointer?, cbparammax: UInt, pcbparamactual: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetSessionParameter(sesid.toString(), sesparamid.toInt(), (pvparam?.value ?: 0L).toString(), cbparammax.toInt(), (pcbparamactual?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetSystemParameterA(instance: JetInstance, sesid: JetSesid, paramid: UInt, plparam: COpaquePointer?, szparam: COpaquePointer?, cbmax: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetSystemParameterA(instance.toString(), sesid.toString(), paramid.toInt(), (plparam?.value ?: 0L).toString(), (szparam?.value ?: 0L).toString(), cbmax.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetSystemParameterW(instance: JetInstance, sesid: JetSesid, paramid: UInt, plparam: COpaquePointer?, szparam: COpaquePointer?, cbmax: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetSystemParameterW(instance.toString(), sesid.toString(), paramid.toInt(), (plparam?.value ?: 0L).toString(), (szparam?.value ?: 0L).toString(), cbmax.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetTableColumnInfoA(sesid: JetSesid, tableid: JetTableid, szcolumnname: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetTableColumnInfoA(sesid.toString(), tableid.toString(), (szcolumnname?.value ?: 0L).toString(), (pvresult?.value ?: 0L).toString(), cbmax.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetTableColumnInfoW(sesid: JetSesid, tableid: JetTableid, szcolumnname: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetTableColumnInfoW(sesid.toString(), tableid.toString(), (szcolumnname?.value ?: 0L).toString(), (pvresult?.value ?: 0L).toString(), cbmax.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetTableIndexInfoA(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, pvresult: COpaquePointer?, cbresult: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetTableIndexInfoA(sesid.toString(), tableid.toString(), (szindexname?.value ?: 0L).toString(), (pvresult?.value ?: 0L).toString(), cbresult.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetTableIndexInfoW(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, pvresult: COpaquePointer?, cbresult: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetTableIndexInfoW(sesid.toString(), tableid.toString(), (szindexname?.value ?: 0L).toString(), (pvresult?.value ?: 0L).toString(), cbresult.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetTableInfoA(sesid: JetSesid, tableid: JetTableid, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetTableInfoA(sesid.toString(), tableid.toString(), (pvresult?.value ?: 0L).toString(), cbmax.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetTableInfoW(sesid: JetSesid, tableid: JetTableid, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetTableInfoW(sesid.toString(), tableid.toString(), (pvresult?.value ?: 0L).toString(), cbmax.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetThreadStats(pvresult: COpaquePointer?, cbmax: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetThreadStats((pvresult?.value ?: 0L).toString(), cbmax.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetTruncateLogInfoInstanceA(instance: JetInstance, szzlogs: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetTruncateLogInfoInstanceA(instance.toString(), (szzlogs?.value ?: 0L).toString(), cbmax.toInt(), (pcbactual?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetTruncateLogInfoInstanceW(instance: JetInstance, wszzlogs: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetTruncateLogInfoInstanceW(instance.toString(), (wszzlogs?.value ?: 0L).toString(), cbmax.toInt(), (pcbactual?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetVersion(sesid: JetSesid, pwversion: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGetVersion(sesid.toString(), (pwversion?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGotoBookmark(sesid: JetSesid, tableid: JetTableid, pvbookmark: COpaquePointer?, cbbookmark: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGotoBookmark(sesid.toString(), tableid.toString(), (pvbookmark?.value ?: 0L).toString(), cbbookmark.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGotoPosition(sesid: JetSesid, tableid: JetTableid, precpos: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGotoPosition(sesid.toString(), tableid.toString(), (precpos?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGotoSecondaryIndexBookmark(sesid: JetSesid, tableid: JetTableid, pvsecondarykey: COpaquePointer?, cbsecondarykey: UInt, pvprimarybookmark: COpaquePointer?, cbprimarybookmark: UInt, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGotoSecondaryIndexBookmark(sesid.toString(), tableid.toString(), (pvsecondarykey?.value ?: 0L).toString(), cbsecondarykey.toInt(), (pvprimarybookmark?.value ?: 0L).toString(), cbprimarybookmark.toInt(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGrowDatabase(sesid: JetSesid, dbid: UInt, cpg: UInt, pcpgreal: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetGrowDatabase(sesid.toString(), dbid.toInt(), cpg.toInt(), (pcpgreal?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetIdle(sesid: JetSesid, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetIdle(sesid.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetIndexRecordCount(sesid: JetSesid, tableid: JetTableid, pcrec: COpaquePointer?, crecmax: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetIndexRecordCount(sesid.toString(), tableid.toString(), (pcrec?.value ?: 0L).toString(), crecmax.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetInit(pinstance: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetInit((pinstance?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetInit2(pinstance: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetInit2((pinstance?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetInit3A(pinstance: COpaquePointer?, prstinfo: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetInit3A((pinstance?.value ?: 0L).toString(), (prstinfo?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetInit3W(pinstance: COpaquePointer?, prstinfo: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetInit3W((pinstance?.value ?: 0L).toString(), (prstinfo?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetIntersectIndexes(sesid: JetSesid, rgindexrange: COpaquePointer?, cindexrange: UInt, precordlist: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetIntersectIndexes(sesid.toString(), (rgindexrange?.value ?: 0L).toString(), cindexrange.toInt(), (precordlist?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetMakeKey(sesid: JetSesid, tableid: JetTableid, pvdata: COpaquePointer?, cbdata: UInt, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetMakeKey(sesid.toString(), tableid.toString(), (pvdata?.value ?: 0L).toString(), cbdata.toInt(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetMove(sesid: JetSesid, tableid: JetTableid, crow: Int, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetMove(sesid.toString(), tableid.toString(), crow, grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotAbort(snapid: JetOssnapid, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetOSSnapshotAbort(snapid.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotEnd(snapid: JetOssnapid, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetOSSnapshotEnd(snapid.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotFreezeA(snapid: JetOssnapid, pcinstanceinfo: COpaquePointer?, painstanceinfo: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetOSSnapshotFreezeA(snapid.toString(), (pcinstanceinfo?.value ?: 0L).toString(), (painstanceinfo?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotFreezeW(snapid: JetOssnapid, pcinstanceinfo: COpaquePointer?, painstanceinfo: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetOSSnapshotFreezeW(snapid.toString(), (pcinstanceinfo?.value ?: 0L).toString(), (painstanceinfo?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotGetFreezeInfoA(snapid: JetOssnapid, pcinstanceinfo: COpaquePointer?, painstanceinfo: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetOSSnapshotGetFreezeInfoA(snapid.toString(), (pcinstanceinfo?.value ?: 0L).toString(), (painstanceinfo?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotGetFreezeInfoW(snapid: JetOssnapid, pcinstanceinfo: COpaquePointer?, painstanceinfo: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetOSSnapshotGetFreezeInfoW(snapid.toString(), (pcinstanceinfo?.value ?: 0L).toString(), (painstanceinfo?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotPrepare(psnapid: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetOSSnapshotPrepare((psnapid?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotPrepareInstance(snapid: JetOssnapid, instance: JetInstance, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetOSSnapshotPrepareInstance(snapid.toString(), instance.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotThaw(snapid: JetOssnapid, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetOSSnapshotThaw(snapid.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotTruncateLog(snapid: JetOssnapid, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetOSSnapshotTruncateLog(snapid.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotTruncateLogInstance(snapid: JetOssnapid, instance: JetInstance, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetOSSnapshotTruncateLogInstance(snapid.toString(), instance.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenDatabaseA(sesid: JetSesid, szfilename: COpaquePointer?, szconnect: COpaquePointer?, pdbid: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetOpenDatabaseA(sesid.toString(), (szfilename?.value ?: 0L).toString(), (szconnect?.value ?: 0L).toString(), (pdbid?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenDatabaseW(sesid: JetSesid, szfilename: COpaquePointer?, szconnect: COpaquePointer?, pdbid: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetOpenDatabaseW(sesid.toString(), (szfilename?.value ?: 0L).toString(), (szconnect?.value ?: 0L).toString(), (pdbid?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenFileA(szfilename: COpaquePointer?, phffile: COpaquePointer?, pulfilesizelow: COpaquePointer?, pulfilesizehigh: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetOpenFileA((szfilename?.value ?: 0L).toString(), (phffile?.value ?: 0L).toString(), (pulfilesizelow?.value ?: 0L).toString(), (pulfilesizehigh?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenFileInstanceA(instance: JetInstance, szfilename: COpaquePointer?, phffile: COpaquePointer?, pulfilesizelow: COpaquePointer?, pulfilesizehigh: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetOpenFileInstanceA(instance.toString(), (szfilename?.value ?: 0L).toString(), (phffile?.value ?: 0L).toString(), (pulfilesizelow?.value ?: 0L).toString(), (pulfilesizehigh?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenFileInstanceW(instance: JetInstance, szfilename: COpaquePointer?, phffile: COpaquePointer?, pulfilesizelow: COpaquePointer?, pulfilesizehigh: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetOpenFileInstanceW(instance.toString(), (szfilename?.value ?: 0L).toString(), (phffile?.value ?: 0L).toString(), (pulfilesizelow?.value ?: 0L).toString(), (pulfilesizehigh?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenFileW(szfilename: COpaquePointer?, phffile: COpaquePointer?, pulfilesizelow: COpaquePointer?, pulfilesizehigh: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetOpenFileW((szfilename?.value ?: 0L).toString(), (phffile?.value ?: 0L).toString(), (pulfilesizelow?.value ?: 0L).toString(), (pulfilesizehigh?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenTableA(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, pvparameters: COpaquePointer?, cbparameters: UInt, grbit: UInt, ptableid: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetOpenTableA(sesid.toString(), dbid.toInt(), (sztablename?.value ?: 0L).toString(), (pvparameters?.value ?: 0L).toString(), cbparameters.toInt(), grbit.toInt(), (ptableid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenTableW(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, pvparameters: COpaquePointer?, cbparameters: UInt, grbit: UInt, ptableid: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetOpenTableW(sesid.toString(), dbid.toInt(), (sztablename?.value ?: 0L).toString(), (pvparameters?.value ?: 0L).toString(), cbparameters.toInt(), grbit.toInt(), (ptableid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenTempTable(sesid: JetSesid, prgcolumndef: COpaquePointer?, ccolumn: UInt, grbit: UInt, ptableid: COpaquePointer?, prgcolumnid: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetOpenTempTable(sesid.toString(), (prgcolumndef?.value ?: 0L).toString(), ccolumn.toInt(), grbit.toInt(), (ptableid?.value ?: 0L).toString(), (prgcolumnid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenTempTable2(sesid: JetSesid, prgcolumndef: COpaquePointer?, ccolumn: UInt, lcid: UInt, grbit: UInt, ptableid: COpaquePointer?, prgcolumnid: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetOpenTempTable2(sesid.toString(), (prgcolumndef?.value ?: 0L).toString(), ccolumn.toInt(), lcid.toInt(), grbit.toInt(), (ptableid?.value ?: 0L).toString(), (prgcolumnid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenTempTable3(sesid: JetSesid, prgcolumndef: COpaquePointer?, ccolumn: UInt, pidxunicode: COpaquePointer?, grbit: UInt, ptableid: COpaquePointer?, prgcolumnid: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetOpenTempTable3(sesid.toString(), (prgcolumndef?.value ?: 0L).toString(), ccolumn.toInt(), (pidxunicode?.value ?: 0L).toString(), grbit.toInt(), (ptableid?.value ?: 0L).toString(), (prgcolumnid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenTemporaryTable(sesid: JetSesid, popentemporarytable: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetOpenTemporaryTable(sesid.toString(), (popentemporarytable?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenTemporaryTable2(sesid: JetSesid, popentemporarytable: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetOpenTemporaryTable2(sesid.toString(), (popentemporarytable?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetPrepareUpdate(sesid: JetSesid, tableid: JetTableid, prep: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetPrepareUpdate(sesid.toString(), tableid.toString(), prep.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetPrereadIndexRanges(sesid: JetSesid, tableid: JetTableid, rgindexranges: COpaquePointer?, cindexranges: UInt, pcrangespreread: COpaquePointer?, rgcolumnidpreread: COpaquePointer?, ccolumnidpreread: UInt, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetPrereadIndexRanges(sesid.toString(), tableid.toString(), (rgindexranges?.value ?: 0L).toString(), cindexranges.toInt(), (pcrangespreread?.value ?: 0L).toString(), (rgcolumnidpreread?.value ?: 0L).toString(), ccolumnidpreread.toInt(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetPrereadKeys(sesid: JetSesid, tableid: JetTableid, rgpvkeys: COpaquePointer?, rgcbkeys: COpaquePointer?, ckeys: Int, pckeyspreread: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetPrereadKeys(sesid.toString(), tableid.toString(), (rgpvkeys?.value ?: 0L).toString(), (rgcbkeys?.value ?: 0L).toString(), ckeys, (pckeyspreread?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetReadFile(hffile: JetHandle, pv: COpaquePointer?, cb: UInt, pcbactual: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetReadFile(hffile.toString(), (pv?.value ?: 0L).toString(), cb.toInt(), (pcbactual?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetReadFileInstance(instance: JetInstance, hffile: JetHandle, pv: COpaquePointer?, cb: UInt, pcbactual: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetReadFileInstance(instance.toString(), hffile.toString(), (pv?.value ?: 0L).toString(), cb.toInt(), (pcbactual?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRegisterCallback(sesid: JetSesid, tableid: JetTableid, cbtyp: UInt, pcallback: JetCallback, pvcontext: COpaquePointer?, phcallbackid: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetRegisterCallback(sesid.toString(), tableid.toString(), cbtyp.toInt(), 0L.toString(), (pvcontext?.value ?: 0L).toString(), (phcallbackid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRenameColumnA(sesid: JetSesid, tableid: JetTableid, szname: COpaquePointer?, sznamenew: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetRenameColumnA(sesid.toString(), tableid.toString(), (szname?.value ?: 0L).toString(), (sznamenew?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRenameColumnW(sesid: JetSesid, tableid: JetTableid, szname: COpaquePointer?, sznamenew: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetRenameColumnW(sesid.toString(), tableid.toString(), (szname?.value ?: 0L).toString(), (sznamenew?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRenameTableA(sesid: JetSesid, dbid: UInt, szname: COpaquePointer?, sznamenew: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetRenameTableA(sesid.toString(), dbid.toInt(), (szname?.value ?: 0L).toString(), (sznamenew?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRenameTableW(sesid: JetSesid, dbid: UInt, szname: COpaquePointer?, sznamenew: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetRenameTableW(sesid.toString(), dbid.toInt(), (szname?.value ?: 0L).toString(), (sznamenew?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetResetSessionContext(sesid: JetSesid): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetResetSessionContext(sesid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetResetTableSequential(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetResetTableSequential(sesid.toString(), tableid.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetResizeDatabase(sesid: JetSesid, dbid: UInt, cpgtarget: UInt, pcpgactual: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetResizeDatabase(sesid.toString(), dbid.toInt(), cpgtarget.toInt(), (pcpgactual?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRestore2A(sz: COpaquePointer?, szdest: COpaquePointer?, pfn: JetPfnstatus): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetRestore2A((sz?.value ?: 0L).toString(), (szdest?.value ?: 0L).toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRestore2W(sz: COpaquePointer?, szdest: COpaquePointer?, pfn: JetPfnstatus): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetRestore2W((sz?.value ?: 0L).toString(), (szdest?.value ?: 0L).toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRestoreA(szsource: COpaquePointer?, pfn: JetPfnstatus): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetRestoreA((szsource?.value ?: 0L).toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRestoreInstanceA(instance: JetInstance, sz: COpaquePointer?, szdest: COpaquePointer?, pfn: JetPfnstatus): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetRestoreInstanceA(instance.toString(), (sz?.value ?: 0L).toString(), (szdest?.value ?: 0L).toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRestoreInstanceW(instance: JetInstance, sz: COpaquePointer?, szdest: COpaquePointer?, pfn: JetPfnstatus): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetRestoreInstanceW(instance.toString(), (sz?.value ?: 0L).toString(), (szdest?.value ?: 0L).toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRestoreW(szsource: COpaquePointer?, pfn: JetPfnstatus): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetRestoreW((szsource?.value ?: 0L).toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRetrieveColumn(sesid: JetSesid, tableid: JetTableid, columnid: UInt, pvdata: COpaquePointer?, cbdata: UInt, pcbactual: COpaquePointer?, grbit: UInt, pretinfo: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetRetrieveColumn(sesid.toString(), tableid.toString(), columnid.toInt(), (pvdata?.value ?: 0L).toString(), cbdata.toInt(), (pcbactual?.value ?: 0L).toString(), grbit.toInt(), (pretinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRetrieveColumns(sesid: JetSesid, tableid: JetTableid, pretrievecolumn: COpaquePointer?, cretrievecolumn: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetRetrieveColumns(sesid.toString(), tableid.toString(), (pretrievecolumn?.value ?: 0L).toString(), cretrievecolumn.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRetrieveKey(sesid: JetSesid, tableid: JetTableid, pvkey: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetRetrieveKey(sesid.toString(), tableid.toString(), (pvkey?.value ?: 0L).toString(), cbmax.toInt(), (pcbactual?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRollback(sesid: JetSesid, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetRollback(sesid.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSeek(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetSeek(sesid.toString(), tableid.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetColumn(sesid: JetSesid, tableid: JetTableid, columnid: UInt, pvdata: COpaquePointer?, cbdata: UInt, grbit: UInt, psetinfo: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetSetColumn(sesid.toString(), tableid.toString(), columnid.toInt(), (pvdata?.value ?: 0L).toString(), cbdata.toInt(), grbit.toInt(), (psetinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetColumnDefaultValueA(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, szcolumnname: COpaquePointer?, pvdata: COpaquePointer?, cbdata: UInt, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetSetColumnDefaultValueA(sesid.toString(), dbid.toInt(), (sztablename?.value ?: 0L).toString(), (szcolumnname?.value ?: 0L).toString(), (pvdata?.value ?: 0L).toString(), cbdata.toInt(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetColumnDefaultValueW(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, szcolumnname: COpaquePointer?, pvdata: COpaquePointer?, cbdata: UInt, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetSetColumnDefaultValueW(sesid.toString(), dbid.toInt(), (sztablename?.value ?: 0L).toString(), (szcolumnname?.value ?: 0L).toString(), (pvdata?.value ?: 0L).toString(), cbdata.toInt(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetColumns(sesid: JetSesid, tableid: JetTableid, psetcolumn: COpaquePointer?, csetcolumn: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetSetColumns(sesid.toString(), tableid.toString(), (psetcolumn?.value ?: 0L).toString(), csetcolumn.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCurrentIndex2A(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetSetCurrentIndex2A(sesid.toString(), tableid.toString(), (szindexname?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCurrentIndex2W(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetSetCurrentIndex2W(sesid.toString(), tableid.toString(), (szindexname?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCurrentIndex3A(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, grbit: UInt, itagsequence: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetSetCurrentIndex3A(sesid.toString(), tableid.toString(), (szindexname?.value ?: 0L).toString(), grbit.toInt(), itagsequence.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCurrentIndex3W(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, grbit: UInt, itagsequence: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetSetCurrentIndex3W(sesid.toString(), tableid.toString(), (szindexname?.value ?: 0L).toString(), grbit.toInt(), itagsequence.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCurrentIndex4A(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, pindexid: COpaquePointer?, grbit: UInt, itagsequence: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetSetCurrentIndex4A(sesid.toString(), tableid.toString(), (szindexname?.value ?: 0L).toString(), (pindexid?.value ?: 0L).toString(), grbit.toInt(), itagsequence.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCurrentIndex4W(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, pindexid: COpaquePointer?, grbit: UInt, itagsequence: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetSetCurrentIndex4W(sesid.toString(), tableid.toString(), (szindexname?.value ?: 0L).toString(), (pindexid?.value ?: 0L).toString(), grbit.toInt(), itagsequence.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCurrentIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetSetCurrentIndexA(sesid.toString(), tableid.toString(), (szindexname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCurrentIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetSetCurrentIndexW(sesid.toString(), tableid.toString(), (szindexname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCursorFilter(sesid: JetSesid, tableid: JetTableid, rgcolumnfilters: COpaquePointer?, ccolumnfilters: UInt, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetSetCursorFilter(sesid.toString(), tableid.toString(), (rgcolumnfilters?.value ?: 0L).toString(), ccolumnfilters.toInt(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetDatabaseSizeA(sesid: JetSesid, szdatabasename: COpaquePointer?, cpg: UInt, pcpgreal: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetSetDatabaseSizeA(sesid.toString(), (szdatabasename?.value ?: 0L).toString(), cpg.toInt(), (pcpgreal?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetDatabaseSizeW(sesid: JetSesid, szdatabasename: COpaquePointer?, cpg: UInt, pcpgreal: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetSetDatabaseSizeW(sesid.toString(), (szdatabasename?.value ?: 0L).toString(), cpg.toInt(), (pcpgreal?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetIndexRange(sesid: JetSesid, tableidsrc: JetTableid, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetSetIndexRange(sesid.toString(), tableidsrc.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetLS(sesid: JetSesid, tableid: JetTableid, ls: JetLs, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetSetLS(sesid.toString(), tableid.toString(), ls.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetSessionContext(sesid: JetSesid, ulcontext: JetApiPtr): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetSetSessionContext(sesid.toString(), ulcontext.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetSessionParameter(sesid: JetSesid, sesparamid: UInt, pvparam: COpaquePointer?, cbparam: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetSetSessionParameter(sesid.toString(), sesparamid.toInt(), (pvparam?.value ?: 0L).toString(), cbparam.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetSystemParameterA(pinstance: COpaquePointer?, sesid: JetSesid, paramid: UInt, lparam: JetApiPtr, szparam: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetSetSystemParameterA((pinstance?.value ?: 0L).toString(), sesid.toString(), paramid.toInt(), lparam.toString(), (szparam?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetSystemParameterW(pinstance: COpaquePointer?, sesid: JetSesid, paramid: UInt, lparam: JetApiPtr, szparam: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetSetSystemParameterW((pinstance?.value ?: 0L).toString(), sesid.toString(), paramid.toInt(), lparam.toString(), (szparam?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetTableSequential(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetSetTableSequential(sesid.toString(), tableid.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetStopBackup(): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetStopBackup() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetStopBackupInstance(instance: JetInstance): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetStopBackupInstance(instance.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetStopService(): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetStopService() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetStopServiceInstance(instance: JetInstance): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetStopServiceInstance(instance.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetStopServiceInstance2(instance: JetInstance, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetStopServiceInstance2(instance.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetTerm(instance: JetInstance): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetTerm(instance.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetTerm2(instance: JetInstance, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetTerm2(instance.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetTruncateLog(): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetTruncateLog() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetTruncateLogInstance(instance: JetInstance): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetTruncateLogInstance(instance.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetUnregisterCallback(sesid: JetSesid, tableid: JetTableid, cbtyp: UInt, hcallbackid: JetHandle): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetUnregisterCallback(sesid.toString(), tableid.toString(), cbtyp.toInt(), hcallbackid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetUpdate(sesid: JetSesid, tableid: JetTableid, pvbookmark: COpaquePointer?, cbbookmark: UInt, pcbactual: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetUpdate(sesid.toString(), tableid.toString(), (pvbookmark?.value ?: 0L).toString(), cbbookmark.toInt(), (pcbactual?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetUpdate2(sesid: JetSesid, tableid: JetTableid, pvbookmark: COpaquePointer?, cbbookmark: UInt, pcbactual: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAvailable) _wasm_windowssys_windows_win32_storage_jet_jetUpdate2(sesid.toString(), tableid.toString(), (pvbookmark?.value ?: 0L).toString(), cbbookmark.toInt(), (pcbactual?.value ?: 0L).toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")
