@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon(): Boolean

private val windowsWin32SystemDiagnosticsProcesssnapshottingNapiAvailable: Boolean = initWindowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssCaptureSnapshot(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssCaptureSnapshot(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssDuplicateSnapshot(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssDuplicateSnapshot(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssFreeSnapshot(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssFreeSnapshot(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssQuerySnapshot(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssQuerySnapshot(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerCreate(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerCreate(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerFree(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerFree(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerGetPosition(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerGetPosition(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerSeekToBeginning(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerSeekToBeginning(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerSetPosition(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerSetPosition(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkSnapshot(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkSnapshot(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

public actual fun pssCaptureSnapshot(processhandle: Handle, captureflags: PssCaptureFlags, threadcontextflags: UInt, snapshothandle: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsProcesssnapshottingNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssCaptureSnapshot(processhandle.rawAddress.toString(), captureflags.toInt(), threadcontextflags.toInt(), snapshothandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pssDuplicateSnapshot(sourceprocesshandle: Handle, snapshothandle: Hpss, targetprocesshandle: Handle, targetsnapshothandle: MutPtr, flags: PssDuplicateFlags): UInt =
    if (windowsWin32SystemDiagnosticsProcesssnapshottingNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssDuplicateSnapshot(sourceprocesshandle.rawAddress.toString(), snapshothandle.rawAddress.toString(), targetprocesshandle.rawAddress.toString(), targetsnapshothandle.rawAddress.toString(), flags).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pssFreeSnapshot(processhandle: Handle, snapshothandle: Hpss): UInt =
    if (windowsWin32SystemDiagnosticsProcesssnapshottingNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssFreeSnapshot(processhandle.rawAddress.toString(), snapshothandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pssQuerySnapshot(snapshothandle: Hpss, informationclass: PssQueryInformationClass, buffer: MutPtr, bufferlength: UInt): UInt =
    if (windowsWin32SystemDiagnosticsProcesssnapshottingNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssQuerySnapshot(snapshothandle.rawAddress.toString(), informationclass, buffer.rawAddress.toString(), bufferlength.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pssWalkMarkerCreate(allocator: ConstPtr, walkmarkerhandle: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsProcesssnapshottingNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerCreate(allocator.rawAddress.toString(), walkmarkerhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pssWalkMarkerFree(walkmarkerhandle: Hpsswalk): UInt =
    if (windowsWin32SystemDiagnosticsProcesssnapshottingNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerFree(walkmarkerhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pssWalkMarkerGetPosition(walkmarkerhandle: Hpsswalk, position: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsProcesssnapshottingNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerGetPosition(walkmarkerhandle.rawAddress.toString(), position.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pssWalkMarkerSeekToBeginning(walkmarkerhandle: Hpsswalk): UInt =
    if (windowsWin32SystemDiagnosticsProcesssnapshottingNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerSeekToBeginning(walkmarkerhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pssWalkMarkerSetPosition(walkmarkerhandle: Hpsswalk, position: ULong): UInt =
    if (windowsWin32SystemDiagnosticsProcesssnapshottingNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerSetPosition(walkmarkerhandle.rawAddress.toString(), position.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pssWalkSnapshot(snapshothandle: Hpss, informationclass: PssWalkInformationClass, walkmarkerhandle: Hpsswalk, buffer: MutPtr, bufferlength: UInt): UInt =
    if (windowsWin32SystemDiagnosticsProcesssnapshottingNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkSnapshot(snapshothandle.rawAddress.toString(), informationclass, walkmarkerhandle.rawAddress.toString(), buffer.rawAddress.toString(), bufferlength.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
