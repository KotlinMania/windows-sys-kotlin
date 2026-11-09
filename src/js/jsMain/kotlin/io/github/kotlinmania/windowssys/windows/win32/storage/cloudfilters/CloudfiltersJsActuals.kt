@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FILE_INFO_BY_HANDLE_CLASS

private val _windowsWin32StorageCloudfiltersNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun CfCloseHandle(filehandle: HANDLE) {
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) {
        _windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfCloseHandle(filehandle.toString())
    }
}

public actual fun CfConnectSyncRoot(syncrootpath: PCWSTR, callbacktable: Long, callbackcontext: Long, connectflags: CF_CONNECT_FLAGS, connectionkey: Long): HRESULT =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfConnectSyncRoot(syncrootpath.toString(), callbacktable.toString(), callbackcontext.toString(), connectflags, connectionkey.toString()) as Int) else 0

public actual fun CfConvertToPlaceholder(filehandle: HANDLE, fileidentity: Long, fileidentitylength: UInt, convertflags: CF_CONVERT_FLAGS, convertusn: Long, overlapped: Long): HRESULT =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfConvertToPlaceholder(filehandle.toString(), fileidentity.toString(), fileidentitylength.toInt(), convertflags, convertusn.toString(), overlapped.toString()) as Int) else 0

public actual fun CfCreatePlaceholders(basedirectorypath: PCWSTR, placeholderarray: Long, placeholdercount: UInt, createflags: CF_CREATE_FLAGS, entriesprocessed: Long): HRESULT =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfCreatePlaceholders(basedirectorypath.toString(), placeholderarray.toString(), placeholdercount.toInt(), createflags, entriesprocessed.toString()) as Int) else 0

public actual fun CfDehydratePlaceholder(filehandle: HANDLE, startingoffset: Long, length: Long, dehydrateflags: CF_DEHYDRATE_FLAGS, overlapped: Long): HRESULT =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfDehydratePlaceholder(filehandle.toString(), startingoffset.toString(), length.toString(), dehydrateflags, overlapped.toString()) as Int) else 0

public actual fun CfDisconnectSyncRoot(connectionkey: CF_CONNECTION_KEY): HRESULT =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfDisconnectSyncRoot(connectionkey.toString()) as Int) else 0

public actual fun CfExecute(opinfo: Long, opparams: Long): HRESULT =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfExecute(opinfo.toString(), opparams.toString()) as Int) else 0

public actual fun CfGetCorrelationVector(filehandle: HANDLE, correlationvector: Long): HRESULT =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfGetCorrelationVector(filehandle.toString(), correlationvector.toString()) as Int) else 0

public actual fun CfGetPlaceholderInfo(filehandle: HANDLE, infoclass: CF_PLACEHOLDER_INFO_CLASS, infobuffer: Long, infobufferlength: UInt, returnedlength: Long): HRESULT =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderInfo(filehandle.toString(), infoclass, infobuffer.toString(), infobufferlength.toInt(), returnedlength.toString()) as Int) else 0

public actual fun CfGetPlaceholderRangeInfo(filehandle: HANDLE, infoclass: CF_PLACEHOLDER_RANGE_INFO_CLASS, startingoffset: Long, length: Long, infobuffer: Long, infobufferlength: UInt, returnedlength: Long): HRESULT =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderRangeInfo(filehandle.toString(), infoclass, startingoffset.toString(), length.toString(), infobuffer.toString(), infobufferlength.toInt(), returnedlength.toString()) as Int) else 0

public actual fun CfGetPlaceholderRangeInfoForHydration(connectionkey: CF_CONNECTION_KEY, transferkey: Long, fileid: Long, infoclass: CF_PLACEHOLDER_RANGE_INFO_CLASS, startingoffset: Long, rangelength: Long, infobuffer: Long, infobuffersize: UInt, infobufferwritten: Long): HRESULT =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderRangeInfoForHydration(connectionkey.toString(), transferkey.toString(), fileid.toString(), infoclass, startingoffset.toString(), rangelength.toString(), infobuffer.toString(), infobuffersize.toInt(), infobufferwritten.toString()) as Int) else 0

public actual fun CfGetPlaceholderStateFromAttributeTag(fileattributes: UInt, reparsetag: UInt): CF_PLACEHOLDER_STATE =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderStateFromAttributeTag(fileattributes.toInt(), reparsetag.toInt()) as Int).toUInt() else 0u

public actual fun CfGetPlaceholderStateFromFileInfo(infobuffer: Long, infoclass: FILE_INFO_BY_HANDLE_CLASS): CF_PLACEHOLDER_STATE =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderStateFromFileInfo(infobuffer.toString(), infoclass) as Int).toUInt() else 0u

public actual fun CfGetPlaceholderStateFromFindData(finddata: Long): CF_PLACEHOLDER_STATE =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderStateFromFindData(finddata.toString()) as Int).toUInt() else 0u

public actual fun CfGetPlatformInfo(platformversion: Long): HRESULT =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfGetPlatformInfo(platformversion.toString()) as Int) else 0

public actual fun CfGetSyncRootInfoByHandle(filehandle: HANDLE, infoclass: CF_SYNC_ROOT_INFO_CLASS, infobuffer: Long, infobufferlength: UInt, returnedlength: Long): HRESULT =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfGetSyncRootInfoByHandle(filehandle.toString(), infoclass, infobuffer.toString(), infobufferlength.toInt(), returnedlength.toString()) as Int) else 0

public actual fun CfGetSyncRootInfoByPath(filepath: PCWSTR, infoclass: CF_SYNC_ROOT_INFO_CLASS, infobuffer: Long, infobufferlength: UInt, returnedlength: Long): HRESULT =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfGetSyncRootInfoByPath(filepath.toString(), infoclass, infobuffer.toString(), infobufferlength.toInt(), returnedlength.toString()) as Int) else 0

public actual fun CfGetTransferKey(filehandle: HANDLE, transferkey: Long): HRESULT =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfGetTransferKey(filehandle.toString(), transferkey.toString()) as Int) else 0

public actual fun CfGetWin32HandleFromProtectedHandle(protectedhandle: HANDLE): HANDLE =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfGetWin32HandleFromProtectedHandle(protectedhandle.toString()) as String).toLong() else 0L

public actual fun CfHydratePlaceholder(filehandle: HANDLE, startingoffset: Long, length: Long, hydrateflags: CF_HYDRATE_FLAGS, overlapped: Long): HRESULT =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfHydratePlaceholder(filehandle.toString(), startingoffset.toString(), length.toString(), hydrateflags, overlapped.toString()) as Int) else 0

public actual fun CfOpenFileWithOplock(filepath: PCWSTR, flags: CF_OPEN_FILE_FLAGS, protectedhandle: Long): HRESULT =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfOpenFileWithOplock(filepath.toString(), flags, protectedhandle.toString()) as Int) else 0

public actual fun CfQuerySyncProviderStatus(connectionkey: CF_CONNECTION_KEY, providerstatus: Long): HRESULT =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfQuerySyncProviderStatus(connectionkey.toString(), providerstatus.toString()) as Int) else 0

public actual fun CfReferenceProtectedHandle(protectedhandle: HANDLE): Boolean =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfReferenceProtectedHandle(protectedhandle.toString()) as Boolean) else false

public actual fun CfRegisterSyncRoot(syncrootpath: PCWSTR, registration: Long, policies: Long, registerflags: CF_REGISTER_FLAGS): HRESULT =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfRegisterSyncRoot(syncrootpath.toString(), registration.toString(), policies.toString(), registerflags) as Int) else 0

public actual fun CfReleaseProtectedHandle(protectedhandle: HANDLE) {
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) {
        _windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfReleaseProtectedHandle(protectedhandle.toString())
    }
}

public actual fun CfReleaseTransferKey(filehandle: HANDLE, transferkey: Long) {
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) {
        _windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfReleaseTransferKey(filehandle.toString(), transferkey.toString())
    }
}

public actual fun CfReportProviderProgress(connectionkey: CF_CONNECTION_KEY, transferkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long): HRESULT =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfReportProviderProgress(connectionkey.toString(), transferkey.toString(), providerprogresstotal.toString(), providerprogresscompleted.toString()) as Int) else 0

public actual fun CfReportProviderProgress2(connectionkey: CF_CONNECTION_KEY, transferkey: Long, requestkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long, targetsessionid: UInt): HRESULT =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfReportProviderProgress2(connectionkey.toString(), transferkey.toString(), requestkey.toString(), providerprogresstotal.toString(), providerprogresscompleted.toString(), targetsessionid.toInt()) as Int) else 0

public actual fun CfReportSyncStatus(syncrootpath: PCWSTR, syncstatus: Long): HRESULT =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfReportSyncStatus(syncrootpath.toString(), syncstatus.toString()) as Int) else 0

public actual fun CfRevertPlaceholder(filehandle: HANDLE, revertflags: CF_REVERT_FLAGS, overlapped: Long): HRESULT =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfRevertPlaceholder(filehandle.toString(), revertflags, overlapped.toString()) as Int) else 0

public actual fun CfSetCorrelationVector(filehandle: HANDLE, correlationvector: Long): HRESULT =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfSetCorrelationVector(filehandle.toString(), correlationvector.toString()) as Int) else 0

public actual fun CfSetInSyncState(filehandle: HANDLE, insyncstate: CF_IN_SYNC_STATE, insyncflags: CF_SET_IN_SYNC_FLAGS, insyncusn: Long): HRESULT =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfSetInSyncState(filehandle.toString(), insyncstate, insyncflags, insyncusn.toString()) as Int) else 0

public actual fun CfSetPinState(filehandle: HANDLE, pinstate: CF_PIN_STATE, pinflags: CF_SET_PIN_FLAGS, overlapped: Long): HRESULT =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfSetPinState(filehandle.toString(), pinstate, pinflags, overlapped.toString()) as Int) else 0

public actual fun CfUnregisterSyncRoot(syncrootpath: PCWSTR): HRESULT =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfUnregisterSyncRoot(syncrootpath.toString()) as Int) else 0

public actual fun CfUpdatePlaceholder(filehandle: HANDLE, fsmetadata: Long, fileidentity: Long, fileidentitylength: UInt, dehydraterangearray: Long, dehydraterangecount: UInt, updateflags: CF_UPDATE_FLAGS, updateusn: Long, overlapped: Long): HRESULT =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfUpdatePlaceholder(filehandle.toString(), fsmetadata.toString(), fileidentity.toString(), fileidentitylength.toInt(), dehydraterangearray.toString(), dehydraterangecount.toInt(), updateflags, updateusn.toString(), overlapped.toString()) as Int) else 0

public actual fun CfUpdateSyncProviderStatus(connectionkey: CF_CONNECTION_KEY, providerstatus: CF_SYNC_PROVIDER_STATUS): HRESULT =
    if (_windowsWin32StorageCloudfiltersNapiAddon != null) (_windowsWin32StorageCloudfiltersNapiAddon.windowssys_windows_win32_storage_cloudfilters_CfUpdateSyncProviderStatus(connectionkey.toString(), providerstatus.toInt()) as Int) else 0
