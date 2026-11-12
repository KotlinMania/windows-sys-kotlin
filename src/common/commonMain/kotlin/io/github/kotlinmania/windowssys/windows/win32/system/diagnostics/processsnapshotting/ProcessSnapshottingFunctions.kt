package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun pssCaptureSnapshot(processhandle: Handle, captureflags: PssCaptureFlags, threadcontextflags: UInt, snapshothandle: MutPtr<Hpss>): UInt

public expect fun pssDuplicateSnapshot(sourceprocesshandle: Handle, snapshothandle: Hpss, targetprocesshandle: Handle, targetsnapshothandle: MutPtr<Hpss>, flags: PssDuplicateFlags): UInt

public expect fun pssFreeSnapshot(processhandle: Handle, snapshothandle: Hpss): UInt

public expect fun pssQuerySnapshot(snapshothandle: Hpss, informationclass: PssQueryInformationClass, buffer: MutPtr<CVoid>, bufferlength: UInt): UInt

public expect fun pssWalkMarkerCreate(allocator: ConstPtr<PssAllocator>, walkmarkerhandle: MutPtr<Hpsswalk>): UInt

public expect fun pssWalkMarkerFree(walkmarkerhandle: Hpsswalk): UInt

public expect fun pssWalkMarkerGetPosition(walkmarkerhandle: Hpsswalk, position: MutPtr<ULong>): UInt

public expect fun pssWalkMarkerSeekToBeginning(walkmarkerhandle: Hpsswalk): UInt

public expect fun pssWalkMarkerSetPosition(walkmarkerhandle: Hpsswalk, position: ULong): UInt

public expect fun pssWalkSnapshot(snapshothandle: Hpss, informationclass: PssWalkInformationClass, walkmarkerhandle: Hpsswalk, buffer: MutPtr<CVoid>, bufferlength: UInt): UInt
