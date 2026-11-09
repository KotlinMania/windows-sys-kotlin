package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public expect fun PssCaptureSnapshot(processhandle: HANDLE, captureflags: PSS_CAPTURE_FLAGS, threadcontextflags: UInt, snapshothandle: Long): UInt

public expect fun PssDuplicateSnapshot(sourceprocesshandle: HANDLE, snapshothandle: HPSS, targetprocesshandle: HANDLE, targetsnapshothandle: Long, flags: PSS_DUPLICATE_FLAGS): UInt

public expect fun PssFreeSnapshot(processhandle: HANDLE, snapshothandle: HPSS): UInt

public expect fun PssQuerySnapshot(snapshothandle: HPSS, informationclass: PSS_QUERY_INFORMATION_CLASS, buffer: Long, bufferlength: UInt): UInt

public expect fun PssWalkMarkerCreate(allocator: Long, walkmarkerhandle: Long): UInt

public expect fun PssWalkMarkerFree(walkmarkerhandle: HPSSWALK): UInt

public expect fun PssWalkMarkerGetPosition(walkmarkerhandle: HPSSWALK, position: Long): UInt

public expect fun PssWalkMarkerSeekToBeginning(walkmarkerhandle: HPSSWALK): UInt

public expect fun PssWalkMarkerSetPosition(walkmarkerhandle: HPSSWALK, position: ULong): UInt

public expect fun PssWalkSnapshot(snapshothandle: HPSS, informationclass: PSS_WALK_INFORMATION_CLASS, walkmarkerhandle: HPSSWALK, buffer: Long, bufferlength: UInt): UInt
