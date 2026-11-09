@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FILE_INFO_BY_HANDLE_CLASS

private object WindowsWin32StorageCloudfiltersJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfCloseHandle(filehandle: Long)

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfConnectSyncRoot(syncrootpath: Long, callbacktable: Long, callbackcontext: Long, connectflags: Int, connectionkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfConvertToPlaceholder(filehandle: Long, fileidentity: Long, fileidentitylength: Int, convertflags: Int, convertusn: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfCreatePlaceholders(basedirectorypath: Long, placeholderarray: Long, placeholdercount: Int, createflags: Int, entriesprocessed: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfDehydratePlaceholder(filehandle: Long, startingoffset: Long, length: Long, dehydrateflags: Int, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfDisconnectSyncRoot(connectionkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfExecute(opinfo: Long, opparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfGetCorrelationVector(filehandle: Long, correlationvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderInfo(filehandle: Long, infoclass: Int, infobuffer: Long, infobufferlength: Int, returnedlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderRangeInfo(filehandle: Long, infoclass: Int, startingoffset: Long, length: Long, infobuffer: Long, infobufferlength: Int, returnedlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderRangeInfoForHydration(connectionkey: Long, transferkey: Long, fileid: Long, infoclass: Int, startingoffset: Long, rangelength: Long, infobuffer: Long, infobuffersize: Int, infobufferwritten: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderStateFromAttributeTag(fileattributes: Int, reparsetag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderStateFromFileInfo(infobuffer: Long, infoclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderStateFromFindData(finddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfGetPlatformInfo(platformversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfGetSyncRootInfoByHandle(filehandle: Long, infoclass: Int, infobuffer: Long, infobufferlength: Int, returnedlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfGetSyncRootInfoByPath(filepath: Long, infoclass: Int, infobuffer: Long, infobufferlength: Int, returnedlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfGetTransferKey(filehandle: Long, transferkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfGetWin32HandleFromProtectedHandle(protectedhandle: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfHydratePlaceholder(filehandle: Long, startingoffset: Long, length: Long, hydrateflags: Int, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfOpenFileWithOplock(filepath: Long, flags: Int, protectedhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfQuerySyncProviderStatus(connectionkey: Long, providerstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfReferenceProtectedHandle(protectedhandle: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfRegisterSyncRoot(syncrootpath: Long, registration: Long, policies: Long, registerflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfReleaseProtectedHandle(protectedhandle: Long)

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfReleaseTransferKey(filehandle: Long, transferkey: Long)

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfReportProviderProgress(connectionkey: Long, transferkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfReportProviderProgress2(connectionkey: Long, transferkey: Long, requestkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long, targetsessionid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfReportSyncStatus(syncrootpath: Long, syncstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfRevertPlaceholder(filehandle: Long, revertflags: Int, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfSetCorrelationVector(filehandle: Long, correlationvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfSetInSyncState(filehandle: Long, insyncstate: Int, insyncflags: Int, insyncusn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfSetPinState(filehandle: Long, pinstate: Int, pinflags: Int, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfUnregisterSyncRoot(syncrootpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfUpdatePlaceholder(filehandle: Long, fsmetadata: Long, fileidentity: Long, fileidentitylength: Int, dehydraterangearray: Long, dehydraterangecount: Int, updateflags: Int, updateusn: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_CfUpdateSyncProviderStatus(connectionkey: Long, providerstatus: Int): Int
}

public actual fun CfCloseHandle(filehandle: HANDLE) {
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfCloseHandle(filehandle)
}

public actual fun CfConnectSyncRoot(syncrootpath: PCWSTR, callbacktable: Long, callbackcontext: Long, connectflags: CF_CONNECT_FLAGS, connectionkey: Long): HRESULT =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfConnectSyncRoot(syncrootpath, callbacktable, callbackcontext, connectflags, connectionkey)

public actual fun CfConvertToPlaceholder(filehandle: HANDLE, fileidentity: Long, fileidentitylength: UInt, convertflags: CF_CONVERT_FLAGS, convertusn: Long, overlapped: Long): HRESULT =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfConvertToPlaceholder(filehandle, fileidentity, fileidentitylength.toInt(), convertflags, convertusn, overlapped)

public actual fun CfCreatePlaceholders(basedirectorypath: PCWSTR, placeholderarray: Long, placeholdercount: UInt, createflags: CF_CREATE_FLAGS, entriesprocessed: Long): HRESULT =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfCreatePlaceholders(basedirectorypath, placeholderarray, placeholdercount.toInt(), createflags, entriesprocessed)

public actual fun CfDehydratePlaceholder(filehandle: HANDLE, startingoffset: Long, length: Long, dehydrateflags: CF_DEHYDRATE_FLAGS, overlapped: Long): HRESULT =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfDehydratePlaceholder(filehandle, startingoffset, length, dehydrateflags, overlapped)

public actual fun CfDisconnectSyncRoot(connectionkey: CF_CONNECTION_KEY): HRESULT =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfDisconnectSyncRoot(connectionkey)

public actual fun CfExecute(opinfo: Long, opparams: Long): HRESULT =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfExecute(opinfo, opparams)

public actual fun CfGetCorrelationVector(filehandle: HANDLE, correlationvector: Long): HRESULT =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfGetCorrelationVector(filehandle, correlationvector)

public actual fun CfGetPlaceholderInfo(filehandle: HANDLE, infoclass: CF_PLACEHOLDER_INFO_CLASS, infobuffer: Long, infobufferlength: UInt, returnedlength: Long): HRESULT =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderInfo(filehandle, infoclass, infobuffer, infobufferlength.toInt(), returnedlength)

public actual fun CfGetPlaceholderRangeInfo(filehandle: HANDLE, infoclass: CF_PLACEHOLDER_RANGE_INFO_CLASS, startingoffset: Long, length: Long, infobuffer: Long, infobufferlength: UInt, returnedlength: Long): HRESULT =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderRangeInfo(filehandle, infoclass, startingoffset, length, infobuffer, infobufferlength.toInt(), returnedlength)

public actual fun CfGetPlaceholderRangeInfoForHydration(connectionkey: CF_CONNECTION_KEY, transferkey: Long, fileid: Long, infoclass: CF_PLACEHOLDER_RANGE_INFO_CLASS, startingoffset: Long, rangelength: Long, infobuffer: Long, infobuffersize: UInt, infobufferwritten: Long): HRESULT =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderRangeInfoForHydration(connectionkey, transferkey, fileid, infoclass, startingoffset, rangelength, infobuffer, infobuffersize.toInt(), infobufferwritten)

public actual fun CfGetPlaceholderStateFromAttributeTag(fileattributes: UInt, reparsetag: UInt): CF_PLACEHOLDER_STATE =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderStateFromAttributeTag(fileattributes.toInt(), reparsetag.toInt()).toUInt()

public actual fun CfGetPlaceholderStateFromFileInfo(infobuffer: Long, infoclass: FILE_INFO_BY_HANDLE_CLASS): CF_PLACEHOLDER_STATE =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderStateFromFileInfo(infobuffer, infoclass).toUInt()

public actual fun CfGetPlaceholderStateFromFindData(finddata: Long): CF_PLACEHOLDER_STATE =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderStateFromFindData(finddata).toUInt()

public actual fun CfGetPlatformInfo(platformversion: Long): HRESULT =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfGetPlatformInfo(platformversion)

public actual fun CfGetSyncRootInfoByHandle(filehandle: HANDLE, infoclass: CF_SYNC_ROOT_INFO_CLASS, infobuffer: Long, infobufferlength: UInt, returnedlength: Long): HRESULT =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfGetSyncRootInfoByHandle(filehandle, infoclass, infobuffer, infobufferlength.toInt(), returnedlength)

public actual fun CfGetSyncRootInfoByPath(filepath: PCWSTR, infoclass: CF_SYNC_ROOT_INFO_CLASS, infobuffer: Long, infobufferlength: UInt, returnedlength: Long): HRESULT =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfGetSyncRootInfoByPath(filepath, infoclass, infobuffer, infobufferlength.toInt(), returnedlength)

public actual fun CfGetTransferKey(filehandle: HANDLE, transferkey: Long): HRESULT =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfGetTransferKey(filehandle, transferkey)

public actual fun CfGetWin32HandleFromProtectedHandle(protectedhandle: HANDLE): HANDLE =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfGetWin32HandleFromProtectedHandle(protectedhandle)

public actual fun CfHydratePlaceholder(filehandle: HANDLE, startingoffset: Long, length: Long, hydrateflags: CF_HYDRATE_FLAGS, overlapped: Long): HRESULT =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfHydratePlaceholder(filehandle, startingoffset, length, hydrateflags, overlapped)

public actual fun CfOpenFileWithOplock(filepath: PCWSTR, flags: CF_OPEN_FILE_FLAGS, protectedhandle: Long): HRESULT =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfOpenFileWithOplock(filepath, flags, protectedhandle)

public actual fun CfQuerySyncProviderStatus(connectionkey: CF_CONNECTION_KEY, providerstatus: Long): HRESULT =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfQuerySyncProviderStatus(connectionkey, providerstatus)

public actual fun CfReferenceProtectedHandle(protectedhandle: HANDLE): Boolean =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfReferenceProtectedHandle(protectedhandle)

public actual fun CfRegisterSyncRoot(syncrootpath: PCWSTR, registration: Long, policies: Long, registerflags: CF_REGISTER_FLAGS): HRESULT =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfRegisterSyncRoot(syncrootpath, registration, policies, registerflags)

public actual fun CfReleaseProtectedHandle(protectedhandle: HANDLE) {
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfReleaseProtectedHandle(protectedhandle)
}

public actual fun CfReleaseTransferKey(filehandle: HANDLE, transferkey: Long) {
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfReleaseTransferKey(filehandle, transferkey)
}

public actual fun CfReportProviderProgress(connectionkey: CF_CONNECTION_KEY, transferkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long): HRESULT =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfReportProviderProgress(connectionkey, transferkey, providerprogresstotal, providerprogresscompleted)

public actual fun CfReportProviderProgress2(connectionkey: CF_CONNECTION_KEY, transferkey: Long, requestkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long, targetsessionid: UInt): HRESULT =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfReportProviderProgress2(connectionkey, transferkey, requestkey, providerprogresstotal, providerprogresscompleted, targetsessionid.toInt())

public actual fun CfReportSyncStatus(syncrootpath: PCWSTR, syncstatus: Long): HRESULT =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfReportSyncStatus(syncrootpath, syncstatus)

public actual fun CfRevertPlaceholder(filehandle: HANDLE, revertflags: CF_REVERT_FLAGS, overlapped: Long): HRESULT =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfRevertPlaceholder(filehandle, revertflags, overlapped)

public actual fun CfSetCorrelationVector(filehandle: HANDLE, correlationvector: Long): HRESULT =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfSetCorrelationVector(filehandle, correlationvector)

public actual fun CfSetInSyncState(filehandle: HANDLE, insyncstate: CF_IN_SYNC_STATE, insyncflags: CF_SET_IN_SYNC_FLAGS, insyncusn: Long): HRESULT =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfSetInSyncState(filehandle, insyncstate, insyncflags, insyncusn)

public actual fun CfSetPinState(filehandle: HANDLE, pinstate: CF_PIN_STATE, pinflags: CF_SET_PIN_FLAGS, overlapped: Long): HRESULT =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfSetPinState(filehandle, pinstate, pinflags, overlapped)

public actual fun CfUnregisterSyncRoot(syncrootpath: PCWSTR): HRESULT =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfUnregisterSyncRoot(syncrootpath)

public actual fun CfUpdatePlaceholder(filehandle: HANDLE, fsmetadata: Long, fileidentity: Long, fileidentitylength: UInt, dehydraterangearray: Long, dehydraterangecount: UInt, updateflags: CF_UPDATE_FLAGS, updateusn: Long, overlapped: Long): HRESULT =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfUpdatePlaceholder(filehandle, fsmetadata, fileidentity, fileidentitylength.toInt(), dehydraterangearray, dehydraterangecount.toInt(), updateflags, updateusn, overlapped)

public actual fun CfUpdateSyncProviderStatus(connectionkey: CF_CONNECTION_KEY, providerstatus: CF_SYNC_PROVIDER_STATUS): HRESULT =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_CfUpdateSyncProviderStatus(connectionkey, providerstatus.toInt())
