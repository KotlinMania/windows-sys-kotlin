@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32StorageProjectedfilesystemJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_prjAllocateAlignedBuffer(namespacevirtualizationcontext: Long, size: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_prjClearNegativePathCache(namespacevirtualizationcontext: Long, totalentrynumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_prjCompleteCommand(namespacevirtualizationcontext: Long, commandid: Int, completionresult: Int, extendedparameters: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_prjDeleteFile(namespacevirtualizationcontext: Long, destinationfilename: Long, updateflags: Int, failurereason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_prjDoesNameContainWildCards(filename: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_prjFileNameCompare(filename1: Long, filename2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_prjFileNameMatch(filenametocheck: Long, pattern: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_prjFillDirEntryBuffer(filename: Long, filebasicinfo: Long, direntrybufferhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_prjFillDirEntryBuffer2(direntrybufferhandle: Long, filename: Long, filebasicinfo: Long, extendedinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_prjFreeAlignedBuffer(buffer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_prjGetOnDiskFileState(destinationfilename: Long, filestate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_prjGetVirtualizationInstanceInfo(namespacevirtualizationcontext: Long, virtualizationinstanceinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_prjMarkDirectoryAsPlaceholder(rootpathname: Long, targetpathname: Long, versioninfo: Long, virtualizationinstanceid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_prjStartVirtualizing(virtualizationrootpath: Long, callbacks: Long, instancecontext: Long, options: Long, namespacevirtualizationcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_prjStopVirtualizing(namespacevirtualizationcontext: Long)

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_prjUpdateFileIfNeeded(namespacevirtualizationcontext: Long, destinationfilename: Long, placeholderinfo: Long, placeholderinfosize: Int, updateflags: Int, failurereason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_prjWriteFileData(namespacevirtualizationcontext: Long, datastreamid: Long, buffer: Long, byteoffset: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_prjWritePlaceholderInfo(namespacevirtualizationcontext: Long, destinationfilename: Long, placeholderinfo: Long, placeholderinfosize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_prjWritePlaceholderInfo2(namespacevirtualizationcontext: Long, destinationfilename: Long, placeholderinfo: Long, placeholderinfosize: Int, extendedinfo: Long): Int
}

public actual fun prjAllocateAlignedBuffer(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, size: ULong): COpaquePointer? =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_prjAllocateAlignedBuffer((namespacevirtualizationcontext?.value ?: 0L), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun prjClearNegativePathCache(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, totalentrynumber: COpaquePointer?): Hresult =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_prjClearNegativePathCache((namespacevirtualizationcontext?.value ?: 0L), (totalentrynumber?.value ?: 0L))

public actual fun prjCompleteCommand(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, commandid: Int, completionresult: Hresult, extendedparameters: COpaquePointer?): Hresult =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_prjCompleteCommand((namespacevirtualizationcontext?.value ?: 0L), commandid, completionresult, (extendedparameters?.value ?: 0L))

public actual fun prjDeleteFile(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, updateflags: PrjUpdateTypes, failurereason: COpaquePointer?): Hresult =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_prjDeleteFile((namespacevirtualizationcontext?.value ?: 0L), (destinationfilename?.value ?: 0L), updateflags, (failurereason?.value ?: 0L))

public actual fun prjDoesNameContainWildCards(filename: Pcwstr): Boolean =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_prjDoesNameContainWildCards((filename?.value ?: 0L))

public actual fun prjFileNameCompare(filename1: Pcwstr, filename2: Pcwstr): Int =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_prjFileNameCompare((filename1?.value ?: 0L), (filename2?.value ?: 0L))

public actual fun prjFileNameMatch(filenametocheck: Pcwstr, pattern: Pcwstr): Boolean =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_prjFileNameMatch((filenametocheck?.value ?: 0L), (pattern?.value ?: 0L))

public actual fun prjFillDirEntryBuffer(filename: Pcwstr, filebasicinfo: COpaquePointer?, direntrybufferhandle: PrjDirEntryBufferHandle): Hresult =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_prjFillDirEntryBuffer((filename?.value ?: 0L), (filebasicinfo?.value ?: 0L), (direntrybufferhandle?.value ?: 0L))

public actual fun prjFillDirEntryBuffer2(direntrybufferhandle: PrjDirEntryBufferHandle, filename: Pcwstr, filebasicinfo: COpaquePointer?, extendedinfo: COpaquePointer?): Hresult =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_prjFillDirEntryBuffer2((direntrybufferhandle?.value ?: 0L), (filename?.value ?: 0L), (filebasicinfo?.value ?: 0L), (extendedinfo?.value ?: 0L))

public actual fun prjFreeAlignedBuffer(buffer: COpaquePointer?) {
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_prjFreeAlignedBuffer((buffer?.value ?: 0L))
}

public actual fun prjGetOnDiskFileState(destinationfilename: Pcwstr, filestate: COpaquePointer?): Hresult =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_prjGetOnDiskFileState((destinationfilename?.value ?: 0L), (filestate?.value ?: 0L))

public actual fun prjGetVirtualizationInstanceInfo(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, virtualizationinstanceinfo: COpaquePointer?): Hresult =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_prjGetVirtualizationInstanceInfo((namespacevirtualizationcontext?.value ?: 0L), (virtualizationinstanceinfo?.value ?: 0L))

public actual fun prjMarkDirectoryAsPlaceholder(rootpathname: Pcwstr, targetpathname: Pcwstr, versioninfo: COpaquePointer?, virtualizationinstanceid: COpaquePointer?): Hresult =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_prjMarkDirectoryAsPlaceholder((rootpathname?.value ?: 0L), (targetpathname?.value ?: 0L), (versioninfo?.value ?: 0L), (virtualizationinstanceid?.value ?: 0L))

public actual fun prjStartVirtualizing(virtualizationrootpath: Pcwstr, callbacks: COpaquePointer?, instancecontext: COpaquePointer?, options: COpaquePointer?, namespacevirtualizationcontext: COpaquePointer?): Hresult =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_prjStartVirtualizing((virtualizationrootpath?.value ?: 0L), (callbacks?.value ?: 0L), (instancecontext?.value ?: 0L), (options?.value ?: 0L), (namespacevirtualizationcontext?.value ?: 0L))

public actual fun prjStopVirtualizing(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext) {
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_prjStopVirtualizing((namespacevirtualizationcontext?.value ?: 0L))
}

public actual fun prjUpdateFileIfNeeded(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, placeholderinfo: COpaquePointer?, placeholderinfosize: UInt, updateflags: PrjUpdateTypes, failurereason: COpaquePointer?): Hresult =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_prjUpdateFileIfNeeded((namespacevirtualizationcontext?.value ?: 0L), (destinationfilename?.value ?: 0L), (placeholderinfo?.value ?: 0L), placeholderinfosize.toInt(), updateflags, (failurereason?.value ?: 0L))

public actual fun prjWriteFileData(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, datastreamid: COpaquePointer?, buffer: COpaquePointer?, byteoffset: ULong, length: UInt): Hresult =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_prjWriteFileData((namespacevirtualizationcontext?.value ?: 0L), (datastreamid?.value ?: 0L), (buffer?.value ?: 0L), byteoffset.toLong(), length.toInt())

public actual fun prjWritePlaceholderInfo(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, placeholderinfo: COpaquePointer?, placeholderinfosize: UInt): Hresult =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_prjWritePlaceholderInfo((namespacevirtualizationcontext?.value ?: 0L), (destinationfilename?.value ?: 0L), (placeholderinfo?.value ?: 0L), placeholderinfosize.toInt())

public actual fun prjWritePlaceholderInfo2(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, placeholderinfo: COpaquePointer?, placeholderinfosize: UInt, extendedinfo: COpaquePointer?): Hresult =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_prjWritePlaceholderInfo2((namespacevirtualizationcontext?.value ?: 0L), (destinationfilename?.value ?: 0L), (placeholderinfo?.value ?: 0L), placeholderinfosize.toInt(), (extendedinfo?.value ?: 0L))
