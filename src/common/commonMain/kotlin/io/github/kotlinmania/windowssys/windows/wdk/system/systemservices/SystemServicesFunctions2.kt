package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PAFFINITY_TOKEN
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PEJOB
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PEPROCESS
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PESILO
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PETHREAD
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PKDEFERRED_ROUTINE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PKINTERRUPT
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PKTHREAD
import io.github.kotlinmania.windowssys.windows.wdk.foundation.POBJECT_TYPE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.POHANDLE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.POOL_TYPE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PPCW_BUFFER
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PPCW_INSTANCE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PPCW_REGISTRATION
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PSILO_MONITOR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.TIMER_TYPE
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.WAIT_TYPE
import io.github.kotlinmania.windowssys.windows.win32.system.power.DEVICE_POWER_STATE
import io.github.kotlinmania.windowssys.windows.win32.system.power.POWER_INFORMATION_LEVEL
import io.github.kotlinmania.windowssys.windows.win32.system.power.POWER_REQUEST_TYPE
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.LOGICAL_PROCESSOR_RELATIONSHIP
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.ENLISTMENT_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.KTMOBJECT_TYPE
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.RESOURCEMANAGER_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.TRANSACTIONMANAGER_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.TRANSACTION_INFORMATION_CLASS

public expect fun KeInitializeMutex(mutex: Long, level: UInt)

public expect fun KeInitializeSemaphore(semaphore: Long, count: Int, limit: Int)

public expect fun KeInitializeSpinLock(spinlock: Long)

public expect fun KeInitializeThreadedDpc(dpc: Long, deferredroutine: PKDEFERRED_ROUTINE, deferredcontext: Long)

public expect fun KeInitializeTimer(timer: Long)

public expect fun KeInitializeTimerEx(timer: Long, type: TIMER_TYPE)

public expect fun KeInitializeTriageDumpDataArray(ktriagedumpdataarray: Long, size: UInt): NTSTATUS

public expect fun KeInsertByKeyDeviceQueue(devicequeue: Long, devicequeueentry: Long, sortkey: UInt): Boolean

public expect fun KeInsertDeviceQueue(devicequeue: Long, devicequeueentry: Long): Boolean

public expect fun KeInsertQueueDpc(dpc: Long, systemargument1: Long, systemargument2: Long): Boolean

public expect fun KeInvalidateAllCaches(): Boolean

public expect fun KeInvalidateRangeAllCaches(baseaddress: Long, length: UInt)

public expect fun KeIpiGenericCall(broadcastfunction: PKIPI_BROADCAST_WORKER, context: ULong): ULong

public expect fun KeIsExecutingDpc(): UInt

public expect fun KeLeaveCriticalRegion()

public expect fun KeLeaveGuardedRegion()

public expect fun KePulseEvent(event: Long, increment: Int, wait: Boolean): Int

public expect fun KeQueryActiveGroupCount(): UShort

public expect fun KeQueryActiveProcessorCount(activeprocessors: Long): UInt

public expect fun KeQueryActiveProcessorCountEx(groupnumber: UShort): UInt

public expect fun KeQueryActiveProcessors(): ULong

public expect fun KeQueryAuxiliaryCounterFrequency(auxiliarycounterfrequency: Long): NTSTATUS

public expect fun KeQueryDpcWatchdogInformation(watchdoginformation: Long): NTSTATUS

public expect fun KeQueryGroupAffinity(groupnumber: UShort): ULong

public expect fun KeQueryHardwareCounterConfiguration(counterarray: Long, maximumcount: UInt, count: Long): NTSTATUS

public expect fun KeQueryHighestNodeNumber(): UShort

public expect fun KeQueryInterruptTimePrecise(qpctimestamp: Long): ULong

public expect fun KeQueryLogicalProcessorRelationship(processornumber: Long, relationshiptype: LOGICAL_PROCESSOR_RELATIONSHIP, information: Long, length: Long): NTSTATUS

public expect fun KeQueryMaximumGroupCount(): UShort

public expect fun KeQueryMaximumProcessorCount(): UInt

public expect fun KeQueryMaximumProcessorCountEx(groupnumber: UShort): UInt

public expect fun KeQueryNodeActiveAffinity(nodenumber: UShort, affinity: Long, count: Long)

public expect fun KeQueryNodeActiveAffinity2(nodenumber: UShort, groupaffinities: Long, groupaffinitiescount: UShort, groupaffinitiesrequired: Long): NTSTATUS

public expect fun KeQueryNodeActiveProcessorCount(nodenumber: UShort): UInt

public expect fun KeQueryNodeMaximumProcessorCount(nodenumber: UShort): UShort

public expect fun KeQueryPerformanceCounter(performancefrequency: Long): Long

public expect fun KeQueryPriorityThread(thread: PKTHREAD): Int

public expect fun KeQueryRuntimeThread(thread: PKTHREAD, usertime: Long): UInt

public expect fun KeQuerySystemTimePrecise(currenttime: Long)

public expect fun KeQueryTimeIncrement(): UInt

public expect fun KeQueryTotalCycleTimeThread(thread: PKTHREAD, cycletimestamp: Long): ULong

public expect fun KeQueryUnbiasedInterruptTime(): ULong

public expect fun KeQueryUnbiasedInterruptTimePrecise(qpctimestamp: Long): ULong

public expect fun KeReadStateEvent(event: Long): Int

public expect fun KeReadStateMutex(mutex: Long): Int

public expect fun KeReadStateSemaphore(semaphore: Long): Int

public expect fun KeReadStateTimer(timer: Long): Boolean

public expect fun KeRegisterBoundCallback(callbackroutine: PBOUND_CALLBACK): Long

public expect fun KeRegisterBugCheckCallback(callbackrecord: Long, callbackroutine: PKBUGCHECK_CALLBACK_ROUTINE, buffer: Long, length: UInt, component: Long): Boolean

public expect fun KeRegisterBugCheckReasonCallback(callbackrecord: Long, callbackroutine: PKBUGCHECK_REASON_CALLBACK_ROUTINE, reason: KBUGCHECK_CALLBACK_REASON, component: Long): Boolean

public expect fun KeRegisterNmiCallback(callbackroutine: PNMI_CALLBACK, context: Long): Long

public expect fun KeRegisterProcessorChangeCallback(callbackfunction: PPROCESSOR_CALLBACK_FUNCTION, callbackcontext: Long, flags: UInt): Long

public expect fun KeReleaseGuardedMutex(mutex: Long)

public expect fun KeReleaseGuardedMutexUnsafe(fastmutex: Long)

public expect fun KeReleaseInStackQueuedSpinLock(lockhandle: Long)

public expect fun KeReleaseInStackQueuedSpinLockForDpc(lockhandle: Long)

public expect fun KeReleaseInStackQueuedSpinLockFromDpcLevel(lockhandle: Long)

public expect fun KeReleaseInterruptSpinLock(interrupt: PKINTERRUPT, oldirql: UByte)

public expect fun KeReleaseMutex(mutex: Long, wait: Boolean): Int

public expect fun KeReleaseSemaphore(semaphore: Long, increment: Int, adjustment: Int, wait: Boolean): Int

public expect fun KeReleaseSpinLockForDpc(spinlock: Long, oldirql: UByte)

public expect fun KeRemoveByKeyDeviceQueue(devicequeue: Long, sortkey: UInt): Long

public expect fun KeRemoveByKeyDeviceQueueIfBusy(devicequeue: Long, sortkey: UInt): Long

public expect fun KeRemoveDeviceQueue(devicequeue: Long): Long

public expect fun KeRemoveEntryDeviceQueue(devicequeue: Long, devicequeueentry: Long): Boolean

public expect fun KeRemoveQueueDpc(dpc: Long): Boolean

public expect fun KeRemoveQueueDpcEx(dpc: Long, waitifactive: Boolean): Boolean

public expect fun KeResetEvent(event: Long): Int

public expect fun KeRestoreExtendedProcessorState(xstatesave: Long)

public expect fun KeRevertToUserAffinityThread()

public expect fun KeRevertToUserAffinityThreadEx(affinity: ULong)

public expect fun KeRevertToUserGroupAffinityThread(previousaffinity: Long)

public expect fun KeSaveExtendedProcessorState(mask: ULong, xstatesave: Long): NTSTATUS

public expect fun KeSetBasePriorityThread(thread: PKTHREAD, increment: Int): Int

public expect fun KeSetCoalescableTimer(timer: Long, duetime: Long, period: UInt, tolerabledelay: UInt, dpc: Long): Boolean

public expect fun KeSetEvent(event: Long, increment: Int, wait: Boolean): Int

public expect fun KeSetHardwareCounterConfiguration(counterarray: Long, count: UInt): NTSTATUS

public expect fun KeSetImportanceDpc(dpc: Long, importance: KDPC_IMPORTANCE)

public expect fun KeSetPriorityThread(thread: PKTHREAD, priority: Int): Int

public expect fun KeSetSystemAffinityThread(affinity: ULong)

public expect fun KeSetSystemAffinityThreadEx(affinity: ULong): ULong

public expect fun KeSetSystemGroupAffinityThread(affinity: Long, previousaffinity: Long)

public expect fun KeSetTargetProcessorDpc(dpc: Long, number: Byte)

public expect fun KeSetTargetProcessorDpcEx(dpc: Long, procnumber: Long): NTSTATUS

public expect fun KeSetTimer(timer: Long, duetime: Long, dpc: Long): Boolean

public expect fun KeSetTimerEx(timer: Long, duetime: Long, period: Int, dpc: Long): Boolean

public expect fun KeShouldYieldProcessor(): UInt

public expect fun KeStallExecutionProcessor(microseconds: UInt)

public expect fun KeSynchronizeExecution(interrupt: PKINTERRUPT, synchronizeroutine: PKSYNCHRONIZE_ROUTINE, synchronizecontext: Long): Boolean

public expect fun KeTestSpinLock(spinlock: Long): Boolean

public expect fun KeTryToAcquireGuardedMutex(mutex: Long): Boolean

public expect fun KeTryToAcquireSpinLockAtDpcLevel(spinlock: Long): Boolean

public expect fun KeWaitForMultipleObjects(count: UInt, obj: Long, waittype: WAIT_TYPE, waitreason: KWAIT_REASON, waitmode: Byte, alertable: Boolean, timeout: Long, waitblockarray: Long): NTSTATUS

public expect fun KeWaitForSingleObject(obj: Long, waitreason: KWAIT_REASON, waitmode: Byte, alertable: Boolean, timeout: Long): NTSTATUS

public expect fun KfRaiseIrql(newirql: UByte): UByte

public expect fun MmAddPhysicalMemory(startaddress: Long, numberofbytes: Long): NTSTATUS

public expect fun MmAddVerifierSpecialThunks(entryroutine: ULong, thunkbuffer: Long, thunkbuffersize: UInt): NTSTATUS

public expect fun MmAddVerifierThunks(thunkbuffer: Long, thunkbuffersize: UInt): NTSTATUS

public expect fun MmAdvanceMdl(mdl: Long, numberofbytes: UInt): NTSTATUS

public expect fun MmAllocateContiguousMemory(numberofbytes: ULong, highestacceptableaddress: Long): Long

public expect fun MmAllocateContiguousMemoryEx(numberofbytes: Long, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, preferrednode: UInt, protect: UInt, partitionobject: Long, tag: UInt, flags: UInt, baseaddress: Long): NTSTATUS

public expect fun MmAllocateContiguousMemorySpecifyCache(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MEMORY_CACHING_TYPE): Long

public expect fun MmAllocateContiguousMemorySpecifyCacheNode(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MEMORY_CACHING_TYPE, preferrednode: UInt): Long

public expect fun MmAllocateContiguousNodeMemory(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, protect: UInt, preferrednode: UInt): Long

public expect fun MmAllocateMappingAddress(numberofbytes: ULong, pooltag: UInt): Long

public expect fun MmAllocateMappingAddressEx(numberofbytes: ULong, pooltag: UInt, flags: UInt): Long

public expect fun MmAllocateMdlForIoSpace(physicaladdresslist: Long, numberofentries: ULong, newmdl: Long): NTSTATUS

public expect fun MmAllocateNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MEMORY_CACHING_TYPE, idealnode: UInt, flags: UInt): Long

public expect fun MmAllocateNonCachedMemory(numberofbytes: ULong): Long

public expect fun MmAllocatePagesForMdl(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong): Long

public expect fun MmAllocatePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MEMORY_CACHING_TYPE, flags: UInt): Long

public expect fun MmAllocatePartitionNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MEMORY_CACHING_TYPE, idealnode: UInt, flags: UInt, partitionobject: Long): Long

public expect fun MmAreMdlPagesCached(memorydescriptorlist: Long): UInt

public expect fun MmBuildMdlForNonPagedPool(memorydescriptorlist: Long)

public expect fun MmCopyMemory(targetaddress: Long, sourceaddress: MM_COPY_ADDRESS, numberofbytes: ULong, flags: UInt, numberofbytestransferred: Long): NTSTATUS

public expect fun MmCreateMdl(memorydescriptorlist: Long, base: Long, length: ULong): Long

public expect fun MmCreateMirror(): NTSTATUS

public expect fun MmFreeContiguousMemory(baseaddress: Long)

public expect fun MmFreeContiguousMemorySpecifyCache(baseaddress: Long, numberofbytes: ULong, cachetype: MEMORY_CACHING_TYPE)

public expect fun MmFreeMappingAddress(baseaddress: Long, pooltag: UInt)

public expect fun MmFreeNonCachedMemory(baseaddress: Long, numberofbytes: ULong)

public expect fun MmFreePagesFromMdl(memorydescriptorlist: Long)

public expect fun MmFreePagesFromMdlEx(memorydescriptorlist: Long, flags: UInt)

public expect fun MmGetCacheAttribute(physicaladdress: Long, cachetype: Long): NTSTATUS

public expect fun MmGetCacheAttributeEx(physicaladdress: Long, flags: UInt, cachetype: Long): NTSTATUS

public expect fun MmGetPhysicalAddress(baseaddress: Long): Long

public expect fun MmGetPhysicalMemoryRanges(): Long

public expect fun MmGetPhysicalMemoryRangesEx(partitionobject: Long): Long

public expect fun MmGetPhysicalMemoryRangesEx2(partitionobject: Long, flags: UInt): Long

public expect fun MmGetSystemRoutineAddress(systemroutinename: Long): Long

public expect fun MmGetVirtualForPhysical(physicaladdress: Long): Long

public expect fun MmIsAddressValid(virtualaddress: Long): Boolean

public expect fun MmIsDriverSuspectForVerifier(driverobject: Long): UInt

public expect fun MmIsDriverVerifying(driverobject: Long): UInt

public expect fun MmIsDriverVerifyingByAddress(addresswithinsection: Long): UInt

public expect fun MmIsIoSpaceActive(startaddress: Long, numberofbytes: ULong): UInt

public expect fun MmIsNonPagedSystemAddressValid(virtualaddress: Long): Boolean

public expect fun MmIsThisAnNtAsSystem(): Boolean

public expect fun MmIsVerifierEnabled(verifierflags: Long): NTSTATUS

public expect fun MmLockPagableDataSection(addresswithinsection: Long): Long

public expect fun MmLockPagableSectionByHandle(imagesectionhandle: Long)

public expect fun MmMapIoSpace(physicaladdress: Long, numberofbytes: ULong, cachetype: MEMORY_CACHING_TYPE): Long

public expect fun MmMapIoSpaceEx(physicaladdress: Long, numberofbytes: ULong, protect: UInt): Long

public expect fun MmMapLockedPages(memorydescriptorlist: Long, accessmode: Byte): Long

public expect fun MmMapLockedPagesSpecifyCache(memorydescriptorlist: Long, accessmode: Byte, cachetype: MEMORY_CACHING_TYPE, requestedaddress: Long, bugcheckonfailure: UInt, priority: UInt): Long

public expect fun MmMapLockedPagesWithReservedMapping(mappingaddress: Long, pooltag: UInt, memorydescriptorlist: Long, cachetype: MEMORY_CACHING_TYPE): Long

public expect fun MmMapMdl(memorydescriptorlist: Long, protection: UInt, driverroutine: PMM_MDL_ROUTINE, drivercontext: Long): NTSTATUS

public expect fun MmMapMemoryDumpMdlEx(va: Long, pagetotal: UInt, memorydumpmdl: Long, flags: UInt): NTSTATUS

public expect fun MmMapUserAddressesToPage(baseaddress: Long, numberofbytes: ULong, pageaddress: Long): NTSTATUS

public expect fun MmMapVideoDisplay(physicaladdress: Long, numberofbytes: ULong, cachetype: MEMORY_CACHING_TYPE): Long

public expect fun MmMapViewInSessionSpace(section: Long, mappedbase: Long, viewsize: Long): NTSTATUS

public expect fun MmMapViewInSessionSpaceEx(section: Long, mappedbase: Long, viewsize: Long, sectionoffset: Long, flags: ULong): NTSTATUS

public expect fun MmMapViewInSystemSpace(section: Long, mappedbase: Long, viewsize: Long): NTSTATUS

public expect fun MmMapViewInSystemSpaceEx(section: Long, mappedbase: Long, viewsize: Long, sectionoffset: Long, flags: ULong): NTSTATUS

public expect fun MmMdlPageContentsState(memorydescriptorlist: Long, state: MM_MDL_PAGE_CONTENTS_STATE): MM_MDL_PAGE_CONTENTS_STATE

public expect fun MmPageEntireDriver(addresswithinsection: Long): Long

public expect fun MmProbeAndLockPages(memorydescriptorlist: Long, accessmode: Byte, operation: LOCK_OPERATION)

public expect fun MmProbeAndLockProcessPages(memorydescriptorlist: Long, process: PEPROCESS, accessmode: Byte, operation: LOCK_OPERATION)

public expect fun MmProbeAndLockSelectedPages(memorydescriptorlist: Long, segmentarray: Long, accessmode: Byte, operation: LOCK_OPERATION)

public expect fun MmProtectDriverSection(addresswithinsection: Long, size: ULong, flags: UInt): NTSTATUS

public expect fun MmProtectMdlSystemAddress(memorydescriptorlist: Long, newprotect: UInt): NTSTATUS

public expect fun MmQuerySystemSize(): MM_SYSTEMSIZE

public expect fun MmRemovePhysicalMemory(startaddress: Long, numberofbytes: Long): NTSTATUS

public expect fun MmResetDriverPaging(addresswithinsection: Long)

public expect fun MmRotatePhysicalView(virtualaddress: Long, numberofbytes: Long, newmdl: Long, direction: MM_ROTATE_DIRECTION, copyfunction: PMM_ROTATE_COPY_CALLBACK_FUNCTION, context: Long): NTSTATUS

public expect fun MmSecureVirtualMemory(address: Long, size: ULong, probemode: UInt): HANDLE

public expect fun MmSecureVirtualMemoryEx(address: Long, size: ULong, probemode: UInt, flags: UInt): HANDLE

public expect fun MmSetPermanentCacheAttribute(startaddress: Long, numberofbytes: Long, cachetype: MEMORY_CACHING_TYPE, flags: UInt): NTSTATUS

public expect fun MmSizeOfMdl(base: Long, length: ULong): ULong

public expect fun MmUnlockPagableImageSection(imagesectionhandle: Long)

public expect fun MmUnlockPages(memorydescriptorlist: Long)

public expect fun MmUnmapIoSpace(baseaddress: Long, numberofbytes: ULong)

public expect fun MmUnmapLockedPages(baseaddress: Long, memorydescriptorlist: Long)

public expect fun MmUnmapReservedMapping(baseaddress: Long, pooltag: UInt, memorydescriptorlist: Long)

public expect fun MmUnmapVideoDisplay(baseaddress: Long, numberofbytes: ULong)

public expect fun MmUnmapViewInSessionSpace(mappedbase: Long): NTSTATUS

public expect fun MmUnmapViewInSystemSpace(mappedbase: Long): NTSTATUS

public expect fun MmUnsecureVirtualMemory(securehandle: HANDLE)

public expect fun NtAllocateLocallyUniqueId(luid: Long): NTSTATUS

public expect fun NtCommitComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS

public expect fun NtCommitEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS

public expect fun NtCommitTransaction(transactionhandle: HANDLE, wait: Boolean): NTSTATUS

public expect fun NtCreateEnlistment(enlistmenthandle: Long, desiredaccess: UInt, resourcemanagerhandle: HANDLE, transactionhandle: HANDLE, objectattributes: Long, createoptions: UInt, notificationmask: UInt, enlistmentkey: Long): NTSTATUS

public expect fun NtCreateResourceManager(resourcemanagerhandle: Long, desiredaccess: UInt, tmhandle: HANDLE, rmguid: Long, objectattributes: Long, createoptions: UInt, description: Long): NTSTATUS

public expect fun NtCreateTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, uow: Long, tmhandle: HANDLE, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: Long, description: Long): NTSTATUS

public expect fun NtCreateTransactionManager(tmhandle: Long, desiredaccess: UInt, objectattributes: Long, logfilename: Long, createoptions: UInt, commitstrength: UInt): NTSTATUS

public expect fun NtDisplayString(string: Long): NTSTATUS

public expect fun NtEnumerateTransactionObject(rootobjecthandle: HANDLE, querytype: KTMOBJECT_TYPE, objectcursor: Long, objectcursorlength: UInt, returnlength: Long): NTSTATUS

public expect fun NtGetNotificationResourceManager(resourcemanagerhandle: HANDLE, transactionnotification: Long, notificationlength: UInt, timeout: Long, returnlength: Long, asynchronous: UInt, asynchronouscontext: ULong): NTSTATUS

public expect fun NtLoadDriver(driverservicename: Long): NTSTATUS

public expect fun NtMakeTemporaryObject(handle: HANDLE): NTSTATUS

public expect fun NtManagePartition(targethandle: HANDLE, sourcehandle: HANDLE, partitioninformationclass: PARTITION_INFORMATION_CLASS, partitioninformation: Long, partitioninformationlength: UInt): NTSTATUS

public expect fun NtOpenEnlistment(enlistmenthandle: Long, desiredaccess: UInt, resourcemanagerhandle: HANDLE, enlistmentguid: Long, objectattributes: Long): NTSTATUS

public expect fun NtOpenResourceManager(resourcemanagerhandle: Long, desiredaccess: UInt, tmhandle: HANDLE, resourcemanagerguid: Long, objectattributes: Long): NTSTATUS

public expect fun NtOpenTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, uow: Long, tmhandle: HANDLE): NTSTATUS

public expect fun NtOpenTransactionManager(tmhandle: Long, desiredaccess: UInt, objectattributes: Long, logfilename: Long, tmidentity: Long, openoptions: UInt): NTSTATUS

public expect fun NtPowerInformation(informationlevel: POWER_INFORMATION_LEVEL, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS

public expect fun NtPrePrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS

public expect fun NtPrePrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS

public expect fun NtPrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS

public expect fun NtPrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS

public expect fun NtPropagationComplete(resourcemanagerhandle: HANDLE, requestcookie: UInt, bufferlength: UInt, buffer: Long): NTSTATUS

public expect fun NtPropagationFailed(resourcemanagerhandle: HANDLE, requestcookie: UInt, propstatus: NTSTATUS): NTSTATUS

public expect fun NtQueryInformationEnlistment(enlistmenthandle: HANDLE, enlistmentinformationclass: ENLISTMENT_INFORMATION_CLASS, enlistmentinformation: Long, enlistmentinformationlength: UInt, returnlength: Long): NTSTATUS

public expect fun NtQueryInformationResourceManager(resourcemanagerhandle: HANDLE, resourcemanagerinformationclass: RESOURCEMANAGER_INFORMATION_CLASS, resourcemanagerinformation: Long, resourcemanagerinformationlength: UInt, returnlength: Long): NTSTATUS

public expect fun NtQueryInformationTransaction(transactionhandle: HANDLE, transactioninformationclass: TRANSACTION_INFORMATION_CLASS, transactioninformation: Long, transactioninformationlength: UInt, returnlength: Long): NTSTATUS

public expect fun NtQueryInformationTransactionManager(transactionmanagerhandle: HANDLE, transactionmanagerinformationclass: TRANSACTIONMANAGER_INFORMATION_CLASS, transactionmanagerinformation: Long, transactionmanagerinformationlength: UInt, returnlength: Long): NTSTATUS

public expect fun NtReadOnlyEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS

public expect fun NtRecoverEnlistment(enlistmenthandle: HANDLE, enlistmentkey: Long): NTSTATUS

public expect fun NtRecoverResourceManager(resourcemanagerhandle: HANDLE): NTSTATUS

public expect fun NtRecoverTransactionManager(transactionmanagerhandle: HANDLE): NTSTATUS

public expect fun NtRegisterProtocolAddressInformation(resourcemanager: HANDLE, protocolid: Long, protocolinformationsize: UInt, protocolinformation: Long, createoptions: UInt): NTSTATUS

public expect fun NtRenameTransactionManager(logfilename: Long, existingtransactionmanagerguid: Long): NTSTATUS

public expect fun NtRollbackComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS

public expect fun NtRollbackEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS

public expect fun NtRollbackTransaction(transactionhandle: HANDLE, wait: Boolean): NTSTATUS

public expect fun NtRollforwardTransactionManager(transactionmanagerhandle: HANDLE, tmvirtualclock: Long): NTSTATUS

public expect fun NtSetInformationEnlistment(enlistmenthandle: HANDLE, enlistmentinformationclass: ENLISTMENT_INFORMATION_CLASS, enlistmentinformation: Long, enlistmentinformationlength: UInt): NTSTATUS

public expect fun NtSetInformationResourceManager(resourcemanagerhandle: HANDLE, resourcemanagerinformationclass: RESOURCEMANAGER_INFORMATION_CLASS, resourcemanagerinformation: Long, resourcemanagerinformationlength: UInt): NTSTATUS

public expect fun NtSetInformationTransaction(transactionhandle: HANDLE, transactioninformationclass: TRANSACTION_INFORMATION_CLASS, transactioninformation: Long, transactioninformationlength: UInt): NTSTATUS

public expect fun NtSetInformationTransactionManager(tmhandle: HANDLE, transactionmanagerinformationclass: TRANSACTIONMANAGER_INFORMATION_CLASS, transactionmanagerinformation: Long, transactionmanagerinformationlength: UInt): NTSTATUS

public expect fun NtSinglePhaseReject(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS

public expect fun NtUnloadDriver(driverservicename: Long): NTSTATUS

public expect fun ObCloseHandle(handle: HANDLE, previousmode: Byte): NTSTATUS

public expect fun ObDereferenceObjectDeferDelete(obj: Long)

public expect fun ObDereferenceObjectDeferDeleteWithTag(obj: Long, tag: UInt)

public expect fun ObGetFilterVersion(): UShort

public expect fun ObGetObjectSecurity(obj: Long, securitydescriptor: Long, memoryallocated: Long): NTSTATUS

public expect fun ObReferenceObjectByHandle(handle: HANDLE, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte, obj: Long, handleinformation: Long): NTSTATUS

public expect fun ObReferenceObjectByHandleWithTag(handle: HANDLE, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte, tag: UInt, obj: Long, handleinformation: Long): NTSTATUS

public expect fun ObReferenceObjectByPointer(obj: Long, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte): NTSTATUS

public expect fun ObReferenceObjectByPointerWithTag(obj: Long, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte, tag: UInt): NTSTATUS

public expect fun ObReferenceObjectSafe(obj: Long): Boolean

public expect fun ObReferenceObjectSafeWithTag(obj: Long, tag: UInt): Boolean

public expect fun ObRegisterCallbacks(callbackregistration: Long, registrationhandle: Long): NTSTATUS

public expect fun ObReleaseObjectSecurity(securitydescriptor: PSECURITY_DESCRIPTOR, memoryallocated: Boolean)

public expect fun ObUnRegisterCallbacks(registrationhandle: Long)

public expect fun ObfDereferenceObject(obj: Long): Long

public expect fun ObfDereferenceObjectWithTag(obj: Long, tag: UInt): Long

public expect fun ObfReferenceObject(obj: Long): Long

public expect fun ObfReferenceObjectWithTag(obj: Long, tag: UInt): Long

public expect fun PcwAddInstance(buffer: PPCW_BUFFER, name: Long, id: UInt, count: UInt, data: Long): NTSTATUS

public expect fun PcwCloseInstance(instance: PPCW_INSTANCE)

public expect fun PcwCreateInstance(instance: Long, registration: PPCW_REGISTRATION, name: Long, count: UInt, data: Long): NTSTATUS

public expect fun PcwRegister(registration: Long, info: Long): NTSTATUS

public expect fun PcwUnregister(registration: PPCW_REGISTRATION)

public expect fun PoCallDriver(deviceobject: Long, irp: Long): NTSTATUS

public expect fun PoClearPowerRequest(powerrequest: Long, type: POWER_REQUEST_TYPE): NTSTATUS

public expect fun PoCreatePowerRequest(powerrequest: Long, deviceobject: Long, context: Long): NTSTATUS

public expect fun PoCreateThermalRequest(thermalrequest: Long, targetdeviceobject: Long, policydeviceobject: Long, context: Long, flags: UInt): NTSTATUS

public expect fun PoDeletePowerRequest(powerrequest: Long)

public expect fun PoDeleteThermalRequest(thermalrequest: Long)

public expect fun PoEndDeviceBusy(idlepointer: Long)

public expect fun PoFxActivateComponent(handle: POHANDLE, component: UInt, flags: UInt)

public expect fun PoFxCompleteDevicePowerNotRequired(handle: POHANDLE)

public expect fun PoFxCompleteDirectedPowerDown(handle: POHANDLE)

public expect fun PoFxCompleteIdleCondition(handle: POHANDLE, component: UInt)

public expect fun PoFxCompleteIdleState(handle: POHANDLE, component: UInt)

public expect fun PoFxIdleComponent(handle: POHANDLE, component: UInt, flags: UInt)

public expect fun PoFxIssueComponentPerfStateChange(handle: POHANDLE, flags: UInt, component: UInt, perfchange: Long, context: Long)

public expect fun PoFxIssueComponentPerfStateChangeMultiple(handle: POHANDLE, flags: UInt, component: UInt, perfchangescount: UInt, perfchanges: Long, context: Long)

public expect fun PoFxNotifySurprisePowerOn(pdo: Long)

public expect fun PoFxPowerControl(handle: POHANDLE, powercontrolcode: Long, inbuffer: Long, inbuffersize: ULong, outbuffer: Long, outbuffersize: ULong, bytesreturned: Long): NTSTATUS

public expect fun PoFxPowerOnCrashdumpDevice(handle: POHANDLE, context: Long): NTSTATUS

public expect fun PoFxQueryCurrentComponentPerfState(handle: POHANDLE, flags: UInt, component: UInt, setindex: UInt, currentperf: Long): NTSTATUS

public expect fun PoFxRegisterComponentPerfStates(handle: POHANDLE, component: UInt, flags: ULong, componentperfstatecallback: PPO_FX_COMPONENT_PERF_STATE_CALLBACK, inputstateinfo: Long, outputstateinfo: Long): NTSTATUS

public expect fun PoFxRegisterCrashdumpDevice(handle: POHANDLE): NTSTATUS

public expect fun PoFxRegisterDevice(pdo: Long, device: Long, handle: Long): NTSTATUS

public expect fun PoFxRegisterDripsWatchdogCallback(handle: POHANDLE, callback: PPO_FX_DRIPS_WATCHDOG_CALLBACK, includechilddevices: Boolean, matchingdriverobject: Long)

public expect fun PoFxReportDevicePoweredOn(handle: POHANDLE)

public expect fun PoFxSetComponentLatency(handle: POHANDLE, component: UInt, latency: ULong)

public expect fun PoFxSetComponentResidency(handle: POHANDLE, component: UInt, residency: ULong)

public expect fun PoFxSetComponentWake(handle: POHANDLE, component: UInt, wakehint: Boolean)

public expect fun PoFxSetDeviceIdleTimeout(handle: POHANDLE, idletimeout: ULong)

public expect fun PoFxSetTargetDripsDevicePowerState(handle: POHANDLE, targetstate: DEVICE_POWER_STATE): NTSTATUS

public expect fun PoFxStartDevicePowerManagement(handle: POHANDLE)

public expect fun PoFxUnregisterDevice(handle: POHANDLE)

public expect fun PoGetSystemWake(irp: Long): Boolean

public expect fun PoGetThermalRequestSupport(thermalrequest: Long, type: PO_THERMAL_REQUEST_TYPE): Boolean

public expect fun PoQueryWatchdogTime(pdo: Long, secondsremaining: Long): Boolean

public expect fun PoRegisterDeviceForIdleDetection(deviceobject: Long, conservationidletime: UInt, performanceidletime: UInt, state: DEVICE_POWER_STATE): Long

public expect fun PoRegisterPowerSettingCallback(deviceobject: Long, settingguid: Long, callback: PPOWER_SETTING_CALLBACK, context: Long, handle: Long): NTSTATUS

public expect fun PoRegisterSystemState(statehandle: Long, flags: UInt): Long

public expect fun PoRequestPowerIrp(deviceobject: Long, minorfunction: UByte, powerstate: POWER_STATE, completionfunction: PREQUEST_POWER_COMPLETE, context: Long, irp: Long): NTSTATUS

public expect fun PoSetDeviceBusyEx(idlepointer: Long)

public expect fun PoSetHiberRange(memorymap: Long, flags: UInt, address: Long, length: ULong, tag: UInt)

public expect fun PoSetPowerRequest(powerrequest: Long, type: POWER_REQUEST_TYPE): NTSTATUS

public expect fun PoSetPowerState(deviceobject: Long, type: POWER_STATE_TYPE, state: POWER_STATE): POWER_STATE

public expect fun PoSetSystemState(flags: UInt)

public expect fun PoSetSystemWake(irp: Long)

public expect fun PoSetSystemWakeDevice(deviceobject: Long)

public expect fun PoSetThermalActiveCooling(thermalrequest: Long, engaged: Boolean): NTSTATUS

public expect fun PoSetThermalPassiveCooling(thermalrequest: Long, throttle: UByte): NTSTATUS

public expect fun PoStartDeviceBusy(idlepointer: Long)

public expect fun PoStartNextPowerIrp(irp: Long)

public expect fun PoUnregisterPowerSettingCallback(handle: Long): NTSTATUS

public expect fun PoUnregisterSystemState(statehandle: Long)

public expect fun ProbeForRead(address: Long, length: ULong, alignment: UInt)

public expect fun ProbeForWrite(address: Long, length: ULong, alignment: UInt)

public expect fun PsAcquireSiloHardReference(silo: PESILO): NTSTATUS

public expect fun PsAllocSiloContextSlot(reserved: ULong, returnedcontextslot: Long): NTSTATUS

public expect fun PsAllocateAffinityToken(affinitytoken: Long): NTSTATUS

public expect fun PsAttachSiloToCurrentThread(silo: PESILO): PESILO

public expect fun PsCreateSiloContext(silo: PESILO, size: UInt, pooltype: POOL_TYPE, contextcleanupcallback: SILO_CONTEXT_CLEANUP_CALLBACK, returnedsilocontext: Long): NTSTATUS

public expect fun PsCreateSystemThread(threadhandle: Long, desiredaccess: UInt, objectattributes: Long, processhandle: HANDLE, clientid: Long, startroutine: PKSTART_ROUTINE, startcontext: Long): NTSTATUS

public expect fun PsDereferenceSiloContext(silocontext: Long)

public expect fun PsDetachSiloFromCurrentThread(previoussilo: PESILO)

public expect fun PsFreeAffinityToken(affinitytoken: PAFFINITY_TOKEN)

public expect fun PsFreeSiloContextSlot(contextslot: UInt): NTSTATUS

public expect fun PsGetCurrentProcessId(): HANDLE

public expect fun PsGetCurrentServerSilo(): PESILO

public expect fun PsGetCurrentServerSiloName(): Long

public expect fun PsGetCurrentSilo(): PESILO

public expect fun PsGetCurrentThreadId(): HANDLE

public expect fun PsGetCurrentThreadTeb(): Long

public expect fun PsGetEffectiveServerSilo(silo: PESILO): PESILO

public expect fun PsGetHostSilo(): PESILO

public expect fun PsGetJobServerSilo(job: PEJOB, serversilo: Long): NTSTATUS

public expect fun PsGetJobSilo(job: PEJOB, silo: Long): NTSTATUS

public expect fun PsGetParentSilo(job: PEJOB): PESILO

public expect fun PsGetPermanentSiloContext(silo: PESILO, contextslot: UInt, returnedsilocontext: Long): NTSTATUS

public expect fun PsGetProcessCreateTimeQuadPart(process: PEPROCESS): Long

public expect fun PsGetProcessExitStatus(process: PEPROCESS): NTSTATUS

public expect fun PsGetProcessId(process: PEPROCESS): HANDLE

public expect fun PsGetProcessStartKey(process: PEPROCESS): ULong

public expect fun PsGetServerSiloServiceSessionId(silo: PESILO): UInt

public expect fun PsGetSiloContainerId(silo: PESILO): Long

public expect fun PsGetSiloContext(silo: PESILO, contextslot: UInt, returnedsilocontext: Long): NTSTATUS

public expect fun PsGetSiloMonitorContextSlot(monitor: PSILO_MONITOR): UInt

public expect fun PsGetThreadCreateTime(thread: PETHREAD): Long

public expect fun PsGetThreadExitStatus(thread: PETHREAD): NTSTATUS

public expect fun PsGetThreadId(thread: PETHREAD): HANDLE

public expect fun PsGetThreadProcessId(thread: PETHREAD): HANDLE

public expect fun PsGetThreadProperty(thread: PETHREAD, key: ULong, flags: UInt): Long

public expect fun PsGetThreadServerSilo(thread: PETHREAD): PESILO

public expect fun PsGetVersion(majorversion: Long, minorversion: Long, buildnumber: Long, csdversion: Long): Boolean

public expect fun PsInsertPermanentSiloContext(silo: PESILO, contextslot: UInt, silocontext: Long): NTSTATUS

public expect fun PsInsertSiloContext(silo: PESILO, contextslot: UInt, silocontext: Long): NTSTATUS

public expect fun PsIsCurrentThreadInServerSilo(): Boolean

public expect fun PsIsCurrentThreadPrefetching(): Boolean

public expect fun PsIsHostSilo(silo: PESILO): Boolean

public expect fun PsMakeSiloContextPermanent(silo: PESILO, contextslot: UInt): NTSTATUS

public expect fun PsQueryTotalCycleTimeProcess(process: PEPROCESS, cycletimestamp: Long): ULong

public expect fun PsReferenceSiloContext(silocontext: Long)

public expect fun PsRegisterSiloMonitor(registration: Long, returnedmonitor: Long): NTSTATUS

public expect fun PsReleaseSiloHardReference(silo: PESILO)

public expect fun PsRemoveCreateThreadNotifyRoutine(notifyroutine: PCREATE_THREAD_NOTIFY_ROUTINE): NTSTATUS

public expect fun PsRemoveLoadImageNotifyRoutine(notifyroutine: PLOAD_IMAGE_NOTIFY_ROUTINE): NTSTATUS

public expect fun PsRemoveSiloContext(silo: PESILO, contextslot: UInt, removedsilocontext: Long): NTSTATUS

public expect fun PsReplaceSiloContext(silo: PESILO, contextslot: UInt, newsilocontext: Long, oldsilocontext: Long): NTSTATUS

public expect fun PsRevertToUserMultipleGroupAffinityThread(affinitytoken: PAFFINITY_TOKEN)

public expect fun PsSetCreateProcessNotifyRoutine(notifyroutine: PCREATE_PROCESS_NOTIFY_ROUTINE, remove: Boolean): NTSTATUS

public expect fun PsSetCreateProcessNotifyRoutineEx(notifyroutine: PCREATE_PROCESS_NOTIFY_ROUTINE_EX, remove: Boolean): NTSTATUS

public expect fun PsSetCreateProcessNotifyRoutineEx2(notifytype: PSCREATEPROCESSNOTIFYTYPE, notifyinformation: Long, remove: Boolean): NTSTATUS

public expect fun PsSetCreateThreadNotifyRoutine(notifyroutine: PCREATE_THREAD_NOTIFY_ROUTINE): NTSTATUS

public expect fun PsSetCreateThreadNotifyRoutineEx(notifytype: PSCREATETHREADNOTIFYTYPE, notifyinformation: Long): NTSTATUS

public expect fun PsSetCurrentThreadPrefetching(prefetching: Boolean): Boolean

public expect fun PsSetLoadImageNotifyRoutine(notifyroutine: PLOAD_IMAGE_NOTIFY_ROUTINE): NTSTATUS

public expect fun PsSetLoadImageNotifyRoutineEx(notifyroutine: PLOAD_IMAGE_NOTIFY_ROUTINE, flags: ULong): NTSTATUS

public expect fun PsSetSystemMultipleGroupAffinityThread(groupaffinities: Long, groupcount: UShort, affinitytoken: PAFFINITY_TOKEN): NTSTATUS

public expect fun PsStartSiloMonitor(monitor: PSILO_MONITOR): NTSTATUS

public expect fun PsTerminateServerSilo(serversilo: PESILO, exitstatus: NTSTATUS)

public expect fun PsTerminateSystemThread(exitstatus: NTSTATUS): NTSTATUS

public expect fun PsUnregisterSiloMonitor(monitor: PSILO_MONITOR)

public expect fun PsWrapApcWow64Thread(apccontext: Long, apcroutine: Long): NTSTATUS

public expect fun PshedAllocateMemory(size: UInt): Long

public expect fun PshedFreeMemory(address: Long)

public expect fun PshedIsSystemWheaEnabled(): Boolean

public expect fun PshedRegisterPlugin(packet: Long): NTSTATUS

public expect fun PshedSynchronizeExecution(errorsource: Long, synchronizeroutine: PKSYNCHRONIZE_ROUTINE, synchronizecontext: Long): Boolean

public expect fun PshedUnregisterPlugin(pluginhandle: Long)

public expect fun RtlAppendUnicodeStringToString(destination: Long, source: Long): NTSTATUS

public expect fun RtlAppendUnicodeToString(destination: Long, source: PCWSTR): NTSTATUS

public expect fun RtlAreBitsClear(bitmapheader: Long, startingindex: UInt, length: UInt): Boolean

public expect fun RtlAreBitsSet(bitmapheader: Long, startingindex: UInt, length: UInt): Boolean

public expect fun RtlAssert(voidfailedassertion: Long, voidfilename: Long, linenumber: UInt, mutablemessage: PCSTR)

public expect fun RtlCheckRegistryKey(relativeto: UInt, path: PCWSTR): NTSTATUS

public expect fun RtlClearAllBits(bitmapheader: Long)

public expect fun RtlClearBit(bitmapheader: Long, bitnumber: UInt)

public expect fun RtlClearBits(bitmapheader: Long, startingindex: UInt, numbertoclear: UInt)

public expect fun RtlCmDecodeMemIoResource(descriptor: Long, start: Long): ULong

public expect fun RtlCmEncodeMemIoResource(descriptor: Long, type: UByte, length: ULong, start: ULong): NTSTATUS

public expect fun RtlCompareString(string1: Long, string2: Long, caseinsensitive: Boolean): Int

public expect fun RtlCompareUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Int

public expect fun RtlCompareUnicodeStrings(string1: Long, string1length: ULong, string2: Long, string2length: ULong, caseinsensitive: Boolean): Int

public expect fun RtlContractHashTable(hashtable: Long): Boolean

public expect fun RtlCopyBitMap(source: Long, destination: Long, targetbit: UInt)

public expect fun RtlCopyString(destinationstring: Long, sourcestring: Long)

public expect fun RtlCopyUnicodeString(destinationstring: Long, sourcestring: Long)

public expect fun RtlCreateHashTable(hashtable: Long, shift: UInt, flags: UInt): Boolean

public expect fun RtlCreateHashTableEx(hashtable: Long, initialsize: UInt, shift: UInt, flags: UInt): Boolean

public expect fun RtlCreateRegistryKey(relativeto: UInt, path: PCWSTR): NTSTATUS

public expect fun RtlCreateSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, revision: UInt): NTSTATUS

public expect fun RtlDelete(links: Long): Long

public expect fun RtlDeleteElementGenericTable(table: Long, buffer: Long): Boolean

public expect fun RtlDeleteElementGenericTableAvl(table: Long, buffer: Long): Boolean

public expect fun RtlDeleteElementGenericTableAvlEx(table: Long, nodeorparent: Long)

public expect fun RtlDeleteHashTable(hashtable: Long)

public expect fun RtlDeleteNoSplay(links: Long, root: Long)

public expect fun RtlDeleteRegistryValue(relativeto: UInt, path: PCWSTR, valuename: PCWSTR): NTSTATUS

public expect fun RtlDowncaseUnicodeChar(sourcecharacter: UShort): UShort

public expect fun RtlEndEnumerationHashTable(hashtable: Long, enumerator: Long)

public expect fun RtlEndStrongEnumerationHashTable(hashtable: Long, enumerator: Long)

public expect fun RtlEndWeakEnumerationHashTable(hashtable: Long, enumerator: Long)

public expect fun RtlEnumerateEntryHashTable(hashtable: Long, enumerator: Long): Long

public expect fun RtlEnumerateGenericTable(table: Long, restart: Boolean): Long

public expect fun RtlEnumerateGenericTableAvl(table: Long, restart: Boolean): Long

public expect fun RtlEnumerateGenericTableLikeADirectory(table: Long, matchfunction: PRTL_AVL_MATCH_FUNCTION, matchdata: Long, nextflag: UInt, restartkey: Long, deletecount: Long, buffer: Long): Long

public expect fun RtlEnumerateGenericTableWithoutSplaying(table: Long, restartkey: Long): Long

public expect fun RtlEnumerateGenericTableWithoutSplayingAvl(table: Long, restartkey: Long): Long

public expect fun RtlEqualString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean

public expect fun RtlEqualUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean

public expect fun RtlExpandHashTable(hashtable: Long): Boolean

public expect fun RtlExtractBitMap(source: Long, destination: Long, targetbit: UInt, numberofbits: UInt)

public expect fun RtlFindClearBits(bitmapheader: Long, numbertofind: UInt, hintindex: UInt): UInt

public expect fun RtlFindClearBitsAndSet(bitmapheader: Long, numbertofind: UInt, hintindex: UInt): UInt

public expect fun RtlFindClearRuns(bitmapheader: Long, runarray: Long, sizeofrunarray: UInt, locatelongestruns: Boolean): UInt

public expect fun RtlFindClosestEncodableLength(sourcelength: ULong, targetlength: Long): NTSTATUS

public expect fun RtlFindFirstRunClear(bitmapheader: Long, startingindex: Long): UInt

public expect fun RtlFindLastBackwardRunClear(bitmapheader: Long, fromindex: UInt, startingrunindex: Long): UInt

public expect fun RtlFindLeastSignificantBit(set: ULong): Byte

public expect fun RtlFindLongestRunClear(bitmapheader: Long, startingindex: Long): UInt

public expect fun RtlFindMostSignificantBit(set: ULong): Byte

public expect fun RtlFindNextForwardRunClear(bitmapheader: Long, fromindex: UInt, startingrunindex: Long): UInt

public expect fun RtlFindSetBits(bitmapheader: Long, numbertofind: UInt, hintindex: UInt): UInt

public expect fun RtlFindSetBitsAndClear(bitmapheader: Long, numbertofind: UInt, hintindex: UInt): UInt

public expect fun RtlFreeUTF8String(utf8string: Long)

public expect fun RtlGUIDFromString(guidstring: Long, guid: Long): NTSTATUS

public expect fun RtlGenerateClass5Guid(namespaceguid: Long, buffer: Long, buffersize: UInt, guid: Long): NTSTATUS

public expect fun RtlGetActiveConsoleId(): UInt

public expect fun RtlGetCallersAddress(callersaddress: Long, callerscaller: Long)

public expect fun RtlGetConsoleSessionForegroundProcessId(): ULong

public expect fun RtlGetElementGenericTable(table: Long, i: UInt): Long

public expect fun RtlGetElementGenericTableAvl(table: Long, i: UInt): Long

public expect fun RtlGetEnabledExtendedFeatures(featuremask: ULong): ULong

public expect fun RtlGetNextEntryHashTable(hashtable: Long, context: Long): Long

public expect fun RtlGetNtProductType(ntproducttype: Long): Boolean

public expect fun RtlGetNtSystemRoot(): PCWSTR

public expect fun RtlGetPersistedStateLocation(sourceid: PCWSTR, customvalue: PCWSTR, defaultpath: PCWSTR, statelocationtype: STATE_LOCATION_TYPE, targetpath: PWSTR, bufferlengthin: UInt, bufferlengthout: Long): NTSTATUS

public expect fun RtlGetSuiteMask(): UInt

public expect fun RtlGetVersion(lpversioninformation: Long): NTSTATUS

public expect fun RtlHashUnicodeString(string: Long, caseinsensitive: Boolean, hashalgorithm: UInt, hashvalue: Long): NTSTATUS

public expect fun RtlInitEnumerationHashTable(hashtable: Long, enumerator: Long): Boolean

public expect fun RtlInitStrongEnumerationHashTable(hashtable: Long, enumerator: Long): Boolean

public expect fun RtlInitUTF8String(destinationstring: Long, sourcestring: Long)

public expect fun RtlInitUTF8StringEx(destinationstring: Long, sourcestring: Long): NTSTATUS

public expect fun RtlInitWeakEnumerationHashTable(hashtable: Long, enumerator: Long): Boolean

public expect fun RtlInitializeBitMap(bitmapheader: Long, bitmapbuffer: Long, sizeofbitmap: UInt)

public expect fun RtlInitializeGenericTable(table: Long, compareroutine: PRTL_GENERIC_COMPARE_ROUTINE, allocateroutine: PRTL_GENERIC_ALLOCATE_ROUTINE, freeroutine: PRTL_GENERIC_FREE_ROUTINE, tablecontext: Long)

public expect fun RtlInitializeGenericTableAvl(table: Long, compareroutine: PRTL_AVL_COMPARE_ROUTINE, allocateroutine: PRTL_AVL_ALLOCATE_ROUTINE, freeroutine: PRTL_AVL_FREE_ROUTINE, tablecontext: Long)

public expect fun RtlInsertElementGenericTable(table: Long, buffer: Long, buffersize: UInt, newelement: Long): Long

public expect fun RtlInsertElementGenericTableAvl(table: Long, buffer: Long, buffersize: UInt, newelement: Long): Long

public expect fun RtlInsertElementGenericTableFull(table: Long, buffer: Long, buffersize: UInt, newelement: Long, nodeorparent: Long, searchresult: TABLE_SEARCH_RESULT): Long

public expect fun RtlInsertElementGenericTableFullAvl(table: Long, buffer: Long, buffersize: UInt, newelement: Long, nodeorparent: Long, searchresult: TABLE_SEARCH_RESULT): Long

public expect fun RtlInsertEntryHashTable(hashtable: Long, entry: Long, signature: ULong, context: Long): Boolean

public expect fun RtlInt64ToUnicodeString(value: ULong, base: UInt, string: Long): NTSTATUS

public expect fun RtlIntegerToUnicodeString(value: UInt, base: UInt, string: Long): NTSTATUS

public expect fun RtlIoDecodeMemIoResource(descriptor: Long, alignment: Long, minimumaddress: Long, maximumaddress: Long): ULong

public expect fun RtlIoEncodeMemIoResource(descriptor: Long, type: UByte, length: ULong, alignment: ULong, minimumaddress: ULong, maximumaddress: ULong): NTSTATUS

public expect fun RtlIsApiSetImplemented(apisetname: PCSTR): NTSTATUS

public expect fun RtlIsGenericTableEmpty(table: Long): Boolean

public expect fun RtlIsGenericTableEmptyAvl(table: Long): Boolean

public expect fun RtlIsMultiSessionSku(): Boolean

public expect fun RtlIsMultiUsersInSessionSku(): Boolean

public expect fun RtlIsNtDdiVersionAvailable(version: UInt): Boolean

public expect fun RtlIsServicePackVersionInstalled(version: UInt): Boolean

public expect fun RtlIsStateSeparationEnabled(): Boolean

public expect fun RtlIsUntrustedObject(handle: HANDLE, obj: Long, untrustedobject: Long): NTSTATUS

public expect fun RtlLengthSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR): UInt

public expect fun RtlLookupElementGenericTable(table: Long, buffer: Long): Long

public expect fun RtlLookupElementGenericTableAvl(table: Long, buffer: Long): Long

public expect fun RtlLookupElementGenericTableFull(table: Long, buffer: Long, nodeorparent: Long, searchresult: Long): Long

public expect fun RtlLookupElementGenericTableFullAvl(table: Long, buffer: Long, nodeorparent: Long, searchresult: Long): Long

public expect fun RtlLookupEntryHashTable(hashtable: Long, signature: ULong, context: Long): Long

public expect fun RtlLookupFirstMatchingElementGenericTableAvl(table: Long, buffer: Long, restartkey: Long): Long

public expect fun RtlMapGenericMask(accessmask: Long, genericmapping: Long)

public expect fun RtlNormalizeSecurityDescriptor(securitydescriptor: Long, securitydescriptorlength: UInt, newsecuritydescriptor: Long, newsecuritydescriptorlength: Long, checkonly: Boolean): Boolean

public expect fun RtlNumberGenericTableElements(table: Long): UInt

public expect fun RtlNumberGenericTableElementsAvl(table: Long): UInt

public expect fun RtlNumberOfClearBits(bitmapheader: Long): UInt

public expect fun RtlNumberOfClearBitsInRange(bitmapheader: Long, startingindex: UInt, length: UInt): UInt

public expect fun RtlNumberOfSetBits(bitmapheader: Long): UInt

public expect fun RtlNumberOfSetBitsInRange(bitmapheader: Long, startingindex: UInt, length: UInt): UInt

public expect fun RtlNumberOfSetBitsUlongPtr(target: ULong): UInt

public expect fun RtlPrefetchMemoryNonTemporal(source: Long, length: ULong)

public expect fun RtlPrefixUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean

public expect fun RtlQueryRegistryValueWithFallback(primaryhandle: HANDLE, fallbackhandle: HANDLE, valuename: Long, valuelength: UInt, valuetype: Long, valuedata: Long, resultlength: Long): NTSTATUS

public expect fun RtlQueryRegistryValues(relativeto: UInt, path: PCWSTR, querytable: Long, context: Long, environment: Long): NTSTATUS

public expect fun RtlQueryValidationRunlevel(componentname: Long): UInt

public expect fun RtlRealPredecessor(links: Long): Long

public expect fun RtlRealSuccessor(links: Long): Long

public expect fun RtlRemoveEntryHashTable(hashtable: Long, entry: Long, context: Long): Boolean

public expect fun RtlRunOnceBeginInitialize(runonce: Long, flags: UInt, context: Long): NTSTATUS

public expect fun RtlRunOnceComplete(runonce: Long, flags: UInt, context: Long): NTSTATUS

public expect fun RtlRunOnceExecuteOnce(runonce: Long, initfn: PRTL_RUN_ONCE_INIT_FN, parameter: Long, context: Long): NTSTATUS

public expect fun RtlRunOnceInitialize(runonce: Long)

public expect fun RtlSetAllBits(bitmapheader: Long)

public expect fun RtlSetBit(bitmapheader: Long, bitnumber: UInt)

public expect fun RtlSetBits(bitmapheader: Long, startingindex: UInt, numbertoset: UInt)

public expect fun RtlSetDaclSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, daclpresent: Boolean, dacl: Long, dacldefaulted: Boolean): NTSTATUS
