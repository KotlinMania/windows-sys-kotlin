@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileInfoByHandleClass
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun cfCloseHandle(filehandle: Handle) {
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfCloseHandle(filehandle?.value?.toCPointer<ByteVar>())
}

public actual fun cfConnectSyncRoot(syncrootpath: Pcwstr, callbacktable: COpaquePointer?, callbackcontext: COpaquePointer?, connectflags: CfConnectFlags, connectionkey: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfConnectSyncRoot(syncrootpath?.value?.toCPointer<ByteVar>(), callbacktable?.value?.toCPointer<ByteVar>(), callbackcontext?.value?.toCPointer<ByteVar>(), connectflags, connectionkey?.value?.toCPointer<ByteVar>())

public actual fun cfConvertToPlaceholder(filehandle: Handle, fileidentity: COpaquePointer?, fileidentitylength: UInt, convertflags: CfConvertFlags, convertusn: COpaquePointer?, overlapped: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfConvertToPlaceholder(filehandle?.value?.toCPointer<ByteVar>(), fileidentity?.value?.toCPointer<ByteVar>(), fileidentitylength, convertflags, convertusn?.value?.toCPointer<ByteVar>(), overlapped?.value?.toCPointer<ByteVar>())

public actual fun cfCreatePlaceholders(basedirectorypath: Pcwstr, placeholderarray: COpaquePointer?, placeholdercount: UInt, createflags: CfCreateFlags, entriesprocessed: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfCreatePlaceholders(basedirectorypath?.value?.toCPointer<ByteVar>(), placeholderarray?.value?.toCPointer<ByteVar>(), placeholdercount, createflags, entriesprocessed?.value?.toCPointer<ByteVar>())

public actual fun cfDehydratePlaceholder(filehandle: Handle, startingoffset: Long, length: Long, dehydrateflags: CfDehydrateFlags, overlapped: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfDehydratePlaceholder(filehandle?.value?.toCPointer<ByteVar>(), startingoffset, length, dehydrateflags, overlapped?.value?.toCPointer<ByteVar>())

public actual fun cfDisconnectSyncRoot(connectionkey: CfConnectionKey): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfDisconnectSyncRoot(connectionkey)

public actual fun cfExecute(opinfo: COpaquePointer?, opparams: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfExecute(opinfo?.value?.toCPointer<ByteVar>(), opparams?.value?.toCPointer<ByteVar>())

public actual fun cfGetCorrelationVector(filehandle: Handle, correlationvector: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfGetCorrelationVector(filehandle?.value?.toCPointer<ByteVar>(), correlationvector?.value?.toCPointer<ByteVar>())

public actual fun cfGetPlaceholderInfo(filehandle: Handle, infoclass: CfPlaceholderInfoClass, infobuffer: COpaquePointer?, infobufferlength: UInt, returnedlength: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderInfo(filehandle?.value?.toCPointer<ByteVar>(), infoclass, infobuffer?.value?.toCPointer<ByteVar>(), infobufferlength, returnedlength?.value?.toCPointer<ByteVar>())

public actual fun cfGetPlaceholderRangeInfo(filehandle: Handle, infoclass: CfPlaceholderRangeInfoClass, startingoffset: Long, length: Long, infobuffer: COpaquePointer?, infobufferlength: UInt, returnedlength: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderRangeInfo(filehandle?.value?.toCPointer<ByteVar>(), infoclass, startingoffset, length, infobuffer?.value?.toCPointer<ByteVar>(), infobufferlength, returnedlength?.value?.toCPointer<ByteVar>())

public actual fun cfGetPlaceholderRangeInfoForHydration(connectionkey: CfConnectionKey, transferkey: Long, fileid: Long, infoclass: CfPlaceholderRangeInfoClass, startingoffset: Long, rangelength: Long, infobuffer: COpaquePointer?, infobuffersize: UInt, infobufferwritten: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderRangeInfoForHydration(connectionkey, transferkey, fileid, infoclass, startingoffset, rangelength, infobuffer?.value?.toCPointer<ByteVar>(), infobuffersize, infobufferwritten?.value?.toCPointer<ByteVar>())

public actual fun cfGetPlaceholderStateFromAttributeTag(fileattributes: UInt, reparsetag: UInt): CfPlaceholderState =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderStateFromAttributeTag(fileattributes, reparsetag)

public actual fun cfGetPlaceholderStateFromFileInfo(infobuffer: COpaquePointer?, infoclass: FileInfoByHandleClass): CfPlaceholderState =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderStateFromFileInfo(infobuffer?.value?.toCPointer<ByteVar>(), infoclass)

public actual fun cfGetPlaceholderStateFromFindData(finddata: COpaquePointer?): CfPlaceholderState =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderStateFromFindData(finddata?.value?.toCPointer<ByteVar>())

public actual fun cfGetPlatformInfo(platformversion: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfGetPlatformInfo(platformversion?.value?.toCPointer<ByteVar>())

public actual fun cfGetSyncRootInfoByHandle(filehandle: Handle, infoclass: CfSyncRootInfoClass, infobuffer: COpaquePointer?, infobufferlength: UInt, returnedlength: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfGetSyncRootInfoByHandle(filehandle?.value?.toCPointer<ByteVar>(), infoclass, infobuffer?.value?.toCPointer<ByteVar>(), infobufferlength, returnedlength?.value?.toCPointer<ByteVar>())

public actual fun cfGetSyncRootInfoByPath(filepath: Pcwstr, infoclass: CfSyncRootInfoClass, infobuffer: COpaquePointer?, infobufferlength: UInt, returnedlength: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfGetSyncRootInfoByPath(filepath?.value?.toCPointer<ByteVar>(), infoclass, infobuffer?.value?.toCPointer<ByteVar>(), infobufferlength, returnedlength?.value?.toCPointer<ByteVar>())

public actual fun cfGetTransferKey(filehandle: Handle, transferkey: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfGetTransferKey(filehandle?.value?.toCPointer<ByteVar>(), transferkey?.value?.toCPointer<ByteVar>())

public actual fun cfGetWin32HandleFromProtectedHandle(protectedhandle: Handle): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfGetWin32HandleFromProtectedHandle(protectedhandle?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun cfHydratePlaceholder(filehandle: Handle, startingoffset: Long, length: Long, hydrateflags: CfHydrateFlags, overlapped: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfHydratePlaceholder(filehandle?.value?.toCPointer<ByteVar>(), startingoffset, length, hydrateflags, overlapped?.value?.toCPointer<ByteVar>())

public actual fun cfOpenFileWithOplock(filepath: Pcwstr, flags: CfOpenFileFlags, protectedhandle: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfOpenFileWithOplock(filepath?.value?.toCPointer<ByteVar>(), flags, protectedhandle?.value?.toCPointer<ByteVar>())

public actual fun cfQuerySyncProviderStatus(connectionkey: CfConnectionKey, providerstatus: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfQuerySyncProviderStatus(connectionkey, providerstatus?.value?.toCPointer<ByteVar>())

public actual fun cfReferenceProtectedHandle(protectedhandle: Handle): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfReferenceProtectedHandle(protectedhandle?.value?.toCPointer<ByteVar>())

public actual fun cfRegisterSyncRoot(syncrootpath: Pcwstr, registration: COpaquePointer?, policies: COpaquePointer?, registerflags: CfRegisterFlags): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfRegisterSyncRoot(syncrootpath?.value?.toCPointer<ByteVar>(), registration?.value?.toCPointer<ByteVar>(), policies?.value?.toCPointer<ByteVar>(), registerflags)

public actual fun cfReleaseProtectedHandle(protectedhandle: Handle) {
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfReleaseProtectedHandle(protectedhandle?.value?.toCPointer<ByteVar>())
}

public actual fun cfReleaseTransferKey(filehandle: Handle, transferkey: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfReleaseTransferKey(filehandle?.value?.toCPointer<ByteVar>(), transferkey?.value?.toCPointer<ByteVar>())
}

public actual fun cfReportProviderProgress(connectionkey: CfConnectionKey, transferkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfReportProviderProgress(connectionkey, transferkey, providerprogresstotal, providerprogresscompleted)

public actual fun cfReportProviderProgress2(connectionkey: CfConnectionKey, transferkey: Long, requestkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long, targetsessionid: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfReportProviderProgress2(connectionkey, transferkey, requestkey, providerprogresstotal, providerprogresscompleted, targetsessionid)

public actual fun cfReportSyncStatus(syncrootpath: Pcwstr, syncstatus: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfReportSyncStatus(syncrootpath?.value?.toCPointer<ByteVar>(), syncstatus?.value?.toCPointer<ByteVar>())

public actual fun cfRevertPlaceholder(filehandle: Handle, revertflags: CfRevertFlags, overlapped: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfRevertPlaceholder(filehandle?.value?.toCPointer<ByteVar>(), revertflags, overlapped?.value?.toCPointer<ByteVar>())

public actual fun cfSetCorrelationVector(filehandle: Handle, correlationvector: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfSetCorrelationVector(filehandle?.value?.toCPointer<ByteVar>(), correlationvector?.value?.toCPointer<ByteVar>())

public actual fun cfSetInSyncState(filehandle: Handle, insyncstate: CfInSyncState, insyncflags: CfSetInSyncFlags, insyncusn: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfSetInSyncState(filehandle?.value?.toCPointer<ByteVar>(), insyncstate, insyncflags, insyncusn?.value?.toCPointer<ByteVar>())

public actual fun cfSetPinState(filehandle: Handle, pinstate: CfPinState, pinflags: CfSetPinFlags, overlapped: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfSetPinState(filehandle?.value?.toCPointer<ByteVar>(), pinstate, pinflags, overlapped?.value?.toCPointer<ByteVar>())

public actual fun cfUnregisterSyncRoot(syncrootpath: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfUnregisterSyncRoot(syncrootpath?.value?.toCPointer<ByteVar>())

public actual fun cfUpdatePlaceholder(filehandle: Handle, fsmetadata: COpaquePointer?, fileidentity: COpaquePointer?, fileidentitylength: UInt, dehydraterangearray: COpaquePointer?, dehydraterangecount: UInt, updateflags: CfUpdateFlags, updateusn: COpaquePointer?, overlapped: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfUpdatePlaceholder(filehandle?.value?.toCPointer<ByteVar>(), fsmetadata?.value?.toCPointer<ByteVar>(), fileidentity?.value?.toCPointer<ByteVar>(), fileidentitylength, dehydraterangearray?.value?.toCPointer<ByteVar>(), dehydraterangecount, updateflags, updateusn?.value?.toCPointer<ByteVar>(), overlapped?.value?.toCPointer<ByteVar>())

public actual fun cfUpdateSyncProviderStatus(connectionkey: CfConnectionKey, providerstatus: CfSyncProviderStatus): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssys_windows_win32_storage_cloudfilters_cfUpdateSyncProviderStatus(connectionkey, providerstatus)
