@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public actual fun PssCaptureSnapshot(processhandle: HANDLE, captureflags: PSS_CAPTURE_FLAGS, threadcontextflags: UInt, snapshothandle: Long): UInt =
    0u

public actual fun PssDuplicateSnapshot(sourceprocesshandle: HANDLE, snapshothandle: HPSS, targetprocesshandle: HANDLE, targetsnapshothandle: Long, flags: PSS_DUPLICATE_FLAGS): UInt =
    0u

public actual fun PssFreeSnapshot(processhandle: HANDLE, snapshothandle: HPSS): UInt =
    0u

public actual fun PssQuerySnapshot(snapshothandle: HPSS, informationclass: PSS_QUERY_INFORMATION_CLASS, buffer: Long, bufferlength: UInt): UInt =
    0u

public actual fun PssWalkMarkerCreate(allocator: Long, walkmarkerhandle: Long): UInt =
    0u

public actual fun PssWalkMarkerFree(walkmarkerhandle: HPSSWALK): UInt =
    0u

public actual fun PssWalkMarkerGetPosition(walkmarkerhandle: HPSSWALK, position: Long): UInt =
    0u

public actual fun PssWalkMarkerSeekToBeginning(walkmarkerhandle: HPSSWALK): UInt =
    0u

public actual fun PssWalkMarkerSetPosition(walkmarkerhandle: HPSSWALK, position: ULong): UInt =
    0u

public actual fun PssWalkSnapshot(snapshothandle: HPSS, informationclass: PSS_WALK_INFORMATION_CLASS, walkmarkerhandle: HPSSWALK, buffer: Long, bufferlength: UInt): UInt =
    0u
