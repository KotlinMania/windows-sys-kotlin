@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileInfoByHandleClass

private val _windowsWin32StorageCloudfiltersNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun cfCloseHandle(filehandle: Handle) {
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) {
        _windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfCloseHandle((filehandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cfConnectSyncRoot(syncrootpath: Pcwstr, callbacktable: COpaquePointer?, callbackcontext: COpaquePointer?, connectflags: CfConnectFlags, connectionkey: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfConnectSyncRoot((syncrootpath?.value ?: 0L).toString(), (callbacktable?.value ?: 0L).toString(), (callbackcontext?.value ?: 0L).toString(), connectflags, (connectionkey?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfConvertToPlaceholder(filehandle: Handle, fileidentity: COpaquePointer?, fileidentitylength: UInt, convertflags: CfConvertFlags, convertusn: COpaquePointer?, overlapped: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfConvertToPlaceholder((filehandle?.value ?: 0L).toString(), (fileidentity?.value ?: 0L).toString(), fileidentitylength.toInt(), convertflags, (convertusn?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfCreatePlaceholders(basedirectorypath: Pcwstr, placeholderarray: COpaquePointer?, placeholdercount: UInt, createflags: CfCreateFlags, entriesprocessed: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfCreatePlaceholders((basedirectorypath?.value ?: 0L).toString(), (placeholderarray?.value ?: 0L).toString(), placeholdercount.toInt(), createflags, (entriesprocessed?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfDehydratePlaceholder(filehandle: Handle, startingoffset: Long, length: Long, dehydrateflags: CfDehydrateFlags, overlapped: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfDehydratePlaceholder((filehandle?.value ?: 0L).toString(), startingoffset.toString(), length.toString(), dehydrateflags, (overlapped?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfDisconnectSyncRoot(connectionkey: CfConnectionKey): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfDisconnectSyncRoot(connectionkey.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfExecute(opinfo: COpaquePointer?, opparams: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfExecute((opinfo?.value ?: 0L).toString(), (opparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetCorrelationVector(filehandle: Handle, correlationvector: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfGetCorrelationVector((filehandle?.value ?: 0L).toString(), (correlationvector?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetPlaceholderInfo(filehandle: Handle, infoclass: CfPlaceholderInfoClass, infobuffer: COpaquePointer?, infobufferlength: UInt, returnedlength: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderInfo((filehandle?.value ?: 0L).toString(), infoclass, (infobuffer?.value ?: 0L).toString(), infobufferlength.toInt(), (returnedlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetPlaceholderRangeInfo(filehandle: Handle, infoclass: CfPlaceholderRangeInfoClass, startingoffset: Long, length: Long, infobuffer: COpaquePointer?, infobufferlength: UInt, returnedlength: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderRangeInfo((filehandle?.value ?: 0L).toString(), infoclass, startingoffset.toString(), length.toString(), (infobuffer?.value ?: 0L).toString(), infobufferlength.toInt(), (returnedlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetPlaceholderRangeInfoForHydration(connectionkey: CfConnectionKey, transferkey: Long, fileid: Long, infoclass: CfPlaceholderRangeInfoClass, startingoffset: Long, rangelength: Long, infobuffer: COpaquePointer?, infobuffersize: UInt, infobufferwritten: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderRangeInfoForHydration(connectionkey.toString(), transferkey.toString(), fileid.toString(), infoclass, startingoffset.toString(), rangelength.toString(), (infobuffer?.value ?: 0L).toString(), infobuffersize.toInt(), (infobufferwritten?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetPlaceholderStateFromAttributeTag(fileattributes: UInt, reparsetag: UInt): CfPlaceholderState =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderStateFromAttributeTag(fileattributes.toInt(), reparsetag.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetPlaceholderStateFromFileInfo(infobuffer: COpaquePointer?, infoclass: FileInfoByHandleClass): CfPlaceholderState =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderStateFromFileInfo((infobuffer?.value ?: 0L).toString(), infoclass) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetPlaceholderStateFromFindData(finddata: COpaquePointer?): CfPlaceholderState =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderStateFromFindData((finddata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetPlatformInfo(platformversion: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfGetPlatformInfo((platformversion?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetSyncRootInfoByHandle(filehandle: Handle, infoclass: CfSyncRootInfoClass, infobuffer: COpaquePointer?, infobufferlength: UInt, returnedlength: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfGetSyncRootInfoByHandle((filehandle?.value ?: 0L).toString(), infoclass, (infobuffer?.value ?: 0L).toString(), infobufferlength.toInt(), (returnedlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetSyncRootInfoByPath(filepath: Pcwstr, infoclass: CfSyncRootInfoClass, infobuffer: COpaquePointer?, infobufferlength: UInt, returnedlength: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfGetSyncRootInfoByPath((filepath?.value ?: 0L).toString(), infoclass, (infobuffer?.value ?: 0L).toString(), infobufferlength.toInt(), (returnedlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetTransferKey(filehandle: Handle, transferkey: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfGetTransferKey((filehandle?.value ?: 0L).toString(), (transferkey?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetWin32HandleFromProtectedHandle(protectedhandle: Handle): Handle =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfGetWin32HandleFromProtectedHandle((protectedhandle?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfHydratePlaceholder(filehandle: Handle, startingoffset: Long, length: Long, hydrateflags: CfHydrateFlags, overlapped: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfHydratePlaceholder((filehandle?.value ?: 0L).toString(), startingoffset.toString(), length.toString(), hydrateflags, (overlapped?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfOpenFileWithOplock(filepath: Pcwstr, flags: CfOpenFileFlags, protectedhandle: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfOpenFileWithOplock((filepath?.value ?: 0L).toString(), flags, (protectedhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfQuerySyncProviderStatus(connectionkey: CfConnectionKey, providerstatus: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfQuerySyncProviderStatus(connectionkey.toString(), (providerstatus?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfReferenceProtectedHandle(protectedhandle: Handle): Boolean =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfReferenceProtectedHandle((protectedhandle?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfRegisterSyncRoot(syncrootpath: Pcwstr, registration: COpaquePointer?, policies: COpaquePointer?, registerflags: CfRegisterFlags): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfRegisterSyncRoot((syncrootpath?.value ?: 0L).toString(), (registration?.value ?: 0L).toString(), (policies?.value ?: 0L).toString(), registerflags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfReleaseProtectedHandle(protectedhandle: Handle) {
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) {
        _windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfReleaseProtectedHandle((protectedhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cfReleaseTransferKey(filehandle: Handle, transferkey: COpaquePointer?) {
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) {
        _windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfReleaseTransferKey((filehandle?.value ?: 0L).toString(), (transferkey?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cfReportProviderProgress(connectionkey: CfConnectionKey, transferkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfReportProviderProgress(connectionkey.toString(), transferkey.toString(), providerprogresstotal.toString(), providerprogresscompleted.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfReportProviderProgress2(connectionkey: CfConnectionKey, transferkey: Long, requestkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long, targetsessionid: UInt): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfReportProviderProgress2(connectionkey.toString(), transferkey.toString(), requestkey.toString(), providerprogresstotal.toString(), providerprogresscompleted.toString(), targetsessionid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfReportSyncStatus(syncrootpath: Pcwstr, syncstatus: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfReportSyncStatus((syncrootpath?.value ?: 0L).toString(), (syncstatus?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfRevertPlaceholder(filehandle: Handle, revertflags: CfRevertFlags, overlapped: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfRevertPlaceholder((filehandle?.value ?: 0L).toString(), revertflags, (overlapped?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfSetCorrelationVector(filehandle: Handle, correlationvector: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfSetCorrelationVector((filehandle?.value ?: 0L).toString(), (correlationvector?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfSetInSyncState(filehandle: Handle, insyncstate: CfInSyncState, insyncflags: CfSetInSyncFlags, insyncusn: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfSetInSyncState((filehandle?.value ?: 0L).toString(), insyncstate, insyncflags, (insyncusn?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfSetPinState(filehandle: Handle, pinstate: CfPinState, pinflags: CfSetPinFlags, overlapped: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfSetPinState((filehandle?.value ?: 0L).toString(), pinstate, pinflags, (overlapped?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfUnregisterSyncRoot(syncrootpath: Pcwstr): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfUnregisterSyncRoot((syncrootpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfUpdatePlaceholder(filehandle: Handle, fsmetadata: COpaquePointer?, fileidentity: COpaquePointer?, fileidentitylength: UInt, dehydraterangearray: COpaquePointer?, dehydraterangecount: UInt, updateflags: CfUpdateFlags, updateusn: COpaquePointer?, overlapped: COpaquePointer?): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfUpdatePlaceholder((filehandle?.value ?: 0L).toString(), (fsmetadata?.value ?: 0L).toString(), (fileidentity?.value ?: 0L).toString(), fileidentitylength.toInt(), (dehydraterangearray?.value ?: 0L).toString(), dehydraterangecount.toInt(), updateflags, (updateusn?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfUpdateSyncProviderStatus(connectionkey: CfConnectionKey, providerstatus: CfSyncProviderStatus): Hresult =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_cfUpdateSyncProviderStatus(connectionkey.toString(), providerstatus.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
