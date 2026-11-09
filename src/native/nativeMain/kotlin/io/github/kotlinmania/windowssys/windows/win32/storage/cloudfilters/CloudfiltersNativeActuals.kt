@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FILE_INFO_BY_HANDLE_CLASS
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun CfCloseHandle(filehandle: HANDLE) {
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfCloseHandle(filehandle.toCPointer<ByteVar>())
}

public actual fun CfConnectSyncRoot(syncrootpath: PCWSTR, callbacktable: Long, callbackcontext: Long, connectflags: CF_CONNECT_FLAGS, connectionkey: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfConnectSyncRoot(syncrootpath.toCPointer<ByteVar>(), callbacktable.toCPointer<ByteVar>(), callbackcontext.toCPointer<ByteVar>(), connectflags, connectionkey.toCPointer<ByteVar>())

public actual fun CfConvertToPlaceholder(filehandle: HANDLE, fileidentity: Long, fileidentitylength: UInt, convertflags: CF_CONVERT_FLAGS, convertusn: Long, overlapped: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfConvertToPlaceholder(filehandle.toCPointer<ByteVar>(), fileidentity.toCPointer<ByteVar>(), fileidentitylength, convertflags, convertusn.toCPointer<ByteVar>(), overlapped.toCPointer<ByteVar>())

public actual fun CfCreatePlaceholders(basedirectorypath: PCWSTR, placeholderarray: Long, placeholdercount: UInt, createflags: CF_CREATE_FLAGS, entriesprocessed: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfCreatePlaceholders(basedirectorypath.toCPointer<ByteVar>(), placeholderarray.toCPointer<ByteVar>(), placeholdercount, createflags, entriesprocessed.toCPointer<ByteVar>())

public actual fun CfDehydratePlaceholder(filehandle: HANDLE, startingoffset: Long, length: Long, dehydrateflags: CF_DEHYDRATE_FLAGS, overlapped: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfDehydratePlaceholder(filehandle.toCPointer<ByteVar>(), startingoffset, length, dehydrateflags, overlapped.toCPointer<ByteVar>())

public actual fun CfDisconnectSyncRoot(connectionkey: CF_CONNECTION_KEY): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfDisconnectSyncRoot(connectionkey)

public actual fun CfExecute(opinfo: Long, opparams: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfExecute(opinfo.toCPointer<ByteVar>(), opparams.toCPointer<ByteVar>())

public actual fun CfGetCorrelationVector(filehandle: HANDLE, correlationvector: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfGetCorrelationVector(filehandle.toCPointer<ByteVar>(), correlationvector.toCPointer<ByteVar>())

public actual fun CfGetPlaceholderInfo(filehandle: HANDLE, infoclass: CF_PLACEHOLDER_INFO_CLASS, infobuffer: Long, infobufferlength: UInt, returnedlength: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderInfo(filehandle.toCPointer<ByteVar>(), infoclass, infobuffer.toCPointer<ByteVar>(), infobufferlength, returnedlength.toCPointer<ByteVar>())

public actual fun CfGetPlaceholderRangeInfo(filehandle: HANDLE, infoclass: CF_PLACEHOLDER_RANGE_INFO_CLASS, startingoffset: Long, length: Long, infobuffer: Long, infobufferlength: UInt, returnedlength: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderRangeInfo(filehandle.toCPointer<ByteVar>(), infoclass, startingoffset, length, infobuffer.toCPointer<ByteVar>(), infobufferlength, returnedlength.toCPointer<ByteVar>())

public actual fun CfGetPlaceholderRangeInfoForHydration(connectionkey: CF_CONNECTION_KEY, transferkey: Long, fileid: Long, infoclass: CF_PLACEHOLDER_RANGE_INFO_CLASS, startingoffset: Long, rangelength: Long, infobuffer: Long, infobuffersize: UInt, infobufferwritten: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderRangeInfoForHydration(connectionkey, transferkey, fileid, infoclass, startingoffset, rangelength, infobuffer.toCPointer<ByteVar>(), infobuffersize, infobufferwritten.toCPointer<ByteVar>())

public actual fun CfGetPlaceholderStateFromAttributeTag(fileattributes: UInt, reparsetag: UInt): CF_PLACEHOLDER_STATE =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderStateFromAttributeTag(fileattributes, reparsetag)

public actual fun CfGetPlaceholderStateFromFileInfo(infobuffer: Long, infoclass: FILE_INFO_BY_HANDLE_CLASS): CF_PLACEHOLDER_STATE =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderStateFromFileInfo(infobuffer.toCPointer<ByteVar>(), infoclass)

public actual fun CfGetPlaceholderStateFromFindData(finddata: Long): CF_PLACEHOLDER_STATE =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderStateFromFindData(finddata.toCPointer<ByteVar>())

public actual fun CfGetPlatformInfo(platformversion: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfGetPlatformInfo(platformversion.toCPointer<ByteVar>())

public actual fun CfGetSyncRootInfoByHandle(filehandle: HANDLE, infoclass: CF_SYNC_ROOT_INFO_CLASS, infobuffer: Long, infobufferlength: UInt, returnedlength: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfGetSyncRootInfoByHandle(filehandle.toCPointer<ByteVar>(), infoclass, infobuffer.toCPointer<ByteVar>(), infobufferlength, returnedlength.toCPointer<ByteVar>())

public actual fun CfGetSyncRootInfoByPath(filepath: PCWSTR, infoclass: CF_SYNC_ROOT_INFO_CLASS, infobuffer: Long, infobufferlength: UInt, returnedlength: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfGetSyncRootInfoByPath(filepath.toCPointer<ByteVar>(), infoclass, infobuffer.toCPointer<ByteVar>(), infobufferlength, returnedlength.toCPointer<ByteVar>())

public actual fun CfGetTransferKey(filehandle: HANDLE, transferkey: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfGetTransferKey(filehandle.toCPointer<ByteVar>(), transferkey.toCPointer<ByteVar>())

public actual fun CfGetWin32HandleFromProtectedHandle(protectedhandle: HANDLE): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfGetWin32HandleFromProtectedHandle(protectedhandle.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CfHydratePlaceholder(filehandle: HANDLE, startingoffset: Long, length: Long, hydrateflags: CF_HYDRATE_FLAGS, overlapped: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfHydratePlaceholder(filehandle.toCPointer<ByteVar>(), startingoffset, length, hydrateflags, overlapped.toCPointer<ByteVar>())

public actual fun CfOpenFileWithOplock(filepath: PCWSTR, flags: CF_OPEN_FILE_FLAGS, protectedhandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfOpenFileWithOplock(filepath.toCPointer<ByteVar>(), flags, protectedhandle.toCPointer<ByteVar>())

public actual fun CfQuerySyncProviderStatus(connectionkey: CF_CONNECTION_KEY, providerstatus: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfQuerySyncProviderStatus(connectionkey, providerstatus.toCPointer<ByteVar>())

public actual fun CfReferenceProtectedHandle(protectedhandle: HANDLE): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfReferenceProtectedHandle(protectedhandle.toCPointer<ByteVar>())

public actual fun CfRegisterSyncRoot(syncrootpath: PCWSTR, registration: Long, policies: Long, registerflags: CF_REGISTER_FLAGS): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfRegisterSyncRoot(syncrootpath.toCPointer<ByteVar>(), registration.toCPointer<ByteVar>(), policies.toCPointer<ByteVar>(), registerflags)

public actual fun CfReleaseProtectedHandle(protectedhandle: HANDLE) {
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfReleaseProtectedHandle(protectedhandle.toCPointer<ByteVar>())
}

public actual fun CfReleaseTransferKey(filehandle: HANDLE, transferkey: Long) {
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfReleaseTransferKey(filehandle.toCPointer<ByteVar>(), transferkey.toCPointer<ByteVar>())
}

public actual fun CfReportProviderProgress(connectionkey: CF_CONNECTION_KEY, transferkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfReportProviderProgress(connectionkey, transferkey, providerprogresstotal, providerprogresscompleted)

public actual fun CfReportProviderProgress2(connectionkey: CF_CONNECTION_KEY, transferkey: Long, requestkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long, targetsessionid: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfReportProviderProgress2(connectionkey, transferkey, requestkey, providerprogresstotal, providerprogresscompleted, targetsessionid)

public actual fun CfReportSyncStatus(syncrootpath: PCWSTR, syncstatus: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfReportSyncStatus(syncrootpath.toCPointer<ByteVar>(), syncstatus.toCPointer<ByteVar>())

public actual fun CfRevertPlaceholder(filehandle: HANDLE, revertflags: CF_REVERT_FLAGS, overlapped: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfRevertPlaceholder(filehandle.toCPointer<ByteVar>(), revertflags, overlapped.toCPointer<ByteVar>())

public actual fun CfSetCorrelationVector(filehandle: HANDLE, correlationvector: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfSetCorrelationVector(filehandle.toCPointer<ByteVar>(), correlationvector.toCPointer<ByteVar>())

public actual fun CfSetInSyncState(filehandle: HANDLE, insyncstate: CF_IN_SYNC_STATE, insyncflags: CF_SET_IN_SYNC_FLAGS, insyncusn: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfSetInSyncState(filehandle.toCPointer<ByteVar>(), insyncstate, insyncflags, insyncusn.toCPointer<ByteVar>())

public actual fun CfSetPinState(filehandle: HANDLE, pinstate: CF_PIN_STATE, pinflags: CF_SET_PIN_FLAGS, overlapped: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfSetPinState(filehandle.toCPointer<ByteVar>(), pinstate, pinflags, overlapped.toCPointer<ByteVar>())

public actual fun CfUnregisterSyncRoot(syncrootpath: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfUnregisterSyncRoot(syncrootpath.toCPointer<ByteVar>())

public actual fun CfUpdatePlaceholder(filehandle: HANDLE, fsmetadata: Long, fileidentity: Long, fileidentitylength: UInt, dehydraterangearray: Long, dehydraterangecount: UInt, updateflags: CF_UPDATE_FLAGS, updateusn: Long, overlapped: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfUpdatePlaceholder(filehandle.toCPointer<ByteVar>(), fsmetadata.toCPointer<ByteVar>(), fileidentity.toCPointer<ByteVar>(), fileidentitylength, dehydraterangearray.toCPointer<ByteVar>(), dehydraterangecount, updateflags, updateusn.toCPointer<ByteVar>(), overlapped.toCPointer<ByteVar>())

public actual fun CfUpdateSyncProviderStatus(connectionkey: CF_CONNECTION_KEY, providerstatus: CF_SYNC_PROVIDER_STATUS): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_CfUpdateSyncProviderStatus(connectionkey, providerstatus)
