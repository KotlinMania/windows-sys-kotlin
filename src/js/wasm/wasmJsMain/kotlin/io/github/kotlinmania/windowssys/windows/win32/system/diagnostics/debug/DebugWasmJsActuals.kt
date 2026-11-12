@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ExceptionRoutine
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.MessageboxStyle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemDiagnosticsDebugNapiAddon(): Boolean

private val windowsWin32SystemDiagnosticsDebugNapiAvailable: Boolean = initWindowsWin32SystemDiagnosticsDebugNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugAddVectoredContinueHandler(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugAddVectoredContinueHandler(p0: Int, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugAddVectoredExceptionHandler(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugAddVectoredExceptionHandler(p0: Int, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugBeep(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugBeep(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugBindImage(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugBindImage(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugBindImageEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugBindImageEx(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugCheckRemoteDebuggerPresent(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugCheckRemoteDebuggerPresent(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugCheckSumMappedFile(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugCheckSumMappedFile(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugCloseThreadWaitChainSession(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugCloseThreadWaitChainSession(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugContinueDebugEvent(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugContinueDebugEvent(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugCopyContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugCopyContext(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugDbgHelpCreateUserDump(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugDbgHelpCreateUserDump(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugDbgHelpCreateUserDumpW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugDbgHelpCreateUserDumpW(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugDebugActiveProcess(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugDebugActiveProcess(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugDebugActiveProcessStop(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugDebugActiveProcessStop(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugDebugBreak()")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugDebugBreak()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugDebugBreakProcess(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugDebugBreakProcess(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugDebugSetProcessKillOnExit(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugDebugSetProcessKillOnExit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugDecodePointer(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugDecodePointer(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugDecodeRemotePointer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugDecodeRemotePointer(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugDecodeSystemPointer(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugDecodeSystemPointer(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugEncodePointer(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugEncodePointer(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugEncodeRemotePointer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugEncodeRemotePointer(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugEncodeSystemPointer(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugEncodeSystemPointer(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugEnumDirTree(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugEnumDirTree(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugEnumDirTreeW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugEnumDirTreeW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModules64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModules64(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModulesEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModulesEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModulesExW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModulesExW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModulesW64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModulesW64(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugFatalAppExitA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugFatalAppExitA(p0: Int, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugFatalAppExitW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugFatalAppExitW(p0: Int, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugFatalExit(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugFatalExit(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugFindDebugInfoFile(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugFindDebugInfoFile(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugFindDebugInfoFileEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugFindDebugInfoFileEx(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugFindDebugInfoFileExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugFindDebugInfoFileExW(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugFindExecutableImage(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugFindExecutableImage(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugFindExecutableImageEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugFindExecutableImageEx(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugFindExecutableImageExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugFindExecutableImageExW(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugFindFileInPath(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugFindFileInPath(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugFindFileInSearchPath(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugFindFileInSearchPath(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugFlushInstructionCache(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugFlushInstructionCache(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugFormatMessageA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugFormatMessageA(p0: Int, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugFormatMessageW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugFormatMessageW(p0: Int, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugGetEnabledXStateFeatures()")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugGetEnabledXStateFeatures(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugGetErrorMode()")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugGetErrorMode(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugGetImageConfigInformation(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugGetImageConfigInformation(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugGetImageUnusedHeaderBytes(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugGetImageUnusedHeaderBytes(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugGetSymLoadError()")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugGetSymLoadError(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugGetThreadContext(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugGetThreadContext(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugGetThreadErrorMode()")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugGetThreadErrorMode(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugGetThreadSelectorEntry(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugGetThreadSelectorEntry(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugGetThreadWaitChain(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugGetThreadWaitChain(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugGetTimestampForLoadedLibrary(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugGetTimestampForLoadedLibrary(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugGetXStateFeaturesMask(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugGetXStateFeaturesMask(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugImageAddCertificate(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugImageAddCertificate(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugImageDirectoryEntryToData(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugImageDirectoryEntryToData(p0: String, p1: Boolean, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugImageDirectoryEntryToDataEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugImageDirectoryEntryToDataEx(p0: String, p1: Boolean, p2: Int, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugImageEnumerateCertificates(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugImageEnumerateCertificates(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugImageGetCertificateData(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugImageGetCertificateData(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugImageGetCertificateHeader(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugImageGetCertificateHeader(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugImageGetDigestStream(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugImageGetDigestStream(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugImageLoad(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugImageLoad(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugImageNtHeader(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugImageNtHeader(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugImageRemoveCertificate(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugImageRemoveCertificate(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugImageRvaToSection(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugImageRvaToSection(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugImageRvaToVa(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugImageRvaToVa(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugImageUnload(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugImageUnload(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugImagehlpApiVersion()")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugImagehlpApiVersion(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugImagehlpApiVersionEx(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugImagehlpApiVersionEx(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugInitializeContext(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugInitializeContext(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugInitializeContext2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugInitializeContext2(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugIsDebuggerPresent()")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugIsDebuggerPresent(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugLocateXStateFeature(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugLocateXStateFeature(p0: String, p1: Int, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugMakeSureDirectoryPathExists(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugMakeSureDirectoryPathExists(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugMapAndLoad(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugMapAndLoad(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugMapFileAndCheckSumA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugMapFileAndCheckSumA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugMapFileAndCheckSumW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugMapFileAndCheckSumW(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugMessageBeep(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugMessageBeep(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugMiniDumpReadDumpStream(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugMiniDumpReadDumpStream(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugMiniDumpWriteDump(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugMiniDumpWriteDump(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugOpenThreadWaitChainSession(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugOpenThreadWaitChainSession(p0: Int, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugOutputDebugStringA(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugOutputDebugStringA(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugOutputDebugStringW(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugOutputDebugStringW(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugRaiseException(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugRaiseException(p0: Int, p1: Int, p2: Int, p3: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugRaiseFailFastException(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugRaiseFailFastException(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugRangeMapAddPeImageSections(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugRangeMapAddPeImageSections(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugRangeMapCreate()")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugRangeMapCreate(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugRangeMapFree(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugRangeMapFree(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugRangeMapRead(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugRangeMapRead(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugRangeMapRemove(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugRangeMapRemove(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugRangeMapWrite(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugRangeMapWrite(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugReBaseImage(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugReBaseImage(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: String, p7: String, p8: String, p9: String, p10: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugReBaseImage64(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugReBaseImage64(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: String, p7: String, p8: String, p9: String, p10: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugReadProcessMemory(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugReadProcessMemory(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugRegisterWaitChainCOMCallback(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugRegisterWaitChainCOMCallback(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugRemoveInvalidModuleList(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugRemoveInvalidModuleList(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugRemoveVectoredContinueHandler(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugRemoveVectoredContinueHandler(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugRemoveVectoredExceptionHandler(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugRemoveVectoredExceptionHandler(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugReportSymbolLoadSummary(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugReportSymbolLoadSummary(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugRtlAddFunctionTable(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugRtlAddFunctionTable(p0: String, p1: Int, p2: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugRtlAddGrowableFunctionTable(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugRtlAddGrowableFunctionTable(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugRtlCaptureContext(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugRtlCaptureContext(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugRtlCaptureContext2(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugRtlCaptureContext2(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugRtlCaptureStackBackTrace(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugRtlCaptureStackBackTrace(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugRtlDeleteFunctionTable(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugRtlDeleteFunctionTable(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugRtlDeleteGrowableFunctionTable(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugRtlDeleteGrowableFunctionTable(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugRtlGrowFunctionTable(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugRtlGrowFunctionTable(p0: String, p1: Int)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugRtlInstallFunctionTableCallback(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugRtlInstallFunctionTableCallback(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugRtlLookupFunctionEntry(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugRtlLookupFunctionEntry(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugRtlPcToFileHeader(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugRtlPcToFileHeader(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugRtlRaiseException(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugRtlRaiseException(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugRtlRestoreContext(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugRtlRestoreContext(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugRtlUnwind(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugRtlUnwind(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugRtlUnwindEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugRtlUnwindEx(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugRtlVirtualUnwind(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugRtlVirtualUnwind(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSearchTreeForFile(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSearchTreeForFile(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSearchTreeForFileW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSearchTreeForFileW(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSetCheckUserInterruptShared(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSetCheckUserInterruptShared(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSetErrorMode(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSetErrorMode(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSetImageConfigInformation(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSetImageConfigInformation(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSetSymLoadError(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSetSymLoadError(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSetThreadContext(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSetThreadContext(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSetThreadErrorMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSetThreadErrorMode(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSetUnhandledExceptionFilter(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSetUnhandledExceptionFilter(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSetXStateFeaturesMask(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSetXStateFeaturesMask(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugStackWalk2(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugStackWalk2(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugStackWalk64(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugStackWalk64(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugStackWalkEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugStackWalkEx(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymAddSourceStream(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymAddSourceStream(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymAddSourceStreamA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymAddSourceStreamA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymAddSourceStreamW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymAddSourceStreamW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymAddSymbol(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymAddSymbol(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymAddSymbolW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymAddSymbolW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymAddrIncludeInlineTrace(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymAddrIncludeInlineTrace(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymCleanup(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymCleanup(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymCompareInlineTrace(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymCompareInlineTrace(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymDeleteSymbol(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymDeleteSymbol(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymDeleteSymbolW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymDeleteSymbolW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumLines(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumLines(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumLinesW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumLinesW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumProcesses(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumProcesses(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceFileTokens(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceFileTokens(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceFiles(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceFiles(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceFilesW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceFilesW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceLines(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceLines(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceLinesW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceLinesW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSym(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumSym(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbols(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbols(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsEx(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsExW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsForAddr(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsForAddr(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsForAddrW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsForAddrW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypes(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypes(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypesByName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypesByName(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypesByNameW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypesByNameW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypesW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypesW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateModules64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateModules64(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateModulesW64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateModulesW64(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateSymbols64(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateSymbols64(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateSymbolsW64(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateSymbolsW64(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymFindDebugInfoFile(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFindDebugInfoFile(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymFindDebugInfoFileW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFindDebugInfoFileW(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymFindExecutableImage(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFindExecutableImage(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymFindExecutableImageW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFindExecutableImageW(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymFindFileInPath(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFindFileInPath(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: Int, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymFindFileInPathW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFindFileInPathW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: Int, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymFromAddr(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFromAddr(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymFromAddrW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFromAddrW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymFromIndex(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFromIndex(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymFromIndexW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFromIndexW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymFromInlineContext(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFromInlineContext(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymFromInlineContextW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFromInlineContextW(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymFromName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFromName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymFromNameW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFromNameW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymFromToken(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFromToken(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymFromTokenW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFromTokenW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymFunctionTableAccess64(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFunctionTableAccess64(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymFunctionTableAccess64AccessRoutines(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFunctionTableAccess64AccessRoutines(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetExtendedOption(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetExtendedOption(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetFileLineOffsets64(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetFileLineOffsets64(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetHomeDirectory(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetHomeDirectory(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetHomeDirectoryW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetHomeDirectoryW(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromAddr64(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromAddr64(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromAddrW64(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromAddrW64(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromInlineContext(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromInlineContext(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromInlineContextW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromInlineContextW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromName64(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromName64(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromNameW64(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromNameW64(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineNext64(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetLineNext64(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineNextW64(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetLineNextW64(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetLinePrev64(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetLinePrev64(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetLinePrevW64(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetLinePrevW64(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetModuleBase64(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetModuleBase64(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetModuleInfo64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetModuleInfo64(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetModuleInfoW64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetModuleInfoW64(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetOmaps(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetOmaps(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetOptions()")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetOptions(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetScope(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetScope(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetScopeW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetScopeW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSearchPath(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSearchPath(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSearchPathW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSearchPathW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFile(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFile(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileChecksum(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileChecksum(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileChecksumW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileChecksumW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromToken(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromToken(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromTokenByTokenName(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromTokenByTokenName(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromTokenByTokenNameW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromTokenByTokenNameW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromTokenW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromTokenW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileToken(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileToken(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileTokenByTokenName(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileTokenByTokenName(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileTokenByTokenNameW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileTokenByTokenNameW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileTokenW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileTokenW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceVarFromToken(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceVarFromToken(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceVarFromTokenW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceVarFromTokenW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymFromAddr64(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSymFromAddr64(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymFromName64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSymFromName64(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymNext64(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSymNext64(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymPrev64(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSymPrev64(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymbolFile(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSymbolFile(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymbolFileW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSymbolFileW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeFromName(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeFromName(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeFromNameW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeFromNameW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeInfo(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeInfoEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeInfoEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymGetUnwindInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetUnwindInfo(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymInitialize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymInitialize(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymInitializeW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymInitializeW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymLoadModule64(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymLoadModule64(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymLoadModuleEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymLoadModuleEx(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymLoadModuleExW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymLoadModuleExW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymMatchFileName(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymMatchFileName(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymMatchFileNameW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymMatchFileNameW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymMatchString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymMatchString(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymMatchStringA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymMatchStringA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymMatchStringW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymMatchStringW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymNext(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymNext(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymNextW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymNextW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymPrev(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymPrev(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymPrevW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymPrevW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymQueryInlineTrace(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymQueryInlineTrace(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymRefreshModuleList(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymRefreshModuleList(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymRegisterCallback64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymRegisterCallback64(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymRegisterCallbackW64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymRegisterCallbackW64(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymRegisterFunctionEntryCallback64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymRegisterFunctionEntryCallback64(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymSearch(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSearch(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymSearchW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSearchW(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymSetContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSetContext(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymSetExtendedOption(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSetExtendedOption(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymSetHomeDirectory(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSetHomeDirectory(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymSetHomeDirectoryW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSetHomeDirectoryW(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymSetOptions(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSetOptions(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymSetParentWindow(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSetParentWindow(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymSetScopeFromAddr(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSetScopeFromAddr(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymSetScopeFromIndex(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSetScopeFromIndex(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymSetScopeFromInlineContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSetScopeFromInlineContext(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymSetSearchPath(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSetSearchPath(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymSetSearchPathW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSetSearchPathW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvDeltaName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSrvDeltaName(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvDeltaNameW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSrvDeltaNameW(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexInfo(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexInfoW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexInfoW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexString(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexString(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexStringW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexStringW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexes(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexes(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexesW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexesW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetSupplement(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetSupplement(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetSupplementW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetSupplementW(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvIsStore(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSrvIsStore(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvIsStoreW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSrvIsStoreW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreFile(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreFile(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreFileW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreFileW(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreSupplement(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreSupplement(p0: String, p1: String, p2: String, p3: String, p4: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreSupplementW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreSupplementW(p0: String, p1: String, p2: String, p3: String, p4: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymUnDName64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymUnDName64(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugSymUnloadModule64(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymUnloadModule64(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugTerminateProcessOnMemoryExhaustion(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugTerminateProcessOnMemoryExhaustion(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugTouchFileTimes(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugTouchFileTimes(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugUnDecorateSymbolName(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugUnDecorateSymbolName(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugUnDecorateSymbolNameW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugUnDecorateSymbolNameW(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugUnMapAndLoad(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugUnMapAndLoad(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugUnhandledExceptionFilter(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugUnhandledExceptionFilter(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugUpdateDebugInfoFile(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugUpdateDebugInfoFile(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugUpdateDebugInfoFileEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugUpdateDebugInfoFileEx(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugWaitForDebugEvent(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugWaitForDebugEvent(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugWaitForDebugEventEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugWaitForDebugEventEx(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugWow64GetThreadContext(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugWow64GetThreadContext(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugWow64GetThreadSelectorEntry(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugWow64GetThreadSelectorEntry(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugWow64SetThreadContext(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugWow64SetThreadContext(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugWriteProcessMemory(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugWriteProcessMemory(p0: String, p1: String, p2: String, p3: String, p4: String): Int

public actual fun addVectoredContinueHandler(first: UInt, handler: PvectoredExceptionHandler): MutPtr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugAddVectoredContinueHandler(first.toInt(), 0L.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addVectoredExceptionHandler(first: UInt, handler: PvectoredExceptionHandler): MutPtr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugAddVectoredExceptionHandler(first.toInt(), 0L.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun beep(dwfreq: UInt, dwduration: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugBeep(dwfreq.toInt(), dwduration.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bindImage(imagename: Pcstr, dllpath: Pcstr, symbolpath: Pcstr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugBindImage(imagename.rawAddress.toString(), dllpath.rawAddress.toString(), symbolpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bindImageEx(flags: UInt, imagename: Pcstr, dllpath: Pcstr, symbolpath: Pcstr, statusroutine: PimagehlpStatusRoutine): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugBindImageEx(flags.toInt(), imagename.rawAddress.toString(), dllpath.rawAddress.toString(), symbolpath.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkRemoteDebuggerPresent(hprocess: Handle, pbdebuggerpresent: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugCheckRemoteDebuggerPresent(hprocess.rawAddress.toString(), pbdebuggerpresent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkSumMappedFile(baseaddress: ConstPtr, filelength: UInt, headersum: MutPtr, checksum: MutPtr): MutPtr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugCheckSumMappedFile(baseaddress.rawAddress.toString(), filelength.toInt(), headersum.rawAddress.toString(), checksum.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeThreadWaitChainSession(wcthandle: ConstPtr) {
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) {
        wasmWindowssysWindowsWin32SystemDiagnosticsDebugCloseThreadWaitChainSession(wcthandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun continueDebugEvent(dwprocessid: UInt, dwthreadid: UInt, dwcontinuestatus: Ntstatus): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugContinueDebugEvent(dwprocessid.toInt(), dwthreadid.toInt(), dwcontinuestatus) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyContext(destination: MutPtr, contextflags: ContextFlags, source: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugCopyContext(destination.rawAddress.toString(), contextflags.toInt(), source.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dbgHelpCreateUserDump(filename: Pcstr, callback: PdbghelpCreateUserDumpCallback, userdata: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugDbgHelpCreateUserDump(filename.rawAddress.toString(), 0L.toString(), userdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dbgHelpCreateUserDumpW(filename: Pcwstr, callback: PdbghelpCreateUserDumpCallback, userdata: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugDbgHelpCreateUserDumpW(filename.rawAddress.toString(), 0L.toString(), userdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun debugActiveProcess(dwprocessid: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugDebugActiveProcess(dwprocessid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun debugActiveProcessStop(dwprocessid: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugDebugActiveProcessStop(dwprocessid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun debugBreak() {
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) {
        wasmWindowssysWindowsWin32SystemDiagnosticsDebugDebugBreak()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun debugBreakProcess(process: Handle): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugDebugBreakProcess(process.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun debugSetProcessKillOnExit(killonexit: Bool): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugDebugSetProcessKillOnExit(killonexit) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun decodePointer(ptr: ConstPtr): MutPtr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugDecodePointer(ptr.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun decodeRemotePointer(processhandle: Handle, ptr: ConstPtr, decodedptr: MutPtr): Hresult =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugDecodeRemotePointer(processhandle.rawAddress.toString(), ptr.rawAddress.toString(), decodedptr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun decodeSystemPointer(ptr: ConstPtr): MutPtr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugDecodeSystemPointer(ptr.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun encodePointer(ptr: ConstPtr): MutPtr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugEncodePointer(ptr.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun encodeRemotePointer(processhandle: Handle, ptr: ConstPtr, encodedptr: MutPtr): Hresult =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugEncodeRemotePointer(processhandle.rawAddress.toString(), ptr.rawAddress.toString(), encodedptr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun encodeSystemPointer(ptr: ConstPtr): MutPtr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugEncodeSystemPointer(ptr.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDirTree(hprocess: Handle, rootpath: Pcstr, inputpathname: Pcstr, outputpathbuffer: Pstr, cb: PenumdirtreeCallback, data: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugEnumDirTree(hprocess.rawAddress.toString(), rootpath.rawAddress.toString(), inputpathname.rawAddress.toString(), outputpathbuffer.rawAddress.toString(), 0L.toString(), data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDirTreeW(hprocess: Handle, rootpath: Pcwstr, inputpathname: Pcwstr, outputpathbuffer: Pwstr, cb: PenumdirtreeCallbackw, data: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugEnumDirTreeW(hprocess.rawAddress.toString(), rootpath.rawAddress.toString(), inputpathname.rawAddress.toString(), outputpathbuffer.rawAddress.toString(), 0L.toString(), data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateLoadedModules64(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallback64, usercontext: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModules64(hprocess.rawAddress.toString(), 0L.toString(), usercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateLoadedModulesEx(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallback64, usercontext: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModulesEx(hprocess.rawAddress.toString(), 0L.toString(), usercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateLoadedModulesExW(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallbackw64, usercontext: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModulesExW(hprocess.rawAddress.toString(), 0L.toString(), usercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateLoadedModulesW64(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallbackw64, usercontext: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModulesW64(hprocess.rawAddress.toString(), 0L.toString(), usercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fatalAppExitA(uaction: UInt, lpmessagetext: Pcstr) {
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) {
        wasmWindowssysWindowsWin32SystemDiagnosticsDebugFatalAppExitA(uaction.toInt(), lpmessagetext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fatalAppExitW(uaction: UInt, lpmessagetext: Pcwstr) {
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) {
        wasmWindowssysWindowsWin32SystemDiagnosticsDebugFatalAppExitW(uaction.toInt(), lpmessagetext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fatalExit(exitcode: Int): Nothing {
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) {
        wasmWindowssysWindowsWin32SystemDiagnosticsDebugFatalExit(exitcode)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function fatalExit")
}

public actual fun findDebugInfoFile(filename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr): Handle =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugFindDebugInfoFile(filename.rawAddress.toString(), symbolpath.rawAddress.toString(), debugfilepath.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findDebugInfoFileEx(filename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr, callback: PfindDebugFileCallback, callerdata: ConstPtr): Handle =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugFindDebugInfoFileEx(filename.rawAddress.toString(), symbolpath.rawAddress.toString(), debugfilepath.rawAddress.toString(), 0L.toString(), callerdata.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findDebugInfoFileExW(filename: Pcwstr, symbolpath: Pcwstr, debugfilepath: Pwstr, callback: PfindDebugFileCallbackw, callerdata: ConstPtr): Handle =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugFindDebugInfoFileExW(filename.rawAddress.toString(), symbolpath.rawAddress.toString(), debugfilepath.rawAddress.toString(), 0L.toString(), callerdata.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findExecutableImage(filename: Pcstr, symbolpath: Pcstr, imagefilepath: Pstr): Handle =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugFindExecutableImage(filename.rawAddress.toString(), symbolpath.rawAddress.toString(), imagefilepath.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findExecutableImageEx(filename: Pcstr, symbolpath: Pcstr, imagefilepath: Pstr, callback: PfindExeFileCallback, callerdata: ConstPtr): Handle =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugFindExecutableImageEx(filename.rawAddress.toString(), symbolpath.rawAddress.toString(), imagefilepath.rawAddress.toString(), 0L.toString(), callerdata.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findExecutableImageExW(filename: Pcwstr, symbolpath: Pcwstr, imagefilepath: Pwstr, callback: PfindExeFileCallbackw, callerdata: ConstPtr): Handle =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugFindExecutableImageExW(filename.rawAddress.toString(), symbolpath.rawAddress.toString(), imagefilepath.rawAddress.toString(), 0L.toString(), callerdata.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFileInPath(hprocess: Handle, searchpatha: Pcstr, filename: Pcstr, id: ConstPtr, two: UInt, three: UInt, flags: UInt, filepath: Pstr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugFindFileInPath(hprocess.rawAddress.toString(), searchpatha.rawAddress.toString(), filename.rawAddress.toString(), id.rawAddress.toString(), two.toInt(), three.toInt(), flags.toInt(), filepath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFileInSearchPath(hprocess: Handle, searchpatha: Pcstr, filename: Pcstr, one: UInt, two: UInt, three: UInt, filepath: Pstr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugFindFileInSearchPath(hprocess.rawAddress.toString(), searchpatha.rawAddress.toString(), filename.rawAddress.toString(), one.toInt(), two.toInt(), three.toInt(), filepath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushInstructionCache(hprocess: Handle, lpbaseaddress: ConstPtr, dwsize: ULong): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugFlushInstructionCache(hprocess.rawAddress.toString(), lpbaseaddress.rawAddress.toString(), dwsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun formatMessageA(dwflags: FormatMessageOptions, lpsource: ConstPtr, dwmessageid: UInt, dwlanguageid: UInt, lpbuffer: Pstr, nsize: UInt, arguments: ConstPtr): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugFormatMessageA(dwflags.toInt(), lpsource.rawAddress.toString(), dwmessageid.toInt(), dwlanguageid.toInt(), lpbuffer.rawAddress.toString(), nsize.toInt(), arguments.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun formatMessageW(dwflags: FormatMessageOptions, lpsource: ConstPtr, dwmessageid: UInt, dwlanguageid: UInt, lpbuffer: Pwstr, nsize: UInt, arguments: ConstPtr): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugFormatMessageW(dwflags.toInt(), lpsource.rawAddress.toString(), dwmessageid.toInt(), dwlanguageid.toInt(), lpbuffer.rawAddress.toString(), nsize.toInt(), arguments.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnabledXStateFeatures(): ULong =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugGetEnabledXStateFeatures().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getErrorMode(): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugGetErrorMode().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getImageConfigInformation(loadedimage: ConstPtr, imageconfiginformation: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugGetImageConfigInformation(loadedimage.rawAddress.toString(), imageconfiginformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getImageUnusedHeaderBytes(loadedimage: ConstPtr, sizeunusedheaderbytes: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugGetImageUnusedHeaderBytes(loadedimage.rawAddress.toString(), sizeunusedheaderbytes.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSymLoadError(): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugGetSymLoadError().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadContext(hthread: Handle, lpcontext: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugGetThreadContext(hthread.rawAddress.toString(), lpcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadErrorMode(): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugGetThreadErrorMode().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadSelectorEntry(hthread: Handle, dwselector: UInt, lpselectorentry: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugGetThreadSelectorEntry(hthread.rawAddress.toString(), dwselector.toInt(), lpselectorentry.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadWaitChain(wcthandle: ConstPtr, context: ULong, flags: WaitChainThreadOptions, threadid: UInt, nodecount: MutPtr, nodeinfoarray: MutPtr, iscycle: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugGetThreadWaitChain(wcthandle.rawAddress.toString(), context.toString(), flags.toInt(), threadid.toInt(), nodecount.rawAddress.toString(), nodeinfoarray.rawAddress.toString(), iscycle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTimestampForLoadedLibrary(module: Hmodule): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugGetTimestampForLoadedLibrary(module.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getXStateFeaturesMask(context: ConstPtr, featuremask: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugGetXStateFeaturesMask(context.rawAddress.toString(), featuremask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageAddCertificate(filehandle: Handle, certificate: ConstPtr, index: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugImageAddCertificate(filehandle.rawAddress.toString(), certificate.rawAddress.toString(), index.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageDirectoryEntryToData(base: ConstPtr, mappedasimage: Boolean, directoryentry: ImageDirectoryEntry, size: MutPtr): MutPtr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugImageDirectoryEntryToData(base.rawAddress.toString(), mappedasimage, directoryentry.toInt(), size.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageDirectoryEntryToDataEx(base: ConstPtr, mappedasimage: Boolean, directoryentry: ImageDirectoryEntry, size: MutPtr, foundheader: MutPtr): MutPtr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugImageDirectoryEntryToDataEx(base.rawAddress.toString(), mappedasimage, directoryentry.toInt(), size.rawAddress.toString(), foundheader.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageEnumerateCertificates(filehandle: Handle, typefilter: UShort, certificatecount: MutPtr, indices: MutPtr, indexcount: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugImageEnumerateCertificates(filehandle.rawAddress.toString(), typefilter.toInt(), certificatecount.rawAddress.toString(), indices.rawAddress.toString(), indexcount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageGetCertificateData(filehandle: Handle, certificateindex: UInt, certificate: MutPtr, requiredlength: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugImageGetCertificateData(filehandle.rawAddress.toString(), certificateindex.toInt(), certificate.rawAddress.toString(), requiredlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageGetCertificateHeader(filehandle: Handle, certificateindex: UInt, certificateheader: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugImageGetCertificateHeader(filehandle.rawAddress.toString(), certificateindex.toInt(), certificateheader.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageGetDigestStream(filehandle: Handle, digestlevel: UInt, digestfunction: DigestFunction, digesthandle: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugImageGetDigestStream(filehandle.rawAddress.toString(), digestlevel.toInt(), 0L.toString(), digesthandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageLoad(dllname: Pcstr, dllpath: Pcstr): MutPtr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugImageLoad(dllname.rawAddress.toString(), dllpath.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageNtHeader(base: ConstPtr): MutPtr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugImageNtHeader(base.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageRemoveCertificate(filehandle: Handle, index: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugImageRemoveCertificate(filehandle.rawAddress.toString(), index.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageRvaToSection(ntheaders: ConstPtr, base: ConstPtr, rva: UInt): MutPtr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugImageRvaToSection(ntheaders.rawAddress.toString(), base.rawAddress.toString(), rva.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageRvaToVa(ntheaders: ConstPtr, base: ConstPtr, rva: UInt, lastrvasection: ConstPtr): MutPtr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugImageRvaToVa(ntheaders.rawAddress.toString(), base.rawAddress.toString(), rva.toInt(), lastrvasection.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageUnload(loadedimage: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugImageUnload(loadedimage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imagehlpApiVersion(): MutPtr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugImagehlpApiVersion().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imagehlpApiVersionEx(appversion: ConstPtr): MutPtr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugImagehlpApiVersionEx(appversion.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeContext(buffer: MutPtr, contextflags: ContextFlags, context: MutPtr, contextlength: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugInitializeContext(buffer.rawAddress.toString(), contextflags.toInt(), context.rawAddress.toString(), contextlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeContext2(buffer: MutPtr, contextflags: ContextFlags, context: MutPtr, contextlength: MutPtr, xstatecompactionmask: ULong): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugInitializeContext2(buffer.rawAddress.toString(), contextflags.toInt(), context.rawAddress.toString(), contextlength.rawAddress.toString(), xstatecompactionmask.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isDebuggerPresent(): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugIsDebuggerPresent() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun locateXStateFeature(context: ConstPtr, featureid: UInt, length: MutPtr): MutPtr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugLocateXStateFeature(context.rawAddress.toString(), featureid.toInt(), length.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun makeSureDirectoryPathExists(dirpath: Pcstr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugMakeSureDirectoryPathExists(dirpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapAndLoad(imagename: Pcstr, dllpath: Pcstr, loadedimage: MutPtr, dotdll: Bool, readonly: Bool): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugMapAndLoad(imagename.rawAddress.toString(), dllpath.rawAddress.toString(), loadedimage.rawAddress.toString(), dotdll, readonly) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapFileAndCheckSumA(filename: Pcstr, headersum: MutPtr, checksum: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugMapFileAndCheckSumA(filename.rawAddress.toString(), headersum.rawAddress.toString(), checksum.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapFileAndCheckSumW(filename: Pcwstr, headersum: MutPtr, checksum: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugMapFileAndCheckSumW(filename.rawAddress.toString(), headersum.rawAddress.toString(), checksum.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun messageBeep(utype: MessageboxStyle): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugMessageBeep(utype.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun miniDumpReadDumpStream(baseofdump: ConstPtr, streamnumber: UInt, dir: MutPtr, streampointer: MutPtr, streamsize: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugMiniDumpReadDumpStream(baseofdump.rawAddress.toString(), streamnumber.toInt(), dir.rawAddress.toString(), streampointer.rawAddress.toString(), streamsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun miniDumpWriteDump(hprocess: Handle, processid: UInt, hfile: Handle, dumptype: MinidumpType, exceptionparam: ConstPtr, userstreamparam: ConstPtr, callbackparam: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugMiniDumpWriteDump(hprocess.rawAddress.toString(), processid.toInt(), hfile.rawAddress.toString(), dumptype, exceptionparam.rawAddress.toString(), userstreamparam.rawAddress.toString(), callbackparam.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openThreadWaitChainSession(flags: OpenThreadWaitChainSessionFlags, callback: Pwaitchaincallback): MutPtr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugOpenThreadWaitChainSession(flags.toInt(), 0L.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun outputDebugStringA(lpoutputstring: Pcstr) {
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) {
        wasmWindowssysWindowsWin32SystemDiagnosticsDebugOutputDebugStringA(lpoutputstring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun outputDebugStringW(lpoutputstring: Pcwstr) {
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) {
        wasmWindowssysWindowsWin32SystemDiagnosticsDebugOutputDebugStringW(lpoutputstring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun raiseException(dwexceptioncode: UInt, dwexceptionflags: UInt, nnumberofarguments: UInt, lparguments: ConstPtr) {
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) {
        wasmWindowssysWindowsWin32SystemDiagnosticsDebugRaiseException(dwexceptioncode.toInt(), dwexceptionflags.toInt(), nnumberofarguments.toInt(), lparguments.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun raiseFailFastException(pexceptionrecord: ConstPtr, pcontextrecord: ConstPtr, dwflags: UInt) {
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) {
        wasmWindowssysWindowsWin32SystemDiagnosticsDebugRaiseFailFastException(pexceptionrecord.rawAddress.toString(), pcontextrecord.rawAddress.toString(), dwflags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rangeMapAddPeImageSections(rmaphandle: ConstPtr, imagename: Pcwstr, mappedimage: ConstPtr, mappingbytes: UInt, imagebase: ULong, usertag: ULong, mappingflags: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugRangeMapAddPeImageSections(rmaphandle.rawAddress.toString(), imagename.rawAddress.toString(), mappedimage.rawAddress.toString(), mappingbytes.toInt(), imagebase.toString(), usertag.toString(), mappingflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rangeMapCreate(): MutPtr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugRangeMapCreate().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rangeMapFree(rmaphandle: ConstPtr) {
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) {
        wasmWindowssysWindowsWin32SystemDiagnosticsDebugRangeMapFree(rmaphandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rangeMapRead(rmaphandle: ConstPtr, offset: ULong, buffer: MutPtr, requestbytes: UInt, flags: UInt, donebytes: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugRangeMapRead(rmaphandle.rawAddress.toString(), offset.toString(), buffer.rawAddress.toString(), requestbytes.toInt(), flags.toInt(), donebytes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rangeMapRemove(rmaphandle: ConstPtr, usertag: ULong): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugRangeMapRemove(rmaphandle.rawAddress.toString(), usertag.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rangeMapWrite(rmaphandle: ConstPtr, offset: ULong, buffer: ConstPtr, requestbytes: UInt, flags: UInt, donebytes: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugRangeMapWrite(rmaphandle.rawAddress.toString(), offset.toString(), buffer.rawAddress.toString(), requestbytes.toInt(), flags.toInt(), donebytes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reBaseImage(currentimagename: Pcstr, symbolpath: Pcstr, frebase: Bool, frebasesysfileok: Bool, fgoingdown: Bool, checkimagesize: UInt, oldimagesize: MutPtr, oldimagebase: MutPtr, newimagesize: MutPtr, newimagebase: MutPtr, timestamp: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugReBaseImage(currentimagename.rawAddress.toString(), symbolpath.rawAddress.toString(), frebase, frebasesysfileok, fgoingdown, checkimagesize.toInt(), oldimagesize.rawAddress.toString(), oldimagebase.rawAddress.toString(), newimagesize.rawAddress.toString(), newimagebase.rawAddress.toString(), timestamp.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reBaseImage64(currentimagename: Pcstr, symbolpath: Pcstr, frebase: Bool, frebasesysfileok: Bool, fgoingdown: Bool, checkimagesize: UInt, oldimagesize: MutPtr, oldimagebase: MutPtr, newimagesize: MutPtr, newimagebase: MutPtr, timestamp: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugReBaseImage64(currentimagename.rawAddress.toString(), symbolpath.rawAddress.toString(), frebase, frebasesysfileok, fgoingdown, checkimagesize.toInt(), oldimagesize.rawAddress.toString(), oldimagebase.rawAddress.toString(), newimagesize.rawAddress.toString(), newimagebase.rawAddress.toString(), timestamp.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readProcessMemory(hprocess: Handle, lpbaseaddress: ConstPtr, lpbuffer: MutPtr, nsize: ULong, lpnumberofbytesread: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugReadProcessMemory(hprocess.rawAddress.toString(), lpbaseaddress.rawAddress.toString(), lpbuffer.rawAddress.toString(), nsize.toString(), lpnumberofbytesread.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerWaitChainCOMCallback(callstatecallback: Pcogetcallstate, activationstatecallback: Pcogetactivationstate) {
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) {
        wasmWindowssysWindowsWin32SystemDiagnosticsDebugRegisterWaitChainCOMCallback(0L.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun removeInvalidModuleList(hprocess: Handle) {
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) {
        wasmWindowssysWindowsWin32SystemDiagnosticsDebugRemoveInvalidModuleList(hprocess.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun removeVectoredContinueHandler(handle: ConstPtr): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugRemoveVectoredContinueHandler(handle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeVectoredExceptionHandler(handle: ConstPtr): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugRemoveVectoredExceptionHandler(handle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportSymbolLoadSummary(hprocess: Handle, ploadmodule: Pcwstr, psymboldata: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugReportSymbolLoadSummary(hprocess.rawAddress.toString(), ploadmodule.rawAddress.toString(), psymboldata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAddFunctionTable(functiontable: ConstPtr, entrycount: UInt, baseaddress: ULong): Boolean =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugRtlAddFunctionTable(functiontable.rawAddress.toString(), entrycount.toInt(), baseaddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAddGrowableFunctionTable(dynamictable: MutPtr, functiontable: ConstPtr, entrycount: UInt, maximumentrycount: UInt, rangebase: ULong, rangeend: ULong): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugRtlAddGrowableFunctionTable(dynamictable.rawAddress.toString(), functiontable.rawAddress.toString(), entrycount.toInt(), maximumentrycount.toInt(), rangebase.toString(), rangeend.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCaptureContext(contextrecord: MutPtr) {
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) {
        wasmWindowssysWindowsWin32SystemDiagnosticsDebugRtlCaptureContext(contextrecord.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlCaptureContext2(contextrecord: MutPtr) {
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) {
        wasmWindowssysWindowsWin32SystemDiagnosticsDebugRtlCaptureContext2(contextrecord.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlCaptureStackBackTrace(framestoskip: UInt, framestocapture: UInt, backtrace: MutPtr, backtracehash: MutPtr): UShort =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugRtlCaptureStackBackTrace(framestoskip.toInt(), framestocapture.toInt(), backtrace.rawAddress.toString(), backtracehash.rawAddress.toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDeleteFunctionTable(functiontable: ConstPtr): Boolean =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugRtlDeleteFunctionTable(functiontable.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDeleteGrowableFunctionTable(dynamictable: ConstPtr) {
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) {
        wasmWindowssysWindowsWin32SystemDiagnosticsDebugRtlDeleteGrowableFunctionTable(dynamictable.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlGrowFunctionTable(dynamictable: MutPtr, newentrycount: UInt) {
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) {
        wasmWindowssysWindowsWin32SystemDiagnosticsDebugRtlGrowFunctionTable(dynamictable.rawAddress.toString(), newentrycount.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlInstallFunctionTableCallback(tableidentifier: ULong, baseaddress: ULong, length: UInt, callback: PgetRuntimeFunctionCallback, context: ConstPtr, outofprocesscallbackdll: Pcwstr): Boolean =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugRtlInstallFunctionTableCallback(tableidentifier.toString(), baseaddress.toString(), length.toInt(), 0L.toString(), context.rawAddress.toString(), outofprocesscallbackdll.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlLookupFunctionEntry(controlpc: ULong, imagebase: MutPtr, historytable: MutPtr): MutPtr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugRtlLookupFunctionEntry(controlpc.toString(), imagebase.rawAddress.toString(), historytable.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlPcToFileHeader(pcvalue: ConstPtr, baseofimage: MutPtr): MutPtr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugRtlPcToFileHeader(pcvalue.rawAddress.toString(), baseofimage.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRaiseException(exceptionrecord: ConstPtr) {
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) {
        wasmWindowssysWindowsWin32SystemDiagnosticsDebugRtlRaiseException(exceptionrecord.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlRestoreContext(contextrecord: ConstPtr, exceptionrecord: ConstPtr) {
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) {
        wasmWindowssysWindowsWin32SystemDiagnosticsDebugRtlRestoreContext(contextrecord.rawAddress.toString(), exceptionrecord.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlUnwind(targetframe: ConstPtr, targetip: ConstPtr, exceptionrecord: ConstPtr, returnvalue: ConstPtr) {
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) {
        wasmWindowssysWindowsWin32SystemDiagnosticsDebugRtlUnwind(targetframe.rawAddress.toString(), targetip.rawAddress.toString(), exceptionrecord.rawAddress.toString(), returnvalue.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlUnwindEx(targetframe: ConstPtr, targetip: ConstPtr, exceptionrecord: ConstPtr, returnvalue: ConstPtr, contextrecord: ConstPtr, historytable: ConstPtr) {
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) {
        wasmWindowssysWindowsWin32SystemDiagnosticsDebugRtlUnwindEx(targetframe.rawAddress.toString(), targetip.rawAddress.toString(), exceptionrecord.rawAddress.toString(), returnvalue.rawAddress.toString(), contextrecord.rawAddress.toString(), historytable.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlVirtualUnwind(handlertype: RtlVirtualUnwindHandlerType, imagebase: ULong, controlpc: ULong, functionentry: ConstPtr, contextrecord: MutPtr, handlerdata: MutPtr, establisherframe: MutPtr, contextpointers: MutPtr): ExceptionRoutine =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun searchTreeForFile(rootpath: Pcstr, inputpathname: Pcstr, outputpathbuffer: Pstr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSearchTreeForFile(rootpath.rawAddress.toString(), inputpathname.rawAddress.toString(), outputpathbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun searchTreeForFileW(rootpath: Pcwstr, inputpathname: Pcwstr, outputpathbuffer: Pwstr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSearchTreeForFileW(rootpath.rawAddress.toString(), inputpathname.rawAddress.toString(), outputpathbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCheckUserInterruptShared(lpstartaddress: LpcallBackUserInterruptRoutine) {
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) {
        wasmWindowssysWindowsWin32SystemDiagnosticsDebugSetCheckUserInterruptShared(0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setErrorMode(umode: ThreadErrorMode): ThreadErrorMode =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSetErrorMode(umode.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setImageConfigInformation(loadedimage: MutPtr, imageconfiginformation: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSetImageConfigInformation(loadedimage.rawAddress.toString(), imageconfiginformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSymLoadError(error: UInt) {
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) {
        wasmWindowssysWindowsWin32SystemDiagnosticsDebugSetSymLoadError(error.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setThreadContext(hthread: Handle, lpcontext: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSetThreadContext(hthread.rawAddress.toString(), lpcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadErrorMode(dwnewmode: ThreadErrorMode, lpoldmode: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSetThreadErrorMode(dwnewmode.toInt(), lpoldmode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUnhandledExceptionFilter(lptoplevelexceptionfilter: LptopLevelExceptionFilter): LptopLevelExceptionFilter =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setXStateFeaturesMask(context: MutPtr, featuremask: ULong): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSetXStateFeaturesMask(context.rawAddress.toString(), featuremask.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stackWalk2(machinetype: UInt, hprocess: Handle, hthread: Handle, stackframe: MutPtr, contextrecord: MutPtr, readmemoryroutine: PreadProcessMemoryRoutine64, functiontableaccessroutine: PfunctionTableAccessRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64, translateaddress: PtranslateAddressRoutine64, gettargetattributevalue: PgetTargetAttributeValue64, flags: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugStackWalk2(machinetype.toInt(), hprocess.rawAddress.toString(), hthread.rawAddress.toString(), stackframe.rawAddress.toString(), contextrecord.rawAddress.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stackWalk64(machinetype: UInt, hprocess: Handle, hthread: Handle, stackframe: MutPtr, contextrecord: MutPtr, readmemoryroutine: PreadProcessMemoryRoutine64, functiontableaccessroutine: PfunctionTableAccessRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64, translateaddress: PtranslateAddressRoutine64): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugStackWalk64(machinetype.toInt(), hprocess.rawAddress.toString(), hthread.rawAddress.toString(), stackframe.rawAddress.toString(), contextrecord.rawAddress.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stackWalkEx(machinetype: UInt, hprocess: Handle, hthread: Handle, stackframe: MutPtr, contextrecord: MutPtr, readmemoryroutine: PreadProcessMemoryRoutine64, functiontableaccessroutine: PfunctionTableAccessRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64, translateaddress: PtranslateAddressRoutine64, flags: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugStackWalkEx(machinetype.toInt(), hprocess.rawAddress.toString(), hthread.rawAddress.toString(), stackframe.rawAddress.toString(), contextrecord.rawAddress.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symAddSourceStream(hprocess: Handle, base: ULong, streamfile: Pcstr, buffer: ConstPtr, size: ULong): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymAddSourceStream(hprocess.rawAddress.toString(), base.toString(), streamfile.rawAddress.toString(), buffer.rawAddress.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symAddSourceStreamA(hprocess: Handle, base: ULong, streamfile: Pcstr, buffer: ConstPtr, size: ULong): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymAddSourceStreamA(hprocess.rawAddress.toString(), base.toString(), streamfile.rawAddress.toString(), buffer.rawAddress.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symAddSourceStreamW(hprocess: Handle, base: ULong, filespec: Pcwstr, buffer: ConstPtr, size: ULong): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymAddSourceStreamW(hprocess.rawAddress.toString(), base.toString(), filespec.rawAddress.toString(), buffer.rawAddress.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symAddSymbol(hprocess: Handle, baseofdll: ULong, name: Pcstr, address: ULong, size: UInt, flags: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymAddSymbol(hprocess.rawAddress.toString(), baseofdll.toString(), name.rawAddress.toString(), address.toString(), size.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symAddSymbolW(hprocess: Handle, baseofdll: ULong, name: Pcwstr, address: ULong, size: UInt, flags: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymAddSymbolW(hprocess.rawAddress.toString(), baseofdll.toString(), name.rawAddress.toString(), address.toString(), size.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symAddrIncludeInlineTrace(hprocess: Handle, address: ULong): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymAddrIncludeInlineTrace(hprocess.rawAddress.toString(), address.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symCleanup(hprocess: Handle): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymCleanup(hprocess.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symCompareInlineTrace(hprocess: Handle, address1: ULong, inlinecontext1: UInt, retaddress1: ULong, address2: ULong, retaddress2: ULong): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymCompareInlineTrace(hprocess.rawAddress.toString(), address1.toString(), inlinecontext1.toInt(), retaddress1.toString(), address2.toString(), retaddress2.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symDeleteSymbol(hprocess: Handle, baseofdll: ULong, name: Pcstr, address: ULong, flags: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymDeleteSymbol(hprocess.rawAddress.toString(), baseofdll.toString(), name.rawAddress.toString(), address.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symDeleteSymbolW(hprocess: Handle, baseofdll: ULong, name: Pcwstr, address: ULong, flags: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymDeleteSymbolW(hprocess.rawAddress.toString(), baseofdll.toString(), name.rawAddress.toString(), address.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumLines(hprocess: Handle, base: ULong, obj: Pcstr, file: Pcstr, enumlinescallback: PsymEnumlinesCallback, usercontext: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumLines(hprocess.rawAddress.toString(), base.toString(), obj.rawAddress.toString(), file.rawAddress.toString(), 0L.toString(), usercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumLinesW(hprocess: Handle, base: ULong, obj: Pcwstr, file: Pcwstr, enumlinescallback: PsymEnumlinesCallbackw, usercontext: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumLinesW(hprocess.rawAddress.toString(), base.toString(), obj.rawAddress.toString(), file.rawAddress.toString(), 0L.toString(), usercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumProcesses(enumprocessescallback: PsymEnumprocessesCallback, usercontext: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumProcesses(0L.toString(), usercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSourceFileTokens(hprocess: Handle, base: ULong, callback: Penumsourcefiletokenscallback): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceFileTokens(hprocess.rawAddress.toString(), base.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSourceFiles(hprocess: Handle, modbase: ULong, mask: Pcstr, cbsrcfiles: PsymEnumsourcefilesCallback, usercontext: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceFiles(hprocess.rawAddress.toString(), modbase.toString(), mask.rawAddress.toString(), 0L.toString(), usercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSourceFilesW(hprocess: Handle, modbase: ULong, mask: Pcwstr, cbsrcfiles: PsymEnumsourcefilesCallbackw, usercontext: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceFilesW(hprocess.rawAddress.toString(), modbase.toString(), mask.rawAddress.toString(), 0L.toString(), usercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSourceLines(hprocess: Handle, base: ULong, obj: Pcstr, file: Pcstr, line: UInt, flags: UInt, enumlinescallback: PsymEnumlinesCallback, usercontext: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceLines(hprocess.rawAddress.toString(), base.toString(), obj.rawAddress.toString(), file.rawAddress.toString(), line.toInt(), flags.toInt(), 0L.toString(), usercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSourceLinesW(hprocess: Handle, base: ULong, obj: Pcwstr, file: Pcwstr, line: UInt, flags: UInt, enumlinescallback: PsymEnumlinesCallbackw, usercontext: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceLinesW(hprocess.rawAddress.toString(), base.toString(), obj.rawAddress.toString(), file.rawAddress.toString(), line.toInt(), flags.toInt(), 0L.toString(), usercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSym(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumSym(hprocess.rawAddress.toString(), baseofdll.toString(), 0L.toString(), usercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSymbols(hprocess: Handle, baseofdll: ULong, mask: Pcstr, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbols(hprocess.rawAddress.toString(), baseofdll.toString(), mask.rawAddress.toString(), 0L.toString(), usercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSymbolsEx(hprocess: Handle, baseofdll: ULong, mask: Pcstr, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr, options: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsEx(hprocess.rawAddress.toString(), baseofdll.toString(), mask.rawAddress.toString(), 0L.toString(), usercontext.rawAddress.toString(), options.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSymbolsExW(hprocess: Handle, baseofdll: ULong, mask: Pcwstr, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: ConstPtr, options: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsExW(hprocess.rawAddress.toString(), baseofdll.toString(), mask.rawAddress.toString(), 0L.toString(), usercontext.rawAddress.toString(), options.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSymbolsForAddr(hprocess: Handle, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsForAddr(hprocess.rawAddress.toString(), address.toString(), 0L.toString(), usercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSymbolsForAddrW(hprocess: Handle, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsForAddrW(hprocess.rawAddress.toString(), address.toString(), 0L.toString(), usercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSymbolsW(hprocess: Handle, baseofdll: ULong, mask: Pcwstr, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsW(hprocess.rawAddress.toString(), baseofdll.toString(), mask.rawAddress.toString(), 0L.toString(), usercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumTypes(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypes(hprocess.rawAddress.toString(), baseofdll.toString(), 0L.toString(), usercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumTypesByName(hprocess: Handle, baseofdll: ULong, mask: Pcstr, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypesByName(hprocess.rawAddress.toString(), baseofdll.toString(), mask.rawAddress.toString(), 0L.toString(), usercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumTypesByNameW(hprocess: Handle, baseofdll: ULong, mask: Pcwstr, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypesByNameW(hprocess.rawAddress.toString(), baseofdll.toString(), mask.rawAddress.toString(), 0L.toString(), usercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumTypesW(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypesW(hprocess.rawAddress.toString(), baseofdll.toString(), 0L.toString(), usercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumerateModules64(hprocess: Handle, enummodulescallback: PsymEnummodulesCallback64, usercontext: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateModules64(hprocess.rawAddress.toString(), 0L.toString(), usercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumerateModulesW64(hprocess: Handle, enummodulescallback: PsymEnummodulesCallbackw64, usercontext: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateModulesW64(hprocess.rawAddress.toString(), 0L.toString(), usercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumerateSymbols64(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumsymbolsCallback64, usercontext: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateSymbols64(hprocess.rawAddress.toString(), baseofdll.toString(), 0L.toString(), usercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumerateSymbolsW64(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumsymbolsCallback64w, usercontext: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateSymbolsW64(hprocess.rawAddress.toString(), baseofdll.toString(), 0L.toString(), usercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFindDebugInfoFile(hprocess: Handle, filename: Pcstr, debugfilepath: Pstr, callback: PfindDebugFileCallback, callerdata: ConstPtr): Handle =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFindDebugInfoFile(hprocess.rawAddress.toString(), filename.rawAddress.toString(), debugfilepath.rawAddress.toString(), 0L.toString(), callerdata.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFindDebugInfoFileW(hprocess: Handle, filename: Pcwstr, debugfilepath: Pwstr, callback: PfindDebugFileCallbackw, callerdata: ConstPtr): Handle =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFindDebugInfoFileW(hprocess.rawAddress.toString(), filename.rawAddress.toString(), debugfilepath.rawAddress.toString(), 0L.toString(), callerdata.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFindExecutableImage(hprocess: Handle, filename: Pcstr, imagefilepath: Pstr, callback: PfindExeFileCallback, callerdata: ConstPtr): Handle =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFindExecutableImage(hprocess.rawAddress.toString(), filename.rawAddress.toString(), imagefilepath.rawAddress.toString(), 0L.toString(), callerdata.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFindExecutableImageW(hprocess: Handle, filename: Pcwstr, imagefilepath: Pwstr, callback: PfindExeFileCallbackw, callerdata: ConstPtr): Handle =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFindExecutableImageW(hprocess.rawAddress.toString(), filename.rawAddress.toString(), imagefilepath.rawAddress.toString(), 0L.toString(), callerdata.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFindFileInPath(hprocess: Handle, searchpatha: Pcstr, filename: Pcstr, id: ConstPtr, two: UInt, three: UInt, flags: SymFindIdOption, foundfile: Pstr, callback: Pfindfileinpathcallback, context: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFindFileInPath(hprocess.rawAddress.toString(), searchpatha.rawAddress.toString(), filename.rawAddress.toString(), id.rawAddress.toString(), two.toInt(), three.toInt(), flags.toInt(), foundfile.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFindFileInPathW(hprocess: Handle, searchpatha: Pcwstr, filename: Pcwstr, id: ConstPtr, two: UInt, three: UInt, flags: SymFindIdOption, foundfile: Pwstr, callback: Pfindfileinpathcallbackw, context: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFindFileInPathW(hprocess.rawAddress.toString(), searchpatha.rawAddress.toString(), filename.rawAddress.toString(), id.rawAddress.toString(), two.toInt(), three.toInt(), flags.toInt(), foundfile.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFromAddr(hprocess: Handle, address: ULong, displacement: MutPtr, symbol: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFromAddr(hprocess.rawAddress.toString(), address.toString(), displacement.rawAddress.toString(), symbol.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFromAddrW(hprocess: Handle, address: ULong, displacement: MutPtr, symbol: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFromAddrW(hprocess.rawAddress.toString(), address.toString(), displacement.rawAddress.toString(), symbol.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFromIndex(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFromIndex(hprocess.rawAddress.toString(), baseofdll.toString(), index.toInt(), symbol.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFromIndexW(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFromIndexW(hprocess.rawAddress.toString(), baseofdll.toString(), index.toInt(), symbol.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFromInlineContext(hprocess: Handle, address: ULong, inlinecontext: UInt, displacement: MutPtr, symbol: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFromInlineContext(hprocess.rawAddress.toString(), address.toString(), inlinecontext.toInt(), displacement.rawAddress.toString(), symbol.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFromInlineContextW(hprocess: Handle, address: ULong, inlinecontext: UInt, displacement: MutPtr, symbol: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFromInlineContextW(hprocess.rawAddress.toString(), address.toString(), inlinecontext.toInt(), displacement.rawAddress.toString(), symbol.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFromName(hprocess: Handle, name: Pcstr, symbol: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFromName(hprocess.rawAddress.toString(), name.rawAddress.toString(), symbol.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFromNameW(hprocess: Handle, name: Pcwstr, symbol: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFromNameW(hprocess.rawAddress.toString(), name.rawAddress.toString(), symbol.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFromToken(hprocess: Handle, base: ULong, token: UInt, symbol: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFromToken(hprocess.rawAddress.toString(), base.toString(), token.toInt(), symbol.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFromTokenW(hprocess: Handle, base: ULong, token: UInt, symbol: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFromTokenW(hprocess.rawAddress.toString(), base.toString(), token.toInt(), symbol.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFunctionTableAccess64(hprocess: Handle, addrbase: ULong): MutPtr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFunctionTableAccess64(hprocess.rawAddress.toString(), addrbase.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFunctionTableAccess64AccessRoutines(hprocess: Handle, addrbase: ULong, readmemoryroutine: PreadProcessMemoryRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64): MutPtr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymFunctionTableAccess64AccessRoutines(hprocess.rawAddress.toString(), addrbase.toString(), 0L.toString(), 0L.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetExtendedOption(option: ImagehlpExtendedOptions): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetExtendedOption(option) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetFileLineOffsets64(hprocess: Handle, modulename: Pcstr, filename: Pcstr, buffer: MutPtr, bufferlines: UInt): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetFileLineOffsets64(hprocess.rawAddress.toString(), modulename.rawAddress.toString(), filename.rawAddress.toString(), buffer.rawAddress.toString(), bufferlines.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetHomeDirectory(type: UInt, dir: Pstr, size: ULong): Pstr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetHomeDirectory(type.toInt(), dir.rawAddress.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetHomeDirectoryW(type: UInt, dir: Pwstr, size: ULong): Pwstr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetHomeDirectoryW(type.toInt(), dir.rawAddress.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetLineFromAddr64(hprocess: Handle, qwaddr: ULong, pdwdisplacement: MutPtr, line64: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromAddr64(hprocess.rawAddress.toString(), qwaddr.toString(), pdwdisplacement.rawAddress.toString(), line64.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetLineFromAddrW64(hprocess: Handle, dwaddr: ULong, pdwdisplacement: MutPtr, line: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromAddrW64(hprocess.rawAddress.toString(), dwaddr.toString(), pdwdisplacement.rawAddress.toString(), line.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetLineFromInlineContext(hprocess: Handle, qwaddr: ULong, inlinecontext: UInt, qwmodulebaseaddress: ULong, pdwdisplacement: MutPtr, line64: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromInlineContext(hprocess.rawAddress.toString(), qwaddr.toString(), inlinecontext.toInt(), qwmodulebaseaddress.toString(), pdwdisplacement.rawAddress.toString(), line64.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetLineFromInlineContextW(hprocess: Handle, dwaddr: ULong, inlinecontext: UInt, qwmodulebaseaddress: ULong, pdwdisplacement: MutPtr, line: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromInlineContextW(hprocess.rawAddress.toString(), dwaddr.toString(), inlinecontext.toInt(), qwmodulebaseaddress.toString(), pdwdisplacement.rawAddress.toString(), line.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetLineFromName64(hprocess: Handle, modulename: Pcstr, filename: Pcstr, dwlinenumber: UInt, pldisplacement: MutPtr, line: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromName64(hprocess.rawAddress.toString(), modulename.rawAddress.toString(), filename.rawAddress.toString(), dwlinenumber.toInt(), pldisplacement.rawAddress.toString(), line.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetLineFromNameW64(hprocess: Handle, modulename: Pcwstr, filename: Pcwstr, dwlinenumber: UInt, pldisplacement: MutPtr, line: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromNameW64(hprocess.rawAddress.toString(), modulename.rawAddress.toString(), filename.rawAddress.toString(), dwlinenumber.toInt(), pldisplacement.rawAddress.toString(), line.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetLineNext64(hprocess: Handle, line: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetLineNext64(hprocess.rawAddress.toString(), line.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetLineNextW64(hprocess: Handle, line: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetLineNextW64(hprocess.rawAddress.toString(), line.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetLinePrev64(hprocess: Handle, line: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetLinePrev64(hprocess.rawAddress.toString(), line.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetLinePrevW64(hprocess: Handle, line: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetLinePrevW64(hprocess.rawAddress.toString(), line.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetModuleBase64(hprocess: Handle, qwaddr: ULong): ULong =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetModuleBase64(hprocess.rawAddress.toString(), qwaddr.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetModuleInfo64(hprocess: Handle, qwaddr: ULong, moduleinfo: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetModuleInfo64(hprocess.rawAddress.toString(), qwaddr.toString(), moduleinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetModuleInfoW64(hprocess: Handle, qwaddr: ULong, moduleinfo: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetModuleInfoW64(hprocess.rawAddress.toString(), qwaddr.toString(), moduleinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetOmaps(hprocess: Handle, baseofdll: ULong, omapto: MutPtr, comapto: MutPtr, omapfrom: MutPtr, comapfrom: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetOmaps(hprocess.rawAddress.toString(), baseofdll.toString(), omapto.rawAddress.toString(), comapto.rawAddress.toString(), omapfrom.rawAddress.toString(), comapfrom.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetOptions(): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetOptions().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetScope(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetScope(hprocess.rawAddress.toString(), baseofdll.toString(), index.toInt(), symbol.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetScopeW(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetScopeW(hprocess.rawAddress.toString(), baseofdll.toString(), index.toInt(), symbol.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSearchPath(hprocess: Handle, searchpatha: Pstr, searchpathlength: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSearchPath(hprocess.rawAddress.toString(), searchpatha.rawAddress.toString(), searchpathlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSearchPathW(hprocess: Handle, searchpatha: Pwstr, searchpathlength: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSearchPathW(hprocess.rawAddress.toString(), searchpatha.rawAddress.toString(), searchpathlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFile(hprocess: Handle, base: ULong, params: Pcstr, filespec: Pcstr, filepath: Pstr, size: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFile(hprocess.rawAddress.toString(), base.toString(), params.rawAddress.toString(), filespec.rawAddress.toString(), filepath.rawAddress.toString(), size.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFileChecksum(hprocess: Handle, base: ULong, filespec: Pcstr, pchecksumtype: MutPtr, pchecksum: MutPtr, checksumsize: UInt, pactualbyteswritten: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileChecksum(hprocess.rawAddress.toString(), base.toString(), filespec.rawAddress.toString(), pchecksumtype.rawAddress.toString(), pchecksum.rawAddress.toString(), checksumsize.toInt(), pactualbyteswritten.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFileChecksumW(hprocess: Handle, base: ULong, filespec: Pcwstr, pchecksumtype: MutPtr, pchecksum: MutPtr, checksumsize: UInt, pactualbyteswritten: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileChecksumW(hprocess.rawAddress.toString(), base.toString(), filespec.rawAddress.toString(), pchecksumtype.rawAddress.toString(), pchecksum.rawAddress.toString(), checksumsize.toInt(), pactualbyteswritten.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFileFromToken(hprocess: Handle, token: ConstPtr, params: Pcstr, filepath: Pstr, size: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromToken(hprocess.rawAddress.toString(), token.rawAddress.toString(), params.rawAddress.toString(), filepath.rawAddress.toString(), size.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFileFromTokenByTokenName(hprocess: Handle, token: ConstPtr, tokenname: Pcstr, params: Pcstr, filepath: Pstr, size: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromTokenByTokenName(hprocess.rawAddress.toString(), token.rawAddress.toString(), tokenname.rawAddress.toString(), params.rawAddress.toString(), filepath.rawAddress.toString(), size.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFileFromTokenByTokenNameW(hprocess: Handle, token: ConstPtr, tokenname: Pcwstr, params: Pcwstr, filepath: Pwstr, size: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromTokenByTokenNameW(hprocess.rawAddress.toString(), token.rawAddress.toString(), tokenname.rawAddress.toString(), params.rawAddress.toString(), filepath.rawAddress.toString(), size.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFileFromTokenW(hprocess: Handle, token: ConstPtr, params: Pcwstr, filepath: Pwstr, size: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromTokenW(hprocess.rawAddress.toString(), token.rawAddress.toString(), params.rawAddress.toString(), filepath.rawAddress.toString(), size.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFileToken(hprocess: Handle, base: ULong, filespec: Pcstr, token: MutPtr, size: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileToken(hprocess.rawAddress.toString(), base.toString(), filespec.rawAddress.toString(), token.rawAddress.toString(), size.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFileTokenByTokenName(hprocess: Handle, base: ULong, filespec: Pcstr, tokenname: Pcstr, tokenparameters: Pcstr, token: MutPtr, size: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileTokenByTokenName(hprocess.rawAddress.toString(), base.toString(), filespec.rawAddress.toString(), tokenname.rawAddress.toString(), tokenparameters.rawAddress.toString(), token.rawAddress.toString(), size.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFileTokenByTokenNameW(hprocess: Handle, base: ULong, filespec: Pcwstr, tokenname: Pcwstr, tokenparameters: Pcwstr, token: MutPtr, size: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileTokenByTokenNameW(hprocess.rawAddress.toString(), base.toString(), filespec.rawAddress.toString(), tokenname.rawAddress.toString(), tokenparameters.rawAddress.toString(), token.rawAddress.toString(), size.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFileTokenW(hprocess: Handle, base: ULong, filespec: Pcwstr, token: MutPtr, size: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileTokenW(hprocess.rawAddress.toString(), base.toString(), filespec.rawAddress.toString(), token.rawAddress.toString(), size.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFileW(hprocess: Handle, base: ULong, params: Pcwstr, filespec: Pcwstr, filepath: Pwstr, size: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileW(hprocess.rawAddress.toString(), base.toString(), params.rawAddress.toString(), filespec.rawAddress.toString(), filepath.rawAddress.toString(), size.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceVarFromToken(hprocess: Handle, token: ConstPtr, params: Pcstr, varname: Pcstr, value: Pstr, size: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceVarFromToken(hprocess.rawAddress.toString(), token.rawAddress.toString(), params.rawAddress.toString(), varname.rawAddress.toString(), value.rawAddress.toString(), size.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceVarFromTokenW(hprocess: Handle, token: ConstPtr, params: Pcwstr, varname: Pcwstr, value: Pwstr, size: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceVarFromTokenW(hprocess.rawAddress.toString(), token.rawAddress.toString(), params.rawAddress.toString(), varname.rawAddress.toString(), value.rawAddress.toString(), size.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSymFromAddr64(hprocess: Handle, qwaddr: ULong, pdwdisplacement: MutPtr, symbol: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSymFromAddr64(hprocess.rawAddress.toString(), qwaddr.toString(), pdwdisplacement.rawAddress.toString(), symbol.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSymFromName64(hprocess: Handle, name: Pcstr, symbol: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSymFromName64(hprocess.rawAddress.toString(), name.rawAddress.toString(), symbol.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSymNext64(hprocess: Handle, symbol: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSymNext64(hprocess.rawAddress.toString(), symbol.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSymPrev64(hprocess: Handle, symbol: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSymPrev64(hprocess.rawAddress.toString(), symbol.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSymbolFile(hprocess: Handle, sympath: Pcstr, imagefile: Pcstr, type: UInt, symbolfile: Pstr, csymbolfile: ULong, dbgfile: Pstr, cdbgfile: ULong): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSymbolFile(hprocess.rawAddress.toString(), sympath.rawAddress.toString(), imagefile.rawAddress.toString(), type.toInt(), symbolfile.rawAddress.toString(), csymbolfile.toString(), dbgfile.rawAddress.toString(), cdbgfile.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSymbolFileW(hprocess: Handle, sympath: Pcwstr, imagefile: Pcwstr, type: UInt, symbolfile: Pwstr, csymbolfile: ULong, dbgfile: Pwstr, cdbgfile: ULong): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetSymbolFileW(hprocess.rawAddress.toString(), sympath.rawAddress.toString(), imagefile.rawAddress.toString(), type.toInt(), symbolfile.rawAddress.toString(), csymbolfile.toString(), dbgfile.rawAddress.toString(), cdbgfile.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetTypeFromName(hprocess: Handle, baseofdll: ULong, name: Pcstr, symbol: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeFromName(hprocess.rawAddress.toString(), baseofdll.toString(), name.rawAddress.toString(), symbol.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetTypeFromNameW(hprocess: Handle, baseofdll: ULong, name: Pcwstr, symbol: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeFromNameW(hprocess.rawAddress.toString(), baseofdll.toString(), name.rawAddress.toString(), symbol.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetTypeInfo(hprocess: Handle, modbase: ULong, typeid: UInt, gettype: ImagehlpSymbolTypeInfo, pinfo: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeInfo(hprocess.rawAddress.toString(), modbase.toString(), typeid.toInt(), gettype, pinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetTypeInfoEx(hprocess: Handle, modbase: ULong, params: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeInfoEx(hprocess.rawAddress.toString(), modbase.toString(), params.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetUnwindInfo(hprocess: Handle, address: ULong, buffer: MutPtr, size: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymGetUnwindInfo(hprocess.rawAddress.toString(), address.toString(), buffer.rawAddress.toString(), size.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symInitialize(hprocess: Handle, usersearchpath: Pcstr, finvadeprocess: Bool): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymInitialize(hprocess.rawAddress.toString(), usersearchpath.rawAddress.toString(), finvadeprocess) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symInitializeW(hprocess: Handle, usersearchpath: Pcwstr, finvadeprocess: Bool): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymInitializeW(hprocess.rawAddress.toString(), usersearchpath.rawAddress.toString(), finvadeprocess) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symLoadModule64(hprocess: Handle, hfile: Handle, imagename: Pcstr, modulename: Pcstr, baseofdll: ULong, sizeofdll: UInt): ULong =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymLoadModule64(hprocess.rawAddress.toString(), hfile.rawAddress.toString(), imagename.rawAddress.toString(), modulename.rawAddress.toString(), baseofdll.toString(), sizeofdll.toInt()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symLoadModuleEx(hprocess: Handle, hfile: Handle, imagename: Pcstr, modulename: Pcstr, baseofdll: ULong, dllsize: UInt, data: ConstPtr, flags: SymLoadFlags): ULong =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymLoadModuleEx(hprocess.rawAddress.toString(), hfile.rawAddress.toString(), imagename.rawAddress.toString(), modulename.rawAddress.toString(), baseofdll.toString(), dllsize.toInt(), data.rawAddress.toString(), flags.toInt()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symLoadModuleExW(hprocess: Handle, hfile: Handle, imagename: Pcwstr, modulename: Pcwstr, baseofdll: ULong, dllsize: UInt, data: ConstPtr, flags: SymLoadFlags): ULong =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymLoadModuleExW(hprocess.rawAddress.toString(), hfile.rawAddress.toString(), imagename.rawAddress.toString(), modulename.rawAddress.toString(), baseofdll.toString(), dllsize.toInt(), data.rawAddress.toString(), flags.toInt()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symMatchFileName(filename: Pcstr, match: Pcstr, filenamestop: MutPtr, matchstop: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymMatchFileName(filename.rawAddress.toString(), match.rawAddress.toString(), filenamestop.rawAddress.toString(), matchstop.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symMatchFileNameW(filename: Pcwstr, match: Pcwstr, filenamestop: MutPtr, matchstop: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymMatchFileNameW(filename.rawAddress.toString(), match.rawAddress.toString(), filenamestop.rawAddress.toString(), matchstop.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symMatchString(string: Pcstr, expression: Pcstr, fcase: Bool): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymMatchString(string.rawAddress.toString(), expression.rawAddress.toString(), fcase) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symMatchStringA(string: Pcstr, expression: Pcstr, fcase: Bool): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymMatchStringA(string.rawAddress.toString(), expression.rawAddress.toString(), fcase) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symMatchStringW(string: Pcwstr, expression: Pcwstr, fcase: Bool): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymMatchStringW(string.rawAddress.toString(), expression.rawAddress.toString(), fcase) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symNext(hprocess: Handle, si: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymNext(hprocess.rawAddress.toString(), si.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symNextW(hprocess: Handle, siw: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymNextW(hprocess.rawAddress.toString(), siw.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symPrev(hprocess: Handle, si: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymPrev(hprocess.rawAddress.toString(), si.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symPrevW(hprocess: Handle, siw: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymPrevW(hprocess.rawAddress.toString(), siw.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symQueryInlineTrace(hprocess: Handle, startaddress: ULong, startcontext: UInt, startretaddress: ULong, curaddress: ULong, curcontext: MutPtr, curframeindex: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymQueryInlineTrace(hprocess.rawAddress.toString(), startaddress.toString(), startcontext.toInt(), startretaddress.toString(), curaddress.toString(), curcontext.rawAddress.toString(), curframeindex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symRefreshModuleList(hprocess: Handle): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymRefreshModuleList(hprocess.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symRegisterCallback64(hprocess: Handle, callbackfunction: PsymbolRegisteredCallback64, usercontext: ULong): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymRegisterCallback64(hprocess.rawAddress.toString(), 0L.toString(), usercontext.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symRegisterCallbackW64(hprocess: Handle, callbackfunction: PsymbolRegisteredCallback64, usercontext: ULong): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymRegisterCallbackW64(hprocess.rawAddress.toString(), 0L.toString(), usercontext.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symRegisterFunctionEntryCallback64(hprocess: Handle, callbackfunction: PsymbolFuncentryCallback64, usercontext: ULong): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymRegisterFunctionEntryCallback64(hprocess.rawAddress.toString(), 0L.toString(), usercontext.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSearch(hprocess: Handle, baseofdll: ULong, index: UInt, symtag: UInt, mask: Pcstr, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr, options: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSearch(hprocess.rawAddress.toString(), baseofdll.toString(), index.toInt(), symtag.toInt(), mask.rawAddress.toString(), address.toString(), 0L.toString(), usercontext.rawAddress.toString(), options.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSearchW(hprocess: Handle, baseofdll: ULong, index: UInt, symtag: UInt, mask: Pcwstr, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: ConstPtr, options: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSearchW(hprocess.rawAddress.toString(), baseofdll.toString(), index.toInt(), symtag.toInt(), mask.rawAddress.toString(), address.toString(), 0L.toString(), usercontext.rawAddress.toString(), options.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSetContext(hprocess: Handle, stackframe: ConstPtr, context: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSetContext(hprocess.rawAddress.toString(), stackframe.rawAddress.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSetExtendedOption(option: ImagehlpExtendedOptions, value: Bool): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSetExtendedOption(option, value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSetHomeDirectory(hprocess: Handle, dir: Pcstr): Pstr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSetHomeDirectory(hprocess.rawAddress.toString(), dir.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSetHomeDirectoryW(hprocess: Handle, dir: Pcwstr): Pwstr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSetHomeDirectoryW(hprocess.rawAddress.toString(), dir.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSetOptions(symoptions: UInt): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSetOptions(symoptions.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSetParentWindow(hwnd: Hwnd): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSetParentWindow(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSetScopeFromAddr(hprocess: Handle, address: ULong): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSetScopeFromAddr(hprocess.rawAddress.toString(), address.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSetScopeFromIndex(hprocess: Handle, baseofdll: ULong, index: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSetScopeFromIndex(hprocess.rawAddress.toString(), baseofdll.toString(), index.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSetScopeFromInlineContext(hprocess: Handle, address: ULong, inlinecontext: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSetScopeFromInlineContext(hprocess.rawAddress.toString(), address.toString(), inlinecontext.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSetSearchPath(hprocess: Handle, searchpatha: Pcstr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSetSearchPath(hprocess.rawAddress.toString(), searchpatha.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSetSearchPathW(hprocess: Handle, searchpatha: Pcwstr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSetSearchPathW(hprocess.rawAddress.toString(), searchpatha.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvDeltaName(hprocess: Handle, sympath: Pcstr, type: Pcstr, file1: Pcstr, file2: Pcstr): Pcstr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSrvDeltaName(hprocess.rawAddress.toString(), sympath.rawAddress.toString(), type.rawAddress.toString(), file1.rawAddress.toString(), file2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvDeltaNameW(hprocess: Handle, sympath: Pcwstr, type: Pcwstr, file1: Pcwstr, file2: Pcwstr): Pcwstr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSrvDeltaNameW(hprocess.rawAddress.toString(), sympath.rawAddress.toString(), type.rawAddress.toString(), file1.rawAddress.toString(), file2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvGetFileIndexInfo(file: Pcstr, info: MutPtr, flags: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexInfo(file.rawAddress.toString(), info.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvGetFileIndexInfoW(file: Pcwstr, info: MutPtr, flags: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexInfoW(file.rawAddress.toString(), info.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvGetFileIndexString(hprocess: Handle, srvpath: Pcstr, file: Pcstr, index: Pstr, size: ULong, flags: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexString(hprocess.rawAddress.toString(), srvpath.rawAddress.toString(), file.rawAddress.toString(), index.rawAddress.toString(), size.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvGetFileIndexStringW(hprocess: Handle, srvpath: Pcwstr, file: Pcwstr, index: Pwstr, size: ULong, flags: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexStringW(hprocess.rawAddress.toString(), srvpath.rawAddress.toString(), file.rawAddress.toString(), index.rawAddress.toString(), size.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvGetFileIndexes(file: Pcstr, id: MutPtr, val1: MutPtr, val2: MutPtr, flags: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexes(file.rawAddress.toString(), id.rawAddress.toString(), val1.rawAddress.toString(), val2.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvGetFileIndexesW(file: Pcwstr, id: MutPtr, val1: MutPtr, val2: MutPtr, flags: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexesW(file.rawAddress.toString(), id.rawAddress.toString(), val1.rawAddress.toString(), val2.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvGetSupplement(hprocess: Handle, sympath: Pcstr, node: Pcstr, file: Pcstr): Pcstr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetSupplement(hprocess.rawAddress.toString(), sympath.rawAddress.toString(), node.rawAddress.toString(), file.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvGetSupplementW(hprocess: Handle, sympath: Pcwstr, node: Pcwstr, file: Pcwstr): Pcwstr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetSupplementW(hprocess.rawAddress.toString(), sympath.rawAddress.toString(), node.rawAddress.toString(), file.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvIsStore(hprocess: Handle, path: Pcstr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSrvIsStore(hprocess.rawAddress.toString(), path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvIsStoreW(hprocess: Handle, path: Pcwstr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSrvIsStoreW(hprocess.rawAddress.toString(), path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvStoreFile(hprocess: Handle, srvpath: Pcstr, file: Pcstr, flags: SymSrvStoreFileFlags): Pcstr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreFile(hprocess.rawAddress.toString(), srvpath.rawAddress.toString(), file.rawAddress.toString(), flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvStoreFileW(hprocess: Handle, srvpath: Pcwstr, file: Pcwstr, flags: SymSrvStoreFileFlags): Pcwstr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreFileW(hprocess.rawAddress.toString(), srvpath.rawAddress.toString(), file.rawAddress.toString(), flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvStoreSupplement(hprocess: Handle, srvpath: Pcstr, node: Pcstr, file: Pcstr, flags: UInt): Pcstr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreSupplement(hprocess.rawAddress.toString(), srvpath.rawAddress.toString(), node.rawAddress.toString(), file.rawAddress.toString(), flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvStoreSupplementW(hprocess: Handle, sympath: Pcwstr, node: Pcwstr, file: Pcwstr, flags: UInt): Pcwstr =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreSupplementW(hprocess.rawAddress.toString(), sympath.rawAddress.toString(), node.rawAddress.toString(), file.rawAddress.toString(), flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symUnDName64(sym: ConstPtr, undecname: Pstr, undecnamelength: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymUnDName64(sym.rawAddress.toString(), undecname.rawAddress.toString(), undecnamelength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symUnloadModule64(hprocess: Handle, baseofdll: ULong): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugSymUnloadModule64(hprocess.rawAddress.toString(), baseofdll.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun terminateProcessOnMemoryExhaustion(failedallocationsize: ULong) {
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) {
        wasmWindowssysWindowsWin32SystemDiagnosticsDebugTerminateProcessOnMemoryExhaustion(failedallocationsize.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun touchFileTimes(filehandle: Handle, psystemtime: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugTouchFileTimes(filehandle.rawAddress.toString(), psystemtime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unDecorateSymbolName(name: Pcstr, outputstring: Pstr, maxstringlength: UInt, flags: UInt): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugUnDecorateSymbolName(name.rawAddress.toString(), outputstring.rawAddress.toString(), maxstringlength.toInt(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unDecorateSymbolNameW(name: Pcwstr, outputstring: Pwstr, maxstringlength: UInt, flags: UInt): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugUnDecorateSymbolNameW(name.rawAddress.toString(), outputstring.rawAddress.toString(), maxstringlength.toInt(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unMapAndLoad(loadedimage: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugUnMapAndLoad(loadedimage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unhandledExceptionFilter(exceptioninfo: ConstPtr): Int =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugUnhandledExceptionFilter(exceptioninfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateDebugInfoFile(imagefilename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr, ntheaders: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugUpdateDebugInfoFile(imagefilename.rawAddress.toString(), symbolpath.rawAddress.toString(), debugfilepath.rawAddress.toString(), ntheaders.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateDebugInfoFileEx(imagefilename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr, ntheaders: ConstPtr, oldchecksum: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugUpdateDebugInfoFileEx(imagefilename.rawAddress.toString(), symbolpath.rawAddress.toString(), debugfilepath.rawAddress.toString(), ntheaders.rawAddress.toString(), oldchecksum.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitForDebugEvent(lpdebugevent: MutPtr, dwmilliseconds: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugWaitForDebugEvent(lpdebugevent.rawAddress.toString(), dwmilliseconds.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitForDebugEventEx(lpdebugevent: MutPtr, dwmilliseconds: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugWaitForDebugEventEx(lpdebugevent.rawAddress.toString(), dwmilliseconds.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wow64GetThreadContext(hthread: Handle, lpcontext: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugWow64GetThreadContext(hthread.rawAddress.toString(), lpcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wow64GetThreadSelectorEntry(hthread: Handle, dwselector: UInt, lpselectorentry: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugWow64GetThreadSelectorEntry(hthread.rawAddress.toString(), dwselector.toInt(), lpselectorentry.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wow64SetThreadContext(hthread: Handle, lpcontext: ConstPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugWow64SetThreadContext(hthread.rawAddress.toString(), lpcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeProcessMemory(hprocess: Handle, lpbaseaddress: ConstPtr, lpbuffer: ConstPtr, nsize: ULong, lpnumberofbyteswritten: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugWriteProcessMemory(hprocess.rawAddress.toString(), lpbaseaddress.rawAddress.toString(), lpbuffer.rawAddress.toString(), nsize.toString(), lpnumberofbyteswritten.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
