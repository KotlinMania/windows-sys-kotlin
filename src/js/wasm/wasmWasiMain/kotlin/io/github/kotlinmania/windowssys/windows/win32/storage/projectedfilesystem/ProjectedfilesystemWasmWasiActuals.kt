@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public actual fun PrjAllocateAlignedBuffer(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, size: ULong): Long =
    0L

public actual fun PrjClearNegativePathCache(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, totalentrynumber: Long): HRESULT =
    0

public actual fun PrjCompleteCommand(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, commandid: Int, completionresult: HRESULT, extendedparameters: Long): HRESULT =
    0

public actual fun PrjDeleteFile(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, destinationfilename: PCWSTR, updateflags: PRJ_UPDATE_TYPES, failurereason: Long): HRESULT =
    0

public actual fun PrjDoesNameContainWildCards(filename: PCWSTR): Boolean =
    false

public actual fun PrjFileNameCompare(filename1: PCWSTR, filename2: PCWSTR): Int =
    0

public actual fun PrjFileNameMatch(filenametocheck: PCWSTR, pattern: PCWSTR): Boolean =
    false

public actual fun PrjFillDirEntryBuffer(filename: PCWSTR, filebasicinfo: Long, direntrybufferhandle: PRJ_DIR_ENTRY_BUFFER_HANDLE): HRESULT =
    0

public actual fun PrjFillDirEntryBuffer2(direntrybufferhandle: PRJ_DIR_ENTRY_BUFFER_HANDLE, filename: PCWSTR, filebasicinfo: Long, extendedinfo: Long): HRESULT =
    0

public actual fun PrjFreeAlignedBuffer(buffer: Long) {
}

public actual fun PrjGetOnDiskFileState(destinationfilename: PCWSTR, filestate: Long): HRESULT =
    0

public actual fun PrjGetVirtualizationInstanceInfo(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, virtualizationinstanceinfo: Long): HRESULT =
    0

public actual fun PrjMarkDirectoryAsPlaceholder(rootpathname: PCWSTR, targetpathname: PCWSTR, versioninfo: Long, virtualizationinstanceid: Long): HRESULT =
    0

public actual fun PrjStartVirtualizing(virtualizationrootpath: PCWSTR, callbacks: Long, instancecontext: Long, options: Long, namespacevirtualizationcontext: Long): HRESULT =
    0

public actual fun PrjStopVirtualizing(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT) {
}

public actual fun PrjUpdateFileIfNeeded(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, destinationfilename: PCWSTR, placeholderinfo: Long, placeholderinfosize: UInt, updateflags: PRJ_UPDATE_TYPES, failurereason: Long): HRESULT =
    0

public actual fun PrjWriteFileData(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, datastreamid: Long, buffer: Long, byteoffset: ULong, length: UInt): HRESULT =
    0

public actual fun PrjWritePlaceholderInfo(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, destinationfilename: PCWSTR, placeholderinfo: Long, placeholderinfosize: UInt): HRESULT =
    0

public actual fun PrjWritePlaceholderInfo2(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, destinationfilename: PCWSTR, placeholderinfo: Long, placeholderinfosize: UInt, extendedinfo: Long): HRESULT =
    0
