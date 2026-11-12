package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PaffinityToken
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pejob
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Peprocess
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pesilo
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pethread
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PkdeferredRoutine
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pkinterrupt
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pkthread
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PobjectType
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pohandle
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PoolType
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PpcwBuffer
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PpcwInstance
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PpcwRegistration
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PsiloMonitor
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.TimerType
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.WaitType
import io.github.kotlinmania.windowssys.windows.win32.system.power.DevicePowerState
import io.github.kotlinmania.windowssys.windows.win32.system.power.PowerInformationLevel
import io.github.kotlinmania.windowssys.windows.win32.system.power.PowerRequestType
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.LogicalProcessorRelationship
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.EnlistmentInformationClass
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.KtmobjectType
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.ResourcemanagerInformationClass
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.TransactionInformationClass
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.TransactionmanagerInformationClass

public expect fun keInitializeMutex(mutex: MutPtr, level: UInt)

public expect fun keInitializeSemaphore(semaphore: MutPtr, count: Int, limit: Int)

public expect fun keInitializeSpinLock(spinlock: MutPtr)

public expect fun keInitializeThreadedDpc(dpc: MutPtr, deferredroutine: PkdeferredRoutine, deferredcontext: ConstPtr)

public expect fun keInitializeTimer(timer: MutPtr)

public expect fun keInitializeTimerEx(timer: MutPtr, type: TimerType)

public expect fun keInitializeTriageDumpDataArray(ktriagedumpdataarray: MutPtr, size: UInt): Ntstatus

public expect fun keInsertByKeyDeviceQueue(devicequeue: MutPtr, devicequeueentry: MutPtr, sortkey: UInt): Boolean

public expect fun keInsertDeviceQueue(devicequeue: MutPtr, devicequeueentry: MutPtr): Boolean

public expect fun keInsertQueueDpc(dpc: MutPtr, systemargument1: ConstPtr, systemargument2: ConstPtr): Boolean

public expect fun keInvalidateAllCaches(): Boolean

public expect fun keInvalidateRangeAllCaches(baseaddress: ConstPtr, length: UInt)

public expect fun keIpiGenericCall(broadcastfunction: PkipiBroadcastWorker, context: ULong): ULong

public expect fun keIsExecutingDpc(): UInt

public expect fun keLeaveCriticalRegion()

public expect fun keLeaveGuardedRegion()

public expect fun kePulseEvent(event: MutPtr, increment: Int, wait: Boolean): Int

public expect fun keQueryActiveGroupCount(): UShort

public expect fun keQueryActiveProcessorCount(activeprocessors: MutPtr): UInt

public expect fun keQueryActiveProcessorCountEx(groupnumber: UShort): UInt

public expect fun keQueryActiveProcessors(): ULong

public expect fun keQueryAuxiliaryCounterFrequency(auxiliarycounterfrequency: MutPtr): Ntstatus

public expect fun keQueryDpcWatchdogInformation(watchdoginformation: MutPtr): Ntstatus

public expect fun keQueryGroupAffinity(groupnumber: UShort): ULong

public expect fun keQueryHardwareCounterConfiguration(counterarray: MutPtr, maximumcount: UInt, count: MutPtr): Ntstatus

public expect fun keQueryHighestNodeNumber(): UShort

public expect fun keQueryInterruptTimePrecise(qpctimestamp: MutPtr): ULong

public expect fun keQueryLogicalProcessorRelationship(processornumber: ConstPtr, relationshiptype: LogicalProcessorRelationship, information: MutPtr, length: MutPtr): Ntstatus

public expect fun keQueryMaximumGroupCount(): UShort

public expect fun keQueryMaximumProcessorCount(): UInt

public expect fun keQueryMaximumProcessorCountEx(groupnumber: UShort): UInt

public expect fun keQueryNodeActiveAffinity(nodenumber: UShort, affinity: MutPtr, count: MutPtr)

public expect fun keQueryNodeActiveAffinity2(nodenumber: UShort, groupaffinities: MutPtr, groupaffinitiescount: UShort, groupaffinitiesrequired: MutPtr): Ntstatus

public expect fun keQueryNodeActiveProcessorCount(nodenumber: UShort): UInt

public expect fun keQueryNodeMaximumProcessorCount(nodenumber: UShort): UShort

public expect fun keQueryPerformanceCounter(performancefrequency: MutPtr): Long

public expect fun keQueryPriorityThread(thread: Pkthread): Int

public expect fun keQueryRuntimeThread(thread: Pkthread, usertime: MutPtr): UInt

public expect fun keQuerySystemTimePrecise(currenttime: MutPtr)

public expect fun keQueryTimeIncrement(): UInt

public expect fun keQueryTotalCycleTimeThread(thread: Pkthread, cycletimestamp: MutPtr): ULong

public expect fun keQueryUnbiasedInterruptTime(): ULong

public expect fun keQueryUnbiasedInterruptTimePrecise(qpctimestamp: MutPtr): ULong

public expect fun keReadStateEvent(event: ConstPtr): Int

public expect fun keReadStateMutex(mutex: ConstPtr): Int

public expect fun keReadStateSemaphore(semaphore: ConstPtr): Int

public expect fun keReadStateTimer(timer: ConstPtr): Boolean

public expect fun keRegisterBoundCallback(callbackroutine: PboundCallback): MutPtr

public expect fun keRegisterBugCheckCallback(callbackrecord: MutPtr, callbackroutine: PkbugcheckCallbackRoutine, buffer: ConstPtr, length: UInt, component: ConstPtr): Boolean

public expect fun keRegisterBugCheckReasonCallback(callbackrecord: MutPtr, callbackroutine: PkbugcheckReasonCallbackRoutine, reason: KbugcheckCallbackReason, component: ConstPtr): Boolean

public expect fun keRegisterNmiCallback(callbackroutine: PnmiCallback, context: ConstPtr): MutPtr

public expect fun keRegisterProcessorChangeCallback(callbackfunction: PprocessorCallbackFunction, callbackcontext: ConstPtr, flags: UInt): MutPtr

public expect fun keReleaseGuardedMutex(mutex: MutPtr)

public expect fun keReleaseGuardedMutexUnsafe(fastmutex: MutPtr)

public expect fun keReleaseInStackQueuedSpinLock(lockhandle: ConstPtr)

public expect fun keReleaseInStackQueuedSpinLockForDpc(lockhandle: ConstPtr)

public expect fun keReleaseInStackQueuedSpinLockFromDpcLevel(lockhandle: ConstPtr)

public expect fun keReleaseInterruptSpinLock(interrupt: Pkinterrupt, oldirql: UByte)

public expect fun keReleaseMutex(mutex: MutPtr, wait: Boolean): Int

public expect fun keReleaseSemaphore(semaphore: MutPtr, increment: Int, adjustment: Int, wait: Boolean): Int

public expect fun keReleaseSpinLockForDpc(spinlock: MutPtr, oldirql: UByte)

public expect fun keRemoveByKeyDeviceQueue(devicequeue: MutPtr, sortkey: UInt): MutPtr

public expect fun keRemoveByKeyDeviceQueueIfBusy(devicequeue: MutPtr, sortkey: UInt): MutPtr

public expect fun keRemoveDeviceQueue(devicequeue: MutPtr): MutPtr

public expect fun keRemoveEntryDeviceQueue(devicequeue: MutPtr, devicequeueentry: MutPtr): Boolean

public expect fun keRemoveQueueDpc(dpc: MutPtr): Boolean

public expect fun keRemoveQueueDpcEx(dpc: MutPtr, waitifactive: Boolean): Boolean

public expect fun keResetEvent(event: MutPtr): Int

public expect fun keRestoreExtendedProcessorState(xstatesave: ConstPtr)

public expect fun keRevertToUserAffinityThread()

public expect fun keRevertToUserAffinityThreadEx(affinity: ULong)

public expect fun keRevertToUserGroupAffinityThread(previousaffinity: ConstPtr)

public expect fun keSaveExtendedProcessorState(mask: ULong, xstatesave: MutPtr): Ntstatus

public expect fun keSetBasePriorityThread(thread: Pkthread, increment: Int): Int

public expect fun keSetCoalescableTimer(timer: MutPtr, duetime: Long, period: UInt, tolerabledelay: UInt, dpc: ConstPtr): Boolean

public expect fun keSetEvent(event: MutPtr, increment: Int, wait: Boolean): Int

public expect fun keSetHardwareCounterConfiguration(counterarray: ConstPtr, count: UInt): Ntstatus

public expect fun keSetImportanceDpc(dpc: MutPtr, importance: KdpcImportance)

public expect fun keSetPriorityThread(thread: Pkthread, priority: Int): Int

public expect fun keSetSystemAffinityThread(affinity: ULong)

public expect fun keSetSystemAffinityThreadEx(affinity: ULong): ULong

public expect fun keSetSystemGroupAffinityThread(affinity: ConstPtr, previousaffinity: MutPtr)

public expect fun keSetTargetProcessorDpc(dpc: MutPtr, number: Byte)

public expect fun keSetTargetProcessorDpcEx(dpc: MutPtr, procnumber: ConstPtr): Ntstatus

public expect fun keSetTimer(timer: MutPtr, duetime: Long, dpc: ConstPtr): Boolean

public expect fun keSetTimerEx(timer: MutPtr, duetime: Long, period: Int, dpc: ConstPtr): Boolean

public expect fun keShouldYieldProcessor(): UInt

public expect fun keStallExecutionProcessor(microseconds: UInt)

public expect fun keSynchronizeExecution(interrupt: Pkinterrupt, synchronizeroutine: PksynchronizeRoutine, synchronizecontext: ConstPtr): Boolean

public expect fun keTestSpinLock(spinlock: ConstPtr): Boolean

public expect fun keTryToAcquireGuardedMutex(mutex: MutPtr): Boolean

public expect fun keTryToAcquireSpinLockAtDpcLevel(spinlock: MutPtr): Boolean

public expect fun keWaitForMultipleObjects(count: UInt, obj: ConstPtr, waittype: WaitType, waitreason: KwaitReason, waitmode: Byte, alertable: Boolean, timeout: ConstPtr, waitblockarray: MutPtr): Ntstatus

public expect fun keWaitForSingleObject(obj: ConstPtr, waitreason: KwaitReason, waitmode: Byte, alertable: Boolean, timeout: ConstPtr): Ntstatus

public expect fun kfRaiseIrql(newirql: UByte): UByte

public expect fun mmAddPhysicalMemory(startaddress: ConstPtr, numberofbytes: MutPtr): Ntstatus

public expect fun mmAddVerifierSpecialThunks(entryroutine: ULong, thunkbuffer: ConstPtr, thunkbuffersize: UInt): Ntstatus

public expect fun mmAddVerifierThunks(thunkbuffer: ConstPtr, thunkbuffersize: UInt): Ntstatus

public expect fun mmAdvanceMdl(mdl: MutPtr, numberofbytes: UInt): Ntstatus

public expect fun mmAllocateContiguousMemory(numberofbytes: ULong, highestacceptableaddress: Long): MutPtr

public expect fun mmAllocateContiguousMemoryEx(numberofbytes: ConstPtr, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, preferrednode: UInt, protect: UInt, partitionobject: ConstPtr, tag: UInt, flags: UInt, baseaddress: MutPtr): Ntstatus

public expect fun mmAllocateContiguousMemorySpecifyCache(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MemoryCachingType): MutPtr

public expect fun mmAllocateContiguousMemorySpecifyCacheNode(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MemoryCachingType, preferrednode: UInt): MutPtr

public expect fun mmAllocateContiguousNodeMemory(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, protect: UInt, preferrednode: UInt): MutPtr

public expect fun mmAllocateMappingAddress(numberofbytes: ULong, pooltag: UInt): MutPtr

public expect fun mmAllocateMappingAddressEx(numberofbytes: ULong, pooltag: UInt, flags: UInt): MutPtr

public expect fun mmAllocateMdlForIoSpace(physicaladdresslist: ConstPtr, numberofentries: ULong, newmdl: MutPtr): Ntstatus

public expect fun mmAllocateNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, idealnode: UInt, flags: UInt): MutPtr

public expect fun mmAllocateNonCachedMemory(numberofbytes: ULong): MutPtr

public expect fun mmAllocatePagesForMdl(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong): MutPtr

public expect fun mmAllocatePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, flags: UInt): MutPtr

public expect fun mmAllocatePartitionNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, idealnode: UInt, flags: UInt, partitionobject: ConstPtr): MutPtr

public expect fun mmAreMdlPagesCached(memorydescriptorlist: ConstPtr): UInt

public expect fun mmBuildMdlForNonPagedPool(memorydescriptorlist: MutPtr)

public expect fun mmCopyMemory(targetaddress: ConstPtr, sourceaddress: MmCopyAddress, numberofbytes: ULong, flags: UInt, numberofbytestransferred: MutPtr): Ntstatus

public expect fun mmCreateMdl(memorydescriptorlist: MutPtr, base: ConstPtr, length: ULong): MutPtr

public expect fun mmCreateMirror(): Ntstatus

public expect fun mmFreeContiguousMemory(baseaddress: ConstPtr)

public expect fun mmFreeContiguousMemorySpecifyCache(baseaddress: ConstPtr, numberofbytes: ULong, cachetype: MemoryCachingType)

public expect fun mmFreeMappingAddress(baseaddress: ConstPtr, pooltag: UInt)

public expect fun mmFreeNonCachedMemory(baseaddress: ConstPtr, numberofbytes: ULong)

public expect fun mmFreePagesFromMdl(memorydescriptorlist: MutPtr)

public expect fun mmFreePagesFromMdlEx(memorydescriptorlist: MutPtr, flags: UInt)

public expect fun mmGetCacheAttribute(physicaladdress: Long, cachetype: MutPtr): Ntstatus

public expect fun mmGetCacheAttributeEx(physicaladdress: Long, flags: UInt, cachetype: MutPtr): Ntstatus

public expect fun mmGetPhysicalAddress(baseaddress: ConstPtr): Long

public expect fun mmGetPhysicalMemoryRanges(): MutPtr

public expect fun mmGetPhysicalMemoryRangesEx(partitionobject: ConstPtr): MutPtr

public expect fun mmGetPhysicalMemoryRangesEx2(partitionobject: ConstPtr, flags: UInt): MutPtr

public expect fun mmGetSystemRoutineAddress(systemroutinename: ConstPtr): MutPtr

public expect fun mmGetVirtualForPhysical(physicaladdress: Long): MutPtr

public expect fun mmIsAddressValid(virtualaddress: ConstPtr): Boolean

public expect fun mmIsDriverSuspectForVerifier(driverobject: ConstPtr): UInt

public expect fun mmIsDriverVerifying(driverobject: ConstPtr): UInt

public expect fun mmIsDriverVerifyingByAddress(addresswithinsection: ConstPtr): UInt

public expect fun mmIsIoSpaceActive(startaddress: Long, numberofbytes: ULong): UInt

public expect fun mmIsNonPagedSystemAddressValid(virtualaddress: ConstPtr): Boolean

public expect fun mmIsThisAnNtAsSystem(): Boolean

public expect fun mmIsVerifierEnabled(verifierflags: MutPtr): Ntstatus

public expect fun mmLockPagableDataSection(addresswithinsection: ConstPtr): MutPtr

public expect fun mmLockPagableSectionByHandle(imagesectionhandle: ConstPtr)

public expect fun mmMapIoSpace(physicaladdress: Long, numberofbytes: ULong, cachetype: MemoryCachingType): MutPtr

public expect fun mmMapIoSpaceEx(physicaladdress: Long, numberofbytes: ULong, protect: UInt): MutPtr

public expect fun mmMapLockedPages(memorydescriptorlist: MutPtr, accessmode: Byte): MutPtr

public expect fun mmMapLockedPagesSpecifyCache(memorydescriptorlist: MutPtr, accessmode: Byte, cachetype: MemoryCachingType, requestedaddress: ConstPtr, bugcheckonfailure: UInt, priority: UInt): MutPtr

public expect fun mmMapLockedPagesWithReservedMapping(mappingaddress: ConstPtr, pooltag: UInt, memorydescriptorlist: MutPtr, cachetype: MemoryCachingType): MutPtr

public expect fun mmMapMdl(memorydescriptorlist: MutPtr, protection: UInt, driverroutine: PmmMdlRoutine, drivercontext: ConstPtr): Ntstatus

public expect fun mmMapMemoryDumpMdlEx(va: ConstPtr, pagetotal: UInt, memorydumpmdl: MutPtr, flags: UInt): Ntstatus

public expect fun mmMapUserAddressesToPage(baseaddress: ConstPtr, numberofbytes: ULong, pageaddress: ConstPtr): Ntstatus

public expect fun mmMapVideoDisplay(physicaladdress: Long, numberofbytes: ULong, cachetype: MemoryCachingType): MutPtr

public expect fun mmMapViewInSessionSpace(section: ConstPtr, mappedbase: MutPtr, viewsize: MutPtr): Ntstatus

public expect fun mmMapViewInSessionSpaceEx(section: ConstPtr, mappedbase: MutPtr, viewsize: MutPtr, sectionoffset: MutPtr, flags: ULong): Ntstatus

public expect fun mmMapViewInSystemSpace(section: ConstPtr, mappedbase: MutPtr, viewsize: MutPtr): Ntstatus

public expect fun mmMapViewInSystemSpaceEx(section: ConstPtr, mappedbase: MutPtr, viewsize: MutPtr, sectionoffset: MutPtr, flags: ULong): Ntstatus

public expect fun mmMdlPageContentsState(memorydescriptorlist: MutPtr, state: MmMdlPageContentsState): MmMdlPageContentsState

public expect fun mmPageEntireDriver(addresswithinsection: ConstPtr): MutPtr

public expect fun mmProbeAndLockPages(memorydescriptorlist: MutPtr, accessmode: Byte, operation: LockOperation)

public expect fun mmProbeAndLockProcessPages(memorydescriptorlist: MutPtr, process: Peprocess, accessmode: Byte, operation: LockOperation)

public expect fun mmProbeAndLockSelectedPages(memorydescriptorlist: MutPtr, segmentarray: ConstPtr, accessmode: Byte, operation: LockOperation)

public expect fun mmProtectDriverSection(addresswithinsection: ConstPtr, size: ULong, flags: UInt): Ntstatus

public expect fun mmProtectMdlSystemAddress(memorydescriptorlist: ConstPtr, newprotect: UInt): Ntstatus

public expect fun mmQuerySystemSize(): MmSystemsize

public expect fun mmRemovePhysicalMemory(startaddress: ConstPtr, numberofbytes: MutPtr): Ntstatus

public expect fun mmResetDriverPaging(addresswithinsection: ConstPtr)

public expect fun mmRotatePhysicalView(virtualaddress: ConstPtr, numberofbytes: MutPtr, newmdl: ConstPtr, direction: MmRotateDirection, copyfunction: PmmRotateCopyCallbackFunction, context: ConstPtr): Ntstatus

public expect fun mmSecureVirtualMemory(address: ConstPtr, size: ULong, probemode: UInt): Handle

public expect fun mmSecureVirtualMemoryEx(address: ConstPtr, size: ULong, probemode: UInt, flags: UInt): Handle

public expect fun mmSetPermanentCacheAttribute(startaddress: Long, numberofbytes: Long, cachetype: MemoryCachingType, flags: UInt): Ntstatus

public expect fun mmSizeOfMdl(base: ConstPtr, length: ULong): ULong

public expect fun mmUnlockPagableImageSection(imagesectionhandle: ConstPtr)

public expect fun mmUnlockPages(memorydescriptorlist: MutPtr)

public expect fun mmUnmapIoSpace(baseaddress: ConstPtr, numberofbytes: ULong)

public expect fun mmUnmapLockedPages(baseaddress: ConstPtr, memorydescriptorlist: MutPtr)

public expect fun mmUnmapReservedMapping(baseaddress: ConstPtr, pooltag: UInt, memorydescriptorlist: MutPtr)

public expect fun mmUnmapVideoDisplay(baseaddress: ConstPtr, numberofbytes: ULong)

public expect fun mmUnmapViewInSessionSpace(mappedbase: ConstPtr): Ntstatus

public expect fun mmUnmapViewInSystemSpace(mappedbase: ConstPtr): Ntstatus

public expect fun mmUnsecureVirtualMemory(securehandle: Handle)

public expect fun ntAllocateLocallyUniqueId(luid: MutPtr): Ntstatus

public expect fun ntCommitComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus

public expect fun ntCommitEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus

public expect fun ntCommitTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus

public expect fun ntCreateEnlistment(enlistmenthandle: MutPtr, desiredaccess: UInt, resourcemanagerhandle: Handle, transactionhandle: Handle, objectattributes: ConstPtr, createoptions: UInt, notificationmask: UInt, enlistmentkey: ConstPtr): Ntstatus

public expect fun ntCreateResourceManager(resourcemanagerhandle: MutPtr, desiredaccess: UInt, tmhandle: Handle, rmguid: ConstPtr, objectattributes: ConstPtr, createoptions: UInt, description: ConstPtr): Ntstatus

public expect fun ntCreateTransaction(transactionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, uow: ConstPtr, tmhandle: Handle, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: ConstPtr, description: ConstPtr): Ntstatus

public expect fun ntCreateTransactionManager(tmhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, logfilename: ConstPtr, createoptions: UInt, commitstrength: UInt): Ntstatus

public expect fun ntDisplayString(string: ConstPtr): Ntstatus

public expect fun ntEnumerateTransactionObject(rootobjecthandle: Handle, querytype: KtmobjectType, objectcursor: MutPtr, objectcursorlength: UInt, returnlength: MutPtr): Ntstatus

public expect fun ntGetNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: MutPtr, notificationlength: UInt, timeout: ConstPtr, returnlength: MutPtr, asynchronous: UInt, asynchronouscontext: ULong): Ntstatus

public expect fun ntLoadDriver(driverservicename: ConstPtr): Ntstatus

public expect fun ntMakeTemporaryObject(handle: Handle): Ntstatus

public expect fun ntManagePartition(targethandle: Handle, sourcehandle: Handle, partitioninformationclass: PartitionInformationClass, partitioninformation: MutPtr, partitioninformationlength: UInt): Ntstatus

public expect fun ntOpenEnlistment(enlistmenthandle: MutPtr, desiredaccess: UInt, resourcemanagerhandle: Handle, enlistmentguid: ConstPtr, objectattributes: ConstPtr): Ntstatus

public expect fun ntOpenResourceManager(resourcemanagerhandle: MutPtr, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: ConstPtr, objectattributes: ConstPtr): Ntstatus

public expect fun ntOpenTransaction(transactionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, uow: ConstPtr, tmhandle: Handle): Ntstatus

public expect fun ntOpenTransactionManager(tmhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, logfilename: ConstPtr, tmidentity: ConstPtr, openoptions: UInt): Ntstatus

public expect fun ntPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt): Ntstatus

public expect fun ntPrePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus

public expect fun ntPrePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus

public expect fun ntPrepareComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus

public expect fun ntPrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus

public expect fun ntPropagationComplete(resourcemanagerhandle: Handle, requestcookie: UInt, bufferlength: UInt, buffer: ConstPtr): Ntstatus

public expect fun ntPropagationFailed(resourcemanagerhandle: Handle, requestcookie: UInt, propstatus: Ntstatus): Ntstatus

public expect fun ntQueryInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: MutPtr, enlistmentinformationlength: UInt, returnlength: MutPtr): Ntstatus

public expect fun ntQueryInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: MutPtr, resourcemanagerinformationlength: UInt, returnlength: MutPtr): Ntstatus

public expect fun ntQueryInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: MutPtr, transactioninformationlength: UInt, returnlength: MutPtr): Ntstatus

public expect fun ntQueryInformationTransactionManager(transactionmanagerhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: MutPtr, transactionmanagerinformationlength: UInt, returnlength: MutPtr): Ntstatus

public expect fun ntReadOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus

public expect fun ntRecoverEnlistment(enlistmenthandle: Handle, enlistmentkey: ConstPtr): Ntstatus

public expect fun ntRecoverResourceManager(resourcemanagerhandle: Handle): Ntstatus

public expect fun ntRecoverTransactionManager(transactionmanagerhandle: Handle): Ntstatus

public expect fun ntRegisterProtocolAddressInformation(resourcemanager: Handle, protocolid: ConstPtr, protocolinformationsize: UInt, protocolinformation: ConstPtr, createoptions: UInt): Ntstatus

public expect fun ntRenameTransactionManager(logfilename: ConstPtr, existingtransactionmanagerguid: ConstPtr): Ntstatus

public expect fun ntRollbackComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus

public expect fun ntRollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus

public expect fun ntRollbackTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus

public expect fun ntRollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: ConstPtr): Ntstatus

public expect fun ntSetInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: ConstPtr, enlistmentinformationlength: UInt): Ntstatus

public expect fun ntSetInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: ConstPtr, resourcemanagerinformationlength: UInt): Ntstatus

public expect fun ntSetInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: ConstPtr, transactioninformationlength: UInt): Ntstatus

public expect fun ntSetInformationTransactionManager(tmhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: ConstPtr, transactionmanagerinformationlength: UInt): Ntstatus

public expect fun ntSinglePhaseReject(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus

public expect fun ntUnloadDriver(driverservicename: ConstPtr): Ntstatus

public expect fun obCloseHandle(handle: Handle, previousmode: Byte): Ntstatus

public expect fun obDereferenceObjectDeferDelete(obj: ConstPtr)

public expect fun obDereferenceObjectDeferDeleteWithTag(obj: ConstPtr, tag: UInt)

public expect fun obGetFilterVersion(): UShort

public expect fun obGetObjectSecurity(obj: ConstPtr, securitydescriptor: MutPtr, memoryallocated: MutPtr): Ntstatus

public expect fun obReferenceObjectByHandle(handle: Handle, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, obj: MutPtr, handleinformation: MutPtr): Ntstatus

public expect fun obReferenceObjectByHandleWithTag(handle: Handle, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt, obj: MutPtr, handleinformation: MutPtr): Ntstatus

public expect fun obReferenceObjectByPointer(obj: ConstPtr, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte): Ntstatus

public expect fun obReferenceObjectByPointerWithTag(obj: ConstPtr, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt): Ntstatus

public expect fun obReferenceObjectSafe(obj: ConstPtr): Boolean

public expect fun obReferenceObjectSafeWithTag(obj: ConstPtr, tag: UInt): Boolean

public expect fun obRegisterCallbacks(callbackregistration: ConstPtr, registrationhandle: MutPtr): Ntstatus

public expect fun obReleaseObjectSecurity(securitydescriptor: PsecurityDescriptor, memoryallocated: Boolean)

public expect fun obUnRegisterCallbacks(registrationhandle: ConstPtr)

public expect fun obfDereferenceObject(obj: ConstPtr): Long

public expect fun obfDereferenceObjectWithTag(obj: ConstPtr, tag: UInt): Long

public expect fun obfReferenceObject(obj: ConstPtr): Long

public expect fun obfReferenceObjectWithTag(obj: ConstPtr, tag: UInt): Long

public expect fun pcwAddInstance(buffer: PpcwBuffer, name: ConstPtr, id: UInt, count: UInt, data: ConstPtr): Ntstatus

public expect fun pcwCloseInstance(instance: PpcwInstance)

public expect fun pcwCreateInstance(instance: MutPtr, registration: PpcwRegistration, name: ConstPtr, count: UInt, data: ConstPtr): Ntstatus

public expect fun pcwRegister(registration: MutPtr, info: ConstPtr): Ntstatus

public expect fun pcwUnregister(registration: PpcwRegistration)

public expect fun poCallDriver(deviceobject: ConstPtr, irp: MutPtr): Ntstatus

public expect fun poClearPowerRequest(powerrequest: MutPtr, type: PowerRequestType): Ntstatus

public expect fun poCreatePowerRequest(powerrequest: MutPtr, deviceobject: ConstPtr, context: ConstPtr): Ntstatus

public expect fun poCreateThermalRequest(thermalrequest: MutPtr, targetdeviceobject: ConstPtr, policydeviceobject: ConstPtr, context: ConstPtr, flags: UInt): Ntstatus

public expect fun poDeletePowerRequest(powerrequest: MutPtr)

public expect fun poDeleteThermalRequest(thermalrequest: MutPtr)

public expect fun poEndDeviceBusy(idlepointer: MutPtr)

public expect fun poFxActivateComponent(handle: Pohandle, component: UInt, flags: UInt)

public expect fun poFxCompleteDevicePowerNotRequired(handle: Pohandle)

public expect fun poFxCompleteDirectedPowerDown(handle: Pohandle)

public expect fun poFxCompleteIdleCondition(handle: Pohandle, component: UInt)

public expect fun poFxCompleteIdleState(handle: Pohandle, component: UInt)

public expect fun poFxIdleComponent(handle: Pohandle, component: UInt, flags: UInt)

public expect fun poFxIssueComponentPerfStateChange(handle: Pohandle, flags: UInt, component: UInt, perfchange: ConstPtr, context: ConstPtr)

public expect fun poFxIssueComponentPerfStateChangeMultiple(handle: Pohandle, flags: UInt, component: UInt, perfchangescount: UInt, perfchanges: ConstPtr, context: ConstPtr)

public expect fun poFxNotifySurprisePowerOn(pdo: ConstPtr)

public expect fun poFxPowerControl(handle: Pohandle, powercontrolcode: ConstPtr, inbuffer: ConstPtr, inbuffersize: ULong, outbuffer: MutPtr, outbuffersize: ULong, bytesreturned: MutPtr): Ntstatus

public expect fun poFxPowerOnCrashdumpDevice(handle: Pohandle, context: ConstPtr): Ntstatus

public expect fun poFxQueryCurrentComponentPerfState(handle: Pohandle, flags: UInt, component: UInt, setindex: UInt, currentperf: MutPtr): Ntstatus

public expect fun poFxRegisterComponentPerfStates(handle: Pohandle, component: UInt, flags: ULong, componentperfstatecallback: PpoFxComponentPerfStateCallback, inputstateinfo: ConstPtr, outputstateinfo: MutPtr): Ntstatus

public expect fun poFxRegisterCrashdumpDevice(handle: Pohandle): Ntstatus

public expect fun poFxRegisterDevice(pdo: ConstPtr, device: ConstPtr, handle: MutPtr): Ntstatus

public expect fun poFxRegisterDripsWatchdogCallback(handle: Pohandle, callback: PpoFxDripsWatchdogCallback, includechilddevices: Boolean, matchingdriverobject: ConstPtr)

public expect fun poFxReportDevicePoweredOn(handle: Pohandle)

public expect fun poFxSetComponentLatency(handle: Pohandle, component: UInt, latency: ULong)

public expect fun poFxSetComponentResidency(handle: Pohandle, component: UInt, residency: ULong)

public expect fun poFxSetComponentWake(handle: Pohandle, component: UInt, wakehint: Boolean)

public expect fun poFxSetDeviceIdleTimeout(handle: Pohandle, idletimeout: ULong)

public expect fun poFxSetTargetDripsDevicePowerState(handle: Pohandle, targetstate: DevicePowerState): Ntstatus

public expect fun poFxStartDevicePowerManagement(handle: Pohandle)

public expect fun poFxUnregisterDevice(handle: Pohandle)

public expect fun poGetSystemWake(irp: ConstPtr): Boolean

public expect fun poGetThermalRequestSupport(thermalrequest: ConstPtr, type: PoThermalRequestType): Boolean

public expect fun poQueryWatchdogTime(pdo: ConstPtr, secondsremaining: MutPtr): Boolean

public expect fun poRegisterDeviceForIdleDetection(deviceobject: ConstPtr, conservationidletime: UInt, performanceidletime: UInt, state: DevicePowerState): MutPtr

public expect fun poRegisterPowerSettingCallback(deviceobject: ConstPtr, settingguid: ConstPtr, callback: PpowerSettingCallback, context: ConstPtr, handle: MutPtr): Ntstatus

public expect fun poRegisterSystemState(statehandle: MutPtr, flags: UInt): MutPtr

public expect fun poRequestPowerIrp(deviceobject: ConstPtr, minorfunction: UByte, powerstate: PowerState, completionfunction: PrequestPowerComplete, context: ConstPtr, irp: MutPtr): Ntstatus

public expect fun poSetDeviceBusyEx(idlepointer: MutPtr)

public expect fun poSetHiberRange(memorymap: ConstPtr, flags: UInt, address: ConstPtr, length: ULong, tag: UInt)

public expect fun poSetPowerRequest(powerrequest: MutPtr, type: PowerRequestType): Ntstatus

public expect fun poSetPowerState(deviceobject: ConstPtr, type: PowerStateType, state: PowerState): PowerState

public expect fun poSetSystemState(flags: UInt)

public expect fun poSetSystemWake(irp: MutPtr)

public expect fun poSetSystemWakeDevice(deviceobject: ConstPtr)

public expect fun poSetThermalActiveCooling(thermalrequest: MutPtr, engaged: Boolean): Ntstatus

public expect fun poSetThermalPassiveCooling(thermalrequest: MutPtr, throttle: UByte): Ntstatus

public expect fun poStartDeviceBusy(idlepointer: MutPtr)

public expect fun poStartNextPowerIrp(irp: MutPtr)

public expect fun poUnregisterPowerSettingCallback(handle: MutPtr): Ntstatus

public expect fun poUnregisterSystemState(statehandle: MutPtr)

public expect fun probeForRead(address: ConstPtr, length: ULong, alignment: UInt)

public expect fun probeForWrite(address: MutPtr, length: ULong, alignment: UInt)

public expect fun psAcquireSiloHardReference(silo: Pesilo): Ntstatus

public expect fun psAllocSiloContextSlot(reserved: ULong, returnedcontextslot: MutPtr): Ntstatus

public expect fun psAllocateAffinityToken(affinitytoken: MutPtr): Ntstatus

public expect fun psAttachSiloToCurrentThread(silo: Pesilo): Pesilo

public expect fun psCreateSiloContext(silo: Pesilo, size: UInt, pooltype: PoolType, contextcleanupcallback: SiloContextCleanupCallback, returnedsilocontext: MutPtr): Ntstatus

public expect fun psCreateSystemThread(threadhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, processhandle: Handle, clientid: MutPtr, startroutine: PkstartRoutine, startcontext: ConstPtr): Ntstatus

public expect fun psDereferenceSiloContext(silocontext: ConstPtr)

public expect fun psDetachSiloFromCurrentThread(previoussilo: Pesilo)

public expect fun psFreeAffinityToken(affinitytoken: PaffinityToken)

public expect fun psFreeSiloContextSlot(contextslot: UInt): Ntstatus

public expect fun psGetCurrentProcessId(): Handle

public expect fun psGetCurrentServerSilo(): Pesilo

public expect fun psGetCurrentServerSiloName(): MutPtr

public expect fun psGetCurrentSilo(): Pesilo

public expect fun psGetCurrentThreadId(): Handle

public expect fun psGetCurrentThreadTeb(): MutPtr

public expect fun psGetEffectiveServerSilo(silo: Pesilo): Pesilo

public expect fun psGetHostSilo(): Pesilo

public expect fun psGetJobServerSilo(job: Pejob, serversilo: MutPtr): Ntstatus

public expect fun psGetJobSilo(job: Pejob, silo: MutPtr): Ntstatus

public expect fun psGetParentSilo(job: Pejob): Pesilo

public expect fun psGetPermanentSiloContext(silo: Pesilo, contextslot: UInt, returnedsilocontext: MutPtr): Ntstatus

public expect fun psGetProcessCreateTimeQuadPart(process: Peprocess): Long

public expect fun psGetProcessExitStatus(process: Peprocess): Ntstatus

public expect fun psGetProcessId(process: Peprocess): Handle

public expect fun psGetProcessStartKey(process: Peprocess): ULong

public expect fun psGetServerSiloServiceSessionId(silo: Pesilo): UInt

public expect fun psGetSiloContainerId(silo: Pesilo): MutPtr

public expect fun psGetSiloContext(silo: Pesilo, contextslot: UInt, returnedsilocontext: MutPtr): Ntstatus

public expect fun psGetSiloMonitorContextSlot(monitor: PsiloMonitor): UInt

public expect fun psGetThreadCreateTime(thread: Pethread): Long

public expect fun psGetThreadExitStatus(thread: Pethread): Ntstatus

public expect fun psGetThreadId(thread: Pethread): Handle

public expect fun psGetThreadProcessId(thread: Pethread): Handle

public expect fun psGetThreadProperty(thread: Pethread, key: ULong, flags: UInt): MutPtr

public expect fun psGetThreadServerSilo(thread: Pethread): Pesilo

public expect fun psGetVersion(majorversion: MutPtr, minorversion: MutPtr, buildnumber: MutPtr, csdversion: MutPtr): Boolean

public expect fun psInsertPermanentSiloContext(silo: Pesilo, contextslot: UInt, silocontext: ConstPtr): Ntstatus

public expect fun psInsertSiloContext(silo: Pesilo, contextslot: UInt, silocontext: ConstPtr): Ntstatus

public expect fun psIsCurrentThreadInServerSilo(): Boolean

public expect fun psIsCurrentThreadPrefetching(): Boolean

public expect fun psIsHostSilo(silo: Pesilo): Boolean

public expect fun psMakeSiloContextPermanent(silo: Pesilo, contextslot: UInt): Ntstatus

public expect fun psQueryTotalCycleTimeProcess(process: Peprocess, cycletimestamp: MutPtr): ULong

public expect fun psReferenceSiloContext(silocontext: ConstPtr)

public expect fun psRegisterSiloMonitor(registration: ConstPtr, returnedmonitor: MutPtr): Ntstatus

public expect fun psReleaseSiloHardReference(silo: Pesilo)

public expect fun psRemoveCreateThreadNotifyRoutine(notifyroutine: PcreateThreadNotifyRoutine): Ntstatus

public expect fun psRemoveLoadImageNotifyRoutine(notifyroutine: PloadImageNotifyRoutine): Ntstatus

public expect fun psRemoveSiloContext(silo: Pesilo, contextslot: UInt, removedsilocontext: MutPtr): Ntstatus

public expect fun psReplaceSiloContext(silo: Pesilo, contextslot: UInt, newsilocontext: ConstPtr, oldsilocontext: MutPtr): Ntstatus

public expect fun psRevertToUserMultipleGroupAffinityThread(affinitytoken: PaffinityToken)

public expect fun psSetCreateProcessNotifyRoutine(notifyroutine: PcreateProcessNotifyRoutine, remove: Boolean): Ntstatus

public expect fun psSetCreateProcessNotifyRoutineEx(notifyroutine: PcreateProcessNotifyRoutineEx, remove: Boolean): Ntstatus

public expect fun psSetCreateProcessNotifyRoutineEx2(notifytype: Pscreateprocessnotifytype, notifyinformation: ConstPtr, remove: Boolean): Ntstatus

public expect fun psSetCreateThreadNotifyRoutine(notifyroutine: PcreateThreadNotifyRoutine): Ntstatus

public expect fun psSetCreateThreadNotifyRoutineEx(notifytype: Pscreatethreadnotifytype, notifyinformation: ConstPtr): Ntstatus

public expect fun psSetCurrentThreadPrefetching(prefetching: Boolean): Boolean

public expect fun psSetLoadImageNotifyRoutine(notifyroutine: PloadImageNotifyRoutine): Ntstatus

public expect fun psSetLoadImageNotifyRoutineEx(notifyroutine: PloadImageNotifyRoutine, flags: ULong): Ntstatus

public expect fun psSetSystemMultipleGroupAffinityThread(groupaffinities: ConstPtr, groupcount: UShort, affinitytoken: PaffinityToken): Ntstatus

public expect fun psStartSiloMonitor(monitor: PsiloMonitor): Ntstatus

public expect fun psTerminateServerSilo(serversilo: Pesilo, exitstatus: Ntstatus)

public expect fun psTerminateSystemThread(exitstatus: Ntstatus): Ntstatus

public expect fun psUnregisterSiloMonitor(monitor: PsiloMonitor)

public expect fun psWrapApcWow64Thread(apccontext: MutPtr, apcroutine: MutPtr): Ntstatus

public expect fun pshedAllocateMemory(size: UInt): MutPtr

public expect fun pshedFreeMemory(address: ConstPtr)

public expect fun pshedIsSystemWheaEnabled(): Boolean

public expect fun pshedRegisterPlugin(packet: MutPtr): Ntstatus

public expect fun pshedSynchronizeExecution(errorsource: ConstPtr, synchronizeroutine: PksynchronizeRoutine, synchronizecontext: ConstPtr): Boolean

public expect fun pshedUnregisterPlugin(pluginhandle: ConstPtr)

public expect fun rtlAppendUnicodeStringToString(destination: MutPtr, source: ConstPtr): Ntstatus

public expect fun rtlAppendUnicodeToString(destination: MutPtr, source: Pcwstr): Ntstatus

public expect fun rtlAreBitsClear(bitmapheader: ConstPtr, startingindex: UInt, length: UInt): Boolean

public expect fun rtlAreBitsSet(bitmapheader: ConstPtr, startingindex: UInt, length: UInt): Boolean

public expect fun rtlAssert(voidfailedassertion: ConstPtr, voidfilename: ConstPtr, linenumber: UInt, mutablemessage: Pcstr)

public expect fun rtlCheckRegistryKey(relativeto: UInt, path: Pcwstr): Ntstatus

public expect fun rtlClearAllBits(bitmapheader: ConstPtr)

public expect fun rtlClearBit(bitmapheader: ConstPtr, bitnumber: UInt)

public expect fun rtlClearBits(bitmapheader: ConstPtr, startingindex: UInt, numbertoclear: UInt)

public expect fun rtlCmDecodeMemIoResource(descriptor: ConstPtr, start: MutPtr): ULong

public expect fun rtlCmEncodeMemIoResource(descriptor: ConstPtr, type: UByte, length: ULong, start: ULong): Ntstatus

public expect fun rtlCompareString(string1: ConstPtr, string2: ConstPtr, caseinsensitive: Boolean): Int

public expect fun rtlCompareUnicodeString(string1: ConstPtr, string2: ConstPtr, caseinsensitive: Boolean): Int

public expect fun rtlCompareUnicodeStrings(string1: ConstPtr, string1length: ULong, string2: ConstPtr, string2length: ULong, caseinsensitive: Boolean): Int

public expect fun rtlContractHashTable(hashtable: ConstPtr): Boolean

public expect fun rtlCopyBitMap(source: ConstPtr, destination: ConstPtr, targetbit: UInt)

public expect fun rtlCopyString(destinationstring: MutPtr, sourcestring: ConstPtr)

public expect fun rtlCopyUnicodeString(destinationstring: MutPtr, sourcestring: ConstPtr)

public expect fun rtlCreateHashTable(hashtable: MutPtr, shift: UInt, flags: UInt): Boolean

public expect fun rtlCreateHashTableEx(hashtable: MutPtr, initialsize: UInt, shift: UInt, flags: UInt): Boolean

public expect fun rtlCreateRegistryKey(relativeto: UInt, path: Pcwstr): Ntstatus

public expect fun rtlCreateSecurityDescriptor(securitydescriptor: PsecurityDescriptor, revision: UInt): Ntstatus

public expect fun rtlDelete(links: ConstPtr): MutPtr

public expect fun rtlDeleteElementGenericTable(table: ConstPtr, buffer: ConstPtr): Boolean

public expect fun rtlDeleteElementGenericTableAvl(table: ConstPtr, buffer: ConstPtr): Boolean

public expect fun rtlDeleteElementGenericTableAvlEx(table: ConstPtr, nodeorparent: ConstPtr)

public expect fun rtlDeleteHashTable(hashtable: ConstPtr)

public expect fun rtlDeleteNoSplay(links: ConstPtr, root: MutPtr)

public expect fun rtlDeleteRegistryValue(relativeto: UInt, path: Pcwstr, valuename: Pcwstr): Ntstatus

public expect fun rtlDowncaseUnicodeChar(sourcecharacter: UShort): UShort

public expect fun rtlEndEnumerationHashTable(hashtable: ConstPtr, enumerator: MutPtr)

public expect fun rtlEndStrongEnumerationHashTable(hashtable: ConstPtr, enumerator: MutPtr)

public expect fun rtlEndWeakEnumerationHashTable(hashtable: ConstPtr, enumerator: MutPtr)

public expect fun rtlEnumerateEntryHashTable(hashtable: ConstPtr, enumerator: MutPtr): MutPtr

public expect fun rtlEnumerateGenericTable(table: ConstPtr, restart: Boolean): MutPtr

public expect fun rtlEnumerateGenericTableAvl(table: ConstPtr, restart: Boolean): MutPtr

public expect fun rtlEnumerateGenericTableLikeADirectory(table: ConstPtr, matchfunction: PrtlAvlMatchFunction, matchdata: ConstPtr, nextflag: UInt, restartkey: MutPtr, deletecount: MutPtr, buffer: ConstPtr): MutPtr

public expect fun rtlEnumerateGenericTableWithoutSplaying(table: ConstPtr, restartkey: MutPtr): MutPtr

public expect fun rtlEnumerateGenericTableWithoutSplayingAvl(table: ConstPtr, restartkey: MutPtr): MutPtr

public expect fun rtlEqualString(string1: ConstPtr, string2: ConstPtr, caseinsensitive: Boolean): Boolean

public expect fun rtlEqualUnicodeString(string1: ConstPtr, string2: ConstPtr, caseinsensitive: Boolean): Boolean

public expect fun rtlExpandHashTable(hashtable: ConstPtr): Boolean

public expect fun rtlExtractBitMap(source: ConstPtr, destination: ConstPtr, targetbit: UInt, numberofbits: UInt)

public expect fun rtlFindClearBits(bitmapheader: ConstPtr, numbertofind: UInt, hintindex: UInt): UInt

public expect fun rtlFindClearBitsAndSet(bitmapheader: ConstPtr, numbertofind: UInt, hintindex: UInt): UInt

public expect fun rtlFindClearRuns(bitmapheader: ConstPtr, runarray: MutPtr, sizeofrunarray: UInt, locatelongestruns: Boolean): UInt

public expect fun rtlFindClosestEncodableLength(sourcelength: ULong, targetlength: MutPtr): Ntstatus

public expect fun rtlFindFirstRunClear(bitmapheader: ConstPtr, startingindex: MutPtr): UInt

public expect fun rtlFindLastBackwardRunClear(bitmapheader: ConstPtr, fromindex: UInt, startingrunindex: MutPtr): UInt

public expect fun rtlFindLeastSignificantBit(set: ULong): Byte

public expect fun rtlFindLongestRunClear(bitmapheader: ConstPtr, startingindex: MutPtr): UInt

public expect fun rtlFindMostSignificantBit(set: ULong): Byte

public expect fun rtlFindNextForwardRunClear(bitmapheader: ConstPtr, fromindex: UInt, startingrunindex: MutPtr): UInt

public expect fun rtlFindSetBits(bitmapheader: ConstPtr, numbertofind: UInt, hintindex: UInt): UInt

public expect fun rtlFindSetBitsAndClear(bitmapheader: ConstPtr, numbertofind: UInt, hintindex: UInt): UInt

public expect fun rtlFreeUTF8String(utf8string: MutPtr)

public expect fun rtlGUIDFromString(guidstring: ConstPtr, guid: MutPtr): Ntstatus

public expect fun rtlGenerateClass5Guid(namespaceguid: ConstPtr, buffer: ConstPtr, buffersize: UInt, guid: MutPtr): Ntstatus

public expect fun rtlGetActiveConsoleId(): UInt

public expect fun rtlGetCallersAddress(callersaddress: MutPtr, callerscaller: MutPtr)

public expect fun rtlGetConsoleSessionForegroundProcessId(): ULong

public expect fun rtlGetElementGenericTable(table: ConstPtr, i: UInt): MutPtr

public expect fun rtlGetElementGenericTableAvl(table: ConstPtr, i: UInt): MutPtr

public expect fun rtlGetEnabledExtendedFeatures(featuremask: ULong): ULong

public expect fun rtlGetNextEntryHashTable(hashtable: ConstPtr, context: ConstPtr): MutPtr

public expect fun rtlGetNtProductType(ntproducttype: MutPtr): Boolean

public expect fun rtlGetNtSystemRoot(): Pcwstr

public expect fun rtlGetPersistedStateLocation(sourceid: Pcwstr, customvalue: Pcwstr, defaultpath: Pcwstr, statelocationtype: StateLocationType, targetpath: Pwstr, bufferlengthin: UInt, bufferlengthout: MutPtr): Ntstatus

public expect fun rtlGetSuiteMask(): UInt

public expect fun rtlGetVersion(lpversioninformation: MutPtr): Ntstatus

public expect fun rtlHashUnicodeString(string: ConstPtr, caseinsensitive: Boolean, hashalgorithm: UInt, hashvalue: MutPtr): Ntstatus

public expect fun rtlInitEnumerationHashTable(hashtable: ConstPtr, enumerator: MutPtr): Boolean

public expect fun rtlInitStrongEnumerationHashTable(hashtable: ConstPtr, enumerator: MutPtr): Boolean

public expect fun rtlInitUTF8String(destinationstring: MutPtr, sourcestring: ConstPtr)

public expect fun rtlInitUTF8StringEx(destinationstring: MutPtr, sourcestring: ConstPtr): Ntstatus

public expect fun rtlInitWeakEnumerationHashTable(hashtable: ConstPtr, enumerator: MutPtr): Boolean

public expect fun rtlInitializeBitMap(bitmapheader: MutPtr, bitmapbuffer: ConstPtr, sizeofbitmap: UInt)

public expect fun rtlInitializeGenericTable(table: MutPtr, compareroutine: PrtlGenericCompareRoutine, allocateroutine: PrtlGenericAllocateRoutine, freeroutine: PrtlGenericFreeRoutine, tablecontext: ConstPtr)

public expect fun rtlInitializeGenericTableAvl(table: MutPtr, compareroutine: PrtlAvlCompareRoutine, allocateroutine: PrtlAvlAllocateRoutine, freeroutine: PrtlAvlFreeRoutine, tablecontext: ConstPtr)

public expect fun rtlInsertElementGenericTable(table: ConstPtr, buffer: ConstPtr, buffersize: UInt, newelement: MutPtr): MutPtr

public expect fun rtlInsertElementGenericTableAvl(table: ConstPtr, buffer: ConstPtr, buffersize: UInt, newelement: MutPtr): MutPtr

public expect fun rtlInsertElementGenericTableFull(table: ConstPtr, buffer: ConstPtr, buffersize: UInt, newelement: MutPtr, nodeorparent: ConstPtr, searchresult: TableSearchResult): MutPtr

public expect fun rtlInsertElementGenericTableFullAvl(table: ConstPtr, buffer: ConstPtr, buffersize: UInt, newelement: MutPtr, nodeorparent: ConstPtr, searchresult: TableSearchResult): MutPtr

public expect fun rtlInsertEntryHashTable(hashtable: ConstPtr, entry: ConstPtr, signature: ULong, context: MutPtr): Boolean

public expect fun rtlInt64ToUnicodeString(value: ULong, base: UInt, string: MutPtr): Ntstatus

public expect fun rtlIntegerToUnicodeString(value: UInt, base: UInt, string: MutPtr): Ntstatus

public expect fun rtlIoDecodeMemIoResource(descriptor: ConstPtr, alignment: MutPtr, minimumaddress: MutPtr, maximumaddress: MutPtr): ULong

public expect fun rtlIoEncodeMemIoResource(descriptor: ConstPtr, type: UByte, length: ULong, alignment: ULong, minimumaddress: ULong, maximumaddress: ULong): Ntstatus

public expect fun rtlIsApiSetImplemented(apisetname: Pcstr): Ntstatus

public expect fun rtlIsGenericTableEmpty(table: ConstPtr): Boolean

public expect fun rtlIsGenericTableEmptyAvl(table: ConstPtr): Boolean

public expect fun rtlIsMultiSessionSku(): Boolean

public expect fun rtlIsMultiUsersInSessionSku(): Boolean

public expect fun rtlIsNtDdiVersionAvailable(version: UInt): Boolean

public expect fun rtlIsServicePackVersionInstalled(version: UInt): Boolean

public expect fun rtlIsStateSeparationEnabled(): Boolean

public expect fun rtlIsUntrustedObject(handle: Handle, obj: ConstPtr, untrustedobject: MutPtr): Ntstatus

public expect fun rtlLengthSecurityDescriptor(securitydescriptor: PsecurityDescriptor): UInt

public expect fun rtlLookupElementGenericTable(table: ConstPtr, buffer: ConstPtr): MutPtr

public expect fun rtlLookupElementGenericTableAvl(table: ConstPtr, buffer: ConstPtr): MutPtr

public expect fun rtlLookupElementGenericTableFull(table: ConstPtr, buffer: ConstPtr, nodeorparent: MutPtr, searchresult: MutPtr): MutPtr

public expect fun rtlLookupElementGenericTableFullAvl(table: ConstPtr, buffer: ConstPtr, nodeorparent: MutPtr, searchresult: MutPtr): MutPtr

public expect fun rtlLookupEntryHashTable(hashtable: ConstPtr, signature: ULong, context: MutPtr): MutPtr

public expect fun rtlLookupFirstMatchingElementGenericTableAvl(table: ConstPtr, buffer: ConstPtr, restartkey: MutPtr): MutPtr

public expect fun rtlMapGenericMask(accessmask: MutPtr, genericmapping: ConstPtr)

public expect fun rtlNormalizeSecurityDescriptor(securitydescriptor: MutPtr, securitydescriptorlength: UInt, newsecuritydescriptor: MutPtr, newsecuritydescriptorlength: MutPtr, checkonly: Boolean): Boolean

public expect fun rtlNumberGenericTableElements(table: ConstPtr): UInt

public expect fun rtlNumberGenericTableElementsAvl(table: ConstPtr): UInt

public expect fun rtlNumberOfClearBits(bitmapheader: ConstPtr): UInt

public expect fun rtlNumberOfClearBitsInRange(bitmapheader: ConstPtr, startingindex: UInt, length: UInt): UInt

public expect fun rtlNumberOfSetBits(bitmapheader: ConstPtr): UInt

public expect fun rtlNumberOfSetBitsInRange(bitmapheader: ConstPtr, startingindex: UInt, length: UInt): UInt

public expect fun rtlNumberOfSetBitsUlongPtr(target: ULong): UInt

public expect fun rtlPrefetchMemoryNonTemporal(source: ConstPtr, length: ULong)

public expect fun rtlPrefixUnicodeString(string1: ConstPtr, string2: ConstPtr, caseinsensitive: Boolean): Boolean

public expect fun rtlQueryRegistryValueWithFallback(primaryhandle: Handle, fallbackhandle: Handle, valuename: ConstPtr, valuelength: UInt, valuetype: MutPtr, valuedata: MutPtr, resultlength: MutPtr): Ntstatus

public expect fun rtlQueryRegistryValues(relativeto: UInt, path: Pcwstr, querytable: MutPtr, context: ConstPtr, environment: ConstPtr): Ntstatus

public expect fun rtlQueryValidationRunlevel(componentname: ConstPtr): UInt

public expect fun rtlRealPredecessor(links: ConstPtr): MutPtr

public expect fun rtlRealSuccessor(links: ConstPtr): MutPtr

public expect fun rtlRemoveEntryHashTable(hashtable: ConstPtr, entry: ConstPtr, context: MutPtr): Boolean

public expect fun rtlRunOnceBeginInitialize(runonce: MutPtr, flags: UInt, context: MutPtr): Ntstatus

public expect fun rtlRunOnceComplete(runonce: MutPtr, flags: UInt, context: ConstPtr): Ntstatus

public expect fun rtlRunOnceExecuteOnce(runonce: MutPtr, initfn: PrtlRunOnceInitFn, parameter: MutPtr, context: MutPtr): Ntstatus

public expect fun rtlRunOnceInitialize(runonce: MutPtr)

public expect fun rtlSetAllBits(bitmapheader: ConstPtr)

public expect fun rtlSetBit(bitmapheader: ConstPtr, bitnumber: UInt)

public expect fun rtlSetBits(bitmapheader: ConstPtr, startingindex: UInt, numbertoset: UInt)

public expect fun rtlSetDaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, daclpresent: Boolean, dacl: ConstPtr, dacldefaulted: Boolean): Ntstatus
