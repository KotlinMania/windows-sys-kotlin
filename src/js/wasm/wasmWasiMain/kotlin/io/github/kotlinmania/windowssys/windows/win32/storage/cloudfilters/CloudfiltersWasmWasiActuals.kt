@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FILE_INFO_BY_HANDLE_CLASS

public actual fun CfCloseHandle(filehandle: HANDLE) {
}

public actual fun CfConnectSyncRoot(syncrootpath: PCWSTR, callbacktable: Long, callbackcontext: Long, connectflags: CF_CONNECT_FLAGS, connectionkey: Long): HRESULT =
    0

public actual fun CfConvertToPlaceholder(filehandle: HANDLE, fileidentity: Long, fileidentitylength: UInt, convertflags: CF_CONVERT_FLAGS, convertusn: Long, overlapped: Long): HRESULT =
    0

public actual fun CfCreatePlaceholders(basedirectorypath: PCWSTR, placeholderarray: Long, placeholdercount: UInt, createflags: CF_CREATE_FLAGS, entriesprocessed: Long): HRESULT =
    0

public actual fun CfDehydratePlaceholder(filehandle: HANDLE, startingoffset: Long, length: Long, dehydrateflags: CF_DEHYDRATE_FLAGS, overlapped: Long): HRESULT =
    0

public actual fun CfDisconnectSyncRoot(connectionkey: CF_CONNECTION_KEY): HRESULT =
    0

public actual fun CfExecute(opinfo: Long, opparams: Long): HRESULT =
    0

public actual fun CfGetCorrelationVector(filehandle: HANDLE, correlationvector: Long): HRESULT =
    0

public actual fun CfGetPlaceholderInfo(filehandle: HANDLE, infoclass: CF_PLACEHOLDER_INFO_CLASS, infobuffer: Long, infobufferlength: UInt, returnedlength: Long): HRESULT =
    0

public actual fun CfGetPlaceholderRangeInfo(filehandle: HANDLE, infoclass: CF_PLACEHOLDER_RANGE_INFO_CLASS, startingoffset: Long, length: Long, infobuffer: Long, infobufferlength: UInt, returnedlength: Long): HRESULT =
    0

public actual fun CfGetPlaceholderRangeInfoForHydration(connectionkey: CF_CONNECTION_KEY, transferkey: Long, fileid: Long, infoclass: CF_PLACEHOLDER_RANGE_INFO_CLASS, startingoffset: Long, rangelength: Long, infobuffer: Long, infobuffersize: UInt, infobufferwritten: Long): HRESULT =
    0

public actual fun CfGetPlaceholderStateFromAttributeTag(fileattributes: UInt, reparsetag: UInt): CF_PLACEHOLDER_STATE =
    0u

public actual fun CfGetPlaceholderStateFromFileInfo(infobuffer: Long, infoclass: FILE_INFO_BY_HANDLE_CLASS): CF_PLACEHOLDER_STATE =
    0u

public actual fun CfGetPlaceholderStateFromFindData(finddata: Long): CF_PLACEHOLDER_STATE =
    0u

public actual fun CfGetPlatformInfo(platformversion: Long): HRESULT =
    0

public actual fun CfGetSyncRootInfoByHandle(filehandle: HANDLE, infoclass: CF_SYNC_ROOT_INFO_CLASS, infobuffer: Long, infobufferlength: UInt, returnedlength: Long): HRESULT =
    0

public actual fun CfGetSyncRootInfoByPath(filepath: PCWSTR, infoclass: CF_SYNC_ROOT_INFO_CLASS, infobuffer: Long, infobufferlength: UInt, returnedlength: Long): HRESULT =
    0

public actual fun CfGetTransferKey(filehandle: HANDLE, transferkey: Long): HRESULT =
    0

public actual fun CfGetWin32HandleFromProtectedHandle(protectedhandle: HANDLE): HANDLE =
    0L

public actual fun CfHydratePlaceholder(filehandle: HANDLE, startingoffset: Long, length: Long, hydrateflags: CF_HYDRATE_FLAGS, overlapped: Long): HRESULT =
    0

public actual fun CfOpenFileWithOplock(filepath: PCWSTR, flags: CF_OPEN_FILE_FLAGS, protectedhandle: Long): HRESULT =
    0

public actual fun CfQuerySyncProviderStatus(connectionkey: CF_CONNECTION_KEY, providerstatus: Long): HRESULT =
    0

public actual fun CfReferenceProtectedHandle(protectedhandle: HANDLE): Boolean =
    false

public actual fun CfRegisterSyncRoot(syncrootpath: PCWSTR, registration: Long, policies: Long, registerflags: CF_REGISTER_FLAGS): HRESULT =
    0

public actual fun CfReleaseProtectedHandle(protectedhandle: HANDLE) {
}

public actual fun CfReleaseTransferKey(filehandle: HANDLE, transferkey: Long) {
}

public actual fun CfReportProviderProgress(connectionkey: CF_CONNECTION_KEY, transferkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long): HRESULT =
    0

public actual fun CfReportProviderProgress2(connectionkey: CF_CONNECTION_KEY, transferkey: Long, requestkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long, targetsessionid: UInt): HRESULT =
    0

public actual fun CfReportSyncStatus(syncrootpath: PCWSTR, syncstatus: Long): HRESULT =
    0

public actual fun CfRevertPlaceholder(filehandle: HANDLE, revertflags: CF_REVERT_FLAGS, overlapped: Long): HRESULT =
    0

public actual fun CfSetCorrelationVector(filehandle: HANDLE, correlationvector: Long): HRESULT =
    0

public actual fun CfSetInSyncState(filehandle: HANDLE, insyncstate: CF_IN_SYNC_STATE, insyncflags: CF_SET_IN_SYNC_FLAGS, insyncusn: Long): HRESULT =
    0

public actual fun CfSetPinState(filehandle: HANDLE, pinstate: CF_PIN_STATE, pinflags: CF_SET_PIN_FLAGS, overlapped: Long): HRESULT =
    0

public actual fun CfUnregisterSyncRoot(syncrootpath: PCWSTR): HRESULT =
    0

public actual fun CfUpdatePlaceholder(filehandle: HANDLE, fsmetadata: Long, fileidentity: Long, fileidentitylength: UInt, dehydraterangearray: Long, dehydraterangecount: UInt, updateflags: CF_UPDATE_FLAGS, updateusn: Long, overlapped: Long): HRESULT =
    0

public actual fun CfUpdateSyncProviderStatus(connectionkey: CF_CONNECTION_KEY, providerstatus: CF_SYNC_PROVIDER_STATUS): HRESULT =
    0
