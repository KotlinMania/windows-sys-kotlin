@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val _windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun pssCaptureSnapshot(processhandle: Handle, captureflags: PssCaptureFlags, threadcontextflags: UInt, snapshothandle: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon != null) (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon.windowssys_windows_win32_system_diagnostics_processsnapshotting_pssCaptureSnapshot((processhandle?.value ?: 0L).toString(), captureflags.toInt(), threadcontextflags.toInt(), (snapshothandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pssDuplicateSnapshot(sourceprocesshandle: Handle, snapshothandle: Hpss, targetprocesshandle: Handle, targetsnapshothandle: COpaquePointer?, flags: PssDuplicateFlags): UInt =
    if (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon != null) (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon.windowssys_windows_win32_system_diagnostics_processsnapshotting_pssDuplicateSnapshot((sourceprocesshandle?.value ?: 0L).toString(), (snapshothandle?.value ?: 0L).toString(), (targetprocesshandle?.value ?: 0L).toString(), (targetsnapshothandle?.value ?: 0L).toString(), flags) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pssFreeSnapshot(processhandle: Handle, snapshothandle: Hpss): UInt =
    if (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon != null) (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon.windowssys_windows_win32_system_diagnostics_processsnapshotting_pssFreeSnapshot((processhandle?.value ?: 0L).toString(), (snapshothandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pssQuerySnapshot(snapshothandle: Hpss, informationclass: PssQueryInformationClass, buffer: COpaquePointer?, bufferlength: UInt): UInt =
    if (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon != null) (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon.windowssys_windows_win32_system_diagnostics_processsnapshotting_pssQuerySnapshot((snapshothandle?.value ?: 0L).toString(), informationclass, (buffer?.value ?: 0L).toString(), bufferlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pssWalkMarkerCreate(allocator: COpaquePointer?, walkmarkerhandle: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon != null) (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon.windowssys_windows_win32_system_diagnostics_processsnapshotting_pssWalkMarkerCreate((allocator?.value ?: 0L).toString(), (walkmarkerhandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pssWalkMarkerFree(walkmarkerhandle: Hpsswalk): UInt =
    if (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon != null) (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon.windowssys_windows_win32_system_diagnostics_processsnapshotting_pssWalkMarkerFree((walkmarkerhandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pssWalkMarkerGetPosition(walkmarkerhandle: Hpsswalk, position: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon != null) (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon.windowssys_windows_win32_system_diagnostics_processsnapshotting_pssWalkMarkerGetPosition((walkmarkerhandle?.value ?: 0L).toString(), (position?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pssWalkMarkerSeekToBeginning(walkmarkerhandle: Hpsswalk): UInt =
    if (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon != null) (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon.windowssys_windows_win32_system_diagnostics_processsnapshotting_pssWalkMarkerSeekToBeginning((walkmarkerhandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pssWalkMarkerSetPosition(walkmarkerhandle: Hpsswalk, position: ULong): UInt =
    if (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon != null) (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon.windowssys_windows_win32_system_diagnostics_processsnapshotting_pssWalkMarkerSetPosition((walkmarkerhandle?.value ?: 0L).toString(), position.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pssWalkSnapshot(snapshothandle: Hpss, informationclass: PssWalkInformationClass, walkmarkerhandle: Hpsswalk, buffer: COpaquePointer?, bufferlength: UInt): UInt =
    if (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon != null) (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon.windowssys_windows_win32_system_diagnostics_processsnapshotting_pssWalkSnapshot((snapshothandle?.value ?: 0L).toString(), informationclass, (walkmarkerhandle?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
