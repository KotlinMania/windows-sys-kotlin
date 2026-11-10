@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun pssCaptureSnapshot(processhandle: Handle, captureflags: PssCaptureFlags, threadcontextflags: UInt, snapshothandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting.cinterop.windowssys_windows_win32_system_diagnostics_processsnapshotting_pssCaptureSnapshot(processhandle?.value?.toCPointer<ByteVar>(), captureflags, threadcontextflags, snapshothandle?.value?.toCPointer<ByteVar>())

public actual fun pssDuplicateSnapshot(sourceprocesshandle: Handle, snapshothandle: Hpss, targetprocesshandle: Handle, targetsnapshothandle: COpaquePointer?, flags: PssDuplicateFlags): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting.cinterop.windowssys_windows_win32_system_diagnostics_processsnapshotting_pssDuplicateSnapshot(sourceprocesshandle?.value?.toCPointer<ByteVar>(), snapshothandle?.value?.toCPointer<ByteVar>(), targetprocesshandle?.value?.toCPointer<ByteVar>(), targetsnapshothandle?.value?.toCPointer<ByteVar>(), flags)

public actual fun pssFreeSnapshot(processhandle: Handle, snapshothandle: Hpss): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting.cinterop.windowssys_windows_win32_system_diagnostics_processsnapshotting_pssFreeSnapshot(processhandle?.value?.toCPointer<ByteVar>(), snapshothandle?.value?.toCPointer<ByteVar>())

public actual fun pssQuerySnapshot(snapshothandle: Hpss, informationclass: PssQueryInformationClass, buffer: COpaquePointer?, bufferlength: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting.cinterop.windowssys_windows_win32_system_diagnostics_processsnapshotting_pssQuerySnapshot(snapshothandle?.value?.toCPointer<ByteVar>(), informationclass, buffer?.value?.toCPointer<ByteVar>(), bufferlength)

public actual fun pssWalkMarkerCreate(allocator: COpaquePointer?, walkmarkerhandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting.cinterop.windowssys_windows_win32_system_diagnostics_processsnapshotting_pssWalkMarkerCreate(allocator?.value?.toCPointer<ByteVar>(), walkmarkerhandle?.value?.toCPointer<ByteVar>())

public actual fun pssWalkMarkerFree(walkmarkerhandle: Hpsswalk): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting.cinterop.windowssys_windows_win32_system_diagnostics_processsnapshotting_pssWalkMarkerFree(walkmarkerhandle?.value?.toCPointer<ByteVar>())

public actual fun pssWalkMarkerGetPosition(walkmarkerhandle: Hpsswalk, position: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting.cinterop.windowssys_windows_win32_system_diagnostics_processsnapshotting_pssWalkMarkerGetPosition(walkmarkerhandle?.value?.toCPointer<ByteVar>(), position?.value?.toCPointer<ByteVar>())

public actual fun pssWalkMarkerSeekToBeginning(walkmarkerhandle: Hpsswalk): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting.cinterop.windowssys_windows_win32_system_diagnostics_processsnapshotting_pssWalkMarkerSeekToBeginning(walkmarkerhandle?.value?.toCPointer<ByteVar>())

public actual fun pssWalkMarkerSetPosition(walkmarkerhandle: Hpsswalk, position: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting.cinterop.windowssys_windows_win32_system_diagnostics_processsnapshotting_pssWalkMarkerSetPosition(walkmarkerhandle?.value?.toCPointer<ByteVar>(), position)

public actual fun pssWalkSnapshot(snapshothandle: Hpss, informationclass: PssWalkInformationClass, walkmarkerhandle: Hpsswalk, buffer: COpaquePointer?, bufferlength: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting.cinterop.windowssys_windows_win32_system_diagnostics_processsnapshotting_pssWalkSnapshot(snapshothandle?.value?.toCPointer<ByteVar>(), informationclass, walkmarkerhandle?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), bufferlength)
