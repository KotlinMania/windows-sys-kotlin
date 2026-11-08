package io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FILE_INFO_BY_HANDLE_CLASS

public fun CfCloseHandle(filehandle: HANDLE) {
    Win32DynamicFfi.invoke("cldapi.dll", "CfCloseHandle", longArrayOf(filehandle))
}

public fun CfConnectSyncRoot(syncrootpath: PCWSTR, callbacktable: Long, callbackcontext: Long, connectflags: CF_CONNECT_FLAGS, connectionkey: Long): HRESULT {
    return Win32DynamicFfi.invoke("cldapi.dll", "CfConnectSyncRoot", longArrayOf(syncrootpath, callbacktable, callbackcontext, connectflags.toLong(), connectionkey)).toInt()
}

public fun CfConvertToPlaceholder(filehandle: HANDLE, fileidentity: Long, fileidentitylength: UInt, convertflags: CF_CONVERT_FLAGS, convertusn: Long, overlapped: Long): HRESULT {
    return Win32DynamicFfi.invoke("cldapi.dll", "CfConvertToPlaceholder", longArrayOf(filehandle, fileidentity, fileidentitylength.toLong(), convertflags.toLong(), convertusn, overlapped)).toInt()
}

public fun CfCreatePlaceholders(basedirectorypath: PCWSTR, placeholderarray: Long, placeholdercount: UInt, createflags: CF_CREATE_FLAGS, entriesprocessed: Long): HRESULT {
    return Win32DynamicFfi.invoke("cldapi.dll", "CfCreatePlaceholders", longArrayOf(basedirectorypath, placeholderarray, placeholdercount.toLong(), createflags.toLong(), entriesprocessed)).toInt()
}

public fun CfDehydratePlaceholder(filehandle: HANDLE, startingoffset: Long, length: Long, dehydrateflags: CF_DEHYDRATE_FLAGS, overlapped: Long): HRESULT {
    return Win32DynamicFfi.invoke("cldapi.dll", "CfDehydratePlaceholder", longArrayOf(filehandle, startingoffset, length, dehydrateflags.toLong(), overlapped)).toInt()
}

public fun CfDisconnectSyncRoot(connectionkey: CF_CONNECTION_KEY): HRESULT {
    return Win32DynamicFfi.invoke("cldapi.dll", "CfDisconnectSyncRoot", longArrayOf(connectionkey)).toInt()
}

public fun CfExecute(opinfo: Long, opparams: Long): HRESULT {
    return Win32DynamicFfi.invoke("cldapi.dll", "CfExecute", longArrayOf(opinfo, opparams)).toInt()
}

public fun CfGetCorrelationVector(filehandle: HANDLE, correlationvector: Long): HRESULT {
    return Win32DynamicFfi.invoke("cldapi.dll", "CfGetCorrelationVector", longArrayOf(filehandle, correlationvector)).toInt()
}

public fun CfGetPlaceholderInfo(filehandle: HANDLE, infoclass: CF_PLACEHOLDER_INFO_CLASS, infobuffer: Long, infobufferlength: UInt, returnedlength: Long): HRESULT {
    return Win32DynamicFfi.invoke("cldapi.dll", "CfGetPlaceholderInfo", longArrayOf(filehandle, infoclass.toLong(), infobuffer, infobufferlength.toLong(), returnedlength)).toInt()
}

public fun CfGetPlaceholderRangeInfo(filehandle: HANDLE, infoclass: CF_PLACEHOLDER_RANGE_INFO_CLASS, startingoffset: Long, length: Long, infobuffer: Long, infobufferlength: UInt, returnedlength: Long): HRESULT {
    return Win32DynamicFfi.invoke("cldapi.dll", "CfGetPlaceholderRangeInfo", longArrayOf(filehandle, infoclass.toLong(), startingoffset, length, infobuffer, infobufferlength.toLong(), returnedlength)).toInt()
}

public fun CfGetPlaceholderRangeInfoForHydration(connectionkey: CF_CONNECTION_KEY, transferkey: Long, fileid: Long, infoclass: CF_PLACEHOLDER_RANGE_INFO_CLASS, startingoffset: Long, rangelength: Long, infobuffer: Long, infobuffersize: UInt, infobufferwritten: Long): HRESULT {
    return Win32DynamicFfi.invoke("cldapi.dll", "CfGetPlaceholderRangeInfoForHydration", longArrayOf(connectionkey, transferkey, fileid, infoclass.toLong(), startingoffset, rangelength, infobuffer, infobuffersize.toLong(), infobufferwritten)).toInt()
}

public fun CfGetPlaceholderStateFromAttributeTag(fileattributes: UInt, reparsetag: UInt): CF_PLACEHOLDER_STATE {
    return Win32DynamicFfi.invoke("cldapi.dll", "CfGetPlaceholderStateFromAttributeTag", longArrayOf(fileattributes.toLong(), reparsetag.toLong())).toUInt()
}

public fun CfGetPlaceholderStateFromFileInfo(infobuffer: Long, infoclass: FILE_INFO_BY_HANDLE_CLASS): CF_PLACEHOLDER_STATE {
    return Win32DynamicFfi.invoke("cldapi.dll", "CfGetPlaceholderStateFromFileInfo", longArrayOf(infobuffer, infoclass.toLong())).toUInt()
}

public fun CfGetPlaceholderStateFromFindData(finddata: Long): CF_PLACEHOLDER_STATE {
    return Win32DynamicFfi.invoke("cldapi.dll", "CfGetPlaceholderStateFromFindData", longArrayOf(finddata)).toUInt()
}

public fun CfGetPlatformInfo(platformversion: Long): HRESULT {
    return Win32DynamicFfi.invoke("cldapi.dll", "CfGetPlatformInfo", longArrayOf(platformversion)).toInt()
}

public fun CfGetSyncRootInfoByHandle(filehandle: HANDLE, infoclass: CF_SYNC_ROOT_INFO_CLASS, infobuffer: Long, infobufferlength: UInt, returnedlength: Long): HRESULT {
    return Win32DynamicFfi.invoke("cldapi.dll", "CfGetSyncRootInfoByHandle", longArrayOf(filehandle, infoclass.toLong(), infobuffer, infobufferlength.toLong(), returnedlength)).toInt()
}

public fun CfGetSyncRootInfoByPath(filepath: PCWSTR, infoclass: CF_SYNC_ROOT_INFO_CLASS, infobuffer: Long, infobufferlength: UInt, returnedlength: Long): HRESULT {
    return Win32DynamicFfi.invoke("cldapi.dll", "CfGetSyncRootInfoByPath", longArrayOf(filepath, infoclass.toLong(), infobuffer, infobufferlength.toLong(), returnedlength)).toInt()
}

public fun CfGetTransferKey(filehandle: HANDLE, transferkey: Long): HRESULT {
    return Win32DynamicFfi.invoke("cldapi.dll", "CfGetTransferKey", longArrayOf(filehandle, transferkey)).toInt()
}

public fun CfGetWin32HandleFromProtectedHandle(protectedhandle: HANDLE): HANDLE {
    return Win32DynamicFfi.invoke("cldapi.dll", "CfGetWin32HandleFromProtectedHandle", longArrayOf(protectedhandle))
}

public fun CfHydratePlaceholder(filehandle: HANDLE, startingoffset: Long, length: Long, hydrateflags: CF_HYDRATE_FLAGS, overlapped: Long): HRESULT {
    return Win32DynamicFfi.invoke("cldapi.dll", "CfHydratePlaceholder", longArrayOf(filehandle, startingoffset, length, hydrateflags.toLong(), overlapped)).toInt()
}

public fun CfOpenFileWithOplock(filepath: PCWSTR, flags: CF_OPEN_FILE_FLAGS, protectedhandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("cldapi.dll", "CfOpenFileWithOplock", longArrayOf(filepath, flags.toLong(), protectedhandle)).toInt()
}

public fun CfQuerySyncProviderStatus(connectionkey: CF_CONNECTION_KEY, providerstatus: Long): HRESULT {
    return Win32DynamicFfi.invoke("cldapi.dll", "CfQuerySyncProviderStatus", longArrayOf(connectionkey, providerstatus)).toInt()
}

public fun CfReferenceProtectedHandle(protectedhandle: HANDLE): Boolean {
    val rawRet = Win32DynamicFfi.invoke("cldapi.dll", "CfReferenceProtectedHandle", longArrayOf(protectedhandle))
    return (rawRet and 0xFFL) != 0L
}

public fun CfRegisterSyncRoot(syncrootpath: PCWSTR, registration: Long, policies: Long, registerflags: CF_REGISTER_FLAGS): HRESULT {
    return Win32DynamicFfi.invoke("cldapi.dll", "CfRegisterSyncRoot", longArrayOf(syncrootpath, registration, policies, registerflags.toLong())).toInt()
}

public fun CfReleaseProtectedHandle(protectedhandle: HANDLE) {
    Win32DynamicFfi.invoke("cldapi.dll", "CfReleaseProtectedHandle", longArrayOf(protectedhandle))
}

public fun CfReleaseTransferKey(filehandle: HANDLE, transferkey: Long) {
    Win32DynamicFfi.invoke("cldapi.dll", "CfReleaseTransferKey", longArrayOf(filehandle, transferkey))
}

public fun CfReportProviderProgress(connectionkey: CF_CONNECTION_KEY, transferkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long): HRESULT {
    return Win32DynamicFfi.invoke("cldapi.dll", "CfReportProviderProgress", longArrayOf(connectionkey, transferkey, providerprogresstotal, providerprogresscompleted)).toInt()
}

public fun CfReportProviderProgress2(connectionkey: CF_CONNECTION_KEY, transferkey: Long, requestkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long, targetsessionid: UInt): HRESULT {
    return Win32DynamicFfi.invoke("cldapi.dll", "CfReportProviderProgress2", longArrayOf(connectionkey, transferkey, requestkey, providerprogresstotal, providerprogresscompleted, targetsessionid.toLong())).toInt()
}

public fun CfReportSyncStatus(syncrootpath: PCWSTR, syncstatus: Long): HRESULT {
    return Win32DynamicFfi.invoke("cldapi.dll", "CfReportSyncStatus", longArrayOf(syncrootpath, syncstatus)).toInt()
}

public fun CfRevertPlaceholder(filehandle: HANDLE, revertflags: CF_REVERT_FLAGS, overlapped: Long): HRESULT {
    return Win32DynamicFfi.invoke("cldapi.dll", "CfRevertPlaceholder", longArrayOf(filehandle, revertflags.toLong(), overlapped)).toInt()
}

public fun CfSetCorrelationVector(filehandle: HANDLE, correlationvector: Long): HRESULT {
    return Win32DynamicFfi.invoke("cldapi.dll", "CfSetCorrelationVector", longArrayOf(filehandle, correlationvector)).toInt()
}

public fun CfSetInSyncState(filehandle: HANDLE, insyncstate: CF_IN_SYNC_STATE, insyncflags: CF_SET_IN_SYNC_FLAGS, insyncusn: Long): HRESULT {
    return Win32DynamicFfi.invoke("cldapi.dll", "CfSetInSyncState", longArrayOf(filehandle, insyncstate.toLong(), insyncflags.toLong(), insyncusn)).toInt()
}

public fun CfSetPinState(filehandle: HANDLE, pinstate: CF_PIN_STATE, pinflags: CF_SET_PIN_FLAGS, overlapped: Long): HRESULT {
    return Win32DynamicFfi.invoke("cldapi.dll", "CfSetPinState", longArrayOf(filehandle, pinstate.toLong(), pinflags.toLong(), overlapped)).toInt()
}

public fun CfUnregisterSyncRoot(syncrootpath: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("cldapi.dll", "CfUnregisterSyncRoot", longArrayOf(syncrootpath)).toInt()
}

public fun CfUpdatePlaceholder(filehandle: HANDLE, fsmetadata: Long, fileidentity: Long, fileidentitylength: UInt, dehydraterangearray: Long, dehydraterangecount: UInt, updateflags: CF_UPDATE_FLAGS, updateusn: Long, overlapped: Long): HRESULT {
    return Win32DynamicFfi.invoke("cldapi.dll", "CfUpdatePlaceholder", longArrayOf(filehandle, fsmetadata, fileidentity, fileidentitylength.toLong(), dehydraterangearray, dehydraterangecount.toLong(), updateflags.toLong(), updateusn, overlapped)).toInt()
}

public fun CfUpdateSyncProviderStatus(connectionkey: CF_CONNECTION_KEY, providerstatus: CF_SYNC_PROVIDER_STATUS): HRESULT {
    return Win32DynamicFfi.invoke("cldapi.dll", "CfUpdateSyncProviderStatus", longArrayOf(connectionkey, providerstatus.toLong())).toInt()
}
