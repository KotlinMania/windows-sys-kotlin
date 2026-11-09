@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun PssCaptureSnapshot(processhandle: HANDLE, captureflags: PSS_CAPTURE_FLAGS, threadcontextflags: UInt, snapshothandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting.cinterop.windowssys_windows_win32_system_diagnostics_processsnapshotting_PssCaptureSnapshot(processhandle.toCPointer<ByteVar>(), captureflags, threadcontextflags, snapshothandle.toCPointer<ByteVar>())

public actual fun PssDuplicateSnapshot(sourceprocesshandle: HANDLE, snapshothandle: HPSS, targetprocesshandle: HANDLE, targetsnapshothandle: Long, flags: PSS_DUPLICATE_FLAGS): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting.cinterop.windowssys_windows_win32_system_diagnostics_processsnapshotting_PssDuplicateSnapshot(sourceprocesshandle.toCPointer<ByteVar>(), snapshothandle.toCPointer<ByteVar>(), targetprocesshandle.toCPointer<ByteVar>(), targetsnapshothandle.toCPointer<ByteVar>(), flags)

public actual fun PssFreeSnapshot(processhandle: HANDLE, snapshothandle: HPSS): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting.cinterop.windowssys_windows_win32_system_diagnostics_processsnapshotting_PssFreeSnapshot(processhandle.toCPointer<ByteVar>(), snapshothandle.toCPointer<ByteVar>())

public actual fun PssQuerySnapshot(snapshothandle: HPSS, informationclass: PSS_QUERY_INFORMATION_CLASS, buffer: Long, bufferlength: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting.cinterop.windowssys_windows_win32_system_diagnostics_processsnapshotting_PssQuerySnapshot(snapshothandle.toCPointer<ByteVar>(), informationclass, buffer.toCPointer<ByteVar>(), bufferlength)

public actual fun PssWalkMarkerCreate(allocator: Long, walkmarkerhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting.cinterop.windowssys_windows_win32_system_diagnostics_processsnapshotting_PssWalkMarkerCreate(allocator.toCPointer<ByteVar>(), walkmarkerhandle.toCPointer<ByteVar>())

public actual fun PssWalkMarkerFree(walkmarkerhandle: HPSSWALK): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting.cinterop.windowssys_windows_win32_system_diagnostics_processsnapshotting_PssWalkMarkerFree(walkmarkerhandle.toCPointer<ByteVar>())

public actual fun PssWalkMarkerGetPosition(walkmarkerhandle: HPSSWALK, position: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting.cinterop.windowssys_windows_win32_system_diagnostics_processsnapshotting_PssWalkMarkerGetPosition(walkmarkerhandle.toCPointer<ByteVar>(), position.toCPointer<ByteVar>())

public actual fun PssWalkMarkerSeekToBeginning(walkmarkerhandle: HPSSWALK): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting.cinterop.windowssys_windows_win32_system_diagnostics_processsnapshotting_PssWalkMarkerSeekToBeginning(walkmarkerhandle.toCPointer<ByteVar>())

public actual fun PssWalkMarkerSetPosition(walkmarkerhandle: HPSSWALK, position: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting.cinterop.windowssys_windows_win32_system_diagnostics_processsnapshotting_PssWalkMarkerSetPosition(walkmarkerhandle.toCPointer<ByteVar>(), position)

public actual fun PssWalkSnapshot(snapshothandle: HPSS, informationclass: PSS_WALK_INFORMATION_CLASS, walkmarkerhandle: HPSSWALK, buffer: Long, bufferlength: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting.cinterop.windowssys_windows_win32_system_diagnostics_processsnapshotting_PssWalkSnapshot(snapshothandle.toCPointer<ByteVar>(), informationclass, walkmarkerhandle.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), bufferlength)
