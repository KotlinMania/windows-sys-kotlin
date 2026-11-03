package io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun PrjAllocateAlignedBuffer(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, size: ULong): Long {
    return Win32DynamicFfi.invoke("projectedfslib.dll", "PrjAllocateAlignedBuffer", longArrayOf(namespacevirtualizationcontext, size.toLong()))
}

public fun PrjClearNegativePathCache(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, totalentrynumber: Long): HRESULT {
    return Win32DynamicFfi.invoke("projectedfslib.dll", "PrjClearNegativePathCache", longArrayOf(namespacevirtualizationcontext, totalentrynumber)).toInt()
}

public fun PrjCompleteCommand(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, commandid: Int, completionresult: HRESULT, extendedparameters: Long): HRESULT {
    return Win32DynamicFfi.invoke("projectedfslib.dll", "PrjCompleteCommand", longArrayOf(namespacevirtualizationcontext, commandid.toLong(), completionresult.toLong(), extendedparameters)).toInt()
}

public fun PrjDeleteFile(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, destinationfilename: PCWSTR, updateflags: PRJ_UPDATE_TYPES, failurereason: Long): HRESULT {
    return Win32DynamicFfi.invoke("projectedfslib.dll", "PrjDeleteFile", longArrayOf(namespacevirtualizationcontext, destinationfilename, updateflags.toLong(), failurereason)).toInt()
}

public fun PrjDoesNameContainWildCards(filename: PCWSTR): Boolean {
    val rawRet = Win32DynamicFfi.invoke("projectedfslib.dll", "PrjDoesNameContainWildCards", longArrayOf(filename))
    return (rawRet and 0xFFL) != 0L
}

public fun PrjFileNameCompare(filename1: PCWSTR, filename2: PCWSTR): Int {
    return Win32DynamicFfi.invoke("projectedfslib.dll", "PrjFileNameCompare", longArrayOf(filename1, filename2)).toInt()
}

public fun PrjFileNameMatch(filenametocheck: PCWSTR, pattern: PCWSTR): Boolean {
    val rawRet = Win32DynamicFfi.invoke("projectedfslib.dll", "PrjFileNameMatch", longArrayOf(filenametocheck, pattern))
    return (rawRet and 0xFFL) != 0L
}

public fun PrjFillDirEntryBuffer(filename: PCWSTR, filebasicinfo: Long, direntrybufferhandle: PRJ_DIR_ENTRY_BUFFER_HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("projectedfslib.dll", "PrjFillDirEntryBuffer", longArrayOf(filename, filebasicinfo, direntrybufferhandle)).toInt()
}

public fun PrjFillDirEntryBuffer2(direntrybufferhandle: PRJ_DIR_ENTRY_BUFFER_HANDLE, filename: PCWSTR, filebasicinfo: Long, extendedinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("projectedfslib.dll", "PrjFillDirEntryBuffer2", longArrayOf(direntrybufferhandle, filename, filebasicinfo, extendedinfo)).toInt()
}

public fun PrjFreeAlignedBuffer(buffer: Long) {
    Win32DynamicFfi.invoke("projectedfslib.dll", "PrjFreeAlignedBuffer", longArrayOf(buffer))
}

public fun PrjGetOnDiskFileState(destinationfilename: PCWSTR, filestate: Long): HRESULT {
    return Win32DynamicFfi.invoke("projectedfslib.dll", "PrjGetOnDiskFileState", longArrayOf(destinationfilename, filestate)).toInt()
}

public fun PrjGetVirtualizationInstanceInfo(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, virtualizationinstanceinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("projectedfslib.dll", "PrjGetVirtualizationInstanceInfo", longArrayOf(namespacevirtualizationcontext, virtualizationinstanceinfo)).toInt()
}

public fun PrjMarkDirectoryAsPlaceholder(rootpathname: PCWSTR, targetpathname: PCWSTR, versioninfo: Long, virtualizationinstanceid: Long): HRESULT {
    return Win32DynamicFfi.invoke("projectedfslib.dll", "PrjMarkDirectoryAsPlaceholder", longArrayOf(rootpathname, targetpathname, versioninfo, virtualizationinstanceid)).toInt()
}

public fun PrjStartVirtualizing(virtualizationrootpath: PCWSTR, callbacks: Long, instancecontext: Long, options: Long, namespacevirtualizationcontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("projectedfslib.dll", "PrjStartVirtualizing", longArrayOf(virtualizationrootpath, callbacks, instancecontext, options, namespacevirtualizationcontext)).toInt()
}

public fun PrjStopVirtualizing(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT) {
    Win32DynamicFfi.invoke("projectedfslib.dll", "PrjStopVirtualizing", longArrayOf(namespacevirtualizationcontext))
}

public fun PrjUpdateFileIfNeeded(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, destinationfilename: PCWSTR, placeholderinfo: Long, placeholderinfosize: UInt, updateflags: PRJ_UPDATE_TYPES, failurereason: Long): HRESULT {
    return Win32DynamicFfi.invoke("projectedfslib.dll", "PrjUpdateFileIfNeeded", longArrayOf(namespacevirtualizationcontext, destinationfilename, placeholderinfo, placeholderinfosize.toLong(), updateflags.toLong(), failurereason)).toInt()
}

public fun PrjWriteFileData(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, datastreamid: Long, buffer: Long, byteoffset: ULong, length: UInt): HRESULT {
    return Win32DynamicFfi.invoke("projectedfslib.dll", "PrjWriteFileData", longArrayOf(namespacevirtualizationcontext, datastreamid, buffer, byteoffset.toLong(), length.toLong())).toInt()
}

public fun PrjWritePlaceholderInfo(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, destinationfilename: PCWSTR, placeholderinfo: Long, placeholderinfosize: UInt): HRESULT {
    return Win32DynamicFfi.invoke("projectedfslib.dll", "PrjWritePlaceholderInfo", longArrayOf(namespacevirtualizationcontext, destinationfilename, placeholderinfo, placeholderinfosize.toLong())).toInt()
}

public fun PrjWritePlaceholderInfo2(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, destinationfilename: PCWSTR, placeholderinfo: Long, placeholderinfosize: UInt, extendedinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("projectedfslib.dll", "PrjWritePlaceholderInfo2", longArrayOf(namespacevirtualizationcontext, destinationfilename, placeholderinfo, placeholderinfosize.toLong(), extendedinfo)).toInt()
}
