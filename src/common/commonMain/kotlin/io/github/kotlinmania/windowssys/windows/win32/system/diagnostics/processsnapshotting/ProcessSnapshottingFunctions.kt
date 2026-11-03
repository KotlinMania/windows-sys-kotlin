package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting

import io.github.kotlinmania.windowssys.Win32DynamicFfi

public fun PssCaptureSnapshot(processhandle: Foundation.HANDLE, captureflags: PSS_CAPTURE_FLAGS, threadcontextflags: UInt, snapshothandle: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "PssCaptureSnapshot", longArrayOf(Win32DynamicFfi.objectSlot(processhandle), captureflags.toLong(), threadcontextflags.toLong(), snapshothandle)).toUInt()
}

public fun PssDuplicateSnapshot(sourceprocesshandle: Foundation.HANDLE, snapshothandle: HPSS, targetprocesshandle: Foundation.HANDLE, targetsnapshothandle: Long, flags: PSS_DUPLICATE_FLAGS): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "PssDuplicateSnapshot", longArrayOf(Win32DynamicFfi.objectSlot(sourceprocesshandle), snapshothandle, Win32DynamicFfi.objectSlot(targetprocesshandle), targetsnapshothandle, flags.toLong())).toUInt()
}

public fun PssFreeSnapshot(processhandle: Foundation.HANDLE, snapshothandle: HPSS): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "PssFreeSnapshot", longArrayOf(Win32DynamicFfi.objectSlot(processhandle), snapshothandle)).toUInt()
}

public fun PssQuerySnapshot(snapshothandle: HPSS, informationclass: PSS_QUERY_INFORMATION_CLASS, buffer: Long, bufferlength: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "PssQuerySnapshot", longArrayOf(snapshothandle, informationclass.toLong(), buffer, bufferlength.toLong())).toUInt()
}

public fun PssWalkMarkerCreate(allocator: Long, walkmarkerhandle: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "PssWalkMarkerCreate", longArrayOf(allocator, walkmarkerhandle)).toUInt()
}

public fun PssWalkMarkerFree(walkmarkerhandle: HPSSWALK): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "PssWalkMarkerFree", longArrayOf(walkmarkerhandle)).toUInt()
}

public fun PssWalkMarkerGetPosition(walkmarkerhandle: HPSSWALK, position: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "PssWalkMarkerGetPosition", longArrayOf(walkmarkerhandle, position)).toUInt()
}

public fun PssWalkMarkerSeekToBeginning(walkmarkerhandle: HPSSWALK): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "PssWalkMarkerSeekToBeginning", longArrayOf(walkmarkerhandle)).toUInt()
}

public fun PssWalkMarkerSetPosition(walkmarkerhandle: HPSSWALK, position: ULong): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "PssWalkMarkerSetPosition", longArrayOf(walkmarkerhandle, position.toLong())).toUInt()
}

public fun PssWalkSnapshot(snapshothandle: HPSS, informationclass: PSS_WALK_INFORMATION_CLASS, walkmarkerhandle: HPSSWALK, buffer: Long, bufferlength: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "PssWalkSnapshot", longArrayOf(snapshothandle, informationclass.toLong(), walkmarkerhandle, buffer, bufferlength.toLong())).toUInt()
}
