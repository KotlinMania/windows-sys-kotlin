package io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun prjAllocateAlignedBuffer(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, size: ULong): MutPtr<CVoid>

public expect fun prjClearNegativePathCache(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, totalentrynumber: MutPtr<UInt>): Hresult

public expect fun prjCompleteCommand(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, commandid: Int, completionresult: Hresult, extendedparameters: ConstPtr<PrjCompleteCommandExtendedParameters>): Hresult

public expect fun prjDeleteFile(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, updateflags: PrjUpdateTypes, failurereason: MutPtr<PrjUpdateFailureCauses>): Hresult

public expect fun prjDoesNameContainWildCards(filename: Pcwstr): Boolean

public expect fun prjFileNameCompare(filename1: Pcwstr, filename2: Pcwstr): Int

public expect fun prjFileNameMatch(filenametocheck: Pcwstr, pattern: Pcwstr): Boolean

public expect fun prjFillDirEntryBuffer(filename: Pcwstr, filebasicinfo: ConstPtr<PrjFileBasicInfo>, direntrybufferhandle: PrjDirEntryBufferHandle): Hresult

public expect fun prjFillDirEntryBuffer2(direntrybufferhandle: PrjDirEntryBufferHandle, filename: Pcwstr, filebasicinfo: ConstPtr<PrjFileBasicInfo>, extendedinfo: ConstPtr<PrjExtendedInfo>): Hresult

public expect fun prjFreeAlignedBuffer(buffer: ConstPtr<CVoid>)

public expect fun prjGetOnDiskFileState(destinationfilename: Pcwstr, filestate: MutPtr<PrjFileState>): Hresult

public expect fun prjGetVirtualizationInstanceInfo(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, virtualizationinstanceinfo: MutPtr<PrjVirtualizationInstanceInfo>): Hresult

public expect fun prjMarkDirectoryAsPlaceholder(rootpathname: Pcwstr, targetpathname: Pcwstr, versioninfo: ConstPtr<PrjPlaceholderVersionInfo>, virtualizationinstanceid: ConstPtr<Guid>): Hresult

public expect fun prjStartVirtualizing(virtualizationrootpath: Pcwstr, callbacks: ConstPtr<PrjCallbacks>, instancecontext: ConstPtr<CVoid>, options: ConstPtr<PrjStartvirtualizingOptions>, namespacevirtualizationcontext: MutPtr<PrjNamespaceVirtualizationContext>): Hresult

public expect fun prjStopVirtualizing(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext)

public expect fun prjUpdateFileIfNeeded(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, placeholderinfo: ConstPtr<PrjPlaceholderInfo>, placeholderinfosize: UInt, updateflags: PrjUpdateTypes, failurereason: MutPtr<PrjUpdateFailureCauses>): Hresult

public expect fun prjWriteFileData(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, datastreamid: ConstPtr<Guid>, buffer: ConstPtr<CVoid>, byteoffset: ULong, length: UInt): Hresult

public expect fun prjWritePlaceholderInfo(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, placeholderinfo: ConstPtr<PrjPlaceholderInfo>, placeholderinfosize: UInt): Hresult

public expect fun prjWritePlaceholderInfo2(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, placeholderinfo: ConstPtr<PrjPlaceholderInfo>, placeholderinfosize: UInt, extendedinfo: ConstPtr<PrjExtendedInfo>): Hresult
