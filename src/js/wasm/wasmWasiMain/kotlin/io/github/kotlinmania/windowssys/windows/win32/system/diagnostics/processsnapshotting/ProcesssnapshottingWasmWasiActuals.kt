@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public actual fun pssCaptureSnapshot(processhandle: Handle, captureflags: PssCaptureFlags, threadcontextflags: UInt, snapshothandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pssDuplicateSnapshot(sourceprocesshandle: Handle, snapshothandle: Hpss, targetprocesshandle: Handle, targetsnapshothandle: COpaquePointer?, flags: PssDuplicateFlags): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pssFreeSnapshot(processhandle: Handle, snapshothandle: Hpss): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pssQuerySnapshot(snapshothandle: Hpss, informationclass: PssQueryInformationClass, buffer: COpaquePointer?, bufferlength: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pssWalkMarkerCreate(allocator: COpaquePointer?, walkmarkerhandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pssWalkMarkerFree(walkmarkerhandle: Hpsswalk): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pssWalkMarkerGetPosition(walkmarkerhandle: Hpsswalk, position: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pssWalkMarkerSeekToBeginning(walkmarkerhandle: Hpsswalk): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pssWalkMarkerSetPosition(walkmarkerhandle: Hpsswalk, position: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pssWalkSnapshot(snapshothandle: Hpss, informationclass: PssWalkInformationClass, walkmarkerhandle: Hpsswalk, buffer: COpaquePointer?, bufferlength: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
