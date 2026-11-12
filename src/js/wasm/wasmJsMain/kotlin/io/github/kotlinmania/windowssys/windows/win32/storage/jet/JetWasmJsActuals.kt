@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.jet

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetApiPtr
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetHandle
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetTableid

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32StorageJetNapiAddon(): Boolean

private val windowsWin32StorageJetNapiAvailable: Boolean = initWindowsWin32StorageJetNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetAddColumnA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageJetJetAddColumnA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetAddColumnW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageJetJetAddColumnW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetAttachDatabase2A(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetAttachDatabase2A(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetAttachDatabase2W(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetAttachDatabase2W(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetAttachDatabaseA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetAttachDatabaseA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetAttachDatabaseW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetAttachDatabaseW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetBackupA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetBackupA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetBackupInstanceA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetBackupInstanceA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetBackupInstanceW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetBackupInstanceW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetBackupW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetBackupW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetBeginExternalBackup(p0)")
private external fun wasmWindowssysWindowsWin32StorageJetJetBeginExternalBackup(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetBeginExternalBackupInstance(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageJetJetBeginExternalBackupInstance(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetBeginSessionA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetBeginSessionA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetBeginSessionW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetBeginSessionW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetBeginTransaction(p0)")
private external fun wasmWindowssysWindowsWin32StorageJetJetBeginTransaction(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetBeginTransaction2(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageJetJetBeginTransaction2(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetBeginTransaction3(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetBeginTransaction3(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCloseDatabase(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCloseDatabase(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCloseFile(p0)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCloseFile(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCloseFileInstance(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCloseFileInstance(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCloseTable(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCloseTable(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCommitTransaction(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCommitTransaction(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCommitTransaction2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCommitTransaction2(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCompactA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCompactA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCompactW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCompactW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetComputeStats(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageJetJetComputeStats(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetConfigureProcessForCrashDump(p0)")
private external fun wasmWindowssysWindowsWin32StorageJetJetConfigureProcessForCrashDump(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCreateDatabase2A(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCreateDatabase2A(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCreateDatabase2W(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCreateDatabase2W(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCreateDatabaseA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCreateDatabaseA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCreateDatabaseW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCreateDatabaseW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCreateIndex2A(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCreateIndex2A(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCreateIndex2W(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCreateIndex2W(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCreateIndex3A(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCreateIndex3A(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCreateIndex3W(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCreateIndex3W(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCreateIndex4A(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCreateIndex4A(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCreateIndex4W(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCreateIndex4W(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCreateIndexA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCreateIndexA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCreateIndexW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCreateIndexW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCreateInstance2A(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCreateInstance2A(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCreateInstance2W(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCreateInstance2W(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCreateInstanceA(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCreateInstanceA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCreateInstanceW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCreateInstanceW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCreateTableA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCreateTableA(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCreateTableColumnIndex2A(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCreateTableColumnIndex2A(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCreateTableColumnIndex2W(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCreateTableColumnIndex2W(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCreateTableColumnIndex3A(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCreateTableColumnIndex3A(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCreateTableColumnIndex3W(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCreateTableColumnIndex3W(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCreateTableColumnIndex4A(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCreateTableColumnIndex4A(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCreateTableColumnIndex4W(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCreateTableColumnIndex4W(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCreateTableColumnIndexA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCreateTableColumnIndexA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCreateTableColumnIndexW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCreateTableColumnIndexW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetCreateTableW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageJetJetCreateTableW(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetDefragment2A(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageJetJetDefragment2A(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetDefragment2W(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageJetJetDefragment2W(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetDefragment3A(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32StorageJetJetDefragment3A(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetDefragment3W(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32StorageJetJetDefragment3W(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetDefragmentA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageJetJetDefragmentA(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetDefragmentW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageJetJetDefragmentW(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetDelete(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageJetJetDelete(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetDeleteColumn2A(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetDeleteColumn2A(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetDeleteColumn2W(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetDeleteColumn2W(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetDeleteColumnA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetDeleteColumnA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetDeleteColumnW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetDeleteColumnW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetDeleteIndexA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetDeleteIndexA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetDeleteIndexW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetDeleteIndexW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetDeleteTableA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetDeleteTableA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetDeleteTableW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetDeleteTableW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetDetachDatabase2A(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetDetachDatabase2A(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetDetachDatabase2W(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetDetachDatabase2W(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetDetachDatabaseA(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageJetJetDetachDatabaseA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetDetachDatabaseW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageJetJetDetachDatabaseW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetDupCursor(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetDupCursor(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetDupSession(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageJetJetDupSession(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetEnableMultiInstanceA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetEnableMultiInstanceA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetEnableMultiInstanceW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetEnableMultiInstanceW(p0: String, p1: Int, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetEndExternalBackup()")
private external fun wasmWindowssysWindowsWin32StorageJetJetEndExternalBackup(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetEndExternalBackupInstance(p0)")
private external fun wasmWindowssysWindowsWin32StorageJetJetEndExternalBackupInstance(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetEndExternalBackupInstance2(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageJetJetEndExternalBackupInstance2(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetEndSession(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageJetJetEndSession(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetEnumerateColumns(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32StorageJetJetEnumerateColumns(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String, p8: Int, p9: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetEscrowUpdate(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32StorageJetJetEscrowUpdate(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetExternalRestore2A(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32StorageJetJetExternalRestore2A(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetExternalRestore2W(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32StorageJetJetExternalRestore2W(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetExternalRestoreA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32StorageJetJetExternalRestoreA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetExternalRestoreW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32StorageJetJetExternalRestoreW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Int, p7: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetFreeBuffer(p0)")
private external fun wasmWindowssysWindowsWin32StorageJetJetFreeBuffer(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetAttachInfoA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetAttachInfoA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetAttachInfoInstanceA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetAttachInfoInstanceA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetAttachInfoInstanceW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetAttachInfoInstanceW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetAttachInfoW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetAttachInfoW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetBookmark(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetBookmark(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetColumnInfoA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetColumnInfoA(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetColumnInfoW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetColumnInfoW(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetCurrentIndexA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetCurrentIndexA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetCurrentIndexW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetCurrentIndexW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetCursorInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetCursorInfo(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetDatabaseFileInfoA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetDatabaseFileInfoA(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetDatabaseFileInfoW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetDatabaseFileInfoW(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetDatabaseInfoA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetDatabaseInfoA(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetDatabaseInfoW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetDatabaseInfoW(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetErrorInfoW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetErrorInfoW(p0: String, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetIndexInfoA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetIndexInfoA(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetIndexInfoW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetIndexInfoW(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetInstanceInfoA(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetInstanceInfoA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetInstanceInfoW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetInstanceInfoW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetInstanceMiscInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetInstanceMiscInfo(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetLS(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetLS(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetLock(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetLock(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetLogInfoA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetLogInfoA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetLogInfoInstance2A(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetLogInfoInstance2A(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetLogInfoInstance2W(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetLogInfoInstance2W(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetLogInfoInstanceA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetLogInfoInstanceA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetLogInfoInstanceW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetLogInfoInstanceW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetLogInfoW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetLogInfoW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetObjectInfoA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetObjectInfoA(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: Int, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetObjectInfoW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetObjectInfoW(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: Int, p7: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetRecordPosition(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetRecordPosition(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetRecordSize(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetRecordSize(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetRecordSize2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetRecordSize2(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetSecondaryIndexBookmark(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetSecondaryIndexBookmark(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetSessionParameter(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetSessionParameter(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetSystemParameterA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetSystemParameterA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetSystemParameterW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetSystemParameterW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetTableColumnInfoA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetTableColumnInfoA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetTableColumnInfoW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetTableColumnInfoW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetTableIndexInfoA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetTableIndexInfoA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetTableIndexInfoW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetTableIndexInfoW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetTableInfoA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetTableInfoA(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetTableInfoW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetTableInfoW(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetThreadStats(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetThreadStats(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetTruncateLogInfoInstanceA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetTruncateLogInfoInstanceA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetTruncateLogInfoInstanceW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetTruncateLogInfoInstanceW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGetVersion(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGetVersion(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGotoBookmark(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGotoBookmark(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGotoPosition(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGotoPosition(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGotoSecondaryIndexBookmark(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGotoSecondaryIndexBookmark(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetGrowDatabase(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetGrowDatabase(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetIdle(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageJetJetIdle(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetIndexRecordCount(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetIndexRecordCount(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetInit(p0)")
private external fun wasmWindowssysWindowsWin32StorageJetJetInit(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetInit2(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageJetJetInit2(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetInit3A(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetInit3A(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetInit3W(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetInit3W(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetIntersectIndexes(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageJetJetIntersectIndexes(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetMakeKey(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageJetJetMakeKey(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetMove(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetMove(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetOSSnapshotAbort(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageJetJetOSSnapshotAbort(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetOSSnapshotEnd(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageJetJetOSSnapshotEnd(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetOSSnapshotFreezeA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetOSSnapshotFreezeA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetOSSnapshotFreezeW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetOSSnapshotFreezeW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetOSSnapshotGetFreezeInfoA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetOSSnapshotGetFreezeInfoA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetOSSnapshotGetFreezeInfoW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetOSSnapshotGetFreezeInfoW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetOSSnapshotPrepare(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageJetJetOSSnapshotPrepare(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetOSSnapshotPrepareInstance(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetOSSnapshotPrepareInstance(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetOSSnapshotThaw(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageJetJetOSSnapshotThaw(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetOSSnapshotTruncateLog(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageJetJetOSSnapshotTruncateLog(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetOSSnapshotTruncateLogInstance(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetOSSnapshotTruncateLogInstance(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetOpenDatabaseA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageJetJetOpenDatabaseA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetOpenDatabaseW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageJetJetOpenDatabaseW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetOpenFileA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetOpenFileA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetOpenFileInstanceA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageJetJetOpenFileInstanceA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetOpenFileInstanceW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageJetJetOpenFileInstanceW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetOpenFileW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetOpenFileW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetOpenTableA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageJetJetOpenTableA(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetOpenTableW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageJetJetOpenTableW(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetOpenTempTable(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageJetJetOpenTempTable(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetOpenTempTable2(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageJetJetOpenTempTable2(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetOpenTempTable3(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageJetJetOpenTempTable3(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetOpenTemporaryTable(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageJetJetOpenTemporaryTable(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetOpenTemporaryTable2(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageJetJetOpenTemporaryTable2(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetPrepareUpdate(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetPrepareUpdate(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetPrereadIndexRanges(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32StorageJetJetPrereadIndexRanges(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetPrereadKeys(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageJetJetPrereadKeys(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetReadFile(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetReadFile(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetReadFileInstance(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageJetJetReadFileInstance(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetRegisterCallback(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageJetJetRegisterCallback(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetRenameColumnA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageJetJetRenameColumnA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetRenameColumnW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageJetJetRenameColumnW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetRenameTableA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetRenameTableA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetRenameTableW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetRenameTableW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetResetSessionContext(p0)")
private external fun wasmWindowssysWindowsWin32StorageJetJetResetSessionContext(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetResetTableSequential(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetResetTableSequential(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetResizeDatabase(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageJetJetResizeDatabase(p0: String, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetRestore2A(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetRestore2A(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetRestore2W(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetRestore2W(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetRestoreA(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageJetJetRestoreA(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetRestoreInstanceA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetRestoreInstanceA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetRestoreInstanceW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetRestoreInstanceW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetRestoreW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageJetJetRestoreW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetRetrieveColumn(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32StorageJetJetRetrieveColumn(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetRetrieveColumns(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetRetrieveColumns(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetRetrieveKey(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageJetJetRetrieveKey(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetRollback(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageJetJetRollback(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetSeek(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetSeek(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetSetColumn(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageJetJetSetColumn(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetSetColumnDefaultValueA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageJetJetSetColumnDefaultValueA(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetSetColumnDefaultValueW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageJetJetSetColumnDefaultValueW(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetSetColumns(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetSetColumns(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetSetCurrentIndex2A(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetSetCurrentIndex2A(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetSetCurrentIndex2W(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetSetCurrentIndex2W(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetSetCurrentIndex3A(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageJetJetSetCurrentIndex3A(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetSetCurrentIndex3W(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageJetJetSetCurrentIndex3W(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetSetCurrentIndex4A(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageJetJetSetCurrentIndex4A(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetSetCurrentIndex4W(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageJetJetSetCurrentIndex4W(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetSetCurrentIndexA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetSetCurrentIndexA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetSetCurrentIndexW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetSetCurrentIndexW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetSetCursorFilter(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageJetJetSetCursorFilter(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetSetDatabaseSizeA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetSetDatabaseSizeA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetSetDatabaseSizeW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetSetDatabaseSizeW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetSetIndexRange(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetSetIndexRange(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetSetLS(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetSetLS(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetSetSessionContext(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageJetJetSetSessionContext(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetSetSessionParameter(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetSetSessionParameter(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetSetSystemParameterA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageJetJetSetSystemParameterA(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetSetSystemParameterW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageJetJetSetSystemParameterW(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetSetTableSequential(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageJetJetSetTableSequential(p0: String, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetStopBackup()")
private external fun wasmWindowssysWindowsWin32StorageJetJetStopBackup(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetStopBackupInstance(p0)")
private external fun wasmWindowssysWindowsWin32StorageJetJetStopBackupInstance(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetStopService()")
private external fun wasmWindowssysWindowsWin32StorageJetJetStopService(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetStopServiceInstance(p0)")
private external fun wasmWindowssysWindowsWin32StorageJetJetStopServiceInstance(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetStopServiceInstance2(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageJetJetStopServiceInstance2(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetTerm(p0)")
private external fun wasmWindowssysWindowsWin32StorageJetJetTerm(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetTerm2(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageJetJetTerm2(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetTruncateLog()")
private external fun wasmWindowssysWindowsWin32StorageJetJetTruncateLog(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetTruncateLogInstance(p0)")
private external fun wasmWindowssysWindowsWin32StorageJetJetTruncateLogInstance(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetUnregisterCallback(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageJetJetUnregisterCallback(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetUpdate(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageJetJetUpdate(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageJetJetUpdate2(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageJetJetUpdate2(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

public actual fun jetAddColumnA(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr, pcolumndef: ConstPtr, pvdefault: ConstPtr, cbdefault: UInt, pcolumnid: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetAddColumnA(sesid.toString(), tableid.toString(), szcolumnname.rawAddress.toString(), pcolumndef.rawAddress.toString(), pvdefault.rawAddress.toString(), cbdefault.toInt(), pcolumnid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetAddColumnW(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr, pcolumndef: ConstPtr, pvdefault: ConstPtr, cbdefault: UInt, pcolumnid: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetAddColumnW(sesid.toString(), tableid.toString(), szcolumnname.rawAddress.toString(), pcolumndef.rawAddress.toString(), pvdefault.rawAddress.toString(), cbdefault.toInt(), pcolumnid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetAttachDatabase2A(sesid: JetSesid, szfilename: ConstPtr, cpgdatabasesizemax: UInt, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetAttachDatabase2A(sesid.toString(), szfilename.rawAddress.toString(), cpgdatabasesizemax.toInt(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetAttachDatabase2W(sesid: JetSesid, szfilename: ConstPtr, cpgdatabasesizemax: UInt, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetAttachDatabase2W(sesid.toString(), szfilename.rawAddress.toString(), cpgdatabasesizemax.toInt(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetAttachDatabaseA(sesid: JetSesid, szfilename: ConstPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetAttachDatabaseA(sesid.toString(), szfilename.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetAttachDatabaseW(sesid: JetSesid, szfilename: ConstPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetAttachDatabaseW(sesid.toString(), szfilename.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBackupA(szbackuppath: ConstPtr, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetBackupA(szbackuppath.rawAddress.toString(), grbit.toInt(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBackupInstanceA(instance: JetInstance, szbackuppath: ConstPtr, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetBackupInstanceA(instance.toString(), szbackuppath.rawAddress.toString(), grbit.toInt(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBackupInstanceW(instance: JetInstance, szbackuppath: ConstPtr, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetBackupInstanceW(instance.toString(), szbackuppath.rawAddress.toString(), grbit.toInt(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBackupW(szbackuppath: ConstPtr, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetBackupW(szbackuppath.rawAddress.toString(), grbit.toInt(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBeginExternalBackup(grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetBeginExternalBackup(grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBeginExternalBackupInstance(instance: JetInstance, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetBeginExternalBackupInstance(instance.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBeginSessionA(instance: JetInstance, psesid: MutPtr, szusername: ConstPtr, szpassword: ConstPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetBeginSessionA(instance.toString(), psesid.rawAddress.toString(), szusername.rawAddress.toString(), szpassword.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBeginSessionW(instance: JetInstance, psesid: MutPtr, szusername: ConstPtr, szpassword: ConstPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetBeginSessionW(instance.toString(), psesid.rawAddress.toString(), szusername.rawAddress.toString(), szpassword.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBeginTransaction(sesid: JetSesid): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetBeginTransaction(sesid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBeginTransaction2(sesid: JetSesid, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetBeginTransaction2(sesid.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBeginTransaction3(sesid: JetSesid, trxid: Long, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetBeginTransaction3(sesid.toString(), trxid.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCloseDatabase(sesid: JetSesid, dbid: UInt, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCloseDatabase(sesid.toString(), dbid.toInt(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCloseFile(hffile: JetHandle): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCloseFile(hffile.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCloseFileInstance(instance: JetInstance, hffile: JetHandle): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCloseFileInstance(instance.toString(), hffile.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCloseTable(sesid: JetSesid, tableid: JetTableid): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCloseTable(sesid.toString(), tableid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCommitTransaction(sesid: JetSesid, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCommitTransaction(sesid.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCommitTransaction2(sesid: JetSesid, grbit: UInt, cmsecdurablecommit: UInt, pcommitid: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCommitTransaction2(sesid.toString(), grbit.toInt(), cmsecdurablecommit.toInt(), pcommitid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCompactA(sesid: JetSesid, szdatabasesrc: ConstPtr, szdatabasedest: ConstPtr, pfnstatus: JetPfnstatus, pconvert: ConstPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCompactA(sesid.toString(), szdatabasesrc.rawAddress.toString(), szdatabasedest.rawAddress.toString(), 0L.toString(), pconvert.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCompactW(sesid: JetSesid, szdatabasesrc: ConstPtr, szdatabasedest: ConstPtr, pfnstatus: JetPfnstatus, pconvert: ConstPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCompactW(sesid.toString(), szdatabasesrc.rawAddress.toString(), szdatabasedest.rawAddress.toString(), 0L.toString(), pconvert.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetComputeStats(sesid: JetSesid, tableid: JetTableid): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetComputeStats(sesid.toString(), tableid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetConfigureProcessForCrashDump(grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetConfigureProcessForCrashDump(grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateDatabase2A(sesid: JetSesid, szfilename: ConstPtr, cpgdatabasesizemax: UInt, pdbid: MutPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCreateDatabase2A(sesid.toString(), szfilename.rawAddress.toString(), cpgdatabasesizemax.toInt(), pdbid.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateDatabase2W(sesid: JetSesid, szfilename: ConstPtr, cpgdatabasesizemax: UInt, pdbid: MutPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCreateDatabase2W(sesid.toString(), szfilename.rawAddress.toString(), cpgdatabasesizemax.toInt(), pdbid.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateDatabaseA(sesid: JetSesid, szfilename: ConstPtr, szconnect: ConstPtr, pdbid: MutPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCreateDatabaseA(sesid.toString(), szfilename.rawAddress.toString(), szconnect.rawAddress.toString(), pdbid.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateDatabaseW(sesid: JetSesid, szfilename: ConstPtr, szconnect: ConstPtr, pdbid: MutPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCreateDatabaseW(sesid.toString(), szfilename.rawAddress.toString(), szconnect.rawAddress.toString(), pdbid.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateIndex2A(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr, cindexcreate: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCreateIndex2A(sesid.toString(), tableid.toString(), pindexcreate.rawAddress.toString(), cindexcreate.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateIndex2W(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr, cindexcreate: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCreateIndex2W(sesid.toString(), tableid.toString(), pindexcreate.rawAddress.toString(), cindexcreate.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateIndex3A(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr, cindexcreate: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCreateIndex3A(sesid.toString(), tableid.toString(), pindexcreate.rawAddress.toString(), cindexcreate.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateIndex3W(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr, cindexcreate: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCreateIndex3W(sesid.toString(), tableid.toString(), pindexcreate.rawAddress.toString(), cindexcreate.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateIndex4A(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr, cindexcreate: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCreateIndex4A(sesid.toString(), tableid.toString(), pindexcreate.rawAddress.toString(), cindexcreate.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateIndex4W(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr, cindexcreate: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCreateIndex4W(sesid.toString(), tableid.toString(), pindexcreate.rawAddress.toString(), cindexcreate.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, grbit: UInt, szkey: Pcstr, cbkey: UInt, ldensity: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCreateIndexA(sesid.toString(), tableid.toString(), szindexname.rawAddress.toString(), grbit.toInt(), szkey.rawAddress.toString(), cbkey.toInt(), ldensity.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, grbit: UInt, szkey: Pcwstr, cbkey: UInt, ldensity: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCreateIndexW(sesid.toString(), tableid.toString(), szindexname.rawAddress.toString(), grbit.toInt(), szkey.rawAddress.toString(), cbkey.toInt(), ldensity.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateInstance2A(pinstance: MutPtr, szinstancename: ConstPtr, szdisplayname: ConstPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCreateInstance2A(pinstance.rawAddress.toString(), szinstancename.rawAddress.toString(), szdisplayname.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateInstance2W(pinstance: MutPtr, szinstancename: ConstPtr, szdisplayname: ConstPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCreateInstance2W(pinstance.rawAddress.toString(), szinstancename.rawAddress.toString(), szdisplayname.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateInstanceA(pinstance: MutPtr, szinstancename: ConstPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCreateInstanceA(pinstance.rawAddress.toString(), szinstancename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateInstanceW(pinstance: MutPtr, szinstancename: ConstPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCreateInstanceW(pinstance.rawAddress.toString(), szinstancename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, lpages: UInt, ldensity: UInt, ptableid: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCreateTableA(sesid.toString(), dbid.toInt(), sztablename.rawAddress.toString(), lpages.toInt(), ldensity.toInt(), ptableid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableColumnIndex2A(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCreateTableColumnIndex2A(sesid.toString(), dbid.toInt(), ptablecreate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableColumnIndex2W(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCreateTableColumnIndex2W(sesid.toString(), dbid.toInt(), ptablecreate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableColumnIndex3A(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCreateTableColumnIndex3A(sesid.toString(), dbid.toInt(), ptablecreate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableColumnIndex3W(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCreateTableColumnIndex3W(sesid.toString(), dbid.toInt(), ptablecreate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableColumnIndex4A(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCreateTableColumnIndex4A(sesid.toString(), dbid.toInt(), ptablecreate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableColumnIndex4W(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCreateTableColumnIndex4W(sesid.toString(), dbid.toInt(), ptablecreate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableColumnIndexA(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCreateTableColumnIndexA(sesid.toString(), dbid.toInt(), ptablecreate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableColumnIndexW(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCreateTableColumnIndexW(sesid.toString(), dbid.toInt(), ptablecreate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, lpages: UInt, ldensity: UInt, ptableid: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetCreateTableW(sesid.toString(), dbid.toInt(), sztablename.rawAddress.toString(), lpages.toInt(), ldensity.toInt(), ptableid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDefragment2A(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, pcpasses: MutPtr, pcseconds: MutPtr, callback: JetCallback, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetDefragment2A(sesid.toString(), dbid.toInt(), sztablename.rawAddress.toString(), pcpasses.rawAddress.toString(), pcseconds.rawAddress.toString(), 0L.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDefragment2W(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, pcpasses: MutPtr, pcseconds: MutPtr, callback: JetCallback, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetDefragment2W(sesid.toString(), dbid.toInt(), sztablename.rawAddress.toString(), pcpasses.rawAddress.toString(), pcseconds.rawAddress.toString(), 0L.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDefragment3A(sesid: JetSesid, szdatabasename: ConstPtr, sztablename: ConstPtr, pcpasses: MutPtr, pcseconds: MutPtr, callback: JetCallback, pvcontext: ConstPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetDefragment3A(sesid.toString(), szdatabasename.rawAddress.toString(), sztablename.rawAddress.toString(), pcpasses.rawAddress.toString(), pcseconds.rawAddress.toString(), 0L.toString(), pvcontext.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDefragment3W(sesid: JetSesid, szdatabasename: ConstPtr, sztablename: ConstPtr, pcpasses: MutPtr, pcseconds: MutPtr, callback: JetCallback, pvcontext: ConstPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetDefragment3W(sesid.toString(), szdatabasename.rawAddress.toString(), sztablename.rawAddress.toString(), pcpasses.rawAddress.toString(), pcseconds.rawAddress.toString(), 0L.toString(), pvcontext.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDefragmentA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, pcpasses: MutPtr, pcseconds: MutPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetDefragmentA(sesid.toString(), dbid.toInt(), sztablename.rawAddress.toString(), pcpasses.rawAddress.toString(), pcseconds.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDefragmentW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, pcpasses: MutPtr, pcseconds: MutPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetDefragmentW(sesid.toString(), dbid.toInt(), sztablename.rawAddress.toString(), pcpasses.rawAddress.toString(), pcseconds.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDelete(sesid: JetSesid, tableid: JetTableid): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetDelete(sesid.toString(), tableid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDeleteColumn2A(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetDeleteColumn2A(sesid.toString(), tableid.toString(), szcolumnname.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDeleteColumn2W(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetDeleteColumn2W(sesid.toString(), tableid.toString(), szcolumnname.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDeleteColumnA(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetDeleteColumnA(sesid.toString(), tableid.toString(), szcolumnname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDeleteColumnW(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetDeleteColumnW(sesid.toString(), tableid.toString(), szcolumnname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDeleteIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetDeleteIndexA(sesid.toString(), tableid.toString(), szindexname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDeleteIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetDeleteIndexW(sesid.toString(), tableid.toString(), szindexname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDeleteTableA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetDeleteTableA(sesid.toString(), dbid.toInt(), sztablename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDeleteTableW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetDeleteTableW(sesid.toString(), dbid.toInt(), sztablename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDetachDatabase2A(sesid: JetSesid, szfilename: ConstPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetDetachDatabase2A(sesid.toString(), szfilename.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDetachDatabase2W(sesid: JetSesid, szfilename: ConstPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetDetachDatabase2W(sesid.toString(), szfilename.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDetachDatabaseA(sesid: JetSesid, szfilename: ConstPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetDetachDatabaseA(sesid.toString(), szfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDetachDatabaseW(sesid: JetSesid, szfilename: ConstPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetDetachDatabaseW(sesid.toString(), szfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDupCursor(sesid: JetSesid, tableid: JetTableid, ptableid: MutPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetDupCursor(sesid.toString(), tableid.toString(), ptableid.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDupSession(sesid: JetSesid, psesid: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetDupSession(sesid.toString(), psesid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetEnableMultiInstanceA(psetsysparam: ConstPtr, csetsysparam: UInt, pcsetsucceed: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetEnableMultiInstanceA(psetsysparam.rawAddress.toString(), csetsysparam.toInt(), pcsetsucceed.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetEnableMultiInstanceW(psetsysparam: ConstPtr, csetsysparam: UInt, pcsetsucceed: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetEnableMultiInstanceW(psetsysparam.rawAddress.toString(), csetsysparam.toInt(), pcsetsucceed.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetEndExternalBackup(): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetEndExternalBackup() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetEndExternalBackupInstance(instance: JetInstance): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetEndExternalBackupInstance(instance.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetEndExternalBackupInstance2(instance: JetInstance, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetEndExternalBackupInstance2(instance.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetEndSession(sesid: JetSesid, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetEndSession(sesid.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetEnumerateColumns(sesid: JetSesid, tableid: JetTableid, cenumcolumnid: UInt, rgenumcolumnid: ConstPtr, pcenumcolumn: MutPtr, prgenumcolumn: MutPtr, pfnrealloc: JetPfnrealloc, pvrealloccontext: ConstPtr, cbdatamost: UInt, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetEnumerateColumns(sesid.toString(), tableid.toString(), cenumcolumnid.toInt(), rgenumcolumnid.rawAddress.toString(), pcenumcolumn.rawAddress.toString(), prgenumcolumn.rawAddress.toString(), 0L.toString(), pvrealloccontext.rawAddress.toString(), cbdatamost.toInt(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetEscrowUpdate(sesid: JetSesid, tableid: JetTableid, columnid: UInt, pv: ConstPtr, cbmax: UInt, pvold: MutPtr, cboldmax: UInt, pcboldactual: MutPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetEscrowUpdate(sesid.toString(), tableid.toString(), columnid.toInt(), pv.rawAddress.toString(), cbmax.toInt(), pvold.rawAddress.toString(), cboldmax.toInt(), pcboldactual.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetExternalRestore2A(szcheckpointfilepath: ConstPtr, szlogpath: ConstPtr, rgrstmap: ConstPtr, crstfilemap: Int, szbackuplogpath: ConstPtr, ploginfo: MutPtr, sztargetinstancename: ConstPtr, sztargetinstancelogpath: ConstPtr, sztargetinstancecheckpointpath: ConstPtr, pfn: JetPfnstatus): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetExternalRestore2A(szcheckpointfilepath.rawAddress.toString(), szlogpath.rawAddress.toString(), rgrstmap.rawAddress.toString(), crstfilemap, szbackuplogpath.rawAddress.toString(), ploginfo.rawAddress.toString(), sztargetinstancename.rawAddress.toString(), sztargetinstancelogpath.rawAddress.toString(), sztargetinstancecheckpointpath.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetExternalRestore2W(szcheckpointfilepath: ConstPtr, szlogpath: ConstPtr, rgrstmap: ConstPtr, crstfilemap: Int, szbackuplogpath: ConstPtr, ploginfo: MutPtr, sztargetinstancename: ConstPtr, sztargetinstancelogpath: ConstPtr, sztargetinstancecheckpointpath: ConstPtr, pfn: JetPfnstatus): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetExternalRestore2W(szcheckpointfilepath.rawAddress.toString(), szlogpath.rawAddress.toString(), rgrstmap.rawAddress.toString(), crstfilemap, szbackuplogpath.rawAddress.toString(), ploginfo.rawAddress.toString(), sztargetinstancename.rawAddress.toString(), sztargetinstancelogpath.rawAddress.toString(), sztargetinstancecheckpointpath.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetExternalRestoreA(szcheckpointfilepath: ConstPtr, szlogpath: ConstPtr, rgrstmap: ConstPtr, crstfilemap: Int, szbackuplogpath: ConstPtr, genlow: Int, genhigh: Int, pfn: JetPfnstatus): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetExternalRestoreA(szcheckpointfilepath.rawAddress.toString(), szlogpath.rawAddress.toString(), rgrstmap.rawAddress.toString(), crstfilemap, szbackuplogpath.rawAddress.toString(), genlow, genhigh, 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetExternalRestoreW(szcheckpointfilepath: ConstPtr, szlogpath: ConstPtr, rgrstmap: ConstPtr, crstfilemap: Int, szbackuplogpath: ConstPtr, genlow: Int, genhigh: Int, pfn: JetPfnstatus): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetExternalRestoreW(szcheckpointfilepath.rawAddress.toString(), szlogpath.rawAddress.toString(), rgrstmap.rawAddress.toString(), crstfilemap, szbackuplogpath.rawAddress.toString(), genlow, genhigh, 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetFreeBuffer(pbbuf: Pcstr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetFreeBuffer(pbbuf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetAttachInfoA(szzdatabases: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetAttachInfoA(szzdatabases.rawAddress.toString(), cbmax.toInt(), pcbactual.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetAttachInfoInstanceA(instance: JetInstance, szzdatabases: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetAttachInfoInstanceA(instance.toString(), szzdatabases.rawAddress.toString(), cbmax.toInt(), pcbactual.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetAttachInfoInstanceW(instance: JetInstance, szzdatabases: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetAttachInfoInstanceW(instance.toString(), szzdatabases.rawAddress.toString(), cbmax.toInt(), pcbactual.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetAttachInfoW(wszzdatabases: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetAttachInfoW(wszzdatabases.rawAddress.toString(), cbmax.toInt(), pcbactual.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetBookmark(sesid: JetSesid, tableid: JetTableid, pvbookmark: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetBookmark(sesid.toString(), tableid.toString(), pvbookmark.rawAddress.toString(), cbmax.toInt(), pcbactual.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetColumnInfoA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, pcolumnnameorid: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetColumnInfoA(sesid.toString(), dbid.toInt(), sztablename.rawAddress.toString(), pcolumnnameorid.rawAddress.toString(), pvresult.rawAddress.toString(), cbmax.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetColumnInfoW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, pwcolumnnameorid: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetColumnInfoW(sesid.toString(), dbid.toInt(), sztablename.rawAddress.toString(), pwcolumnnameorid.rawAddress.toString(), pvresult.rawAddress.toString(), cbmax.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetCurrentIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: MutPtr, cbindexname: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetCurrentIndexA(sesid.toString(), tableid.toString(), szindexname.rawAddress.toString(), cbindexname.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetCurrentIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: MutPtr, cbindexname: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetCurrentIndexW(sesid.toString(), tableid.toString(), szindexname.rawAddress.toString(), cbindexname.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetCursorInfo(sesid: JetSesid, tableid: JetTableid, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetCursorInfo(sesid.toString(), tableid.toString(), pvresult.rawAddress.toString(), cbmax.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetDatabaseFileInfoA(szdatabasename: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetDatabaseFileInfoA(szdatabasename.rawAddress.toString(), pvresult.rawAddress.toString(), cbmax.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetDatabaseFileInfoW(szdatabasename: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetDatabaseFileInfoW(szdatabasename.rawAddress.toString(), pvresult.rawAddress.toString(), cbmax.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetDatabaseInfoA(sesid: JetSesid, dbid: UInt, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetDatabaseInfoA(sesid.toString(), dbid.toInt(), pvresult.rawAddress.toString(), cbmax.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetDatabaseInfoW(sesid: JetSesid, dbid: UInt, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetDatabaseInfoW(sesid.toString(), dbid.toInt(), pvresult.rawAddress.toString(), cbmax.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetErrorInfoW(pvcontext: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetErrorInfoW(pvcontext.rawAddress.toString(), pvresult.rawAddress.toString(), cbmax.toInt(), infolevel.toInt(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetIndexInfoA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, szindexname: ConstPtr, pvresult: MutPtr, cbresult: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetIndexInfoA(sesid.toString(), dbid.toInt(), sztablename.rawAddress.toString(), szindexname.rawAddress.toString(), pvresult.rawAddress.toString(), cbresult.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetIndexInfoW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, szindexname: ConstPtr, pvresult: MutPtr, cbresult: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetIndexInfoW(sesid.toString(), dbid.toInt(), sztablename.rawAddress.toString(), szindexname.rawAddress.toString(), pvresult.rawAddress.toString(), cbresult.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetInstanceInfoA(pcinstanceinfo: MutPtr, painstanceinfo: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetInstanceInfoA(pcinstanceinfo.rawAddress.toString(), painstanceinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetInstanceInfoW(pcinstanceinfo: MutPtr, painstanceinfo: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetInstanceInfoW(pcinstanceinfo.rawAddress.toString(), painstanceinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetInstanceMiscInfo(instance: JetInstance, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetInstanceMiscInfo(instance.toString(), pvresult.rawAddress.toString(), cbmax.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetLS(sesid: JetSesid, tableid: JetTableid, pls: MutPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetLS(sesid.toString(), tableid.toString(), pls.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetLock(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetLock(sesid.toString(), tableid.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetLogInfoA(szzlogs: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetLogInfoA(szzlogs.rawAddress.toString(), cbmax.toInt(), pcbactual.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetLogInfoInstance2A(instance: JetInstance, szzlogs: MutPtr, cbmax: UInt, pcbactual: MutPtr, ploginfo: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetLogInfoInstance2A(instance.toString(), szzlogs.rawAddress.toString(), cbmax.toInt(), pcbactual.rawAddress.toString(), ploginfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetLogInfoInstance2W(instance: JetInstance, wszzlogs: MutPtr, cbmax: UInt, pcbactual: MutPtr, ploginfo: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetLogInfoInstance2W(instance.toString(), wszzlogs.rawAddress.toString(), cbmax.toInt(), pcbactual.rawAddress.toString(), ploginfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetLogInfoInstanceA(instance: JetInstance, szzlogs: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetLogInfoInstanceA(instance.toString(), szzlogs.rawAddress.toString(), cbmax.toInt(), pcbactual.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetLogInfoInstanceW(instance: JetInstance, wszzlogs: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetLogInfoInstanceW(instance.toString(), wszzlogs.rawAddress.toString(), cbmax.toInt(), pcbactual.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetLogInfoW(szzlogs: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetLogInfoW(szzlogs.rawAddress.toString(), cbmax.toInt(), pcbactual.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetObjectInfoA(sesid: JetSesid, dbid: UInt, objtyp: UInt, szcontainername: ConstPtr, szobjectname: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetObjectInfoA(sesid.toString(), dbid.toInt(), objtyp.toInt(), szcontainername.rawAddress.toString(), szobjectname.rawAddress.toString(), pvresult.rawAddress.toString(), cbmax.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetObjectInfoW(sesid: JetSesid, dbid: UInt, objtyp: UInt, szcontainername: ConstPtr, szobjectname: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetObjectInfoW(sesid.toString(), dbid.toInt(), objtyp.toInt(), szcontainername.rawAddress.toString(), szobjectname.rawAddress.toString(), pvresult.rawAddress.toString(), cbmax.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetRecordPosition(sesid: JetSesid, tableid: JetTableid, precpos: MutPtr, cbrecpos: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetRecordPosition(sesid.toString(), tableid.toString(), precpos.rawAddress.toString(), cbrecpos.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetRecordSize(sesid: JetSesid, tableid: JetTableid, precsize: MutPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetRecordSize(sesid.toString(), tableid.toString(), precsize.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetRecordSize2(sesid: JetSesid, tableid: JetTableid, precsize: MutPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetRecordSize2(sesid.toString(), tableid.toString(), precsize.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetSecondaryIndexBookmark(sesid: JetSesid, tableid: JetTableid, pvsecondarykey: MutPtr, cbsecondarykeymax: UInt, pcbsecondarykeyactual: MutPtr, pvprimarybookmark: MutPtr, cbprimarybookmarkmax: UInt, pcbprimarybookmarkactual: MutPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetSecondaryIndexBookmark(sesid.toString(), tableid.toString(), pvsecondarykey.rawAddress.toString(), cbsecondarykeymax.toInt(), pcbsecondarykeyactual.rawAddress.toString(), pvprimarybookmark.rawAddress.toString(), cbprimarybookmarkmax.toInt(), pcbprimarybookmarkactual.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetSessionParameter(sesid: JetSesid, sesparamid: UInt, pvparam: MutPtr, cbparammax: UInt, pcbparamactual: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetSessionParameter(sesid.toString(), sesparamid.toInt(), pvparam.rawAddress.toString(), cbparammax.toInt(), pcbparamactual.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetSystemParameterA(instance: JetInstance, sesid: JetSesid, paramid: UInt, plparam: MutPtr, szparam: MutPtr, cbmax: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetSystemParameterA(instance.toString(), sesid.toString(), paramid.toInt(), plparam.rawAddress.toString(), szparam.rawAddress.toString(), cbmax.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetSystemParameterW(instance: JetInstance, sesid: JetSesid, paramid: UInt, plparam: MutPtr, szparam: MutPtr, cbmax: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetSystemParameterW(instance.toString(), sesid.toString(), paramid.toInt(), plparam.rawAddress.toString(), szparam.rawAddress.toString(), cbmax.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetTableColumnInfoA(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetTableColumnInfoA(sesid.toString(), tableid.toString(), szcolumnname.rawAddress.toString(), pvresult.rawAddress.toString(), cbmax.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetTableColumnInfoW(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetTableColumnInfoW(sesid.toString(), tableid.toString(), szcolumnname.rawAddress.toString(), pvresult.rawAddress.toString(), cbmax.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetTableIndexInfoA(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, pvresult: MutPtr, cbresult: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetTableIndexInfoA(sesid.toString(), tableid.toString(), szindexname.rawAddress.toString(), pvresult.rawAddress.toString(), cbresult.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetTableIndexInfoW(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, pvresult: MutPtr, cbresult: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetTableIndexInfoW(sesid.toString(), tableid.toString(), szindexname.rawAddress.toString(), pvresult.rawAddress.toString(), cbresult.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetTableInfoA(sesid: JetSesid, tableid: JetTableid, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetTableInfoA(sesid.toString(), tableid.toString(), pvresult.rawAddress.toString(), cbmax.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetTableInfoW(sesid: JetSesid, tableid: JetTableid, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetTableInfoW(sesid.toString(), tableid.toString(), pvresult.rawAddress.toString(), cbmax.toInt(), infolevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetThreadStats(pvresult: MutPtr, cbmax: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetThreadStats(pvresult.rawAddress.toString(), cbmax.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetTruncateLogInfoInstanceA(instance: JetInstance, szzlogs: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetTruncateLogInfoInstanceA(instance.toString(), szzlogs.rawAddress.toString(), cbmax.toInt(), pcbactual.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetTruncateLogInfoInstanceW(instance: JetInstance, wszzlogs: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetTruncateLogInfoInstanceW(instance.toString(), wszzlogs.rawAddress.toString(), cbmax.toInt(), pcbactual.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetVersion(sesid: JetSesid, pwversion: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGetVersion(sesid.toString(), pwversion.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGotoBookmark(sesid: JetSesid, tableid: JetTableid, pvbookmark: ConstPtr, cbbookmark: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGotoBookmark(sesid.toString(), tableid.toString(), pvbookmark.rawAddress.toString(), cbbookmark.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGotoPosition(sesid: JetSesid, tableid: JetTableid, precpos: ConstPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGotoPosition(sesid.toString(), tableid.toString(), precpos.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGotoSecondaryIndexBookmark(sesid: JetSesid, tableid: JetTableid, pvsecondarykey: ConstPtr, cbsecondarykey: UInt, pvprimarybookmark: ConstPtr, cbprimarybookmark: UInt, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGotoSecondaryIndexBookmark(sesid.toString(), tableid.toString(), pvsecondarykey.rawAddress.toString(), cbsecondarykey.toInt(), pvprimarybookmark.rawAddress.toString(), cbprimarybookmark.toInt(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGrowDatabase(sesid: JetSesid, dbid: UInt, cpg: UInt, pcpgreal: ConstPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetGrowDatabase(sesid.toString(), dbid.toInt(), cpg.toInt(), pcpgreal.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetIdle(sesid: JetSesid, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetIdle(sesid.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetIndexRecordCount(sesid: JetSesid, tableid: JetTableid, pcrec: MutPtr, crecmax: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetIndexRecordCount(sesid.toString(), tableid.toString(), pcrec.rawAddress.toString(), crecmax.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetInit(pinstance: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetInit(pinstance.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetInit2(pinstance: MutPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetInit2(pinstance.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetInit3A(pinstance: MutPtr, prstinfo: ConstPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetInit3A(pinstance.rawAddress.toString(), prstinfo.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetInit3W(pinstance: MutPtr, prstinfo: ConstPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetInit3W(pinstance.rawAddress.toString(), prstinfo.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetIntersectIndexes(sesid: JetSesid, rgindexrange: ConstPtr, cindexrange: UInt, precordlist: MutPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetIntersectIndexes(sesid.toString(), rgindexrange.rawAddress.toString(), cindexrange.toInt(), precordlist.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetMakeKey(sesid: JetSesid, tableid: JetTableid, pvdata: ConstPtr, cbdata: UInt, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetMakeKey(sesid.toString(), tableid.toString(), pvdata.rawAddress.toString(), cbdata.toInt(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetMove(sesid: JetSesid, tableid: JetTableid, crow: Int, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetMove(sesid.toString(), tableid.toString(), crow, grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotAbort(snapid: JetOssnapid, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetOSSnapshotAbort(snapid.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotEnd(snapid: JetOssnapid, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetOSSnapshotEnd(snapid.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotFreezeA(snapid: JetOssnapid, pcinstanceinfo: MutPtr, painstanceinfo: MutPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetOSSnapshotFreezeA(snapid.toString(), pcinstanceinfo.rawAddress.toString(), painstanceinfo.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotFreezeW(snapid: JetOssnapid, pcinstanceinfo: MutPtr, painstanceinfo: MutPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetOSSnapshotFreezeW(snapid.toString(), pcinstanceinfo.rawAddress.toString(), painstanceinfo.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotGetFreezeInfoA(snapid: JetOssnapid, pcinstanceinfo: MutPtr, painstanceinfo: MutPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetOSSnapshotGetFreezeInfoA(snapid.toString(), pcinstanceinfo.rawAddress.toString(), painstanceinfo.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotGetFreezeInfoW(snapid: JetOssnapid, pcinstanceinfo: MutPtr, painstanceinfo: MutPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetOSSnapshotGetFreezeInfoW(snapid.toString(), pcinstanceinfo.rawAddress.toString(), painstanceinfo.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotPrepare(psnapid: MutPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetOSSnapshotPrepare(psnapid.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotPrepareInstance(snapid: JetOssnapid, instance: JetInstance, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetOSSnapshotPrepareInstance(snapid.toString(), instance.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotThaw(snapid: JetOssnapid, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetOSSnapshotThaw(snapid.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotTruncateLog(snapid: JetOssnapid, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetOSSnapshotTruncateLog(snapid.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotTruncateLogInstance(snapid: JetOssnapid, instance: JetInstance, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetOSSnapshotTruncateLogInstance(snapid.toString(), instance.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenDatabaseA(sesid: JetSesid, szfilename: ConstPtr, szconnect: ConstPtr, pdbid: MutPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetOpenDatabaseA(sesid.toString(), szfilename.rawAddress.toString(), szconnect.rawAddress.toString(), pdbid.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenDatabaseW(sesid: JetSesid, szfilename: ConstPtr, szconnect: ConstPtr, pdbid: MutPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetOpenDatabaseW(sesid.toString(), szfilename.rawAddress.toString(), szconnect.rawAddress.toString(), pdbid.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenFileA(szfilename: ConstPtr, phffile: MutPtr, pulfilesizelow: MutPtr, pulfilesizehigh: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetOpenFileA(szfilename.rawAddress.toString(), phffile.rawAddress.toString(), pulfilesizelow.rawAddress.toString(), pulfilesizehigh.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenFileInstanceA(instance: JetInstance, szfilename: ConstPtr, phffile: MutPtr, pulfilesizelow: MutPtr, pulfilesizehigh: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetOpenFileInstanceA(instance.toString(), szfilename.rawAddress.toString(), phffile.rawAddress.toString(), pulfilesizelow.rawAddress.toString(), pulfilesizehigh.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenFileInstanceW(instance: JetInstance, szfilename: ConstPtr, phffile: MutPtr, pulfilesizelow: MutPtr, pulfilesizehigh: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetOpenFileInstanceW(instance.toString(), szfilename.rawAddress.toString(), phffile.rawAddress.toString(), pulfilesizelow.rawAddress.toString(), pulfilesizehigh.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenFileW(szfilename: ConstPtr, phffile: MutPtr, pulfilesizelow: MutPtr, pulfilesizehigh: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetOpenFileW(szfilename.rawAddress.toString(), phffile.rawAddress.toString(), pulfilesizelow.rawAddress.toString(), pulfilesizehigh.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenTableA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, pvparameters: ConstPtr, cbparameters: UInt, grbit: UInt, ptableid: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetOpenTableA(sesid.toString(), dbid.toInt(), sztablename.rawAddress.toString(), pvparameters.rawAddress.toString(), cbparameters.toInt(), grbit.toInt(), ptableid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenTableW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, pvparameters: ConstPtr, cbparameters: UInt, grbit: UInt, ptableid: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetOpenTableW(sesid.toString(), dbid.toInt(), sztablename.rawAddress.toString(), pvparameters.rawAddress.toString(), cbparameters.toInt(), grbit.toInt(), ptableid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenTempTable(sesid: JetSesid, prgcolumndef: ConstPtr, ccolumn: UInt, grbit: UInt, ptableid: MutPtr, prgcolumnid: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetOpenTempTable(sesid.toString(), prgcolumndef.rawAddress.toString(), ccolumn.toInt(), grbit.toInt(), ptableid.rawAddress.toString(), prgcolumnid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenTempTable2(sesid: JetSesid, prgcolumndef: ConstPtr, ccolumn: UInt, lcid: UInt, grbit: UInt, ptableid: MutPtr, prgcolumnid: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetOpenTempTable2(sesid.toString(), prgcolumndef.rawAddress.toString(), ccolumn.toInt(), lcid.toInt(), grbit.toInt(), ptableid.rawAddress.toString(), prgcolumnid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenTempTable3(sesid: JetSesid, prgcolumndef: ConstPtr, ccolumn: UInt, pidxunicode: ConstPtr, grbit: UInt, ptableid: MutPtr, prgcolumnid: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetOpenTempTable3(sesid.toString(), prgcolumndef.rawAddress.toString(), ccolumn.toInt(), pidxunicode.rawAddress.toString(), grbit.toInt(), ptableid.rawAddress.toString(), prgcolumnid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenTemporaryTable(sesid: JetSesid, popentemporarytable: ConstPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetOpenTemporaryTable(sesid.toString(), popentemporarytable.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenTemporaryTable2(sesid: JetSesid, popentemporarytable: ConstPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetOpenTemporaryTable2(sesid.toString(), popentemporarytable.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetPrepareUpdate(sesid: JetSesid, tableid: JetTableid, prep: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetPrepareUpdate(sesid.toString(), tableid.toString(), prep.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetPrereadIndexRanges(sesid: JetSesid, tableid: JetTableid, rgindexranges: ConstPtr, cindexranges: UInt, pcrangespreread: MutPtr, rgcolumnidpreread: ConstPtr, ccolumnidpreread: UInt, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetPrereadIndexRanges(sesid.toString(), tableid.toString(), rgindexranges.rawAddress.toString(), cindexranges.toInt(), pcrangespreread.rawAddress.toString(), rgcolumnidpreread.rawAddress.toString(), ccolumnidpreread.toInt(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetPrereadKeys(sesid: JetSesid, tableid: JetTableid, rgpvkeys: ConstPtr, rgcbkeys: ConstPtr, ckeys: Int, pckeyspreread: MutPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetPrereadKeys(sesid.toString(), tableid.toString(), rgpvkeys.rawAddress.toString(), rgcbkeys.rawAddress.toString(), ckeys, pckeyspreread.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetReadFile(hffile: JetHandle, pv: MutPtr, cb: UInt, pcbactual: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetReadFile(hffile.toString(), pv.rawAddress.toString(), cb.toInt(), pcbactual.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetReadFileInstance(instance: JetInstance, hffile: JetHandle, pv: MutPtr, cb: UInt, pcbactual: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetReadFileInstance(instance.toString(), hffile.toString(), pv.rawAddress.toString(), cb.toInt(), pcbactual.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRegisterCallback(sesid: JetSesid, tableid: JetTableid, cbtyp: UInt, pcallback: JetCallback, pvcontext: ConstPtr, phcallbackid: ConstPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetRegisterCallback(sesid.toString(), tableid.toString(), cbtyp.toInt(), 0L.toString(), pvcontext.rawAddress.toString(), phcallbackid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRenameColumnA(sesid: JetSesid, tableid: JetTableid, szname: ConstPtr, sznamenew: ConstPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetRenameColumnA(sesid.toString(), tableid.toString(), szname.rawAddress.toString(), sznamenew.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRenameColumnW(sesid: JetSesid, tableid: JetTableid, szname: ConstPtr, sznamenew: ConstPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetRenameColumnW(sesid.toString(), tableid.toString(), szname.rawAddress.toString(), sznamenew.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRenameTableA(sesid: JetSesid, dbid: UInt, szname: ConstPtr, sznamenew: ConstPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetRenameTableA(sesid.toString(), dbid.toInt(), szname.rawAddress.toString(), sznamenew.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRenameTableW(sesid: JetSesid, dbid: UInt, szname: ConstPtr, sznamenew: ConstPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetRenameTableW(sesid.toString(), dbid.toInt(), szname.rawAddress.toString(), sznamenew.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetResetSessionContext(sesid: JetSesid): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetResetSessionContext(sesid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetResetTableSequential(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetResetTableSequential(sesid.toString(), tableid.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetResizeDatabase(sesid: JetSesid, dbid: UInt, cpgtarget: UInt, pcpgactual: MutPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetResizeDatabase(sesid.toString(), dbid.toInt(), cpgtarget.toInt(), pcpgactual.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRestore2A(sz: ConstPtr, szdest: ConstPtr, pfn: JetPfnstatus): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetRestore2A(sz.rawAddress.toString(), szdest.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRestore2W(sz: ConstPtr, szdest: ConstPtr, pfn: JetPfnstatus): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetRestore2W(sz.rawAddress.toString(), szdest.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRestoreA(szsource: ConstPtr, pfn: JetPfnstatus): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetRestoreA(szsource.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRestoreInstanceA(instance: JetInstance, sz: ConstPtr, szdest: ConstPtr, pfn: JetPfnstatus): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetRestoreInstanceA(instance.toString(), sz.rawAddress.toString(), szdest.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRestoreInstanceW(instance: JetInstance, sz: ConstPtr, szdest: ConstPtr, pfn: JetPfnstatus): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetRestoreInstanceW(instance.toString(), sz.rawAddress.toString(), szdest.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRestoreW(szsource: ConstPtr, pfn: JetPfnstatus): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetRestoreW(szsource.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRetrieveColumn(sesid: JetSesid, tableid: JetTableid, columnid: UInt, pvdata: MutPtr, cbdata: UInt, pcbactual: MutPtr, grbit: UInt, pretinfo: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetRetrieveColumn(sesid.toString(), tableid.toString(), columnid.toInt(), pvdata.rawAddress.toString(), cbdata.toInt(), pcbactual.rawAddress.toString(), grbit.toInt(), pretinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRetrieveColumns(sesid: JetSesid, tableid: JetTableid, pretrievecolumn: MutPtr, cretrievecolumn: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetRetrieveColumns(sesid.toString(), tableid.toString(), pretrievecolumn.rawAddress.toString(), cretrievecolumn.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRetrieveKey(sesid: JetSesid, tableid: JetTableid, pvkey: MutPtr, cbmax: UInt, pcbactual: MutPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetRetrieveKey(sesid.toString(), tableid.toString(), pvkey.rawAddress.toString(), cbmax.toInt(), pcbactual.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRollback(sesid: JetSesid, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetRollback(sesid.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSeek(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetSeek(sesid.toString(), tableid.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetColumn(sesid: JetSesid, tableid: JetTableid, columnid: UInt, pvdata: ConstPtr, cbdata: UInt, grbit: UInt, psetinfo: ConstPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetSetColumn(sesid.toString(), tableid.toString(), columnid.toInt(), pvdata.rawAddress.toString(), cbdata.toInt(), grbit.toInt(), psetinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetColumnDefaultValueA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, szcolumnname: ConstPtr, pvdata: ConstPtr, cbdata: UInt, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetSetColumnDefaultValueA(sesid.toString(), dbid.toInt(), sztablename.rawAddress.toString(), szcolumnname.rawAddress.toString(), pvdata.rawAddress.toString(), cbdata.toInt(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetColumnDefaultValueW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, szcolumnname: ConstPtr, pvdata: ConstPtr, cbdata: UInt, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetSetColumnDefaultValueW(sesid.toString(), dbid.toInt(), sztablename.rawAddress.toString(), szcolumnname.rawAddress.toString(), pvdata.rawAddress.toString(), cbdata.toInt(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetColumns(sesid: JetSesid, tableid: JetTableid, psetcolumn: ConstPtr, csetcolumn: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetSetColumns(sesid.toString(), tableid.toString(), psetcolumn.rawAddress.toString(), csetcolumn.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCurrentIndex2A(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetSetCurrentIndex2A(sesid.toString(), tableid.toString(), szindexname.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCurrentIndex2W(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetSetCurrentIndex2W(sesid.toString(), tableid.toString(), szindexname.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCurrentIndex3A(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, grbit: UInt, itagsequence: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetSetCurrentIndex3A(sesid.toString(), tableid.toString(), szindexname.rawAddress.toString(), grbit.toInt(), itagsequence.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCurrentIndex3W(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, grbit: UInt, itagsequence: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetSetCurrentIndex3W(sesid.toString(), tableid.toString(), szindexname.rawAddress.toString(), grbit.toInt(), itagsequence.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCurrentIndex4A(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, pindexid: ConstPtr, grbit: UInt, itagsequence: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetSetCurrentIndex4A(sesid.toString(), tableid.toString(), szindexname.rawAddress.toString(), pindexid.rawAddress.toString(), grbit.toInt(), itagsequence.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCurrentIndex4W(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, pindexid: ConstPtr, grbit: UInt, itagsequence: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetSetCurrentIndex4W(sesid.toString(), tableid.toString(), szindexname.rawAddress.toString(), pindexid.rawAddress.toString(), grbit.toInt(), itagsequence.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCurrentIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetSetCurrentIndexA(sesid.toString(), tableid.toString(), szindexname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCurrentIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetSetCurrentIndexW(sesid.toString(), tableid.toString(), szindexname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCursorFilter(sesid: JetSesid, tableid: JetTableid, rgcolumnfilters: ConstPtr, ccolumnfilters: UInt, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetSetCursorFilter(sesid.toString(), tableid.toString(), rgcolumnfilters.rawAddress.toString(), ccolumnfilters.toInt(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetDatabaseSizeA(sesid: JetSesid, szdatabasename: ConstPtr, cpg: UInt, pcpgreal: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetSetDatabaseSizeA(sesid.toString(), szdatabasename.rawAddress.toString(), cpg.toInt(), pcpgreal.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetDatabaseSizeW(sesid: JetSesid, szdatabasename: ConstPtr, cpg: UInt, pcpgreal: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetSetDatabaseSizeW(sesid.toString(), szdatabasename.rawAddress.toString(), cpg.toInt(), pcpgreal.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetIndexRange(sesid: JetSesid, tableidsrc: JetTableid, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetSetIndexRange(sesid.toString(), tableidsrc.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetLS(sesid: JetSesid, tableid: JetTableid, ls: JetLs, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetSetLS(sesid.toString(), tableid.toString(), ls.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetSessionContext(sesid: JetSesid, ulcontext: JetApiPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetSetSessionContext(sesid.toString(), ulcontext.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetSessionParameter(sesid: JetSesid, sesparamid: UInt, pvparam: ConstPtr, cbparam: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetSetSessionParameter(sesid.toString(), sesparamid.toInt(), pvparam.rawAddress.toString(), cbparam.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetSystemParameterA(pinstance: MutPtr, sesid: JetSesid, paramid: UInt, lparam: JetApiPtr, szparam: ConstPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetSetSystemParameterA(pinstance.rawAddress.toString(), sesid.toString(), paramid.toInt(), lparam.toString(), szparam.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetSystemParameterW(pinstance: MutPtr, sesid: JetSesid, paramid: UInt, lparam: JetApiPtr, szparam: ConstPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetSetSystemParameterW(pinstance.rawAddress.toString(), sesid.toString(), paramid.toInt(), lparam.toString(), szparam.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetTableSequential(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetSetTableSequential(sesid.toString(), tableid.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetStopBackup(): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetStopBackup() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetStopBackupInstance(instance: JetInstance): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetStopBackupInstance(instance.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetStopService(): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetStopService() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetStopServiceInstance(instance: JetInstance): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetStopServiceInstance(instance.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetStopServiceInstance2(instance: JetInstance, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetStopServiceInstance2(instance.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetTerm(instance: JetInstance): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetTerm(instance.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetTerm2(instance: JetInstance, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetTerm2(instance.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetTruncateLog(): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetTruncateLog() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetTruncateLogInstance(instance: JetInstance): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetTruncateLogInstance(instance.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetUnregisterCallback(sesid: JetSesid, tableid: JetTableid, cbtyp: UInt, hcallbackid: JetHandle): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetUnregisterCallback(sesid.toString(), tableid.toString(), cbtyp.toInt(), hcallbackid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetUpdate(sesid: JetSesid, tableid: JetTableid, pvbookmark: MutPtr, cbbookmark: UInt, pcbactual: MutPtr): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetUpdate(sesid.toString(), tableid.toString(), pvbookmark.rawAddress.toString(), cbbookmark.toInt(), pcbactual.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetUpdate2(sesid: JetSesid, tableid: JetTableid, pvbookmark: MutPtr, cbbookmark: UInt, pcbactual: MutPtr, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAvailable) wasmWindowssysWindowsWin32StorageJetJetUpdate2(sesid.toString(), tableid.toString(), pvbookmark.rawAddress.toString(), cbbookmark.toInt(), pcbactual.rawAddress.toString(), grbit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")
