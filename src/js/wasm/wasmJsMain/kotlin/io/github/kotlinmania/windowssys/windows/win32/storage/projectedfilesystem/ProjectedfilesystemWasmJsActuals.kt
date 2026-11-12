@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32StorageProjectedfilesystemNapiAddon(): Boolean

private val windowsWin32StorageProjectedfilesystemNapiAvailable: Boolean = initWindowsWin32StorageProjectedfilesystemNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageProjectedfilesystemPrjAllocateAlignedBuffer(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjAllocateAlignedBuffer(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageProjectedfilesystemPrjClearNegativePathCache(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjClearNegativePathCache(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageProjectedfilesystemPrjCompleteCommand(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjCompleteCommand(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageProjectedfilesystemPrjDeleteFile(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjDeleteFile(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageProjectedfilesystemPrjDoesNameContainWildCards(p0)")
private external fun wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjDoesNameContainWildCards(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageProjectedfilesystemPrjFileNameCompare(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjFileNameCompare(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageProjectedfilesystemPrjFileNameMatch(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjFileNameMatch(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageProjectedfilesystemPrjFillDirEntryBuffer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjFillDirEntryBuffer(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageProjectedfilesystemPrjFillDirEntryBuffer2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjFillDirEntryBuffer2(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageProjectedfilesystemPrjFreeAlignedBuffer(p0)")
private external fun wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjFreeAlignedBuffer(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageProjectedfilesystemPrjGetOnDiskFileState(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjGetOnDiskFileState(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageProjectedfilesystemPrjGetVirtualizationInstanceInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjGetVirtualizationInstanceInfo(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageProjectedfilesystemPrjMarkDirectoryAsPlaceholder(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjMarkDirectoryAsPlaceholder(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageProjectedfilesystemPrjStartVirtualizing(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjStartVirtualizing(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageProjectedfilesystemPrjStopVirtualizing(p0)")
private external fun wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjStopVirtualizing(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageProjectedfilesystemPrjUpdateFileIfNeeded(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjUpdateFileIfNeeded(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageProjectedfilesystemPrjWriteFileData(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjWriteFileData(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageProjectedfilesystemPrjWritePlaceholderInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjWritePlaceholderInfo(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageProjectedfilesystemPrjWritePlaceholderInfo2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjWritePlaceholderInfo2(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

public actual fun prjAllocateAlignedBuffer(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, size: ULong): MutPtr =
    if (windowsWin32StorageProjectedfilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjAllocateAlignedBuffer(namespacevirtualizationcontext.rawAddress.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjClearNegativePathCache(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, totalentrynumber: MutPtr): Hresult =
    if (windowsWin32StorageProjectedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjClearNegativePathCache(namespacevirtualizationcontext.rawAddress.toString(), totalentrynumber.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjCompleteCommand(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, commandid: Int, completionresult: Hresult, extendedparameters: ConstPtr): Hresult =
    if (windowsWin32StorageProjectedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjCompleteCommand(namespacevirtualizationcontext.rawAddress.toString(), commandid, completionresult, extendedparameters.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjDeleteFile(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, updateflags: PrjUpdateTypes, failurereason: MutPtr): Hresult =
    if (windowsWin32StorageProjectedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjDeleteFile(namespacevirtualizationcontext.rawAddress.toString(), destinationfilename.rawAddress.toString(), updateflags, failurereason.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjDoesNameContainWildCards(filename: Pcwstr): Boolean =
    if (windowsWin32StorageProjectedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjDoesNameContainWildCards(filename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjFileNameCompare(filename1: Pcwstr, filename2: Pcwstr): Int =
    if (windowsWin32StorageProjectedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjFileNameCompare(filename1.rawAddress.toString(), filename2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjFileNameMatch(filenametocheck: Pcwstr, pattern: Pcwstr): Boolean =
    if (windowsWin32StorageProjectedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjFileNameMatch(filenametocheck.rawAddress.toString(), pattern.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjFillDirEntryBuffer(filename: Pcwstr, filebasicinfo: ConstPtr, direntrybufferhandle: PrjDirEntryBufferHandle): Hresult =
    if (windowsWin32StorageProjectedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjFillDirEntryBuffer(filename.rawAddress.toString(), filebasicinfo.rawAddress.toString(), direntrybufferhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjFillDirEntryBuffer2(direntrybufferhandle: PrjDirEntryBufferHandle, filename: Pcwstr, filebasicinfo: ConstPtr, extendedinfo: ConstPtr): Hresult =
    if (windowsWin32StorageProjectedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjFillDirEntryBuffer2(direntrybufferhandle.rawAddress.toString(), filename.rawAddress.toString(), filebasicinfo.rawAddress.toString(), extendedinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjFreeAlignedBuffer(buffer: ConstPtr) {
    if (windowsWin32StorageProjectedfilesystemNapiAvailable) {
        wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjFreeAlignedBuffer(buffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun prjGetOnDiskFileState(destinationfilename: Pcwstr, filestate: MutPtr): Hresult =
    if (windowsWin32StorageProjectedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjGetOnDiskFileState(destinationfilename.rawAddress.toString(), filestate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjGetVirtualizationInstanceInfo(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, virtualizationinstanceinfo: MutPtr): Hresult =
    if (windowsWin32StorageProjectedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjGetVirtualizationInstanceInfo(namespacevirtualizationcontext.rawAddress.toString(), virtualizationinstanceinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjMarkDirectoryAsPlaceholder(rootpathname: Pcwstr, targetpathname: Pcwstr, versioninfo: ConstPtr, virtualizationinstanceid: ConstPtr): Hresult =
    if (windowsWin32StorageProjectedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjMarkDirectoryAsPlaceholder(rootpathname.rawAddress.toString(), targetpathname.rawAddress.toString(), versioninfo.rawAddress.toString(), virtualizationinstanceid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjStartVirtualizing(virtualizationrootpath: Pcwstr, callbacks: ConstPtr, instancecontext: ConstPtr, options: ConstPtr, namespacevirtualizationcontext: MutPtr): Hresult =
    if (windowsWin32StorageProjectedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjStartVirtualizing(virtualizationrootpath.rawAddress.toString(), callbacks.rawAddress.toString(), instancecontext.rawAddress.toString(), options.rawAddress.toString(), namespacevirtualizationcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjStopVirtualizing(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext) {
    if (windowsWin32StorageProjectedfilesystemNapiAvailable) {
        wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjStopVirtualizing(namespacevirtualizationcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun prjUpdateFileIfNeeded(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, placeholderinfo: ConstPtr, placeholderinfosize: UInt, updateflags: PrjUpdateTypes, failurereason: MutPtr): Hresult =
    if (windowsWin32StorageProjectedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjUpdateFileIfNeeded(namespacevirtualizationcontext.rawAddress.toString(), destinationfilename.rawAddress.toString(), placeholderinfo.rawAddress.toString(), placeholderinfosize.toInt(), updateflags, failurereason.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjWriteFileData(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, datastreamid: ConstPtr, buffer: ConstPtr, byteoffset: ULong, length: UInt): Hresult =
    if (windowsWin32StorageProjectedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjWriteFileData(namespacevirtualizationcontext.rawAddress.toString(), datastreamid.rawAddress.toString(), buffer.rawAddress.toString(), byteoffset.toString(), length.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjWritePlaceholderInfo(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, placeholderinfo: ConstPtr, placeholderinfosize: UInt): Hresult =
    if (windowsWin32StorageProjectedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjWritePlaceholderInfo(namespacevirtualizationcontext.rawAddress.toString(), destinationfilename.rawAddress.toString(), placeholderinfo.rawAddress.toString(), placeholderinfosize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjWritePlaceholderInfo2(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, placeholderinfo: ConstPtr, placeholderinfosize: UInt, extendedinfo: ConstPtr): Hresult =
    if (windowsWin32StorageProjectedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageProjectedfilesystemPrjWritePlaceholderInfo2(namespacevirtualizationcontext.rawAddress.toString(), destinationfilename.rawAddress.toString(), placeholderinfo.rawAddress.toString(), placeholderinfosize.toInt(), extendedinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
