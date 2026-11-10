package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun pssCaptureSnapshot(processhandle: Handle, captureflags: PssCaptureFlags, threadcontextflags: UInt, snapshothandle: COpaquePointer?): UInt

public expect fun pssDuplicateSnapshot(sourceprocesshandle: Handle, snapshothandle: Hpss, targetprocesshandle: Handle, targetsnapshothandle: COpaquePointer?, flags: PssDuplicateFlags): UInt

public expect fun pssFreeSnapshot(processhandle: Handle, snapshothandle: Hpss): UInt

public expect fun pssQuerySnapshot(snapshothandle: Hpss, informationclass: PssQueryInformationClass, buffer: COpaquePointer?, bufferlength: UInt): UInt

public expect fun pssWalkMarkerCreate(allocator: COpaquePointer?, walkmarkerhandle: COpaquePointer?): UInt

public expect fun pssWalkMarkerFree(walkmarkerhandle: Hpsswalk): UInt

public expect fun pssWalkMarkerGetPosition(walkmarkerhandle: Hpsswalk, position: COpaquePointer?): UInt

public expect fun pssWalkMarkerSeekToBeginning(walkmarkerhandle: Hpsswalk): UInt

public expect fun pssWalkMarkerSetPosition(walkmarkerhandle: Hpsswalk, position: ULong): UInt

public expect fun pssWalkSnapshot(snapshothandle: Hpss, informationclass: PssWalkInformationClass, walkmarkerhandle: Hpsswalk, buffer: COpaquePointer?, bufferlength: UInt): UInt
