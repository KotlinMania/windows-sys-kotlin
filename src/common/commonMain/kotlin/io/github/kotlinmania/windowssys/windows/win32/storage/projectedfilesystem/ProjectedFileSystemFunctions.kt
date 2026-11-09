package io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public expect fun PrjAllocateAlignedBuffer(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, size: ULong): Long

public expect fun PrjClearNegativePathCache(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, totalentrynumber: Long): HRESULT

public expect fun PrjCompleteCommand(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, commandid: Int, completionresult: HRESULT, extendedparameters: Long): HRESULT

public expect fun PrjDeleteFile(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, destinationfilename: PCWSTR, updateflags: PRJ_UPDATE_TYPES, failurereason: Long): HRESULT

public expect fun PrjDoesNameContainWildCards(filename: PCWSTR): Boolean

public expect fun PrjFileNameCompare(filename1: PCWSTR, filename2: PCWSTR): Int

public expect fun PrjFileNameMatch(filenametocheck: PCWSTR, pattern: PCWSTR): Boolean

public expect fun PrjFillDirEntryBuffer(filename: PCWSTR, filebasicinfo: Long, direntrybufferhandle: PRJ_DIR_ENTRY_BUFFER_HANDLE): HRESULT

public expect fun PrjFillDirEntryBuffer2(direntrybufferhandle: PRJ_DIR_ENTRY_BUFFER_HANDLE, filename: PCWSTR, filebasicinfo: Long, extendedinfo: Long): HRESULT

public expect fun PrjFreeAlignedBuffer(buffer: Long)

public expect fun PrjGetOnDiskFileState(destinationfilename: PCWSTR, filestate: Long): HRESULT

public expect fun PrjGetVirtualizationInstanceInfo(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, virtualizationinstanceinfo: Long): HRESULT

public expect fun PrjMarkDirectoryAsPlaceholder(rootpathname: PCWSTR, targetpathname: PCWSTR, versioninfo: Long, virtualizationinstanceid: Long): HRESULT

public expect fun PrjStartVirtualizing(virtualizationrootpath: PCWSTR, callbacks: Long, instancecontext: Long, options: Long, namespacevirtualizationcontext: Long): HRESULT

public expect fun PrjStopVirtualizing(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT)

public expect fun PrjUpdateFileIfNeeded(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, destinationfilename: PCWSTR, placeholderinfo: Long, placeholderinfosize: UInt, updateflags: PRJ_UPDATE_TYPES, failurereason: Long): HRESULT

public expect fun PrjWriteFileData(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, datastreamid: Long, buffer: Long, byteoffset: ULong, length: UInt): HRESULT

public expect fun PrjWritePlaceholderInfo(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, destinationfilename: PCWSTR, placeholderinfo: Long, placeholderinfosize: UInt): HRESULT

public expect fun PrjWritePlaceholderInfo2(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, destinationfilename: PCWSTR, placeholderinfo: Long, placeholderinfosize: UInt, extendedinfo: Long): HRESULT
