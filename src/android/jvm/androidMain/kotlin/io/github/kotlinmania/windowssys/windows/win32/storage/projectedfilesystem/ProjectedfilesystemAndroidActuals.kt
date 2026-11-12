@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32StorageProjectedfilesystemJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32StorageProjectedfilesystemPrjAllocateAlignedBuffer(namespacevirtualizationcontext: Long, size: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageProjectedfilesystemPrjClearNegativePathCache(namespacevirtualizationcontext: Long, totalentrynumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageProjectedfilesystemPrjCompleteCommand(namespacevirtualizationcontext: Long, commandid: Int, completionresult: Int, extendedparameters: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageProjectedfilesystemPrjDeleteFile(namespacevirtualizationcontext: Long, destinationfilename: Long, updateflags: Int, failurereason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageProjectedfilesystemPrjDoesNameContainWildCards(filename: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32StorageProjectedfilesystemPrjFileNameCompare(filename1: Long, filename2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageProjectedfilesystemPrjFileNameMatch(filenametocheck: Long, pattern: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32StorageProjectedfilesystemPrjFillDirEntryBuffer(filename: Long, filebasicinfo: Long, direntrybufferhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageProjectedfilesystemPrjFillDirEntryBuffer2(direntrybufferhandle: Long, filename: Long, filebasicinfo: Long, extendedinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageProjectedfilesystemPrjFreeAlignedBuffer(buffer: Long)

    @JvmStatic
    external fun windowssysWindowsWin32StorageProjectedfilesystemPrjGetOnDiskFileState(destinationfilename: Long, filestate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageProjectedfilesystemPrjGetVirtualizationInstanceInfo(namespacevirtualizationcontext: Long, virtualizationinstanceinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageProjectedfilesystemPrjMarkDirectoryAsPlaceholder(rootpathname: Long, targetpathname: Long, versioninfo: Long, virtualizationinstanceid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageProjectedfilesystemPrjStartVirtualizing(virtualizationrootpath: Long, callbacks: Long, instancecontext: Long, options: Long, namespacevirtualizationcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageProjectedfilesystemPrjStopVirtualizing(namespacevirtualizationcontext: Long)

    @JvmStatic
    external fun windowssysWindowsWin32StorageProjectedfilesystemPrjUpdateFileIfNeeded(namespacevirtualizationcontext: Long, destinationfilename: Long, placeholderinfo: Long, placeholderinfosize: Int, updateflags: Int, failurereason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageProjectedfilesystemPrjWriteFileData(namespacevirtualizationcontext: Long, datastreamid: Long, buffer: Long, byteoffset: Long, length: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageProjectedfilesystemPrjWritePlaceholderInfo(namespacevirtualizationcontext: Long, destinationfilename: Long, placeholderinfo: Long, placeholderinfosize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageProjectedfilesystemPrjWritePlaceholderInfo2(namespacevirtualizationcontext: Long, destinationfilename: Long, placeholderinfo: Long, placeholderinfosize: Int, extendedinfo: Long): Int
}

public actual fun prjAllocateAlignedBuffer(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, size: ULong): MutPtr<CVoid> =
    MutPtr(WindowsWin32StorageProjectedfilesystemJniBridge.windowssysWindowsWin32StorageProjectedfilesystemPrjAllocateAlignedBuffer(namespacevirtualizationcontext.rawAddress, size.toLong()))

public actual fun prjClearNegativePathCache(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, totalentrynumber: MutPtr<UInt>): Hresult =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssysWindowsWin32StorageProjectedfilesystemPrjClearNegativePathCache(namespacevirtualizationcontext.rawAddress, totalentrynumber.rawAddress)

public actual fun prjCompleteCommand(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, commandid: Int, completionresult: Hresult, extendedparameters: ConstPtr<PrjCompleteCommandExtendedParameters>): Hresult =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssysWindowsWin32StorageProjectedfilesystemPrjCompleteCommand(namespacevirtualizationcontext.rawAddress, commandid, completionresult, extendedparameters.rawAddress)

public actual fun prjDeleteFile(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, updateflags: PrjUpdateTypes, failurereason: MutPtr<PrjUpdateFailureCauses>): Hresult =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssysWindowsWin32StorageProjectedfilesystemPrjDeleteFile(namespacevirtualizationcontext.rawAddress, destinationfilename.rawAddress, updateflags, failurereason.rawAddress)

public actual fun prjDoesNameContainWildCards(filename: Pcwstr): Boolean =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssysWindowsWin32StorageProjectedfilesystemPrjDoesNameContainWildCards(filename.rawAddress)

public actual fun prjFileNameCompare(filename1: Pcwstr, filename2: Pcwstr): Int =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssysWindowsWin32StorageProjectedfilesystemPrjFileNameCompare(filename1.rawAddress, filename2.rawAddress)

public actual fun prjFileNameMatch(filenametocheck: Pcwstr, pattern: Pcwstr): Boolean =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssysWindowsWin32StorageProjectedfilesystemPrjFileNameMatch(filenametocheck.rawAddress, pattern.rawAddress)

public actual fun prjFillDirEntryBuffer(filename: Pcwstr, filebasicinfo: ConstPtr<PrjFileBasicInfo>, direntrybufferhandle: PrjDirEntryBufferHandle): Hresult =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssysWindowsWin32StorageProjectedfilesystemPrjFillDirEntryBuffer(filename.rawAddress, filebasicinfo.rawAddress, direntrybufferhandle.rawAddress)

public actual fun prjFillDirEntryBuffer2(direntrybufferhandle: PrjDirEntryBufferHandle, filename: Pcwstr, filebasicinfo: ConstPtr<PrjFileBasicInfo>, extendedinfo: ConstPtr<PrjExtendedInfo>): Hresult =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssysWindowsWin32StorageProjectedfilesystemPrjFillDirEntryBuffer2(direntrybufferhandle.rawAddress, filename.rawAddress, filebasicinfo.rawAddress, extendedinfo.rawAddress)

public actual fun prjFreeAlignedBuffer(buffer: ConstPtr<CVoid>) {
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssysWindowsWin32StorageProjectedfilesystemPrjFreeAlignedBuffer(buffer.rawAddress)
}

public actual fun prjGetOnDiskFileState(destinationfilename: Pcwstr, filestate: MutPtr<PrjFileState>): Hresult =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssysWindowsWin32StorageProjectedfilesystemPrjGetOnDiskFileState(destinationfilename.rawAddress, filestate.rawAddress)

public actual fun prjGetVirtualizationInstanceInfo(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, virtualizationinstanceinfo: MutPtr<PrjVirtualizationInstanceInfo>): Hresult =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssysWindowsWin32StorageProjectedfilesystemPrjGetVirtualizationInstanceInfo(namespacevirtualizationcontext.rawAddress, virtualizationinstanceinfo.rawAddress)

public actual fun prjMarkDirectoryAsPlaceholder(rootpathname: Pcwstr, targetpathname: Pcwstr, versioninfo: ConstPtr<PrjPlaceholderVersionInfo>, virtualizationinstanceid: ConstPtr<Guid>): Hresult =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssysWindowsWin32StorageProjectedfilesystemPrjMarkDirectoryAsPlaceholder(rootpathname.rawAddress, targetpathname.rawAddress, versioninfo.rawAddress, virtualizationinstanceid.rawAddress)

public actual fun prjStartVirtualizing(virtualizationrootpath: Pcwstr, callbacks: ConstPtr<PrjCallbacks>, instancecontext: ConstPtr<CVoid>, options: ConstPtr<PrjStartvirtualizingOptions>, namespacevirtualizationcontext: MutPtr<PrjNamespaceVirtualizationContext>): Hresult =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssysWindowsWin32StorageProjectedfilesystemPrjStartVirtualizing(virtualizationrootpath.rawAddress, callbacks.rawAddress, instancecontext.rawAddress, options.rawAddress, namespacevirtualizationcontext.rawAddress)

public actual fun prjStopVirtualizing(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext) {
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssysWindowsWin32StorageProjectedfilesystemPrjStopVirtualizing(namespacevirtualizationcontext.rawAddress)
}

public actual fun prjUpdateFileIfNeeded(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, placeholderinfo: ConstPtr<PrjPlaceholderInfo>, placeholderinfosize: UInt, updateflags: PrjUpdateTypes, failurereason: MutPtr<PrjUpdateFailureCauses>): Hresult =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssysWindowsWin32StorageProjectedfilesystemPrjUpdateFileIfNeeded(namespacevirtualizationcontext.rawAddress, destinationfilename.rawAddress, placeholderinfo.rawAddress, placeholderinfosize.toInt(), updateflags, failurereason.rawAddress)

public actual fun prjWriteFileData(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, datastreamid: ConstPtr<Guid>, buffer: ConstPtr<CVoid>, byteoffset: ULong, length: UInt): Hresult =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssysWindowsWin32StorageProjectedfilesystemPrjWriteFileData(namespacevirtualizationcontext.rawAddress, datastreamid.rawAddress, buffer.rawAddress, byteoffset.toLong(), length.toInt())

public actual fun prjWritePlaceholderInfo(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, placeholderinfo: ConstPtr<PrjPlaceholderInfo>, placeholderinfosize: UInt): Hresult =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssysWindowsWin32StorageProjectedfilesystemPrjWritePlaceholderInfo(namespacevirtualizationcontext.rawAddress, destinationfilename.rawAddress, placeholderinfo.rawAddress, placeholderinfosize.toInt())

public actual fun prjWritePlaceholderInfo2(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, placeholderinfo: ConstPtr<PrjPlaceholderInfo>, placeholderinfosize: UInt, extendedinfo: ConstPtr<PrjExtendedInfo>): Hresult =
    WindowsWin32StorageProjectedfilesystemJniBridge.windowssysWindowsWin32StorageProjectedfilesystemPrjWritePlaceholderInfo2(namespacevirtualizationcontext.rawAddress, destinationfilename.rawAddress, placeholderinfo.rawAddress, placeholderinfosize.toInt(), extendedinfo.rawAddress)
