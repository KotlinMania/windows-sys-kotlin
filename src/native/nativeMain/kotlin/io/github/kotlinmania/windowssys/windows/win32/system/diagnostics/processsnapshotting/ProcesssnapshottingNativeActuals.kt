@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting.cinterop.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssCaptureSnapshot
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting.cinterop.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssDuplicateSnapshot
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting.cinterop.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssFreeSnapshot
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting.cinterop.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssQuerySnapshot
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting.cinterop.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerCreate
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting.cinterop.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerFree
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting.cinterop.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerGetPosition
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting.cinterop.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerSeekToBeginning
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting.cinterop.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerSetPosition
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting.cinterop.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkSnapshot
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun pssCaptureSnapshot(processhandle: Handle, captureflags: PssCaptureFlags, threadcontextflags: UInt, snapshothandle: MutPtr<Hpss>): UInt =
    windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssCaptureSnapshot(processhandle.rawAddress.toCPointer<ByteVar>(), captureflags, threadcontextflags, snapshothandle.rawAddress.toCPointer<ByteVar>())

public actual fun pssDuplicateSnapshot(sourceprocesshandle: Handle, snapshothandle: Hpss, targetprocesshandle: Handle, targetsnapshothandle: MutPtr<Hpss>, flags: PssDuplicateFlags): UInt =
    windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssDuplicateSnapshot(sourceprocesshandle.rawAddress.toCPointer<ByteVar>(), snapshothandle.rawAddress.toCPointer<ByteVar>(), targetprocesshandle.rawAddress.toCPointer<ByteVar>(), targetsnapshothandle.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun pssFreeSnapshot(processhandle: Handle, snapshothandle: Hpss): UInt =
    windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssFreeSnapshot(processhandle.rawAddress.toCPointer<ByteVar>(), snapshothandle.rawAddress.toCPointer<ByteVar>())

public actual fun pssQuerySnapshot(snapshothandle: Hpss, informationclass: PssQueryInformationClass, buffer: MutPtr<CVoid>, bufferlength: UInt): UInt =
    windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssQuerySnapshot(snapshothandle.rawAddress.toCPointer<ByteVar>(), informationclass, buffer.rawAddress.toCPointer<ByteVar>(), bufferlength)

public actual fun pssWalkMarkerCreate(allocator: ConstPtr<PssAllocator>, walkmarkerhandle: MutPtr<Hpsswalk>): UInt =
    windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerCreate(allocator.rawAddress.toCPointer<ByteVar>(), walkmarkerhandle.rawAddress.toCPointer<ByteVar>())

public actual fun pssWalkMarkerFree(walkmarkerhandle: Hpsswalk): UInt =
    windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerFree(walkmarkerhandle.rawAddress.toCPointer<ByteVar>())

public actual fun pssWalkMarkerGetPosition(walkmarkerhandle: Hpsswalk, position: MutPtr<ULong>): UInt =
    windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerGetPosition(walkmarkerhandle.rawAddress.toCPointer<ByteVar>(), position.rawAddress.toCPointer<ByteVar>())

public actual fun pssWalkMarkerSeekToBeginning(walkmarkerhandle: Hpsswalk): UInt =
    windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerSeekToBeginning(walkmarkerhandle.rawAddress.toCPointer<ByteVar>())

public actual fun pssWalkMarkerSetPosition(walkmarkerhandle: Hpsswalk, position: ULong): UInt =
    windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerSetPosition(walkmarkerhandle.rawAddress.toCPointer<ByteVar>(), position)

public actual fun pssWalkSnapshot(snapshothandle: Hpss, informationclass: PssWalkInformationClass, walkmarkerhandle: Hpsswalk, buffer: MutPtr<CVoid>, bufferlength: UInt): UInt =
    windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkSnapshot(snapshothandle.rawAddress.toCPointer<ByteVar>(), informationclass, walkmarkerhandle.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), bufferlength)
