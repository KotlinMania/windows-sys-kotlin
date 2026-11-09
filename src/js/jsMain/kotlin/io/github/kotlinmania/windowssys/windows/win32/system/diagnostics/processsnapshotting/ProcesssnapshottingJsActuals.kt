@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private val _windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun PssCaptureSnapshot(processhandle: HANDLE, captureflags: PSS_CAPTURE_FLAGS, threadcontextflags: UInt, snapshothandle: Long): UInt =
    if (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon != null) (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon.windowssys_windows_win32_system_diagnostics_processsnapshotting_PssCaptureSnapshot(processhandle.toString(), captureflags.toInt(), threadcontextflags.toInt(), snapshothandle.toString()) as Int).toUInt() else 0u

public actual fun PssDuplicateSnapshot(sourceprocesshandle: HANDLE, snapshothandle: HPSS, targetprocesshandle: HANDLE, targetsnapshothandle: Long, flags: PSS_DUPLICATE_FLAGS): UInt =
    if (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon != null) (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon.windowssys_windows_win32_system_diagnostics_processsnapshotting_PssDuplicateSnapshot(sourceprocesshandle.toString(), snapshothandle.toString(), targetprocesshandle.toString(), targetsnapshothandle.toString(), flags) as Int).toUInt() else 0u

public actual fun PssFreeSnapshot(processhandle: HANDLE, snapshothandle: HPSS): UInt =
    if (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon != null) (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon.windowssys_windows_win32_system_diagnostics_processsnapshotting_PssFreeSnapshot(processhandle.toString(), snapshothandle.toString()) as Int).toUInt() else 0u

public actual fun PssQuerySnapshot(snapshothandle: HPSS, informationclass: PSS_QUERY_INFORMATION_CLASS, buffer: Long, bufferlength: UInt): UInt =
    if (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon != null) (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon.windowssys_windows_win32_system_diagnostics_processsnapshotting_PssQuerySnapshot(snapshothandle.toString(), informationclass, buffer.toString(), bufferlength.toInt()) as Int).toUInt() else 0u

public actual fun PssWalkMarkerCreate(allocator: Long, walkmarkerhandle: Long): UInt =
    if (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon != null) (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon.windowssys_windows_win32_system_diagnostics_processsnapshotting_PssWalkMarkerCreate(allocator.toString(), walkmarkerhandle.toString()) as Int).toUInt() else 0u

public actual fun PssWalkMarkerFree(walkmarkerhandle: HPSSWALK): UInt =
    if (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon != null) (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon.windowssys_windows_win32_system_diagnostics_processsnapshotting_PssWalkMarkerFree(walkmarkerhandle.toString()) as Int).toUInt() else 0u

public actual fun PssWalkMarkerGetPosition(walkmarkerhandle: HPSSWALK, position: Long): UInt =
    if (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon != null) (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon.windowssys_windows_win32_system_diagnostics_processsnapshotting_PssWalkMarkerGetPosition(walkmarkerhandle.toString(), position.toString()) as Int).toUInt() else 0u

public actual fun PssWalkMarkerSeekToBeginning(walkmarkerhandle: HPSSWALK): UInt =
    if (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon != null) (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon.windowssys_windows_win32_system_diagnostics_processsnapshotting_PssWalkMarkerSeekToBeginning(walkmarkerhandle.toString()) as Int).toUInt() else 0u

public actual fun PssWalkMarkerSetPosition(walkmarkerhandle: HPSSWALK, position: ULong): UInt =
    if (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon != null) (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon.windowssys_windows_win32_system_diagnostics_processsnapshotting_PssWalkMarkerSetPosition(walkmarkerhandle.toString(), position.toString()) as Int).toUInt() else 0u

public actual fun PssWalkSnapshot(snapshothandle: HPSS, informationclass: PSS_WALK_INFORMATION_CLASS, walkmarkerhandle: HPSSWALK, buffer: Long, bufferlength: UInt): UInt =
    if (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon != null) (_windowsWin32SystemDiagnosticsProcesssnapshottingNapiAddon.windowssys_windows_win32_system_diagnostics_processsnapshotting_PssWalkSnapshot(snapshothandle.toString(), informationclass, walkmarkerhandle.toString(), buffer.toString(), bufferlength.toInt()) as Int).toUInt() else 0u
