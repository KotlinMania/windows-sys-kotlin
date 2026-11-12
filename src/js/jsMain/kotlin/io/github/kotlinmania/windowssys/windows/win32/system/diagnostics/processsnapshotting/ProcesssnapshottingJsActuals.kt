@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun pssCaptureSnapshot(processhandle: Handle, captureflags: PssCaptureFlags, threadcontextflags: UInt, snapshothandle: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon != null) (windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssCaptureSnapshot(processhandle.rawAddress.toString(), captureflags.toInt(), threadcontextflags.toInt(), snapshothandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pssDuplicateSnapshot(sourceprocesshandle: Handle, snapshothandle: Hpss, targetprocesshandle: Handle, targetsnapshothandle: MutPtr, flags: PssDuplicateFlags): UInt =
    if (windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon != null) (windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssDuplicateSnapshot(sourceprocesshandle.rawAddress.toString(), snapshothandle.rawAddress.toString(), targetprocesshandle.rawAddress.toString(), targetsnapshothandle.rawAddress.toString(), flags) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pssFreeSnapshot(processhandle: Handle, snapshothandle: Hpss): UInt =
    if (windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon != null) (windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssFreeSnapshot(processhandle.rawAddress.toString(), snapshothandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pssQuerySnapshot(snapshothandle: Hpss, informationclass: PssQueryInformationClass, buffer: MutPtr, bufferlength: UInt): UInt =
    if (windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon != null) (windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssQuerySnapshot(snapshothandle.rawAddress.toString(), informationclass, buffer.rawAddress.toString(), bufferlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pssWalkMarkerCreate(allocator: ConstPtr, walkmarkerhandle: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon != null) (windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerCreate(allocator.rawAddress.toString(), walkmarkerhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pssWalkMarkerFree(walkmarkerhandle: Hpsswalk): UInt =
    if (windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon != null) (windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerFree(walkmarkerhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pssWalkMarkerGetPosition(walkmarkerhandle: Hpsswalk, position: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon != null) (windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerGetPosition(walkmarkerhandle.rawAddress.toString(), position.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pssWalkMarkerSeekToBeginning(walkmarkerhandle: Hpsswalk): UInt =
    if (windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon != null) (windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerSeekToBeginning(walkmarkerhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pssWalkMarkerSetPosition(walkmarkerhandle: Hpsswalk, position: ULong): UInt =
    if (windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon != null) (windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerSetPosition(walkmarkerhandle.rawAddress.toString(), position.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pssWalkSnapshot(snapshothandle: Hpss, informationclass: PssWalkInformationClass, walkmarkerhandle: Hpsswalk, buffer: MutPtr, bufferlength: UInt): UInt =
    if (windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon != null) (windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkSnapshot(snapshothandle.rawAddress.toString(), informationclass, walkmarkerhandle.rawAddress.toString(), buffer.rawAddress.toString(), bufferlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
