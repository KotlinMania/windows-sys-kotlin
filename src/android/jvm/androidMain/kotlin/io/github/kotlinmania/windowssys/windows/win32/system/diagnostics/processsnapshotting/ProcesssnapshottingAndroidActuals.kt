@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssCaptureSnapshot(processhandle: Long, captureflags: Int, threadcontextflags: Int, snapshothandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssDuplicateSnapshot(sourceprocesshandle: Long, snapshothandle: Long, targetprocesshandle: Long, targetsnapshothandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssFreeSnapshot(processhandle: Long, snapshothandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssQuerySnapshot(snapshothandle: Long, informationclass: Int, buffer: Long, bufferlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerCreate(allocator: Long, walkmarkerhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerFree(walkmarkerhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerGetPosition(walkmarkerhandle: Long, position: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerSeekToBeginning(walkmarkerhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerSetPosition(walkmarkerhandle: Long, position: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkSnapshot(snapshothandle: Long, informationclass: Int, walkmarkerhandle: Long, buffer: Long, bufferlength: Int): Int
}

public actual fun pssCaptureSnapshot(processhandle: Handle, captureflags: PssCaptureFlags, threadcontextflags: UInt, snapshothandle: MutPtr): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssCaptureSnapshot(processhandle.rawAddress, captureflags.toInt(), threadcontextflags.toInt(), snapshothandle.rawAddress).toUInt()

public actual fun pssDuplicateSnapshot(sourceprocesshandle: Handle, snapshothandle: Hpss, targetprocesshandle: Handle, targetsnapshothandle: MutPtr, flags: PssDuplicateFlags): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssDuplicateSnapshot(sourceprocesshandle.rawAddress, snapshothandle.rawAddress, targetprocesshandle.rawAddress, targetsnapshothandle.rawAddress, flags).toUInt()

public actual fun pssFreeSnapshot(processhandle: Handle, snapshothandle: Hpss): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssFreeSnapshot(processhandle.rawAddress, snapshothandle.rawAddress).toUInt()

public actual fun pssQuerySnapshot(snapshothandle: Hpss, informationclass: PssQueryInformationClass, buffer: MutPtr, bufferlength: UInt): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssQuerySnapshot(snapshothandle.rawAddress, informationclass, buffer.rawAddress, bufferlength.toInt()).toUInt()

public actual fun pssWalkMarkerCreate(allocator: ConstPtr, walkmarkerhandle: MutPtr): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerCreate(allocator.rawAddress, walkmarkerhandle.rawAddress).toUInt()

public actual fun pssWalkMarkerFree(walkmarkerhandle: Hpsswalk): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerFree(walkmarkerhandle.rawAddress).toUInt()

public actual fun pssWalkMarkerGetPosition(walkmarkerhandle: Hpsswalk, position: MutPtr): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerGetPosition(walkmarkerhandle.rawAddress, position.rawAddress).toUInt()

public actual fun pssWalkMarkerSeekToBeginning(walkmarkerhandle: Hpsswalk): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerSeekToBeginning(walkmarkerhandle.rawAddress).toUInt()

public actual fun pssWalkMarkerSetPosition(walkmarkerhandle: Hpsswalk, position: ULong): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerSetPosition(walkmarkerhandle.rawAddress, position.toLong()).toUInt()

public actual fun pssWalkSnapshot(snapshothandle: Hpss, informationclass: PssWalkInformationClass, walkmarkerhandle: Hpsswalk, buffer: MutPtr, bufferlength: UInt): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkSnapshot(snapshothandle.rawAddress, informationclass, walkmarkerhandle.rawAddress, buffer.rawAddress, bufferlength.toInt()).toUInt()
