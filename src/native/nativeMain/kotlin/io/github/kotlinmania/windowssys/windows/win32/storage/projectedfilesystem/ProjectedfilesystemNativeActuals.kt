@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssysWindowsWin32StorageProjectedfilesystemPrjAllocateAlignedBuffer
import io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssysWindowsWin32StorageProjectedfilesystemPrjClearNegativePathCache
import io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssysWindowsWin32StorageProjectedfilesystemPrjCompleteCommand
import io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssysWindowsWin32StorageProjectedfilesystemPrjDeleteFile
import io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssysWindowsWin32StorageProjectedfilesystemPrjDoesNameContainWildCards
import io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssysWindowsWin32StorageProjectedfilesystemPrjFileNameCompare
import io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssysWindowsWin32StorageProjectedfilesystemPrjFileNameMatch
import io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssysWindowsWin32StorageProjectedfilesystemPrjFillDirEntryBuffer
import io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssysWindowsWin32StorageProjectedfilesystemPrjFillDirEntryBuffer2
import io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssysWindowsWin32StorageProjectedfilesystemPrjFreeAlignedBuffer
import io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssysWindowsWin32StorageProjectedfilesystemPrjGetOnDiskFileState
import io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssysWindowsWin32StorageProjectedfilesystemPrjGetVirtualizationInstanceInfo
import io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssysWindowsWin32StorageProjectedfilesystemPrjMarkDirectoryAsPlaceholder
import io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssysWindowsWin32StorageProjectedfilesystemPrjStartVirtualizing
import io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssysWindowsWin32StorageProjectedfilesystemPrjStopVirtualizing
import io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssysWindowsWin32StorageProjectedfilesystemPrjUpdateFileIfNeeded
import io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssysWindowsWin32StorageProjectedfilesystemPrjWriteFileData
import io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssysWindowsWin32StorageProjectedfilesystemPrjWritePlaceholderInfo
import io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem.cinterop.windowssysWindowsWin32StorageProjectedfilesystemPrjWritePlaceholderInfo2
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun prjAllocateAlignedBuffer(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, size: ULong): MutPtr<CVoid> =
    MutPtr(windowssysWindowsWin32StorageProjectedfilesystemPrjAllocateAlignedBuffer(namespacevirtualizationcontext.rawAddress.toCPointer<ByteVar>(), size)?.toLong() ?: 0L)

public actual fun prjClearNegativePathCache(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, totalentrynumber: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32StorageProjectedfilesystemPrjClearNegativePathCache(namespacevirtualizationcontext.rawAddress.toCPointer<ByteVar>(), totalentrynumber.rawAddress.toCPointer<ByteVar>())

public actual fun prjCompleteCommand(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, commandid: Int, completionresult: Hresult, extendedparameters: ConstPtr<PrjCompleteCommandExtendedParameters>): Hresult =
    windowssysWindowsWin32StorageProjectedfilesystemPrjCompleteCommand(namespacevirtualizationcontext.rawAddress.toCPointer<ByteVar>(), commandid, completionresult, extendedparameters.rawAddress.toCPointer<ByteVar>())

public actual fun prjDeleteFile(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, updateflags: PrjUpdateTypes, failurereason: MutPtr<PrjUpdateFailureCauses>): Hresult =
    windowssysWindowsWin32StorageProjectedfilesystemPrjDeleteFile(namespacevirtualizationcontext.rawAddress.toCPointer<ByteVar>(), destinationfilename.rawAddress.toCPointer<ByteVar>(), updateflags, failurereason.rawAddress.toCPointer<ByteVar>())

public actual fun prjDoesNameContainWildCards(filename: Pcwstr): Boolean =
    windowssysWindowsWin32StorageProjectedfilesystemPrjDoesNameContainWildCards(filename.rawAddress.toCPointer<ByteVar>())

public actual fun prjFileNameCompare(filename1: Pcwstr, filename2: Pcwstr): Int =
    windowssysWindowsWin32StorageProjectedfilesystemPrjFileNameCompare(filename1.rawAddress.toCPointer<ByteVar>(), filename2.rawAddress.toCPointer<ByteVar>())

public actual fun prjFileNameMatch(filenametocheck: Pcwstr, pattern: Pcwstr): Boolean =
    windowssysWindowsWin32StorageProjectedfilesystemPrjFileNameMatch(filenametocheck.rawAddress.toCPointer<ByteVar>(), pattern.rawAddress.toCPointer<ByteVar>())

public actual fun prjFillDirEntryBuffer(filename: Pcwstr, filebasicinfo: ConstPtr<PrjFileBasicInfo>, direntrybufferhandle: PrjDirEntryBufferHandle): Hresult =
    windowssysWindowsWin32StorageProjectedfilesystemPrjFillDirEntryBuffer(filename.rawAddress.toCPointer<ByteVar>(), filebasicinfo.rawAddress.toCPointer<ByteVar>(), direntrybufferhandle.rawAddress.toCPointer<ByteVar>())

public actual fun prjFillDirEntryBuffer2(direntrybufferhandle: PrjDirEntryBufferHandle, filename: Pcwstr, filebasicinfo: ConstPtr<PrjFileBasicInfo>, extendedinfo: ConstPtr<PrjExtendedInfo>): Hresult =
    windowssysWindowsWin32StorageProjectedfilesystemPrjFillDirEntryBuffer2(direntrybufferhandle.rawAddress.toCPointer<ByteVar>(), filename.rawAddress.toCPointer<ByteVar>(), filebasicinfo.rawAddress.toCPointer<ByteVar>(), extendedinfo.rawAddress.toCPointer<ByteVar>())

public actual fun prjFreeAlignedBuffer(buffer: ConstPtr<CVoid>) {
    windowssysWindowsWin32StorageProjectedfilesystemPrjFreeAlignedBuffer(buffer.rawAddress.toCPointer<ByteVar>())
}

public actual fun prjGetOnDiskFileState(destinationfilename: Pcwstr, filestate: MutPtr<PrjFileState>): Hresult =
    windowssysWindowsWin32StorageProjectedfilesystemPrjGetOnDiskFileState(destinationfilename.rawAddress.toCPointer<ByteVar>(), filestate.rawAddress.toCPointer<ByteVar>())

public actual fun prjGetVirtualizationInstanceInfo(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, virtualizationinstanceinfo: MutPtr<PrjVirtualizationInstanceInfo>): Hresult =
    windowssysWindowsWin32StorageProjectedfilesystemPrjGetVirtualizationInstanceInfo(namespacevirtualizationcontext.rawAddress.toCPointer<ByteVar>(), virtualizationinstanceinfo.rawAddress.toCPointer<ByteVar>())

public actual fun prjMarkDirectoryAsPlaceholder(rootpathname: Pcwstr, targetpathname: Pcwstr, versioninfo: ConstPtr<PrjPlaceholderVersionInfo>, virtualizationinstanceid: ConstPtr<Guid>): Hresult =
    windowssysWindowsWin32StorageProjectedfilesystemPrjMarkDirectoryAsPlaceholder(rootpathname.rawAddress.toCPointer<ByteVar>(), targetpathname.rawAddress.toCPointer<ByteVar>(), versioninfo.rawAddress.toCPointer<ByteVar>(), virtualizationinstanceid.rawAddress.toCPointer<ByteVar>())

public actual fun prjStartVirtualizing(virtualizationrootpath: Pcwstr, callbacks: ConstPtr<PrjCallbacks>, instancecontext: ConstPtr<CVoid>, options: ConstPtr<PrjStartvirtualizingOptions>, namespacevirtualizationcontext: MutPtr<PrjNamespaceVirtualizationContext>): Hresult =
    windowssysWindowsWin32StorageProjectedfilesystemPrjStartVirtualizing(virtualizationrootpath.rawAddress.toCPointer<ByteVar>(), callbacks.rawAddress.toCPointer<ByteVar>(), instancecontext.rawAddress.toCPointer<ByteVar>(), options.rawAddress.toCPointer<ByteVar>(), namespacevirtualizationcontext.rawAddress.toCPointer<ByteVar>())

public actual fun prjStopVirtualizing(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext) {
    windowssysWindowsWin32StorageProjectedfilesystemPrjStopVirtualizing(namespacevirtualizationcontext.rawAddress.toCPointer<ByteVar>())
}

public actual fun prjUpdateFileIfNeeded(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, placeholderinfo: ConstPtr<PrjPlaceholderInfo>, placeholderinfosize: UInt, updateflags: PrjUpdateTypes, failurereason: MutPtr<PrjUpdateFailureCauses>): Hresult =
    windowssysWindowsWin32StorageProjectedfilesystemPrjUpdateFileIfNeeded(namespacevirtualizationcontext.rawAddress.toCPointer<ByteVar>(), destinationfilename.rawAddress.toCPointer<ByteVar>(), placeholderinfo.rawAddress.toCPointer<ByteVar>(), placeholderinfosize, updateflags, failurereason.rawAddress.toCPointer<ByteVar>())

public actual fun prjWriteFileData(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, datastreamid: ConstPtr<Guid>, buffer: ConstPtr<CVoid>, byteoffset: ULong, length: UInt): Hresult =
    windowssysWindowsWin32StorageProjectedfilesystemPrjWriteFileData(namespacevirtualizationcontext.rawAddress.toCPointer<ByteVar>(), datastreamid.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), byteoffset, length)

public actual fun prjWritePlaceholderInfo(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, placeholderinfo: ConstPtr<PrjPlaceholderInfo>, placeholderinfosize: UInt): Hresult =
    windowssysWindowsWin32StorageProjectedfilesystemPrjWritePlaceholderInfo(namespacevirtualizationcontext.rawAddress.toCPointer<ByteVar>(), destinationfilename.rawAddress.toCPointer<ByteVar>(), placeholderinfo.rawAddress.toCPointer<ByteVar>(), placeholderinfosize)

public actual fun prjWritePlaceholderInfo2(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, placeholderinfo: ConstPtr<PrjPlaceholderInfo>, placeholderinfosize: UInt, extendedinfo: ConstPtr<PrjExtendedInfo>): Hresult =
    windowssysWindowsWin32StorageProjectedfilesystemPrjWritePlaceholderInfo2(namespacevirtualizationcontext.rawAddress.toCPointer<ByteVar>(), destinationfilename.rawAddress.toCPointer<ByteVar>(), placeholderinfo.rawAddress.toCPointer<ByteVar>(), placeholderinfosize, extendedinfo.rawAddress.toCPointer<ByteVar>())
