@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private val _windowsWin32StorageProjectedfilesystemNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun prjAllocateAlignedBuffer(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, size: ULong): COpaquePointer? =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_prjAllocateAlignedBuffer((namespacevirtualizationcontext?.value ?: 0L).toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjClearNegativePathCache(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, totalentrynumber: COpaquePointer?): Hresult =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_prjClearNegativePathCache((namespacevirtualizationcontext?.value ?: 0L).toString(), (totalentrynumber?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjCompleteCommand(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, commandid: Int, completionresult: Hresult, extendedparameters: COpaquePointer?): Hresult =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_prjCompleteCommand((namespacevirtualizationcontext?.value ?: 0L).toString(), commandid, completionresult, (extendedparameters?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjDeleteFile(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, updateflags: PrjUpdateTypes, failurereason: COpaquePointer?): Hresult =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_prjDeleteFile((namespacevirtualizationcontext?.value ?: 0L).toString(), (destinationfilename?.value ?: 0L).toString(), updateflags, (failurereason?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjDoesNameContainWildCards(filename: Pcwstr): Boolean =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_prjDoesNameContainWildCards((filename?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjFileNameCompare(filename1: Pcwstr, filename2: Pcwstr): Int =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_prjFileNameCompare((filename1?.value ?: 0L).toString(), (filename2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjFileNameMatch(filenametocheck: Pcwstr, pattern: Pcwstr): Boolean =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_prjFileNameMatch((filenametocheck?.value ?: 0L).toString(), (pattern?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjFillDirEntryBuffer(filename: Pcwstr, filebasicinfo: COpaquePointer?, direntrybufferhandle: PrjDirEntryBufferHandle): Hresult =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_prjFillDirEntryBuffer((filename?.value ?: 0L).toString(), (filebasicinfo?.value ?: 0L).toString(), (direntrybufferhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjFillDirEntryBuffer2(direntrybufferhandle: PrjDirEntryBufferHandle, filename: Pcwstr, filebasicinfo: COpaquePointer?, extendedinfo: COpaquePointer?): Hresult =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_prjFillDirEntryBuffer2((direntrybufferhandle?.value ?: 0L).toString(), (filename?.value ?: 0L).toString(), (filebasicinfo?.value ?: 0L).toString(), (extendedinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjFreeAlignedBuffer(buffer: COpaquePointer?) {
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) {
        _windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_prjFreeAlignedBuffer((buffer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun prjGetOnDiskFileState(destinationfilename: Pcwstr, filestate: COpaquePointer?): Hresult =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_prjGetOnDiskFileState((destinationfilename?.value ?: 0L).toString(), (filestate?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjGetVirtualizationInstanceInfo(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, virtualizationinstanceinfo: COpaquePointer?): Hresult =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_prjGetVirtualizationInstanceInfo((namespacevirtualizationcontext?.value ?: 0L).toString(), (virtualizationinstanceinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjMarkDirectoryAsPlaceholder(rootpathname: Pcwstr, targetpathname: Pcwstr, versioninfo: COpaquePointer?, virtualizationinstanceid: COpaquePointer?): Hresult =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_prjMarkDirectoryAsPlaceholder((rootpathname?.value ?: 0L).toString(), (targetpathname?.value ?: 0L).toString(), (versioninfo?.value ?: 0L).toString(), (virtualizationinstanceid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjStartVirtualizing(virtualizationrootpath: Pcwstr, callbacks: COpaquePointer?, instancecontext: COpaquePointer?, options: COpaquePointer?, namespacevirtualizationcontext: COpaquePointer?): Hresult =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_prjStartVirtualizing((virtualizationrootpath?.value ?: 0L).toString(), (callbacks?.value ?: 0L).toString(), (instancecontext?.value ?: 0L).toString(), (options?.value ?: 0L).toString(), (namespacevirtualizationcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjStopVirtualizing(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext) {
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) {
        _windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_prjStopVirtualizing((namespacevirtualizationcontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun prjUpdateFileIfNeeded(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, placeholderinfo: COpaquePointer?, placeholderinfosize: UInt, updateflags: PrjUpdateTypes, failurereason: COpaquePointer?): Hresult =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_prjUpdateFileIfNeeded((namespacevirtualizationcontext?.value ?: 0L).toString(), (destinationfilename?.value ?: 0L).toString(), (placeholderinfo?.value ?: 0L).toString(), placeholderinfosize.toInt(), updateflags, (failurereason?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjWriteFileData(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, datastreamid: COpaquePointer?, buffer: COpaquePointer?, byteoffset: ULong, length: UInt): Hresult =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_prjWriteFileData((namespacevirtualizationcontext?.value ?: 0L).toString(), (datastreamid?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), byteoffset.toString(), length.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjWritePlaceholderInfo(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, placeholderinfo: COpaquePointer?, placeholderinfosize: UInt): Hresult =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_prjWritePlaceholderInfo((namespacevirtualizationcontext?.value ?: 0L).toString(), (destinationfilename?.value ?: 0L).toString(), (placeholderinfo?.value ?: 0L).toString(), placeholderinfosize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prjWritePlaceholderInfo2(namespacevirtualizationcontext: PrjNamespaceVirtualizationContext, destinationfilename: Pcwstr, placeholderinfo: COpaquePointer?, placeholderinfosize: UInt, extendedinfo: COpaquePointer?): Hresult =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_prjWritePlaceholderInfo2((namespacevirtualizationcontext?.value ?: 0L).toString(), (destinationfilename?.value ?: 0L).toString(), (placeholderinfo?.value ?: 0L).toString(), placeholderinfosize.toInt(), (extendedinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
