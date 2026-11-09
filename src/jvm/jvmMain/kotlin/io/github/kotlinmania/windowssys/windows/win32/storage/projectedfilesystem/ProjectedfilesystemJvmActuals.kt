@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

private object WindowsWin32StorageProjectedfilesystemJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_PrjAllocateAlignedBuffer(namespacevirtualizationcontext: Long, size: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_PrjClearNegativePathCache(namespacevirtualizationcontext: Long, totalentrynumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_PrjCompleteCommand(namespacevirtualizationcontext: Long, commandid: Int, completionresult: Int, extendedparameters: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_PrjDeleteFile(namespacevirtualizationcontext: Long, destinationfilename: Long, updateflags: Int, failurereason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_PrjDoesNameContainWildCards(filename: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_PrjFileNameCompare(filename1: Long, filename2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_PrjFileNameMatch(filenametocheck: Long, pattern: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_PrjFillDirEntryBuffer(filename: Long, filebasicinfo: Long, direntrybufferhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_PrjFillDirEntryBuffer2(direntrybufferhandle: Long, filename: Long, filebasicinfo: Long, extendedinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_PrjFreeAlignedBuffer(buffer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_PrjGetOnDiskFileState(destinationfilename: Long, filestate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_PrjGetVirtualizationInstanceInfo(namespacevirtualizationcontext: Long, virtualizationinstanceinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_PrjMarkDirectoryAsPlaceholder(rootpathname: Long, targetpathname: Long, versioninfo: Long, virtualizationinstanceid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_PrjStartVirtualizing(virtualizationrootpath: Long, callbacks: Long, instancecontext: Long, options: Long, namespacevirtualizationcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_PrjStopVirtualizing(namespacevirtualizationcontext: Long)

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_PrjUpdateFileIfNeeded(namespacevirtualizationcontext: Long, destinationfilename: Long, placeholderinfo: Long, placeholderinfosize: Int, updateflags: Int, failurereason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_PrjWriteFileData(namespacevirtualizationcontext: Long, datastreamid: Long, buffer: Long, byteoffset: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_PrjWritePlaceholderInfo(namespacevirtualizationcontext: Long, destinationfilename: Long, placeholderinfo: Long, placeholderinfosize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_projectedfilesystem_PrjWritePlaceholderInfo2(namespacevirtualizationcontext: Long, destinationfilename: Long, placeholderinfo: Long, placeholderinfosize: Int, extendedinfo: Long): Int
}

public actual fun PrjAllocateAlignedBuffer(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, size: ULong): Long =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_PrjAllocateAlignedBuffer(namespacevirtualizationcontext, size.toLong())

public actual fun PrjClearNegativePathCache(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, totalentrynumber: Long): HRESULT =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_PrjClearNegativePathCache(namespacevirtualizationcontext, totalentrynumber)

public actual fun PrjCompleteCommand(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, commandid: Int, completionresult: HRESULT, extendedparameters: Long): HRESULT =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_PrjCompleteCommand(namespacevirtualizationcontext, commandid, completionresult, extendedparameters)

public actual fun PrjDeleteFile(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, destinationfilename: PCWSTR, updateflags: PRJ_UPDATE_TYPES, failurereason: Long): HRESULT =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_PrjDeleteFile(namespacevirtualizationcontext, destinationfilename, updateflags, failurereason)

public actual fun PrjDoesNameContainWildCards(filename: PCWSTR): Boolean =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_PrjDoesNameContainWildCards(filename)

public actual fun PrjFileNameCompare(filename1: PCWSTR, filename2: PCWSTR): Int =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_PrjFileNameCompare(filename1, filename2)

public actual fun PrjFileNameMatch(filenametocheck: PCWSTR, pattern: PCWSTR): Boolean =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_PrjFileNameMatch(filenametocheck, pattern)

public actual fun PrjFillDirEntryBuffer(filename: PCWSTR, filebasicinfo: Long, direntrybufferhandle: PRJ_DIR_ENTRY_BUFFER_HANDLE): HRESULT =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_PrjFillDirEntryBuffer(filename, filebasicinfo, direntrybufferhandle)

public actual fun PrjFillDirEntryBuffer2(direntrybufferhandle: PRJ_DIR_ENTRY_BUFFER_HANDLE, filename: PCWSTR, filebasicinfo: Long, extendedinfo: Long): HRESULT =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_PrjFillDirEntryBuffer2(direntrybufferhandle, filename, filebasicinfo, extendedinfo)

public actual fun PrjFreeAlignedBuffer(buffer: Long) {
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_PrjFreeAlignedBuffer(buffer)
}

public actual fun PrjGetOnDiskFileState(destinationfilename: PCWSTR, filestate: Long): HRESULT =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_PrjGetOnDiskFileState(destinationfilename, filestate)

public actual fun PrjGetVirtualizationInstanceInfo(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, virtualizationinstanceinfo: Long): HRESULT =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_PrjGetVirtualizationInstanceInfo(namespacevirtualizationcontext, virtualizationinstanceinfo)

public actual fun PrjMarkDirectoryAsPlaceholder(rootpathname: PCWSTR, targetpathname: PCWSTR, versioninfo: Long, virtualizationinstanceid: Long): HRESULT =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_PrjMarkDirectoryAsPlaceholder(rootpathname, targetpathname, versioninfo, virtualizationinstanceid)

public actual fun PrjStartVirtualizing(virtualizationrootpath: PCWSTR, callbacks: Long, instancecontext: Long, options: Long, namespacevirtualizationcontext: Long): HRESULT =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_PrjStartVirtualizing(virtualizationrootpath, callbacks, instancecontext, options, namespacevirtualizationcontext)

public actual fun PrjStopVirtualizing(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT) {
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_PrjStopVirtualizing(namespacevirtualizationcontext)
}

public actual fun PrjUpdateFileIfNeeded(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, destinationfilename: PCWSTR, placeholderinfo: Long, placeholderinfosize: UInt, updateflags: PRJ_UPDATE_TYPES, failurereason: Long): HRESULT =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_PrjUpdateFileIfNeeded(namespacevirtualizationcontext, destinationfilename, placeholderinfo, placeholderinfosize.toInt(), updateflags, failurereason)

public actual fun PrjWriteFileData(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, datastreamid: Long, buffer: Long, byteoffset: ULong, length: UInt): HRESULT =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_PrjWriteFileData(namespacevirtualizationcontext, datastreamid, buffer, byteoffset.toLong(), length.toInt())

public actual fun PrjWritePlaceholderInfo(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, destinationfilename: PCWSTR, placeholderinfo: Long, placeholderinfosize: UInt): HRESULT =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_PrjWritePlaceholderInfo(namespacevirtualizationcontext, destinationfilename, placeholderinfo, placeholderinfosize.toInt())

public actual fun PrjWritePlaceholderInfo2(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, destinationfilename: PCWSTR, placeholderinfo: Long, placeholderinfosize: UInt, extendedinfo: Long): HRESULT =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssys_windows_win32_storage_projectedfilesystem_PrjWritePlaceholderInfo2(namespacevirtualizationcontext, destinationfilename, placeholderinfo, placeholderinfosize.toInt(), extendedinfo)
