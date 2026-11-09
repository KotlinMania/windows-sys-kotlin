@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun PrjAllocateAlignedBuffer(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, size: ULong): Long =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_PrjAllocateAlignedBuffer(namespacevirtualizationcontext.toCPointer<ByteVar>(), size)?.toLong() ?: 0L

public actual fun PrjClearNegativePathCache(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, totalentrynumber: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_PrjClearNegativePathCache(namespacevirtualizationcontext.toCPointer<ByteVar>(), totalentrynumber.toCPointer<ByteVar>())

public actual fun PrjCompleteCommand(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, commandid: Int, completionresult: HRESULT, extendedparameters: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_PrjCompleteCommand(namespacevirtualizationcontext.toCPointer<ByteVar>(), commandid, completionresult, extendedparameters.toCPointer<ByteVar>())

public actual fun PrjDeleteFile(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, destinationfilename: PCWSTR, updateflags: PRJ_UPDATE_TYPES, failurereason: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_PrjDeleteFile(namespacevirtualizationcontext.toCPointer<ByteVar>(), destinationfilename.toCPointer<ByteVar>(), updateflags, failurereason.toCPointer<ByteVar>())

public actual fun PrjDoesNameContainWildCards(filename: PCWSTR): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_PrjDoesNameContainWildCards(filename.toCPointer<ByteVar>())

public actual fun PrjFileNameCompare(filename1: PCWSTR, filename2: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_PrjFileNameCompare(filename1.toCPointer<ByteVar>(), filename2.toCPointer<ByteVar>())

public actual fun PrjFileNameMatch(filenametocheck: PCWSTR, pattern: PCWSTR): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_PrjFileNameMatch(filenametocheck.toCPointer<ByteVar>(), pattern.toCPointer<ByteVar>())

public actual fun PrjFillDirEntryBuffer(filename: PCWSTR, filebasicinfo: Long, direntrybufferhandle: PRJ_DIR_ENTRY_BUFFER_HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_PrjFillDirEntryBuffer(filename.toCPointer<ByteVar>(), filebasicinfo.toCPointer<ByteVar>(), direntrybufferhandle.toCPointer<ByteVar>())

public actual fun PrjFillDirEntryBuffer2(direntrybufferhandle: PRJ_DIR_ENTRY_BUFFER_HANDLE, filename: PCWSTR, filebasicinfo: Long, extendedinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_PrjFillDirEntryBuffer2(direntrybufferhandle.toCPointer<ByteVar>(), filename.toCPointer<ByteVar>(), filebasicinfo.toCPointer<ByteVar>(), extendedinfo.toCPointer<ByteVar>())

public actual fun PrjFreeAlignedBuffer(buffer: Long) {
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_PrjFreeAlignedBuffer(buffer.toCPointer<ByteVar>())
}

public actual fun PrjGetOnDiskFileState(destinationfilename: PCWSTR, filestate: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_PrjGetOnDiskFileState(destinationfilename.toCPointer<ByteVar>(), filestate.toCPointer<ByteVar>())

public actual fun PrjGetVirtualizationInstanceInfo(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, virtualizationinstanceinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_PrjGetVirtualizationInstanceInfo(namespacevirtualizationcontext.toCPointer<ByteVar>(), virtualizationinstanceinfo.toCPointer<ByteVar>())

public actual fun PrjMarkDirectoryAsPlaceholder(rootpathname: PCWSTR, targetpathname: PCWSTR, versioninfo: Long, virtualizationinstanceid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_PrjMarkDirectoryAsPlaceholder(rootpathname.toCPointer<ByteVar>(), targetpathname.toCPointer<ByteVar>(), versioninfo.toCPointer<ByteVar>(), virtualizationinstanceid.toCPointer<ByteVar>())

public actual fun PrjStartVirtualizing(virtualizationrootpath: PCWSTR, callbacks: Long, instancecontext: Long, options: Long, namespacevirtualizationcontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_PrjStartVirtualizing(virtualizationrootpath.toCPointer<ByteVar>(), callbacks.toCPointer<ByteVar>(), instancecontext.toCPointer<ByteVar>(), options.toCPointer<ByteVar>(), namespacevirtualizationcontext.toCPointer<ByteVar>())

public actual fun PrjStopVirtualizing(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT) {
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_PrjStopVirtualizing(namespacevirtualizationcontext.toCPointer<ByteVar>())
}

public actual fun PrjUpdateFileIfNeeded(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, destinationfilename: PCWSTR, placeholderinfo: Long, placeholderinfosize: UInt, updateflags: PRJ_UPDATE_TYPES, failurereason: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_PrjUpdateFileIfNeeded(namespacevirtualizationcontext.toCPointer<ByteVar>(), destinationfilename.toCPointer<ByteVar>(), placeholderinfo.toCPointer<ByteVar>(), placeholderinfosize, updateflags, failurereason.toCPointer<ByteVar>())

public actual fun PrjWriteFileData(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, datastreamid: Long, buffer: Long, byteoffset: ULong, length: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_PrjWriteFileData(namespacevirtualizationcontext.toCPointer<ByteVar>(), datastreamid.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), byteoffset, length)

public actual fun PrjWritePlaceholderInfo(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, destinationfilename: PCWSTR, placeholderinfo: Long, placeholderinfosize: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_PrjWritePlaceholderInfo(namespacevirtualizationcontext.toCPointer<ByteVar>(), destinationfilename.toCPointer<ByteVar>(), placeholderinfo.toCPointer<ByteVar>(), placeholderinfosize)

public actual fun PrjWritePlaceholderInfo2(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, destinationfilename: PCWSTR, placeholderinfo: Long, placeholderinfosize: UInt, extendedinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_PrjWritePlaceholderInfo2(namespacevirtualizationcontext.toCPointer<ByteVar>(), destinationfilename.toCPointer<ByteVar>(), placeholderinfo.toCPointer<ByteVar>(), placeholderinfosize, extendedinfo.toCPointer<ByteVar>())
