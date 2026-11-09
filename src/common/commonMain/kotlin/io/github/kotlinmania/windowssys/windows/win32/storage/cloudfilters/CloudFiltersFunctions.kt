package io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FILE_INFO_BY_HANDLE_CLASS

public expect fun CfCloseHandle(filehandle: HANDLE)

public expect fun CfConnectSyncRoot(syncrootpath: PCWSTR, callbacktable: Long, callbackcontext: Long, connectflags: CF_CONNECT_FLAGS, connectionkey: Long): HRESULT

public expect fun CfConvertToPlaceholder(filehandle: HANDLE, fileidentity: Long, fileidentitylength: UInt, convertflags: CF_CONVERT_FLAGS, convertusn: Long, overlapped: Long): HRESULT

public expect fun CfCreatePlaceholders(basedirectorypath: PCWSTR, placeholderarray: Long, placeholdercount: UInt, createflags: CF_CREATE_FLAGS, entriesprocessed: Long): HRESULT

public expect fun CfDehydratePlaceholder(filehandle: HANDLE, startingoffset: Long, length: Long, dehydrateflags: CF_DEHYDRATE_FLAGS, overlapped: Long): HRESULT

public expect fun CfDisconnectSyncRoot(connectionkey: CF_CONNECTION_KEY): HRESULT

public expect fun CfExecute(opinfo: Long, opparams: Long): HRESULT

public expect fun CfGetCorrelationVector(filehandle: HANDLE, correlationvector: Long): HRESULT

public expect fun CfGetPlaceholderInfo(filehandle: HANDLE, infoclass: CF_PLACEHOLDER_INFO_CLASS, infobuffer: Long, infobufferlength: UInt, returnedlength: Long): HRESULT

public expect fun CfGetPlaceholderRangeInfo(filehandle: HANDLE, infoclass: CF_PLACEHOLDER_RANGE_INFO_CLASS, startingoffset: Long, length: Long, infobuffer: Long, infobufferlength: UInt, returnedlength: Long): HRESULT

public expect fun CfGetPlaceholderRangeInfoForHydration(connectionkey: CF_CONNECTION_KEY, transferkey: Long, fileid: Long, infoclass: CF_PLACEHOLDER_RANGE_INFO_CLASS, startingoffset: Long, rangelength: Long, infobuffer: Long, infobuffersize: UInt, infobufferwritten: Long): HRESULT

public expect fun CfGetPlaceholderStateFromAttributeTag(fileattributes: UInt, reparsetag: UInt): CF_PLACEHOLDER_STATE

public expect fun CfGetPlaceholderStateFromFileInfo(infobuffer: Long, infoclass: FILE_INFO_BY_HANDLE_CLASS): CF_PLACEHOLDER_STATE

public expect fun CfGetPlaceholderStateFromFindData(finddata: Long): CF_PLACEHOLDER_STATE

public expect fun CfGetPlatformInfo(platformversion: Long): HRESULT

public expect fun CfGetSyncRootInfoByHandle(filehandle: HANDLE, infoclass: CF_SYNC_ROOT_INFO_CLASS, infobuffer: Long, infobufferlength: UInt, returnedlength: Long): HRESULT

public expect fun CfGetSyncRootInfoByPath(filepath: PCWSTR, infoclass: CF_SYNC_ROOT_INFO_CLASS, infobuffer: Long, infobufferlength: UInt, returnedlength: Long): HRESULT

public expect fun CfGetTransferKey(filehandle: HANDLE, transferkey: Long): HRESULT

public expect fun CfGetWin32HandleFromProtectedHandle(protectedhandle: HANDLE): HANDLE

public expect fun CfHydratePlaceholder(filehandle: HANDLE, startingoffset: Long, length: Long, hydrateflags: CF_HYDRATE_FLAGS, overlapped: Long): HRESULT

public expect fun CfOpenFileWithOplock(filepath: PCWSTR, flags: CF_OPEN_FILE_FLAGS, protectedhandle: Long): HRESULT

public expect fun CfQuerySyncProviderStatus(connectionkey: CF_CONNECTION_KEY, providerstatus: Long): HRESULT

public expect fun CfReferenceProtectedHandle(protectedhandle: HANDLE): Boolean

public expect fun CfRegisterSyncRoot(syncrootpath: PCWSTR, registration: Long, policies: Long, registerflags: CF_REGISTER_FLAGS): HRESULT

public expect fun CfReleaseProtectedHandle(protectedhandle: HANDLE)

public expect fun CfReleaseTransferKey(filehandle: HANDLE, transferkey: Long)

public expect fun CfReportProviderProgress(connectionkey: CF_CONNECTION_KEY, transferkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long): HRESULT

public expect fun CfReportProviderProgress2(connectionkey: CF_CONNECTION_KEY, transferkey: Long, requestkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long, targetsessionid: UInt): HRESULT

public expect fun CfReportSyncStatus(syncrootpath: PCWSTR, syncstatus: Long): HRESULT

public expect fun CfRevertPlaceholder(filehandle: HANDLE, revertflags: CF_REVERT_FLAGS, overlapped: Long): HRESULT

public expect fun CfSetCorrelationVector(filehandle: HANDLE, correlationvector: Long): HRESULT

public expect fun CfSetInSyncState(filehandle: HANDLE, insyncstate: CF_IN_SYNC_STATE, insyncflags: CF_SET_IN_SYNC_FLAGS, insyncusn: Long): HRESULT

public expect fun CfSetPinState(filehandle: HANDLE, pinstate: CF_PIN_STATE, pinflags: CF_SET_PIN_FLAGS, overlapped: Long): HRESULT

public expect fun CfUnregisterSyncRoot(syncrootpath: PCWSTR): HRESULT

public expect fun CfUpdatePlaceholder(filehandle: HANDLE, fsmetadata: Long, fileidentity: Long, fileidentitylength: UInt, dehydraterangearray: Long, dehydraterangecount: UInt, updateflags: CF_UPDATE_FLAGS, updateusn: Long, overlapped: Long): HRESULT

public expect fun CfUpdateSyncProviderStatus(connectionkey: CF_CONNECTION_KEY, providerstatus: CF_SYNC_PROVIDER_STATUS): HRESULT
