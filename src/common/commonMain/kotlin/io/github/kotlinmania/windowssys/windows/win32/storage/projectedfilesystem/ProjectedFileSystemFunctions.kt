package io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun prjAllocateAlignedBuffer(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, size: ULong): MutPtr

public expect fun prjClearNegativePathCache(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, totalentrynumber: MutPtr): Hresult

public expect fun prjCompleteCommand(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, commandid: Int, completionresult: Hresult, extendedparameters: ConstPtr): Hresult

public expect fun prjDeleteFile(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, updateflags: PrjUpdateTypes, failurereason: MutPtr): Hresult

public expect fun prjDoesNameContainWildCards(filename: Pcwstr): Boolean

public expect fun prjFileNameCompare(filename1: Pcwstr, filename2: Pcwstr): Int

public expect fun prjFileNameMatch(filenametocheck: Pcwstr, pattern: Pcwstr): Boolean

public expect fun prjFillDirEntryBuffer(filename: Pcwstr, filebasicinfo: ConstPtr, direntrybufferhandle: PrjDirEntryBufferHandle): Hresult

public expect fun prjFillDirEntryBuffer2(direntrybufferhandle: PrjDirEntryBufferHandle, filename: Pcwstr, filebasicinfo: ConstPtr, extendedinfo: ConstPtr): Hresult

public expect fun prjFreeAlignedBuffer(buffer: ConstPtr)

public expect fun prjGetOnDiskFileState(destinationfilename: Pcwstr, filestate: MutPtr): Hresult

public expect fun prjGetVirtualizationInstanceInfo(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, virtualizationinstanceinfo: MutPtr): Hresult

public expect fun prjMarkDirectoryAsPlaceholder(rootpathname: Pcwstr, targetpathname: Pcwstr, versioninfo: ConstPtr, virtualizationinstanceid: ConstPtr): Hresult

public expect fun prjStartVirtualizing(virtualizationrootpath: Pcwstr, callbacks: ConstPtr, instancecontext: ConstPtr, options: ConstPtr, namespacevirtualizationcontext: MutPtr): Hresult

public expect fun prjStopVirtualizing(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext)

public expect fun prjUpdateFileIfNeeded(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, placeholderinfo: ConstPtr, placeholderinfosize: UInt, updateflags: PrjUpdateTypes, failurereason: MutPtr): Hresult

public expect fun prjWriteFileData(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, datastreamid: ConstPtr, buffer: ConstPtr, byteoffset: ULong, length: UInt): Hresult

public expect fun prjWritePlaceholderInfo(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, placeholderinfo: ConstPtr, placeholderinfosize: UInt): Hresult

public expect fun prjWritePlaceholderInfo2(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, placeholderinfo: ConstPtr, placeholderinfosize: UInt, extendedinfo: ConstPtr): Hresult
