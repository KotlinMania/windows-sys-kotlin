@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.io.LpoverlappedCompletionRoutine

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32StorageFilesystemNapiAddon(): Boolean

private val windowsWin32StorageFilesystemNapiAvailable: Boolean = initWindowsWin32StorageFilesystemNapiAddon()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemAddLogContainer(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemAddLogContainer(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemAddLogContainerSet(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemAddLogContainerSet(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemAddUsersToEncryptedFile(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemAddUsersToEncryptedFile(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemAdvanceLogBase(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemAdvanceLogBase(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemAlignReservedLog(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemAlignReservedLog(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemAllocReservedLog(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemAllocReservedLog(p0: String, p1: Int, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemAreFileApisANSI()")
private external fun wasmWindowssysWindowsWin32StorageFilesystemAreFileApisANSI(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemAreShortNamesEnabled(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemAreShortNamesEnabled(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemBackupRead(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemBackupRead(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemBackupSeek(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemBackupSeek(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemBackupWrite(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemBackupWrite(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemBuildIoRingRegisterBuffers(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemBuildIoRingRegisterBuffers(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemBuildIoRingRegisterFileHandles(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemBuildIoRingRegisterFileHandles(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCheckNameLegalDOS8Dot3A(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCheckNameLegalDOS8Dot3A(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCheckNameLegalDOS8Dot3W(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCheckNameLegalDOS8Dot3W(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCloseAndResetLogFile(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCloseAndResetLogFile(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCloseEncryptedFileRaw(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCloseEncryptedFileRaw(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCloseIoRing(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCloseIoRing(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCommitComplete(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCommitComplete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCommitEnlistment(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCommitEnlistment(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCommitTransaction(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCommitTransaction(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCommitTransactionAsync(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCommitTransactionAsync(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCompareFileTime(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCompareFileTime(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCopyFile2(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCopyFile2(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCopyFileA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCopyFileA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCopyFileExA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCopyFileExA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCopyFileExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCopyFileExW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCopyFileFromAppW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCopyFileFromAppW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCopyFileTransactedA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCopyFileTransactedA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCopyFileTransactedW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCopyFileTransactedW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCopyFileW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCopyFileW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCopyLZFile(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCopyLZFile(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCreateDirectoryA(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCreateDirectoryA(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCreateDirectoryExA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCreateDirectoryExA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCreateDirectoryExW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCreateDirectoryExW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCreateDirectoryFromAppW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCreateDirectoryFromAppW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCreateDirectoryTransactedA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCreateDirectoryTransactedA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCreateDirectoryTransactedW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCreateDirectoryTransactedW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCreateDirectoryW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCreateDirectoryW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCreateEnlistment(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCreateEnlistment(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCreateFile2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCreateFile2(p0: String, p1: Int, p2: Int, p3: Int, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCreateFile2FromAppW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCreateFile2FromAppW(p0: String, p1: Int, p2: Int, p3: Int, p4: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCreateFileA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCreateFileA(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: Int, p6: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCreateFileFromAppW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCreateFileFromAppW(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: Int, p6: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCreateFileTransactedA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCreateFileTransactedA(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: Int, p6: String, p7: String, p8: String, p9: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCreateFileTransactedW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCreateFileTransactedW(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: Int, p6: String, p7: String, p8: String, p9: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCreateFileW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCreateFileW(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: Int, p6: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCreateHardLinkA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCreateHardLinkA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCreateHardLinkTransactedA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCreateHardLinkTransactedA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCreateHardLinkTransactedW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCreateHardLinkTransactedW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCreateHardLinkW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCreateHardLinkW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCreateLogContainerScanContext(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCreateLogContainerScanContext(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCreateLogFile(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCreateLogFile(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCreateLogMarshallingArea(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCreateLogMarshallingArea(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCreateResourceManager(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCreateResourceManager(p0: String, p1: String, p2: Int, p3: String, p4: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCreateSymbolicLinkA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCreateSymbolicLinkA(p0: String, p1: String, p2: Int): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCreateSymbolicLinkTransactedA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCreateSymbolicLinkTransactedA(p0: String, p1: String, p2: Int, p3: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCreateSymbolicLinkTransactedW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCreateSymbolicLinkTransactedW(p0: String, p1: String, p2: Int, p3: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCreateSymbolicLinkW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCreateSymbolicLinkW(p0: String, p1: String, p2: Int): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCreateTapePartition(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCreateTapePartition(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCreateTransaction(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCreateTransaction(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemCreateTransactionManager(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemCreateTransactionManager(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemDecryptFileA(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemDecryptFileA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemDecryptFileW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemDecryptFileW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemDefineDosDeviceA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemDefineDosDeviceA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemDefineDosDeviceW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemDefineDosDeviceW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemDeleteFileA(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemDeleteFileA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemDeleteFileFromAppW(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemDeleteFileFromAppW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemDeleteFileTransactedA(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemDeleteFileTransactedA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemDeleteFileTransactedW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemDeleteFileTransactedW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemDeleteFileW(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemDeleteFileW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemDeleteLogByHandle(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemDeleteLogByHandle(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemDeleteLogFile(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemDeleteLogFile(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemDeleteLogMarshallingArea(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemDeleteLogMarshallingArea(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemDeleteVolumeMountPointA(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemDeleteVolumeMountPointA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemDeleteVolumeMountPointW(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemDeleteVolumeMountPointW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemDeregisterManageableLogClient(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemDeregisterManageableLogClient(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemDuplicateEncryptionInfoFile(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemDuplicateEncryptionInfoFile(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemEncryptFileA(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemEncryptFileA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemEncryptFileW(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemEncryptFileW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemEncryptionDisable(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemEncryptionDisable(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemEraseTape(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemEraseTape(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFileEncryptionStatusA(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFileEncryptionStatusA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFileEncryptionStatusW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFileEncryptionStatusW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFileTimeToLocalFileTime(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFileTimeToLocalFileTime(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFindClose(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFindClose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFindCloseChangeNotification(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFindCloseChangeNotification(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFindFirstChangeNotificationA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFindFirstChangeNotificationA(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFindFirstChangeNotificationW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFindFirstChangeNotificationW(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFindFirstFileA(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFindFirstFileA(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFindFirstFileExA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFindFirstFileExA(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFindFirstFileExFromAppW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFindFirstFileExFromAppW(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFindFirstFileExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFindFirstFileExW(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFindFirstFileNameTransactedW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFindFirstFileNameTransactedW(p0: String, p1: Int, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFindFirstFileNameW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFindFirstFileNameW(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFindFirstFileTransactedA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFindFirstFileTransactedA(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFindFirstFileTransactedW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFindFirstFileTransactedW(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFindFirstFileW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFindFirstFileW(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFindFirstStreamTransactedW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFindFirstStreamTransactedW(p0: String, p1: Int, p2: String, p3: Int, p4: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFindFirstStreamW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFindFirstStreamW(p0: String, p1: Int, p2: String, p3: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFindFirstVolumeA(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFindFirstVolumeA(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFindFirstVolumeMountPointA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFindFirstVolumeMountPointA(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFindFirstVolumeMountPointW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFindFirstVolumeMountPointW(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFindFirstVolumeW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFindFirstVolumeW(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFindNextChangeNotification(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFindNextChangeNotification(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFindNextFileA(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFindNextFileA(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFindNextFileNameW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFindNextFileNameW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFindNextFileW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFindNextFileW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFindNextStreamW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFindNextStreamW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFindNextVolumeA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFindNextVolumeA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFindNextVolumeMountPointA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFindNextVolumeMountPointA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFindNextVolumeMountPointW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFindNextVolumeMountPointW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFindNextVolumeW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFindNextVolumeW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFindVolumeClose(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFindVolumeClose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFindVolumeMountPointClose(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFindVolumeMountPointClose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFlushFileBuffers(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFlushFileBuffers(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFlushLogBuffers(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFlushLogBuffers(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFlushLogToLsn(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFlushLogToLsn(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFreeEncryptedFileMetadata(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFreeEncryptedFileMetadata(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFreeEncryptionCertificateHashList(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFreeEncryptionCertificateHashList(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemFreeReservedLog(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemFreeReservedLog(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetBinaryTypeA(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetBinaryTypeA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetBinaryTypeW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetBinaryTypeW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetCompressedFileSizeA(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetCompressedFileSizeA(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetCompressedFileSizeTransactedA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetCompressedFileSizeTransactedA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetCompressedFileSizeTransactedW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetCompressedFileSizeTransactedW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetCompressedFileSizeW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetCompressedFileSizeW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetCurrentClockTransactionManager(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetCurrentClockTransactionManager(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetDiskFreeSpaceA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetDiskFreeSpaceA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetDiskFreeSpaceExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetDiskFreeSpaceExA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetDiskFreeSpaceExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetDiskFreeSpaceExW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetDiskFreeSpaceW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetDiskFreeSpaceW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetDiskSpaceInformationA(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetDiskSpaceInformationA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetDiskSpaceInformationW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetDiskSpaceInformationW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetDriveTypeA(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetDriveTypeA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetDriveTypeW(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetDriveTypeW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetEncryptedFileMetadata(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetEncryptedFileMetadata(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetEnlistmentId(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetEnlistmentId(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetEnlistmentRecoveryInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetEnlistmentRecoveryInformation(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetExpandedNameA(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetExpandedNameA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetExpandedNameW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetExpandedNameW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetFileAttributesA(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetFileAttributesA(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetFileAttributesExA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetFileAttributesExA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetFileAttributesExFromAppW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetFileAttributesExFromAppW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetFileAttributesExW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetFileAttributesExW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetFileAttributesTransactedA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetFileAttributesTransactedA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetFileAttributesTransactedW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetFileAttributesTransactedW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetFileAttributesW(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetFileAttributesW(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetFileBandwidthReservation(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetFileBandwidthReservation(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetFileInformationByHandle(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetFileInformationByHandle(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetFileInformationByHandleEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetFileInformationByHandleEx(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetFileSize(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetFileSize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetFileSizeEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetFileSizeEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetFileTime(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetFileTime(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetFileType(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetFileType(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetFileVersionInfoA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetFileVersionInfoA(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetFileVersionInfoExA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetFileVersionInfoExA(p0: Int, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetFileVersionInfoExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetFileVersionInfoExW(p0: Int, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetFileVersionInfoSizeA(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetFileVersionInfoSizeA(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetFileVersionInfoSizeExA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetFileVersionInfoSizeExA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetFileVersionInfoSizeExW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetFileVersionInfoSizeExW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetFileVersionInfoSizeW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetFileVersionInfoSizeW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetFileVersionInfoW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetFileVersionInfoW(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetFinalPathNameByHandleA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetFinalPathNameByHandleA(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetFinalPathNameByHandleW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetFinalPathNameByHandleW(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetFullPathNameA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetFullPathNameA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetFullPathNameTransactedA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetFullPathNameTransactedA(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetFullPathNameTransactedW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetFullPathNameTransactedW(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetFullPathNameW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetFullPathNameW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetIoRingInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetIoRingInfo(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetLogContainerName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetLogContainerName(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetLogFileInformation(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetLogFileInformation(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetLogIoStatistics(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetLogIoStatistics(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetLogReservationInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetLogReservationInfo(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetLogicalDriveStringsA(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetLogicalDriveStringsA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetLogicalDriveStringsW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetLogicalDriveStringsW(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetLogicalDrives()")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetLogicalDrives(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetLongPathNameA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetLongPathNameA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetLongPathNameTransactedA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetLongPathNameTransactedA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetLongPathNameTransactedW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetLongPathNameTransactedW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetLongPathNameW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetLongPathNameW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetNextLogArchiveExtent(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetNextLogArchiveExtent(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetNotificationResourceManager(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetNotificationResourceManager(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetNotificationResourceManagerAsync(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetNotificationResourceManagerAsync(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetShortPathNameA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetShortPathNameA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetShortPathNameW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetShortPathNameW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetTapeParameters(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetTapeParameters(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetTapePosition(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetTapePosition(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetTapeStatus(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetTapeStatus(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetTempFileNameA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetTempFileNameA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetTempFileNameW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetTempFileNameW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetTempPath2A(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetTempPath2A(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetTempPath2W(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetTempPath2W(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetTempPathA(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetTempPathA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetTempPathW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetTempPathW(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetTransactionId(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetTransactionId(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetTransactionInformation(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetTransactionInformation(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetTransactionManagerId(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetTransactionManagerId(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetVolumeInformationA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetVolumeInformationA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetVolumeInformationByHandleW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetVolumeInformationByHandleW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetVolumeInformationW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetVolumeInformationW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetVolumeNameForVolumeMountPointA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetVolumeNameForVolumeMountPointA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetVolumeNameForVolumeMountPointW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetVolumeNameForVolumeMountPointW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetVolumePathNameA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetVolumePathNameA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetVolumePathNameW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetVolumePathNameW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetVolumePathNamesForVolumeNameA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetVolumePathNamesForVolumeNameA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemGetVolumePathNamesForVolumeNameW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemGetVolumePathNamesForVolumeNameW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemHandleLogFull(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemHandleLogFull(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemInstallLogPolicy(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemInstallLogPolicy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemIsIoRingOpSupported(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemIsIoRingOpSupported(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemLZClose(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemLZClose(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemLZCopy(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemLZCopy(p0: Int, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemLZDone()")
private external fun wasmWindowssysWindowsWin32StorageFilesystemLZDone()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemLZInit(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemLZInit(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemLZOpenFileA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemLZOpenFileA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemLZOpenFileW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemLZOpenFileW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemLZRead(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemLZRead(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemLZSeek(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemLZSeek(p0: Int, p1: Int, p2: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemLZStart()")
private external fun wasmWindowssysWindowsWin32StorageFilesystemLZStart(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemLocalFileTimeToFileTime(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemLocalFileTimeToFileTime(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemLockFile(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemLockFile(p0: String, p1: Int, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemLockFileEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemLockFileEx(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemLogTailAdvanceFailure(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemLogTailAdvanceFailure(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemLsnBlockOffset(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemLsnBlockOffset(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemLsnContainer(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemLsnContainer(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemLsnEqual(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemLsnEqual(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemLsnGreater(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemLsnGreater(p0: String, p1: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemLsnInvalid(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemLsnInvalid(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemLsnLess(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemLsnLess(p0: String, p1: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemLsnNull(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemLsnNull(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemLsnRecordSequence(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemLsnRecordSequence(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemMoveFileA(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemMoveFileA(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemMoveFileExA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemMoveFileExA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemMoveFileExW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemMoveFileExW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemMoveFileFromAppW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemMoveFileFromAppW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemMoveFileTransactedA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemMoveFileTransactedA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemMoveFileTransactedW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemMoveFileTransactedW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemMoveFileW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemMoveFileW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemMoveFileWithProgressA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemMoveFileWithProgressA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemMoveFileWithProgressW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemMoveFileWithProgressW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemNetConnectionEnum(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemNetConnectionEnum(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemNetFileClose(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemNetFileClose(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemNetFileEnum(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemNetFileEnum(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemNetFileGetInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemNetFileGetInfo(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemNetServerAliasAdd(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemNetServerAliasAdd(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemNetServerAliasDel(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemNetServerAliasDel(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemNetServerAliasEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemNetServerAliasEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemNetSessionDel(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemNetSessionDel(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemNetSessionEnum(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemNetSessionEnum(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemNetSessionGetInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemNetSessionGetInfo(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemNetShareAdd(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemNetShareAdd(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemNetShareCheck(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemNetShareCheck(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemNetShareDel(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemNetShareDel(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemNetShareDelEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemNetShareDelEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemNetShareDelSticky(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemNetShareDelSticky(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemNetShareEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemNetShareEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemNetShareEnumSticky(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemNetShareEnumSticky(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemNetShareGetInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemNetShareGetInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemNetShareSetInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemNetShareSetInfo(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemNetStatisticsGet(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemNetStatisticsGet(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemOpenEncryptedFileRawA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemOpenEncryptedFileRawA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemOpenEncryptedFileRawW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemOpenEncryptedFileRawW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemOpenEnlistment(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemOpenEnlistment(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemOpenFile(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemOpenFile(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemOpenFileById(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemOpenFileById(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemOpenResourceManager(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemOpenResourceManager(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemOpenTransaction(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemOpenTransaction(p0: Int, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemOpenTransactionManager(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemOpenTransactionManager(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemOpenTransactionManagerById(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemOpenTransactionManagerById(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemPopIoRingCompletion(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemPopIoRingCompletion(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemPrePrepareComplete(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemPrePrepareComplete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemPrePrepareEnlistment(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemPrePrepareEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemPrepareComplete(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemPrepareComplete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemPrepareEnlistment(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemPrepareEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemPrepareLogArchive(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemPrepareLogArchive(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: String, p11: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemPrepareTape(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemPrepareTape(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemQueryDosDeviceA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemQueryDosDeviceA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemQueryDosDeviceW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemQueryDosDeviceW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemQueryIoRingCapabilities(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemQueryIoRingCapabilities(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemQueryLogPolicy(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemQueryLogPolicy(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemQueryRecoveryAgentsOnEncryptedFile(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemQueryRecoveryAgentsOnEncryptedFile(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemQueryUsersOnEncryptedFile(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemQueryUsersOnEncryptedFile(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemReOpenFile(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemReOpenFile(p0: String, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemReadDirectoryChangesExW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemReadDirectoryChangesExW(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemReadDirectoryChangesW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemReadDirectoryChangesW(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemReadEncryptedFileRaw(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemReadEncryptedFileRaw(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemReadFile(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemReadFile(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemReadFileEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemReadFileEx(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemReadFileScatter(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemReadFileScatter(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemReadLogArchiveMetadata(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemReadLogArchiveMetadata(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemReadLogNotification(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemReadLogNotification(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemReadLogRecord(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemReadLogRecord(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemReadLogRestartArea(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemReadLogRestartArea(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemReadNextLogRecord(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemReadNextLogRecord(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemReadOnlyEnlistment(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemReadOnlyEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemReadPreviousLogRestartArea(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemReadPreviousLogRestartArea(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemRecoverEnlistment(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemRecoverEnlistment(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemRecoverResourceManager(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemRecoverResourceManager(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemRecoverTransactionManager(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemRecoverTransactionManager(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemRegisterForLogWriteNotification(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemRegisterForLogWriteNotification(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemRegisterManageableLogClient(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemRegisterManageableLogClient(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemRemoveDirectoryA(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemRemoveDirectoryA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemRemoveDirectoryFromAppW(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemRemoveDirectoryFromAppW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemRemoveDirectoryTransactedA(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemRemoveDirectoryTransactedA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemRemoveDirectoryTransactedW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemRemoveDirectoryTransactedW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemRemoveDirectoryW(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemRemoveDirectoryW(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemRemoveLogContainer(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemRemoveLogContainer(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemRemoveLogContainerSet(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemRemoveLogContainerSet(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemRemoveLogPolicy(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemRemoveLogPolicy(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemRemoveUsersFromEncryptedFile(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemRemoveUsersFromEncryptedFile(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemRenameTransactionManager(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemRenameTransactionManager(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemReplaceFileA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemReplaceFileA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemReplaceFileFromAppW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemReplaceFileFromAppW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemReplaceFileW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemReplaceFileW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemReserveAndAppendLog(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemReserveAndAppendLog(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String, p7: Int, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemReserveAndAppendLogAligned(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemReserveAndAppendLogAligned(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: Int, p7: String, p8: Int, p9: String, p10: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemRollbackComplete(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemRollbackComplete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemRollbackEnlistment(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemRollbackEnlistment(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemRollbackTransaction(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemRollbackTransaction(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemRollbackTransactionAsync(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemRollbackTransactionAsync(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemRollforwardTransactionManager(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemRollforwardTransactionManager(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemScanLogContainers(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemScanLogContainers(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSearchPathA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSearchPathA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSearchPathW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSearchPathW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetEncryptedFileMetadata(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetEncryptedFileMetadata(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetEndOfFile(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetEndOfFile(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetEndOfLog(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetEndOfLog(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetEnlistmentRecoveryInformation(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetEnlistmentRecoveryInformation(p0: String, p1: Int, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetFileApisToANSI()")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetFileApisToANSI()

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetFileApisToOEM()")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetFileApisToOEM()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetFileAttributesA(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetFileAttributesA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetFileAttributesFromAppW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetFileAttributesFromAppW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetFileAttributesTransactedA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetFileAttributesTransactedA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetFileAttributesTransactedW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetFileAttributesTransactedW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetFileAttributesW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetFileAttributesW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetFileBandwidthReservation(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetFileBandwidthReservation(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetFileCompletionNotificationModes(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetFileCompletionNotificationModes(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetFileInformationByHandle(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetFileInformationByHandle(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetFileIoOverlappedRange(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetFileIoOverlappedRange(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetFilePointer(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetFilePointer(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetFilePointerEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetFilePointerEx(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetFileShortNameA(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetFileShortNameA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetFileShortNameW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetFileShortNameW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetFileTime(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetFileTime(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetFileValidData(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetFileValidData(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetIoRingCompletionEvent(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetIoRingCompletionEvent(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetLogArchiveMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetLogArchiveMode(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetLogArchiveTail(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetLogArchiveTail(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetLogFileSizeWithPolicy(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetLogFileSizeWithPolicy(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetResourceManagerCompletionPort(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetResourceManagerCompletionPort(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetSearchPathMode(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetSearchPathMode(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetTapeParameters(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetTapeParameters(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetTapePosition(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetTapePosition(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetTransactionInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetTransactionInformation(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetUserFileEncryptionKey(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetUserFileEncryptionKey(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetUserFileEncryptionKeyEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetUserFileEncryptionKeyEx(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetVolumeLabelA(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetVolumeLabelA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetVolumeLabelW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetVolumeLabelW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetVolumeMountPointA(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetVolumeMountPointA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSetVolumeMountPointW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSetVolumeMountPointW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSinglePhaseReject(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSinglePhaseReject(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemSubmitIoRing(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemSubmitIoRing(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemTerminateLogArchive(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemTerminateLogArchive(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemTerminateReadLog(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemTerminateReadLog(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemTruncateLog(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemTruncateLog(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemTxfGetThreadMiniVersionForCreate(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemTxfGetThreadMiniVersionForCreate(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemTxfLogDestroyReadContext(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemTxfLogDestroyReadContext(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemTxfLogReadRecords(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemTxfLogReadRecords(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemTxfLogRecordGetFileName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemTxfLogRecordGetFileName(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemTxfLogRecordGetGenericType(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemTxfLogRecordGetGenericType(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemTxfReadMetadataInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemTxfReadMetadataInfo(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemTxfSetThreadMiniVersionForCreate(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemTxfSetThreadMiniVersionForCreate(p0: Int)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemUnlockFile(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemUnlockFile(p0: String, p1: Int, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemUnlockFileEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemUnlockFileEx(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemValidateLog(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemValidateLog(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemVerFindFileA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemVerFindFileA(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemVerFindFileW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemVerFindFileW(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemVerInstallFileA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemVerInstallFileA(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemVerInstallFileW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemVerInstallFileW(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemVerLanguageNameA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemVerLanguageNameA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemVerLanguageNameW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemVerLanguageNameW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemVerQueryValueA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemVerQueryValueA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemVerQueryValueW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemVerQueryValueW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemWofEnumEntries(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemWofEnumEntries(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemWofFileEnumFiles(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemWofFileEnumFiles(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemWofGetDriverVersion(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemWofGetDriverVersion(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemWofIsExternalFile(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemWofIsExternalFile(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemWofSetFileDataLocation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemWofSetFileDataLocation(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemWofShouldCompressBinaries(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemWofShouldCompressBinaries(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemWofWimAddEntry(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemWofWimAddEntry(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemWofWimEnumFiles(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemWofWimEnumFiles(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemWofWimRemoveEntry(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemWofWimRemoveEntry(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemWofWimSuspendEntry(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemWofWimSuspendEntry(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemWofWimUpdateEntry(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemWofWimUpdateEntry(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemWow64DisableWow64FsRedirection(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemWow64DisableWow64FsRedirection(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemWow64EnableWow64FsRedirection(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemWow64EnableWow64FsRedirection(p0: Boolean): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemWow64RevertWow64FsRedirection(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemWow64RevertWow64FsRedirection(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemWriteEncryptedFileRaw(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemWriteEncryptedFileRaw(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemWriteFile(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemWriteFile(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemWriteFileEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemWriteFileEx(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemWriteFileGather(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemWriteFileGather(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemWriteLogRestartArea(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemWriteLogRestartArea(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilesystemWriteTapemark(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageFilesystemWriteTapemark(p0: String, p1: Int, p2: Int, p3: Int): Int

public actual fun addLogContainer(hlog: Handle, pcbcontainer: ConstPtr, pwszcontainerpath: Pcwstr, preserved: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemAddLogContainer(hlog.rawAddress.toString(), pcbcontainer.rawAddress.toString(), pwszcontainerpath.rawAddress.toString(), preserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addLogContainerSet(hlog: Handle, ccontainer: UShort, pcbcontainer: ConstPtr, rgwszcontainerpath: ConstPtr, preserved: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemAddLogContainerSet(hlog.rawAddress.toString(), ccontainer.toInt(), pcbcontainer.rawAddress.toString(), rgwszcontainerpath.rawAddress.toString(), preserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addUsersToEncryptedFile(lpfilename: Pcwstr, pencryptioncertificates: ConstPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemAddUsersToEncryptedFile(lpfilename.rawAddress.toString(), pencryptioncertificates.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun advanceLogBase(pvmarshal: MutPtr, plsnbase: MutPtr, fflags: UInt, poverlapped: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemAdvanceLogBase(pvmarshal.rawAddress.toString(), plsnbase.rawAddress.toString(), fflags.toInt(), poverlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alignReservedLog(pvmarshal: MutPtr, creservedrecords: UInt, rgcbreservation: MutPtr, pcbalignreservation: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemAlignReservedLog(pvmarshal.rawAddress.toString(), creservedrecords.toInt(), rgcbreservation.rawAddress.toString(), pcbalignreservation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allocReservedLog(pvmarshal: MutPtr, creservedrecords: UInt, pcbadjustment: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemAllocReservedLog(pvmarshal.rawAddress.toString(), creservedrecords.toInt(), pcbadjustment.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun areFileApisANSI(): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemAreFileApisANSI() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun areShortNamesEnabled(handle: Handle, enabled: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemAreShortNamesEnabled(handle.rawAddress.toString(), enabled.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backupRead(hfile: Handle, lpbuffer: MutPtr, nnumberofbytestoread: UInt, lpnumberofbytesread: MutPtr, babort: Bool, bprocesssecurity: Bool, lpcontext: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemBackupRead(hfile.rawAddress.toString(), lpbuffer.rawAddress.toString(), nnumberofbytestoread.toInt(), lpnumberofbytesread.rawAddress.toString(), babort, bprocesssecurity, lpcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backupSeek(hfile: Handle, dwlowbytestoseek: UInt, dwhighbytestoseek: UInt, lpdwlowbyteseeked: MutPtr, lpdwhighbyteseeked: MutPtr, lpcontext: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemBackupSeek(hfile.rawAddress.toString(), dwlowbytestoseek.toInt(), dwhighbytestoseek.toInt(), lpdwlowbyteseeked.rawAddress.toString(), lpdwhighbyteseeked.rawAddress.toString(), lpcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backupWrite(hfile: Handle, lpbuffer: ConstPtr, nnumberofbytestowrite: UInt, lpnumberofbyteswritten: MutPtr, babort: Bool, bprocesssecurity: Bool, lpcontext: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemBackupWrite(hfile.rawAddress.toString(), lpbuffer.rawAddress.toString(), nnumberofbytestowrite.toInt(), lpnumberofbyteswritten.rawAddress.toString(), babort, bprocesssecurity, lpcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildIoRingCancelRequest(ioring: Hioring, file: IoringHandleRef, optocancel: ULong, userdata: ULong): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildIoRingFlushFile(ioring: Hioring, fileref: IoringHandleRef, flushmode: FileFlushMode, userdata: ULong, sqeflags: IoringSqeFlags): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildIoRingReadFile(ioring: Hioring, fileref: IoringHandleRef, dataref: IoringBufferRef, numberofbytestoread: UInt, fileoffset: ULong, userdata: ULong, sqeflags: IoringSqeFlags): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildIoRingRegisterBuffers(ioring: Hioring, count: UInt, buffers: ConstPtr, userdata: ULong): Hresult =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemBuildIoRingRegisterBuffers(ioring.rawAddress.toString(), count.toInt(), buffers.rawAddress.toString(), userdata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildIoRingRegisterFileHandles(ioring: Hioring, count: UInt, handles: ConstPtr, userdata: ULong): Hresult =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemBuildIoRingRegisterFileHandles(ioring.rawAddress.toString(), count.toInt(), handles.rawAddress.toString(), userdata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildIoRingWriteFile(ioring: Hioring, fileref: IoringHandleRef, bufferref: IoringBufferRef, numberofbytestowrite: UInt, fileoffset: ULong, writeflags: FileWriteFlags, userdata: ULong, sqeflags: IoringSqeFlags): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkNameLegalDOS8Dot3A(lpname: Pcstr, lpoemname: Pstr, oemnamesize: UInt, pbnamecontainsspaces: MutPtr, pbnamelegal: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCheckNameLegalDOS8Dot3A(lpname.rawAddress.toString(), lpoemname.rawAddress.toString(), oemnamesize.toInt(), pbnamecontainsspaces.rawAddress.toString(), pbnamelegal.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkNameLegalDOS8Dot3W(lpname: Pcwstr, lpoemname: Pstr, oemnamesize: UInt, pbnamecontainsspaces: MutPtr, pbnamelegal: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCheckNameLegalDOS8Dot3W(lpname.rawAddress.toString(), lpoemname.rawAddress.toString(), oemnamesize.toInt(), pbnamecontainsspaces.rawAddress.toString(), pbnamelegal.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeAndResetLogFile(hlog: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCloseAndResetLogFile(hlog.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeEncryptedFileRaw(pvcontext: ConstPtr) {
    if (windowsWin32StorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWin32StorageFilesystemCloseEncryptedFileRaw(pvcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closeIoRing(ioring: Hioring): Hresult =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCloseIoRing(ioring.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commitComplete(enlistmenthandle: Handle, tmvirtualclock: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCommitComplete(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commitEnlistment(enlistmenthandle: Handle, tmvirtualclock: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCommitEnlistment(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commitTransaction(transactionhandle: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCommitTransaction(transactionhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commitTransactionAsync(transactionhandle: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCommitTransactionAsync(transactionhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compareFileTime(lpfiletime1: ConstPtr, lpfiletime2: ConstPtr): Int =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCompareFileTime(lpfiletime1.rawAddress.toString(), lpfiletime2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyFile2(pwszexistingfilename: Pcwstr, pwsznewfilename: Pcwstr, pextendedparameters: ConstPtr): Hresult =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCopyFile2(pwszexistingfilename.rawAddress.toString(), pwsznewfilename.rawAddress.toString(), pextendedparameters.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyFileA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, bfailifexists: Bool): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCopyFileA(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString(), bfailifexists) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyFileExA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr, pbcancel: MutPtr, dwcopyflags: CopyfileFlags): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCopyFileExA(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString(), 0L.toString(), lpdata.rawAddress.toString(), pbcancel.rawAddress.toString(), dwcopyflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyFileExW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr, pbcancel: MutPtr, dwcopyflags: CopyfileFlags): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCopyFileExW(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString(), 0L.toString(), lpdata.rawAddress.toString(), pbcancel.rawAddress.toString(), dwcopyflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyFileFromAppW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, bfailifexists: Bool): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCopyFileFromAppW(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString(), bfailifexists) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyFileTransactedA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr, pbcancel: ConstPtr, dwcopyflags: UInt, htransaction: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCopyFileTransactedA(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString(), 0L.toString(), lpdata.rawAddress.toString(), pbcancel.rawAddress.toString(), dwcopyflags.toInt(), htransaction.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyFileTransactedW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr, pbcancel: ConstPtr, dwcopyflags: UInt, htransaction: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCopyFileTransactedW(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString(), 0L.toString(), lpdata.rawAddress.toString(), pbcancel.rawAddress.toString(), dwcopyflags.toInt(), htransaction.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyFileW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, bfailifexists: Bool): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCopyFileW(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString(), bfailifexists) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyLZFile(hfsource: Int, hfdest: Int): Int =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCopyLZFile(hfsource, hfdest) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDirectoryA(lppathname: Pcstr, lpsecurityattributes: ConstPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCreateDirectoryA(lppathname.rawAddress.toString(), lpsecurityattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDirectoryExA(lptemplatedirectory: Pcstr, lpnewdirectory: Pcstr, lpsecurityattributes: ConstPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCreateDirectoryExA(lptemplatedirectory.rawAddress.toString(), lpnewdirectory.rawAddress.toString(), lpsecurityattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDirectoryExW(lptemplatedirectory: Pcwstr, lpnewdirectory: Pcwstr, lpsecurityattributes: ConstPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCreateDirectoryExW(lptemplatedirectory.rawAddress.toString(), lpnewdirectory.rawAddress.toString(), lpsecurityattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDirectoryFromAppW(lppathname: Pcwstr, lpsecurityattributes: ConstPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCreateDirectoryFromAppW(lppathname.rawAddress.toString(), lpsecurityattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDirectoryTransactedA(lptemplatedirectory: Pcstr, lpnewdirectory: Pcstr, lpsecurityattributes: ConstPtr, htransaction: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCreateDirectoryTransactedA(lptemplatedirectory.rawAddress.toString(), lpnewdirectory.rawAddress.toString(), lpsecurityattributes.rawAddress.toString(), htransaction.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDirectoryTransactedW(lptemplatedirectory: Pcwstr, lpnewdirectory: Pcwstr, lpsecurityattributes: ConstPtr, htransaction: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCreateDirectoryTransactedW(lptemplatedirectory.rawAddress.toString(), lpnewdirectory.rawAddress.toString(), lpsecurityattributes.rawAddress.toString(), htransaction.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDirectoryW(lppathname: Pcwstr, lpsecurityattributes: ConstPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCreateDirectoryW(lppathname.rawAddress.toString(), lpsecurityattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEnlistment(lpenlistmentattributes: MutPtr, resourcemanagerhandle: Handle, transactionhandle: Handle, notificationmask: UInt, createoptions: UInt, enlistmentkey: MutPtr): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemCreateEnlistment(lpenlistmentattributes.rawAddress.toString(), resourcemanagerhandle.rawAddress.toString(), transactionhandle.rawAddress.toString(), notificationmask.toInt(), createoptions.toInt(), enlistmentkey.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFile2(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, dwcreationdisposition: FileCreationDisposition, pcreateexparams: ConstPtr): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemCreateFile2(lpfilename.rawAddress.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), dwcreationdisposition.toInt(), pcreateexparams.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFile2FromAppW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationdisposition: UInt, pcreateexparams: ConstPtr): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemCreateFile2FromAppW(lpfilename.rawAddress.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), dwcreationdisposition.toInt(), pcreateexparams.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileA(lpfilename: Pcstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: ConstPtr, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemCreateFileA(lpfilename.rawAddress.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes.rawAddress.toString(), dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), htemplatefile.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileFromAppW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: ConstPtr, dwcreationdisposition: UInt, dwflagsandattributes: UInt, htemplatefile: Handle): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemCreateFileFromAppW(lpfilename.rawAddress.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes.rawAddress.toString(), dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), htemplatefile.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileTransactedA(lpfilename: Pcstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: ConstPtr, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle, htransaction: Handle, pusminiversion: ConstPtr, lpextendedparameter: ConstPtr): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemCreateFileTransactedA(lpfilename.rawAddress.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes.rawAddress.toString(), dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), htemplatefile.rawAddress.toString(), htransaction.rawAddress.toString(), pusminiversion.rawAddress.toString(), lpextendedparameter.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileTransactedW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: ConstPtr, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle, htransaction: Handle, pusminiversion: ConstPtr, lpextendedparameter: ConstPtr): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemCreateFileTransactedW(lpfilename.rawAddress.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes.rawAddress.toString(), dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), htemplatefile.rawAddress.toString(), htransaction.rawAddress.toString(), pusminiversion.rawAddress.toString(), lpextendedparameter.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: ConstPtr, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemCreateFileW(lpfilename.rawAddress.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes.rawAddress.toString(), dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), htemplatefile.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createHardLinkA(lpfilename: Pcstr, lpexistingfilename: Pcstr, lpsecurityattributes: ConstPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCreateHardLinkA(lpfilename.rawAddress.toString(), lpexistingfilename.rawAddress.toString(), lpsecurityattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createHardLinkTransactedA(lpfilename: Pcstr, lpexistingfilename: Pcstr, lpsecurityattributes: ConstPtr, htransaction: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCreateHardLinkTransactedA(lpfilename.rawAddress.toString(), lpexistingfilename.rawAddress.toString(), lpsecurityattributes.rawAddress.toString(), htransaction.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createHardLinkTransactedW(lpfilename: Pcwstr, lpexistingfilename: Pcwstr, lpsecurityattributes: ConstPtr, htransaction: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCreateHardLinkTransactedW(lpfilename.rawAddress.toString(), lpexistingfilename.rawAddress.toString(), lpsecurityattributes.rawAddress.toString(), htransaction.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createHardLinkW(lpfilename: Pcwstr, lpexistingfilename: Pcwstr, lpsecurityattributes: ConstPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCreateHardLinkW(lpfilename.rawAddress.toString(), lpexistingfilename.rawAddress.toString(), lpsecurityattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIoRing(ioringversion: IoringVersion, flags: IoringCreateFlags, submissionqueuesize: UInt, completionqueuesize: UInt, h: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createLogContainerScanContext(hlog: Handle, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: MutPtr, poverlapped: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCreateLogContainerScanContext(hlog.rawAddress.toString(), cfromcontainer.toInt(), ccontainers.toInt(), escanmode.toInt(), pcxscan.rawAddress.toString(), poverlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createLogFile(pszlogfilename: Pcwstr, fdesiredaccess: UInt, dwsharemode: FileShareMode, psalogfile: MutPtr, fcreatedisposition: FileCreationDisposition, fflagsandattributes: FileFlagsAndAttributes): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemCreateLogFile(pszlogfilename.rawAddress.toString(), fdesiredaccess.toInt(), dwsharemode.toInt(), psalogfile.rawAddress.toString(), fcreatedisposition.toInt(), fflagsandattributes.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createLogMarshallingArea(hlog: Handle, pfnallocbuffer: ClfsBlockAllocation, pfnfreebuffer: ClfsBlockDeallocation, pvblockalloccontext: MutPtr, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshal: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCreateLogMarshallingArea(hlog.rawAddress.toString(), 0L.toString(), 0L.toString(), pvblockalloccontext.rawAddress.toString(), cbmarshallingbuffer.toInt(), cmaxwritebuffers.toInt(), cmaxreadbuffers.toInt(), ppvmarshal.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createResourceManager(lpresourcemanagerattributes: MutPtr, resourcemanagerid: MutPtr, createoptions: UInt, tmhandle: Handle, description: Pcwstr): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemCreateResourceManager(lpresourcemanagerattributes.rawAddress.toString(), resourcemanagerid.rawAddress.toString(), createoptions.toInt(), tmhandle.rawAddress.toString(), description.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSymbolicLinkA(lpsymlinkfilename: Pcstr, lptargetfilename: Pcstr, dwflags: SymbolicLinkFlags): Boolean =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCreateSymbolicLinkA(lpsymlinkfilename.rawAddress.toString(), lptargetfilename.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSymbolicLinkTransactedA(lpsymlinkfilename: Pcstr, lptargetfilename: Pcstr, dwflags: SymbolicLinkFlags, htransaction: Handle): Boolean =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCreateSymbolicLinkTransactedA(lpsymlinkfilename.rawAddress.toString(), lptargetfilename.rawAddress.toString(), dwflags.toInt(), htransaction.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSymbolicLinkTransactedW(lpsymlinkfilename: Pcwstr, lptargetfilename: Pcwstr, dwflags: SymbolicLinkFlags, htransaction: Handle): Boolean =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCreateSymbolicLinkTransactedW(lpsymlinkfilename.rawAddress.toString(), lptargetfilename.rawAddress.toString(), dwflags.toInt(), htransaction.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSymbolicLinkW(lpsymlinkfilename: Pcwstr, lptargetfilename: Pcwstr, dwflags: SymbolicLinkFlags): Boolean =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCreateSymbolicLinkW(lpsymlinkfilename.rawAddress.toString(), lptargetfilename.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createTapePartition(hdevice: Handle, dwpartitionmethod: CreateTapePartitionMethod, dwcount: UInt, dwsize: UInt): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemCreateTapePartition(hdevice.rawAddress.toString(), dwpartitionmethod.toInt(), dwcount.toInt(), dwsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createTransaction(lptransactionattributes: MutPtr, uow: MutPtr, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: UInt, description: Pcwstr): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemCreateTransaction(lptransactionattributes.rawAddress.toString(), uow.rawAddress.toString(), createoptions.toInt(), isolationlevel.toInt(), isolationflags.toInt(), timeout.toInt(), description.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createTransactionManager(lptransactionattributes: MutPtr, logfilename: Pcwstr, createoptions: UInt, commitstrength: UInt): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemCreateTransactionManager(lptransactionattributes.rawAddress.toString(), logfilename.rawAddress.toString(), createoptions.toInt(), commitstrength.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun decryptFileA(lpfilename: Pcstr, dwreserved: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemDecryptFileA(lpfilename.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun decryptFileW(lpfilename: Pcwstr, dwreserved: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemDecryptFileW(lpfilename.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defineDosDeviceA(dwflags: DefineDosDeviceFlags, lpdevicename: Pcstr, lptargetpath: Pcstr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemDefineDosDeviceA(dwflags.toInt(), lpdevicename.rawAddress.toString(), lptargetpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defineDosDeviceW(dwflags: DefineDosDeviceFlags, lpdevicename: Pcwstr, lptargetpath: Pcwstr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemDefineDosDeviceW(dwflags.toInt(), lpdevicename.rawAddress.toString(), lptargetpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteFileA(lpfilename: Pcstr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemDeleteFileA(lpfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteFileFromAppW(lpfilename: Pcwstr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemDeleteFileFromAppW(lpfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteFileTransactedA(lpfilename: Pcstr, htransaction: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemDeleteFileTransactedA(lpfilename.rawAddress.toString(), htransaction.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteFileTransactedW(lpfilename: Pcwstr, htransaction: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemDeleteFileTransactedW(lpfilename.rawAddress.toString(), htransaction.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteFileW(lpfilename: Pcwstr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemDeleteFileW(lpfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteLogByHandle(hlog: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemDeleteLogByHandle(hlog.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteLogFile(pszlogfilename: Pcwstr, pvreserved: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemDeleteLogFile(pszlogfilename.rawAddress.toString(), pvreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteLogMarshallingArea(pvmarshal: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemDeleteLogMarshallingArea(pvmarshal.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteVolumeMountPointA(lpszvolumemountpoint: Pcstr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemDeleteVolumeMountPointA(lpszvolumemountpoint.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteVolumeMountPointW(lpszvolumemountpoint: Pcwstr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemDeleteVolumeMountPointW(lpszvolumemountpoint.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deregisterManageableLogClient(hlog: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemDeregisterManageableLogClient(hlog.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplicateEncryptionInfoFile(srcfilename: Pcwstr, dstfilename: Pcwstr, dwcreationdistribution: UInt, dwattributes: UInt, lpsecurityattributes: ConstPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemDuplicateEncryptionInfoFile(srcfilename.rawAddress.toString(), dstfilename.rawAddress.toString(), dwcreationdistribution.toInt(), dwattributes.toInt(), lpsecurityattributes.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun encryptFileA(lpfilename: Pcstr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemEncryptFileA(lpfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun encryptFileW(lpfilename: Pcwstr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemEncryptFileW(lpfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun encryptionDisable(dirpath: Pcwstr, disable: Bool): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemEncryptionDisable(dirpath.rawAddress.toString(), disable) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eraseTape(hdevice: Handle, dwerasetype: EraseTapeType, bimmediate: Bool): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemEraseTape(hdevice.rawAddress.toString(), dwerasetype.toInt(), bimmediate).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileEncryptionStatusA(lpfilename: Pcstr, lpstatus: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemFileEncryptionStatusA(lpfilename.rawAddress.toString(), lpstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileEncryptionStatusW(lpfilename: Pcwstr, lpstatus: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemFileEncryptionStatusW(lpfilename.rawAddress.toString(), lpstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileTimeToLocalFileTime(lpfiletime: ConstPtr, lplocalfiletime: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemFileTimeToLocalFileTime(lpfiletime.rawAddress.toString(), lplocalfiletime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findClose(hfindfile: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemFindClose(hfindfile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findCloseChangeNotification(hchangehandle: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemFindCloseChangeNotification(hchangehandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstChangeNotificationA(lppathname: Pcstr, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemFindFirstChangeNotificationA(lppathname.rawAddress.toString(), bwatchsubtree, dwnotifyfilter.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstChangeNotificationW(lppathname: Pcwstr, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemFindFirstChangeNotificationW(lppathname.rawAddress.toString(), bwatchsubtree, dwnotifyfilter.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstFileA(lpfilename: Pcstr, lpfindfiledata: MutPtr): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemFindFirstFileA(lpfilename.rawAddress.toString(), lpfindfiledata.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstFileExA(lpfilename: Pcstr, finfolevelid: FindexInfoLevels, lpfindfiledata: MutPtr, fsearchop: FindexSearchOps, lpsearchfilter: ConstPtr, dwadditionalflags: FindFirstExFlags): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemFindFirstFileExA(lpfilename.rawAddress.toString(), finfolevelid, lpfindfiledata.rawAddress.toString(), fsearchop, lpsearchfilter.rawAddress.toString(), dwadditionalflags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstFileExFromAppW(lpfilename: Pcwstr, finfolevelid: FindexInfoLevels, lpfindfiledata: MutPtr, fsearchop: FindexSearchOps, lpsearchfilter: ConstPtr, dwadditionalflags: UInt): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemFindFirstFileExFromAppW(lpfilename.rawAddress.toString(), finfolevelid, lpfindfiledata.rawAddress.toString(), fsearchop, lpsearchfilter.rawAddress.toString(), dwadditionalflags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstFileExW(lpfilename: Pcwstr, finfolevelid: FindexInfoLevels, lpfindfiledata: MutPtr, fsearchop: FindexSearchOps, lpsearchfilter: ConstPtr, dwadditionalflags: FindFirstExFlags): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemFindFirstFileExW(lpfilename.rawAddress.toString(), finfolevelid, lpfindfiledata.rawAddress.toString(), fsearchop, lpsearchfilter.rawAddress.toString(), dwadditionalflags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstFileNameTransactedW(lpfilename: Pcwstr, dwflags: UInt, stringlength: MutPtr, linkname: Pwstr, htransaction: Handle): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemFindFirstFileNameTransactedW(lpfilename.rawAddress.toString(), dwflags.toInt(), stringlength.rawAddress.toString(), linkname.rawAddress.toString(), htransaction.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstFileNameW(lpfilename: Pcwstr, dwflags: UInt, stringlength: MutPtr, linkname: Pwstr): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemFindFirstFileNameW(lpfilename.rawAddress.toString(), dwflags.toInt(), stringlength.rawAddress.toString(), linkname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstFileTransactedA(lpfilename: Pcstr, finfolevelid: FindexInfoLevels, lpfindfiledata: MutPtr, fsearchop: FindexSearchOps, lpsearchfilter: ConstPtr, dwadditionalflags: UInt, htransaction: Handle): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemFindFirstFileTransactedA(lpfilename.rawAddress.toString(), finfolevelid, lpfindfiledata.rawAddress.toString(), fsearchop, lpsearchfilter.rawAddress.toString(), dwadditionalflags.toInt(), htransaction.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstFileTransactedW(lpfilename: Pcwstr, finfolevelid: FindexInfoLevels, lpfindfiledata: MutPtr, fsearchop: FindexSearchOps, lpsearchfilter: ConstPtr, dwadditionalflags: UInt, htransaction: Handle): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemFindFirstFileTransactedW(lpfilename.rawAddress.toString(), finfolevelid, lpfindfiledata.rawAddress.toString(), fsearchop, lpsearchfilter.rawAddress.toString(), dwadditionalflags.toInt(), htransaction.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstFileW(lpfilename: Pcwstr, lpfindfiledata: MutPtr): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemFindFirstFileW(lpfilename.rawAddress.toString(), lpfindfiledata.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstStreamTransactedW(lpfilename: Pcwstr, infolevel: StreamInfoLevels, lpfindstreamdata: MutPtr, dwflags: UInt, htransaction: Handle): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemFindFirstStreamTransactedW(lpfilename.rawAddress.toString(), infolevel, lpfindstreamdata.rawAddress.toString(), dwflags.toInt(), htransaction.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstStreamW(lpfilename: Pcwstr, infolevel: StreamInfoLevels, lpfindstreamdata: MutPtr, dwflags: UInt): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemFindFirstStreamW(lpfilename.rawAddress.toString(), infolevel, lpfindstreamdata.rawAddress.toString(), dwflags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstVolumeA(lpszvolumename: Pstr, cchbufferlength: UInt): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemFindFirstVolumeA(lpszvolumename.rawAddress.toString(), cchbufferlength.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstVolumeMountPointA(lpszrootpathname: Pcstr, lpszvolumemountpoint: Pstr, cchbufferlength: UInt): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemFindFirstVolumeMountPointA(lpszrootpathname.rawAddress.toString(), lpszvolumemountpoint.rawAddress.toString(), cchbufferlength.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstVolumeMountPointW(lpszrootpathname: Pcwstr, lpszvolumemountpoint: Pwstr, cchbufferlength: UInt): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemFindFirstVolumeMountPointW(lpszrootpathname.rawAddress.toString(), lpszvolumemountpoint.rawAddress.toString(), cchbufferlength.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstVolumeW(lpszvolumename: Pwstr, cchbufferlength: UInt): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemFindFirstVolumeW(lpszvolumename.rawAddress.toString(), cchbufferlength.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextChangeNotification(hchangehandle: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemFindNextChangeNotification(hchangehandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextFileA(hfindfile: Handle, lpfindfiledata: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemFindNextFileA(hfindfile.rawAddress.toString(), lpfindfiledata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextFileNameW(hfindstream: Handle, stringlength: MutPtr, linkname: Pwstr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemFindNextFileNameW(hfindstream.rawAddress.toString(), stringlength.rawAddress.toString(), linkname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextFileW(hfindfile: Handle, lpfindfiledata: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemFindNextFileW(hfindfile.rawAddress.toString(), lpfindfiledata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextStreamW(hfindstream: Handle, lpfindstreamdata: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemFindNextStreamW(hfindstream.rawAddress.toString(), lpfindstreamdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextVolumeA(hfindvolume: Handle, lpszvolumename: Pstr, cchbufferlength: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemFindNextVolumeA(hfindvolume.rawAddress.toString(), lpszvolumename.rawAddress.toString(), cchbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextVolumeMountPointA(hfindvolumemountpoint: Handle, lpszvolumemountpoint: Pstr, cchbufferlength: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemFindNextVolumeMountPointA(hfindvolumemountpoint.rawAddress.toString(), lpszvolumemountpoint.rawAddress.toString(), cchbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextVolumeMountPointW(hfindvolumemountpoint: Handle, lpszvolumemountpoint: Pwstr, cchbufferlength: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemFindNextVolumeMountPointW(hfindvolumemountpoint.rawAddress.toString(), lpszvolumemountpoint.rawAddress.toString(), cchbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextVolumeW(hfindvolume: Handle, lpszvolumename: Pwstr, cchbufferlength: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemFindNextVolumeW(hfindvolume.rawAddress.toString(), lpszvolumename.rawAddress.toString(), cchbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findVolumeClose(hfindvolume: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemFindVolumeClose(hfindvolume.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findVolumeMountPointClose(hfindvolumemountpoint: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemFindVolumeMountPointClose(hfindvolumemountpoint.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushFileBuffers(hfile: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemFlushFileBuffers(hfile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushLogBuffers(pvmarshal: ConstPtr, poverlapped: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemFlushLogBuffers(pvmarshal.rawAddress.toString(), poverlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushLogToLsn(pvmarshalcontext: MutPtr, plsnflush: MutPtr, plsnlastflushed: MutPtr, poverlapped: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemFlushLogToLsn(pvmarshalcontext.rawAddress.toString(), plsnflush.rawAddress.toString(), plsnlastflushed.rawAddress.toString(), poverlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeEncryptedFileMetadata(pbmetadata: ConstPtr) {
    if (windowsWin32StorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWin32StorageFilesystemFreeEncryptedFileMetadata(pbmetadata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freeEncryptionCertificateHashList(pusers: ConstPtr) {
    if (windowsWin32StorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWin32StorageFilesystemFreeEncryptionCertificateHashList(pusers.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freeReservedLog(pvmarshal: MutPtr, creservedrecords: UInt, pcbadjustment: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemFreeReservedLog(pvmarshal.rawAddress.toString(), creservedrecords.toInt(), pcbadjustment.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBinaryTypeA(lpapplicationname: Pcstr, lpbinarytype: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetBinaryTypeA(lpapplicationname.rawAddress.toString(), lpbinarytype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBinaryTypeW(lpapplicationname: Pcwstr, lpbinarytype: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetBinaryTypeW(lpapplicationname.rawAddress.toString(), lpbinarytype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCompressedFileSizeA(lpfilename: Pcstr, lpfilesizehigh: MutPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetCompressedFileSizeA(lpfilename.rawAddress.toString(), lpfilesizehigh.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCompressedFileSizeTransactedA(lpfilename: Pcstr, lpfilesizehigh: MutPtr, htransaction: Handle): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetCompressedFileSizeTransactedA(lpfilename.rawAddress.toString(), lpfilesizehigh.rawAddress.toString(), htransaction.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCompressedFileSizeTransactedW(lpfilename: Pcwstr, lpfilesizehigh: MutPtr, htransaction: Handle): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetCompressedFileSizeTransactedW(lpfilename.rawAddress.toString(), lpfilesizehigh.rawAddress.toString(), htransaction.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCompressedFileSizeW(lpfilename: Pcwstr, lpfilesizehigh: MutPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetCompressedFileSizeW(lpfilename.rawAddress.toString(), lpfilesizehigh.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentClockTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetCurrentClockTransactionManager(transactionmanagerhandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDiskFreeSpaceA(lprootpathname: Pcstr, lpsectorspercluster: MutPtr, lpbytespersector: MutPtr, lpnumberoffreeclusters: MutPtr, lptotalnumberofclusters: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetDiskFreeSpaceA(lprootpathname.rawAddress.toString(), lpsectorspercluster.rawAddress.toString(), lpbytespersector.rawAddress.toString(), lpnumberoffreeclusters.rawAddress.toString(), lptotalnumberofclusters.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDiskFreeSpaceExA(lpdirectoryname: Pcstr, lpfreebytesavailabletocaller: MutPtr, lptotalnumberofbytes: MutPtr, lptotalnumberoffreebytes: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetDiskFreeSpaceExA(lpdirectoryname.rawAddress.toString(), lpfreebytesavailabletocaller.rawAddress.toString(), lptotalnumberofbytes.rawAddress.toString(), lptotalnumberoffreebytes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDiskFreeSpaceExW(lpdirectoryname: Pcwstr, lpfreebytesavailabletocaller: MutPtr, lptotalnumberofbytes: MutPtr, lptotalnumberoffreebytes: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetDiskFreeSpaceExW(lpdirectoryname.rawAddress.toString(), lpfreebytesavailabletocaller.rawAddress.toString(), lptotalnumberofbytes.rawAddress.toString(), lptotalnumberoffreebytes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDiskFreeSpaceW(lprootpathname: Pcwstr, lpsectorspercluster: MutPtr, lpbytespersector: MutPtr, lpnumberoffreeclusters: MutPtr, lptotalnumberofclusters: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetDiskFreeSpaceW(lprootpathname.rawAddress.toString(), lpsectorspercluster.rawAddress.toString(), lpbytespersector.rawAddress.toString(), lpnumberoffreeclusters.rawAddress.toString(), lptotalnumberofclusters.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDiskSpaceInformationA(rootpath: Pcstr, diskspaceinfo: MutPtr): Hresult =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetDiskSpaceInformationA(rootpath.rawAddress.toString(), diskspaceinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDiskSpaceInformationW(rootpath: Pcwstr, diskspaceinfo: MutPtr): Hresult =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetDiskSpaceInformationW(rootpath.rawAddress.toString(), diskspaceinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDriveTypeA(lprootpathname: Pcstr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetDriveTypeA(lprootpathname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDriveTypeW(lprootpathname: Pcwstr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetDriveTypeW(lprootpathname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEncryptedFileMetadata(lpfilename: Pcwstr, pcbmetadata: MutPtr, ppbmetadata: MutPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetEncryptedFileMetadata(lpfilename.rawAddress.toString(), pcbmetadata.rawAddress.toString(), ppbmetadata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnlistmentId(enlistmenthandle: Handle, enlistmentid: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetEnlistmentId(enlistmenthandle.rawAddress.toString(), enlistmentid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnlistmentRecoveryInformation(enlistmenthandle: Handle, buffersize: UInt, buffer: MutPtr, bufferused: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetEnlistmentRecoveryInformation(enlistmenthandle.rawAddress.toString(), buffersize.toInt(), buffer.rawAddress.toString(), bufferused.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getExpandedNameA(lpszsource: Pcstr, lpszbuffer: Pstr): Int =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetExpandedNameA(lpszsource.rawAddress.toString(), lpszbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getExpandedNameW(lpszsource: Pcwstr, lpszbuffer: Pwstr): Int =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetExpandedNameW(lpszsource.rawAddress.toString(), lpszbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileAttributesA(lpfilename: Pcstr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetFileAttributesA(lpfilename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileAttributesExA(lpfilename: Pcstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetFileAttributesExA(lpfilename.rawAddress.toString(), finfolevelid, lpfileinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileAttributesExFromAppW(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetFileAttributesExFromAppW(lpfilename.rawAddress.toString(), finfolevelid, lpfileinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileAttributesExW(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetFileAttributesExW(lpfilename.rawAddress.toString(), finfolevelid, lpfileinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileAttributesTransactedA(lpfilename: Pcstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: MutPtr, htransaction: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetFileAttributesTransactedA(lpfilename.rawAddress.toString(), finfolevelid, lpfileinformation.rawAddress.toString(), htransaction.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileAttributesTransactedW(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: MutPtr, htransaction: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetFileAttributesTransactedW(lpfilename.rawAddress.toString(), finfolevelid, lpfileinformation.rawAddress.toString(), htransaction.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileAttributesW(lpfilename: Pcwstr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetFileAttributesW(lpfilename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileBandwidthReservation(hfile: Handle, lpperiodmilliseconds: MutPtr, lpbytesperperiod: MutPtr, pdiscardable: MutPtr, lptransfersize: MutPtr, lpnumoutstandingrequests: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetFileBandwidthReservation(hfile.rawAddress.toString(), lpperiodmilliseconds.rawAddress.toString(), lpbytesperperiod.rawAddress.toString(), pdiscardable.rawAddress.toString(), lptransfersize.rawAddress.toString(), lpnumoutstandingrequests.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileInformationByHandle(hfile: Handle, lpfileinformation: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetFileInformationByHandle(hfile.rawAddress.toString(), lpfileinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileInformationByHandleEx(hfile: Handle, fileinformationclass: FileInfoByHandleClass, lpfileinformation: MutPtr, dwbuffersize: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetFileInformationByHandleEx(hfile.rawAddress.toString(), fileinformationclass, lpfileinformation.rawAddress.toString(), dwbuffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileSize(hfile: Handle, lpfilesizehigh: MutPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetFileSize(hfile.rawAddress.toString(), lpfilesizehigh.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileSizeEx(hfile: Handle, lpfilesize: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetFileSizeEx(hfile.rawAddress.toString(), lpfilesize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileTime(hfile: Handle, lpcreationtime: MutPtr, lplastaccesstime: MutPtr, lplastwritetime: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetFileTime(hfile.rawAddress.toString(), lpcreationtime.rawAddress.toString(), lplastaccesstime.rawAddress.toString(), lplastwritetime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileType(hfile: Handle): FileType =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetFileType(hfile.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileVersionInfoA(lptstrfilename: Pcstr, dwhandle: UInt, dwlen: UInt, lpdata: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetFileVersionInfoA(lptstrfilename.rawAddress.toString(), dwhandle.toInt(), dwlen.toInt(), lpdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileVersionInfoExA(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcstr, dwhandle: UInt, dwlen: UInt, lpdata: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetFileVersionInfoExA(dwflags.toInt(), lpwstrfilename.rawAddress.toString(), dwhandle.toInt(), dwlen.toInt(), lpdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileVersionInfoExW(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcwstr, dwhandle: UInt, dwlen: UInt, lpdata: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetFileVersionInfoExW(dwflags.toInt(), lpwstrfilename.rawAddress.toString(), dwhandle.toInt(), dwlen.toInt(), lpdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileVersionInfoSizeA(lptstrfilename: Pcstr, lpdwhandle: MutPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetFileVersionInfoSizeA(lptstrfilename.rawAddress.toString(), lpdwhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileVersionInfoSizeExA(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcstr, lpdwhandle: MutPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetFileVersionInfoSizeExA(dwflags.toInt(), lpwstrfilename.rawAddress.toString(), lpdwhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileVersionInfoSizeExW(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcwstr, lpdwhandle: MutPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetFileVersionInfoSizeExW(dwflags.toInt(), lpwstrfilename.rawAddress.toString(), lpdwhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileVersionInfoSizeW(lptstrfilename: Pcwstr, lpdwhandle: MutPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetFileVersionInfoSizeW(lptstrfilename.rawAddress.toString(), lpdwhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileVersionInfoW(lptstrfilename: Pcwstr, dwhandle: UInt, dwlen: UInt, lpdata: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetFileVersionInfoW(lptstrfilename.rawAddress.toString(), dwhandle.toInt(), dwlen.toInt(), lpdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFinalPathNameByHandleA(hfile: Handle, lpszfilepath: Pstr, cchfilepath: UInt, dwflags: GetfinalpathnamebyhandleFlags): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetFinalPathNameByHandleA(hfile.rawAddress.toString(), lpszfilepath.rawAddress.toString(), cchfilepath.toInt(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFinalPathNameByHandleW(hfile: Handle, lpszfilepath: Pwstr, cchfilepath: UInt, dwflags: GetfinalpathnamebyhandleFlags): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetFinalPathNameByHandleW(hfile.rawAddress.toString(), lpszfilepath.rawAddress.toString(), cchfilepath.toInt(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFullPathNameA(lpfilename: Pcstr, nbufferlength: UInt, lpbuffer: Pstr, lpfilepart: MutPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetFullPathNameA(lpfilename.rawAddress.toString(), nbufferlength.toInt(), lpbuffer.rawAddress.toString(), lpfilepart.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFullPathNameTransactedA(lpfilename: Pcstr, nbufferlength: UInt, lpbuffer: Pstr, lpfilepart: MutPtr, htransaction: Handle): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetFullPathNameTransactedA(lpfilename.rawAddress.toString(), nbufferlength.toInt(), lpbuffer.rawAddress.toString(), lpfilepart.rawAddress.toString(), htransaction.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFullPathNameTransactedW(lpfilename: Pcwstr, nbufferlength: UInt, lpbuffer: Pwstr, lpfilepart: MutPtr, htransaction: Handle): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetFullPathNameTransactedW(lpfilename.rawAddress.toString(), nbufferlength.toInt(), lpbuffer.rawAddress.toString(), lpfilepart.rawAddress.toString(), htransaction.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFullPathNameW(lpfilename: Pcwstr, nbufferlength: UInt, lpbuffer: Pwstr, lpfilepart: MutPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetFullPathNameW(lpfilename.rawAddress.toString(), nbufferlength.toInt(), lpbuffer.rawAddress.toString(), lpfilepart.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIoRingInfo(ioring: Hioring, info: MutPtr): Hresult =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetIoRingInfo(ioring.rawAddress.toString(), info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLogContainerName(hlog: Handle, cidlogicalcontainer: UInt, pwstrcontainername: Pcwstr, clencontainername: UInt, pcactuallencontainername: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetLogContainerName(hlog.rawAddress.toString(), cidlogicalcontainer.toInt(), pwstrcontainername.rawAddress.toString(), clencontainername.toInt(), pcactuallencontainername.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLogFileInformation(hlog: Handle, pinfobuffer: MutPtr, cbbuffer: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetLogFileInformation(hlog.rawAddress.toString(), pinfobuffer.rawAddress.toString(), cbbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLogIoStatistics(hlog: Handle, pvstatsbuffer: MutPtr, cbstatsbuffer: UInt, estatsclass: ClfsIostatsClass, pcbstatswritten: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetLogIoStatistics(hlog.rawAddress.toString(), pvstatsbuffer.rawAddress.toString(), cbstatsbuffer.toInt(), estatsclass, pcbstatswritten.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLogReservationInfo(pvmarshal: ConstPtr, pcbrecordnumber: MutPtr, pcbuserreservation: MutPtr, pcbcommitreservation: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetLogReservationInfo(pvmarshal.rawAddress.toString(), pcbrecordnumber.rawAddress.toString(), pcbuserreservation.rawAddress.toString(), pcbcommitreservation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLogicalDriveStringsA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetLogicalDriveStringsA(nbufferlength.toInt(), lpbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLogicalDriveStringsW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetLogicalDriveStringsW(nbufferlength.toInt(), lpbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLogicalDrives(): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetLogicalDrives().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLongPathNameA(lpszshortpath: Pcstr, lpszlongpath: Pstr, cchbuffer: UInt): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetLongPathNameA(lpszshortpath.rawAddress.toString(), lpszlongpath.rawAddress.toString(), cchbuffer.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLongPathNameTransactedA(lpszshortpath: Pcstr, lpszlongpath: Pstr, cchbuffer: UInt, htransaction: Handle): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetLongPathNameTransactedA(lpszshortpath.rawAddress.toString(), lpszlongpath.rawAddress.toString(), cchbuffer.toInt(), htransaction.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLongPathNameTransactedW(lpszshortpath: Pcwstr, lpszlongpath: Pwstr, cchbuffer: UInt, htransaction: Handle): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetLongPathNameTransactedW(lpszshortpath.rawAddress.toString(), lpszlongpath.rawAddress.toString(), cchbuffer.toInt(), htransaction.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLongPathNameW(lpszshortpath: Pcwstr, lpszlongpath: Pwstr, cchbuffer: UInt): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetLongPathNameW(lpszshortpath.rawAddress.toString(), lpszlongpath.rawAddress.toString(), cchbuffer.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNextLogArchiveExtent(pvarchivecontext: MutPtr, rgadextent: MutPtr, cdescriptors: UInt, pcdescriptorsreturned: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetNextLogArchiveExtent(pvarchivecontext.rawAddress.toString(), rgadextent.rawAddress.toString(), cdescriptors.toInt(), pcdescriptorsreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: MutPtr, notificationlength: UInt, dwmilliseconds: UInt, returnlength: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetNotificationResourceManager(resourcemanagerhandle.rawAddress.toString(), transactionnotification.rawAddress.toString(), notificationlength.toInt(), dwmilliseconds.toInt(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNotificationResourceManagerAsync(resourcemanagerhandle: Handle, transactionnotification: MutPtr, transactionnotificationlength: UInt, returnlength: MutPtr, lpoverlapped: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetNotificationResourceManagerAsync(resourcemanagerhandle.rawAddress.toString(), transactionnotification.rawAddress.toString(), transactionnotificationlength.toInt(), returnlength.rawAddress.toString(), lpoverlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getShortPathNameA(lpszlongpath: Pcstr, lpszshortpath: Pstr, cchbuffer: UInt): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetShortPathNameA(lpszlongpath.rawAddress.toString(), lpszshortpath.rawAddress.toString(), cchbuffer.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getShortPathNameW(lpszlongpath: Pcwstr, lpszshortpath: Pwstr, cchbuffer: UInt): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetShortPathNameW(lpszlongpath.rawAddress.toString(), lpszshortpath.rawAddress.toString(), cchbuffer.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTapeParameters(hdevice: Handle, dwoperation: GetTapeDriveParametersOperation, lpdwsize: MutPtr, lptapeinformation: MutPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetTapeParameters(hdevice.rawAddress.toString(), dwoperation.toInt(), lpdwsize.rawAddress.toString(), lptapeinformation.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTapePosition(hdevice: Handle, dwpositiontype: TapePositionType, lpdwpartition: MutPtr, lpdwoffsetlow: MutPtr, lpdwoffsethigh: MutPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetTapePosition(hdevice.rawAddress.toString(), dwpositiontype.toInt(), lpdwpartition.rawAddress.toString(), lpdwoffsetlow.rawAddress.toString(), lpdwoffsethigh.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTapeStatus(hdevice: Handle): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetTapeStatus(hdevice.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTempFileNameA(lppathname: Pcstr, lpprefixstring: Pcstr, uunique: UInt, lptempfilename: Pstr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetTempFileNameA(lppathname.rawAddress.toString(), lpprefixstring.rawAddress.toString(), uunique.toInt(), lptempfilename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTempFileNameW(lppathname: Pcwstr, lpprefixstring: Pcwstr, uunique: UInt, lptempfilename: Pwstr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetTempFileNameW(lppathname.rawAddress.toString(), lpprefixstring.rawAddress.toString(), uunique.toInt(), lptempfilename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTempPath2A(bufferlength: UInt, buffer: Pstr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetTempPath2A(bufferlength.toInt(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTempPath2W(bufferlength: UInt, buffer: Pwstr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetTempPath2W(bufferlength.toInt(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTempPathA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetTempPathA(nbufferlength.toInt(), lpbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTempPathW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetTempPathW(nbufferlength.toInt(), lpbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTransactionId(transactionhandle: Handle, transactionid: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetTransactionId(transactionhandle.rawAddress.toString(), transactionid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTransactionInformation(transactionhandle: Handle, outcome: MutPtr, isolationlevel: MutPtr, isolationflags: MutPtr, timeout: MutPtr, bufferlength: UInt, description: Pwstr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetTransactionInformation(transactionhandle.rawAddress.toString(), outcome.rawAddress.toString(), isolationlevel.rawAddress.toString(), isolationflags.rawAddress.toString(), timeout.rawAddress.toString(), bufferlength.toInt(), description.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTransactionManagerId(transactionmanagerhandle: Handle, transactionmanagerid: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetTransactionManagerId(transactionmanagerhandle.rawAddress.toString(), transactionmanagerid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVolumeInformationA(lprootpathname: Pcstr, lpvolumenamebuffer: Pstr, nvolumenamesize: UInt, lpvolumeserialnumber: MutPtr, lpmaximumcomponentlength: MutPtr, lpfilesystemflags: MutPtr, lpfilesystemnamebuffer: Pstr, nfilesystemnamesize: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetVolumeInformationA(lprootpathname.rawAddress.toString(), lpvolumenamebuffer.rawAddress.toString(), nvolumenamesize.toInt(), lpvolumeserialnumber.rawAddress.toString(), lpmaximumcomponentlength.rawAddress.toString(), lpfilesystemflags.rawAddress.toString(), lpfilesystemnamebuffer.rawAddress.toString(), nfilesystemnamesize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVolumeInformationByHandleW(hfile: Handle, lpvolumenamebuffer: Pwstr, nvolumenamesize: UInt, lpvolumeserialnumber: MutPtr, lpmaximumcomponentlength: MutPtr, lpfilesystemflags: MutPtr, lpfilesystemnamebuffer: Pwstr, nfilesystemnamesize: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetVolumeInformationByHandleW(hfile.rawAddress.toString(), lpvolumenamebuffer.rawAddress.toString(), nvolumenamesize.toInt(), lpvolumeserialnumber.rawAddress.toString(), lpmaximumcomponentlength.rawAddress.toString(), lpfilesystemflags.rawAddress.toString(), lpfilesystemnamebuffer.rawAddress.toString(), nfilesystemnamesize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVolumeInformationW(lprootpathname: Pcwstr, lpvolumenamebuffer: Pwstr, nvolumenamesize: UInt, lpvolumeserialnumber: MutPtr, lpmaximumcomponentlength: MutPtr, lpfilesystemflags: MutPtr, lpfilesystemnamebuffer: Pwstr, nfilesystemnamesize: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetVolumeInformationW(lprootpathname.rawAddress.toString(), lpvolumenamebuffer.rawAddress.toString(), nvolumenamesize.toInt(), lpvolumeserialnumber.rawAddress.toString(), lpmaximumcomponentlength.rawAddress.toString(), lpfilesystemflags.rawAddress.toString(), lpfilesystemnamebuffer.rawAddress.toString(), nfilesystemnamesize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVolumeNameForVolumeMountPointA(lpszvolumemountpoint: Pcstr, lpszvolumename: Pstr, cchbufferlength: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetVolumeNameForVolumeMountPointA(lpszvolumemountpoint.rawAddress.toString(), lpszvolumename.rawAddress.toString(), cchbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVolumeNameForVolumeMountPointW(lpszvolumemountpoint: Pcwstr, lpszvolumename: Pwstr, cchbufferlength: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetVolumeNameForVolumeMountPointW(lpszvolumemountpoint.rawAddress.toString(), lpszvolumename.rawAddress.toString(), cchbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVolumePathNameA(lpszfilename: Pcstr, lpszvolumepathname: Pstr, cchbufferlength: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetVolumePathNameA(lpszfilename.rawAddress.toString(), lpszvolumepathname.rawAddress.toString(), cchbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVolumePathNameW(lpszfilename: Pcwstr, lpszvolumepathname: Pwstr, cchbufferlength: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetVolumePathNameW(lpszfilename.rawAddress.toString(), lpszvolumepathname.rawAddress.toString(), cchbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVolumePathNamesForVolumeNameA(lpszvolumename: Pcstr, lpszvolumepathnames: Pstr, cchbufferlength: UInt, lpcchreturnlength: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetVolumePathNamesForVolumeNameA(lpszvolumename.rawAddress.toString(), lpszvolumepathnames.rawAddress.toString(), cchbufferlength.toInt(), lpcchreturnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVolumePathNamesForVolumeNameW(lpszvolumename: Pcwstr, lpszvolumepathnames: Pwstr, cchbufferlength: UInt, lpcchreturnlength: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemGetVolumePathNamesForVolumeNameW(lpszvolumename.rawAddress.toString(), lpszvolumepathnames.rawAddress.toString(), cchbufferlength.toInt(), lpcchreturnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun handleLogFull(hlog: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemHandleLogFull(hlog.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun installLogPolicy(hlog: Handle, ppolicy: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemInstallLogPolicy(hlog.rawAddress.toString(), ppolicy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isIoRingOpSupported(ioring: Hioring, op: IoringOpCode): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemIsIoRingOpSupported(ioring.rawAddress.toString(), op) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lZClose(hfile: Int) {
    if (windowsWin32StorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWin32StorageFilesystemLZClose(hfile)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun lZCopy(hfsource: Int, hfdest: Int): Int =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemLZCopy(hfsource, hfdest) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lZDone() {
    if (windowsWin32StorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWin32StorageFilesystemLZDone()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun lZInit(hfsource: Int): Int =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemLZInit(hfsource) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lZOpenFileA(lpfilename: Pcstr, lpreopenbuf: MutPtr, wstyle: LzopenfileStyle): Int =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemLZOpenFileA(lpfilename.rawAddress.toString(), lpreopenbuf.rawAddress.toString(), wstyle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lZOpenFileW(lpfilename: Pcwstr, lpreopenbuf: MutPtr, wstyle: LzopenfileStyle): Int =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemLZOpenFileW(lpfilename.rawAddress.toString(), lpreopenbuf.rawAddress.toString(), wstyle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lZRead(hfile: Int, lpbuffer: Pstr, cbread: Int): Int =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemLZRead(hfile, lpbuffer.rawAddress.toString(), cbread) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lZSeek(hfile: Int, loffset: Int, iorigin: Int): Int =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemLZSeek(hfile, loffset, iorigin) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lZStart(): Int =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemLZStart() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localFileTimeToFileTime(lplocalfiletime: ConstPtr, lpfiletime: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemLocalFileTimeToFileTime(lplocalfiletime.rawAddress.toString(), lpfiletime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lockFile(hfile: Handle, dwfileoffsetlow: UInt, dwfileoffsethigh: UInt, nnumberofbytestolocklow: UInt, nnumberofbytestolockhigh: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemLockFile(hfile.rawAddress.toString(), dwfileoffsetlow.toInt(), dwfileoffsethigh.toInt(), nnumberofbytestolocklow.toInt(), nnumberofbytestolockhigh.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lockFileEx(hfile: Handle, dwflags: LockFileFlags, dwreserved: UInt, nnumberofbytestolocklow: UInt, nnumberofbytestolockhigh: UInt, lpoverlapped: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemLockFileEx(hfile.rawAddress.toString(), dwflags.toInt(), dwreserved.toInt(), nnumberofbytestolocklow.toInt(), nnumberofbytestolockhigh.toInt(), lpoverlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun logTailAdvanceFailure(hlog: Handle, dwreason: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemLogTailAdvanceFailure(hlog.rawAddress.toString(), dwreason.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsnBlockOffset(plsn: ConstPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemLsnBlockOffset(plsn.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsnContainer(plsn: ConstPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemLsnContainer(plsn.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): ClsLsn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsnEqual(plsn1: ConstPtr, plsn2: ConstPtr): Boolean =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemLsnEqual(plsn1.rawAddress.toString(), plsn2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsnGreater(plsn1: ConstPtr, plsn2: ConstPtr): Boolean =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemLsnGreater(plsn1.rawAddress.toString(), plsn2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsnIncrement(plsn: ConstPtr): ClsLsn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsnInvalid(plsn: ConstPtr): Boolean =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemLsnInvalid(plsn.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsnLess(plsn1: ConstPtr, plsn2: ConstPtr): Boolean =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemLsnLess(plsn1.rawAddress.toString(), plsn2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsnNull(plsn: ConstPtr): Boolean =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemLsnNull(plsn.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsnRecordSequence(plsn: ConstPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemLsnRecordSequence(plsn.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveFileA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemMoveFileA(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveFileExA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, dwflags: MoveFileFlags): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemMoveFileExA(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveFileExW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, dwflags: MoveFileFlags): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemMoveFileExW(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveFileFromAppW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemMoveFileFromAppW(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveFileTransactedA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr, dwflags: MoveFileFlags, htransaction: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemMoveFileTransactedA(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString(), 0L.toString(), lpdata.rawAddress.toString(), dwflags.toInt(), htransaction.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveFileTransactedW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr, dwflags: MoveFileFlags, htransaction: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemMoveFileTransactedW(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString(), 0L.toString(), lpdata.rawAddress.toString(), dwflags.toInt(), htransaction.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveFileW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemMoveFileW(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveFileWithProgressA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr, dwflags: MoveFileFlags): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemMoveFileWithProgressA(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString(), 0L.toString(), lpdata.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveFileWithProgressW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr, dwflags: MoveFileFlags): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemMoveFileWithProgressW(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString(), 0L.toString(), lpdata.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netConnectionEnum(servername: Pcwstr, qualifier: Pcwstr, level: UInt, bufptr: MutPtr, prefmaxlen: UInt, entriesread: MutPtr, totalentries: MutPtr, resumeHandle: MutPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemNetConnectionEnum(servername.rawAddress.toString(), qualifier.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumeHandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netFileClose(servername: Pcwstr, fileid: UInt): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemNetFileClose(servername.rawAddress.toString(), fileid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netFileEnum(servername: Pcwstr, basepath: Pcwstr, username: Pcwstr, level: UInt, bufptr: MutPtr, prefmaxlen: UInt, entriesread: MutPtr, totalentries: MutPtr, resumeHandle: MutPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemNetFileEnum(servername.rawAddress.toString(), basepath.rawAddress.toString(), username.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumeHandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netFileGetInfo(servername: Pcwstr, fileid: UInt, level: UInt, bufptr: MutPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemNetFileGetInfo(servername.rawAddress.toString(), fileid.toInt(), level.toInt(), bufptr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerAliasAdd(servername: Pcwstr, level: UInt, buf: ConstPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemNetServerAliasAdd(servername.rawAddress.toString(), level.toInt(), buf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerAliasDel(servername: Pcwstr, level: UInt, buf: ConstPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemNetServerAliasDel(servername.rawAddress.toString(), level.toInt(), buf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerAliasEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr, prefmaxlen: UInt, entriesread: MutPtr, totalentries: MutPtr, resumehandle: MutPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemNetServerAliasEnum(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netSessionDel(servername: Pcwstr, uncclientname: Pcwstr, username: Pcwstr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemNetSessionDel(servername.rawAddress.toString(), uncclientname.rawAddress.toString(), username.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netSessionEnum(servername: Pcwstr, uncclientname: Pcwstr, username: Pcwstr, level: UInt, bufptr: MutPtr, prefmaxlen: UInt, entriesread: MutPtr, totalentries: MutPtr, resumeHandle: MutPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemNetSessionEnum(servername.rawAddress.toString(), uncclientname.rawAddress.toString(), username.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumeHandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netSessionGetInfo(servername: Pcwstr, uncclientname: Pcwstr, username: Pcwstr, level: UInt, bufptr: MutPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemNetSessionGetInfo(servername.rawAddress.toString(), uncclientname.rawAddress.toString(), username.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netShareAdd(servername: Pcwstr, level: UInt, buf: ConstPtr, parmErr: MutPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemNetShareAdd(servername.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netShareCheck(servername: Pcwstr, device: Pcwstr, type: MutPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemNetShareCheck(servername.rawAddress.toString(), device.rawAddress.toString(), type.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netShareDel(servername: Pcwstr, netname: Pcwstr, reserved: UInt): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemNetShareDel(servername.rawAddress.toString(), netname.rawAddress.toString(), reserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netShareDelEx(servername: Pcwstr, level: UInt, buf: ConstPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemNetShareDelEx(servername.rawAddress.toString(), level.toInt(), buf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netShareDelSticky(servername: Pcwstr, netname: Pcwstr, reserved: UInt): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemNetShareDelSticky(servername.rawAddress.toString(), netname.rawAddress.toString(), reserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netShareEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr, prefmaxlen: UInt, entriesread: MutPtr, totalentries: MutPtr, resumeHandle: MutPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemNetShareEnum(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumeHandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netShareEnumSticky(servername: Pcwstr, level: UInt, bufptr: MutPtr, prefmaxlen: UInt, entriesread: MutPtr, totalentries: MutPtr, resumeHandle: MutPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemNetShareEnumSticky(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumeHandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netShareGetInfo(servername: Pcwstr, netname: Pcwstr, level: UInt, bufptr: MutPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemNetShareGetInfo(servername.rawAddress.toString(), netname.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netShareSetInfo(servername: Pcwstr, netname: Pcwstr, level: UInt, buf: ConstPtr, parmErr: MutPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemNetShareSetInfo(servername.rawAddress.toString(), netname.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netStatisticsGet(servername: ConstPtr, service: ConstPtr, level: UInt, options: UInt, buffer: MutPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemNetStatisticsGet(servername.rawAddress.toString(), service.rawAddress.toString(), level.toInt(), options.toInt(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openEncryptedFileRawA(lpfilename: Pcstr, ulflags: UInt, pvcontext: MutPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemOpenEncryptedFileRawA(lpfilename.rawAddress.toString(), ulflags.toInt(), pvcontext.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openEncryptedFileRawW(lpfilename: Pcwstr, ulflags: UInt, pvcontext: MutPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemOpenEncryptedFileRawW(lpfilename.rawAddress.toString(), ulflags.toInt(), pvcontext.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openEnlistment(dwdesiredaccess: UInt, resourcemanagerhandle: Handle, enlistmentid: MutPtr): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemOpenEnlistment(dwdesiredaccess.toInt(), resourcemanagerhandle.rawAddress.toString(), enlistmentid.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openFile(lpfilename: Pcstr, lpreopenbuff: MutPtr, ustyle: UInt): Int =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemOpenFile(lpfilename.rawAddress.toString(), lpreopenbuff.rawAddress.toString(), ustyle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openFileById(hvolumehint: Handle, lpfileid: ConstPtr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: ConstPtr, dwflagsandattributes: FileFlagsAndAttributes): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemOpenFileById(hvolumehint.rawAddress.toString(), lpfileid.rawAddress.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes.rawAddress.toString(), dwflagsandattributes.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openResourceManager(dwdesiredaccess: UInt, tmhandle: Handle, resourcemanagerid: MutPtr): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemOpenResourceManager(dwdesiredaccess.toInt(), tmhandle.rawAddress.toString(), resourcemanagerid.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTransaction(dwdesiredaccess: UInt, transactionid: MutPtr): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemOpenTransaction(dwdesiredaccess.toInt(), transactionid.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTransactionManager(logfilename: Pcwstr, desiredaccess: UInt, openoptions: UInt): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemOpenTransactionManager(logfilename.rawAddress.toString(), desiredaccess.toInt(), openoptions.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTransactionManagerById(transactionmanagerid: ConstPtr, desiredaccess: UInt, openoptions: UInt): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemOpenTransactionManagerById(transactionmanagerid.rawAddress.toString(), desiredaccess.toInt(), openoptions.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popIoRingCompletion(ioring: Hioring, cqe: MutPtr): Hresult =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemPopIoRingCompletion(ioring.rawAddress.toString(), cqe.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemPrePrepareComplete(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemPrePrepareEnlistment(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prepareComplete(enlistmenthandle: Handle, tmvirtualclock: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemPrepareComplete(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemPrepareEnlistment(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prepareLogArchive(hlog: Handle, pszbaselogfilename: Pwstr, clen: UInt, plsnlow: ConstPtr, plsnhigh: ConstPtr, pcactuallength: MutPtr, poffbaselogfiledata: MutPtr, pcbbaselogfilelength: MutPtr, plsnbase: MutPtr, plsnlast: MutPtr, plsncurrentarchivetail: MutPtr, ppvarchivecontext: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemPrepareLogArchive(hlog.rawAddress.toString(), pszbaselogfilename.rawAddress.toString(), clen.toInt(), plsnlow.rawAddress.toString(), plsnhigh.rawAddress.toString(), pcactuallength.rawAddress.toString(), poffbaselogfiledata.rawAddress.toString(), pcbbaselogfilelength.rawAddress.toString(), plsnbase.rawAddress.toString(), plsnlast.rawAddress.toString(), plsncurrentarchivetail.rawAddress.toString(), ppvarchivecontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prepareTape(hdevice: Handle, dwoperation: PrepareTapeOperation, bimmediate: Bool): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemPrepareTape(hdevice.rawAddress.toString(), dwoperation.toInt(), bimmediate).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryDosDeviceA(lpdevicename: Pcstr, lptargetpath: Pstr, ucchmax: UInt): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemQueryDosDeviceA(lpdevicename.rawAddress.toString(), lptargetpath.rawAddress.toString(), ucchmax.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryDosDeviceW(lpdevicename: Pcwstr, lptargetpath: Pwstr, ucchmax: UInt): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemQueryDosDeviceW(lpdevicename.rawAddress.toString(), lptargetpath.rawAddress.toString(), ucchmax.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryIoRingCapabilities(capabilities: MutPtr): Hresult =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemQueryIoRingCapabilities(capabilities.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryLogPolicy(hlog: Handle, epolicytype: ClfsMgmtPolicyType, ppolicybuffer: MutPtr, pcbpolicybuffer: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemQueryLogPolicy(hlog.rawAddress.toString(), epolicytype, ppolicybuffer.rawAddress.toString(), pcbpolicybuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryRecoveryAgentsOnEncryptedFile(lpfilename: Pcwstr, precoveryagents: MutPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemQueryRecoveryAgentsOnEncryptedFile(lpfilename.rawAddress.toString(), precoveryagents.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryUsersOnEncryptedFile(lpfilename: Pcwstr, pusers: MutPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemQueryUsersOnEncryptedFile(lpfilename.rawAddress.toString(), pusers.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reOpenFile(horiginalfile: Handle, dwdesiredaccess: UInt, dwsharemode: FileShareMode, dwflagsandattributes: FileFlagsAndAttributes): Handle =
    if (windowsWin32StorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageFilesystemReOpenFile(horiginalfile.rawAddress.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), dwflagsandattributes.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readDirectoryChangesExW(hdirectory: Handle, lpbuffer: MutPtr, nbufferlength: UInt, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange, lpbytesreturned: MutPtr, lpoverlapped: MutPtr, lpcompletionroutine: LpoverlappedCompletionRoutine, readdirectorynotifyinformationclass: ReadDirectoryNotifyInformationClass): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemReadDirectoryChangesExW(hdirectory.rawAddress.toString(), lpbuffer.rawAddress.toString(), nbufferlength.toInt(), bwatchsubtree, dwnotifyfilter.toInt(), lpbytesreturned.rawAddress.toString(), lpoverlapped.rawAddress.toString(), 0L.toString(), readdirectorynotifyinformationclass) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readDirectoryChangesW(hdirectory: Handle, lpbuffer: MutPtr, nbufferlength: UInt, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange, lpbytesreturned: MutPtr, lpoverlapped: MutPtr, lpcompletionroutine: LpoverlappedCompletionRoutine): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemReadDirectoryChangesW(hdirectory.rawAddress.toString(), lpbuffer.rawAddress.toString(), nbufferlength.toInt(), bwatchsubtree, dwnotifyfilter.toInt(), lpbytesreturned.rawAddress.toString(), lpoverlapped.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readEncryptedFileRaw(pfexportcallback: PfeExportFunc, pvcallbackcontext: ConstPtr, pvcontext: ConstPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemReadEncryptedFileRaw(0L.toString(), pvcallbackcontext.rawAddress.toString(), pvcontext.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readFile(hfile: Handle, lpbuffer: MutPtr, nnumberofbytestoread: UInt, lpnumberofbytesread: MutPtr, lpoverlapped: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemReadFile(hfile.rawAddress.toString(), lpbuffer.rawAddress.toString(), nnumberofbytestoread.toInt(), lpnumberofbytesread.rawAddress.toString(), lpoverlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readFileEx(hfile: Handle, lpbuffer: MutPtr, nnumberofbytestoread: UInt, lpoverlapped: MutPtr, lpcompletionroutine: LpoverlappedCompletionRoutine): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemReadFileEx(hfile.rawAddress.toString(), lpbuffer.rawAddress.toString(), nnumberofbytestoread.toInt(), lpoverlapped.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readFileScatter(hfile: Handle, asegmentarray: ConstPtr, nnumberofbytestoread: UInt, lpreserved: ConstPtr, lpoverlapped: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemReadFileScatter(hfile.rawAddress.toString(), asegmentarray.rawAddress.toString(), nnumberofbytestoread.toInt(), lpreserved.rawAddress.toString(), lpoverlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readLogArchiveMetadata(pvarchivecontext: MutPtr, cboffset: UInt, cbbytestoread: UInt, pbreadbuffer: MutPtr, pcbbytesread: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemReadLogArchiveMetadata(pvarchivecontext.rawAddress.toString(), cboffset.toInt(), cbbytestoread.toInt(), pbreadbuffer.rawAddress.toString(), pcbbytesread.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readLogNotification(hlog: Handle, pnotification: MutPtr, lpoverlapped: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemReadLogNotification(hlog.rawAddress.toString(), pnotification.rawAddress.toString(), lpoverlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readLogRecord(pvmarshal: MutPtr, plsnfirst: MutPtr, econtextmode: ClfsContextMode, ppvreadbuffer: MutPtr, pcbreadbuffer: MutPtr, perecordtype: MutPtr, plsnundonext: MutPtr, plsnprevious: MutPtr, ppvreadcontext: MutPtr, poverlapped: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemReadLogRecord(pvmarshal.rawAddress.toString(), plsnfirst.rawAddress.toString(), econtextmode, ppvreadbuffer.rawAddress.toString(), pcbreadbuffer.rawAddress.toString(), perecordtype.rawAddress.toString(), plsnundonext.rawAddress.toString(), plsnprevious.rawAddress.toString(), ppvreadcontext.rawAddress.toString(), poverlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readLogRestartArea(pvmarshal: MutPtr, ppvrestartbuffer: MutPtr, pcbrestartbuffer: MutPtr, plsn: MutPtr, ppvcontext: MutPtr, poverlapped: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemReadLogRestartArea(pvmarshal.rawAddress.toString(), ppvrestartbuffer.rawAddress.toString(), pcbrestartbuffer.rawAddress.toString(), plsn.rawAddress.toString(), ppvcontext.rawAddress.toString(), poverlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readNextLogRecord(pvreadcontext: MutPtr, ppvbuffer: MutPtr, pcbbuffer: MutPtr, perecordtype: MutPtr, plsnuser: MutPtr, plsnundonext: MutPtr, plsnprevious: MutPtr, plsnrecord: MutPtr, poverlapped: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemReadNextLogRecord(pvreadcontext.rawAddress.toString(), ppvbuffer.rawAddress.toString(), pcbbuffer.rawAddress.toString(), perecordtype.rawAddress.toString(), plsnuser.rawAddress.toString(), plsnundonext.rawAddress.toString(), plsnprevious.rawAddress.toString(), plsnrecord.rawAddress.toString(), poverlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemReadOnlyEnlistment(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readPreviousLogRestartArea(pvreadcontext: MutPtr, ppvrestartbuffer: MutPtr, pcbrestartbuffer: MutPtr, plsnrestart: MutPtr, poverlapped: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemReadPreviousLogRestartArea(pvreadcontext.rawAddress.toString(), ppvrestartbuffer.rawAddress.toString(), pcbrestartbuffer.rawAddress.toString(), plsnrestart.rawAddress.toString(), poverlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recoverEnlistment(enlistmenthandle: Handle, enlistmentkey: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemRecoverEnlistment(enlistmenthandle.rawAddress.toString(), enlistmentkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recoverResourceManager(resourcemanagerhandle: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemRecoverResourceManager(resourcemanagerhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recoverTransactionManager(transactionmanagerhandle: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemRecoverTransactionManager(transactionmanagerhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerForLogWriteNotification(hlog: Handle, cbthreshold: UInt, fenable: Bool): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemRegisterForLogWriteNotification(hlog.rawAddress.toString(), cbthreshold.toInt(), fenable) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerManageableLogClient(hlog: Handle, pcallbacks: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemRegisterManageableLogClient(hlog.rawAddress.toString(), pcallbacks.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeDirectoryA(lppathname: Pcstr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemRemoveDirectoryA(lppathname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeDirectoryFromAppW(lppathname: Pcwstr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemRemoveDirectoryFromAppW(lppathname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeDirectoryTransactedA(lppathname: Pcstr, htransaction: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemRemoveDirectoryTransactedA(lppathname.rawAddress.toString(), htransaction.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeDirectoryTransactedW(lppathname: Pcwstr, htransaction: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemRemoveDirectoryTransactedW(lppathname.rawAddress.toString(), htransaction.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeDirectoryW(lppathname: Pcwstr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemRemoveDirectoryW(lppathname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeLogContainer(hlog: Handle, pwszcontainerpath: Pcwstr, fforce: Bool, preserved: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemRemoveLogContainer(hlog.rawAddress.toString(), pwszcontainerpath.rawAddress.toString(), fforce, preserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeLogContainerSet(hlog: Handle, ccontainer: UShort, rgwszcontainerpath: ConstPtr, fforce: Bool, preserved: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemRemoveLogContainerSet(hlog.rawAddress.toString(), ccontainer.toInt(), rgwszcontainerpath.rawAddress.toString(), fforce, preserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeLogPolicy(hlog: Handle, epolicytype: ClfsMgmtPolicyType): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemRemoveLogPolicy(hlog.rawAddress.toString(), epolicytype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeUsersFromEncryptedFile(lpfilename: Pcwstr, phashes: ConstPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemRemoveUsersFromEncryptedFile(lpfilename.rawAddress.toString(), phashes.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renameTransactionManager(logfilename: Pcwstr, existingtransactionmanagerguid: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemRenameTransactionManager(logfilename.rawAddress.toString(), existingtransactionmanagerguid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun replaceFileA(lpreplacedfilename: Pcstr, lpreplacementfilename: Pcstr, lpbackupfilename: Pcstr, dwreplaceflags: ReplaceFileFlags, lpexclude: ConstPtr, lpreserved: ConstPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemReplaceFileA(lpreplacedfilename.rawAddress.toString(), lpreplacementfilename.rawAddress.toString(), lpbackupfilename.rawAddress.toString(), dwreplaceflags.toInt(), lpexclude.rawAddress.toString(), lpreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun replaceFileFromAppW(lpreplacedfilename: Pcwstr, lpreplacementfilename: Pcwstr, lpbackupfilename: Pcwstr, dwreplaceflags: UInt, lpexclude: ConstPtr, lpreserved: ConstPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemReplaceFileFromAppW(lpreplacedfilename.rawAddress.toString(), lpreplacementfilename.rawAddress.toString(), lpbackupfilename.rawAddress.toString(), dwreplaceflags.toInt(), lpexclude.rawAddress.toString(), lpreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun replaceFileW(lpreplacedfilename: Pcwstr, lpreplacementfilename: Pcwstr, lpbackupfilename: Pcwstr, dwreplaceflags: ReplaceFileFlags, lpexclude: ConstPtr, lpreserved: ConstPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemReplaceFileW(lpreplacedfilename.rawAddress.toString(), lpreplacementfilename.rawAddress.toString(), lpbackupfilename.rawAddress.toString(), dwreplaceflags.toInt(), lpexclude.rawAddress.toString(), lpreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reserveAndAppendLog(pvmarshal: MutPtr, rgwriteentries: MutPtr, cwriteentries: UInt, plsnundonext: MutPtr, plsnprevious: MutPtr, creserverecords: UInt, rgcbreservation: MutPtr, fflags: ClfsFlag, plsn: MutPtr, poverlapped: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemReserveAndAppendLog(pvmarshal.rawAddress.toString(), rgwriteentries.rawAddress.toString(), cwriteentries.toInt(), plsnundonext.rawAddress.toString(), plsnprevious.rawAddress.toString(), creserverecords.toInt(), rgcbreservation.rawAddress.toString(), fflags.toInt(), plsn.rawAddress.toString(), poverlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reserveAndAppendLogAligned(pvmarshal: MutPtr, rgwriteentries: MutPtr, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: MutPtr, plsnprevious: MutPtr, creserverecords: UInt, rgcbreservation: MutPtr, fflags: ClfsFlag, plsn: MutPtr, poverlapped: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemReserveAndAppendLogAligned(pvmarshal.rawAddress.toString(), rgwriteentries.rawAddress.toString(), cwriteentries.toInt(), cbentryalignment.toInt(), plsnundonext.rawAddress.toString(), plsnprevious.rawAddress.toString(), creserverecords.toInt(), rgcbreservation.rawAddress.toString(), fflags.toInt(), plsn.rawAddress.toString(), poverlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rollbackComplete(enlistmenthandle: Handle, tmvirtualclock: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemRollbackComplete(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemRollbackEnlistment(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rollbackTransaction(transactionhandle: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemRollbackTransaction(transactionhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rollbackTransactionAsync(transactionhandle: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemRollbackTransactionAsync(transactionhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemRollforwardTransactionManager(transactionmanagerhandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scanLogContainers(pcxscan: MutPtr, escanmode: UByte, preserved: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemScanLogContainers(pcxscan.rawAddress.toString(), escanmode.toInt(), preserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun searchPathA(lppath: Pcstr, lpfilename: Pcstr, lpextension: Pcstr, nbufferlength: UInt, lpbuffer: Pstr, lpfilepart: MutPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSearchPathA(lppath.rawAddress.toString(), lpfilename.rawAddress.toString(), lpextension.rawAddress.toString(), nbufferlength.toInt(), lpbuffer.rawAddress.toString(), lpfilepart.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun searchPathW(lppath: Pcwstr, lpfilename: Pcwstr, lpextension: Pcwstr, nbufferlength: UInt, lpbuffer: Pwstr, lpfilepart: MutPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSearchPathW(lppath.rawAddress.toString(), lpfilename.rawAddress.toString(), lpextension.rawAddress.toString(), nbufferlength.toInt(), lpbuffer.rawAddress.toString(), lpfilepart.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEncryptedFileMetadata(lpfilename: Pcwstr, pboldmetadata: ConstPtr, pbnewmetadata: ConstPtr, pownerhash: ConstPtr, dwoperation: UInt, pcertificatesadded: ConstPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetEncryptedFileMetadata(lpfilename.rawAddress.toString(), pboldmetadata.rawAddress.toString(), pbnewmetadata.rawAddress.toString(), pownerhash.rawAddress.toString(), dwoperation.toInt(), pcertificatesadded.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEndOfFile(hfile: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetEndOfFile(hfile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEndOfLog(hlog: Handle, plsnend: MutPtr, lpoverlapped: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetEndOfLog(hlog.rawAddress.toString(), plsnend.rawAddress.toString(), lpoverlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEnlistmentRecoveryInformation(enlistmenthandle: Handle, buffersize: UInt, buffer: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetEnlistmentRecoveryInformation(enlistmenthandle.rawAddress.toString(), buffersize.toInt(), buffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileApisToANSI() {
    if (windowsWin32StorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWin32StorageFilesystemSetFileApisToANSI()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setFileApisToOEM() {
    if (windowsWin32StorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWin32StorageFilesystemSetFileApisToOEM()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setFileAttributesA(lpfilename: Pcstr, dwfileattributes: FileFlagsAndAttributes): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetFileAttributesA(lpfilename.rawAddress.toString(), dwfileattributes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileAttributesFromAppW(lpfilename: Pcwstr, dwfileattributes: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetFileAttributesFromAppW(lpfilename.rawAddress.toString(), dwfileattributes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileAttributesTransactedA(lpfilename: Pcstr, dwfileattributes: UInt, htransaction: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetFileAttributesTransactedA(lpfilename.rawAddress.toString(), dwfileattributes.toInt(), htransaction.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileAttributesTransactedW(lpfilename: Pcwstr, dwfileattributes: UInt, htransaction: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetFileAttributesTransactedW(lpfilename.rawAddress.toString(), dwfileattributes.toInt(), htransaction.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileAttributesW(lpfilename: Pcwstr, dwfileattributes: FileFlagsAndAttributes): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetFileAttributesW(lpfilename.rawAddress.toString(), dwfileattributes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileBandwidthReservation(hfile: Handle, nperiodmilliseconds: UInt, nbytesperperiod: UInt, bdiscardable: Bool, lptransfersize: MutPtr, lpnumoutstandingrequests: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetFileBandwidthReservation(hfile.rawAddress.toString(), nperiodmilliseconds.toInt(), nbytesperperiod.toInt(), bdiscardable, lptransfersize.rawAddress.toString(), lpnumoutstandingrequests.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileCompletionNotificationModes(filehandle: Handle, flags: UByte): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetFileCompletionNotificationModes(filehandle.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileInformationByHandle(hfile: Handle, fileinformationclass: FileInfoByHandleClass, lpfileinformation: ConstPtr, dwbuffersize: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetFileInformationByHandle(hfile.rawAddress.toString(), fileinformationclass, lpfileinformation.rawAddress.toString(), dwbuffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileIoOverlappedRange(filehandle: Handle, overlappedrangestart: ConstPtr, length: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetFileIoOverlappedRange(filehandle.rawAddress.toString(), overlappedrangestart.rawAddress.toString(), length.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFilePointer(hfile: Handle, ldistancetomove: Int, lpdistancetomovehigh: MutPtr, dwmovemethod: SetFilePointerMoveMethod): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetFilePointer(hfile.rawAddress.toString(), ldistancetomove, lpdistancetomovehigh.rawAddress.toString(), dwmovemethod.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFilePointerEx(hfile: Handle, lidistancetomove: Long, lpnewfilepointer: MutPtr, dwmovemethod: SetFilePointerMoveMethod): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetFilePointerEx(hfile.rawAddress.toString(), lidistancetomove.toString(), lpnewfilepointer.rawAddress.toString(), dwmovemethod.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileShortNameA(hfile: Handle, lpshortname: Pcstr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetFileShortNameA(hfile.rawAddress.toString(), lpshortname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileShortNameW(hfile: Handle, lpshortname: Pcwstr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetFileShortNameW(hfile.rawAddress.toString(), lpshortname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileTime(hfile: Handle, lpcreationtime: ConstPtr, lplastaccesstime: ConstPtr, lplastwritetime: ConstPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetFileTime(hfile.rawAddress.toString(), lpcreationtime.rawAddress.toString(), lplastaccesstime.rawAddress.toString(), lplastwritetime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileValidData(hfile: Handle, validdatalength: Long): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetFileValidData(hfile.rawAddress.toString(), validdatalength.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIoRingCompletionEvent(ioring: Hioring, hevent: Handle): Hresult =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetIoRingCompletionEvent(ioring.rawAddress.toString(), hevent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setLogArchiveMode(hlog: Handle, emode: ClfsLogArchiveMode): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetLogArchiveMode(hlog.rawAddress.toString(), emode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setLogArchiveTail(hlog: Handle, plsnarchivetail: MutPtr, preserved: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetLogArchiveTail(hlog.rawAddress.toString(), plsnarchivetail.rawAddress.toString(), preserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setLogFileSizeWithPolicy(hlog: Handle, pdesiredsize: ConstPtr, presultingsize: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetLogFileSizeWithPolicy(hlog.rawAddress.toString(), pdesiredsize.rawAddress.toString(), presultingsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setResourceManagerCompletionPort(resourcemanagerhandle: Handle, iocompletionporthandle: Handle, completionkey: ULong): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetResourceManagerCompletionPort(resourcemanagerhandle.rawAddress.toString(), iocompletionporthandle.rawAddress.toString(), completionkey.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSearchPathMode(flags: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetSearchPathMode(flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTapeParameters(hdevice: Handle, dwoperation: TapeInformationType, lptapeinformation: ConstPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetTapeParameters(hdevice.rawAddress.toString(), dwoperation.toInt(), lptapeinformation.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTapePosition(hdevice: Handle, dwpositionmethod: TapePositionMethod, dwpartition: UInt, dwoffsetlow: UInt, dwoffsethigh: UInt, bimmediate: Bool): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetTapePosition(hdevice.rawAddress.toString(), dwpositionmethod.toInt(), dwpartition.toInt(), dwoffsetlow.toInt(), dwoffsethigh.toInt(), bimmediate).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTransactionInformation(transactionhandle: Handle, isolationlevel: UInt, isolationflags: UInt, timeout: UInt, description: Pcwstr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetTransactionInformation(transactionhandle.rawAddress.toString(), isolationlevel.toInt(), isolationflags.toInt(), timeout.toInt(), description.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUserFileEncryptionKey(pencryptioncertificate: ConstPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetUserFileEncryptionKey(pencryptioncertificate.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUserFileEncryptionKeyEx(pencryptioncertificate: ConstPtr, dwcapabilities: UInt, dwflags: UInt, pvreserved: ConstPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetUserFileEncryptionKeyEx(pencryptioncertificate.rawAddress.toString(), dwcapabilities.toInt(), dwflags.toInt(), pvreserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setVolumeLabelA(lprootpathname: Pcstr, lpvolumename: Pcstr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetVolumeLabelA(lprootpathname.rawAddress.toString(), lpvolumename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setVolumeLabelW(lprootpathname: Pcwstr, lpvolumename: Pcwstr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetVolumeLabelW(lprootpathname.rawAddress.toString(), lpvolumename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setVolumeMountPointA(lpszvolumemountpoint: Pcstr, lpszvolumename: Pcstr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetVolumeMountPointA(lpszvolumemountpoint.rawAddress.toString(), lpszvolumename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setVolumeMountPointW(lpszvolumemountpoint: Pcwstr, lpszvolumename: Pcwstr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSetVolumeMountPointW(lpszvolumemountpoint.rawAddress.toString(), lpszvolumename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun singlePhaseReject(enlistmenthandle: Handle, tmvirtualclock: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSinglePhaseReject(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun submitIoRing(ioring: Hioring, waitoperations: UInt, milliseconds: UInt, submittedentries: MutPtr): Hresult =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemSubmitIoRing(ioring.rawAddress.toString(), waitoperations.toInt(), milliseconds.toInt(), submittedentries.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun terminateLogArchive(pvarchivecontext: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemTerminateLogArchive(pvarchivecontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun terminateReadLog(pvcursorcontext: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemTerminateReadLog(pvcursorcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun truncateLog(pvmarshal: ConstPtr, plsnend: ConstPtr, lpoverlapped: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemTruncateLog(pvmarshal.rawAddress.toString(), plsnend.rawAddress.toString(), lpoverlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun txfGetThreadMiniVersionForCreate(miniversion: MutPtr) {
    if (windowsWin32StorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWin32StorageFilesystemTxfGetThreadMiniVersionForCreate(miniversion.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun txfLogCreateFileReadContext(logpath: Pcwstr, beginninglsn: ClsLsn, endinglsn: ClsLsn, txffileid: ConstPtr, txflogcontext: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun txfLogCreateRangeReadContext(logpath: Pcwstr, beginninglsn: ClsLsn, endinglsn: ClsLsn, beginningvirtualclock: ConstPtr, endingvirtualclock: ConstPtr, recordtypemask: UInt, txflogcontext: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun txfLogDestroyReadContext(txflogcontext: ConstPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemTxfLogDestroyReadContext(txflogcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun txfLogReadRecords(txflogcontext: ConstPtr, bufferlength: UInt, buffer: MutPtr, bytesused: MutPtr, recordcount: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemTxfLogReadRecords(txflogcontext.rawAddress.toString(), bufferlength.toInt(), buffer.rawAddress.toString(), bytesused.rawAddress.toString(), recordcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun txfLogRecordGetFileName(recordbuffer: ConstPtr, recordbufferlengthinbytes: UInt, namebuffer: Pwstr, namebufferlengthinbytes: MutPtr, txfid: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemTxfLogRecordGetFileName(recordbuffer.rawAddress.toString(), recordbufferlengthinbytes.toInt(), namebuffer.rawAddress.toString(), namebufferlengthinbytes.rawAddress.toString(), txfid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun txfLogRecordGetGenericType(recordbuffer: ConstPtr, recordbufferlengthinbytes: UInt, generictype: MutPtr, virtualclock: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemTxfLogRecordGetGenericType(recordbuffer.rawAddress.toString(), recordbufferlengthinbytes.toInt(), generictype.rawAddress.toString(), virtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun txfReadMetadataInfo(filehandle: Handle, txffileid: MutPtr, lastlsn: MutPtr, transactionstate: MutPtr, lockingtransaction: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemTxfReadMetadataInfo(filehandle.rawAddress.toString(), txffileid.rawAddress.toString(), lastlsn.rawAddress.toString(), transactionstate.rawAddress.toString(), lockingtransaction.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun txfSetThreadMiniVersionForCreate(miniversion: UShort) {
    if (windowsWin32StorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWin32StorageFilesystemTxfSetThreadMiniVersionForCreate(miniversion.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unlockFile(hfile: Handle, dwfileoffsetlow: UInt, dwfileoffsethigh: UInt, nnumberofbytestounlocklow: UInt, nnumberofbytestounlockhigh: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemUnlockFile(hfile.rawAddress.toString(), dwfileoffsetlow.toInt(), dwfileoffsethigh.toInt(), nnumberofbytestounlocklow.toInt(), nnumberofbytestounlockhigh.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlockFileEx(hfile: Handle, dwreserved: UInt, nnumberofbytestounlocklow: UInt, nnumberofbytestounlockhigh: UInt, lpoverlapped: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemUnlockFileEx(hfile.rawAddress.toString(), dwreserved.toInt(), nnumberofbytestounlocklow.toInt(), nnumberofbytestounlockhigh.toInt(), lpoverlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun validateLog(pszlogfilename: Pcwstr, psalogfile: MutPtr, pinfobuffer: MutPtr, pcbbuffer: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemValidateLog(pszlogfilename.rawAddress.toString(), psalogfile.rawAddress.toString(), pinfobuffer.rawAddress.toString(), pcbbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verFindFileA(uflags: VerFindFileFlags, szfilename: Pcstr, szwindir: Pcstr, szappdir: Pcstr, szcurdir: Pstr, pucurdirlen: MutPtr, szdestdir: Pstr, pudestdirlen: MutPtr): VerFindFileStatus =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemVerFindFileA(uflags.toInt(), szfilename.rawAddress.toString(), szwindir.rawAddress.toString(), szappdir.rawAddress.toString(), szcurdir.rawAddress.toString(), pucurdirlen.rawAddress.toString(), szdestdir.rawAddress.toString(), pudestdirlen.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verFindFileW(uflags: VerFindFileFlags, szfilename: Pcwstr, szwindir: Pcwstr, szappdir: Pcwstr, szcurdir: Pwstr, pucurdirlen: MutPtr, szdestdir: Pwstr, pudestdirlen: MutPtr): VerFindFileStatus =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemVerFindFileW(uflags.toInt(), szfilename.rawAddress.toString(), szwindir.rawAddress.toString(), szappdir.rawAddress.toString(), szcurdir.rawAddress.toString(), pucurdirlen.rawAddress.toString(), szdestdir.rawAddress.toString(), pudestdirlen.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verInstallFileA(uflags: VerInstallFileFlags, szsrcfilename: Pcstr, szdestfilename: Pcstr, szsrcdir: Pcstr, szdestdir: Pcstr, szcurdir: Pcstr, sztmpfile: Pstr, putmpfilelen: MutPtr): VerInstallFileStatus =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemVerInstallFileA(uflags.toInt(), szsrcfilename.rawAddress.toString(), szdestfilename.rawAddress.toString(), szsrcdir.rawAddress.toString(), szdestdir.rawAddress.toString(), szcurdir.rawAddress.toString(), sztmpfile.rawAddress.toString(), putmpfilelen.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verInstallFileW(uflags: VerInstallFileFlags, szsrcfilename: Pcwstr, szdestfilename: Pcwstr, szsrcdir: Pcwstr, szdestdir: Pcwstr, szcurdir: Pcwstr, sztmpfile: Pwstr, putmpfilelen: MutPtr): VerInstallFileStatus =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemVerInstallFileW(uflags.toInt(), szsrcfilename.rawAddress.toString(), szdestfilename.rawAddress.toString(), szsrcdir.rawAddress.toString(), szdestdir.rawAddress.toString(), szcurdir.rawAddress.toString(), sztmpfile.rawAddress.toString(), putmpfilelen.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verLanguageNameA(wlang: UInt, szlang: Pstr, cchlang: UInt): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemVerLanguageNameA(wlang.toInt(), szlang.rawAddress.toString(), cchlang.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verLanguageNameW(wlang: UInt, szlang: Pwstr, cchlang: UInt): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemVerLanguageNameW(wlang.toInt(), szlang.rawAddress.toString(), cchlang.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verQueryValueA(pblock: ConstPtr, lpsubblock: Pcstr, lplpbuffer: MutPtr, pulen: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemVerQueryValueA(pblock.rawAddress.toString(), lpsubblock.rawAddress.toString(), lplpbuffer.rawAddress.toString(), pulen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verQueryValueW(pblock: ConstPtr, lpsubblock: Pcwstr, lplpbuffer: MutPtr, pulen: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemVerQueryValueW(pblock.rawAddress.toString(), lpsubblock.rawAddress.toString(), lplpbuffer.rawAddress.toString(), pulen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wofEnumEntries(volumename: Pcwstr, provider: UInt, enumproc: WofEnumEntryProc, userdata: ConstPtr): Hresult =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemWofEnumEntries(volumename.rawAddress.toString(), provider.toInt(), 0L.toString(), userdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wofFileEnumFiles(volumename: Pcwstr, algorithm: UInt, enumproc: WofEnumFilesProc, userdata: ConstPtr): Hresult =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemWofFileEnumFiles(volumename.rawAddress.toString(), algorithm.toInt(), 0L.toString(), userdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wofGetDriverVersion(fileorvolumehandle: Handle, provider: UInt, wofversion: MutPtr): Hresult =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemWofGetDriverVersion(fileorvolumehandle.rawAddress.toString(), provider.toInt(), wofversion.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wofIsExternalFile(filepath: Pcwstr, isexternalfile: MutPtr, provider: MutPtr, externalfileinfo: MutPtr, bufferlength: MutPtr): Hresult =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemWofIsExternalFile(filepath.rawAddress.toString(), isexternalfile.rawAddress.toString(), provider.rawAddress.toString(), externalfileinfo.rawAddress.toString(), bufferlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wofSetFileDataLocation(filehandle: Handle, provider: UInt, externalfileinfo: ConstPtr, length: UInt): Hresult =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemWofSetFileDataLocation(filehandle.rawAddress.toString(), provider.toInt(), externalfileinfo.rawAddress.toString(), length.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wofShouldCompressBinaries(volume: Pcwstr, algorithm: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemWofShouldCompressBinaries(volume.rawAddress.toString(), algorithm.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wofWimAddEntry(volumename: Pcwstr, wimpath: Pcwstr, wimtype: UInt, wimindex: UInt, datasourceid: MutPtr): Hresult =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemWofWimAddEntry(volumename.rawAddress.toString(), wimpath.rawAddress.toString(), wimtype.toInt(), wimindex.toInt(), datasourceid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wofWimEnumFiles(volumename: Pcwstr, datasourceid: Long, enumproc: WofEnumFilesProc, userdata: ConstPtr): Hresult =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemWofWimEnumFiles(volumename.rawAddress.toString(), datasourceid.toString(), 0L.toString(), userdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wofWimRemoveEntry(volumename: Pcwstr, datasourceid: Long): Hresult =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemWofWimRemoveEntry(volumename.rawAddress.toString(), datasourceid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wofWimSuspendEntry(volumename: Pcwstr, datasourceid: Long): Hresult =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemWofWimSuspendEntry(volumename.rawAddress.toString(), datasourceid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wofWimUpdateEntry(volumename: Pcwstr, datasourceid: Long, newwimpath: Pcwstr): Hresult =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemWofWimUpdateEntry(volumename.rawAddress.toString(), datasourceid.toString(), newwimpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wow64DisableWow64FsRedirection(oldvalue: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemWow64DisableWow64FsRedirection(oldvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wow64EnableWow64FsRedirection(wow64fsenableredirection: Boolean): Boolean =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemWow64EnableWow64FsRedirection(wow64fsenableredirection) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wow64RevertWow64FsRedirection(olvalue: ConstPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemWow64RevertWow64FsRedirection(olvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeEncryptedFileRaw(pfimportcallback: PfeImportFunc, pvcallbackcontext: ConstPtr, pvcontext: ConstPtr): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemWriteEncryptedFileRaw(0L.toString(), pvcallbackcontext.rawAddress.toString(), pvcontext.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeFile(hfile: Handle, lpbuffer: ConstPtr, nnumberofbytestowrite: UInt, lpnumberofbyteswritten: MutPtr, lpoverlapped: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemWriteFile(hfile.rawAddress.toString(), lpbuffer.rawAddress.toString(), nnumberofbytestowrite.toInt(), lpnumberofbyteswritten.rawAddress.toString(), lpoverlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeFileEx(hfile: Handle, lpbuffer: ConstPtr, nnumberofbytestowrite: UInt, lpoverlapped: MutPtr, lpcompletionroutine: LpoverlappedCompletionRoutine): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemWriteFileEx(hfile.rawAddress.toString(), lpbuffer.rawAddress.toString(), nnumberofbytestowrite.toInt(), lpoverlapped.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeFileGather(hfile: Handle, asegmentarray: ConstPtr, nnumberofbytestowrite: UInt, lpreserved: ConstPtr, lpoverlapped: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemWriteFileGather(hfile.rawAddress.toString(), asegmentarray.rawAddress.toString(), nnumberofbytestowrite.toInt(), lpreserved.rawAddress.toString(), lpoverlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeLogRestartArea(pvmarshal: MutPtr, pvrestartbuffer: MutPtr, cbrestartbuffer: UInt, plsnbase: MutPtr, fflags: ClfsFlag, pcbwritten: MutPtr, plsnnext: MutPtr, poverlapped: MutPtr): Bool =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemWriteLogRestartArea(pvmarshal.rawAddress.toString(), pvrestartbuffer.rawAddress.toString(), cbrestartbuffer.toInt(), plsnbase.rawAddress.toString(), fflags.toInt(), pcbwritten.rawAddress.toString(), plsnnext.rawAddress.toString(), poverlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeTapemark(hdevice: Handle, dwtapemarktype: TapemarkType, dwtapemarkcount: UInt, bimmediate: Bool): UInt =
    if (windowsWin32StorageFilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageFilesystemWriteTapemark(hdevice.rawAddress.toString(), dwtapemarktype.toInt(), dwtapemarkcount.toInt(), bimmediate).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
