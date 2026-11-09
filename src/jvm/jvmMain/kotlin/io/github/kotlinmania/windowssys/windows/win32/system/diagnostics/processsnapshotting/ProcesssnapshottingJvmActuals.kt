@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private object WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_processsnapshotting_PssCaptureSnapshot(processhandle: Long, captureflags: Int, threadcontextflags: Int, snapshothandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_processsnapshotting_PssDuplicateSnapshot(sourceprocesshandle: Long, snapshothandle: Long, targetprocesshandle: Long, targetsnapshothandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_processsnapshotting_PssFreeSnapshot(processhandle: Long, snapshothandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_processsnapshotting_PssQuerySnapshot(snapshothandle: Long, informationclass: Int, buffer: Long, bufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_processsnapshotting_PssWalkMarkerCreate(allocator: Long, walkmarkerhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_processsnapshotting_PssWalkMarkerFree(walkmarkerhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_processsnapshotting_PssWalkMarkerGetPosition(walkmarkerhandle: Long, position: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_processsnapshotting_PssWalkMarkerSeekToBeginning(walkmarkerhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_processsnapshotting_PssWalkMarkerSetPosition(walkmarkerhandle: Long, position: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_processsnapshotting_PssWalkSnapshot(snapshothandle: Long, informationclass: Int, walkmarkerhandle: Long, buffer: Long, bufferlength: Int): Int
}

public actual fun PssCaptureSnapshot(processhandle: HANDLE, captureflags: PSS_CAPTURE_FLAGS, threadcontextflags: UInt, snapshothandle: Long): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssys_windows_win32_system_diagnostics_processsnapshotting_PssCaptureSnapshot(processhandle, captureflags.toInt(), threadcontextflags.toInt(), snapshothandle).toUInt()

public actual fun PssDuplicateSnapshot(sourceprocesshandle: HANDLE, snapshothandle: HPSS, targetprocesshandle: HANDLE, targetsnapshothandle: Long, flags: PSS_DUPLICATE_FLAGS): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssys_windows_win32_system_diagnostics_processsnapshotting_PssDuplicateSnapshot(sourceprocesshandle, snapshothandle, targetprocesshandle, targetsnapshothandle, flags).toUInt()

public actual fun PssFreeSnapshot(processhandle: HANDLE, snapshothandle: HPSS): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssys_windows_win32_system_diagnostics_processsnapshotting_PssFreeSnapshot(processhandle, snapshothandle).toUInt()

public actual fun PssQuerySnapshot(snapshothandle: HPSS, informationclass: PSS_QUERY_INFORMATION_CLASS, buffer: Long, bufferlength: UInt): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssys_windows_win32_system_diagnostics_processsnapshotting_PssQuerySnapshot(snapshothandle, informationclass, buffer, bufferlength.toInt()).toUInt()

public actual fun PssWalkMarkerCreate(allocator: Long, walkmarkerhandle: Long): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssys_windows_win32_system_diagnostics_processsnapshotting_PssWalkMarkerCreate(allocator, walkmarkerhandle).toUInt()

public actual fun PssWalkMarkerFree(walkmarkerhandle: HPSSWALK): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssys_windows_win32_system_diagnostics_processsnapshotting_PssWalkMarkerFree(walkmarkerhandle).toUInt()

public actual fun PssWalkMarkerGetPosition(walkmarkerhandle: HPSSWALK, position: Long): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssys_windows_win32_system_diagnostics_processsnapshotting_PssWalkMarkerGetPosition(walkmarkerhandle, position).toUInt()

public actual fun PssWalkMarkerSeekToBeginning(walkmarkerhandle: HPSSWALK): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssys_windows_win32_system_diagnostics_processsnapshotting_PssWalkMarkerSeekToBeginning(walkmarkerhandle).toUInt()

public actual fun PssWalkMarkerSetPosition(walkmarkerhandle: HPSSWALK, position: ULong): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssys_windows_win32_system_diagnostics_processsnapshotting_PssWalkMarkerSetPosition(walkmarkerhandle, position.toLong()).toUInt()

public actual fun PssWalkSnapshot(snapshothandle: HPSS, informationclass: PSS_WALK_INFORMATION_CLASS, walkmarkerhandle: HPSSWALK, buffer: Long, bufferlength: UInt): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssys_windows_win32_system_diagnostics_processsnapshotting_PssWalkSnapshot(snapshothandle, informationclass, walkmarkerhandle, buffer, bufferlength.toInt()).toUInt()
