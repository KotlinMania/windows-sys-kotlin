@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_processsnapshotting_pssCaptureSnapshot(processhandle: Long, captureflags: Int, threadcontextflags: Int, snapshothandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_processsnapshotting_pssDuplicateSnapshot(sourceprocesshandle: Long, snapshothandle: Long, targetprocesshandle: Long, targetsnapshothandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_processsnapshotting_pssFreeSnapshot(processhandle: Long, snapshothandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_processsnapshotting_pssQuerySnapshot(snapshothandle: Long, informationclass: Int, buffer: Long, bufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_processsnapshotting_pssWalkMarkerCreate(allocator: Long, walkmarkerhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_processsnapshotting_pssWalkMarkerFree(walkmarkerhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_processsnapshotting_pssWalkMarkerGetPosition(walkmarkerhandle: Long, position: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_processsnapshotting_pssWalkMarkerSeekToBeginning(walkmarkerhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_processsnapshotting_pssWalkMarkerSetPosition(walkmarkerhandle: Long, position: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_processsnapshotting_pssWalkSnapshot(snapshothandle: Long, informationclass: Int, walkmarkerhandle: Long, buffer: Long, bufferlength: Int): Int
}

public actual fun pssCaptureSnapshot(processhandle: Handle, captureflags: PssCaptureFlags, threadcontextflags: UInt, snapshothandle: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssys_windows_win32_system_diagnostics_processsnapshotting_pssCaptureSnapshot((processhandle?.value ?: 0L), captureflags.toInt(), threadcontextflags.toInt(), (snapshothandle?.value ?: 0L)).toUInt()

public actual fun pssDuplicateSnapshot(sourceprocesshandle: Handle, snapshothandle: Hpss, targetprocesshandle: Handle, targetsnapshothandle: COpaquePointer?, flags: PssDuplicateFlags): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssys_windows_win32_system_diagnostics_processsnapshotting_pssDuplicateSnapshot((sourceprocesshandle?.value ?: 0L), (snapshothandle?.value ?: 0L), (targetprocesshandle?.value ?: 0L), (targetsnapshothandle?.value ?: 0L), flags).toUInt()

public actual fun pssFreeSnapshot(processhandle: Handle, snapshothandle: Hpss): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssys_windows_win32_system_diagnostics_processsnapshotting_pssFreeSnapshot((processhandle?.value ?: 0L), (snapshothandle?.value ?: 0L)).toUInt()

public actual fun pssQuerySnapshot(snapshothandle: Hpss, informationclass: PssQueryInformationClass, buffer: COpaquePointer?, bufferlength: UInt): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssys_windows_win32_system_diagnostics_processsnapshotting_pssQuerySnapshot((snapshothandle?.value ?: 0L), informationclass, (buffer?.value ?: 0L), bufferlength.toInt()).toUInt()

public actual fun pssWalkMarkerCreate(allocator: COpaquePointer?, walkmarkerhandle: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssys_windows_win32_system_diagnostics_processsnapshotting_pssWalkMarkerCreate((allocator?.value ?: 0L), (walkmarkerhandle?.value ?: 0L)).toUInt()

public actual fun pssWalkMarkerFree(walkmarkerhandle: Hpsswalk): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssys_windows_win32_system_diagnostics_processsnapshotting_pssWalkMarkerFree((walkmarkerhandle?.value ?: 0L)).toUInt()

public actual fun pssWalkMarkerGetPosition(walkmarkerhandle: Hpsswalk, position: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssys_windows_win32_system_diagnostics_processsnapshotting_pssWalkMarkerGetPosition((walkmarkerhandle?.value ?: 0L), (position?.value ?: 0L)).toUInt()

public actual fun pssWalkMarkerSeekToBeginning(walkmarkerhandle: Hpsswalk): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssys_windows_win32_system_diagnostics_processsnapshotting_pssWalkMarkerSeekToBeginning((walkmarkerhandle?.value ?: 0L)).toUInt()

public actual fun pssWalkMarkerSetPosition(walkmarkerhandle: Hpsswalk, position: ULong): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssys_windows_win32_system_diagnostics_processsnapshotting_pssWalkMarkerSetPosition((walkmarkerhandle?.value ?: 0L), position.toLong()).toUInt()

public actual fun pssWalkSnapshot(snapshothandle: Hpss, informationclass: PssWalkInformationClass, walkmarkerhandle: Hpsswalk, buffer: COpaquePointer?, bufferlength: UInt): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssys_windows_win32_system_diagnostics_processsnapshotting_pssWalkSnapshot((snapshothandle?.value ?: 0L), informationclass, (walkmarkerhandle?.value ?: 0L), (buffer?.value ?: 0L), bufferlength.toInt()).toUInt()
