@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun prjAllocateAlignedBuffer(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, size: ULong): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_prjAllocateAlignedBuffer(namespacevirtualizationcontext?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun prjClearNegativePathCache(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, totalentrynumber: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_prjClearNegativePathCache(namespacevirtualizationcontext?.value?.toCPointer<ByteVar>(), totalentrynumber?.value?.toCPointer<ByteVar>())

public actual fun prjCompleteCommand(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, commandid: Int, completionresult: Hresult, extendedparameters: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_prjCompleteCommand(namespacevirtualizationcontext?.value?.toCPointer<ByteVar>(), commandid, completionresult, extendedparameters?.value?.toCPointer<ByteVar>())

public actual fun prjDeleteFile(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, updateflags: PrjUpdateTypes, failurereason: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_prjDeleteFile(namespacevirtualizationcontext?.value?.toCPointer<ByteVar>(), destinationfilename?.value?.toCPointer<ByteVar>(), updateflags, failurereason?.value?.toCPointer<ByteVar>())

public actual fun prjDoesNameContainWildCards(filename: Pcwstr): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_prjDoesNameContainWildCards(filename?.value?.toCPointer<ByteVar>())

public actual fun prjFileNameCompare(filename1: Pcwstr, filename2: Pcwstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_prjFileNameCompare(filename1?.value?.toCPointer<ByteVar>(), filename2?.value?.toCPointer<ByteVar>())

public actual fun prjFileNameMatch(filenametocheck: Pcwstr, pattern: Pcwstr): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_prjFileNameMatch(filenametocheck?.value?.toCPointer<ByteVar>(), pattern?.value?.toCPointer<ByteVar>())

public actual fun prjFillDirEntryBuffer(filename: Pcwstr, filebasicinfo: COpaquePointer?, direntrybufferhandle: PrjDirEntryBufferHandle): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_prjFillDirEntryBuffer(filename?.value?.toCPointer<ByteVar>(), filebasicinfo?.value?.toCPointer<ByteVar>(), direntrybufferhandle?.value?.toCPointer<ByteVar>())

public actual fun prjFillDirEntryBuffer2(direntrybufferhandle: PrjDirEntryBufferHandle, filename: Pcwstr, filebasicinfo: COpaquePointer?, extendedinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_prjFillDirEntryBuffer2(direntrybufferhandle?.value?.toCPointer<ByteVar>(), filename?.value?.toCPointer<ByteVar>(), filebasicinfo?.value?.toCPointer<ByteVar>(), extendedinfo?.value?.toCPointer<ByteVar>())

public actual fun prjFreeAlignedBuffer(buffer: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_prjFreeAlignedBuffer(buffer?.value?.toCPointer<ByteVar>())
}

public actual fun prjGetOnDiskFileState(destinationfilename: Pcwstr, filestate: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_prjGetOnDiskFileState(destinationfilename?.value?.toCPointer<ByteVar>(), filestate?.value?.toCPointer<ByteVar>())

public actual fun prjGetVirtualizationInstanceInfo(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, virtualizationinstanceinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_prjGetVirtualizationInstanceInfo(namespacevirtualizationcontext?.value?.toCPointer<ByteVar>(), virtualizationinstanceinfo?.value?.toCPointer<ByteVar>())

public actual fun prjMarkDirectoryAsPlaceholder(rootpathname: Pcwstr, targetpathname: Pcwstr, versioninfo: COpaquePointer?, virtualizationinstanceid: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_prjMarkDirectoryAsPlaceholder(rootpathname?.value?.toCPointer<ByteVar>(), targetpathname?.value?.toCPointer<ByteVar>(), versioninfo?.value?.toCPointer<ByteVar>(), virtualizationinstanceid?.value?.toCPointer<ByteVar>())

public actual fun prjStartVirtualizing(virtualizationrootpath: Pcwstr, callbacks: COpaquePointer?, instancecontext: COpaquePointer?, options: COpaquePointer?, namespacevirtualizationcontext: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_prjStartVirtualizing(virtualizationrootpath?.value?.toCPointer<ByteVar>(), callbacks?.value?.toCPointer<ByteVar>(), instancecontext?.value?.toCPointer<ByteVar>(), options?.value?.toCPointer<ByteVar>(), namespacevirtualizationcontext?.value?.toCPointer<ByteVar>())

public actual fun prjStopVirtualizing(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext) {
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_prjStopVirtualizing(namespacevirtualizationcontext?.value?.toCPointer<ByteVar>())
}

public actual fun prjUpdateFileIfNeeded(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, placeholderinfo: COpaquePointer?, placeholderinfosize: UInt, updateflags: PrjUpdateTypes, failurereason: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_prjUpdateFileIfNeeded(namespacevirtualizationcontext?.value?.toCPointer<ByteVar>(), destinationfilename?.value?.toCPointer<ByteVar>(), placeholderinfo?.value?.toCPointer<ByteVar>(), placeholderinfosize, updateflags, failurereason?.value?.toCPointer<ByteVar>())

public actual fun prjWriteFileData(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, datastreamid: COpaquePointer?, buffer: COpaquePointer?, byteoffset: ULong, length: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_prjWriteFileData(namespacevirtualizationcontext?.value?.toCPointer<ByteVar>(), datastreamid?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), byteoffset, length)

public actual fun prjWritePlaceholderInfo(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, placeholderinfo: COpaquePointer?, placeholderinfosize: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_prjWritePlaceholderInfo(namespacevirtualizationcontext?.value?.toCPointer<ByteVar>(), destinationfilename?.value?.toCPointer<ByteVar>(), placeholderinfo?.value?.toCPointer<ByteVar>(), placeholderinfosize)

public actual fun prjWritePlaceholderInfo2(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, placeholderinfo: COpaquePointer?, placeholderinfosize: UInt, extendedinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssys_windows_win32_storage_projectedfilesystem_prjWritePlaceholderInfo2(namespacevirtualizationcontext?.value?.toCPointer<ByteVar>(), destinationfilename?.value?.toCPointer<ByteVar>(), placeholderinfo?.value?.toCPointer<ByteVar>(), placeholderinfosize, extendedinfo?.value?.toCPointer<ByteVar>())
