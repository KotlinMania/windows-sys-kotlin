@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.AccessState
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DeviceObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DriverFsNotification
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DriverObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.EcpHeader
import io.github.kotlinmania.windowssys.windows.wdk.foundation.EcpList
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Eresource
import io.github.kotlinmania.windowssys.windows.wdk.foundation.FileObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.IoStackLocation
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Irp
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Kevent
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Kmutant
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Kqueue
import io.github.kotlinmania.windowssys.windows.wdk.foundation.KspinLockQueueNumber
import io.github.kotlinmania.windowssys.windows.wdk.foundation.KwaitBlock
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Mdl
import io.github.kotlinmania.windowssys.windows.wdk.foundation.ObjectAttributes
import io.github.kotlinmania.windowssys.windows.wdk.foundation.ObjectInformationClass
import io.github.kotlinmania.windowssys.windows.wdk.foundation.ObjectNameInformation
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Peprocess
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pesilo
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pethread
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pkthread
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PnotifySync
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PobjectType
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PoolType
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Prkprocess
import io.github.kotlinmania.windowssys.windows.wdk.foundation.SectionObjectPointers
import io.github.kotlinmania.windowssys.windows.wdk.foundation.SecuritySubjectContext
import io.github.kotlinmania.windowssys.windows.wdk.foundation.SspiAsyncContext
import io.github.kotlinmania.windowssys.windows.wdk.foundation.TargetDeviceCustomNotification
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Vpb
import io.github.kotlinmania.windowssys.windows.wdk.foundation.WorkQueueItem
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.security.Acl
import io.github.kotlinmania.windowssys.windows.win32.security.AuditEventType
import io.github.kotlinmania.windowssys.windows.win32.security.GenericMapping
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectTypeList
import io.github.kotlinmania.windowssys.windows.win32.security.PrivilegeSet
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.SeImpersonationState
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityImpersonationLevel
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityQualityOfService
import io.github.kotlinmania.windowssys.windows.win32.security.SidIdentifierAuthority
import io.github.kotlinmania.windowssys.windows.win32.security.SidNameUse
import io.github.kotlinmania.windowssys.windows.win32.security.TokenAccessInformation
import io.github.kotlinmania.windowssys.windows.win32.security.TokenGroups
import io.github.kotlinmania.windowssys.windows.win32.security.TokenInformationClass
import io.github.kotlinmania.windowssys.windows.win32.security.TokenPrivileges
import io.github.kotlinmania.windowssys.windows.win32.security.TokenType
import io.github.kotlinmania.windowssys.windows.win32.security.WellKnownSidType
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SeAdtParameterArray
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SecGetKeyFn
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SecurityUserData
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileAccessRights
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileFlagsAndAttributes
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileShareMode
import io.github.kotlinmania.windowssys.windows.win32.system.io.IoStatusBlock
import io.github.kotlinmania.windowssys.windows.win32.system.io.PioApcRoutine
import io.github.kotlinmania.windowssys.windows.win32.system.ioctl.IoIrpExtTrackOffsetHeader
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.EventType
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ListEntry
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.WaitType
import io.github.kotlinmania.windowssys.windows.win32.system.memory.MemExtendedParameter

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun applyControlToken(phcontext: ConstPtr<SecHandle>, pinput: ConstPtr<SecBufferDesc>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemApplyControlToken")

public actual fun ccAsyncCopyRead(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, wait: Boolean, buffer: MutPtr<CVoid>, iostatus: MutPtr<IoStatusBlock>, ioissuerthread: Pethread, asyncreadcontext: ConstPtr<CcAsyncReadContext>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcAsyncCopyRead")

public actual fun ccCanIWrite(fileobject: ConstPtr<FileObject>, bytestowrite: UInt, wait: Boolean, retrying: UByte): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcCanIWrite")

public actual fun ccCoherencyFlushAndPurgeCache(sectionobjectpointer: ConstPtr<SectionObjectPointers>, fileoffset: ConstPtr<Long>, length: UInt, iostatus: MutPtr<IoStatusBlock>, flags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcCoherencyFlushAndPurgeCache")

public actual fun ccCopyRead(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, wait: Boolean, buffer: MutPtr<CVoid>, iostatus: MutPtr<IoStatusBlock>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcCopyRead")

public actual fun ccCopyReadEx(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, wait: Boolean, buffer: MutPtr<CVoid>, iostatus: MutPtr<IoStatusBlock>, ioissuerthread: Pethread): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcCopyReadEx")

public actual fun ccCopyWrite(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, wait: Boolean, buffer: ConstPtr<CVoid>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcCopyWrite")

public actual fun ccCopyWriteEx(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, wait: Boolean, buffer: ConstPtr<CVoid>, ioissuerthread: Pethread): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcCopyWriteEx")

public actual fun ccCopyWriteWontFlush(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcCopyWriteWontFlush")

public actual fun ccDeferWrite(fileobject: ConstPtr<FileObject>, postroutine: PccPostDeferredWrite, context1: ConstPtr<CVoid>, context2: ConstPtr<CVoid>, bytestowrite: UInt, retrying: Boolean): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcDeferWrite")

public actual fun ccErrorCallbackRoutine(context: ConstPtr<CcErrorCallbackContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcErrorCallbackRoutine")

public actual fun ccFastCopyRead(fileobject: ConstPtr<FileObject>, fileoffset: UInt, length: UInt, pagecount: UInt, buffer: MutPtr<CVoid>, iostatus: MutPtr<IoStatusBlock>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcFastCopyRead")

public actual fun ccFastCopyWrite(fileobject: ConstPtr<FileObject>, fileoffset: UInt, length: UInt, buffer: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcFastCopyWrite")

public actual fun ccFlushCache(sectionobjectpointer: ConstPtr<SectionObjectPointers>, fileoffset: ConstPtr<Long>, length: UInt, iostatus: MutPtr<IoStatusBlock>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcFlushCache")

public actual fun ccGetDirtyPages(loghandle: ConstPtr<CVoid>, dirtypageroutine: PdirtyPageRoutine, context1: ConstPtr<CVoid>, context2: ConstPtr<CVoid>): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcGetDirtyPages")

public actual fun ccGetFileObjectFromBcb(bcb: ConstPtr<CVoid>): MutPtr<FileObject> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcGetFileObjectFromBcb")

public actual fun ccGetFileObjectFromSectionPtrs(sectionobjectpointer: ConstPtr<SectionObjectPointers>): MutPtr<FileObject> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcGetFileObjectFromSectionPtrs")

public actual fun ccGetFileObjectFromSectionPtrsRef(sectionobjectpointer: ConstPtr<SectionObjectPointers>): MutPtr<FileObject> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcGetFileObjectFromSectionPtrsRef")

public actual fun ccGetFlushedValidData(sectionobjectpointer: ConstPtr<SectionObjectPointers>, bcblistheld: Boolean): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcGetFlushedValidData")

public actual fun ccInitializeCacheMap(fileobject: ConstPtr<FileObject>, filesizes: ConstPtr<CcFileSizes>, pinaccess: Boolean, callbacks: ConstPtr<CacheManagerCallbacks>, lazywritecontext: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcInitializeCacheMap")

public actual fun ccInitializeCacheMapEx(fileobject: ConstPtr<FileObject>, filesizes: ConstPtr<CcFileSizes>, pinaccess: Boolean, callbacks: ConstPtr<CacheManagerCallbacks>, lazywritecontext: ConstPtr<CVoid>, flags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcInitializeCacheMapEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemCcIsCacheManagerCallbackNeeded")
private external fun wasiWindowssysWindowsWdkStorageFilesystemCcIsCacheManagerCallbackNeeded(status: Int): Int

public actual fun ccIsCacheManagerCallbackNeeded(status: Ntstatus): Boolean =
    (wasiWindowssysWindowsWdkStorageFilesystemCcIsCacheManagerCallbackNeeded(status) != 0)

public actual fun ccIsThereDirtyData(vpb: ConstPtr<Vpb>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcIsThereDirtyData")

public actual fun ccIsThereDirtyDataEx(vpb: ConstPtr<Vpb>, numberofdirtypages: ConstPtr<UInt>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcIsThereDirtyDataEx")

public actual fun ccMapData(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, flags: UInt, bcb: MutPtr<MutPtr<CVoid>>, buffer: MutPtr<MutPtr<CVoid>>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcMapData")

public actual fun ccMdlRead(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, mdlchain: MutPtr<MutPtr<Mdl>>, iostatus: MutPtr<IoStatusBlock>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcMdlRead")

public actual fun ccMdlReadComplete(fileobject: ConstPtr<FileObject>, mdlchain: ConstPtr<Mdl>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcMdlReadComplete")

public actual fun ccMdlWriteAbort(fileobject: ConstPtr<FileObject>, mdlchain: ConstPtr<Mdl>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcMdlWriteAbort")

public actual fun ccMdlWriteComplete(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, mdlchain: ConstPtr<Mdl>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcMdlWriteComplete")

public actual fun ccPinMappedData(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, flags: UInt, bcb: MutPtr<MutPtr<CVoid>>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcPinMappedData")

public actual fun ccPinRead(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, flags: UInt, bcb: MutPtr<MutPtr<CVoid>>, buffer: MutPtr<MutPtr<CVoid>>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcPinRead")

public actual fun ccPrepareMdlWrite(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, mdlchain: MutPtr<MutPtr<Mdl>>, iostatus: MutPtr<IoStatusBlock>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcPrepareMdlWrite")

public actual fun ccPreparePinWrite(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, zero: Boolean, flags: UInt, bcb: MutPtr<MutPtr<CVoid>>, buffer: MutPtr<MutPtr<CVoid>>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcPreparePinWrite")

public actual fun ccPurgeCacheSection(sectionobjectpointer: ConstPtr<SectionObjectPointers>, fileoffset: ConstPtr<Long>, length: UInt, flags: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcPurgeCacheSection")

public actual fun ccRemapBcb(bcb: ConstPtr<CVoid>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcRemapBcb")

public actual fun ccRepinBcb(bcb: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcRepinBcb")

public actual fun ccScheduleReadAhead(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcScheduleReadAhead")

public actual fun ccScheduleReadAheadEx(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, ioissuerthread: Pethread): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcScheduleReadAheadEx")

public actual fun ccSetAdditionalCacheAttributes(fileobject: ConstPtr<FileObject>, disablereadahead: Boolean, disablewritebehind: Boolean): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcSetAdditionalCacheAttributes")

public actual fun ccSetAdditionalCacheAttributesEx(fileobject: ConstPtr<FileObject>, flags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcSetAdditionalCacheAttributesEx")

public actual fun ccSetBcbOwnerPointer(bcb: ConstPtr<CVoid>, ownerpointer: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcSetBcbOwnerPointer")

public actual fun ccSetDirtyPageThreshold(fileobject: ConstPtr<FileObject>, dirtypagethreshold: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcSetDirtyPageThreshold")

public actual fun ccSetDirtyPinnedData(bcbvoid: ConstPtr<CVoid>, lsn: ConstPtr<Long>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcSetDirtyPinnedData")

public actual fun ccSetFileSizes(fileobject: ConstPtr<FileObject>, filesizes: ConstPtr<CcFileSizes>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcSetFileSizes")

public actual fun ccSetFileSizesEx(fileobject: ConstPtr<FileObject>, filesizes: ConstPtr<CcFileSizes>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcSetFileSizesEx")

public actual fun ccSetLogHandleForFile(fileobject: ConstPtr<FileObject>, loghandle: ConstPtr<CVoid>, flushtolsnroutine: PflushToLsn): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcSetLogHandleForFile")

public actual fun ccSetParallelFlushFile(fileobject: ConstPtr<FileObject>, enableparallelflush: Boolean): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcSetParallelFlushFile")

public actual fun ccSetReadAheadGranularity(fileobject: ConstPtr<FileObject>, granularity: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcSetReadAheadGranularity")

public actual fun ccUninitializeCacheMap(fileobject: ConstPtr<FileObject>, truncatesize: ConstPtr<Long>, uninitializeevent: ConstPtr<CacheUninitializeEvent>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcUninitializeCacheMap")

public actual fun ccUnpinData(bcb: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcUnpinData")

public actual fun ccUnpinDataForThread(bcb: ConstPtr<CVoid>, resourcethreadid: ULong): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcUnpinDataForThread")

public actual fun ccUnpinRepinnedBcb(bcb: ConstPtr<CVoid>, writethrough: Boolean, iostatus: MutPtr<IoStatusBlock>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcUnpinRepinnedBcb")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemCcWaitForCurrentLazyWriterActivity")
private external fun wasiWindowssysWindowsWdkStorageFilesystemCcWaitForCurrentLazyWriterActivity(): Int

public actual fun ccWaitForCurrentLazyWriterActivity(): Ntstatus =
    wasiWindowssysWindowsWdkStorageFilesystemCcWaitForCurrentLazyWriterActivity()

public actual fun ccZeroData(fileobject: ConstPtr<FileObject>, startoffset: ConstPtr<Long>, endoffset: ConstPtr<Long>, wait: Boolean): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcZeroData")

public actual fun completeAuthToken(phcontext: ConstPtr<SecHandle>, ptoken: ConstPtr<SecBufferDesc>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCompleteAuthToken")

public actual fun exDisableResourceBoostLite(resource: ConstPtr<Eresource>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemExDisableResourceBoostLite")

public actual fun exQueryPoolBlockSize(poolblock: ConstPtr<CVoid>, quotacharged: MutPtr<Boolean>): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemExQueryPoolBlockSize")

public actual fun exportSecurityContext(phcontext: ConstPtr<SecHandle>, fflags: UInt, ppackedcontext: MutPtr<SecBuffer>, ptoken: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemExportSecurityContext")

public actual fun fsRtlAcknowledgeEcp(ecpcontext: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAcknowledgeEcp")

public actual fun fsRtlAcquireFileExclusive(fileobject: ConstPtr<FileObject>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAcquireFileExclusive")

public actual fun fsRtlAddBaseMcbEntry(mcb: MutPtr<BaseMcb>, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAddBaseMcbEntry")

public actual fun fsRtlAddBaseMcbEntryEx(mcb: MutPtr<BaseMcb>, vbn: Long, lbn: Long, sectorcount: Long): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAddBaseMcbEntryEx")

public actual fun fsRtlAddLargeMcbEntry(mcb: MutPtr<LargeMcb>, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAddLargeMcbEntry")

public actual fun fsRtlAddMcbEntry(mcb: MutPtr<Mcb>, vbn: UInt, lbn: UInt, sectorcount: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAddMcbEntry")

public actual fun fsRtlAddToTunnelCache(cache: MutPtr<Tunnel>, directorykey: ULong, shortname: ConstPtr<UnicodeString>, longname: ConstPtr<UnicodeString>, keybyshortname: Boolean, datalength: UInt, data: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAddToTunnelCache")

public actual fun fsRtlAddToTunnelCacheEx(cache: MutPtr<Tunnel>, directorykey: ULong, shortname: ConstPtr<UnicodeString>, longname: ConstPtr<UnicodeString>, flags: UInt, datalength: UInt, data: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAddToTunnelCacheEx")

public actual fun fsRtlAllocateAePushLock(pooltype: PoolType, tag: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAllocateAePushLock")

public actual fun fsRtlAllocateExtraCreateParameter(ecptype: ConstPtr<Guid>, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, pooltag: UInt, ecpcontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAllocateExtraCreateParameter")

public actual fun fsRtlAllocateExtraCreateParameterFromLookasideList(ecptype: ConstPtr<Guid>, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, lookasidelist: MutPtr<CVoid>, ecpcontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAllocateExtraCreateParameterFromLookasideList")

public actual fun fsRtlAllocateExtraCreateParameterList(flags: UInt, ecplist: MutPtr<MutPtr<EcpList>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAllocateExtraCreateParameterList")

public actual fun fsRtlAllocateFileLock(completelockirproutine: PcompleteLockIrpRoutine, unlockroutine: PunlockRoutine): MutPtr<FileLock> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAllocateFileLock")

public actual fun fsRtlAllocateResource(): MutPtr<Eresource> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAllocateResource")

public actual fun fsRtlAreNamesEqual(constantnamea: ConstPtr<UnicodeString>, constantnameb: ConstPtr<UnicodeString>, ignorecase: Boolean, upcasetable: ConstPtr<UShort>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAreNamesEqual")

public actual fun fsRtlAreThereCurrentOrInProgressFileLocks(filelock: ConstPtr<FileLock>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAreThereCurrentOrInProgressFileLocks")

public actual fun fsRtlAreThereWaitingFileLocks(filelock: ConstPtr<FileLock>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAreThereWaitingFileLocks")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemFsRtlAreVolumeStartupApplicationsComplete")
private external fun wasiWindowssysWindowsWdkStorageFilesystemFsRtlAreVolumeStartupApplicationsComplete(): Int

public actual fun fsRtlAreVolumeStartupApplicationsComplete(): Boolean =
    (wasiWindowssysWindowsWdkStorageFilesystemFsRtlAreVolumeStartupApplicationsComplete() != 0)

public actual fun fsRtlBalanceReads(targetdevice: ConstPtr<DeviceObject>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlBalanceReads")

public actual fun fsRtlCancellableWaitForMultipleObjects(count: UInt, objectarray: ConstPtr<ConstPtr<CVoid>>, waittype: WaitType, timeout: ConstPtr<Long>, waitblockarray: ConstPtr<KwaitBlock>, irp: ConstPtr<Irp>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlCancellableWaitForMultipleObjects")

public actual fun fsRtlCancellableWaitForSingleObject(obj: ConstPtr<CVoid>, timeout: ConstPtr<Long>, irp: ConstPtr<Irp>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlCancellableWaitForSingleObject")

public actual fun fsRtlChangeBackingFileObject(currentfileobject: ConstPtr<FileObject>, newfileobject: ConstPtr<FileObject>, changebackingtype: FsrtlChangeBackingType, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlChangeBackingFileObject")

public actual fun fsRtlCheckLockForOplockRequest(filelock: ConstPtr<FileLock>, allocationsize: ConstPtr<Long>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlCheckLockForOplockRequest")

public actual fun fsRtlCheckLockForReadAccess(filelock: ConstPtr<FileLock>, irp: ConstPtr<Irp>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlCheckLockForReadAccess")

public actual fun fsRtlCheckLockForWriteAccess(filelock: ConstPtr<FileLock>, irp: ConstPtr<Irp>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlCheckLockForWriteAccess")

public actual fun fsRtlCheckOplock(oplock: ConstPtr<ConstPtr<CVoid>>, irp: ConstPtr<Irp>, context: ConstPtr<CVoid>, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlCheckOplock")

public actual fun fsRtlCheckOplockEx(oplock: ConstPtr<ConstPtr<CVoid>>, irp: ConstPtr<Irp>, flags: UInt, context: ConstPtr<CVoid>, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlCheckOplockEx")

public actual fun fsRtlCheckOplockEx2(oplock: ConstPtr<ConstPtr<CVoid>>, irp: ConstPtr<Irp>, flags: UInt, flagsex2: UInt, completionroutinecontext: ConstPtr<CVoid>, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp, timeout: ULong, notifycontext: ConstPtr<CVoid>, notifyroutine: PoplockNotifyRoutine): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlCheckOplockEx2")

public actual fun fsRtlCheckUpperOplock(oplock: ConstPtr<ConstPtr<CVoid>>, newloweroplockstate: UInt, completionroutinecontext: ConstPtr<CVoid>, completionroutine: PoplockWaitCompleteRoutine, prependroutine: PoplockFsPrepostIrp, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlCheckUpperOplock")

public actual fun fsRtlCopyRead(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, wait: Boolean, lockkey: UInt, buffer: MutPtr<CVoid>, iostatus: MutPtr<IoStatusBlock>, deviceobject: ConstPtr<DeviceObject>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlCopyRead")

public actual fun fsRtlCopyWrite(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, wait: Boolean, lockkey: UInt, buffer: ConstPtr<CVoid>, iostatus: MutPtr<IoStatusBlock>, deviceobject: ConstPtr<DeviceObject>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlCopyWrite")

public actual fun fsRtlCreateSectionForDataScan(sectionhandle: MutPtr<Handle>, sectionobject: MutPtr<MutPtr<CVoid>>, sectionfilesize: MutPtr<Long>, fileobject: ConstPtr<FileObject>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, maximumsize: ConstPtr<Long>, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlCreateSectionForDataScan")

public actual fun fsRtlCurrentBatchOplock(oplock: ConstPtr<ConstPtr<CVoid>>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlCurrentBatchOplock")

public actual fun fsRtlCurrentOplock(oplock: ConstPtr<ConstPtr<CVoid>>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlCurrentOplock")

public actual fun fsRtlCurrentOplockH(oplock: ConstPtr<ConstPtr<CVoid>>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlCurrentOplockH")

public actual fun fsRtlDeleteExtraCreateParameterLookasideList(lookaside: MutPtr<CVoid>, flags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlDeleteExtraCreateParameterLookasideList")

public actual fun fsRtlDeleteKeyFromTunnelCache(cache: MutPtr<Tunnel>, directorykey: ULong): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlDeleteKeyFromTunnelCache")

public actual fun fsRtlDeleteTunnelCache(cache: MutPtr<Tunnel>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlDeleteTunnelCache")

public actual fun fsRtlDeregisterUncProvider(handle: Handle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlDeregisterUncProvider")

public actual fun fsRtlDismountComplete(deviceobject: ConstPtr<DeviceObject>, dismountstatus: Ntstatus): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlDismountComplete")

public actual fun fsRtlDissectDbcs(path: io.github.kotlinmania.windowssys.windows.win32.system.kernel.String, firstname: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, remainingname: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlDissectDbcs")

public actual fun fsRtlDissectName(path: UnicodeString, firstname: MutPtr<UnicodeString>, remainingname: MutPtr<UnicodeString>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlDissectName")

public actual fun fsRtlDoesDbcsContainWildCards(name: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlDoesDbcsContainWildCards")

public actual fun fsRtlDoesNameContainWildCards(name: ConstPtr<UnicodeString>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlDoesNameContainWildCards")

public actual fun fsRtlFastCheckLockForRead(filelock: ConstPtr<FileLock>, startingbyte: ConstPtr<Long>, length: ConstPtr<Long>, key: UInt, fileobject: ConstPtr<FileObject>, processid: ConstPtr<CVoid>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlFastCheckLockForRead")

public actual fun fsRtlFastCheckLockForWrite(filelock: ConstPtr<FileLock>, startingbyte: ConstPtr<Long>, length: ConstPtr<Long>, key: UInt, fileobject: ConstPtr<CVoid>, processid: ConstPtr<CVoid>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlFastCheckLockForWrite")

public actual fun fsRtlFastUnlockAll(filelock: ConstPtr<FileLock>, fileobject: ConstPtr<FileObject>, processid: Peprocess, context: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlFastUnlockAll")

public actual fun fsRtlFastUnlockAllByKey(filelock: ConstPtr<FileLock>, fileobject: ConstPtr<FileObject>, processid: Peprocess, key: UInt, context: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlFastUnlockAllByKey")

public actual fun fsRtlFastUnlockSingle(filelock: ConstPtr<FileLock>, fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: ConstPtr<Long>, processid: Peprocess, key: UInt, context: ConstPtr<CVoid>, alreadysynchronized: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlFastUnlockSingle")

public actual fun fsRtlFindExtraCreateParameter(ecplist: ConstPtr<EcpList>, ecptype: ConstPtr<Guid>, ecpcontext: MutPtr<MutPtr<CVoid>>, ecpcontextsize: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlFindExtraCreateParameter")

public actual fun fsRtlFindInTunnelCache(cache: ConstPtr<Tunnel>, directorykey: ULong, name: ConstPtr<UnicodeString>, shortname: MutPtr<UnicodeString>, longname: MutPtr<UnicodeString>, datalength: MutPtr<UInt>, data: MutPtr<CVoid>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlFindInTunnelCache")

public actual fun fsRtlFindInTunnelCacheEx(cache: ConstPtr<Tunnel>, directorykey: ULong, name: ConstPtr<UnicodeString>, shortname: MutPtr<UnicodeString>, longname: MutPtr<UnicodeString>, flags: UInt, datalength: MutPtr<UInt>, data: MutPtr<CVoid>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlFindInTunnelCacheEx")

public actual fun fsRtlFreeAePushLock(aepushlock: MutPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlFreeAePushLock")

public actual fun fsRtlFreeExtraCreateParameter(ecpcontext: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlFreeExtraCreateParameter")

public actual fun fsRtlFreeExtraCreateParameterList(ecplist: ConstPtr<EcpList>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlFreeExtraCreateParameterList")

public actual fun fsRtlFreeFileLock(filelock: ConstPtr<FileLock>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlFreeFileLock")

public actual fun fsRtlGetCurrentProcessLoaderList(): MutPtr<ListEntry> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlGetCurrentProcessLoaderList")

public actual fun fsRtlGetEcpListFromIrp(irp: ConstPtr<Irp>, ecplist: MutPtr<MutPtr<EcpList>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlGetEcpListFromIrp")

public actual fun fsRtlGetFileSize(fileobject: ConstPtr<FileObject>, filesize: MutPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlGetFileSize")

public actual fun fsRtlGetNextBaseMcbEntry(mcb: ConstPtr<BaseMcb>, runindex: UInt, vbn: MutPtr<Long>, lbn: MutPtr<Long>, sectorcount: MutPtr<Long>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlGetNextBaseMcbEntry")

public actual fun fsRtlGetNextExtraCreateParameter(ecplist: ConstPtr<EcpList>, currentecpcontext: ConstPtr<CVoid>, nextecptype: MutPtr<Guid>, nextecpcontext: MutPtr<MutPtr<CVoid>>, nextecpcontextsize: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlGetNextExtraCreateParameter")

public actual fun fsRtlGetNextFileLock(filelock: ConstPtr<FileLock>, restart: Boolean): MutPtr<FileLockInfo> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlGetNextFileLock")

public actual fun fsRtlGetNextLargeMcbEntry(mcb: ConstPtr<LargeMcb>, runindex: UInt, vbn: MutPtr<Long>, lbn: MutPtr<Long>, sectorcount: MutPtr<Long>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlGetNextLargeMcbEntry")

public actual fun fsRtlGetNextMcbEntry(mcb: ConstPtr<Mcb>, runindex: UInt, vbn: MutPtr<UInt>, lbn: MutPtr<UInt>, sectorcount: MutPtr<UInt>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlGetNextMcbEntry")

public actual fun fsRtlGetSectorSizeInformation(deviceobject: ConstPtr<DeviceObject>, sectorsizeinfo: MutPtr<FileFsSectorSizeInformation>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlGetSectorSizeInformation")

public actual fun fsRtlGetSupportedFeatures(deviceobject: ConstPtr<DeviceObject>, supportedfeatures: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlGetSupportedFeatures")

public actual fun fsRtlGetVirtualDiskNestingLevel(deviceobject: ConstPtr<DeviceObject>, nestinglevel: MutPtr<UInt>, nestingflags: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlGetVirtualDiskNestingLevel")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastMdlReadWait")
private external fun wasiWindowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastMdlReadWait(): Unit

public actual fun fsRtlIncrementCcFastMdlReadWait(): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastMdlReadWait()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadNoWait")
private external fun wasiWindowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadNoWait(): Unit

public actual fun fsRtlIncrementCcFastReadNoWait(): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadNoWait()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadNotPossible")
private external fun wasiWindowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadNotPossible(): Unit

public actual fun fsRtlIncrementCcFastReadNotPossible(): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadNotPossible()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadResourceMiss")
private external fun wasiWindowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadResourceMiss(): Unit

public actual fun fsRtlIncrementCcFastReadResourceMiss(): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadResourceMiss()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadWait")
private external fun wasiWindowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadWait(): Unit

public actual fun fsRtlIncrementCcFastReadWait(): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadWait()

public actual fun fsRtlInitExtraCreateParameterLookasideList(lookaside: MutPtr<CVoid>, flags: UInt, size: ULong, tag: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlInitExtraCreateParameterLookasideList")

public actual fun fsRtlInitializeBaseMcb(mcb: MutPtr<BaseMcb>, pooltype: PoolType): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlInitializeBaseMcb")

public actual fun fsRtlInitializeBaseMcbEx(mcb: MutPtr<BaseMcb>, pooltype: PoolType, flags: UShort): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlInitializeBaseMcbEx")

public actual fun fsRtlInitializeExtraCreateParameter(ecp: MutPtr<EcpHeader>, ecpflags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, totalsize: UInt, ecptype: ConstPtr<Guid>, listallocatedfrom: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlInitializeExtraCreateParameter")

public actual fun fsRtlInitializeExtraCreateParameterList(ecplist: MutPtr<EcpList>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlInitializeExtraCreateParameterList")

public actual fun fsRtlInitializeFileLock(filelock: MutPtr<FileLock>, completelockirproutine: PcompleteLockIrpRoutine, unlockroutine: PunlockRoutine): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlInitializeFileLock")

public actual fun fsRtlInitializeLargeMcb(mcb: MutPtr<LargeMcb>, pooltype: PoolType): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlInitializeLargeMcb")

public actual fun fsRtlInitializeMcb(mcb: MutPtr<Mcb>, pooltype: PoolType): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlInitializeMcb")

public actual fun fsRtlInitializeOplock(oplock: MutPtr<MutPtr<CVoid>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlInitializeOplock")

public actual fun fsRtlInitializeTunnelCache(cache: MutPtr<Tunnel>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlInitializeTunnelCache")

public actual fun fsRtlInsertExtraCreateParameter(ecplist: MutPtr<EcpList>, ecpcontext: MutPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlInsertExtraCreateParameter")

public actual fun fsRtlInsertPerFileContext(perfilecontextpointer: ConstPtr<ConstPtr<CVoid>>, ptr: ConstPtr<FsrtlPerFileContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlInsertPerFileContext")

public actual fun fsRtlInsertPerFileObjectContext(fileobject: ConstPtr<FileObject>, ptr: ConstPtr<FsrtlPerFileobjectContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlInsertPerFileObjectContext")

public actual fun fsRtlInsertPerStreamContext(perstreamcontext: ConstPtr<FsrtlAdvancedFcbHeader>, ptr: ConstPtr<FsrtlPerStreamContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlInsertPerStreamContext")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemFsRtlIs32BitProcess")
private external fun wasiWindowssysWindowsWdkStorageFilesystemFsRtlIs32BitProcess(process: Long): Int

public actual fun fsRtlIs32BitProcess(process: Peprocess): Boolean =
    (wasiWindowssysWindowsWdkStorageFilesystemFsRtlIs32BitProcess(process) != 0)

public actual fun fsRtlIsDaxVolume(fileobject: ConstPtr<FileObject>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlIsDaxVolume")

public actual fun fsRtlIsDbcsInExpression(expression: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, name: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlIsDbcsInExpression")

public actual fun fsRtlIsEcpAcknowledged(ecpcontext: ConstPtr<CVoid>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlIsEcpAcknowledged")

public actual fun fsRtlIsEcpFromUserMode(ecpcontext: ConstPtr<CVoid>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlIsEcpFromUserMode")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemFsRtlIsExtentDangling")
private external fun wasiWindowssysWindowsWdkStorageFilesystemFsRtlIsExtentDangling(startpage: Int, numberofpages: Int, flags: Int): Int

public actual fun fsRtlIsExtentDangling(startpage: UInt, numberofpages: UInt, flags: UInt): UInt =
    wasiWindowssysWindowsWdkStorageFilesystemFsRtlIsExtentDangling(startpage.toInt(), numberofpages.toInt(), flags.toInt()).toUInt()

public actual fun fsRtlIsFatDbcsLegal(dbcsname: io.github.kotlinmania.windowssys.windows.win32.system.kernel.String, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlIsFatDbcsLegal")

public actual fun fsRtlIsHpfsDbcsLegal(dbcsname: io.github.kotlinmania.windowssys.windows.win32.system.kernel.String, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlIsHpfsDbcsLegal")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemFsRtlIsMobileOS")
private external fun wasiWindowssysWindowsWdkStorageFilesystemFsRtlIsMobileOS(): Int

public actual fun fsRtlIsMobileOS(): Boolean =
    (wasiWindowssysWindowsWdkStorageFilesystemFsRtlIsMobileOS() != 0)

public actual fun fsRtlIsNameInExpression(expression: ConstPtr<UnicodeString>, name: ConstPtr<UnicodeString>, ignorecase: Boolean, upcasetable: Pcwstr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlIsNameInExpression")

public actual fun fsRtlIsNameInUnUpcasedExpression(expression: ConstPtr<UnicodeString>, name: ConstPtr<UnicodeString>, ignorecase: Boolean, upcasetable: Pcwstr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlIsNameInUnUpcasedExpression")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemFsRtlIsNonEmptyDirectoryReparsePointAllowed")
private external fun wasiWindowssysWindowsWdkStorageFilesystemFsRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: Int): Int

public actual fun fsRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean =
    (wasiWindowssysWindowsWdkStorageFilesystemFsRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag.toInt()) != 0)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemFsRtlIsNtstatusExpected")
private external fun wasiWindowssysWindowsWdkStorageFilesystemFsRtlIsNtstatusExpected(exception: Int): Int

public actual fun fsRtlIsNtstatusExpected(exception: Ntstatus): Boolean =
    (wasiWindowssysWindowsWdkStorageFilesystemFsRtlIsNtstatusExpected(exception) != 0)

public actual fun fsRtlIsPagingFile(fileobject: ConstPtr<FileObject>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlIsPagingFile")

public actual fun fsRtlIsSystemPagingFile(fileobject: ConstPtr<FileObject>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlIsSystemPagingFile")

public actual fun fsRtlIssueDeviceIoControl(deviceobject: ConstPtr<DeviceObject>, ioctl: UInt, flags: UByte, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: ConstPtr<CVoid>, outputbufferlength: UInt, iosbinformation: MutPtr<ULong>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlIssueDeviceIoControl")

public actual fun fsRtlKernelFsControlFile(fileobject: ConstPtr<FileObject>, fscontrolcode: UInt, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt, retoutputbuffersize: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlKernelFsControlFile")

public actual fun fsRtlLogCcFlushError(filename: ConstPtr<UnicodeString>, deviceobject: ConstPtr<DeviceObject>, sectionobjectpointer: ConstPtr<SectionObjectPointers>, flusherror: Ntstatus, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlLogCcFlushError")

public actual fun fsRtlLookupBaseMcbEntry(mcb: ConstPtr<BaseMcb>, vbn: Long, lbn: MutPtr<Long>, sectorcountfromlbn: MutPtr<Long>, startinglbn: MutPtr<Long>, sectorcountfromstartinglbn: MutPtr<Long>, index: MutPtr<UInt>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlLookupBaseMcbEntry")

public actual fun fsRtlLookupLargeMcbEntry(mcb: ConstPtr<LargeMcb>, vbn: Long, lbn: MutPtr<Long>, sectorcountfromlbn: MutPtr<Long>, startinglbn: MutPtr<Long>, sectorcountfromstartinglbn: MutPtr<Long>, index: MutPtr<UInt>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlLookupLargeMcbEntry")

public actual fun fsRtlLookupLastBaseMcbEntry(mcb: ConstPtr<BaseMcb>, vbn: MutPtr<Long>, lbn: MutPtr<Long>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlLookupLastBaseMcbEntry")

public actual fun fsRtlLookupLastBaseMcbEntryAndIndex(opaquemcb: ConstPtr<BaseMcb>, largevbn: MutPtr<Long>, largelbn: MutPtr<Long>, index: MutPtr<UInt>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlLookupLastBaseMcbEntryAndIndex")

public actual fun fsRtlLookupLastLargeMcbEntry(mcb: ConstPtr<LargeMcb>, vbn: MutPtr<Long>, lbn: MutPtr<Long>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlLookupLastLargeMcbEntry")

public actual fun fsRtlLookupLastLargeMcbEntryAndIndex(opaquemcb: ConstPtr<LargeMcb>, largevbn: MutPtr<Long>, largelbn: MutPtr<Long>, index: MutPtr<UInt>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlLookupLastLargeMcbEntryAndIndex")

public actual fun fsRtlLookupLastMcbEntry(mcb: ConstPtr<Mcb>, vbn: MutPtr<UInt>, lbn: MutPtr<UInt>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlLookupLastMcbEntry")

public actual fun fsRtlLookupMcbEntry(mcb: ConstPtr<Mcb>, vbn: UInt, lbn: MutPtr<UInt>, sectorcount: MutPtr<UInt>, index: MutPtr<UInt>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlLookupMcbEntry")

public actual fun fsRtlLookupPerFileContext(perfilecontextpointer: ConstPtr<ConstPtr<CVoid>>, ownerid: ConstPtr<CVoid>, instanceid: ConstPtr<CVoid>): MutPtr<FsrtlPerFileContext> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlLookupPerFileContext")

public actual fun fsRtlLookupPerFileObjectContext(fileobject: ConstPtr<FileObject>, ownerid: ConstPtr<CVoid>, instanceid: ConstPtr<CVoid>): MutPtr<FsrtlPerFileobjectContext> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlLookupPerFileObjectContext")

public actual fun fsRtlLookupPerStreamContextInternal(streamcontext: ConstPtr<FsrtlAdvancedFcbHeader>, ownerid: ConstPtr<CVoid>, instanceid: ConstPtr<CVoid>): MutPtr<FsrtlPerStreamContext> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlLookupPerStreamContextInternal")

public actual fun fsRtlMdlReadCompleteDev(fileobject: ConstPtr<FileObject>, mdlchain: ConstPtr<Mdl>, deviceobject: ConstPtr<DeviceObject>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlMdlReadCompleteDev")

public actual fun fsRtlMdlReadDev(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, lockkey: UInt, mdlchain: MutPtr<MutPtr<Mdl>>, iostatus: MutPtr<IoStatusBlock>, deviceobject: ConstPtr<DeviceObject>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlMdlReadDev")

public actual fun fsRtlMdlReadEx(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, lockkey: UInt, mdlchain: MutPtr<MutPtr<Mdl>>, iostatus: MutPtr<IoStatusBlock>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlMdlReadEx")

public actual fun fsRtlMdlWriteCompleteDev(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, mdlchain: ConstPtr<Mdl>, deviceobject: ConstPtr<DeviceObject>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlMdlWriteCompleteDev")

public actual fun fsRtlMupGetProviderIdFromName(pprovidername: ConstPtr<UnicodeString>, pproviderid: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlMupGetProviderIdFromName")

public actual fun fsRtlMupGetProviderInfoFromFileObject(pfileobject: ConstPtr<FileObject>, level: UInt, pbuffer: MutPtr<CVoid>, pbuffersize: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlMupGetProviderInfoFromFileObject")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemFsRtlNormalizeNtstatus")
private external fun wasiWindowssysWindowsWdkStorageFilesystemFsRtlNormalizeNtstatus(exception: Int, genericexception: Int): Int

public actual fun fsRtlNormalizeNtstatus(exception: Ntstatus, genericexception: Ntstatus): Ntstatus =
    wasiWindowssysWindowsWdkStorageFilesystemFsRtlNormalizeNtstatus(exception, genericexception)

public actual fun fsRtlNotifyCleanup(notifysync: PnotifySync, notifylist: ConstPtr<ListEntry>, fscontext: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlNotifyCleanup")

public actual fun fsRtlNotifyCleanupAll(notifysync: PnotifySync, notifylist: ConstPtr<ListEntry>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlNotifyCleanupAll")

public actual fun fsRtlNotifyFilterChangeDirectory(notifysync: PnotifySync, notifylist: ConstPtr<ListEntry>, fscontext: ConstPtr<CVoid>, fulldirectoryname: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: ConstPtr<Irp>, traversecallback: PcheckForTraverseAccess, subjectcontext: ConstPtr<SecuritySubjectContext>, filtercallback: PfilterReportChange): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlNotifyFilterChangeDirectory")

public actual fun fsRtlNotifyFilterReportChange(notifysync: PnotifySync, notifylist: ConstPtr<ListEntry>, fulltargetname: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, targetnameoffset: UShort, streamname: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, normalizedparentname: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, filtermatch: UInt, action: UInt, targetcontext: ConstPtr<CVoid>, filtercontext: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlNotifyFilterReportChange")

public actual fun fsRtlNotifyFullChangeDirectory(notifysync: PnotifySync, notifylist: ConstPtr<ListEntry>, fscontext: ConstPtr<CVoid>, fulldirectoryname: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: ConstPtr<Irp>, traversecallback: PcheckForTraverseAccess, subjectcontext: ConstPtr<SecuritySubjectContext>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlNotifyFullChangeDirectory")

public actual fun fsRtlNotifyFullReportChange(notifysync: PnotifySync, notifylist: ConstPtr<ListEntry>, fulltargetname: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, targetnameoffset: UShort, streamname: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, normalizedparentname: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, filtermatch: UInt, action: UInt, targetcontext: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlNotifyFullReportChange")

public actual fun fsRtlNotifyInitializeSync(notifysync: MutPtr<PnotifySync>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlNotifyInitializeSync")

public actual fun fsRtlNotifyUninitializeSync(notifysync: MutPtr<PnotifySync>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlNotifyUninitializeSync")

public actual fun fsRtlNotifyVolumeEvent(fileobject: ConstPtr<FileObject>, eventcode: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlNotifyVolumeEvent")

public actual fun fsRtlNotifyVolumeEventEx(fileobject: ConstPtr<FileObject>, eventcode: UInt, event: ConstPtr<TargetDeviceCustomNotification>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlNotifyVolumeEventEx")

public actual fun fsRtlNumberOfRunsInBaseMcb(mcb: ConstPtr<BaseMcb>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlNumberOfRunsInBaseMcb")

public actual fun fsRtlNumberOfRunsInLargeMcb(mcb: ConstPtr<LargeMcb>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlNumberOfRunsInLargeMcb")

public actual fun fsRtlNumberOfRunsInMcb(mcb: ConstPtr<Mcb>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlNumberOfRunsInMcb")

public actual fun fsRtlOplockBreakH(oplock: ConstPtr<ConstPtr<CVoid>>, irp: ConstPtr<Irp>, flags: UInt, context: ConstPtr<CVoid>, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlOplockBreakH")

public actual fun fsRtlOplockBreakH2(oplock: ConstPtr<ConstPtr<CVoid>>, irp: ConstPtr<Irp>, flags: UInt, context: ConstPtr<CVoid>, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp, grantedaccess: ConstPtr<UInt>, shareaccess: ConstPtr<UShort>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlOplockBreakH2")

public actual fun fsRtlOplockBreakToNone(oplock: MutPtr<MutPtr<CVoid>>, irpsp: ConstPtr<IoStackLocation>, irp: ConstPtr<Irp>, context: ConstPtr<CVoid>, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlOplockBreakToNone")

public actual fun fsRtlOplockBreakToNoneEx(oplock: MutPtr<MutPtr<CVoid>>, irp: ConstPtr<Irp>, flags: UInt, context: ConstPtr<CVoid>, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlOplockBreakToNoneEx")

public actual fun fsRtlOplockFsctrl(oplock: ConstPtr<ConstPtr<CVoid>>, irp: ConstPtr<Irp>, opencount: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlOplockFsctrl")

public actual fun fsRtlOplockFsctrlEx(oplock: ConstPtr<ConstPtr<CVoid>>, irp: ConstPtr<Irp>, opencount: UInt, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlOplockFsctrlEx")

public actual fun fsRtlOplockGetAnyBreakOwnerProcess(oplock: ConstPtr<ConstPtr<CVoid>>): Peprocess =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlOplockGetAnyBreakOwnerProcess")

public actual fun fsRtlOplockIsFastIoPossible(oplock: ConstPtr<ConstPtr<CVoid>>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlOplockIsFastIoPossible")

public actual fun fsRtlOplockIsSharedRequest(irp: ConstPtr<Irp>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlOplockIsSharedRequest")

public actual fun fsRtlOplockKeysEqual(fo1: ConstPtr<FileObject>, fo2: ConstPtr<FileObject>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlOplockKeysEqual")

public actual fun fsRtlPostPagingFileStackOverflow(context: ConstPtr<CVoid>, event: ConstPtr<Kevent>, stackoverflowroutine: PfsrtlStackOverflowRoutine): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlPostPagingFileStackOverflow")

public actual fun fsRtlPostStackOverflow(context: ConstPtr<CVoid>, event: ConstPtr<Kevent>, stackoverflowroutine: PfsrtlStackOverflowRoutine): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlPostStackOverflow")

public actual fun fsRtlPrepareMdlWriteDev(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, lockkey: UInt, mdlchain: MutPtr<MutPtr<Mdl>>, iostatus: MutPtr<IoStatusBlock>, deviceobject: ConstPtr<DeviceObject>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlPrepareMdlWriteDev")

public actual fun fsRtlPrepareMdlWriteEx(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, lockkey: UInt, mdlchain: MutPtr<MutPtr<Mdl>>, iostatus: MutPtr<IoStatusBlock>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlPrepareMdlWriteEx")

public actual fun fsRtlPrepareToReuseEcp(ecpcontext: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlPrepareToReuseEcp")

public actual fun fsRtlPrivateLock(filelock: ConstPtr<FileLock>, fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: ConstPtr<Long>, processid: Peprocess, key: UInt, failimmediately: Boolean, exclusivelock: Boolean, iosb: MutPtr<IoStatusBlock>, irp: ConstPtr<Irp>, context: ConstPtr<CVoid>, alreadysynchronized: Boolean): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlPrivateLock")

public actual fun fsRtlProcessFileLock(filelock: ConstPtr<FileLock>, irp: ConstPtr<Irp>, context: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlProcessFileLock")

public actual fun fsRtlQueryCachedVdl(fileobject: ConstPtr<FileObject>, vdl: MutPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlQueryCachedVdl")

public actual fun fsRtlQueryInformationFile(fileobject: ConstPtr<FileObject>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass, retfileinformationsize: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlQueryInformationFile")

public actual fun fsRtlQueryKernelEaFile(fileobject: ConstPtr<FileObject>, returnedeadata: MutPtr<CVoid>, length: UInt, returnsingleentry: Boolean, ealist: ConstPtr<CVoid>, ealistlength: UInt, eaindex: ConstPtr<UInt>, restartscan: Boolean, lengthreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlQueryKernelEaFile")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemFsRtlQueryMaximumVirtualDiskNestingLevel")
private external fun wasiWindowssysWindowsWdkStorageFilesystemFsRtlQueryMaximumVirtualDiskNestingLevel(): Int

public actual fun fsRtlQueryMaximumVirtualDiskNestingLevel(): UInt =
    wasiWindowssysWindowsWdkStorageFilesystemFsRtlQueryMaximumVirtualDiskNestingLevel().toUInt()

public actual fun fsRtlRegisterFileSystemFilterCallbacks(filterdriverobject: ConstPtr<DriverObject>, callbacks: ConstPtr<FsFilterCallbacks>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlRegisterFileSystemFilterCallbacks")

public actual fun fsRtlRegisterUncProvider(muphandle: MutPtr<Handle>, redirectordevicename: ConstPtr<UnicodeString>, mailslotssupported: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlRegisterUncProvider")

public actual fun fsRtlRegisterUncProviderEx(muphandle: MutPtr<Handle>, redirdevname: ConstPtr<UnicodeString>, deviceobject: ConstPtr<DeviceObject>, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlRegisterUncProviderEx")

public actual fun fsRtlRegisterUncProviderEx2(redirdevname: ConstPtr<UnicodeString>, deviceobject: ConstPtr<DeviceObject>, registration: ConstPtr<FsrtlUncProviderRegistration>, muphandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlRegisterUncProviderEx2")

public actual fun fsRtlReleaseFile(fileobject: ConstPtr<FileObject>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlReleaseFile")

public actual fun fsRtlRemoveBaseMcbEntry(mcb: MutPtr<BaseMcb>, vbn: Long, sectorcount: Long): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlRemoveBaseMcbEntry")

public actual fun fsRtlRemoveDotsFromPath(originalstring: Pwstr, pathlength: UShort, newlength: MutPtr<UShort>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlRemoveDotsFromPath")

public actual fun fsRtlRemoveExtraCreateParameter(ecplist: MutPtr<EcpList>, ecptype: ConstPtr<Guid>, ecpcontext: MutPtr<MutPtr<CVoid>>, ecpcontextsize: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlRemoveExtraCreateParameter")

public actual fun fsRtlRemoveLargeMcbEntry(mcb: MutPtr<LargeMcb>, vbn: Long, sectorcount: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlRemoveLargeMcbEntry")

public actual fun fsRtlRemoveMcbEntry(mcb: MutPtr<Mcb>, vbn: UInt, sectorcount: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlRemoveMcbEntry")

public actual fun fsRtlRemovePerFileContext(perfilecontextpointer: ConstPtr<ConstPtr<CVoid>>, ownerid: ConstPtr<CVoid>, instanceid: ConstPtr<CVoid>): MutPtr<FsrtlPerFileContext> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlRemovePerFileContext")

public actual fun fsRtlRemovePerFileObjectContext(fileobject: ConstPtr<FileObject>, ownerid: ConstPtr<CVoid>, instanceid: ConstPtr<CVoid>): MutPtr<FsrtlPerFileobjectContext> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlRemovePerFileObjectContext")

public actual fun fsRtlRemovePerStreamContext(streamcontext: ConstPtr<FsrtlAdvancedFcbHeader>, ownerid: ConstPtr<CVoid>, instanceid: ConstPtr<CVoid>): MutPtr<FsrtlPerStreamContext> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlRemovePerStreamContext")

public actual fun fsRtlResetBaseMcb(mcb: MutPtr<BaseMcb>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlResetBaseMcb")

public actual fun fsRtlResetLargeMcb(mcb: MutPtr<LargeMcb>, selfsynchronized: Boolean): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlResetLargeMcb")

public actual fun fsRtlSetDriverBacking(driverobj: ConstPtr<DriverObject>, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlSetDriverBacking")

public actual fun fsRtlSetEcpListIntoIrp(irp: MutPtr<Irp>, ecplist: ConstPtr<EcpList>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlSetEcpListIntoIrp")

public actual fun fsRtlSetKernelEaFile(fileobject: ConstPtr<FileObject>, eabuffer: ConstPtr<CVoid>, length: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlSetKernelEaFile")

public actual fun fsRtlSplitBaseMcb(mcb: MutPtr<BaseMcb>, vbn: Long, amount: Long): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlSplitBaseMcb")

public actual fun fsRtlSplitLargeMcb(mcb: MutPtr<LargeMcb>, vbn: Long, amount: Long): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlSplitLargeMcb")

public actual fun fsRtlTeardownPerFileContexts(perfilecontextpointer: ConstPtr<ConstPtr<CVoid>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlTeardownPerFileContexts")

public actual fun fsRtlTeardownPerStreamContexts(advancedheader: ConstPtr<FsrtlAdvancedFcbHeader>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlTeardownPerStreamContexts")

public actual fun fsRtlTruncateBaseMcb(mcb: MutPtr<BaseMcb>, vbn: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlTruncateBaseMcb")

public actual fun fsRtlTruncateLargeMcb(mcb: MutPtr<LargeMcb>, vbn: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlTruncateLargeMcb")

public actual fun fsRtlTruncateMcb(mcb: MutPtr<Mcb>, vbn: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlTruncateMcb")

public actual fun fsRtlUninitializeBaseMcb(mcb: ConstPtr<BaseMcb>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlUninitializeBaseMcb")

public actual fun fsRtlUninitializeFileLock(filelock: MutPtr<FileLock>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlUninitializeFileLock")

public actual fun fsRtlUninitializeLargeMcb(mcb: MutPtr<LargeMcb>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlUninitializeLargeMcb")

public actual fun fsRtlUninitializeMcb(mcb: MutPtr<Mcb>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlUninitializeMcb")

public actual fun fsRtlUninitializeOplock(oplock: MutPtr<MutPtr<CVoid>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlUninitializeOplock")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemFsRtlUpdateDiskCounters")
private external fun wasiWindowssysWindowsWdkStorageFilesystemFsRtlUpdateDiskCounters(bytesread: Long, byteswritten: Long): Unit

public actual fun fsRtlUpdateDiskCounters(bytesread: ULong, byteswritten: ULong): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemFsRtlUpdateDiskCounters(bytesread.toLong(), byteswritten.toLong())

public actual fun fsRtlUpperOplockFsctrl(oplock: ConstPtr<ConstPtr<CVoid>>, irp: ConstPtr<Irp>, opencount: UInt, loweroplockstate: UInt, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlUpperOplockFsctrl")

public actual fun fsRtlValidateReparsePointBuffer(bufferlength: UInt, reparsebuffer: ConstPtr<ReparseDataBuffer>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlValidateReparsePointBuffer")

public actual fun fsRtlVolumeDeviceToCorrelationId(volumedeviceobject: ConstPtr<DeviceObject>, guid: MutPtr<Guid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlVolumeDeviceToCorrelationId")

public actual fun getSecurityUserInfo(logonid: ConstPtr<Luid>, flags: UInt, userinformation: MutPtr<MutPtr<SecurityUserData>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemGetSecurityUserInfo")

public actual fun ioAcquireVpbSpinLock(irql: MutPtr<UByte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoAcquireVpbSpinLock")

public actual fun ioApplyPriorityInfoThread(inputpriorityinfo: ConstPtr<IoPriorityInfo>, outputpriorityinfo: MutPtr<IoPriorityInfo>, thread: Pethread): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoApplyPriorityInfoThread")

public actual fun ioCheckDesiredAccess(desiredaccess: MutPtr<UInt>, grantedaccess: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoCheckDesiredAccess")

public actual fun ioCheckEaBufferValidity(eabuffer: ConstPtr<FileFullEaInformation>, ealength: UInt, erroroffset: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoCheckEaBufferValidity")

public actual fun ioCheckFunctionAccess(grantedaccess: UInt, majorfunction: UByte, minorfunction: UByte, iocontrolcode: UInt, arg1: ConstPtr<CVoid>, arg2: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoCheckFunctionAccess")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemIoCheckQuerySetFileInformation")
private external fun wasiWindowssysWindowsWdkStorageFilesystemIoCheckQuerySetFileInformation(fileinformationclass: Int, length: Int, setoperation: Int): Int

public actual fun ioCheckQuerySetFileInformation(fileinformationclass: FileInformationClass, length: UInt, setoperation: Boolean): Ntstatus =
    wasiWindowssysWindowsWdkStorageFilesystemIoCheckQuerySetFileInformation(fileinformationclass, length.toInt(), if (setoperation) 1 else 0)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemIoCheckQuerySetVolumeInformation")
private external fun wasiWindowssysWindowsWdkStorageFilesystemIoCheckQuerySetVolumeInformation(fsinformationclass: Int, length: Int, setoperation: Int): Int

public actual fun ioCheckQuerySetVolumeInformation(fsinformationclass: FsInformationClass, length: UInt, setoperation: Boolean): Ntstatus =
    wasiWindowssysWindowsWdkStorageFilesystemIoCheckQuerySetVolumeInformation(fsinformationclass, length.toInt(), if (setoperation) 1 else 0)

public actual fun ioCheckQuotaBufferValidity(quotabuffer: ConstPtr<FileQuotaInformation>, quotalength: UInt, erroroffset: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoCheckQuotaBufferValidity")

public actual fun ioClearFsTrackOffsetState(irp: MutPtr<Irp>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoClearFsTrackOffsetState")

public actual fun ioCreateStreamFileObject(fileobject: ConstPtr<FileObject>, deviceobject: ConstPtr<DeviceObject>): MutPtr<FileObject> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoCreateStreamFileObject")

public actual fun ioCreateStreamFileObjectEx(fileobject: ConstPtr<FileObject>, deviceobject: ConstPtr<DeviceObject>, filehandle: MutPtr<Handle>): MutPtr<FileObject> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoCreateStreamFileObjectEx")

public actual fun ioCreateStreamFileObjectEx2(createoptions: ConstPtr<IoCreateStreamFileOptions>, fileobject: ConstPtr<FileObject>, deviceobject: ConstPtr<DeviceObject>, streamfileobject: MutPtr<MutPtr<FileObject>>, filehandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoCreateStreamFileObjectEx2")

public actual fun ioCreateStreamFileObjectLite(fileobject: ConstPtr<FileObject>, deviceobject: ConstPtr<DeviceObject>): MutPtr<FileObject> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoCreateStreamFileObjectLite")

public actual fun ioEnumerateDeviceObjectList(driverobject: ConstPtr<DriverObject>, deviceobjectlist: MutPtr<MutPtr<DeviceObject>>, deviceobjectlistsize: UInt, actualnumberdeviceobjects: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoEnumerateDeviceObjectList")

public actual fun ioEnumerateRegisteredFiltersList(driverobjectlist: MutPtr<MutPtr<DriverObject>>, driverobjectlistsize: UInt, actualnumberdriverobjects: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoEnumerateRegisteredFiltersList")

public actual fun ioFastQueryNetworkAttributes(objectattributes: ConstPtr<ObjectAttributes>, desiredaccess: UInt, openoptions: UInt, iostatus: MutPtr<IoStatusBlock>, buffer: MutPtr<FileNetworkOpenInformation>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoFastQueryNetworkAttributes")

public actual fun ioGetAttachedDevice(deviceobject: ConstPtr<DeviceObject>): MutPtr<DeviceObject> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoGetAttachedDevice")

public actual fun ioGetBaseFileSystemDeviceObject(fileobject: ConstPtr<FileObject>): MutPtr<DeviceObject> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoGetBaseFileSystemDeviceObject")

public actual fun ioGetDeviceAttachmentBaseRef(deviceobject: ConstPtr<DeviceObject>): MutPtr<DeviceObject> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoGetDeviceAttachmentBaseRef")

public actual fun ioGetDeviceToVerify(thread: Pethread): MutPtr<DeviceObject> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoGetDeviceToVerify")

public actual fun ioGetDiskDeviceObject(filesystemdeviceobject: ConstPtr<DeviceObject>, diskdeviceobject: MutPtr<MutPtr<DeviceObject>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoGetDiskDeviceObject")

public actual fun ioGetFsTrackOffsetState(irp: ConstPtr<Irp>, retfstrackoffsetblob: MutPtr<MutPtr<IoIrpExtTrackOffsetHeader>>, rettrackedoffset: MutPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoGetFsTrackOffsetState")

public actual fun ioGetLowerDeviceObject(deviceobject: ConstPtr<DeviceObject>): MutPtr<DeviceObject> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoGetLowerDeviceObject")

public actual fun ioGetOplockKeyContext(fileobject: ConstPtr<FileObject>): MutPtr<OplockKeyEcpContext> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoGetOplockKeyContext")

public actual fun ioGetOplockKeyContextEx(fileobject: ConstPtr<FileObject>): MutPtr<OplockKeyContext> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoGetOplockKeyContextEx")

public actual fun ioGetRequestorProcess(irp: ConstPtr<Irp>): Peprocess =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoGetRequestorProcess")

public actual fun ioGetRequestorProcessId(irp: ConstPtr<Irp>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoGetRequestorProcessId")

public actual fun ioGetRequestorSessionId(irp: ConstPtr<Irp>, psessionid: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoGetRequestorSessionId")

public actual fun ioIrpHasFsTrackOffsetExtensionType(irp: ConstPtr<Irp>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoIrpHasFsTrackOffsetExtensionType")

public actual fun ioIsOperationSynchronous(irp: ConstPtr<Irp>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoIsOperationSynchronous")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemIoIsSystemThread")
private external fun wasiWindowssysWindowsWdkStorageFilesystemIoIsSystemThread(thread: Long): Int

public actual fun ioIsSystemThread(thread: Pethread): Boolean =
    (wasiWindowssysWindowsWdkStorageFilesystemIoIsSystemThread(thread) != 0)

public actual fun ioIsValidNameGraftingBuffer(irp: ConstPtr<Irp>, reparsebuffer: ConstPtr<ReparseDataBuffer>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoIsValidNameGraftingBuffer")

public actual fun ioPageRead(fileobject: ConstPtr<FileObject>, memorydescriptorlist: ConstPtr<Mdl>, startingoffset: ConstPtr<Long>, event: ConstPtr<Kevent>, iostatusblock: MutPtr<IoStatusBlock>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoPageRead")

public actual fun ioQueryFileDosDeviceName(fileobject: ConstPtr<FileObject>, objectnameinformation: MutPtr<MutPtr<ObjectNameInformation>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoQueryFileDosDeviceName")

public actual fun ioQueryFileInformation(fileobject: ConstPtr<FileObject>, fileinformationclass: FileInformationClass, length: UInt, fileinformation: MutPtr<CVoid>, returnedlength: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoQueryFileInformation")

public actual fun ioQueryVolumeInformation(fileobject: ConstPtr<FileObject>, fsinformationclass: FsInformationClass, length: UInt, fsinformation: MutPtr<CVoid>, returnedlength: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoQueryVolumeInformation")

public actual fun ioQueueThreadIrp(irp: ConstPtr<Irp>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoQueueThreadIrp")

public actual fun ioRegisterFileSystem(deviceobject: ConstPtr<DeviceObject>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoRegisterFileSystem")

public actual fun ioRegisterFsRegistrationChange(driverobject: ConstPtr<DriverObject>, drivernotificationroutine: DriverFsNotification): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoRegisterFsRegistrationChange")

public actual fun ioRegisterFsRegistrationChangeMountAware(driverobject: ConstPtr<DriverObject>, drivernotificationroutine: DriverFsNotification, synchronizewithmounts: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoRegisterFsRegistrationChangeMountAware")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemIoReleaseVpbSpinLock")
private external fun wasiWindowssysWindowsWdkStorageFilesystemIoReleaseVpbSpinLock(irql: Int): Unit

public actual fun ioReleaseVpbSpinLock(irql: UByte): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemIoReleaseVpbSpinLock(irql.toInt())

public actual fun ioReplaceFileObjectName(fileobject: ConstPtr<FileObject>, newfilename: Pcwstr, filenamelength: UShort): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoReplaceFileObjectName")

public actual fun ioRequestDeviceRemovalForReset(physicaldeviceobject: ConstPtr<DeviceObject>, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoRequestDeviceRemovalForReset")

public actual fun ioRetrievePriorityInfo(irp: ConstPtr<Irp>, fileobject: ConstPtr<FileObject>, thread: Pethread, priorityinfo: MutPtr<IoPriorityInfo>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoRetrievePriorityInfo")

public actual fun ioSetDeviceToVerify(thread: Pethread, deviceobject: ConstPtr<DeviceObject>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoSetDeviceToVerify")

public actual fun ioSetFsTrackOffsetState(irp: MutPtr<Irp>, fstrackoffsetblob: ConstPtr<IoIrpExtTrackOffsetHeader>, trackedoffset: Long): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoSetFsTrackOffsetState")

public actual fun ioSetInformation(fileobject: ConstPtr<FileObject>, fileinformationclass: FileInformationClass, length: UInt, fileinformation: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoSetInformation")

public actual fun ioSynchronousPageWrite(fileobject: ConstPtr<FileObject>, memorydescriptorlist: ConstPtr<Mdl>, startingoffset: ConstPtr<Long>, event: ConstPtr<Kevent>, iostatusblock: MutPtr<IoStatusBlock>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoSynchronousPageWrite")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemIoThreadToProcess")
private external fun wasiWindowssysWindowsWdkStorageFilesystemIoThreadToProcess(thread: Long): Long

public actual fun ioThreadToProcess(thread: Pethread): Peprocess =
    wasiWindowssysWindowsWdkStorageFilesystemIoThreadToProcess(thread)

public actual fun ioUnregisterFileSystem(deviceobject: ConstPtr<DeviceObject>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoUnregisterFileSystem")

public actual fun ioUnregisterFsRegistrationChange(driverobject: ConstPtr<DriverObject>, drivernotificationroutine: DriverFsNotification): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoUnregisterFsRegistrationChange")

public actual fun ioVerifyVolume(deviceobject: ConstPtr<DeviceObject>, allowrawmount: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoVerifyVolume")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemKeAcquireQueuedSpinLock")
private external fun wasiWindowssysWindowsWdkStorageFilesystemKeAcquireQueuedSpinLock(number: Int): Int

public actual fun keAcquireQueuedSpinLock(number: KspinLockQueueNumber): UByte =
    wasiWindowssysWindowsWdkStorageFilesystemKeAcquireQueuedSpinLock(number).toUByte()

public actual fun keAcquireSpinLockRaiseToSynch(spinlock: MutPtr<ULong>): UByte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemKeAcquireSpinLockRaiseToSynch")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemKeAttachProcess")
private external fun wasiWindowssysWindowsWdkStorageFilesystemKeAttachProcess(process: Long): Unit

public actual fun keAttachProcess(process: Prkprocess): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemKeAttachProcess(process)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemKeDetachProcess")
private external fun wasiWindowssysWindowsWdkStorageFilesystemKeDetachProcess(): Unit

public actual fun keDetachProcess(): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemKeDetachProcess()

public actual fun keInitializeMutant(mutant: MutPtr<Kmutant>, initialowner: Boolean): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemKeInitializeMutant")

public actual fun keInitializeQueue(queue: MutPtr<Kqueue>, count: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemKeInitializeQueue")

public actual fun keInsertHeadQueue(queue: MutPtr<Kqueue>, entry: MutPtr<ListEntry>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemKeInsertHeadQueue")

public actual fun keInsertQueue(queue: MutPtr<Kqueue>, entry: MutPtr<ListEntry>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemKeInsertQueue")

public actual fun keReadStateMutant(mutant: ConstPtr<Kmutant>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemKeReadStateMutant")

public actual fun keReadStateQueue(queue: ConstPtr<Kqueue>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemKeReadStateQueue")

public actual fun keReleaseMutant(mutant: MutPtr<Kmutant>, increment: Int, abandoned: Boolean, wait: Boolean): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemKeReleaseMutant")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemKeReleaseQueuedSpinLock")
private external fun wasiWindowssysWindowsWdkStorageFilesystemKeReleaseQueuedSpinLock(number: Int, oldirql: Int): Unit

public actual fun keReleaseQueuedSpinLock(number: KspinLockQueueNumber, oldirql: UByte): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemKeReleaseQueuedSpinLock(number, oldirql.toInt())

public actual fun keRemoveQueue(queue: MutPtr<Kqueue>, waitmode: Byte, timeout: ConstPtr<Long>): MutPtr<ListEntry> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemKeRemoveQueue")

public actual fun keRemoveQueueEx(queue: MutPtr<Kqueue>, waitmode: Byte, alertable: Boolean, timeout: ConstPtr<Long>, entryarray: MutPtr<MutPtr<ListEntry>>, count: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemKeRemoveQueueEx")

public actual fun keRundownQueue(queue: MutPtr<Kqueue>): MutPtr<ListEntry> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemKeRundownQueue")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemKeSetIdealProcessorThread")
private external fun wasiWindowssysWindowsWdkStorageFilesystemKeSetIdealProcessorThread(thread: Long, processor: Int): Int

public actual fun keSetIdealProcessorThread(thread: Pkthread, processor: UByte): UByte =
    wasiWindowssysWindowsWdkStorageFilesystemKeSetIdealProcessorThread(thread, processor.toInt()).toUByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemKeSetKernelStackSwapEnable")
private external fun wasiWindowssysWindowsWdkStorageFilesystemKeSetKernelStackSwapEnable(enable: Int): Int

public actual fun keSetKernelStackSwapEnable(enable: Boolean): Boolean =
    (wasiWindowssysWindowsWdkStorageFilesystemKeSetKernelStackSwapEnable(if (enable) 1 else 0) != 0)

public actual fun keStackAttachProcess(process: Prkprocess, apcstate: MutPtr<KapcState>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemKeStackAttachProcess")

public actual fun keTryToAcquireQueuedSpinLock(number: KspinLockQueueNumber, oldirql: MutPtr<UByte>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemKeTryToAcquireQueuedSpinLock")

public actual fun keUnstackDetachProcess(apcstate: ConstPtr<KapcState>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemKeUnstackDetachProcess")

public actual fun makeSignature(phcontext: ConstPtr<SecHandle>, fqop: UInt, pmessage: ConstPtr<SecBufferDesc>, messageseqno: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMakeSignature")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemMapSecurityError")
private external fun wasiWindowssysWindowsWdkStorageFilesystemMapSecurityError(secstatus: Int): Int

public actual fun mapSecurityError(secstatus: Hresult): Ntstatus =
    wasiWindowssysWindowsWdkStorageFilesystemMapSecurityError(secstatus)

public actual fun mmCanFileBeTruncated(sectionpointer: ConstPtr<SectionObjectPointers>, newfilesize: ConstPtr<Long>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMmCanFileBeTruncated")

public actual fun mmDoesFileHaveUserWritableReferences(sectionpointer: ConstPtr<SectionObjectPointers>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMmDoesFileHaveUserWritableReferences")

public actual fun mmFlushImageSection(sectionobjectpointer: ConstPtr<SectionObjectPointers>, flushtype: MmflushType): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMmFlushImageSection")

public actual fun mmForceSectionClosed(sectionobjectpointer: ConstPtr<SectionObjectPointers>, delayclose: Boolean): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMmForceSectionClosed")

public actual fun mmForceSectionClosedEx(sectionobjectpointer: ConstPtr<SectionObjectPointers>, forcecloseflags: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMmForceSectionClosedEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemMmGetMaximumFileSectionSize")
private external fun wasiWindowssysWindowsWdkStorageFilesystemMmGetMaximumFileSectionSize(): Long

public actual fun mmGetMaximumFileSectionSize(): ULong =
    wasiWindowssysWindowsWdkStorageFilesystemMmGetMaximumFileSectionSize().toULong()

public actual fun mmIsFileSectionActive(fssectionpointer: ConstPtr<SectionObjectPointers>, flags: UInt, sectionisactive: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMmIsFileSectionActive")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemMmIsRecursiveIoFault")
private external fun wasiWindowssysWindowsWdkStorageFilesystemMmIsRecursiveIoFault(): Int

public actual fun mmIsRecursiveIoFault(): Boolean =
    (wasiWindowssysWindowsWdkStorageFilesystemMmIsRecursiveIoFault() != 0)

public actual fun mmMdlPagesAreZero(mdl: ConstPtr<Mdl>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMmMdlPagesAreZero")

public actual fun mmPrefetchPages(numberoflists: UInt, readlists: ConstPtr<ConstPtr<ReadList>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMmPrefetchPages")

public actual fun mmSetAddressRangeModified(address: ConstPtr<CVoid>, length: ULong): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMmSetAddressRangeModified")

public actual fun ntAccessCheckAndAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, objecttypename: ConstPtr<UnicodeString>, objectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Boolean, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>, generateonclose: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtAccessCheckAndAuditAlarm")

public actual fun ntAccessCheckByTypeAndAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, objecttypename: ConstPtr<UnicodeString>, objectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Boolean, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>, generateonclose: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtAccessCheckByTypeAndAuditAlarm")

public actual fun ntAccessCheckByTypeResultListAndAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, objecttypename: ConstPtr<UnicodeString>, objectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Boolean, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>, generateonclose: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtAccessCheckByTypeResultListAndAuditAlarm")

public actual fun ntAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, clienttoken: Handle, objecttypename: ConstPtr<UnicodeString>, objectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Boolean, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>, generateonclose: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtAccessCheckByTypeResultListAndAuditAlarmByHandle")

public actual fun ntAdjustGroupsToken(tokenhandle: Handle, resettodefault: Boolean, newstate: ConstPtr<TokenGroups>, bufferlength: UInt, previousstate: MutPtr<TokenGroups>, returnlength: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtAdjustGroupsToken")

public actual fun ntAdjustPrivilegesToken(tokenhandle: Handle, disableallprivileges: Boolean, newstate: ConstPtr<TokenPrivileges>, bufferlength: UInt, previousstate: MutPtr<TokenPrivileges>, returnlength: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtAdjustPrivilegesToken")

public actual fun ntAllocateVirtualMemory(processhandle: Handle, baseaddress: MutPtr<MutPtr<CVoid>>, zerobits: ULong, regionsize: MutPtr<ULong>, allocationtype: UInt, protect: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtAllocateVirtualMemory")

public actual fun ntAllocateVirtualMemoryEx(processhandle: Handle, baseaddress: MutPtr<MutPtr<CVoid>>, regionsize: MutPtr<ULong>, allocationtype: UInt, pageprotection: UInt, extendedparameters: MutPtr<MemExtendedParameter>, extendedparametercount: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtAllocateVirtualMemoryEx")

public actual fun ntCancelIoFileEx(filehandle: Handle, iorequesttocancel: ConstPtr<IoStatusBlock>, iostatusblock: MutPtr<IoStatusBlock>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtCancelIoFileEx")

public actual fun ntCloseObjectAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, generateonclose: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtCloseObjectAuditAlarm")

public actual fun ntCreateDirectoryObject(directoryhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtCreateDirectoryObject")

public actual fun ntCreateEvent(eventhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, eventtype: EventType, initialstate: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtCreateEvent")

public actual fun ntCreateFile(filehandle: MutPtr<Handle>, desiredaccess: FileAccessRights, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, allocationsize: ConstPtr<Long>, fileattributes: FileFlagsAndAttributes, shareaccess: FileShareMode, createdisposition: NtcreatefileCreateDisposition, createoptions: NtcreatefileCreateOptions, eabuffer: ConstPtr<CVoid>, ealength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtCreateFile")

public actual fun ntCreateSection(sectionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, maximumsize: ConstPtr<Long>, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtCreateSection")

public actual fun ntCreateSectionEx(sectionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, maximumsize: ConstPtr<Long>, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle, extendedparameters: MutPtr<MemExtendedParameter>, extendedparametercount: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtCreateSectionEx")

public actual fun ntDeleteFile(objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtDeleteFile")

public actual fun ntDeleteObjectAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, generateonclose: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtDeleteObjectAuditAlarm")

public actual fun ntDuplicateObject(sourceprocesshandle: Handle, sourcehandle: Handle, targetprocesshandle: Handle, targethandle: MutPtr<Handle>, desiredaccess: UInt, handleattributes: UInt, options: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtDuplicateObject")

public actual fun ntDuplicateToken(existingtokenhandle: Handle, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, effectiveonly: Boolean, tokentype: TokenType, newtokenhandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtDuplicateToken")

public actual fun ntFilterToken(existingtokenhandle: Handle, flags: UInt, sidstodisable: ConstPtr<TokenGroups>, privilegestodelete: ConstPtr<TokenPrivileges>, restrictedsids: ConstPtr<TokenGroups>, newtokenhandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtFilterToken")

public actual fun ntFlushBuffersFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtFlushBuffersFile")

public actual fun ntFlushBuffersFileEx(filehandle: Handle, flags: UInt, parameters: ConstPtr<CVoid>, parameterssize: UInt, iostatusblock: MutPtr<IoStatusBlock>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtFlushBuffersFileEx")

public actual fun ntFlushVirtualMemory(processhandle: Handle, baseaddress: MutPtr<MutPtr<CVoid>>, regionsize: MutPtr<ULong>, iostatus: MutPtr<IoStatusBlock>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtFlushVirtualMemory")

public actual fun ntFreeVirtualMemory(processhandle: Handle, baseaddress: MutPtr<MutPtr<CVoid>>, regionsize: MutPtr<ULong>, freetype: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtFreeVirtualMemory")

public actual fun ntFsControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, fscontrolcode: UInt, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtFsControlFile")

public actual fun ntImpersonateAnonymousToken(threadhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtImpersonateAnonymousToken")

public actual fun ntLockFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, byteoffset: ConstPtr<Long>, length: ConstPtr<Long>, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtLockFile")

public actual fun ntNotifyChangeKey(keyhandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, completionfilter: UInt, watchtree: Boolean, buffer: MutPtr<CVoid>, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtNotifyChangeKey")

public actual fun ntOpenDirectoryObject(directoryhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtOpenDirectoryObject")

public actual fun ntOpenFile(filehandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, shareaccess: UInt, openoptions: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtOpenFile")

public actual fun ntOpenObjectAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, objecttypename: ConstPtr<UnicodeString>, objectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: ConstPtr<PrivilegeSet>, objectcreation: Boolean, accessgranted: Boolean, generateonclose: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtOpenObjectAuditAlarm")

public actual fun ntOpenProcessToken(processhandle: Handle, desiredaccess: UInt, tokenhandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtOpenProcessToken")

public actual fun ntOpenProcessTokenEx(processhandle: Handle, desiredaccess: UInt, handleattributes: UInt, tokenhandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtOpenProcessTokenEx")

public actual fun ntOpenSymbolicLinkObject(linkhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtOpenSymbolicLinkObject")

public actual fun ntOpenThreadToken(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, tokenhandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtOpenThreadToken")

public actual fun ntOpenThreadTokenEx(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtOpenThreadTokenEx")

public actual fun ntPrivilegeCheck(clienttoken: Handle, requiredprivileges: MutPtr<PrivilegeSet>, result: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtPrivilegeCheck")

public actual fun ntPrivilegeObjectAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, clienttoken: Handle, desiredaccess: UInt, privileges: ConstPtr<PrivilegeSet>, accessgranted: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtPrivilegeObjectAuditAlarm")

public actual fun ntPrivilegedServiceAuditAlarm(subsystemname: ConstPtr<UnicodeString>, servicename: ConstPtr<UnicodeString>, clienttoken: Handle, privileges: ConstPtr<PrivilegeSet>, accessgranted: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtPrivilegedServiceAuditAlarm")

public actual fun ntQueryDirectoryFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: ConstPtr<UnicodeString>, restartscan: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtQueryDirectoryFile")

public actual fun ntQueryDirectoryFileEx(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: ConstPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtQueryDirectoryFileEx")

public actual fun ntQueryDirectoryObject(directoryhandle: Handle, buffer: MutPtr<CVoid>, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: MutPtr<UInt>, returnlength: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtQueryDirectoryObject")

public actual fun ntQueryEaFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, buffer: MutPtr<CVoid>, length: UInt, returnsingleentry: Boolean, ealist: ConstPtr<CVoid>, ealistlength: UInt, eaindex: ConstPtr<UInt>, restartscan: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtQueryEaFile")

public actual fun ntQueryFullAttributesFile(objectattributes: ConstPtr<ObjectAttributes>, fileinformation: MutPtr<FileNetworkOpenInformation>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtQueryFullAttributesFile")

public actual fun ntQueryInformationByName(objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtQueryInformationByName")

public actual fun ntQueryInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtQueryInformationFile")

public actual fun ntQueryInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: MutPtr<CVoid>, tokeninformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtQueryInformationToken")

public actual fun ntQueryQuotaInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, buffer: MutPtr<CVoid>, length: UInt, returnsingleentry: Boolean, sidlist: ConstPtr<CVoid>, sidlistlength: UInt, startsid: Psid, restartscan: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtQueryQuotaInformationFile")

public actual fun ntQuerySecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtQuerySecurityObject")

public actual fun ntQuerySymbolicLinkObject(linkhandle: Handle, linktarget: MutPtr<UnicodeString>, returnedlength: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtQuerySymbolicLinkObject")

public actual fun ntQueryVirtualMemory(processhandle: Handle, baseaddress: ConstPtr<CVoid>, memoryinformationclass: MemoryInformationClass, memoryinformation: MutPtr<CVoid>, memoryinformationlength: ULong, returnlength: MutPtr<ULong>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtQueryVirtualMemory")

public actual fun ntQueryVolumeInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, fsinformation: MutPtr<CVoid>, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtQueryVolumeInformationFile")

public actual fun ntReadFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, buffer: MutPtr<CVoid>, length: UInt, byteoffset: ConstPtr<Long>, key: ConstPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtReadFile")

public actual fun ntSetEaFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, buffer: ConstPtr<CVoid>, length: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtSetEaFile")

public actual fun ntSetEvent(eventhandle: Handle, previousstate: MutPtr<Int>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtSetEvent")

public actual fun ntSetInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: ConstPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtSetInformationFile")

public actual fun ntSetInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: ConstPtr<CVoid>, tokeninformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtSetInformationToken")

public actual fun ntSetInformationVirtualMemory(processhandle: Handle, vminformationclass: VirtualMemoryInformationClass, numberofentries: ULong, virtualaddresses: ConstPtr<MemoryRangeEntry>, vminformation: ConstPtr<CVoid>, vminformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtSetInformationVirtualMemory")

public actual fun ntSetQuotaInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, buffer: ConstPtr<CVoid>, length: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtSetQuotaInformationFile")

public actual fun ntSetSecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtSetSecurityObject")

public actual fun ntSetVolumeInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, fsinformation: ConstPtr<CVoid>, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtSetVolumeInformationFile")

public actual fun ntUnlockFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, byteoffset: ConstPtr<Long>, length: ConstPtr<Long>, key: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtUnlockFile")

public actual fun ntWriteFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, buffer: ConstPtr<CVoid>, length: UInt, byteoffset: ConstPtr<Long>, key: ConstPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtWriteFile")

public actual fun obInsertObject(obj: ConstPtr<CVoid>, passedaccessstate: MutPtr<AccessState>, desiredaccess: UInt, objectpointerbias: UInt, newobject: MutPtr<MutPtr<CVoid>>, handle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemObInsertObject")

public actual fun obIsKernelHandle(handle: Handle): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemObIsKernelHandle")

public actual fun obMakeTemporaryObject(obj: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemObMakeTemporaryObject")

public actual fun obOpenObjectByPointer(obj: ConstPtr<CVoid>, handleattributes: UInt, passedaccessstate: ConstPtr<AccessState>, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, handle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemObOpenObjectByPointer")

public actual fun obOpenObjectByPointerWithTag(obj: ConstPtr<CVoid>, handleattributes: UInt, passedaccessstate: ConstPtr<AccessState>, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt, handle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemObOpenObjectByPointerWithTag")

public actual fun obQueryNameString(obj: ConstPtr<CVoid>, objectnameinfo: MutPtr<ObjectNameInformation>, length: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemObQueryNameString")

public actual fun obQueryObjectAuditingByHandle(handle: Handle, generateonclose: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemObQueryObjectAuditingByHandle")

public actual fun pfxFindPrefix(prefixtable: ConstPtr<PrefixTable>, fullname: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>): MutPtr<PrefixTableEntry> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemPfxFindPrefix")

public actual fun pfxInitialize(prefixtable: MutPtr<PrefixTable>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemPfxInitialize")

public actual fun pfxInsertPrefix(prefixtable: ConstPtr<PrefixTable>, prefix: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, prefixtableentry: MutPtr<PrefixTableEntry>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemPfxInsertPrefix")

public actual fun pfxRemovePrefix(prefixtable: ConstPtr<PrefixTable>, prefixtableentry: ConstPtr<PrefixTableEntry>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemPfxRemovePrefix")

public actual fun poQueueShutdownWorkItem(workitem: MutPtr<WorkQueueItem>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemPoQueueShutdownWorkItem")

public actual fun psAssignImpersonationToken(thread: Pethread, token: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemPsAssignImpersonationToken")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemPsChargePoolQuota")
private external fun wasiWindowssysWindowsWdkStorageFilesystemPsChargePoolQuota(process: Long, pooltype: Int, amount: Long): Unit

public actual fun psChargePoolQuota(process: Peprocess, pooltype: PoolType, amount: ULong): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemPsChargePoolQuota(process, pooltype, amount.toLong())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemPsChargeProcessPoolQuota")
private external fun wasiWindowssysWindowsWdkStorageFilesystemPsChargeProcessPoolQuota(process: Long, pooltype: Int, amount: Long): Int

public actual fun psChargeProcessPoolQuota(process: Peprocess, pooltype: PoolType, amount: ULong): Ntstatus =
    wasiWindowssysWindowsWdkStorageFilesystemPsChargeProcessPoolQuota(process, pooltype, amount.toLong())

public actual fun psDereferenceImpersonationToken(impersonationtoken: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemPsDereferenceImpersonationToken")

public actual fun psDereferencePrimaryToken(primarytoken: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemPsDereferencePrimaryToken")

public actual fun psDisableImpersonation(thread: Pethread, impersonationstate: MutPtr<SeImpersonationState>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemPsDisableImpersonation")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemPsGetProcessExitTime")
private external fun wasiWindowssysWindowsWdkStorageFilesystemPsGetProcessExitTime(): Long

public actual fun psGetProcessExitTime(): Long =
    wasiWindowssysWindowsWdkStorageFilesystemPsGetProcessExitTime()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemPsGetThreadProcess")
private external fun wasiWindowssysWindowsWdkStorageFilesystemPsGetThreadProcess(thread: Long): Long

public actual fun psGetThreadProcess(thread: Pethread): Peprocess =
    wasiWindowssysWindowsWdkStorageFilesystemPsGetThreadProcess(thread)

public actual fun psImpersonateClient(thread: Pethread, token: ConstPtr<CVoid>, copyonopen: Boolean, effectiveonly: Boolean, impersonationlevel: SecurityImpersonationLevel): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemPsImpersonateClient")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemPsIsDiskCountersEnabled")
private external fun wasiWindowssysWindowsWdkStorageFilesystemPsIsDiskCountersEnabled(): Int

public actual fun psIsDiskCountersEnabled(): Boolean =
    (wasiWindowssysWindowsWdkStorageFilesystemPsIsDiskCountersEnabled() != 0)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemPsIsSystemThread")
private external fun wasiWindowssysWindowsWdkStorageFilesystemPsIsSystemThread(thread: Long): Int

public actual fun psIsSystemThread(thread: Pethread): Boolean =
    (wasiWindowssysWindowsWdkStorageFilesystemPsIsSystemThread(thread) != 0)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemPsIsThreadTerminating")
private external fun wasiWindowssysWindowsWdkStorageFilesystemPsIsThreadTerminating(thread: Long): Int

public actual fun psIsThreadTerminating(thread: Pethread): Boolean =
    (wasiWindowssysWindowsWdkStorageFilesystemPsIsThreadTerminating(thread) != 0)

public actual fun psLookupProcessByProcessId(processid: Handle, process: MutPtr<Peprocess>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemPsLookupProcessByProcessId")

public actual fun psLookupThreadByThreadId(threadid: Handle, thread: MutPtr<Pethread>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemPsLookupThreadByThreadId")

public actual fun psReferenceImpersonationToken(thread: Pethread, copyonopen: MutPtr<Boolean>, effectiveonly: MutPtr<Boolean>, impersonationlevel: MutPtr<SecurityImpersonationLevel>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemPsReferenceImpersonationToken")

public actual fun psReferencePrimaryToken(process: Peprocess): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemPsReferencePrimaryToken")

public actual fun psRestoreImpersonation(thread: Pethread, impersonationstate: ConstPtr<SeImpersonationState>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemPsRestoreImpersonation")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemPsReturnPoolQuota")
private external fun wasiWindowssysWindowsWdkStorageFilesystemPsReturnPoolQuota(process: Long, pooltype: Int, amount: Long): Unit

public actual fun psReturnPoolQuota(process: Peprocess, pooltype: PoolType, amount: ULong): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemPsReturnPoolQuota(process, pooltype, amount.toLong())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemPsRevertToSelf")
private external fun wasiWindowssysWindowsWdkStorageFilesystemPsRevertToSelf(): Unit

public actual fun psRevertToSelf(): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemPsRevertToSelf()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemPsUpdateDiskCounters")
private external fun wasiWindowssysWindowsWdkStorageFilesystemPsUpdateDiskCounters(process: Long, bytesread: Long, byteswritten: Long, readoperationcount: Int, writeoperationcount: Int, flushoperationcount: Int): Unit

public actual fun psUpdateDiskCounters(process: Peprocess, bytesread: ULong, byteswritten: ULong, readoperationcount: UInt, writeoperationcount: UInt, flushoperationcount: UInt): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemPsUpdateDiskCounters(process, bytesread.toLong(), byteswritten.toLong(), readoperationcount.toInt(), writeoperationcount.toInt(), flushoperationcount.toInt())

public actual fun querySecurityContextToken(phcontext: ConstPtr<SecHandle>, token: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemQuerySecurityContextToken")

public actual fun rtlAbsoluteToSelfRelativeSD(absolutesecuritydescriptor: PsecurityDescriptor, selfrelativesecuritydescriptor: PsecurityDescriptor, bufferlength: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlAbsoluteToSelfRelativeSD")

public actual fun rtlAddAccessAllowedAce(acl: MutPtr<Acl>, acerevision: UInt, accessmask: UInt, sid: Psid): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlAddAccessAllowedAce")

public actual fun rtlAddAccessAllowedAceEx(acl: MutPtr<Acl>, acerevision: UInt, aceflags: UInt, accessmask: UInt, sid: Psid): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlAddAccessAllowedAceEx")

public actual fun rtlAddAce(acl: MutPtr<Acl>, acerevision: UInt, startingaceindex: UInt, acelist: ConstPtr<CVoid>, acelistlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlAddAce")

public actual fun rtlAllocateAndInitializeSid(identifierauthority: ConstPtr<SidIdentifierAuthority>, subauthoritycount: UByte, subauthority0: UInt, subauthority1: UInt, subauthority2: UInt, subauthority3: UInt, subauthority4: UInt, subauthority5: UInt, subauthority6: UInt, subauthority7: UInt, sid: MutPtr<Psid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlAllocateAndInitializeSid")

public actual fun rtlAllocateAndInitializeSidEx(identifierauthority: ConstPtr<SidIdentifierAuthority>, subauthoritycount: UByte, subauthorities: ConstPtr<UInt>, sid: MutPtr<Psid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlAllocateAndInitializeSidEx")

public actual fun rtlAllocateHeap(heaphandle: ConstPtr<CVoid>, flags: UInt, size: ULong): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlAllocateHeap")

public actual fun rtlAppendStringToString(destination: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, source: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlAppendStringToString")

public actual fun rtlCompareAltitudes(altitude1: ConstPtr<UnicodeString>, altitude2: ConstPtr<UnicodeString>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlCompareAltitudes")

public actual fun rtlCompareMemoryUlong(source: ConstPtr<CVoid>, length: ULong, pattern: UInt): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlCompareMemoryUlong")

public actual fun rtlCompressBuffer(compressionformatandengine: UShort, uncompressedbuffer: ConstPtr<UByte>, uncompressedbuffersize: UInt, compressedbuffer: MutPtr<UByte>, compressedbuffersize: UInt, uncompressedchunksize: UInt, finalcompressedsize: MutPtr<UInt>, workspace: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlCompressBuffer")

public actual fun rtlCompressChunks(uncompressedbuffer: ConstPtr<UByte>, uncompressedbuffersize: UInt, compressedbuffer: MutPtr<UByte>, compressedbuffersize: UInt, compresseddatainfo: MutPtr<CompressedDataInfo>, compresseddatainfolength: UInt, workspace: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlCompressChunks")

public actual fun rtlCopyLuid(destinationluid: MutPtr<Luid>, sourceluid: ConstPtr<Luid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlCopyLuid")

public actual fun rtlCopySid(destinationsidlength: UInt, destinationsid: Psid, sourcesid: Psid): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlCopySid")

public actual fun rtlCreateAcl(acl: MutPtr<Acl>, acllength: UInt, aclrevision: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlCreateAcl")

public actual fun rtlCreateHeap(flags: UInt, heapbase: ConstPtr<CVoid>, reservesize: ULong, commitsize: ULong, lock: ConstPtr<CVoid>, parameters: ConstPtr<RtlHeapParameters>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlCreateHeap")

public actual fun rtlCreateServiceSid(servicename: ConstPtr<UnicodeString>, servicesid: Psid, servicesidlength: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlCreateServiceSid")

public actual fun rtlCreateSystemVolumeInformationFolder(volumerootpath: ConstPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlCreateSystemVolumeInformationFolder")

public actual fun rtlCreateUnicodeString(destinationstring: MutPtr<UnicodeString>, sourcestring: Pcwstr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlCreateUnicodeString")

public actual fun rtlCreateVirtualAccountSid(name: ConstPtr<UnicodeString>, basesubauthority: UInt, sid: Psid, sidlength: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlCreateVirtualAccountSid")

public actual fun rtlCustomCPToUnicodeN(customcp: ConstPtr<Cptableinfo>, unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: MutPtr<UInt>, customcpstring: Pcstr, bytesincustomcpstring: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlCustomCPToUnicodeN")

public actual fun rtlDecompressBuffer(compressionformat: UShort, uncompressedbuffer: MutPtr<UByte>, uncompressedbuffersize: UInt, compressedbuffer: ConstPtr<UByte>, compressedbuffersize: UInt, finaluncompressedsize: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlDecompressBuffer")

public actual fun rtlDecompressBufferEx(compressionformat: UShort, uncompressedbuffer: MutPtr<UByte>, uncompressedbuffersize: UInt, compressedbuffer: ConstPtr<UByte>, compressedbuffersize: UInt, finaluncompressedsize: MutPtr<UInt>, workspace: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlDecompressBufferEx")

public actual fun rtlDecompressBufferEx2(compressionformat: UShort, uncompressedbuffer: MutPtr<UByte>, uncompressedbuffersize: UInt, compressedbuffer: ConstPtr<UByte>, compressedbuffersize: UInt, uncompressedchunksize: UInt, finaluncompressedsize: MutPtr<UInt>, workspace: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlDecompressBufferEx2")

public actual fun rtlDecompressChunks(uncompressedbuffer: MutPtr<UByte>, uncompressedbuffersize: UInt, compressedbuffer: ConstPtr<UByte>, compressedbuffersize: UInt, compressedtail: ConstPtr<UByte>, compressedtailsize: UInt, compresseddatainfo: ConstPtr<CompressedDataInfo>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlDecompressChunks")

public actual fun rtlDecompressFragment(compressionformat: UShort, uncompressedfragment: MutPtr<UByte>, uncompressedfragmentsize: UInt, compressedbuffer: ConstPtr<UByte>, compressedbuffersize: UInt, fragmentoffset: UInt, finaluncompressedsize: MutPtr<UInt>, workspace: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlDecompressFragment")

public actual fun rtlDecompressFragmentEx(compressionformat: UShort, uncompressedfragment: MutPtr<UByte>, uncompressedfragmentsize: UInt, compressedbuffer: ConstPtr<UByte>, compressedbuffersize: UInt, fragmentoffset: UInt, uncompressedchunksize: UInt, finaluncompressedsize: MutPtr<UInt>, workspace: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlDecompressFragmentEx")

public actual fun rtlDeleteAce(acl: MutPtr<Acl>, aceindex: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlDeleteAce")

public actual fun rtlDescribeChunk(compressionformat: UShort, compressedbuffer: MutPtr<MutPtr<UByte>>, endofcompressedbufferplus1: ConstPtr<UByte>, chunkbuffer: MutPtr<MutPtr<UByte>>, chunksize: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlDescribeChunk")

public actual fun rtlDestroyHeap(heaphandle: ConstPtr<CVoid>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlDestroyHeap")

public actual fun rtlDosPathNameToNtPathNameUWithStatus(dosfilename: Pcwstr, ntfilename: MutPtr<UnicodeString>, filepart: MutPtr<Pwstr>, reserved: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlDosPathNameToNtPathNameUWithStatus")

public actual fun rtlDowncaseUnicodeString(destinationstring: MutPtr<UnicodeString>, sourcestring: ConstPtr<UnicodeString>, allocatedestinationstring: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlDowncaseUnicodeString")

public actual fun rtlDuplicateUnicodeString(flags: UInt, stringin: ConstPtr<UnicodeString>, stringout: MutPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlDuplicateUnicodeString")

public actual fun rtlEqualPrefixSid(sid1: Psid, sid2: Psid): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlEqualPrefixSid")

public actual fun rtlEqualSid(sid1: Psid, sid2: Psid): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlEqualSid")

public actual fun rtlFindUnicodePrefix(prefixtable: ConstPtr<UnicodePrefixTable>, fullname: ConstPtr<UnicodeString>, caseinsensitiveindex: UInt): MutPtr<UnicodePrefixTableEntry> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlFindUnicodePrefix")

public actual fun rtlFreeHeap(heaphandle: ConstPtr<CVoid>, flags: UInt, baseaddress: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlFreeHeap")

public actual fun rtlFreeSid(sid: Psid): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlFreeSid")

public actual fun rtlGenerate8dot3Name(name: ConstPtr<UnicodeString>, allowextendedcharacters: Boolean, context: MutPtr<GenerateNameContext>, name8dot3: MutPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlGenerate8dot3Name")

public actual fun rtlGetAce(acl: ConstPtr<Acl>, aceindex: UInt, ace: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlGetAce")

public actual fun rtlGetCompressionWorkSpaceSize(compressionformatandengine: UShort, compressbufferworkspacesize: MutPtr<UInt>, compressfragmentworkspacesize: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlGetCompressionWorkSpaceSize")

public actual fun rtlGetDaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, daclpresent: MutPtr<Boolean>, dacl: MutPtr<MutPtr<Acl>>, dacldefaulted: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlGetDaclSecurityDescriptor")

public actual fun rtlGetGroupSecurityDescriptor(securitydescriptor: PsecurityDescriptor, group: MutPtr<Psid>, groupdefaulted: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlGetGroupSecurityDescriptor")

public actual fun rtlGetOwnerSecurityDescriptor(securitydescriptor: PsecurityDescriptor, owner: MutPtr<Psid>, ownerdefaulted: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlGetOwnerSecurityDescriptor")

public actual fun rtlGetSaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, saclpresent: MutPtr<Boolean>, sacl: MutPtr<MutPtr<Acl>>, sacldefaulted: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlGetSaclSecurityDescriptor")

public actual fun rtlIdentifierAuthoritySid(sid: Psid): MutPtr<SidIdentifierAuthority> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlIdentifierAuthoritySid")

public actual fun rtlIdnToAscii(flags: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: MutPtr<Int>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlIdnToAscii")

public actual fun rtlIdnToNameprepUnicode(flags: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: MutPtr<Int>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlIdnToNameprepUnicode")

public actual fun rtlIdnToUnicode(flags: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: MutPtr<Int>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlIdnToUnicode")

public actual fun rtlInitCodePageTable(tablebase: ConstPtr<UShort>, codepagetable: MutPtr<Cptableinfo>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlInitCodePageTable")

public actual fun rtlInitUnicodeStringEx(destinationstring: MutPtr<UnicodeString>, sourcestring: Pcwstr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlInitUnicodeStringEx")

public actual fun rtlInitializeSid(sid: Psid, identifierauthority: ConstPtr<SidIdentifierAuthority>, subauthoritycount: UByte): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlInitializeSid")

public actual fun rtlInitializeSidEx(sid: Psid, identifierauthority: ConstPtr<SidIdentifierAuthority>, subauthoritycount: UByte, vararg variadicArgs: Long): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlInitializeSidEx")

public actual fun rtlInitializeUnicodePrefix(prefixtable: MutPtr<UnicodePrefixTable>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlInitializeUnicodePrefix")

public actual fun rtlInsertUnicodePrefix(prefixtable: ConstPtr<UnicodePrefixTable>, prefix: ConstPtr<UnicodeString>, prefixtableentry: MutPtr<UnicodePrefixTableEntry>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlInsertUnicodePrefix")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemRtlIsCloudFilesPlaceholder")
private external fun wasiWindowssysWindowsWdkStorageFilesystemRtlIsCloudFilesPlaceholder(fileattributes: Int, reparsetag: Int): Int

public actual fun rtlIsCloudFilesPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean =
    (wasiWindowssysWindowsWdkStorageFilesystemRtlIsCloudFilesPlaceholder(fileattributes.toInt(), reparsetag.toInt()) != 0)

public actual fun rtlIsDosDeviceNameU(dosfilename: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlIsDosDeviceNameU")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemRtlIsNonEmptyDirectoryReparsePointAllowed")
private external fun wasiWindowssysWindowsWdkStorageFilesystemRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: Int): Int

public actual fun rtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean =
    (wasiWindowssysWindowsWdkStorageFilesystemRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag.toInt()) != 0)

public actual fun rtlIsNormalizedString(normform: UInt, sourcestring: Pcwstr, sourcestringlength: Int, normalized: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlIsNormalizedString")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemRtlIsPartialPlaceholder")
private external fun wasiWindowssysWindowsWdkStorageFilesystemRtlIsPartialPlaceholder(fileattributes: Int, reparsetag: Int): Int

public actual fun rtlIsPartialPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean =
    (wasiWindowssysWindowsWdkStorageFilesystemRtlIsPartialPlaceholder(fileattributes.toInt(), reparsetag.toInt()) != 0)

public actual fun rtlIsPartialPlaceholderFileHandle(filehandle: Handle, ispartialplaceholder: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlIsPartialPlaceholderFileHandle")

public actual fun rtlIsPartialPlaceholderFileInfo(infobuffer: ConstPtr<CVoid>, infoclass: FileInformationClass, ispartialplaceholder: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlIsPartialPlaceholderFileInfo")

public actual fun rtlIsSandboxedToken(context: ConstPtr<SecuritySubjectContext>, previousmode: Byte): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlIsSandboxedToken")

public actual fun rtlIsValidOemCharacter(char: Pwstr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlIsValidOemCharacter")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemRtlLengthRequiredSid")
private external fun wasiWindowssysWindowsWdkStorageFilesystemRtlLengthRequiredSid(subauthoritycount: Int): Int

public actual fun rtlLengthRequiredSid(subauthoritycount: UInt): UInt =
    wasiWindowssysWindowsWdkStorageFilesystemRtlLengthRequiredSid(subauthoritycount.toInt()).toUInt()

public actual fun rtlLengthSid(sid: Psid): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlLengthSid")

public actual fun rtlMultiByteToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: MutPtr<UInt>, multibytestring: Pcstr, bytesinmultibytestring: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlMultiByteToUnicodeN")

public actual fun rtlMultiByteToUnicodeSize(bytesinunicodestring: MutPtr<UInt>, multibytestring: Pcstr, bytesinmultibytestring: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlMultiByteToUnicodeSize")

public actual fun rtlNextUnicodePrefix(prefixtable: ConstPtr<UnicodePrefixTable>, restart: Boolean): MutPtr<UnicodePrefixTableEntry> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlNextUnicodePrefix")

public actual fun rtlNormalizeString(normform: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: MutPtr<Int>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlNormalizeString")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemRtlNtStatusToDosErrorNoTeb")
private external fun wasiWindowssysWindowsWdkStorageFilesystemRtlNtStatusToDosErrorNoTeb(status: Int): Int

public actual fun rtlNtStatusToDosErrorNoTeb(status: Ntstatus): UInt =
    wasiWindowssysWindowsWdkStorageFilesystemRtlNtStatusToDosErrorNoTeb(status).toUInt()

public actual fun rtlOemStringToCountedUnicodeString(destinationstring: MutPtr<UnicodeString>, sourcestring: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, allocatedestinationstring: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlOemStringToCountedUnicodeString")

public actual fun rtlOemStringToUnicodeString(destinationstring: MutPtr<UnicodeString>, sourcestring: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, allocatedestinationstring: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlOemStringToUnicodeString")

public actual fun rtlOemToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: MutPtr<UInt>, oemstring: Pcstr, bytesinoemstring: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlOemToUnicodeN")

public actual fun rtlPrefixString(string1: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, string2: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, caseinsensitive: Boolean): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlPrefixString")

public actual fun rtlQueryPackageIdentity(tokenobject: ConstPtr<CVoid>, packagefullname: Pwstr, packagesize: MutPtr<ULong>, appid: Pwstr, appidsize: MutPtr<ULong>, packaged: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlQueryPackageIdentity")

public actual fun rtlQueryPackageIdentityEx(tokenobject: ConstPtr<CVoid>, packagefullname: Pwstr, packagesize: MutPtr<ULong>, appid: Pwstr, appidsize: MutPtr<ULong>, dynamicid: MutPtr<Guid>, flags: MutPtr<ULong>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlQueryPackageIdentityEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemRtlQueryProcessPlaceholderCompatibilityMode")
private external fun wasiWindowssysWindowsWdkStorageFilesystemRtlQueryProcessPlaceholderCompatibilityMode(): Int

public actual fun rtlQueryProcessPlaceholderCompatibilityMode(): Byte =
    wasiWindowssysWindowsWdkStorageFilesystemRtlQueryProcessPlaceholderCompatibilityMode().toByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemRtlQueryThreadPlaceholderCompatibilityMode")
private external fun wasiWindowssysWindowsWdkStorageFilesystemRtlQueryThreadPlaceholderCompatibilityMode(): Int

public actual fun rtlQueryThreadPlaceholderCompatibilityMode(): Byte =
    wasiWindowssysWindowsWdkStorageFilesystemRtlQueryThreadPlaceholderCompatibilityMode().toByte()

public actual fun rtlRandom(seed: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlRandom")

public actual fun rtlRandomEx(seed: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlRandomEx")

public actual fun rtlRemoveUnicodePrefix(prefixtable: ConstPtr<UnicodePrefixTable>, prefixtableentry: ConstPtr<UnicodePrefixTableEntry>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlRemoveUnicodePrefix")

public actual fun rtlReplaceSidInSd(securitydescriptor: PsecurityDescriptor, oldsid: Psid, newsid: Psid, numchanges: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlReplaceSidInSd")

public actual fun rtlReserveChunk(compressionformat: UShort, compressedbuffer: MutPtr<MutPtr<UByte>>, endofcompressedbufferplus1: ConstPtr<UByte>, chunkbuffer: MutPtr<MutPtr<UByte>>, chunksize: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlReserveChunk")

public actual fun rtlSecondsSince1970ToTime(elapsedseconds: UInt, time: MutPtr<Long>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlSecondsSince1970ToTime")

public actual fun rtlSecondsSince1980ToTime(elapsedseconds: UInt, time: MutPtr<Long>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlSecondsSince1980ToTime")

public actual fun rtlSelfRelativeToAbsoluteSD(selfrelativesecuritydescriptor: PsecurityDescriptor, absolutesecuritydescriptor: PsecurityDescriptor, absolutesecuritydescriptorsize: MutPtr<UInt>, dacl: MutPtr<Acl>, daclsize: MutPtr<UInt>, sacl: MutPtr<Acl>, saclsize: MutPtr<UInt>, owner: Psid, ownersize: MutPtr<UInt>, primarygroup: Psid, primarygroupsize: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlSelfRelativeToAbsoluteSD")

public actual fun rtlSetGroupSecurityDescriptor(securitydescriptor: PsecurityDescriptor, group: Psid, groupdefaulted: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlSetGroupSecurityDescriptor")

public actual fun rtlSetOwnerSecurityDescriptor(securitydescriptor: PsecurityDescriptor, owner: Psid, ownerdefaulted: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlSetOwnerSecurityDescriptor")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemRtlSetProcessPlaceholderCompatibilityMode")
private external fun wasiWindowssysWindowsWdkStorageFilesystemRtlSetProcessPlaceholderCompatibilityMode(mode: Int): Int

public actual fun rtlSetProcessPlaceholderCompatibilityMode(mode: Byte): Byte =
    wasiWindowssysWindowsWdkStorageFilesystemRtlSetProcessPlaceholderCompatibilityMode(mode.toInt()).toByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemRtlSetThreadPlaceholderCompatibilityMode")
private external fun wasiWindowssysWindowsWdkStorageFilesystemRtlSetThreadPlaceholderCompatibilityMode(mode: Int): Int

public actual fun rtlSetThreadPlaceholderCompatibilityMode(mode: Byte): Byte =
    wasiWindowssysWindowsWdkStorageFilesystemRtlSetThreadPlaceholderCompatibilityMode(mode.toInt()).toByte()

public actual fun rtlSubAuthorityCountSid(sid: Psid): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlSubAuthorityCountSid")

public actual fun rtlSubAuthoritySid(sid: Psid, subauthority: UInt): MutPtr<UInt> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlSubAuthoritySid")

public actual fun rtlTimeToSecondsSince1980(time: ConstPtr<Long>, elapsedseconds: MutPtr<UInt>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlTimeToSecondsSince1980")

public actual fun rtlUnicodeStringToCountedOemString(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<UnicodeString>, allocatedestinationstring: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlUnicodeStringToCountedOemString")

public actual fun rtlUnicodeToCustomCPN(customcp: ConstPtr<Cptableinfo>, customcpstring: Pstr, maxbytesincustomcpstring: UInt, bytesincustomcpstring: MutPtr<UInt>, unicodestring: Pcwstr, bytesinunicodestring: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlUnicodeToCustomCPN")

public actual fun rtlUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: MutPtr<UInt>, unicodestring: ConstPtr<UShort>, bytesinunicodestring: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlUnicodeToMultiByteN")

public actual fun rtlUnicodeToOemN(oemstring: Pstr, maxbytesinoemstring: UInt, bytesinoemstring: MutPtr<UInt>, unicodestring: ConstPtr<UShort>, bytesinunicodestring: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlUnicodeToOemN")

public actual fun rtlUpcaseUnicodeStringToCountedOemString(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<UnicodeString>, allocatedestinationstring: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeStringToCountedOemString")

public actual fun rtlUpcaseUnicodeStringToOemString(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<UnicodeString>, allocatedestinationstring: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeStringToOemString")

public actual fun rtlUpcaseUnicodeToCustomCPN(customcp: ConstPtr<Cptableinfo>, customcpstring: Pstr, maxbytesincustomcpstring: UInt, bytesincustomcpstring: MutPtr<UInt>, unicodestring: Pcwstr, bytesinunicodestring: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeToCustomCPN")

public actual fun rtlUpcaseUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: MutPtr<UInt>, unicodestring: ConstPtr<UShort>, bytesinunicodestring: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeToMultiByteN")

public actual fun rtlUpcaseUnicodeToOemN(oemstring: Pstr, maxbytesinoemstring: UInt, bytesinoemstring: MutPtr<UInt>, unicodestring: ConstPtr<UShort>, bytesinunicodestring: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeToOemN")

public actual fun rtlValidSid(sid: Psid): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlValidSid")

public actual fun rtlValidateUnicodeString(flags: UInt, string: ConstPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlValidateUnicodeString")

public actual fun rtlxOemStringToUnicodeSize(oemstring: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlxOemStringToUnicodeSize")

public actual fun rtlxUnicodeStringToOemSize(unicodestring: ConstPtr<UnicodeString>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlxUnicodeStringToOemSize")

public actual fun seAccessCheckFromState(securitydescriptor: PsecurityDescriptor, primarytokeninformation: ConstPtr<TokenAccessInformation>, clienttokeninformation: ConstPtr<TokenAccessInformation>, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: MutPtr<MutPtr<PrivilegeSet>>, genericmapping: ConstPtr<GenericMapping>, accessmode: Byte, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAccessCheckFromState")

public actual fun seAccessCheckFromStateEx(securitydescriptor: PsecurityDescriptor, primarytoken: ConstPtr<CVoid>, clienttoken: ConstPtr<CVoid>, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: MutPtr<MutPtr<PrivilegeSet>>, genericmapping: ConstPtr<GenericMapping>, accessmode: Byte, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAccessCheckFromStateEx")

public actual fun seAdjustAccessStateForAccessConstraints(objecttype: ConstPtr<CVoid>, securitydescriptor: PsecurityDescriptor, accessstate: MutPtr<AccessState>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAdjustAccessStateForAccessConstraints")

public actual fun seAdjustAccessStateForTrustLabel(objecttype: ConstPtr<CVoid>, securitydescriptor: PsecurityDescriptor, accessstate: MutPtr<AccessState>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAdjustAccessStateForTrustLabel")

public actual fun seAdjustObjectSecurity(objectname: ConstPtr<UnicodeString>, originaldescriptor: PsecurityDescriptor, proposeddescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr<SecuritySubjectContext>, adjusteddescriptor: MutPtr<PsecurityDescriptor>, applyadjusteddescriptor: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAdjustObjectSecurity")

public actual fun seAppendPrivileges(accessstate: MutPtr<AccessState>, privileges: ConstPtr<PrivilegeSet>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAppendPrivileges")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemSeAuditFipsCryptoSelftests")
private external fun wasiWindowssysWindowsWdkStorageFilesystemSeAuditFipsCryptoSelftests(bsuccess: Int, selftestcode: Int): Unit

public actual fun seAuditFipsCryptoSelftests(bsuccess: Boolean, selftestcode: UInt): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemSeAuditFipsCryptoSelftests(if (bsuccess) 1 else 0, selftestcode.toInt())

public actual fun seAuditHardLinkCreation(filename: ConstPtr<UnicodeString>, linkname: ConstPtr<UnicodeString>, bsuccess: Boolean): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAuditHardLinkCreation")

public actual fun seAuditHardLinkCreationWithTransaction(filename: ConstPtr<UnicodeString>, linkname: ConstPtr<UnicodeString>, bsuccess: Boolean, transactionid: ConstPtr<Guid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAuditHardLinkCreationWithTransaction")

public actual fun seAuditTransactionStateChange(transactionid: ConstPtr<Guid>, resourcemanagerid: ConstPtr<Guid>, newtransactionstate: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAuditTransactionStateChange")

public actual fun seAuditingAnyFileEventsWithContext(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr<SecuritySubjectContext>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAuditingAnyFileEventsWithContext")

public actual fun seAuditingAnyFileEventsWithContextEx(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr<SecuritySubjectContext>, stagingenabled: MutPtr<Boolean>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAuditingAnyFileEventsWithContextEx")

public actual fun seAuditingFileEvents(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAuditingFileEvents")

public actual fun seAuditingFileEventsWithContext(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr<SecuritySubjectContext>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAuditingFileEventsWithContext")

public actual fun seAuditingFileEventsWithContextEx(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr<SecuritySubjectContext>, stagingenabled: MutPtr<Boolean>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAuditingFileEventsWithContextEx")

public actual fun seAuditingFileOrGlobalEvents(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr<SecuritySubjectContext>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAuditingFileOrGlobalEvents")

public actual fun seAuditingHardLinkEvents(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAuditingHardLinkEvents")

public actual fun seAuditingHardLinkEventsWithContext(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr<SecuritySubjectContext>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAuditingHardLinkEventsWithContext")

public actual fun seCaptureSubjectContextEx(thread: Pethread, process: Peprocess, subjectcontext: MutPtr<SecuritySubjectContext>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeCaptureSubjectContextEx")

public actual fun seCheckForCriticalAceRemoval(currentdescriptor: PsecurityDescriptor, newdescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr<SecuritySubjectContext>, aceremoved: MutPtr<Boolean>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeCheckForCriticalAceRemoval")

public actual fun seCreateClientSecurity(clientthread: Pethread, clientsecurityqos: ConstPtr<SecurityQualityOfService>, remotesession: Boolean, clientcontext: MutPtr<SecurityClientContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeCreateClientSecurity")

public actual fun seCreateClientSecurityFromSubjectContext(subjectcontext: ConstPtr<SecuritySubjectContext>, clientsecurityqos: ConstPtr<SecurityQualityOfService>, serverisremote: Boolean, clientcontext: MutPtr<SecurityClientContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeCreateClientSecurityFromSubjectContext")

public actual fun seDeleteClientSecurity(clientcontext: MutPtr<SecurityClientContext>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeDeleteClientSecurity")

public actual fun seDeleteObjectAuditAlarm(obj: ConstPtr<CVoid>, handle: Handle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeDeleteObjectAuditAlarm")

public actual fun seDeleteObjectAuditAlarmWithTransaction(obj: ConstPtr<CVoid>, handle: Handle, transactionid: ConstPtr<Guid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeDeleteObjectAuditAlarmWithTransaction")

public actual fun seExamineSacl(sacl: ConstPtr<Acl>, resourcesacl: ConstPtr<Acl>, token: ConstPtr<CVoid>, desiredaccess: UInt, accessgranted: Boolean, generateaudit: MutPtr<Boolean>, generatealarm: MutPtr<Boolean>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeExamineSacl")

public actual fun seFilterToken(existingtoken: ConstPtr<CVoid>, flags: UInt, sidstodisable: ConstPtr<TokenGroups>, privilegestodelete: ConstPtr<TokenPrivileges>, restrictedsids: ConstPtr<TokenGroups>, filteredtoken: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeFilterToken")

public actual fun seFreePrivileges(privileges: ConstPtr<PrivilegeSet>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeFreePrivileges")

public actual fun seImpersonateClient(clientcontext: ConstPtr<SecurityClientContext>, serverthread: Pethread): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeImpersonateClient")

public actual fun seImpersonateClientEx(clientcontext: ConstPtr<SecurityClientContext>, serverthread: Pethread): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeImpersonateClientEx")

public actual fun seLocateProcessImageName(process: Peprocess, pimagefilename: MutPtr<MutPtr<UnicodeString>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeLocateProcessImageName")

public actual fun seMarkLogonSessionForTerminationNotification(logonid: ConstPtr<Luid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeMarkLogonSessionForTerminationNotification")

public actual fun seMarkLogonSessionForTerminationNotificationEx(logonid: ConstPtr<Luid>, pserversilo: Pesilo): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeMarkLogonSessionForTerminationNotificationEx")

public actual fun seOpenObjectAuditAlarm(objecttypename: ConstPtr<UnicodeString>, obj: ConstPtr<CVoid>, absoluteobjectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, accessstate: ConstPtr<AccessState>, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: MutPtr<Boolean>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeOpenObjectAuditAlarm")

public actual fun seOpenObjectAuditAlarmWithTransaction(objecttypename: ConstPtr<UnicodeString>, obj: ConstPtr<CVoid>, absoluteobjectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, accessstate: ConstPtr<AccessState>, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: ConstPtr<Guid>, generateonclose: MutPtr<Boolean>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeOpenObjectAuditAlarmWithTransaction")

public actual fun seOpenObjectForDeleteAuditAlarm(objecttypename: ConstPtr<UnicodeString>, obj: ConstPtr<CVoid>, absoluteobjectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, accessstate: ConstPtr<AccessState>, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: MutPtr<Boolean>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeOpenObjectForDeleteAuditAlarm")

public actual fun seOpenObjectForDeleteAuditAlarmWithTransaction(objecttypename: ConstPtr<UnicodeString>, obj: ConstPtr<CVoid>, absoluteobjectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, accessstate: ConstPtr<AccessState>, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: ConstPtr<Guid>, generateonclose: MutPtr<Boolean>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeOpenObjectForDeleteAuditAlarmWithTransaction")

public actual fun sePrivilegeCheck(requiredprivileges: MutPtr<PrivilegeSet>, subjectsecuritycontext: ConstPtr<SecuritySubjectContext>, accessmode: Byte): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSePrivilegeCheck")

public actual fun seQueryAuthenticationIdToken(token: ConstPtr<CVoid>, authenticationid: MutPtr<Luid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeQueryAuthenticationIdToken")

public actual fun seQueryInformationToken(token: ConstPtr<CVoid>, tokeninformationclass: TokenInformationClass, tokeninformation: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeQueryInformationToken")

public actual fun seQuerySecurityDescriptorInfo(securityinformation: ConstPtr<UInt>, securitydescriptor: PsecurityDescriptor, length: MutPtr<UInt>, objectssecuritydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeQuerySecurityDescriptorInfo")

public actual fun seQueryServerSiloToken(token: ConstPtr<CVoid>, pserversilo: MutPtr<Pesilo>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeQueryServerSiloToken")

public actual fun seQuerySessionIdToken(token: ConstPtr<CVoid>, sessionid: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeQuerySessionIdToken")

public actual fun seQuerySessionIdTokenEx(token: ConstPtr<CVoid>, sessionid: MutPtr<UInt>, isservicesession: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeQuerySessionIdTokenEx")

public actual fun seRegisterLogonSessionTerminatedRoutine(callbackroutine: PseLogonSessionTerminatedRoutine): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeRegisterLogonSessionTerminatedRoutine")

public actual fun seRegisterLogonSessionTerminatedRoutineEx(callbackroutine: PseLogonSessionTerminatedRoutineEx, context: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeRegisterLogonSessionTerminatedRoutineEx")

public actual fun seReportSecurityEventWithSubCategory(flags: UInt, sourcename: ConstPtr<UnicodeString>, usersid: Psid, auditparameters: ConstPtr<SeAdtParameterArray>, auditsubcategoryid: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeReportSecurityEventWithSubCategory")

public actual fun seSetAccessStateGenericMapping(accessstate: MutPtr<AccessState>, genericmapping: ConstPtr<GenericMapping>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeSetAccessStateGenericMapping")

public actual fun seSetSecurityDescriptorInfo(obj: ConstPtr<CVoid>, securityinformation: ConstPtr<UInt>, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: MutPtr<PsecurityDescriptor>, pooltype: PoolType, genericmapping: ConstPtr<GenericMapping>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeSetSecurityDescriptorInfo")

public actual fun seSetSecurityDescriptorInfoEx(obj: ConstPtr<CVoid>, securityinformation: ConstPtr<UInt>, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: MutPtr<PsecurityDescriptor>, autoinheritflags: UInt, pooltype: PoolType, genericmapping: ConstPtr<GenericMapping>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeSetSecurityDescriptorInfoEx")

public actual fun seShouldCheckForAccessRightsFromParent(objecttype: ConstPtr<CVoid>, childdescriptor: PsecurityDescriptor, accessstate: ConstPtr<AccessState>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeShouldCheckForAccessRightsFromParent")

public actual fun seTokenFromAccessInformation(accessinformation: ConstPtr<TokenAccessInformation>, token: MutPtr<CVoid>, length: UInt, requiredlength: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeTokenFromAccessInformation")

public actual fun seTokenIsAdmin(token: ConstPtr<CVoid>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeTokenIsAdmin")

public actual fun seTokenIsRestricted(token: ConstPtr<CVoid>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeTokenIsRestricted")

public actual fun seTokenIsWriteRestricted(token: ConstPtr<CVoid>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeTokenIsWriteRestricted")

public actual fun seTokenType(token: ConstPtr<CVoid>): TokenType =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeTokenType")

public actual fun seUnregisterLogonSessionTerminatedRoutine(callbackroutine: PseLogonSessionTerminatedRoutine): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeUnregisterLogonSessionTerminatedRoutine")

public actual fun seUnregisterLogonSessionTerminatedRoutineEx(callbackroutine: PseLogonSessionTerminatedRoutineEx, context: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeUnregisterLogonSessionTerminatedRoutineEx")

public actual fun secLookupAccountName(name: ConstPtr<UnicodeString>, sidsize: MutPtr<UInt>, sid: Psid, nameuse: MutPtr<SidNameUse>, domainsize: MutPtr<UInt>, referenceddomain: MutPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSecLookupAccountName")

public actual fun secLookupAccountSid(sid: Psid, namesize: MutPtr<UInt>, namebuffer: MutPtr<UnicodeString>, domainsize: MutPtr<UInt>, domainbuffer: MutPtr<UnicodeString>, nameuse: MutPtr<SidNameUse>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSecLookupAccountSid")

public actual fun secLookupWellKnownSid(sidtype: WellKnownSidType, sid: Psid, sidbuffersize: UInt, sidsize: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSecLookupWellKnownSid")

public actual fun secMakeSPN(serviceclass: MutPtr<UnicodeString>, servicename: MutPtr<UnicodeString>, instancename: MutPtr<UnicodeString>, instanceport: UShort, referrer: MutPtr<UnicodeString>, spn: MutPtr<UnicodeString>, length: MutPtr<UInt>, allocate: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSecMakeSPN")

public actual fun secMakeSPNEx(serviceclass: MutPtr<UnicodeString>, servicename: MutPtr<UnicodeString>, instancename: MutPtr<UnicodeString>, instanceport: UShort, referrer: MutPtr<UnicodeString>, targetinfo: MutPtr<UnicodeString>, spn: MutPtr<UnicodeString>, length: MutPtr<UInt>, allocate: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSecMakeSPNEx")

public actual fun secMakeSPNEx2(serviceclass: MutPtr<UnicodeString>, servicename: MutPtr<UnicodeString>, instancename: MutPtr<UnicodeString>, instanceport: UShort, referrer: MutPtr<UnicodeString>, intargetinfo: MutPtr<UnicodeString>, spn: MutPtr<UnicodeString>, totalsize: MutPtr<UInt>, allocate: Boolean, istargetinfomarshaled: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSecMakeSPNEx2")

public actual fun setContextAttributesW(phcontext: ConstPtr<SecHandle>, ulattribute: UInt, pbuffer: ConstPtr<CVoid>, cbbuffer: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSetContextAttributesW")

public actual fun sspiAcceptSecurityContextAsync(asynccontext: MutPtr<SspiAsyncContext>, phcredential: ConstPtr<SecHandle>, phcontext: ConstPtr<SecHandle>, pinput: ConstPtr<SecBufferDesc>, fcontextreq: UInt, targetdatarep: UInt, phnewcontext: ConstPtr<SecHandle>, poutput: ConstPtr<SecBufferDesc>, pfcontextattr: ConstPtr<UInt>, ptsexpiry: ConstPtr<Long>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSspiAcceptSecurityContextAsync")

public actual fun sspiAcquireCredentialsHandleAsyncA(asynccontext: MutPtr<SspiAsyncContext>, pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: UInt, pvlogonid: ConstPtr<CVoid>, pauthdata: ConstPtr<CVoid>, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr<CVoid>, phcredential: ConstPtr<SecHandle>, ptsexpiry: ConstPtr<Long>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSspiAcquireCredentialsHandleAsyncA")

public actual fun sspiAcquireCredentialsHandleAsyncW(asynccontext: MutPtr<SspiAsyncContext>, pszprincipal: ConstPtr<UnicodeString>, pszpackage: ConstPtr<UnicodeString>, fcredentialuse: UInt, pvlogonid: ConstPtr<CVoid>, pauthdata: ConstPtr<CVoid>, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr<CVoid>, phcredential: ConstPtr<SecHandle>, ptsexpiry: ConstPtr<Long>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSspiAcquireCredentialsHandleAsyncW")

public actual fun sspiCreateAsyncContext(): MutPtr<SspiAsyncContext> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSspiCreateAsyncContext")

public actual fun sspiDeleteSecurityContextAsync(asynccontext: MutPtr<SspiAsyncContext>, phcontext: ConstPtr<SecHandle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSspiDeleteSecurityContextAsync")

public actual fun sspiFreeAsyncContext(handle: ConstPtr<SspiAsyncContext>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSspiFreeAsyncContext")

public actual fun sspiFreeCredentialsHandleAsync(asynccontext: MutPtr<SspiAsyncContext>, phcredential: ConstPtr<SecHandle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSspiFreeCredentialsHandleAsync")

public actual fun sspiGetAsyncCallStatus(handle: ConstPtr<SspiAsyncContext>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSspiGetAsyncCallStatus")

public actual fun sspiInitializeSecurityContextAsyncA(asynccontext: MutPtr<SspiAsyncContext>, phcredential: ConstPtr<SecHandle>, phcontext: ConstPtr<SecHandle>, psztargetname: Pcstr, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr<SecBufferDesc>, reserved2: UInt, phnewcontext: ConstPtr<SecHandle>, poutput: ConstPtr<SecBufferDesc>, pfcontextattr: ConstPtr<UInt>, ptsexpiry: ConstPtr<Long>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSspiInitializeSecurityContextAsyncA")

public actual fun sspiInitializeSecurityContextAsyncW(asynccontext: MutPtr<SspiAsyncContext>, phcredential: ConstPtr<SecHandle>, phcontext: ConstPtr<SecHandle>, psztargetname: ConstPtr<UnicodeString>, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr<SecBufferDesc>, reserved2: UInt, phnewcontext: ConstPtr<SecHandle>, poutput: ConstPtr<SecBufferDesc>, pfcontextattr: ConstPtr<UInt>, ptsexpiry: ConstPtr<Long>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSspiInitializeSecurityContextAsyncW")

public actual fun sspiReinitAsyncContext(handle: MutPtr<SspiAsyncContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSspiReinitAsyncContext")

public actual fun sspiSetAsyncNotifyCallback(context: ConstPtr<SspiAsyncContext>, callback: SspiAsyncNotifyCallback, callbackdata: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSspiSetAsyncNotifyCallback")

public actual fun verifySignature(phcontext: ConstPtr<SecHandle>, pmessage: ConstPtr<SecBufferDesc>, messageseqno: UInt, pfqop: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemVerifySignature")

public actual fun zwAccessCheckAndAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, objecttypename: ConstPtr<UnicodeString>, objectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Boolean, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>, generateonclose: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwAccessCheckAndAuditAlarm")

public actual fun zwAccessCheckByTypeAndAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, objecttypename: ConstPtr<UnicodeString>, objectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Boolean, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>, generateonclose: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwAccessCheckByTypeAndAuditAlarm")

public actual fun zwAccessCheckByTypeResultListAndAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, objecttypename: ConstPtr<UnicodeString>, objectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Boolean, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>, generateonclose: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwAccessCheckByTypeResultListAndAuditAlarm")

public actual fun zwAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, clienttoken: Handle, objecttypename: ConstPtr<UnicodeString>, objectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Boolean, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>, generateonclose: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwAccessCheckByTypeResultListAndAuditAlarmByHandle")

public actual fun zwAdjustGroupsToken(tokenhandle: Handle, resettodefault: Boolean, newstate: ConstPtr<TokenGroups>, bufferlength: UInt, previousstate: MutPtr<TokenGroups>, returnlength: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwAdjustGroupsToken")

public actual fun zwAdjustPrivilegesToken(tokenhandle: Handle, disableallprivileges: Boolean, newstate: ConstPtr<TokenPrivileges>, bufferlength: UInt, previousstate: MutPtr<TokenPrivileges>, returnlength: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwAdjustPrivilegesToken")

public actual fun zwAllocateVirtualMemory(processhandle: Handle, baseaddress: MutPtr<MutPtr<CVoid>>, zerobits: ULong, regionsize: MutPtr<ULong>, allocationtype: UInt, protect: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwAllocateVirtualMemory")

public actual fun zwAllocateVirtualMemoryEx(processhandle: Handle, baseaddress: MutPtr<MutPtr<CVoid>>, regionsize: MutPtr<ULong>, allocationtype: UInt, pageprotection: UInt, extendedparameters: MutPtr<MemExtendedParameter>, extendedparametercount: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwAllocateVirtualMemoryEx")

public actual fun zwCancelIoFileEx(filehandle: Handle, iorequesttocancel: ConstPtr<IoStatusBlock>, iostatusblock: MutPtr<IoStatusBlock>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwCancelIoFileEx")

public actual fun zwCloseObjectAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, generateonclose: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwCloseObjectAuditAlarm")

public actual fun zwCreateDirectoryObject(directoryhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwCreateDirectoryObject")

public actual fun zwCreateEvent(eventhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, eventtype: EventType, initialstate: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwCreateEvent")

public actual fun zwCreateSectionEx(sectionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, maximumsize: ConstPtr<Long>, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle, extendedparameters: MutPtr<MemExtendedParameter>, extendedparametercount: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwCreateSectionEx")

public actual fun zwDeleteFile(objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwDeleteFile")

public actual fun zwDeleteObjectAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, generateonclose: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwDeleteObjectAuditAlarm")

public actual fun zwDuplicateObject(sourceprocesshandle: Handle, sourcehandle: Handle, targetprocesshandle: Handle, targethandle: MutPtr<Handle>, desiredaccess: UInt, handleattributes: UInt, options: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwDuplicateObject")

public actual fun zwDuplicateToken(existingtokenhandle: Handle, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, effectiveonly: Boolean, tokentype: TokenType, newtokenhandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwDuplicateToken")

public actual fun zwFilterToken(existingtokenhandle: Handle, flags: UInt, sidstodisable: ConstPtr<TokenGroups>, privilegestodelete: ConstPtr<TokenPrivileges>, restrictedsids: ConstPtr<TokenGroups>, newtokenhandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwFilterToken")

public actual fun zwFlushBuffersFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwFlushBuffersFile")

public actual fun zwFlushBuffersFileEx(filehandle: Handle, flags: UInt, parameters: ConstPtr<CVoid>, parameterssize: UInt, iostatusblock: MutPtr<IoStatusBlock>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwFlushBuffersFileEx")

public actual fun zwFlushVirtualMemory(processhandle: Handle, baseaddress: MutPtr<MutPtr<CVoid>>, regionsize: MutPtr<ULong>, iostatus: MutPtr<IoStatusBlock>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwFlushVirtualMemory")

public actual fun zwFreeVirtualMemory(processhandle: Handle, baseaddress: MutPtr<MutPtr<CVoid>>, regionsize: MutPtr<ULong>, freetype: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwFreeVirtualMemory")

public actual fun zwFsControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, fscontrolcode: UInt, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwFsControlFile")

public actual fun zwImpersonateAnonymousToken(threadhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwImpersonateAnonymousToken")

public actual fun zwLockFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, byteoffset: ConstPtr<Long>, length: ConstPtr<Long>, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwLockFile")

public actual fun zwNotifyChangeKey(keyhandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, completionfilter: UInt, watchtree: Boolean, buffer: MutPtr<CVoid>, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwNotifyChangeKey")

public actual fun zwOpenDirectoryObject(directoryhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwOpenDirectoryObject")

public actual fun zwOpenObjectAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, objecttypename: ConstPtr<UnicodeString>, objectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: ConstPtr<PrivilegeSet>, objectcreation: Boolean, accessgranted: Boolean, generateonclose: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwOpenObjectAuditAlarm")

public actual fun zwOpenProcessToken(processhandle: Handle, desiredaccess: UInt, tokenhandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwOpenProcessToken")

public actual fun zwOpenProcessTokenEx(processhandle: Handle, desiredaccess: UInt, handleattributes: UInt, tokenhandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwOpenProcessTokenEx")

public actual fun zwOpenThreadToken(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, tokenhandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwOpenThreadToken")

public actual fun zwOpenThreadTokenEx(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwOpenThreadTokenEx")

public actual fun zwPrivilegeCheck(clienttoken: Handle, requiredprivileges: MutPtr<PrivilegeSet>, result: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwPrivilegeCheck")

public actual fun zwPrivilegeObjectAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, clienttoken: Handle, desiredaccess: UInt, privileges: ConstPtr<PrivilegeSet>, accessgranted: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwPrivilegeObjectAuditAlarm")

public actual fun zwPrivilegedServiceAuditAlarm(subsystemname: ConstPtr<UnicodeString>, servicename: ConstPtr<UnicodeString>, clienttoken: Handle, privileges: ConstPtr<PrivilegeSet>, accessgranted: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwPrivilegedServiceAuditAlarm")

public actual fun zwQueryDirectoryFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: ConstPtr<UnicodeString>, restartscan: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwQueryDirectoryFile")

public actual fun zwQueryDirectoryFileEx(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: ConstPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwQueryDirectoryFileEx")

public actual fun zwQueryDirectoryObject(directoryhandle: Handle, buffer: MutPtr<CVoid>, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: MutPtr<UInt>, returnlength: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwQueryDirectoryObject")

public actual fun zwQueryEaFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, buffer: MutPtr<CVoid>, length: UInt, returnsingleentry: Boolean, ealist: ConstPtr<CVoid>, ealistlength: UInt, eaindex: ConstPtr<UInt>, restartscan: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwQueryEaFile")

public actual fun zwQueryFullAttributesFile(objectattributes: ConstPtr<ObjectAttributes>, fileinformation: MutPtr<FileNetworkOpenInformation>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwQueryFullAttributesFile")

public actual fun zwQueryInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: MutPtr<CVoid>, tokeninformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwQueryInformationToken")

public actual fun zwQueryObject(handle: Handle, objectinformationclass: ObjectInformationClass, objectinformation: MutPtr<CVoid>, objectinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwQueryObject")

public actual fun zwQueryQuotaInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, buffer: MutPtr<CVoid>, length: UInt, returnsingleentry: Boolean, sidlist: ConstPtr<CVoid>, sidlistlength: UInt, startsid: Psid, restartscan: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwQueryQuotaInformationFile")

public actual fun zwQuerySecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwQuerySecurityObject")

public actual fun zwQueryVirtualMemory(processhandle: Handle, baseaddress: ConstPtr<CVoid>, memoryinformationclass: MemoryInformationClass, memoryinformation: MutPtr<CVoid>, memoryinformationlength: ULong, returnlength: MutPtr<ULong>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwQueryVirtualMemory")

public actual fun zwQueryVolumeInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, fsinformation: MutPtr<CVoid>, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwQueryVolumeInformationFile")

public actual fun zwSetEaFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, buffer: ConstPtr<CVoid>, length: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwSetEaFile")

public actual fun zwSetEvent(eventhandle: Handle, previousstate: MutPtr<Int>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwSetEvent")

public actual fun zwSetInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: ConstPtr<CVoid>, tokeninformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwSetInformationToken")

public actual fun zwSetInformationVirtualMemory(processhandle: Handle, vminformationclass: VirtualMemoryInformationClass, numberofentries: ULong, virtualaddresses: ConstPtr<MemoryRangeEntry>, vminformation: ConstPtr<CVoid>, vminformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwSetInformationVirtualMemory")

public actual fun zwSetQuotaInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, buffer: ConstPtr<CVoid>, length: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwSetQuotaInformationFile")

public actual fun zwSetSecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwSetSecurityObject")

public actual fun zwSetVolumeInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, fsinformation: ConstPtr<CVoid>, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwSetVolumeInformationFile")

public actual fun zwUnlockFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, byteoffset: ConstPtr<Long>, length: ConstPtr<Long>, key: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwUnlockFile")
