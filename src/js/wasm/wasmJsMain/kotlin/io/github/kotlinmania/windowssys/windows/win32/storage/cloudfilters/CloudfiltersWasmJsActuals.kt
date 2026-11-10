@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileInfoByHandleClass

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32StorageCloudfiltersNapiAddon(): Boolean

private val _windowsWin32StorageCloudfiltersNapiAvailable: Boolean = _initWindowsWin32StorageCloudfiltersNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfCloseHandle(p0)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfCloseHandle(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfConnectSyncRoot(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfConnectSyncRoot(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfConvertToPlaceholder(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfConvertToPlaceholder(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfCreatePlaceholders(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfCreatePlaceholders(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfDehydratePlaceholder(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfDehydratePlaceholder(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfDisconnectSyncRoot(p0)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfDisconnectSyncRoot(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfExecute(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfExecute(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfGetCorrelationVector(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfGetCorrelationVector(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderInfo(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderInfo(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderRangeInfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderRangeInfo(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderRangeInfoForHydration(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderRangeInfoForHydration(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: Int, p8: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderStateFromAttributeTag(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderStateFromAttributeTag(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderStateFromFileInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderStateFromFileInfo(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderStateFromFindData(p0)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderStateFromFindData(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfGetPlatformInfo(p0)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfGetPlatformInfo(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfGetSyncRootInfoByHandle(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfGetSyncRootInfoByHandle(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfGetSyncRootInfoByPath(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfGetSyncRootInfoByPath(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfGetTransferKey(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfGetTransferKey(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfGetWin32HandleFromProtectedHandle(p0)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfGetWin32HandleFromProtectedHandle(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfHydratePlaceholder(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfHydratePlaceholder(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfOpenFileWithOplock(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfOpenFileWithOplock(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfQuerySyncProviderStatus(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfQuerySyncProviderStatus(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfReferenceProtectedHandle(p0)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfReferenceProtectedHandle(p0: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfRegisterSyncRoot(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfRegisterSyncRoot(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfReleaseProtectedHandle(p0)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfReleaseProtectedHandle(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfReleaseTransferKey(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfReleaseTransferKey(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfReportProviderProgress(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfReportProviderProgress(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfReportProviderProgress2(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfReportProviderProgress2(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfReportSyncStatus(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfReportSyncStatus(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfRevertPlaceholder(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfRevertPlaceholder(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfSetCorrelationVector(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfSetCorrelationVector(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfSetInSyncState(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfSetInSyncState(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfSetPinState(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfSetPinState(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfUnregisterSyncRoot(p0)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfUnregisterSyncRoot(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfUpdatePlaceholder(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfUpdatePlaceholder(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_cloudfilters_cfUpdateSyncProviderStatus(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_cloudfilters_cfUpdateSyncProviderStatus(p0: String, p1: Int): Int

public actual fun cfCloseHandle(filehandle: Handle) {
    if (_windowsWin32StorageCloudfiltersNapiAvailable) {
        _wasm_windowssys_windows_win32_storage_cloudfilters_cfCloseHandle((filehandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cfConnectSyncRoot(syncrootpath: Pcwstr, callbacktable: COpaquePointer?, callbackcontext: COpaquePointer?, connectflags: CfConnectFlags, connectionkey: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAvailable) _wasm_windowssys_windows_win32_storage_cloudfilters_cfConnectSyncRoot((syncrootpath?.value ?: 0L).toString(), (callbacktable?.value ?: 0L).toString(), (callbackcontext?.value ?: 0L).toString(), connectflags, (connectionkey?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfConvertToPlaceholder(filehandle: Handle, fileidentity: COpaquePointer?, fileidentitylength: UInt, convertflags: CfConvertFlags, convertusn: COpaquePointer?, overlapped: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAvailable) _wasm_windowssys_windows_win32_storage_cloudfilters_cfConvertToPlaceholder((filehandle?.value ?: 0L).toString(), (fileidentity?.value ?: 0L).toString(), fileidentitylength.toInt(), convertflags, (convertusn?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfCreatePlaceholders(basedirectorypath: Pcwstr, placeholderarray: COpaquePointer?, placeholdercount: UInt, createflags: CfCreateFlags, entriesprocessed: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAvailable) _wasm_windowssys_windows_win32_storage_cloudfilters_cfCreatePlaceholders((basedirectorypath?.value ?: 0L).toString(), (placeholderarray?.value ?: 0L).toString(), placeholdercount.toInt(), createflags, (entriesprocessed?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfDehydratePlaceholder(filehandle: Handle, startingoffset: Long, length: Long, dehydrateflags: CfDehydrateFlags, overlapped: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAvailable) _wasm_windowssys_windows_win32_storage_cloudfilters_cfDehydratePlaceholder((filehandle?.value ?: 0L).toString(), startingoffset.toString(), length.toString(), dehydrateflags, (overlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfDisconnectSyncRoot(connectionkey: CfConnectionKey): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAvailable) _wasm_windowssys_windows_win32_storage_cloudfilters_cfDisconnectSyncRoot(connectionkey.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfExecute(opinfo: COpaquePointer?, opparams: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAvailable) _wasm_windowssys_windows_win32_storage_cloudfilters_cfExecute((opinfo?.value ?: 0L).toString(), (opparams?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetCorrelationVector(filehandle: Handle, correlationvector: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAvailable) _wasm_windowssys_windows_win32_storage_cloudfilters_cfGetCorrelationVector((filehandle?.value ?: 0L).toString(), (correlationvector?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetPlaceholderInfo(filehandle: Handle, infoclass: CfPlaceholderInfoClass, infobuffer: COpaquePointer?, infobufferlength: UInt, returnedlength: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAvailable) _wasm_windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderInfo((filehandle?.value ?: 0L).toString(), infoclass, (infobuffer?.value ?: 0L).toString(), infobufferlength.toInt(), (returnedlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetPlaceholderRangeInfo(filehandle: Handle, infoclass: CfPlaceholderRangeInfoClass, startingoffset: Long, length: Long, infobuffer: COpaquePointer?, infobufferlength: UInt, returnedlength: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAvailable) _wasm_windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderRangeInfo((filehandle?.value ?: 0L).toString(), infoclass, startingoffset.toString(), length.toString(), (infobuffer?.value ?: 0L).toString(), infobufferlength.toInt(), (returnedlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetPlaceholderRangeInfoForHydration(connectionkey: CfConnectionKey, transferkey: Long, fileid: Long, infoclass: CfPlaceholderRangeInfoClass, startingoffset: Long, rangelength: Long, infobuffer: COpaquePointer?, infobuffersize: UInt, infobufferwritten: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAvailable) _wasm_windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderRangeInfoForHydration(connectionkey.toString(), transferkey.toString(), fileid.toString(), infoclass, startingoffset.toString(), rangelength.toString(), (infobuffer?.value ?: 0L).toString(), infobuffersize.toInt(), (infobufferwritten?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetPlaceholderStateFromAttributeTag(fileattributes: UInt, reparsetag: UInt): CfPlaceholderState =
    if (_windowsWin32StorageCloudfiltersNapiAvailable) _wasm_windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderStateFromAttributeTag(fileattributes.toInt(), reparsetag.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetPlaceholderStateFromFileInfo(infobuffer: COpaquePointer?, infoclass: FileInfoByHandleClass): CfPlaceholderState =
    if (_windowsWin32StorageCloudfiltersNapiAvailable) _wasm_windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderStateFromFileInfo((infobuffer?.value ?: 0L).toString(), infoclass).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetPlaceholderStateFromFindData(finddata: COpaquePointer?): CfPlaceholderState =
    if (_windowsWin32StorageCloudfiltersNapiAvailable) _wasm_windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderStateFromFindData((finddata?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetPlatformInfo(platformversion: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAvailable) _wasm_windowssys_windows_win32_storage_cloudfilters_cfGetPlatformInfo((platformversion?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetSyncRootInfoByHandle(filehandle: Handle, infoclass: CfSyncRootInfoClass, infobuffer: COpaquePointer?, infobufferlength: UInt, returnedlength: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAvailable) _wasm_windowssys_windows_win32_storage_cloudfilters_cfGetSyncRootInfoByHandle((filehandle?.value ?: 0L).toString(), infoclass, (infobuffer?.value ?: 0L).toString(), infobufferlength.toInt(), (returnedlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetSyncRootInfoByPath(filepath: Pcwstr, infoclass: CfSyncRootInfoClass, infobuffer: COpaquePointer?, infobufferlength: UInt, returnedlength: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAvailable) _wasm_windowssys_windows_win32_storage_cloudfilters_cfGetSyncRootInfoByPath((filepath?.value ?: 0L).toString(), infoclass, (infobuffer?.value ?: 0L).toString(), infobufferlength.toInt(), (returnedlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetTransferKey(filehandle: Handle, transferkey: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAvailable) _wasm_windowssys_windows_win32_storage_cloudfilters_cfGetTransferKey((filehandle?.value ?: 0L).toString(), (transferkey?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetWin32HandleFromProtectedHandle(protectedhandle: Handle): Handle =
    if (_windowsWin32StorageCloudfiltersNapiAvailable) _wasm_windowssys_windows_win32_storage_cloudfilters_cfGetWin32HandleFromProtectedHandle((protectedhandle?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfHydratePlaceholder(filehandle: Handle, startingoffset: Long, length: Long, hydrateflags: CfHydrateFlags, overlapped: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAvailable) _wasm_windowssys_windows_win32_storage_cloudfilters_cfHydratePlaceholder((filehandle?.value ?: 0L).toString(), startingoffset.toString(), length.toString(), hydrateflags, (overlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfOpenFileWithOplock(filepath: Pcwstr, flags: CfOpenFileFlags, protectedhandle: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAvailable) _wasm_windowssys_windows_win32_storage_cloudfilters_cfOpenFileWithOplock((filepath?.value ?: 0L).toString(), flags, (protectedhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfQuerySyncProviderStatus(connectionkey: CfConnectionKey, providerstatus: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAvailable) _wasm_windowssys_windows_win32_storage_cloudfilters_cfQuerySyncProviderStatus(connectionkey.toString(), (providerstatus?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfReferenceProtectedHandle(protectedhandle: Handle): Boolean =
    if (_windowsWin32StorageCloudfiltersNapiAvailable) _wasm_windowssys_windows_win32_storage_cloudfilters_cfReferenceProtectedHandle((protectedhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfRegisterSyncRoot(syncrootpath: Pcwstr, registration: COpaquePointer?, policies: COpaquePointer?, registerflags: CfRegisterFlags): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAvailable) _wasm_windowssys_windows_win32_storage_cloudfilters_cfRegisterSyncRoot((syncrootpath?.value ?: 0L).toString(), (registration?.value ?: 0L).toString(), (policies?.value ?: 0L).toString(), registerflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfReleaseProtectedHandle(protectedhandle: Handle) {
    if (_windowsWin32StorageCloudfiltersNapiAvailable) {
        _wasm_windowssys_windows_win32_storage_cloudfilters_cfReleaseProtectedHandle((protectedhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cfReleaseTransferKey(filehandle: Handle, transferkey: COpaquePointer?) {
    if (_windowsWin32StorageCloudfiltersNapiAvailable) {
        _wasm_windowssys_windows_win32_storage_cloudfilters_cfReleaseTransferKey((filehandle?.value ?: 0L).toString(), (transferkey?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cfReportProviderProgress(connectionkey: CfConnectionKey, transferkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAvailable) _wasm_windowssys_windows_win32_storage_cloudfilters_cfReportProviderProgress(connectionkey.toString(), transferkey.toString(), providerprogresstotal.toString(), providerprogresscompleted.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfReportProviderProgress2(connectionkey: CfConnectionKey, transferkey: Long, requestkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long, targetsessionid: UInt): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAvailable) _wasm_windowssys_windows_win32_storage_cloudfilters_cfReportProviderProgress2(connectionkey.toString(), transferkey.toString(), requestkey.toString(), providerprogresstotal.toString(), providerprogresscompleted.toString(), targetsessionid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfReportSyncStatus(syncrootpath: Pcwstr, syncstatus: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAvailable) _wasm_windowssys_windows_win32_storage_cloudfilters_cfReportSyncStatus((syncrootpath?.value ?: 0L).toString(), (syncstatus?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfRevertPlaceholder(filehandle: Handle, revertflags: CfRevertFlags, overlapped: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAvailable) _wasm_windowssys_windows_win32_storage_cloudfilters_cfRevertPlaceholder((filehandle?.value ?: 0L).toString(), revertflags, (overlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfSetCorrelationVector(filehandle: Handle, correlationvector: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAvailable) _wasm_windowssys_windows_win32_storage_cloudfilters_cfSetCorrelationVector((filehandle?.value ?: 0L).toString(), (correlationvector?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfSetInSyncState(filehandle: Handle, insyncstate: CfInSyncState, insyncflags: CfSetInSyncFlags, insyncusn: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAvailable) _wasm_windowssys_windows_win32_storage_cloudfilters_cfSetInSyncState((filehandle?.value ?: 0L).toString(), insyncstate, insyncflags, (insyncusn?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfSetPinState(filehandle: Handle, pinstate: CfPinState, pinflags: CfSetPinFlags, overlapped: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAvailable) _wasm_windowssys_windows_win32_storage_cloudfilters_cfSetPinState((filehandle?.value ?: 0L).toString(), pinstate, pinflags, (overlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfUnregisterSyncRoot(syncrootpath: Pcwstr): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAvailable) _wasm_windowssys_windows_win32_storage_cloudfilters_cfUnregisterSyncRoot((syncrootpath?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfUpdatePlaceholder(filehandle: Handle, fsmetadata: COpaquePointer?, fileidentity: COpaquePointer?, fileidentitylength: UInt, dehydraterangearray: COpaquePointer?, dehydraterangecount: UInt, updateflags: CfUpdateFlags, updateusn: COpaquePointer?, overlapped: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAvailable) _wasm_windowssys_windows_win32_storage_cloudfilters_cfUpdatePlaceholder((filehandle?.value ?: 0L).toString(), (fsmetadata?.value ?: 0L).toString(), (fileidentity?.value ?: 0L).toString(), fileidentitylength.toInt(), (dehydraterangearray?.value ?: 0L).toString(), dehydraterangecount.toInt(), updateflags, (updateusn?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfUpdateSyncProviderStatus(connectionkey: CfConnectionKey, providerstatus: CfSyncProviderStatus): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAvailable) _wasm_windowssys_windows_win32_storage_cloudfilters_cfUpdateSyncProviderStatus(connectionkey.toString(), providerstatus.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")
