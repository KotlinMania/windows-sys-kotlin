@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileInfoByHandleClass
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.Win32FindDataa
import io.github.kotlinmania.windowssys.windows.win32.system.CorrelationVector
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun cfCloseHandle(filehandle: Handle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCloudfiltersCfCloseHandle")

public actual fun cfConnectSyncRoot(syncrootpath: Pcwstr, callbacktable: ConstPtr<CfCallbackRegistration>, callbackcontext: ConstPtr<CVoid>, connectflags: CfConnectFlags, connectionkey: MutPtr<CfConnectionKey>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCloudfiltersCfConnectSyncRoot")

public actual fun cfConvertToPlaceholder(filehandle: Handle, fileidentity: ConstPtr<CVoid>, fileidentitylength: UInt, convertflags: CfConvertFlags, convertusn: MutPtr<Long>, overlapped: MutPtr<Overlapped>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCloudfiltersCfConvertToPlaceholder")

public actual fun cfCreatePlaceholders(basedirectorypath: Pcwstr, placeholderarray: MutPtr<CfPlaceholderCreateInfo>, placeholdercount: UInt, createflags: CfCreateFlags, entriesprocessed: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCloudfiltersCfCreatePlaceholders")

public actual fun cfDehydratePlaceholder(filehandle: Handle, startingoffset: Long, length: Long, dehydrateflags: CfDehydrateFlags, overlapped: MutPtr<Overlapped>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCloudfiltersCfDehydratePlaceholder")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageCloudfiltersCfDisconnectSyncRoot")
private external fun wasiWindowssysWindowsWin32StorageCloudfiltersCfDisconnectSyncRoot(connectionkey: Long): Int

public actual fun cfDisconnectSyncRoot(connectionkey: CfConnectionKey): Hresult =
    wasiWindowssysWindowsWin32StorageCloudfiltersCfDisconnectSyncRoot(connectionkey)

public actual fun cfExecute(opinfo: ConstPtr<CfOperationInfo>, opparams: MutPtr<CfOperationParameters>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCloudfiltersCfExecute")

public actual fun cfGetCorrelationVector(filehandle: Handle, correlationvector: MutPtr<CorrelationVector.CorrelationVector>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCloudfiltersCfGetCorrelationVector")

public actual fun cfGetPlaceholderInfo(filehandle: Handle, infoclass: CfPlaceholderInfoClass, infobuffer: MutPtr<CVoid>, infobufferlength: UInt, returnedlength: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderInfo")

public actual fun cfGetPlaceholderRangeInfo(filehandle: Handle, infoclass: CfPlaceholderRangeInfoClass, startingoffset: Long, length: Long, infobuffer: MutPtr<CVoid>, infobufferlength: UInt, returnedlength: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderRangeInfo")

public actual fun cfGetPlaceholderRangeInfoForHydration(connectionkey: CfConnectionKey, transferkey: Long, fileid: Long, infoclass: CfPlaceholderRangeInfoClass, startingoffset: Long, rangelength: Long, infobuffer: MutPtr<CVoid>, infobuffersize: UInt, infobufferwritten: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderRangeInfoForHydration")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromAttributeTag")
private external fun wasiWindowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromAttributeTag(fileattributes: Int, reparsetag: Int): Int

public actual fun cfGetPlaceholderStateFromAttributeTag(fileattributes: UInt, reparsetag: UInt): CfPlaceholderState =
    wasiWindowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromAttributeTag(fileattributes.toInt(), reparsetag.toInt()).toUInt()

public actual fun cfGetPlaceholderStateFromFileInfo(infobuffer: ConstPtr<CVoid>, infoclass: FileInfoByHandleClass): CfPlaceholderState =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromFileInfo")

public actual fun cfGetPlaceholderStateFromFindData(finddata: ConstPtr<Win32FindDataa>): CfPlaceholderState =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromFindData")

public actual fun cfGetPlatformInfo(platformversion: MutPtr<CfPlatformInfo>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCloudfiltersCfGetPlatformInfo")

public actual fun cfGetSyncRootInfoByHandle(filehandle: Handle, infoclass: CfSyncRootInfoClass, infobuffer: MutPtr<CVoid>, infobufferlength: UInt, returnedlength: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCloudfiltersCfGetSyncRootInfoByHandle")

public actual fun cfGetSyncRootInfoByPath(filepath: Pcwstr, infoclass: CfSyncRootInfoClass, infobuffer: MutPtr<CVoid>, infobufferlength: UInt, returnedlength: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCloudfiltersCfGetSyncRootInfoByPath")

public actual fun cfGetTransferKey(filehandle: Handle, transferkey: MutPtr<Long>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCloudfiltersCfGetTransferKey")

public actual fun cfGetWin32HandleFromProtectedHandle(protectedhandle: Handle): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCloudfiltersCfGetWin32HandleFromProtectedHandle")

public actual fun cfHydratePlaceholder(filehandle: Handle, startingoffset: Long, length: Long, hydrateflags: CfHydrateFlags, overlapped: MutPtr<Overlapped>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCloudfiltersCfHydratePlaceholder")

public actual fun cfOpenFileWithOplock(filepath: Pcwstr, flags: CfOpenFileFlags, protectedhandle: MutPtr<Handle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCloudfiltersCfOpenFileWithOplock")

public actual fun cfQuerySyncProviderStatus(connectionkey: CfConnectionKey, providerstatus: MutPtr<CfSyncProviderStatus>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCloudfiltersCfQuerySyncProviderStatus")

public actual fun cfReferenceProtectedHandle(protectedhandle: Handle): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCloudfiltersCfReferenceProtectedHandle")

public actual fun cfRegisterSyncRoot(syncrootpath: Pcwstr, registration: ConstPtr<CfSyncRegistration>, policies: ConstPtr<CfSyncPolicies>, registerflags: CfRegisterFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCloudfiltersCfRegisterSyncRoot")

public actual fun cfReleaseProtectedHandle(protectedhandle: Handle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCloudfiltersCfReleaseProtectedHandle")

public actual fun cfReleaseTransferKey(filehandle: Handle, transferkey: ConstPtr<Long>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCloudfiltersCfReleaseTransferKey")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageCloudfiltersCfReportProviderProgress")
private external fun wasiWindowssysWindowsWin32StorageCloudfiltersCfReportProviderProgress(connectionkey: Long, transferkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long): Int

public actual fun cfReportProviderProgress(connectionkey: CfConnectionKey, transferkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long): Hresult =
    wasiWindowssysWindowsWin32StorageCloudfiltersCfReportProviderProgress(connectionkey, transferkey, providerprogresstotal, providerprogresscompleted)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageCloudfiltersCfReportProviderProgress2")
private external fun wasiWindowssysWindowsWin32StorageCloudfiltersCfReportProviderProgress2(connectionkey: Long, transferkey: Long, requestkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long, targetsessionid: Int): Int

public actual fun cfReportProviderProgress2(connectionkey: CfConnectionKey, transferkey: Long, requestkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long, targetsessionid: UInt): Hresult =
    wasiWindowssysWindowsWin32StorageCloudfiltersCfReportProviderProgress2(connectionkey, transferkey, requestkey, providerprogresstotal, providerprogresscompleted, targetsessionid.toInt())

public actual fun cfReportSyncStatus(syncrootpath: Pcwstr, syncstatus: ConstPtr<CfSyncStatus>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCloudfiltersCfReportSyncStatus")

public actual fun cfRevertPlaceholder(filehandle: Handle, revertflags: CfRevertFlags, overlapped: MutPtr<Overlapped>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCloudfiltersCfRevertPlaceholder")

public actual fun cfSetCorrelationVector(filehandle: Handle, correlationvector: ConstPtr<CorrelationVector.CorrelationVector>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCloudfiltersCfSetCorrelationVector")

public actual fun cfSetInSyncState(filehandle: Handle, insyncstate: CfInSyncState, insyncflags: CfSetInSyncFlags, insyncusn: MutPtr<Long>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCloudfiltersCfSetInSyncState")

public actual fun cfSetPinState(filehandle: Handle, pinstate: CfPinState, pinflags: CfSetPinFlags, overlapped: MutPtr<Overlapped>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCloudfiltersCfSetPinState")

public actual fun cfUnregisterSyncRoot(syncrootpath: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCloudfiltersCfUnregisterSyncRoot")

public actual fun cfUpdatePlaceholder(filehandle: Handle, fsmetadata: ConstPtr<CfFsMetadata>, fileidentity: ConstPtr<CVoid>, fileidentitylength: UInt, dehydraterangearray: ConstPtr<CfFileRange>, dehydraterangecount: UInt, updateflags: CfUpdateFlags, updateusn: MutPtr<Long>, overlapped: MutPtr<Overlapped>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCloudfiltersCfUpdatePlaceholder")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageCloudfiltersCfUpdateSyncProviderStatus")
private external fun wasiWindowssysWindowsWin32StorageCloudfiltersCfUpdateSyncProviderStatus(connectionkey: Long, providerstatus: Int): Int

public actual fun cfUpdateSyncProviderStatus(connectionkey: CfConnectionKey, providerstatus: CfSyncProviderStatus): Hresult =
    wasiWindowssysWindowsWin32StorageCloudfiltersCfUpdateSyncProviderStatus(connectionkey, providerstatus.toInt())
