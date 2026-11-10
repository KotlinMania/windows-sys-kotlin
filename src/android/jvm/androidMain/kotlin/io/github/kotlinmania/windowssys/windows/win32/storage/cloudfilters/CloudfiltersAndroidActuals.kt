@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileInfoByHandleClass

private object WindowsWin32StorageCloudfiltersJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfCloseHandle(filehandle: Long)

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfConnectSyncRoot(syncrootpath: Long, callbacktable: Long, callbackcontext: Long, connectflags: Int, connectionkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfConvertToPlaceholder(filehandle: Long, fileidentity: Long, fileidentitylength: Int, convertflags: Int, convertusn: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfCreatePlaceholders(basedirectorypath: Long, placeholderarray: Long, placeholdercount: Int, createflags: Int, entriesprocessed: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfDehydratePlaceholder(filehandle: Long, startingoffset: Long, length: Long, dehydrateflags: Int, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfDisconnectSyncRoot(connectionkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfExecute(opinfo: Long, opparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfGetCorrelationVector(filehandle: Long, correlationvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderInfo(filehandle: Long, infoclass: Int, infobuffer: Long, infobufferlength: Int, returnedlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderRangeInfo(filehandle: Long, infoclass: Int, startingoffset: Long, length: Long, infobuffer: Long, infobufferlength: Int, returnedlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderRangeInfoForHydration(connectionkey: Long, transferkey: Long, fileid: Long, infoclass: Int, startingoffset: Long, rangelength: Long, infobuffer: Long, infobuffersize: Int, infobufferwritten: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderStateFromAttributeTag(fileattributes: Int, reparsetag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderStateFromFileInfo(infobuffer: Long, infoclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderStateFromFindData(finddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfGetPlatformInfo(platformversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfGetSyncRootInfoByHandle(filehandle: Long, infoclass: Int, infobuffer: Long, infobufferlength: Int, returnedlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfGetSyncRootInfoByPath(filepath: Long, infoclass: Int, infobuffer: Long, infobufferlength: Int, returnedlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfGetTransferKey(filehandle: Long, transferkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfGetWin32HandleFromProtectedHandle(protectedhandle: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfHydratePlaceholder(filehandle: Long, startingoffset: Long, length: Long, hydrateflags: Int, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfOpenFileWithOplock(filepath: Long, flags: Int, protectedhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfQuerySyncProviderStatus(connectionkey: Long, providerstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfReferenceProtectedHandle(protectedhandle: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfRegisterSyncRoot(syncrootpath: Long, registration: Long, policies: Long, registerflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfReleaseProtectedHandle(protectedhandle: Long)

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfReleaseTransferKey(filehandle: Long, transferkey: Long)

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfReportProviderProgress(connectionkey: Long, transferkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfReportProviderProgress2(connectionkey: Long, transferkey: Long, requestkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long, targetsessionid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfReportSyncStatus(syncrootpath: Long, syncstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfRevertPlaceholder(filehandle: Long, revertflags: Int, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfSetCorrelationVector(filehandle: Long, correlationvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfSetInSyncState(filehandle: Long, insyncstate: Int, insyncflags: Int, insyncusn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfSetPinState(filehandle: Long, pinstate: Int, pinflags: Int, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfUnregisterSyncRoot(syncrootpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfUpdatePlaceholder(filehandle: Long, fsmetadata: Long, fileidentity: Long, fileidentitylength: Int, dehydraterangearray: Long, dehydraterangecount: Int, updateflags: Int, updateusn: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cloudfilters_cfUpdateSyncProviderStatus(connectionkey: Long, providerstatus: Int): Int
}

public actual fun cfCloseHandle(filehandle: Handle) {
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfCloseHandle((filehandle?.value ?: 0L))
}

public actual fun cfConnectSyncRoot(syncrootpath: Pcwstr, callbacktable: COpaquePointer?, callbackcontext: COpaquePointer?, connectflags: CfConnectFlags, connectionkey: COpaquePointer?): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfConnectSyncRoot((syncrootpath?.value ?: 0L), (callbacktable?.value ?: 0L), (callbackcontext?.value ?: 0L), connectflags, (connectionkey?.value ?: 0L))

public actual fun cfConvertToPlaceholder(filehandle: Handle, fileidentity: COpaquePointer?, fileidentitylength: UInt, convertflags: CfConvertFlags, convertusn: COpaquePointer?, overlapped: COpaquePointer?): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfConvertToPlaceholder((filehandle?.value ?: 0L), (fileidentity?.value ?: 0L), fileidentitylength.toInt(), convertflags, (convertusn?.value ?: 0L), (overlapped?.value ?: 0L))

public actual fun cfCreatePlaceholders(basedirectorypath: Pcwstr, placeholderarray: COpaquePointer?, placeholdercount: UInt, createflags: CfCreateFlags, entriesprocessed: COpaquePointer?): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfCreatePlaceholders((basedirectorypath?.value ?: 0L), (placeholderarray?.value ?: 0L), placeholdercount.toInt(), createflags, (entriesprocessed?.value ?: 0L))

public actual fun cfDehydratePlaceholder(filehandle: Handle, startingoffset: Long, length: Long, dehydrateflags: CfDehydrateFlags, overlapped: COpaquePointer?): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfDehydratePlaceholder((filehandle?.value ?: 0L), startingoffset, length, dehydrateflags, (overlapped?.value ?: 0L))

public actual fun cfDisconnectSyncRoot(connectionkey: CfConnectionKey): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfDisconnectSyncRoot(connectionkey)

public actual fun cfExecute(opinfo: COpaquePointer?, opparams: COpaquePointer?): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfExecute((opinfo?.value ?: 0L), (opparams?.value ?: 0L))

public actual fun cfGetCorrelationVector(filehandle: Handle, correlationvector: COpaquePointer?): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfGetCorrelationVector((filehandle?.value ?: 0L), (correlationvector?.value ?: 0L))

public actual fun cfGetPlaceholderInfo(filehandle: Handle, infoclass: CfPlaceholderInfoClass, infobuffer: COpaquePointer?, infobufferlength: UInt, returnedlength: COpaquePointer?): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderInfo((filehandle?.value ?: 0L), infoclass, (infobuffer?.value ?: 0L), infobufferlength.toInt(), (returnedlength?.value ?: 0L))

public actual fun cfGetPlaceholderRangeInfo(filehandle: Handle, infoclass: CfPlaceholderRangeInfoClass, startingoffset: Long, length: Long, infobuffer: COpaquePointer?, infobufferlength: UInt, returnedlength: COpaquePointer?): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderRangeInfo((filehandle?.value ?: 0L), infoclass, startingoffset, length, (infobuffer?.value ?: 0L), infobufferlength.toInt(), (returnedlength?.value ?: 0L))

public actual fun cfGetPlaceholderRangeInfoForHydration(connectionkey: CfConnectionKey, transferkey: Long, fileid: Long, infoclass: CfPlaceholderRangeInfoClass, startingoffset: Long, rangelength: Long, infobuffer: COpaquePointer?, infobuffersize: UInt, infobufferwritten: COpaquePointer?): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderRangeInfoForHydration(connectionkey, transferkey, fileid, infoclass, startingoffset, rangelength, (infobuffer?.value ?: 0L), infobuffersize.toInt(), (infobufferwritten?.value ?: 0L))

public actual fun cfGetPlaceholderStateFromAttributeTag(fileattributes: UInt, reparsetag: UInt): CfPlaceholderState =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderStateFromAttributeTag(fileattributes.toInt(), reparsetag.toInt()).toUInt()

public actual fun cfGetPlaceholderStateFromFileInfo(infobuffer: COpaquePointer?, infoclass: FileInfoByHandleClass): CfPlaceholderState =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderStateFromFileInfo((infobuffer?.value ?: 0L), infoclass).toUInt()

public actual fun cfGetPlaceholderStateFromFindData(finddata: COpaquePointer?): CfPlaceholderState =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderStateFromFindData((finddata?.value ?: 0L)).toUInt()

public actual fun cfGetPlatformInfo(platformversion: COpaquePointer?): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfGetPlatformInfo((platformversion?.value ?: 0L))

public actual fun cfGetSyncRootInfoByHandle(filehandle: Handle, infoclass: CfSyncRootInfoClass, infobuffer: COpaquePointer?, infobufferlength: UInt, returnedlength: COpaquePointer?): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfGetSyncRootInfoByHandle((filehandle?.value ?: 0L), infoclass, (infobuffer?.value ?: 0L), infobufferlength.toInt(), (returnedlength?.value ?: 0L))

public actual fun cfGetSyncRootInfoByPath(filepath: Pcwstr, infoclass: CfSyncRootInfoClass, infobuffer: COpaquePointer?, infobufferlength: UInt, returnedlength: COpaquePointer?): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfGetSyncRootInfoByPath((filepath?.value ?: 0L), infoclass, (infobuffer?.value ?: 0L), infobufferlength.toInt(), (returnedlength?.value ?: 0L))

public actual fun cfGetTransferKey(filehandle: Handle, transferkey: COpaquePointer?): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfGetTransferKey((filehandle?.value ?: 0L), (transferkey?.value ?: 0L))

public actual fun cfGetWin32HandleFromProtectedHandle(protectedhandle: Handle): Handle =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfGetWin32HandleFromProtectedHandle((protectedhandle?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cfHydratePlaceholder(filehandle: Handle, startingoffset: Long, length: Long, hydrateflags: CfHydrateFlags, overlapped: COpaquePointer?): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfHydratePlaceholder((filehandle?.value ?: 0L), startingoffset, length, hydrateflags, (overlapped?.value ?: 0L))

public actual fun cfOpenFileWithOplock(filepath: Pcwstr, flags: CfOpenFileFlags, protectedhandle: COpaquePointer?): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfOpenFileWithOplock((filepath?.value ?: 0L), flags, (protectedhandle?.value ?: 0L))

public actual fun cfQuerySyncProviderStatus(connectionkey: CfConnectionKey, providerstatus: COpaquePointer?): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfQuerySyncProviderStatus(connectionkey, (providerstatus?.value ?: 0L))

public actual fun cfReferenceProtectedHandle(protectedhandle: Handle): Boolean =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfReferenceProtectedHandle((protectedhandle?.value ?: 0L))

public actual fun cfRegisterSyncRoot(syncrootpath: Pcwstr, registration: COpaquePointer?, policies: COpaquePointer?, registerflags: CfRegisterFlags): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfRegisterSyncRoot((syncrootpath?.value ?: 0L), (registration?.value ?: 0L), (policies?.value ?: 0L), registerflags)

public actual fun cfReleaseProtectedHandle(protectedhandle: Handle) {
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfReleaseProtectedHandle((protectedhandle?.value ?: 0L))
}

public actual fun cfReleaseTransferKey(filehandle: Handle, transferkey: COpaquePointer?) {
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfReleaseTransferKey((filehandle?.value ?: 0L), (transferkey?.value ?: 0L))
}

public actual fun cfReportProviderProgress(connectionkey: CfConnectionKey, transferkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfReportProviderProgress(connectionkey, transferkey, providerprogresstotal, providerprogresscompleted)

public actual fun cfReportProviderProgress2(connectionkey: CfConnectionKey, transferkey: Long, requestkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long, targetsessionid: UInt): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfReportProviderProgress2(connectionkey, transferkey, requestkey, providerprogresstotal, providerprogresscompleted, targetsessionid.toInt())

public actual fun cfReportSyncStatus(syncrootpath: Pcwstr, syncstatus: COpaquePointer?): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfReportSyncStatus((syncrootpath?.value ?: 0L), (syncstatus?.value ?: 0L))

public actual fun cfRevertPlaceholder(filehandle: Handle, revertflags: CfRevertFlags, overlapped: COpaquePointer?): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfRevertPlaceholder((filehandle?.value ?: 0L), revertflags, (overlapped?.value ?: 0L))

public actual fun cfSetCorrelationVector(filehandle: Handle, correlationvector: COpaquePointer?): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfSetCorrelationVector((filehandle?.value ?: 0L), (correlationvector?.value ?: 0L))

public actual fun cfSetInSyncState(filehandle: Handle, insyncstate: CfInSyncState, insyncflags: CfSetInSyncFlags, insyncusn: COpaquePointer?): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfSetInSyncState((filehandle?.value ?: 0L), insyncstate, insyncflags, (insyncusn?.value ?: 0L))

public actual fun cfSetPinState(filehandle: Handle, pinstate: CfPinState, pinflags: CfSetPinFlags, overlapped: COpaquePointer?): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfSetPinState((filehandle?.value ?: 0L), pinstate, pinflags, (overlapped?.value ?: 0L))

public actual fun cfUnregisterSyncRoot(syncrootpath: Pcwstr): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfUnregisterSyncRoot((syncrootpath?.value ?: 0L))

public actual fun cfUpdatePlaceholder(filehandle: Handle, fsmetadata: COpaquePointer?, fileidentity: COpaquePointer?, fileidentitylength: UInt, dehydraterangearray: COpaquePointer?, dehydraterangecount: UInt, updateflags: CfUpdateFlags, updateusn: COpaquePointer?, overlapped: COpaquePointer?): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfUpdatePlaceholder((filehandle?.value ?: 0L), (fsmetadata?.value ?: 0L), (fileidentity?.value ?: 0L), fileidentitylength.toInt(), (dehydraterangearray?.value ?: 0L), dehydraterangecount.toInt(), updateflags, (updateusn?.value ?: 0L), (overlapped?.value ?: 0L))

public actual fun cfUpdateSyncProviderStatus(connectionkey: CfConnectionKey, providerstatus: CfSyncProviderStatus): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssys_windows_win32_storage_cloudfilters_cfUpdateSyncProviderStatus(connectionkey, providerstatus.toInt())
