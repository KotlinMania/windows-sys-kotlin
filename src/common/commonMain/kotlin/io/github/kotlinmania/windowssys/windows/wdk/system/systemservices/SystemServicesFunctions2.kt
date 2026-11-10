package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.windowssys.COpaquePointer
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

public expect fun keInitializeMutex(mutex: COpaquePointer?, level: UInt)

public expect fun keInitializeSemaphore(semaphore: COpaquePointer?, count: Int, limit: Int)

public expect fun keInitializeSpinLock(spinlock: COpaquePointer?)

public expect fun keInitializeThreadedDpc(dpc: COpaquePointer?, deferredroutine: PkdeferredRoutine, deferredcontext: COpaquePointer?)

public expect fun keInitializeTimer(timer: COpaquePointer?)

public expect fun keInitializeTimerEx(timer: COpaquePointer?, type: TimerType)

public expect fun keInitializeTriageDumpDataArray(ktriagedumpdataarray: COpaquePointer?, size: UInt): Ntstatus

public expect fun keInsertByKeyDeviceQueue(devicequeue: COpaquePointer?, devicequeueentry: COpaquePointer?, sortkey: UInt): Boolean

public expect fun keInsertDeviceQueue(devicequeue: COpaquePointer?, devicequeueentry: COpaquePointer?): Boolean

public expect fun keInsertQueueDpc(dpc: COpaquePointer?, systemargument1: COpaquePointer?, systemargument2: COpaquePointer?): Boolean

public expect fun keInvalidateAllCaches(): Boolean

public expect fun keInvalidateRangeAllCaches(baseaddress: COpaquePointer?, length: UInt)

public expect fun keIpiGenericCall(broadcastfunction: PkipiBroadcastWorker, context: ULong): ULong

public expect fun keIsExecutingDpc(): UInt

public expect fun keLeaveCriticalRegion()

public expect fun keLeaveGuardedRegion()

public expect fun kePulseEvent(event: COpaquePointer?, increment: Int, wait: Boolean): Int

public expect fun keQueryActiveGroupCount(): UShort

public expect fun keQueryActiveProcessorCount(activeprocessors: COpaquePointer?): UInt

public expect fun keQueryActiveProcessorCountEx(groupnumber: UShort): UInt

public expect fun keQueryActiveProcessors(): ULong

public expect fun keQueryAuxiliaryCounterFrequency(auxiliarycounterfrequency: COpaquePointer?): Ntstatus

public expect fun keQueryDpcWatchdogInformation(watchdoginformation: COpaquePointer?): Ntstatus

public expect fun keQueryGroupAffinity(groupnumber: UShort): ULong

public expect fun keQueryHardwareCounterConfiguration(counterarray: COpaquePointer?, maximumcount: UInt, count: COpaquePointer?): Ntstatus

public expect fun keQueryHighestNodeNumber(): UShort

public expect fun keQueryInterruptTimePrecise(qpctimestamp: COpaquePointer?): ULong

public expect fun keQueryLogicalProcessorRelationship(processornumber: COpaquePointer?, relationshiptype: LogicalProcessorRelationship, information: COpaquePointer?, length: COpaquePointer?): Ntstatus

public expect fun keQueryMaximumGroupCount(): UShort

public expect fun keQueryMaximumProcessorCount(): UInt

public expect fun keQueryMaximumProcessorCountEx(groupnumber: UShort): UInt

public expect fun keQueryNodeActiveAffinity(nodenumber: UShort, affinity: COpaquePointer?, count: COpaquePointer?)

public expect fun keQueryNodeActiveAffinity2(nodenumber: UShort, groupaffinities: COpaquePointer?, groupaffinitiescount: UShort, groupaffinitiesrequired: COpaquePointer?): Ntstatus

public expect fun keQueryNodeActiveProcessorCount(nodenumber: UShort): UInt

public expect fun keQueryNodeMaximumProcessorCount(nodenumber: UShort): UShort

public expect fun keQueryPerformanceCounter(performancefrequency: COpaquePointer?): Long

public expect fun keQueryPriorityThread(thread: Pkthread): Int

public expect fun keQueryRuntimeThread(thread: Pkthread, usertime: COpaquePointer?): UInt

public expect fun keQuerySystemTimePrecise(currenttime: COpaquePointer?)

public expect fun keQueryTimeIncrement(): UInt

public expect fun keQueryTotalCycleTimeThread(thread: Pkthread, cycletimestamp: COpaquePointer?): ULong

public expect fun keQueryUnbiasedInterruptTime(): ULong

public expect fun keQueryUnbiasedInterruptTimePrecise(qpctimestamp: COpaquePointer?): ULong

public expect fun keReadStateEvent(event: COpaquePointer?): Int

public expect fun keReadStateMutex(mutex: COpaquePointer?): Int

public expect fun keReadStateSemaphore(semaphore: COpaquePointer?): Int

public expect fun keReadStateTimer(timer: COpaquePointer?): Boolean

public expect fun keRegisterBoundCallback(callbackroutine: PboundCallback): COpaquePointer?

public expect fun keRegisterBugCheckCallback(callbackrecord: COpaquePointer?, callbackroutine: PkbugcheckCallbackRoutine, buffer: COpaquePointer?, length: UInt, component: COpaquePointer?): Boolean

public expect fun keRegisterBugCheckReasonCallback(callbackrecord: COpaquePointer?, callbackroutine: PkbugcheckReasonCallbackRoutine, reason: KbugcheckCallbackReason, component: COpaquePointer?): Boolean

public expect fun keRegisterNmiCallback(callbackroutine: PnmiCallback, context: COpaquePointer?): COpaquePointer?

public expect fun keRegisterProcessorChangeCallback(callbackfunction: PprocessorCallbackFunction, callbackcontext: COpaquePointer?, flags: UInt): COpaquePointer?

public expect fun keReleaseGuardedMutex(mutex: COpaquePointer?)

public expect fun keReleaseGuardedMutexUnsafe(fastmutex: COpaquePointer?)

public expect fun keReleaseInStackQueuedSpinLock(lockhandle: COpaquePointer?)

public expect fun keReleaseInStackQueuedSpinLockForDpc(lockhandle: COpaquePointer?)

public expect fun keReleaseInStackQueuedSpinLockFromDpcLevel(lockhandle: COpaquePointer?)

public expect fun keReleaseInterruptSpinLock(interrupt: Pkinterrupt, oldirql: UByte)

public expect fun keReleaseMutex(mutex: COpaquePointer?, wait: Boolean): Int

public expect fun keReleaseSemaphore(semaphore: COpaquePointer?, increment: Int, adjustment: Int, wait: Boolean): Int

public expect fun keReleaseSpinLockForDpc(spinlock: COpaquePointer?, oldirql: UByte)

public expect fun keRemoveByKeyDeviceQueue(devicequeue: COpaquePointer?, sortkey: UInt): COpaquePointer?

public expect fun keRemoveByKeyDeviceQueueIfBusy(devicequeue: COpaquePointer?, sortkey: UInt): COpaquePointer?

public expect fun keRemoveDeviceQueue(devicequeue: COpaquePointer?): COpaquePointer?

public expect fun keRemoveEntryDeviceQueue(devicequeue: COpaquePointer?, devicequeueentry: COpaquePointer?): Boolean

public expect fun keRemoveQueueDpc(dpc: COpaquePointer?): Boolean

public expect fun keRemoveQueueDpcEx(dpc: COpaquePointer?, waitifactive: Boolean): Boolean

public expect fun keResetEvent(event: COpaquePointer?): Int

public expect fun keRestoreExtendedProcessorState(xstatesave: COpaquePointer?)

public expect fun keRevertToUserAffinityThread()

public expect fun keRevertToUserAffinityThreadEx(affinity: ULong)

public expect fun keRevertToUserGroupAffinityThread(previousaffinity: COpaquePointer?)

public expect fun keSaveExtendedProcessorState(mask: ULong, xstatesave: COpaquePointer?): Ntstatus

public expect fun keSetBasePriorityThread(thread: Pkthread, increment: Int): Int

public expect fun keSetCoalescableTimer(timer: COpaquePointer?, duetime: Long, period: UInt, tolerabledelay: UInt, dpc: COpaquePointer?): Boolean

public expect fun keSetEvent(event: COpaquePointer?, increment: Int, wait: Boolean): Int

public expect fun keSetHardwareCounterConfiguration(counterarray: COpaquePointer?, count: UInt): Ntstatus

public expect fun keSetImportanceDpc(dpc: COpaquePointer?, importance: KdpcImportance)

public expect fun keSetPriorityThread(thread: Pkthread, priority: Int): Int

public expect fun keSetSystemAffinityThread(affinity: ULong)

public expect fun keSetSystemAffinityThreadEx(affinity: ULong): ULong

public expect fun keSetSystemGroupAffinityThread(affinity: COpaquePointer?, previousaffinity: COpaquePointer?)

public expect fun keSetTargetProcessorDpc(dpc: COpaquePointer?, number: Byte)

public expect fun keSetTargetProcessorDpcEx(dpc: COpaquePointer?, procnumber: COpaquePointer?): Ntstatus

public expect fun keSetTimer(timer: COpaquePointer?, duetime: Long, dpc: COpaquePointer?): Boolean

public expect fun keSetTimerEx(timer: COpaquePointer?, duetime: Long, period: Int, dpc: COpaquePointer?): Boolean

public expect fun keShouldYieldProcessor(): UInt

public expect fun keStallExecutionProcessor(microseconds: UInt)

public expect fun keSynchronizeExecution(interrupt: Pkinterrupt, synchronizeroutine: PksynchronizeRoutine, synchronizecontext: COpaquePointer?): Boolean

public expect fun keTestSpinLock(spinlock: COpaquePointer?): Boolean

public expect fun keTryToAcquireGuardedMutex(mutex: COpaquePointer?): Boolean

public expect fun keTryToAcquireSpinLockAtDpcLevel(spinlock: COpaquePointer?): Boolean

public expect fun keWaitForMultipleObjects(count: UInt, obj: COpaquePointer?, waittype: WaitType, waitreason: KwaitReason, waitmode: Byte, alertable: Boolean, timeout: COpaquePointer?, waitblockarray: COpaquePointer?): Ntstatus

public expect fun keWaitForSingleObject(obj: COpaquePointer?, waitreason: KwaitReason, waitmode: Byte, alertable: Boolean, timeout: COpaquePointer?): Ntstatus

public expect fun kfRaiseIrql(newirql: UByte): UByte

public expect fun mmAddPhysicalMemory(startaddress: COpaquePointer?, numberofbytes: COpaquePointer?): Ntstatus

public expect fun mmAddVerifierSpecialThunks(entryroutine: ULong, thunkbuffer: COpaquePointer?, thunkbuffersize: UInt): Ntstatus

public expect fun mmAddVerifierThunks(thunkbuffer: COpaquePointer?, thunkbuffersize: UInt): Ntstatus

public expect fun mmAdvanceMdl(mdl: COpaquePointer?, numberofbytes: UInt): Ntstatus

public expect fun mmAllocateContiguousMemory(numberofbytes: ULong, highestacceptableaddress: Long): COpaquePointer?

public expect fun mmAllocateContiguousMemoryEx(numberofbytes: COpaquePointer?, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, preferrednode: UInt, protect: UInt, partitionobject: COpaquePointer?, tag: UInt, flags: UInt, baseaddress: COpaquePointer?): Ntstatus

public expect fun mmAllocateContiguousMemorySpecifyCache(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MemoryCachingType): COpaquePointer?

public expect fun mmAllocateContiguousMemorySpecifyCacheNode(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MemoryCachingType, preferrednode: UInt): COpaquePointer?

public expect fun mmAllocateContiguousNodeMemory(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, protect: UInt, preferrednode: UInt): COpaquePointer?

public expect fun mmAllocateMappingAddress(numberofbytes: ULong, pooltag: UInt): COpaquePointer?

public expect fun mmAllocateMappingAddressEx(numberofbytes: ULong, pooltag: UInt, flags: UInt): COpaquePointer?

public expect fun mmAllocateMdlForIoSpace(physicaladdresslist: COpaquePointer?, numberofentries: ULong, newmdl: COpaquePointer?): Ntstatus

public expect fun mmAllocateNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, idealnode: UInt, flags: UInt): COpaquePointer?

public expect fun mmAllocateNonCachedMemory(numberofbytes: ULong): COpaquePointer?

public expect fun mmAllocatePagesForMdl(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong): COpaquePointer?

public expect fun mmAllocatePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, flags: UInt): COpaquePointer?

public expect fun mmAllocatePartitionNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, idealnode: UInt, flags: UInt, partitionobject: COpaquePointer?): COpaquePointer?

public expect fun mmAreMdlPagesCached(memorydescriptorlist: COpaquePointer?): UInt

public expect fun mmBuildMdlForNonPagedPool(memorydescriptorlist: COpaquePointer?)

public expect fun mmCopyMemory(targetaddress: COpaquePointer?, sourceaddress: MmCopyAddress, numberofbytes: ULong, flags: UInt, numberofbytestransferred: COpaquePointer?): Ntstatus

public expect fun mmCreateMdl(memorydescriptorlist: COpaquePointer?, base: COpaquePointer?, length: ULong): COpaquePointer?

public expect fun mmCreateMirror(): Ntstatus

public expect fun mmFreeContiguousMemory(baseaddress: COpaquePointer?)

public expect fun mmFreeContiguousMemorySpecifyCache(baseaddress: COpaquePointer?, numberofbytes: ULong, cachetype: MemoryCachingType)

public expect fun mmFreeMappingAddress(baseaddress: COpaquePointer?, pooltag: UInt)

public expect fun mmFreeNonCachedMemory(baseaddress: COpaquePointer?, numberofbytes: ULong)

public expect fun mmFreePagesFromMdl(memorydescriptorlist: COpaquePointer?)

public expect fun mmFreePagesFromMdlEx(memorydescriptorlist: COpaquePointer?, flags: UInt)

public expect fun mmGetCacheAttribute(physicaladdress: Long, cachetype: COpaquePointer?): Ntstatus

public expect fun mmGetCacheAttributeEx(physicaladdress: Long, flags: UInt, cachetype: COpaquePointer?): Ntstatus

public expect fun mmGetPhysicalAddress(baseaddress: COpaquePointer?): Long

public expect fun mmGetPhysicalMemoryRanges(): COpaquePointer?

public expect fun mmGetPhysicalMemoryRangesEx(partitionobject: COpaquePointer?): COpaquePointer?

public expect fun mmGetPhysicalMemoryRangesEx2(partitionobject: COpaquePointer?, flags: UInt): COpaquePointer?

public expect fun mmGetSystemRoutineAddress(systemroutinename: COpaquePointer?): COpaquePointer?

public expect fun mmGetVirtualForPhysical(physicaladdress: Long): COpaquePointer?

public expect fun mmIsAddressValid(virtualaddress: COpaquePointer?): Boolean

public expect fun mmIsDriverSuspectForVerifier(driverobject: COpaquePointer?): UInt

public expect fun mmIsDriverVerifying(driverobject: COpaquePointer?): UInt

public expect fun mmIsDriverVerifyingByAddress(addresswithinsection: COpaquePointer?): UInt

public expect fun mmIsIoSpaceActive(startaddress: Long, numberofbytes: ULong): UInt

public expect fun mmIsNonPagedSystemAddressValid(virtualaddress: COpaquePointer?): Boolean

public expect fun mmIsThisAnNtAsSystem(): Boolean

public expect fun mmIsVerifierEnabled(verifierflags: COpaquePointer?): Ntstatus

public expect fun mmLockPagableDataSection(addresswithinsection: COpaquePointer?): COpaquePointer?

public expect fun mmLockPagableSectionByHandle(imagesectionhandle: COpaquePointer?)

public expect fun mmMapIoSpace(physicaladdress: Long, numberofbytes: ULong, cachetype: MemoryCachingType): COpaquePointer?

public expect fun mmMapIoSpaceEx(physicaladdress: Long, numberofbytes: ULong, protect: UInt): COpaquePointer?

public expect fun mmMapLockedPages(memorydescriptorlist: COpaquePointer?, accessmode: Byte): COpaquePointer?

public expect fun mmMapLockedPagesSpecifyCache(memorydescriptorlist: COpaquePointer?, accessmode: Byte, cachetype: MemoryCachingType, requestedaddress: COpaquePointer?, bugcheckonfailure: UInt, priority: UInt): COpaquePointer?

public expect fun mmMapLockedPagesWithReservedMapping(mappingaddress: COpaquePointer?, pooltag: UInt, memorydescriptorlist: COpaquePointer?, cachetype: MemoryCachingType): COpaquePointer?

public expect fun mmMapMdl(memorydescriptorlist: COpaquePointer?, protection: UInt, driverroutine: PmmMdlRoutine, drivercontext: COpaquePointer?): Ntstatus

public expect fun mmMapMemoryDumpMdlEx(va: COpaquePointer?, pagetotal: UInt, memorydumpmdl: COpaquePointer?, flags: UInt): Ntstatus

public expect fun mmMapUserAddressesToPage(baseaddress: COpaquePointer?, numberofbytes: ULong, pageaddress: COpaquePointer?): Ntstatus

public expect fun mmMapVideoDisplay(physicaladdress: Long, numberofbytes: ULong, cachetype: MemoryCachingType): COpaquePointer?

public expect fun mmMapViewInSessionSpace(section: COpaquePointer?, mappedbase: COpaquePointer?, viewsize: COpaquePointer?): Ntstatus

public expect fun mmMapViewInSessionSpaceEx(section: COpaquePointer?, mappedbase: COpaquePointer?, viewsize: COpaquePointer?, sectionoffset: COpaquePointer?, flags: ULong): Ntstatus

public expect fun mmMapViewInSystemSpace(section: COpaquePointer?, mappedbase: COpaquePointer?, viewsize: COpaquePointer?): Ntstatus

public expect fun mmMapViewInSystemSpaceEx(section: COpaquePointer?, mappedbase: COpaquePointer?, viewsize: COpaquePointer?, sectionoffset: COpaquePointer?, flags: ULong): Ntstatus

public expect fun mmMdlPageContentsState(memorydescriptorlist: COpaquePointer?, state: MmMdlPageContentsState): MmMdlPageContentsState

public expect fun mmPageEntireDriver(addresswithinsection: COpaquePointer?): COpaquePointer?

public expect fun mmProbeAndLockPages(memorydescriptorlist: COpaquePointer?, accessmode: Byte, operation: LockOperation)

public expect fun mmProbeAndLockProcessPages(memorydescriptorlist: COpaquePointer?, process: Peprocess, accessmode: Byte, operation: LockOperation)

public expect fun mmProbeAndLockSelectedPages(memorydescriptorlist: COpaquePointer?, segmentarray: COpaquePointer?, accessmode: Byte, operation: LockOperation)

public expect fun mmProtectDriverSection(addresswithinsection: COpaquePointer?, size: ULong, flags: UInt): Ntstatus

public expect fun mmProtectMdlSystemAddress(memorydescriptorlist: COpaquePointer?, newprotect: UInt): Ntstatus

public expect fun mmQuerySystemSize(): MmSystemsize

public expect fun mmRemovePhysicalMemory(startaddress: COpaquePointer?, numberofbytes: COpaquePointer?): Ntstatus

public expect fun mmResetDriverPaging(addresswithinsection: COpaquePointer?)

public expect fun mmRotatePhysicalView(virtualaddress: COpaquePointer?, numberofbytes: COpaquePointer?, newmdl: COpaquePointer?, direction: MmRotateDirection, copyfunction: PmmRotateCopyCallbackFunction, context: COpaquePointer?): Ntstatus

public expect fun mmSecureVirtualMemory(address: COpaquePointer?, size: ULong, probemode: UInt): Handle

public expect fun mmSecureVirtualMemoryEx(address: COpaquePointer?, size: ULong, probemode: UInt, flags: UInt): Handle

public expect fun mmSetPermanentCacheAttribute(startaddress: Long, numberofbytes: Long, cachetype: MemoryCachingType, flags: UInt): Ntstatus

public expect fun mmSizeOfMdl(base: COpaquePointer?, length: ULong): ULong

public expect fun mmUnlockPagableImageSection(imagesectionhandle: COpaquePointer?)

public expect fun mmUnlockPages(memorydescriptorlist: COpaquePointer?)

public expect fun mmUnmapIoSpace(baseaddress: COpaquePointer?, numberofbytes: ULong)

public expect fun mmUnmapLockedPages(baseaddress: COpaquePointer?, memorydescriptorlist: COpaquePointer?)

public expect fun mmUnmapReservedMapping(baseaddress: COpaquePointer?, pooltag: UInt, memorydescriptorlist: COpaquePointer?)

public expect fun mmUnmapVideoDisplay(baseaddress: COpaquePointer?, numberofbytes: ULong)

public expect fun mmUnmapViewInSessionSpace(mappedbase: COpaquePointer?): Ntstatus

public expect fun mmUnmapViewInSystemSpace(mappedbase: COpaquePointer?): Ntstatus

public expect fun mmUnsecureVirtualMemory(securehandle: Handle)

public expect fun ntAllocateLocallyUniqueId(luid: COpaquePointer?): Ntstatus

public expect fun ntCommitComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus

public expect fun ntCommitEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus

public expect fun ntCommitTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus

public expect fun ntCreateEnlistment(enlistmenthandle: COpaquePointer?, desiredaccess: UInt, resourcemanagerhandle: Handle, transactionhandle: Handle, objectattributes: COpaquePointer?, createoptions: UInt, notificationmask: UInt, enlistmentkey: COpaquePointer?): Ntstatus

public expect fun ntCreateResourceManager(resourcemanagerhandle: COpaquePointer?, desiredaccess: UInt, tmhandle: Handle, rmguid: COpaquePointer?, objectattributes: COpaquePointer?, createoptions: UInt, description: COpaquePointer?): Ntstatus

public expect fun ntCreateTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, uow: COpaquePointer?, tmhandle: Handle, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: COpaquePointer?, description: COpaquePointer?): Ntstatus

public expect fun ntCreateTransactionManager(tmhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, logfilename: COpaquePointer?, createoptions: UInt, commitstrength: UInt): Ntstatus

public expect fun ntDisplayString(string: COpaquePointer?): Ntstatus

public expect fun ntEnumerateTransactionObject(rootobjecthandle: Handle, querytype: KtmobjectType, objectcursor: COpaquePointer?, objectcursorlength: UInt, returnlength: COpaquePointer?): Ntstatus

public expect fun ntGetNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: COpaquePointer?, notificationlength: UInt, timeout: COpaquePointer?, returnlength: COpaquePointer?, asynchronous: UInt, asynchronouscontext: ULong): Ntstatus

public expect fun ntLoadDriver(driverservicename: COpaquePointer?): Ntstatus

public expect fun ntMakeTemporaryObject(handle: Handle): Ntstatus

public expect fun ntManagePartition(targethandle: Handle, sourcehandle: Handle, partitioninformationclass: PartitionInformationClass, partitioninformation: COpaquePointer?, partitioninformationlength: UInt): Ntstatus

public expect fun ntOpenEnlistment(enlistmenthandle: COpaquePointer?, desiredaccess: UInt, resourcemanagerhandle: Handle, enlistmentguid: COpaquePointer?, objectattributes: COpaquePointer?): Ntstatus

public expect fun ntOpenResourceManager(resourcemanagerhandle: COpaquePointer?, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: COpaquePointer?, objectattributes: COpaquePointer?): Ntstatus

public expect fun ntOpenTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, uow: COpaquePointer?, tmhandle: Handle): Ntstatus

public expect fun ntOpenTransactionManager(tmhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, logfilename: COpaquePointer?, tmidentity: COpaquePointer?, openoptions: UInt): Ntstatus

public expect fun ntPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt): Ntstatus

public expect fun ntPrePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus

public expect fun ntPrePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus

public expect fun ntPrepareComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus

public expect fun ntPrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus

public expect fun ntPropagationComplete(resourcemanagerhandle: Handle, requestcookie: UInt, bufferlength: UInt, buffer: COpaquePointer?): Ntstatus

public expect fun ntPropagationFailed(resourcemanagerhandle: Handle, requestcookie: UInt, propstatus: Ntstatus): Ntstatus

public expect fun ntQueryInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: COpaquePointer?, enlistmentinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus

public expect fun ntQueryInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: COpaquePointer?, resourcemanagerinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus

public expect fun ntQueryInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: COpaquePointer?, transactioninformationlength: UInt, returnlength: COpaquePointer?): Ntstatus

public expect fun ntQueryInformationTransactionManager(transactionmanagerhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: COpaquePointer?, transactionmanagerinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus

public expect fun ntReadOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus

public expect fun ntRecoverEnlistment(enlistmenthandle: Handle, enlistmentkey: COpaquePointer?): Ntstatus

public expect fun ntRecoverResourceManager(resourcemanagerhandle: Handle): Ntstatus

public expect fun ntRecoverTransactionManager(transactionmanagerhandle: Handle): Ntstatus

public expect fun ntRegisterProtocolAddressInformation(resourcemanager: Handle, protocolid: COpaquePointer?, protocolinformationsize: UInt, protocolinformation: COpaquePointer?, createoptions: UInt): Ntstatus

public expect fun ntRenameTransactionManager(logfilename: COpaquePointer?, existingtransactionmanagerguid: COpaquePointer?): Ntstatus

public expect fun ntRollbackComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus

public expect fun ntRollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus

public expect fun ntRollbackTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus

public expect fun ntRollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus

public expect fun ntSetInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: COpaquePointer?, enlistmentinformationlength: UInt): Ntstatus

public expect fun ntSetInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: COpaquePointer?, resourcemanagerinformationlength: UInt): Ntstatus

public expect fun ntSetInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: COpaquePointer?, transactioninformationlength: UInt): Ntstatus

public expect fun ntSetInformationTransactionManager(tmhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: COpaquePointer?, transactionmanagerinformationlength: UInt): Ntstatus

public expect fun ntSinglePhaseReject(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus

public expect fun ntUnloadDriver(driverservicename: COpaquePointer?): Ntstatus

public expect fun obCloseHandle(handle: Handle, previousmode: Byte): Ntstatus

public expect fun obDereferenceObjectDeferDelete(obj: COpaquePointer?)

public expect fun obDereferenceObjectDeferDeleteWithTag(obj: COpaquePointer?, tag: UInt)

public expect fun obGetFilterVersion(): UShort

public expect fun obGetObjectSecurity(obj: COpaquePointer?, securitydescriptor: COpaquePointer?, memoryallocated: COpaquePointer?): Ntstatus

public expect fun obReferenceObjectByHandle(handle: Handle, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, obj: COpaquePointer?, handleinformation: COpaquePointer?): Ntstatus

public expect fun obReferenceObjectByHandleWithTag(handle: Handle, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt, obj: COpaquePointer?, handleinformation: COpaquePointer?): Ntstatus

public expect fun obReferenceObjectByPointer(obj: COpaquePointer?, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte): Ntstatus

public expect fun obReferenceObjectByPointerWithTag(obj: COpaquePointer?, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt): Ntstatus

public expect fun obReferenceObjectSafe(obj: COpaquePointer?): Boolean

public expect fun obReferenceObjectSafeWithTag(obj: COpaquePointer?, tag: UInt): Boolean

public expect fun obRegisterCallbacks(callbackregistration: COpaquePointer?, registrationhandle: COpaquePointer?): Ntstatus

public expect fun obReleaseObjectSecurity(securitydescriptor: PsecurityDescriptor, memoryallocated: Boolean)

public expect fun obUnRegisterCallbacks(registrationhandle: COpaquePointer?)

public expect fun obfDereferenceObject(obj: COpaquePointer?): Long

public expect fun obfDereferenceObjectWithTag(obj: COpaquePointer?, tag: UInt): Long

public expect fun obfReferenceObject(obj: COpaquePointer?): Long

public expect fun obfReferenceObjectWithTag(obj: COpaquePointer?, tag: UInt): Long

public expect fun pcwAddInstance(buffer: PpcwBuffer, name: COpaquePointer?, id: UInt, count: UInt, data: COpaquePointer?): Ntstatus

public expect fun pcwCloseInstance(instance: PpcwInstance)

public expect fun pcwCreateInstance(instance: COpaquePointer?, registration: PpcwRegistration, name: COpaquePointer?, count: UInt, data: COpaquePointer?): Ntstatus

public expect fun pcwRegister(registration: COpaquePointer?, info: COpaquePointer?): Ntstatus

public expect fun pcwUnregister(registration: PpcwRegistration)

public expect fun poCallDriver(deviceobject: COpaquePointer?, irp: COpaquePointer?): Ntstatus

public expect fun poClearPowerRequest(powerrequest: COpaquePointer?, type: PowerRequestType): Ntstatus

public expect fun poCreatePowerRequest(powerrequest: COpaquePointer?, deviceobject: COpaquePointer?, context: COpaquePointer?): Ntstatus

public expect fun poCreateThermalRequest(thermalrequest: COpaquePointer?, targetdeviceobject: COpaquePointer?, policydeviceobject: COpaquePointer?, context: COpaquePointer?, flags: UInt): Ntstatus

public expect fun poDeletePowerRequest(powerrequest: COpaquePointer?)

public expect fun poDeleteThermalRequest(thermalrequest: COpaquePointer?)

public expect fun poEndDeviceBusy(idlepointer: COpaquePointer?)

public expect fun poFxActivateComponent(handle: Pohandle, component: UInt, flags: UInt)

public expect fun poFxCompleteDevicePowerNotRequired(handle: Pohandle)

public expect fun poFxCompleteDirectedPowerDown(handle: Pohandle)

public expect fun poFxCompleteIdleCondition(handle: Pohandle, component: UInt)

public expect fun poFxCompleteIdleState(handle: Pohandle, component: UInt)

public expect fun poFxIdleComponent(handle: Pohandle, component: UInt, flags: UInt)

public expect fun poFxIssueComponentPerfStateChange(handle: Pohandle, flags: UInt, component: UInt, perfchange: COpaquePointer?, context: COpaquePointer?)

public expect fun poFxIssueComponentPerfStateChangeMultiple(handle: Pohandle, flags: UInt, component: UInt, perfchangescount: UInt, perfchanges: COpaquePointer?, context: COpaquePointer?)

public expect fun poFxNotifySurprisePowerOn(pdo: COpaquePointer?)

public expect fun poFxPowerControl(handle: Pohandle, powercontrolcode: COpaquePointer?, inbuffer: COpaquePointer?, inbuffersize: ULong, outbuffer: COpaquePointer?, outbuffersize: ULong, bytesreturned: COpaquePointer?): Ntstatus

public expect fun poFxPowerOnCrashdumpDevice(handle: Pohandle, context: COpaquePointer?): Ntstatus

public expect fun poFxQueryCurrentComponentPerfState(handle: Pohandle, flags: UInt, component: UInt, setindex: UInt, currentperf: COpaquePointer?): Ntstatus

public expect fun poFxRegisterComponentPerfStates(handle: Pohandle, component: UInt, flags: ULong, componentperfstatecallback: PpoFxComponentPerfStateCallback, inputstateinfo: COpaquePointer?, outputstateinfo: COpaquePointer?): Ntstatus

public expect fun poFxRegisterCrashdumpDevice(handle: Pohandle): Ntstatus

public expect fun poFxRegisterDevice(pdo: COpaquePointer?, device: COpaquePointer?, handle: COpaquePointer?): Ntstatus

public expect fun poFxRegisterDripsWatchdogCallback(handle: Pohandle, callback: PpoFxDripsWatchdogCallback, includechilddevices: Boolean, matchingdriverobject: COpaquePointer?)

public expect fun poFxReportDevicePoweredOn(handle: Pohandle)

public expect fun poFxSetComponentLatency(handle: Pohandle, component: UInt, latency: ULong)

public expect fun poFxSetComponentResidency(handle: Pohandle, component: UInt, residency: ULong)

public expect fun poFxSetComponentWake(handle: Pohandle, component: UInt, wakehint: Boolean)

public expect fun poFxSetDeviceIdleTimeout(handle: Pohandle, idletimeout: ULong)

public expect fun poFxSetTargetDripsDevicePowerState(handle: Pohandle, targetstate: DevicePowerState): Ntstatus

public expect fun poFxStartDevicePowerManagement(handle: Pohandle)

public expect fun poFxUnregisterDevice(handle: Pohandle)

public expect fun poGetSystemWake(irp: COpaquePointer?): Boolean

public expect fun poGetThermalRequestSupport(thermalrequest: COpaquePointer?, type: PoThermalRequestType): Boolean

public expect fun poQueryWatchdogTime(pdo: COpaquePointer?, secondsremaining: COpaquePointer?): Boolean

public expect fun poRegisterDeviceForIdleDetection(deviceobject: COpaquePointer?, conservationidletime: UInt, performanceidletime: UInt, state: DevicePowerState): COpaquePointer?

public expect fun poRegisterPowerSettingCallback(deviceobject: COpaquePointer?, settingguid: COpaquePointer?, callback: PpowerSettingCallback, context: COpaquePointer?, handle: COpaquePointer?): Ntstatus

public expect fun poRegisterSystemState(statehandle: COpaquePointer?, flags: UInt): COpaquePointer?

public expect fun poRequestPowerIrp(deviceobject: COpaquePointer?, minorfunction: UByte, powerstate: PowerState, completionfunction: PrequestPowerComplete, context: COpaquePointer?, irp: COpaquePointer?): Ntstatus

public expect fun poSetDeviceBusyEx(idlepointer: COpaquePointer?)

public expect fun poSetHiberRange(memorymap: COpaquePointer?, flags: UInt, address: COpaquePointer?, length: ULong, tag: UInt)

public expect fun poSetPowerRequest(powerrequest: COpaquePointer?, type: PowerRequestType): Ntstatus

public expect fun poSetPowerState(deviceobject: COpaquePointer?, type: PowerStateType, state: PowerState): PowerState

public expect fun poSetSystemState(flags: UInt)

public expect fun poSetSystemWake(irp: COpaquePointer?)

public expect fun poSetSystemWakeDevice(deviceobject: COpaquePointer?)

public expect fun poSetThermalActiveCooling(thermalrequest: COpaquePointer?, engaged: Boolean): Ntstatus

public expect fun poSetThermalPassiveCooling(thermalrequest: COpaquePointer?, throttle: UByte): Ntstatus

public expect fun poStartDeviceBusy(idlepointer: COpaquePointer?)

public expect fun poStartNextPowerIrp(irp: COpaquePointer?)

public expect fun poUnregisterPowerSettingCallback(handle: COpaquePointer?): Ntstatus

public expect fun poUnregisterSystemState(statehandle: COpaquePointer?)

public expect fun probeForRead(address: COpaquePointer?, length: ULong, alignment: UInt)

public expect fun probeForWrite(address: COpaquePointer?, length: ULong, alignment: UInt)

public expect fun psAcquireSiloHardReference(silo: Pesilo): Ntstatus

public expect fun psAllocSiloContextSlot(reserved: ULong, returnedcontextslot: COpaquePointer?): Ntstatus

public expect fun psAllocateAffinityToken(affinitytoken: COpaquePointer?): Ntstatus

public expect fun psAttachSiloToCurrentThread(silo: Pesilo): Pesilo

public expect fun psCreateSiloContext(silo: Pesilo, size: UInt, pooltype: PoolType, contextcleanupcallback: SiloContextCleanupCallback, returnedsilocontext: COpaquePointer?): Ntstatus

public expect fun psCreateSystemThread(threadhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, processhandle: Handle, clientid: COpaquePointer?, startroutine: PkstartRoutine, startcontext: COpaquePointer?): Ntstatus

public expect fun psDereferenceSiloContext(silocontext: COpaquePointer?)

public expect fun psDetachSiloFromCurrentThread(previoussilo: Pesilo)

public expect fun psFreeAffinityToken(affinitytoken: PaffinityToken)

public expect fun psFreeSiloContextSlot(contextslot: UInt): Ntstatus

public expect fun psGetCurrentProcessId(): Handle

public expect fun psGetCurrentServerSilo(): Pesilo

public expect fun psGetCurrentServerSiloName(): COpaquePointer?

public expect fun psGetCurrentSilo(): Pesilo

public expect fun psGetCurrentThreadId(): Handle

public expect fun psGetCurrentThreadTeb(): COpaquePointer?

public expect fun psGetEffectiveServerSilo(silo: Pesilo): Pesilo

public expect fun psGetHostSilo(): Pesilo

public expect fun psGetJobServerSilo(job: Pejob, serversilo: COpaquePointer?): Ntstatus

public expect fun psGetJobSilo(job: Pejob, silo: COpaquePointer?): Ntstatus

public expect fun psGetParentSilo(job: Pejob): Pesilo

public expect fun psGetPermanentSiloContext(silo: Pesilo, contextslot: UInt, returnedsilocontext: COpaquePointer?): Ntstatus

public expect fun psGetProcessCreateTimeQuadPart(process: Peprocess): Long

public expect fun psGetProcessExitStatus(process: Peprocess): Ntstatus

public expect fun psGetProcessId(process: Peprocess): Handle

public expect fun psGetProcessStartKey(process: Peprocess): ULong

public expect fun psGetServerSiloServiceSessionId(silo: Pesilo): UInt

public expect fun psGetSiloContainerId(silo: Pesilo): COpaquePointer?

public expect fun psGetSiloContext(silo: Pesilo, contextslot: UInt, returnedsilocontext: COpaquePointer?): Ntstatus

public expect fun psGetSiloMonitorContextSlot(monitor: PsiloMonitor): UInt

public expect fun psGetThreadCreateTime(thread: Pethread): Long

public expect fun psGetThreadExitStatus(thread: Pethread): Ntstatus

public expect fun psGetThreadId(thread: Pethread): Handle

public expect fun psGetThreadProcessId(thread: Pethread): Handle

public expect fun psGetThreadProperty(thread: Pethread, key: ULong, flags: UInt): COpaquePointer?

public expect fun psGetThreadServerSilo(thread: Pethread): Pesilo

public expect fun psGetVersion(majorversion: COpaquePointer?, minorversion: COpaquePointer?, buildnumber: COpaquePointer?, csdversion: COpaquePointer?): Boolean

public expect fun psInsertPermanentSiloContext(silo: Pesilo, contextslot: UInt, silocontext: COpaquePointer?): Ntstatus

public expect fun psInsertSiloContext(silo: Pesilo, contextslot: UInt, silocontext: COpaquePointer?): Ntstatus

public expect fun psIsCurrentThreadInServerSilo(): Boolean

public expect fun psIsCurrentThreadPrefetching(): Boolean

public expect fun psIsHostSilo(silo: Pesilo): Boolean

public expect fun psMakeSiloContextPermanent(silo: Pesilo, contextslot: UInt): Ntstatus

public expect fun psQueryTotalCycleTimeProcess(process: Peprocess, cycletimestamp: COpaquePointer?): ULong

public expect fun psReferenceSiloContext(silocontext: COpaquePointer?)

public expect fun psRegisterSiloMonitor(registration: COpaquePointer?, returnedmonitor: COpaquePointer?): Ntstatus

public expect fun psReleaseSiloHardReference(silo: Pesilo)

public expect fun psRemoveCreateThreadNotifyRoutine(notifyroutine: PcreateThreadNotifyRoutine): Ntstatus

public expect fun psRemoveLoadImageNotifyRoutine(notifyroutine: PloadImageNotifyRoutine): Ntstatus

public expect fun psRemoveSiloContext(silo: Pesilo, contextslot: UInt, removedsilocontext: COpaquePointer?): Ntstatus

public expect fun psReplaceSiloContext(silo: Pesilo, contextslot: UInt, newsilocontext: COpaquePointer?, oldsilocontext: COpaquePointer?): Ntstatus

public expect fun psRevertToUserMultipleGroupAffinityThread(affinitytoken: PaffinityToken)

public expect fun psSetCreateProcessNotifyRoutine(notifyroutine: PcreateProcessNotifyRoutine, remove: Boolean): Ntstatus

public expect fun psSetCreateProcessNotifyRoutineEx(notifyroutine: PcreateProcessNotifyRoutineEx, remove: Boolean): Ntstatus

public expect fun psSetCreateProcessNotifyRoutineEx2(notifytype: Pscreateprocessnotifytype, notifyinformation: COpaquePointer?, remove: Boolean): Ntstatus

public expect fun psSetCreateThreadNotifyRoutine(notifyroutine: PcreateThreadNotifyRoutine): Ntstatus

public expect fun psSetCreateThreadNotifyRoutineEx(notifytype: Pscreatethreadnotifytype, notifyinformation: COpaquePointer?): Ntstatus

public expect fun psSetCurrentThreadPrefetching(prefetching: Boolean): Boolean

public expect fun psSetLoadImageNotifyRoutine(notifyroutine: PloadImageNotifyRoutine): Ntstatus

public expect fun psSetLoadImageNotifyRoutineEx(notifyroutine: PloadImageNotifyRoutine, flags: ULong): Ntstatus

public expect fun psSetSystemMultipleGroupAffinityThread(groupaffinities: COpaquePointer?, groupcount: UShort, affinitytoken: PaffinityToken): Ntstatus

public expect fun psStartSiloMonitor(monitor: PsiloMonitor): Ntstatus

public expect fun psTerminateServerSilo(serversilo: Pesilo, exitstatus: Ntstatus)

public expect fun psTerminateSystemThread(exitstatus: Ntstatus): Ntstatus

public expect fun psUnregisterSiloMonitor(monitor: PsiloMonitor)

public expect fun psWrapApcWow64Thread(apccontext: COpaquePointer?, apcroutine: COpaquePointer?): Ntstatus

public expect fun pshedAllocateMemory(size: UInt): COpaquePointer?

public expect fun pshedFreeMemory(address: COpaquePointer?)

public expect fun pshedIsSystemWheaEnabled(): Boolean

public expect fun pshedRegisterPlugin(packet: COpaquePointer?): Ntstatus

public expect fun pshedSynchronizeExecution(errorsource: COpaquePointer?, synchronizeroutine: PksynchronizeRoutine, synchronizecontext: COpaquePointer?): Boolean

public expect fun pshedUnregisterPlugin(pluginhandle: COpaquePointer?)

public expect fun rtlAppendUnicodeStringToString(destination: COpaquePointer?, source: COpaquePointer?): Ntstatus

public expect fun rtlAppendUnicodeToString(destination: COpaquePointer?, source: Pcwstr): Ntstatus

public expect fun rtlAreBitsClear(bitmapheader: COpaquePointer?, startingindex: UInt, length: UInt): Boolean

public expect fun rtlAreBitsSet(bitmapheader: COpaquePointer?, startingindex: UInt, length: UInt): Boolean

public expect fun rtlAssert(voidfailedassertion: COpaquePointer?, voidfilename: COpaquePointer?, linenumber: UInt, mutablemessage: Pcstr)

public expect fun rtlCheckRegistryKey(relativeto: UInt, path: Pcwstr): Ntstatus

public expect fun rtlClearAllBits(bitmapheader: COpaquePointer?)

public expect fun rtlClearBit(bitmapheader: COpaquePointer?, bitnumber: UInt)

public expect fun rtlClearBits(bitmapheader: COpaquePointer?, startingindex: UInt, numbertoclear: UInt)

public expect fun rtlCmDecodeMemIoResource(descriptor: COpaquePointer?, start: COpaquePointer?): ULong

public expect fun rtlCmEncodeMemIoResource(descriptor: COpaquePointer?, type: UByte, length: ULong, start: ULong): Ntstatus

public expect fun rtlCompareString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Int

public expect fun rtlCompareUnicodeString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Int

public expect fun rtlCompareUnicodeStrings(string1: COpaquePointer?, string1length: ULong, string2: COpaquePointer?, string2length: ULong, caseinsensitive: Boolean): Int

public expect fun rtlContractHashTable(hashtable: COpaquePointer?): Boolean

public expect fun rtlCopyBitMap(source: COpaquePointer?, destination: COpaquePointer?, targetbit: UInt)

public expect fun rtlCopyString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?)

public expect fun rtlCopyUnicodeString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?)

public expect fun rtlCreateHashTable(hashtable: COpaquePointer?, shift: UInt, flags: UInt): Boolean

public expect fun rtlCreateHashTableEx(hashtable: COpaquePointer?, initialsize: UInt, shift: UInt, flags: UInt): Boolean

public expect fun rtlCreateRegistryKey(relativeto: UInt, path: Pcwstr): Ntstatus

public expect fun rtlCreateSecurityDescriptor(securitydescriptor: PsecurityDescriptor, revision: UInt): Ntstatus

public expect fun rtlDelete(links: COpaquePointer?): COpaquePointer?

public expect fun rtlDeleteElementGenericTable(table: COpaquePointer?, buffer: COpaquePointer?): Boolean

public expect fun rtlDeleteElementGenericTableAvl(table: COpaquePointer?, buffer: COpaquePointer?): Boolean

public expect fun rtlDeleteElementGenericTableAvlEx(table: COpaquePointer?, nodeorparent: COpaquePointer?)

public expect fun rtlDeleteHashTable(hashtable: COpaquePointer?)

public expect fun rtlDeleteNoSplay(links: COpaquePointer?, root: COpaquePointer?)

public expect fun rtlDeleteRegistryValue(relativeto: UInt, path: Pcwstr, valuename: Pcwstr): Ntstatus

public expect fun rtlDowncaseUnicodeChar(sourcecharacter: UShort): UShort

public expect fun rtlEndEnumerationHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?)

public expect fun rtlEndStrongEnumerationHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?)

public expect fun rtlEndWeakEnumerationHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?)

public expect fun rtlEnumerateEntryHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?): COpaquePointer?

public expect fun rtlEnumerateGenericTable(table: COpaquePointer?, restart: Boolean): COpaquePointer?

public expect fun rtlEnumerateGenericTableAvl(table: COpaquePointer?, restart: Boolean): COpaquePointer?

public expect fun rtlEnumerateGenericTableLikeADirectory(table: COpaquePointer?, matchfunction: PrtlAvlMatchFunction, matchdata: COpaquePointer?, nextflag: UInt, restartkey: COpaquePointer?, deletecount: COpaquePointer?, buffer: COpaquePointer?): COpaquePointer?

public expect fun rtlEnumerateGenericTableWithoutSplaying(table: COpaquePointer?, restartkey: COpaquePointer?): COpaquePointer?

public expect fun rtlEnumerateGenericTableWithoutSplayingAvl(table: COpaquePointer?, restartkey: COpaquePointer?): COpaquePointer?

public expect fun rtlEqualString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Boolean

public expect fun rtlEqualUnicodeString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Boolean

public expect fun rtlExpandHashTable(hashtable: COpaquePointer?): Boolean

public expect fun rtlExtractBitMap(source: COpaquePointer?, destination: COpaquePointer?, targetbit: UInt, numberofbits: UInt)

public expect fun rtlFindClearBits(bitmapheader: COpaquePointer?, numbertofind: UInt, hintindex: UInt): UInt

public expect fun rtlFindClearBitsAndSet(bitmapheader: COpaquePointer?, numbertofind: UInt, hintindex: UInt): UInt

public expect fun rtlFindClearRuns(bitmapheader: COpaquePointer?, runarray: COpaquePointer?, sizeofrunarray: UInt, locatelongestruns: Boolean): UInt

public expect fun rtlFindClosestEncodableLength(sourcelength: ULong, targetlength: COpaquePointer?): Ntstatus

public expect fun rtlFindFirstRunClear(bitmapheader: COpaquePointer?, startingindex: COpaquePointer?): UInt

public expect fun rtlFindLastBackwardRunClear(bitmapheader: COpaquePointer?, fromindex: UInt, startingrunindex: COpaquePointer?): UInt

public expect fun rtlFindLeastSignificantBit(set: ULong): Byte

public expect fun rtlFindLongestRunClear(bitmapheader: COpaquePointer?, startingindex: COpaquePointer?): UInt

public expect fun rtlFindMostSignificantBit(set: ULong): Byte

public expect fun rtlFindNextForwardRunClear(bitmapheader: COpaquePointer?, fromindex: UInt, startingrunindex: COpaquePointer?): UInt

public expect fun rtlFindSetBits(bitmapheader: COpaquePointer?, numbertofind: UInt, hintindex: UInt): UInt

public expect fun rtlFindSetBitsAndClear(bitmapheader: COpaquePointer?, numbertofind: UInt, hintindex: UInt): UInt

public expect fun rtlFreeUTF8String(utf8string: COpaquePointer?)

public expect fun rtlGUIDFromString(guidstring: COpaquePointer?, guid: COpaquePointer?): Ntstatus

public expect fun rtlGenerateClass5Guid(namespaceguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt, guid: COpaquePointer?): Ntstatus

public expect fun rtlGetActiveConsoleId(): UInt

public expect fun rtlGetCallersAddress(callersaddress: COpaquePointer?, callerscaller: COpaquePointer?)

public expect fun rtlGetConsoleSessionForegroundProcessId(): ULong

public expect fun rtlGetElementGenericTable(table: COpaquePointer?, i: UInt): COpaquePointer?

public expect fun rtlGetElementGenericTableAvl(table: COpaquePointer?, i: UInt): COpaquePointer?

public expect fun rtlGetEnabledExtendedFeatures(featuremask: ULong): ULong

public expect fun rtlGetNextEntryHashTable(hashtable: COpaquePointer?, context: COpaquePointer?): COpaquePointer?

public expect fun rtlGetNtProductType(ntproducttype: COpaquePointer?): Boolean

public expect fun rtlGetNtSystemRoot(): Pcwstr

public expect fun rtlGetPersistedStateLocation(sourceid: Pcwstr, customvalue: Pcwstr, defaultpath: Pcwstr, statelocationtype: StateLocationType, targetpath: Pwstr, bufferlengthin: UInt, bufferlengthout: COpaquePointer?): Ntstatus

public expect fun rtlGetSuiteMask(): UInt

public expect fun rtlGetVersion(lpversioninformation: COpaquePointer?): Ntstatus

public expect fun rtlHashUnicodeString(string: COpaquePointer?, caseinsensitive: Boolean, hashalgorithm: UInt, hashvalue: COpaquePointer?): Ntstatus

public expect fun rtlInitEnumerationHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?): Boolean

public expect fun rtlInitStrongEnumerationHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?): Boolean

public expect fun rtlInitUTF8String(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?)

public expect fun rtlInitUTF8StringEx(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?): Ntstatus

public expect fun rtlInitWeakEnumerationHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?): Boolean

public expect fun rtlInitializeBitMap(bitmapheader: COpaquePointer?, bitmapbuffer: COpaquePointer?, sizeofbitmap: UInt)

public expect fun rtlInitializeGenericTable(table: COpaquePointer?, compareroutine: PrtlGenericCompareRoutine, allocateroutine: PrtlGenericAllocateRoutine, freeroutine: PrtlGenericFreeRoutine, tablecontext: COpaquePointer?)

public expect fun rtlInitializeGenericTableAvl(table: COpaquePointer?, compareroutine: PrtlAvlCompareRoutine, allocateroutine: PrtlAvlAllocateRoutine, freeroutine: PrtlAvlFreeRoutine, tablecontext: COpaquePointer?)

public expect fun rtlInsertElementGenericTable(table: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt, newelement: COpaquePointer?): COpaquePointer?

public expect fun rtlInsertElementGenericTableAvl(table: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt, newelement: COpaquePointer?): COpaquePointer?

public expect fun rtlInsertElementGenericTableFull(table: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt, newelement: COpaquePointer?, nodeorparent: COpaquePointer?, searchresult: TableSearchResult): COpaquePointer?

public expect fun rtlInsertElementGenericTableFullAvl(table: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt, newelement: COpaquePointer?, nodeorparent: COpaquePointer?, searchresult: TableSearchResult): COpaquePointer?

public expect fun rtlInsertEntryHashTable(hashtable: COpaquePointer?, entry: COpaquePointer?, signature: ULong, context: COpaquePointer?): Boolean

public expect fun rtlInt64ToUnicodeString(value: ULong, base: UInt, string: COpaquePointer?): Ntstatus

public expect fun rtlIntegerToUnicodeString(value: UInt, base: UInt, string: COpaquePointer?): Ntstatus

public expect fun rtlIoDecodeMemIoResource(descriptor: COpaquePointer?, alignment: COpaquePointer?, minimumaddress: COpaquePointer?, maximumaddress: COpaquePointer?): ULong

public expect fun rtlIoEncodeMemIoResource(descriptor: COpaquePointer?, type: UByte, length: ULong, alignment: ULong, minimumaddress: ULong, maximumaddress: ULong): Ntstatus

public expect fun rtlIsApiSetImplemented(apisetname: Pcstr): Ntstatus

public expect fun rtlIsGenericTableEmpty(table: COpaquePointer?): Boolean

public expect fun rtlIsGenericTableEmptyAvl(table: COpaquePointer?): Boolean

public expect fun rtlIsMultiSessionSku(): Boolean

public expect fun rtlIsMultiUsersInSessionSku(): Boolean

public expect fun rtlIsNtDdiVersionAvailable(version: UInt): Boolean

public expect fun rtlIsServicePackVersionInstalled(version: UInt): Boolean

public expect fun rtlIsStateSeparationEnabled(): Boolean

public expect fun rtlIsUntrustedObject(handle: Handle, obj: COpaquePointer?, untrustedobject: COpaquePointer?): Ntstatus

public expect fun rtlLengthSecurityDescriptor(securitydescriptor: PsecurityDescriptor): UInt

public expect fun rtlLookupElementGenericTable(table: COpaquePointer?, buffer: COpaquePointer?): COpaquePointer?

public expect fun rtlLookupElementGenericTableAvl(table: COpaquePointer?, buffer: COpaquePointer?): COpaquePointer?

public expect fun rtlLookupElementGenericTableFull(table: COpaquePointer?, buffer: COpaquePointer?, nodeorparent: COpaquePointer?, searchresult: COpaquePointer?): COpaquePointer?

public expect fun rtlLookupElementGenericTableFullAvl(table: COpaquePointer?, buffer: COpaquePointer?, nodeorparent: COpaquePointer?, searchresult: COpaquePointer?): COpaquePointer?

public expect fun rtlLookupEntryHashTable(hashtable: COpaquePointer?, signature: ULong, context: COpaquePointer?): COpaquePointer?

public expect fun rtlLookupFirstMatchingElementGenericTableAvl(table: COpaquePointer?, buffer: COpaquePointer?, restartkey: COpaquePointer?): COpaquePointer?

public expect fun rtlMapGenericMask(accessmask: COpaquePointer?, genericmapping: COpaquePointer?)

public expect fun rtlNormalizeSecurityDescriptor(securitydescriptor: COpaquePointer?, securitydescriptorlength: UInt, newsecuritydescriptor: COpaquePointer?, newsecuritydescriptorlength: COpaquePointer?, checkonly: Boolean): Boolean

public expect fun rtlNumberGenericTableElements(table: COpaquePointer?): UInt

public expect fun rtlNumberGenericTableElementsAvl(table: COpaquePointer?): UInt

public expect fun rtlNumberOfClearBits(bitmapheader: COpaquePointer?): UInt

public expect fun rtlNumberOfClearBitsInRange(bitmapheader: COpaquePointer?, startingindex: UInt, length: UInt): UInt

public expect fun rtlNumberOfSetBits(bitmapheader: COpaquePointer?): UInt

public expect fun rtlNumberOfSetBitsInRange(bitmapheader: COpaquePointer?, startingindex: UInt, length: UInt): UInt

public expect fun rtlNumberOfSetBitsUlongPtr(target: ULong): UInt

public expect fun rtlPrefetchMemoryNonTemporal(source: COpaquePointer?, length: ULong)

public expect fun rtlPrefixUnicodeString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Boolean

public expect fun rtlQueryRegistryValueWithFallback(primaryhandle: Handle, fallbackhandle: Handle, valuename: COpaquePointer?, valuelength: UInt, valuetype: COpaquePointer?, valuedata: COpaquePointer?, resultlength: COpaquePointer?): Ntstatus

public expect fun rtlQueryRegistryValues(relativeto: UInt, path: Pcwstr, querytable: COpaquePointer?, context: COpaquePointer?, environment: COpaquePointer?): Ntstatus

public expect fun rtlQueryValidationRunlevel(componentname: COpaquePointer?): UInt

public expect fun rtlRealPredecessor(links: COpaquePointer?): COpaquePointer?

public expect fun rtlRealSuccessor(links: COpaquePointer?): COpaquePointer?

public expect fun rtlRemoveEntryHashTable(hashtable: COpaquePointer?, entry: COpaquePointer?, context: COpaquePointer?): Boolean

public expect fun rtlRunOnceBeginInitialize(runonce: COpaquePointer?, flags: UInt, context: COpaquePointer?): Ntstatus

public expect fun rtlRunOnceComplete(runonce: COpaquePointer?, flags: UInt, context: COpaquePointer?): Ntstatus

public expect fun rtlRunOnceExecuteOnce(runonce: COpaquePointer?, initfn: PrtlRunOnceInitFn, parameter: COpaquePointer?, context: COpaquePointer?): Ntstatus

public expect fun rtlRunOnceInitialize(runonce: COpaquePointer?)

public expect fun rtlSetAllBits(bitmapheader: COpaquePointer?)

public expect fun rtlSetBit(bitmapheader: COpaquePointer?, bitnumber: UInt)

public expect fun rtlSetBits(bitmapheader: COpaquePointer?, startingindex: UInt, numbertoset: UInt)

public expect fun rtlSetDaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, daclpresent: Boolean, dacl: COpaquePointer?, dacldefaulted: Boolean): Ntstatus
