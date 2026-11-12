@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private val windowsWin32StorageProjectedfilesystemNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun prjAllocateAlignedBuffer(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, size: ULong): MutPtr =
    if (windowsWin32StorageProjectedfilesystemNapiAddon != null) MutPtr((windowsWin32StorageProjectedfilesystemNapiAddon.windowssysWindowsWin32StorageProjectedfilesystemPrjAllocateAlignedBuffer(namespacevirtualizationcontext.rawAddress.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjClearNegativePathCache(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, totalentrynumber: MutPtr): Hresult =
    if (windowsWin32StorageProjectedfilesystemNapiAddon != null) (windowsWin32StorageProjectedfilesystemNapiAddon.windowssysWindowsWin32StorageProjectedfilesystemPrjClearNegativePathCache(namespacevirtualizationcontext.rawAddress.toString(), totalentrynumber.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjCompleteCommand(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, commandid: Int, completionresult: Hresult, extendedparameters: ConstPtr): Hresult =
    if (windowsWin32StorageProjectedfilesystemNapiAddon != null) (windowsWin32StorageProjectedfilesystemNapiAddon.windowssysWindowsWin32StorageProjectedfilesystemPrjCompleteCommand(namespacevirtualizationcontext.rawAddress.toString(), commandid, completionresult, extendedparameters.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjDeleteFile(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, updateflags: PrjUpdateTypes, failurereason: MutPtr): Hresult =
    if (windowsWin32StorageProjectedfilesystemNapiAddon != null) (windowsWin32StorageProjectedfilesystemNapiAddon.windowssysWindowsWin32StorageProjectedfilesystemPrjDeleteFile(namespacevirtualizationcontext.rawAddress.toString(), destinationfilename.rawAddress.toString(), updateflags, failurereason.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjDoesNameContainWildCards(filename: Pcwstr): Boolean =
    if (windowsWin32StorageProjectedfilesystemNapiAddon != null) (windowsWin32StorageProjectedfilesystemNapiAddon.windowssysWindowsWin32StorageProjectedfilesystemPrjDoesNameContainWildCards(filename.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjFileNameCompare(filename1: Pcwstr, filename2: Pcwstr): Int =
    if (windowsWin32StorageProjectedfilesystemNapiAddon != null) (windowsWin32StorageProjectedfilesystemNapiAddon.windowssysWindowsWin32StorageProjectedfilesystemPrjFileNameCompare(filename1.rawAddress.toString(), filename2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjFileNameMatch(filenametocheck: Pcwstr, pattern: Pcwstr): Boolean =
    if (windowsWin32StorageProjectedfilesystemNapiAddon != null) (windowsWin32StorageProjectedfilesystemNapiAddon.windowssysWindowsWin32StorageProjectedfilesystemPrjFileNameMatch(filenametocheck.rawAddress.toString(), pattern.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjFillDirEntryBuffer(filename: Pcwstr, filebasicinfo: ConstPtr, direntrybufferhandle: PrjDirEntryBufferHandle): Hresult =
    if (windowsWin32StorageProjectedfilesystemNapiAddon != null) (windowsWin32StorageProjectedfilesystemNapiAddon.windowssysWindowsWin32StorageProjectedfilesystemPrjFillDirEntryBuffer(filename.rawAddress.toString(), filebasicinfo.rawAddress.toString(), direntrybufferhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjFillDirEntryBuffer2(direntrybufferhandle: PrjDirEntryBufferHandle, filename: Pcwstr, filebasicinfo: ConstPtr, extendedinfo: ConstPtr): Hresult =
    if (windowsWin32StorageProjectedfilesystemNapiAddon != null) (windowsWin32StorageProjectedfilesystemNapiAddon.windowssysWindowsWin32StorageProjectedfilesystemPrjFillDirEntryBuffer2(direntrybufferhandle.rawAddress.toString(), filename.rawAddress.toString(), filebasicinfo.rawAddress.toString(), extendedinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjFreeAlignedBuffer(buffer: ConstPtr) {
    if (windowsWin32StorageProjectedfilesystemNapiAddon != null) {
        windowsWin32StorageProjectedfilesystemNapiAddon.windowssysWindowsWin32StorageProjectedfilesystemPrjFreeAlignedBuffer(buffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun prjGetOnDiskFileState(destinationfilename: Pcwstr, filestate: MutPtr): Hresult =
    if (windowsWin32StorageProjectedfilesystemNapiAddon != null) (windowsWin32StorageProjectedfilesystemNapiAddon.windowssysWindowsWin32StorageProjectedfilesystemPrjGetOnDiskFileState(destinationfilename.rawAddress.toString(), filestate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjGetVirtualizationInstanceInfo(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, virtualizationinstanceinfo: MutPtr): Hresult =
    if (windowsWin32StorageProjectedfilesystemNapiAddon != null) (windowsWin32StorageProjectedfilesystemNapiAddon.windowssysWindowsWin32StorageProjectedfilesystemPrjGetVirtualizationInstanceInfo(namespacevirtualizationcontext.rawAddress.toString(), virtualizationinstanceinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjMarkDirectoryAsPlaceholder(rootpathname: Pcwstr, targetpathname: Pcwstr, versioninfo: ConstPtr, virtualizationinstanceid: ConstPtr): Hresult =
    if (windowsWin32StorageProjectedfilesystemNapiAddon != null) (windowsWin32StorageProjectedfilesystemNapiAddon.windowssysWindowsWin32StorageProjectedfilesystemPrjMarkDirectoryAsPlaceholder(rootpathname.rawAddress.toString(), targetpathname.rawAddress.toString(), versioninfo.rawAddress.toString(), virtualizationinstanceid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjStartVirtualizing(virtualizationrootpath: Pcwstr, callbacks: ConstPtr, instancecontext: ConstPtr, options: ConstPtr, namespacevirtualizationcontext: MutPtr): Hresult =
    if (windowsWin32StorageProjectedfilesystemNapiAddon != null) (windowsWin32StorageProjectedfilesystemNapiAddon.windowssysWindowsWin32StorageProjectedfilesystemPrjStartVirtualizing(virtualizationrootpath.rawAddress.toString(), callbacks.rawAddress.toString(), instancecontext.rawAddress.toString(), options.rawAddress.toString(), namespacevirtualizationcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjStopVirtualizing(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext) {
    if (windowsWin32StorageProjectedfilesystemNapiAddon != null) {
        windowsWin32StorageProjectedfilesystemNapiAddon.windowssysWindowsWin32StorageProjectedfilesystemPrjStopVirtualizing(namespacevirtualizationcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun prjUpdateFileIfNeeded(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, placeholderinfo: ConstPtr, placeholderinfosize: UInt, updateflags: PrjUpdateTypes, failurereason: MutPtr): Hresult =
    if (windowsWin32StorageProjectedfilesystemNapiAddon != null) (windowsWin32StorageProjectedfilesystemNapiAddon.windowssysWindowsWin32StorageProjectedfilesystemPrjUpdateFileIfNeeded(namespacevirtualizationcontext.rawAddress.toString(), destinationfilename.rawAddress.toString(), placeholderinfo.rawAddress.toString(), placeholderinfosize.toInt(), updateflags, failurereason.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjWriteFileData(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, datastreamid: ConstPtr, buffer: ConstPtr, byteoffset: ULong, length: UInt): Hresult =
    if (windowsWin32StorageProjectedfilesystemNapiAddon != null) (windowsWin32StorageProjectedfilesystemNapiAddon.windowssysWindowsWin32StorageProjectedfilesystemPrjWriteFileData(namespacevirtualizationcontext.rawAddress.toString(), datastreamid.rawAddress.toString(), buffer.rawAddress.toString(), byteoffset.toString(), length.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjWritePlaceholderInfo(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, placeholderinfo: ConstPtr, placeholderinfosize: UInt): Hresult =
    if (windowsWin32StorageProjectedfilesystemNapiAddon != null) (windowsWin32StorageProjectedfilesystemNapiAddon.windowssysWindowsWin32StorageProjectedfilesystemPrjWritePlaceholderInfo(namespacevirtualizationcontext.rawAddress.toString(), destinationfilename.rawAddress.toString(), placeholderinfo.rawAddress.toString(), placeholderinfosize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjWritePlaceholderInfo2(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, placeholderinfo: ConstPtr, placeholderinfosize: UInt, extendedinfo: ConstPtr): Hresult =
    if (windowsWin32StorageProjectedfilesystemNapiAddon != null) (windowsWin32StorageProjectedfilesystemNapiAddon.windowssysWindowsWin32StorageProjectedfilesystemPrjWritePlaceholderInfo2(namespacevirtualizationcontext.rawAddress.toString(), destinationfilename.rawAddress.toString(), placeholderinfo.rawAddress.toString(), placeholderinfosize.toInt(), extendedinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
