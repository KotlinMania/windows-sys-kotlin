@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public actual fun prjAllocateAlignedBuffer(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun prjClearNegativePathCache(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, totalentrynumber: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun prjCompleteCommand(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, commandid: Int, completionresult: Hresult, extendedparameters: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun prjDeleteFile(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, updateflags: PrjUpdateTypes, failurereason: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun prjDoesNameContainWildCards(filename: Pcwstr): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun prjFileNameCompare(filename1: Pcwstr, filename2: Pcwstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun prjFileNameMatch(filenametocheck: Pcwstr, pattern: Pcwstr): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun prjFillDirEntryBuffer(filename: Pcwstr, filebasicinfo: COpaquePointer?, direntrybufferhandle: PrjDirEntryBufferHandle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun prjFillDirEntryBuffer2(direntrybufferhandle: PrjDirEntryBufferHandle, filename: Pcwstr, filebasicinfo: COpaquePointer?, extendedinfo: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun prjFreeAlignedBuffer(buffer: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun prjGetOnDiskFileState(destinationfilename: Pcwstr, filestate: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun prjGetVirtualizationInstanceInfo(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, virtualizationinstanceinfo: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun prjMarkDirectoryAsPlaceholder(rootpathname: Pcwstr, targetpathname: Pcwstr, versioninfo: COpaquePointer?, virtualizationinstanceid: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun prjStartVirtualizing(virtualizationrootpath: Pcwstr, callbacks: COpaquePointer?, instancecontext: COpaquePointer?, options: COpaquePointer?, namespacevirtualizationcontext: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun prjStopVirtualizing(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun prjUpdateFileIfNeeded(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, placeholderinfo: COpaquePointer?, placeholderinfosize: UInt, updateflags: PrjUpdateTypes, failurereason: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun prjWriteFileData(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, datastreamid: COpaquePointer?, buffer: COpaquePointer?, byteoffset: ULong, length: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun prjWritePlaceholderInfo(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, placeholderinfo: COpaquePointer?, placeholderinfosize: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun prjWritePlaceholderInfo2(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, placeholderinfo: COpaquePointer?, placeholderinfosize: UInt, extendedinfo: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
