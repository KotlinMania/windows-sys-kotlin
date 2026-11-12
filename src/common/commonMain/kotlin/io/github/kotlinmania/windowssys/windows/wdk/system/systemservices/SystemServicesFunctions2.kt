package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DeviceObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DriverObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.FastMutex
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Irp
import io.github.kotlinmania.windowssys.windows.wdk.foundation.KdeviceQueue
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Kdpc
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Kevent
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Kmutant
import io.github.kotlinmania.windowssys.windows.wdk.foundation.KwaitBlock
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Mdl
import io.github.kotlinmania.windowssys.windows.wdk.foundation.ObjectAttributes
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
import io.github.kotlinmania.windowssys.windows.wdk.foundation.RtlSplayLinks
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.security.Acl
import io.github.kotlinmania.windowssys.windows.win32.security.GenericMapping
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileSegmentElement
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.TransactionNotification
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.WheaErrorSourceDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.NtProductType
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ProcessorNumber
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.TimerType
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.WaitType
import io.github.kotlinmania.windowssys.windows.win32.system.power.DevicePowerState
import io.github.kotlinmania.windowssys.windows.win32.system.power.PowerInformationLevel
import io.github.kotlinmania.windowssys.windows.win32.system.power.PowerRequestType
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.GroupAffinity
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.LogicalProcessorRelationship
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.Osversioninfow
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.SystemLogicalProcessorInformationEx
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.EnlistmentInformationClass
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.KtmobjectCursor
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.KtmobjectType
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.ResourcemanagerInformationClass
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.TransactionInformationClass
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.TransactionmanagerInformationClass
import io.github.kotlinmania.windowssys.windows.win32.system.threading.InitOnce
import io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.ClientId

public expect fun keInitializeMutex(mutex: MutPtr<Kmutant>, level: UInt)

public expect fun keInitializeSemaphore(semaphore: MutPtr<Ksemaphore>, count: Int, limit: Int)

public expect fun keInitializeSpinLock(spinlock: MutPtr<ULong>)

public expect fun keInitializeThreadedDpc(dpc: MutPtr<Kdpc>, deferredroutine: PkdeferredRoutine, deferredcontext: ConstPtr<CVoid>)

public expect fun keInitializeTimer(timer: MutPtr<Ktimer>)

public expect fun keInitializeTimerEx(timer: MutPtr<Ktimer>, type: TimerType)

public expect fun keInitializeTriageDumpDataArray(ktriagedumpdataarray: MutPtr<KtriageDumpDataArray>, size: UInt): Ntstatus

public expect fun keInsertByKeyDeviceQueue(devicequeue: MutPtr<KdeviceQueue>, devicequeueentry: MutPtr<KdeviceQueueEntry>, sortkey: UInt): Boolean

public expect fun keInsertDeviceQueue(devicequeue: MutPtr<KdeviceQueue>, devicequeueentry: MutPtr<KdeviceQueueEntry>): Boolean

public expect fun keInsertQueueDpc(dpc: MutPtr<Kdpc>, systemargument1: ConstPtr<CVoid>, systemargument2: ConstPtr<CVoid>): Boolean

public expect fun keInvalidateAllCaches(): Boolean

public expect fun keInvalidateRangeAllCaches(baseaddress: ConstPtr<CVoid>, length: UInt)

public expect fun keIpiGenericCall(broadcastfunction: PkipiBroadcastWorker, context: ULong): ULong

public expect fun keIsExecutingDpc(): UInt

public expect fun keLeaveCriticalRegion()

public expect fun keLeaveGuardedRegion()

public expect fun kePulseEvent(event: MutPtr<Kevent>, increment: Int, wait: Boolean): Int

public expect fun keQueryActiveGroupCount(): UShort

public expect fun keQueryActiveProcessorCount(activeprocessors: MutPtr<ULong>): UInt

public expect fun keQueryActiveProcessorCountEx(groupnumber: UShort): UInt

public expect fun keQueryActiveProcessors(): ULong

public expect fun keQueryAuxiliaryCounterFrequency(auxiliarycounterfrequency: MutPtr<ULong>): Ntstatus

public expect fun keQueryDpcWatchdogInformation(watchdoginformation: MutPtr<KdpcWatchdogInformation>): Ntstatus

public expect fun keQueryGroupAffinity(groupnumber: UShort): ULong

public expect fun keQueryHardwareCounterConfiguration(counterarray: MutPtr<HardwareCounter>, maximumcount: UInt, count: MutPtr<UInt>): Ntstatus

public expect fun keQueryHighestNodeNumber(): UShort

public expect fun keQueryInterruptTimePrecise(qpctimestamp: MutPtr<ULong>): ULong

public expect fun keQueryLogicalProcessorRelationship(processornumber: ConstPtr<ProcessorNumber>, relationshiptype: LogicalProcessorRelationship, information: MutPtr<SystemLogicalProcessorInformationEx>, length: MutPtr<UInt>): Ntstatus

public expect fun keQueryMaximumGroupCount(): UShort

public expect fun keQueryMaximumProcessorCount(): UInt

public expect fun keQueryMaximumProcessorCountEx(groupnumber: UShort): UInt

public expect fun keQueryNodeActiveAffinity(nodenumber: UShort, affinity: MutPtr<GroupAffinity>, count: MutPtr<UShort>)

public expect fun keQueryNodeActiveAffinity2(nodenumber: UShort, groupaffinities: MutPtr<GroupAffinity>, groupaffinitiescount: UShort, groupaffinitiesrequired: MutPtr<UShort>): Ntstatus

public expect fun keQueryNodeActiveProcessorCount(nodenumber: UShort): UInt

public expect fun keQueryNodeMaximumProcessorCount(nodenumber: UShort): UShort

public expect fun keQueryPerformanceCounter(performancefrequency: MutPtr<Long>): Long

public expect fun keQueryPriorityThread(thread: Pkthread): Int

public expect fun keQueryRuntimeThread(thread: Pkthread, usertime: MutPtr<UInt>): UInt

public expect fun keQuerySystemTimePrecise(currenttime: MutPtr<Long>)

public expect fun keQueryTimeIncrement(): UInt

public expect fun keQueryTotalCycleTimeThread(thread: Pkthread, cycletimestamp: MutPtr<ULong>): ULong

public expect fun keQueryUnbiasedInterruptTime(): ULong

public expect fun keQueryUnbiasedInterruptTimePrecise(qpctimestamp: MutPtr<ULong>): ULong

public expect fun keReadStateEvent(event: ConstPtr<Kevent>): Int

public expect fun keReadStateMutex(mutex: ConstPtr<Kmutant>): Int

public expect fun keReadStateSemaphore(semaphore: ConstPtr<Ksemaphore>): Int

public expect fun keReadStateTimer(timer: ConstPtr<Ktimer>): Boolean

public expect fun keRegisterBoundCallback(callbackroutine: PboundCallback): MutPtr<CVoid>

public expect fun keRegisterBugCheckCallback(callbackrecord: MutPtr<KbugcheckCallbackRecord>, callbackroutine: PkbugcheckCallbackRoutine, buffer: ConstPtr<CVoid>, length: UInt, component: ConstPtr<UByte>): Boolean

public expect fun keRegisterBugCheckReasonCallback(callbackrecord: MutPtr<KbugcheckReasonCallbackRecord>, callbackroutine: PkbugcheckReasonCallbackRoutine, reason: KbugcheckCallbackReason, component: ConstPtr<UByte>): Boolean

public expect fun keRegisterNmiCallback(callbackroutine: PnmiCallback, context: ConstPtr<CVoid>): MutPtr<CVoid>

public expect fun keRegisterProcessorChangeCallback(callbackfunction: PprocessorCallbackFunction, callbackcontext: ConstPtr<CVoid>, flags: UInt): MutPtr<CVoid>

public expect fun keReleaseGuardedMutex(mutex: MutPtr<FastMutex>)

public expect fun keReleaseGuardedMutexUnsafe(fastmutex: MutPtr<FastMutex>)

public expect fun keReleaseInStackQueuedSpinLock(lockhandle: ConstPtr<KlockQueueHandle>)

public expect fun keReleaseInStackQueuedSpinLockForDpc(lockhandle: ConstPtr<KlockQueueHandle>)

public expect fun keReleaseInStackQueuedSpinLockFromDpcLevel(lockhandle: ConstPtr<KlockQueueHandle>)

public expect fun keReleaseInterruptSpinLock(interrupt: Pkinterrupt, oldirql: UByte)

public expect fun keReleaseMutex(mutex: MutPtr<Kmutant>, wait: Boolean): Int

public expect fun keReleaseSemaphore(semaphore: MutPtr<Ksemaphore>, increment: Int, adjustment: Int, wait: Boolean): Int

public expect fun keReleaseSpinLockForDpc(spinlock: MutPtr<ULong>, oldirql: UByte)

public expect fun keRemoveByKeyDeviceQueue(devicequeue: MutPtr<KdeviceQueue>, sortkey: UInt): MutPtr<KdeviceQueueEntry>

public expect fun keRemoveByKeyDeviceQueueIfBusy(devicequeue: MutPtr<KdeviceQueue>, sortkey: UInt): MutPtr<KdeviceQueueEntry>

public expect fun keRemoveDeviceQueue(devicequeue: MutPtr<KdeviceQueue>): MutPtr<KdeviceQueueEntry>

public expect fun keRemoveEntryDeviceQueue(devicequeue: MutPtr<KdeviceQueue>, devicequeueentry: MutPtr<KdeviceQueueEntry>): Boolean

public expect fun keRemoveQueueDpc(dpc: MutPtr<Kdpc>): Boolean

public expect fun keRemoveQueueDpcEx(dpc: MutPtr<Kdpc>, waitifactive: Boolean): Boolean

public expect fun keResetEvent(event: MutPtr<Kevent>): Int

public expect fun keRestoreExtendedProcessorState(xstatesave: ConstPtr<XstateSave>)

public expect fun keRevertToUserAffinityThread()

public expect fun keRevertToUserAffinityThreadEx(affinity: ULong)

public expect fun keRevertToUserGroupAffinityThread(previousaffinity: ConstPtr<GroupAffinity>)

public expect fun keSaveExtendedProcessorState(mask: ULong, xstatesave: MutPtr<XstateSave>): Ntstatus

public expect fun keSetBasePriorityThread(thread: Pkthread, increment: Int): Int

public expect fun keSetCoalescableTimer(timer: MutPtr<Ktimer>, duetime: Long, period: UInt, tolerabledelay: UInt, dpc: ConstPtr<Kdpc>): Boolean

public expect fun keSetEvent(event: MutPtr<Kevent>, increment: Int, wait: Boolean): Int

public expect fun keSetHardwareCounterConfiguration(counterarray: ConstPtr<HardwareCounter>, count: UInt): Ntstatus

public expect fun keSetImportanceDpc(dpc: MutPtr<Kdpc>, importance: KdpcImportance)

public expect fun keSetPriorityThread(thread: Pkthread, priority: Int): Int

public expect fun keSetSystemAffinityThread(affinity: ULong)

public expect fun keSetSystemAffinityThreadEx(affinity: ULong): ULong

public expect fun keSetSystemGroupAffinityThread(affinity: ConstPtr<GroupAffinity>, previousaffinity: MutPtr<GroupAffinity>)

public expect fun keSetTargetProcessorDpc(dpc: MutPtr<Kdpc>, number: Byte)

public expect fun keSetTargetProcessorDpcEx(dpc: MutPtr<Kdpc>, procnumber: ConstPtr<ProcessorNumber>): Ntstatus

public expect fun keSetTimer(timer: MutPtr<Ktimer>, duetime: Long, dpc: ConstPtr<Kdpc>): Boolean

public expect fun keSetTimerEx(timer: MutPtr<Ktimer>, duetime: Long, period: Int, dpc: ConstPtr<Kdpc>): Boolean

public expect fun keShouldYieldProcessor(): UInt

public expect fun keStallExecutionProcessor(microseconds: UInt)

public expect fun keSynchronizeExecution(interrupt: Pkinterrupt, synchronizeroutine: PksynchronizeRoutine, synchronizecontext: ConstPtr<CVoid>): Boolean

public expect fun keTestSpinLock(spinlock: ConstPtr<ULong>): Boolean

public expect fun keTryToAcquireGuardedMutex(mutex: MutPtr<FastMutex>): Boolean

public expect fun keTryToAcquireSpinLockAtDpcLevel(spinlock: MutPtr<ULong>): Boolean

public expect fun keWaitForMultipleObjects(count: UInt, obj: ConstPtr<ConstPtr<CVoid>>, waittype: WaitType, waitreason: KwaitReason, waitmode: Byte, alertable: Boolean, timeout: ConstPtr<Long>, waitblockarray: MutPtr<KwaitBlock>): Ntstatus

public expect fun keWaitForSingleObject(obj: ConstPtr<CVoid>, waitreason: KwaitReason, waitmode: Byte, alertable: Boolean, timeout: ConstPtr<Long>): Ntstatus

public expect fun kfRaiseIrql(newirql: UByte): UByte

public expect fun mmAddPhysicalMemory(startaddress: ConstPtr<Long>, numberofbytes: MutPtr<Long>): Ntstatus

public expect fun mmAddVerifierSpecialThunks(entryroutine: ULong, thunkbuffer: ConstPtr<CVoid>, thunkbuffersize: UInt): Ntstatus

public expect fun mmAddVerifierThunks(thunkbuffer: ConstPtr<CVoid>, thunkbuffersize: UInt): Ntstatus

public expect fun mmAdvanceMdl(mdl: MutPtr<Mdl>, numberofbytes: UInt): Ntstatus

public expect fun mmAllocateContiguousMemory(numberofbytes: ULong, highestacceptableaddress: Long): MutPtr<CVoid>

public expect fun mmAllocateContiguousMemoryEx(numberofbytes: ConstPtr<ULong>, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, preferrednode: UInt, protect: UInt, partitionobject: ConstPtr<CVoid>, tag: UInt, flags: UInt, baseaddress: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun mmAllocateContiguousMemorySpecifyCache(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MemoryCachingType): MutPtr<CVoid>

public expect fun mmAllocateContiguousMemorySpecifyCacheNode(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MemoryCachingType, preferrednode: UInt): MutPtr<CVoid>

public expect fun mmAllocateContiguousNodeMemory(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, protect: UInt, preferrednode: UInt): MutPtr<CVoid>

public expect fun mmAllocateMappingAddress(numberofbytes: ULong, pooltag: UInt): MutPtr<CVoid>

public expect fun mmAllocateMappingAddressEx(numberofbytes: ULong, pooltag: UInt, flags: UInt): MutPtr<CVoid>

public expect fun mmAllocateMdlForIoSpace(physicaladdresslist: ConstPtr<MmPhysicalAddressList>, numberofentries: ULong, newmdl: MutPtr<MutPtr<Mdl>>): Ntstatus

public expect fun mmAllocateNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, idealnode: UInt, flags: UInt): MutPtr<Mdl>

public expect fun mmAllocateNonCachedMemory(numberofbytes: ULong): MutPtr<CVoid>

public expect fun mmAllocatePagesForMdl(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong): MutPtr<Mdl>

public expect fun mmAllocatePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, flags: UInt): MutPtr<Mdl>

public expect fun mmAllocatePartitionNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, idealnode: UInt, flags: UInt, partitionobject: ConstPtr<CVoid>): MutPtr<Mdl>

public expect fun mmAreMdlPagesCached(memorydescriptorlist: ConstPtr<Mdl>): UInt

public expect fun mmBuildMdlForNonPagedPool(memorydescriptorlist: MutPtr<Mdl>)

public expect fun mmCopyMemory(targetaddress: ConstPtr<CVoid>, sourceaddress: MmCopyAddress, numberofbytes: ULong, flags: UInt, numberofbytestransferred: MutPtr<ULong>): Ntstatus

public expect fun mmCreateMdl(memorydescriptorlist: MutPtr<Mdl>, base: ConstPtr<CVoid>, length: ULong): MutPtr<Mdl>

public expect fun mmCreateMirror(): Ntstatus

public expect fun mmFreeContiguousMemory(baseaddress: ConstPtr<CVoid>)

public expect fun mmFreeContiguousMemorySpecifyCache(baseaddress: ConstPtr<CVoid>, numberofbytes: ULong, cachetype: MemoryCachingType)

public expect fun mmFreeMappingAddress(baseaddress: ConstPtr<CVoid>, pooltag: UInt)

public expect fun mmFreeNonCachedMemory(baseaddress: ConstPtr<CVoid>, numberofbytes: ULong)

public expect fun mmFreePagesFromMdl(memorydescriptorlist: MutPtr<Mdl>)

public expect fun mmFreePagesFromMdlEx(memorydescriptorlist: MutPtr<Mdl>, flags: UInt)

public expect fun mmGetCacheAttribute(physicaladdress: Long, cachetype: MutPtr<MemoryCachingType>): Ntstatus

public expect fun mmGetCacheAttributeEx(physicaladdress: Long, flags: UInt, cachetype: MutPtr<MemoryCachingType>): Ntstatus

public expect fun mmGetPhysicalAddress(baseaddress: ConstPtr<CVoid>): Long

public expect fun mmGetPhysicalMemoryRanges(): MutPtr<PhysicalMemoryRange>

public expect fun mmGetPhysicalMemoryRangesEx(partitionobject: ConstPtr<CVoid>): MutPtr<PhysicalMemoryRange>

public expect fun mmGetPhysicalMemoryRangesEx2(partitionobject: ConstPtr<CVoid>, flags: UInt): MutPtr<PhysicalMemoryRange>

public expect fun mmGetSystemRoutineAddress(systemroutinename: ConstPtr<UnicodeString>): MutPtr<CVoid>

public expect fun mmGetVirtualForPhysical(physicaladdress: Long): MutPtr<CVoid>

public expect fun mmIsAddressValid(virtualaddress: ConstPtr<CVoid>): Boolean

public expect fun mmIsDriverSuspectForVerifier(driverobject: ConstPtr<DriverObject>): UInt

public expect fun mmIsDriverVerifying(driverobject: ConstPtr<DriverObject>): UInt

public expect fun mmIsDriverVerifyingByAddress(addresswithinsection: ConstPtr<CVoid>): UInt

public expect fun mmIsIoSpaceActive(startaddress: Long, numberofbytes: ULong): UInt

public expect fun mmIsNonPagedSystemAddressValid(virtualaddress: ConstPtr<CVoid>): Boolean

public expect fun mmIsThisAnNtAsSystem(): Boolean

public expect fun mmIsVerifierEnabled(verifierflags: MutPtr<UInt>): Ntstatus

public expect fun mmLockPagableDataSection(addresswithinsection: ConstPtr<CVoid>): MutPtr<CVoid>

public expect fun mmLockPagableSectionByHandle(imagesectionhandle: ConstPtr<CVoid>)

public expect fun mmMapIoSpace(physicaladdress: Long, numberofbytes: ULong, cachetype: MemoryCachingType): MutPtr<CVoid>

public expect fun mmMapIoSpaceEx(physicaladdress: Long, numberofbytes: ULong, protect: UInt): MutPtr<CVoid>

public expect fun mmMapLockedPages(memorydescriptorlist: MutPtr<Mdl>, accessmode: Byte): MutPtr<CVoid>

public expect fun mmMapLockedPagesSpecifyCache(memorydescriptorlist: MutPtr<Mdl>, accessmode: Byte, cachetype: MemoryCachingType, requestedaddress: ConstPtr<CVoid>, bugcheckonfailure: UInt, priority: UInt): MutPtr<CVoid>

public expect fun mmMapLockedPagesWithReservedMapping(mappingaddress: ConstPtr<CVoid>, pooltag: UInt, memorydescriptorlist: MutPtr<Mdl>, cachetype: MemoryCachingType): MutPtr<CVoid>

public expect fun mmMapMdl(memorydescriptorlist: MutPtr<Mdl>, protection: UInt, driverroutine: PmmMdlRoutine, drivercontext: ConstPtr<CVoid>): Ntstatus

public expect fun mmMapMemoryDumpMdlEx(va: ConstPtr<CVoid>, pagetotal: UInt, memorydumpmdl: MutPtr<Mdl>, flags: UInt): Ntstatus

public expect fun mmMapUserAddressesToPage(baseaddress: ConstPtr<CVoid>, numberofbytes: ULong, pageaddress: ConstPtr<CVoid>): Ntstatus

public expect fun mmMapVideoDisplay(physicaladdress: Long, numberofbytes: ULong, cachetype: MemoryCachingType): MutPtr<CVoid>

public expect fun mmMapViewInSessionSpace(section: ConstPtr<CVoid>, mappedbase: MutPtr<MutPtr<CVoid>>, viewsize: MutPtr<ULong>): Ntstatus

public expect fun mmMapViewInSessionSpaceEx(section: ConstPtr<CVoid>, mappedbase: MutPtr<MutPtr<CVoid>>, viewsize: MutPtr<ULong>, sectionoffset: MutPtr<Long>, flags: ULong): Ntstatus

public expect fun mmMapViewInSystemSpace(section: ConstPtr<CVoid>, mappedbase: MutPtr<MutPtr<CVoid>>, viewsize: MutPtr<ULong>): Ntstatus

public expect fun mmMapViewInSystemSpaceEx(section: ConstPtr<CVoid>, mappedbase: MutPtr<MutPtr<CVoid>>, viewsize: MutPtr<ULong>, sectionoffset: MutPtr<Long>, flags: ULong): Ntstatus

public expect fun mmMdlPageContentsState(memorydescriptorlist: MutPtr<Mdl>, state: MmMdlPageContentsState): MmMdlPageContentsState

public expect fun mmPageEntireDriver(addresswithinsection: ConstPtr<CVoid>): MutPtr<CVoid>

public expect fun mmProbeAndLockPages(memorydescriptorlist: MutPtr<Mdl>, accessmode: Byte, operation: LockOperation)

public expect fun mmProbeAndLockProcessPages(memorydescriptorlist: MutPtr<Mdl>, process: Peprocess, accessmode: Byte, operation: LockOperation)

public expect fun mmProbeAndLockSelectedPages(memorydescriptorlist: MutPtr<Mdl>, segmentarray: ConstPtr<FileSegmentElement>, accessmode: Byte, operation: LockOperation)

public expect fun mmProtectDriverSection(addresswithinsection: ConstPtr<CVoid>, size: ULong, flags: UInt): Ntstatus

public expect fun mmProtectMdlSystemAddress(memorydescriptorlist: ConstPtr<Mdl>, newprotect: UInt): Ntstatus

public expect fun mmQuerySystemSize(): MmSystemsize

public expect fun mmRemovePhysicalMemory(startaddress: ConstPtr<Long>, numberofbytes: MutPtr<Long>): Ntstatus

public expect fun mmResetDriverPaging(addresswithinsection: ConstPtr<CVoid>)

public expect fun mmRotatePhysicalView(virtualaddress: ConstPtr<CVoid>, numberofbytes: MutPtr<ULong>, newmdl: ConstPtr<Mdl>, direction: MmRotateDirection, copyfunction: PmmRotateCopyCallbackFunction, context: ConstPtr<CVoid>): Ntstatus

public expect fun mmSecureVirtualMemory(address: ConstPtr<CVoid>, size: ULong, probemode: UInt): Handle

public expect fun mmSecureVirtualMemoryEx(address: ConstPtr<CVoid>, size: ULong, probemode: UInt, flags: UInt): Handle

public expect fun mmSetPermanentCacheAttribute(startaddress: Long, numberofbytes: Long, cachetype: MemoryCachingType, flags: UInt): Ntstatus

public expect fun mmSizeOfMdl(base: ConstPtr<CVoid>, length: ULong): ULong

public expect fun mmUnlockPagableImageSection(imagesectionhandle: ConstPtr<CVoid>)

public expect fun mmUnlockPages(memorydescriptorlist: MutPtr<Mdl>)

public expect fun mmUnmapIoSpace(baseaddress: ConstPtr<CVoid>, numberofbytes: ULong)

public expect fun mmUnmapLockedPages(baseaddress: ConstPtr<CVoid>, memorydescriptorlist: MutPtr<Mdl>)

public expect fun mmUnmapReservedMapping(baseaddress: ConstPtr<CVoid>, pooltag: UInt, memorydescriptorlist: MutPtr<Mdl>)

public expect fun mmUnmapVideoDisplay(baseaddress: ConstPtr<CVoid>, numberofbytes: ULong)

public expect fun mmUnmapViewInSessionSpace(mappedbase: ConstPtr<CVoid>): Ntstatus

public expect fun mmUnmapViewInSystemSpace(mappedbase: ConstPtr<CVoid>): Ntstatus

public expect fun mmUnsecureVirtualMemory(securehandle: Handle)

public expect fun ntAllocateLocallyUniqueId(luid: MutPtr<Luid>): Ntstatus

public expect fun ntCommitComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun ntCommitEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun ntCommitTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus

public expect fun ntCreateEnlistment(enlistmenthandle: MutPtr<Handle>, desiredaccess: UInt, resourcemanagerhandle: Handle, transactionhandle: Handle, objectattributes: ConstPtr<ObjectAttributes>, createoptions: UInt, notificationmask: UInt, enlistmentkey: ConstPtr<CVoid>): Ntstatus

public expect fun ntCreateResourceManager(resourcemanagerhandle: MutPtr<Handle>, desiredaccess: UInt, tmhandle: Handle, rmguid: ConstPtr<Guid>, objectattributes: ConstPtr<ObjectAttributes>, createoptions: UInt, description: ConstPtr<UnicodeString>): Ntstatus

public expect fun ntCreateTransaction(transactionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, uow: ConstPtr<Guid>, tmhandle: Handle, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: ConstPtr<Long>, description: ConstPtr<UnicodeString>): Ntstatus

public expect fun ntCreateTransactionManager(tmhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, logfilename: ConstPtr<UnicodeString>, createoptions: UInt, commitstrength: UInt): Ntstatus

public expect fun ntDisplayString(string: ConstPtr<UnicodeString>): Ntstatus

public expect fun ntEnumerateTransactionObject(rootobjecthandle: Handle, querytype: KtmobjectType, objectcursor: MutPtr<KtmobjectCursor>, objectcursorlength: UInt, returnlength: MutPtr<UInt>): Ntstatus

public expect fun ntGetNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: MutPtr<TransactionNotification>, notificationlength: UInt, timeout: ConstPtr<Long>, returnlength: MutPtr<UInt>, asynchronous: UInt, asynchronouscontext: ULong): Ntstatus

public expect fun ntLoadDriver(driverservicename: ConstPtr<UnicodeString>): Ntstatus

public expect fun ntMakeTemporaryObject(handle: Handle): Ntstatus

public expect fun ntManagePartition(targethandle: Handle, sourcehandle: Handle, partitioninformationclass: PartitionInformationClass, partitioninformation: MutPtr<CVoid>, partitioninformationlength: UInt): Ntstatus

public expect fun ntOpenEnlistment(enlistmenthandle: MutPtr<Handle>, desiredaccess: UInt, resourcemanagerhandle: Handle, enlistmentguid: ConstPtr<Guid>, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus

public expect fun ntOpenResourceManager(resourcemanagerhandle: MutPtr<Handle>, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: ConstPtr<Guid>, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus

public expect fun ntOpenTransaction(transactionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, uow: ConstPtr<Guid>, tmhandle: Handle): Ntstatus

public expect fun ntOpenTransactionManager(tmhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, logfilename: ConstPtr<UnicodeString>, tmidentity: ConstPtr<Guid>, openoptions: UInt): Ntstatus

public expect fun ntPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt): Ntstatus

public expect fun ntPrePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun ntPrePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun ntPrepareComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun ntPrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun ntPropagationComplete(resourcemanagerhandle: Handle, requestcookie: UInt, bufferlength: UInt, buffer: ConstPtr<CVoid>): Ntstatus

public expect fun ntPropagationFailed(resourcemanagerhandle: Handle, requestcookie: UInt, propstatus: Ntstatus): Ntstatus

public expect fun ntQueryInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: MutPtr<CVoid>, enlistmentinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus

public expect fun ntQueryInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: MutPtr<CVoid>, resourcemanagerinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus

public expect fun ntQueryInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: MutPtr<CVoid>, transactioninformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus

public expect fun ntQueryInformationTransactionManager(transactionmanagerhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: MutPtr<CVoid>, transactionmanagerinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus

public expect fun ntReadOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun ntRecoverEnlistment(enlistmenthandle: Handle, enlistmentkey: ConstPtr<CVoid>): Ntstatus

public expect fun ntRecoverResourceManager(resourcemanagerhandle: Handle): Ntstatus

public expect fun ntRecoverTransactionManager(transactionmanagerhandle: Handle): Ntstatus

public expect fun ntRegisterProtocolAddressInformation(resourcemanager: Handle, protocolid: ConstPtr<Guid>, protocolinformationsize: UInt, protocolinformation: ConstPtr<CVoid>, createoptions: UInt): Ntstatus

public expect fun ntRenameTransactionManager(logfilename: ConstPtr<UnicodeString>, existingtransactionmanagerguid: ConstPtr<Guid>): Ntstatus

public expect fun ntRollbackComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun ntRollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun ntRollbackTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus

public expect fun ntRollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun ntSetInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: ConstPtr<CVoid>, enlistmentinformationlength: UInt): Ntstatus

public expect fun ntSetInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: ConstPtr<CVoid>, resourcemanagerinformationlength: UInt): Ntstatus

public expect fun ntSetInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: ConstPtr<CVoid>, transactioninformationlength: UInt): Ntstatus

public expect fun ntSetInformationTransactionManager(tmhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: ConstPtr<CVoid>, transactionmanagerinformationlength: UInt): Ntstatus

public expect fun ntSinglePhaseReject(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun ntUnloadDriver(driverservicename: ConstPtr<UnicodeString>): Ntstatus

public expect fun obCloseHandle(handle: Handle, previousmode: Byte): Ntstatus

public expect fun obDereferenceObjectDeferDelete(obj: ConstPtr<CVoid>)

public expect fun obDereferenceObjectDeferDeleteWithTag(obj: ConstPtr<CVoid>, tag: UInt)

public expect fun obGetFilterVersion(): UShort

public expect fun obGetObjectSecurity(obj: ConstPtr<CVoid>, securitydescriptor: MutPtr<PsecurityDescriptor>, memoryallocated: MutPtr<Boolean>): Ntstatus

public expect fun obReferenceObjectByHandle(handle: Handle, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, obj: MutPtr<MutPtr<CVoid>>, handleinformation: MutPtr<ObjectHandleInformation>): Ntstatus

public expect fun obReferenceObjectByHandleWithTag(handle: Handle, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt, obj: MutPtr<MutPtr<CVoid>>, handleinformation: MutPtr<ObjectHandleInformation>): Ntstatus

public expect fun obReferenceObjectByPointer(obj: ConstPtr<CVoid>, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte): Ntstatus

public expect fun obReferenceObjectByPointerWithTag(obj: ConstPtr<CVoid>, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt): Ntstatus

public expect fun obReferenceObjectSafe(obj: ConstPtr<CVoid>): Boolean

public expect fun obReferenceObjectSafeWithTag(obj: ConstPtr<CVoid>, tag: UInt): Boolean

public expect fun obRegisterCallbacks(callbackregistration: ConstPtr<ObCallbackRegistration>, registrationhandle: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun obReleaseObjectSecurity(securitydescriptor: PsecurityDescriptor, memoryallocated: Boolean)

public expect fun obUnRegisterCallbacks(registrationhandle: ConstPtr<CVoid>)

public expect fun obfDereferenceObject(obj: ConstPtr<CVoid>): Long

public expect fun obfDereferenceObjectWithTag(obj: ConstPtr<CVoid>, tag: UInt): Long

public expect fun obfReferenceObject(obj: ConstPtr<CVoid>): Long

public expect fun obfReferenceObjectWithTag(obj: ConstPtr<CVoid>, tag: UInt): Long

public expect fun pcwAddInstance(buffer: PpcwBuffer, name: ConstPtr<UnicodeString>, id: UInt, count: UInt, data: ConstPtr<PcwData>): Ntstatus

public expect fun pcwCloseInstance(instance: PpcwInstance)

public expect fun pcwCreateInstance(instance: MutPtr<PpcwInstance>, registration: PpcwRegistration, name: ConstPtr<UnicodeString>, count: UInt, data: ConstPtr<PcwData>): Ntstatus

public expect fun pcwRegister(registration: MutPtr<PpcwRegistration>, info: ConstPtr<PcwRegistrationInformation>): Ntstatus

public expect fun pcwUnregister(registration: PpcwRegistration)

public expect fun poCallDriver(deviceobject: ConstPtr<DeviceObject>, irp: MutPtr<Irp>): Ntstatus

public expect fun poClearPowerRequest(powerrequest: MutPtr<CVoid>, type: PowerRequestType): Ntstatus

public expect fun poCreatePowerRequest(powerrequest: MutPtr<MutPtr<CVoid>>, deviceobject: ConstPtr<DeviceObject>, context: ConstPtr<CountedReasonContext>): Ntstatus

public expect fun poCreateThermalRequest(thermalrequest: MutPtr<MutPtr<CVoid>>, targetdeviceobject: ConstPtr<DeviceObject>, policydeviceobject: ConstPtr<DeviceObject>, context: ConstPtr<CountedReasonContext>, flags: UInt): Ntstatus

public expect fun poDeletePowerRequest(powerrequest: MutPtr<CVoid>)

public expect fun poDeleteThermalRequest(thermalrequest: MutPtr<CVoid>)

public expect fun poEndDeviceBusy(idlepointer: MutPtr<UInt>)

public expect fun poFxActivateComponent(handle: Pohandle, component: UInt, flags: UInt)

public expect fun poFxCompleteDevicePowerNotRequired(handle: Pohandle)

public expect fun poFxCompleteDirectedPowerDown(handle: Pohandle)

public expect fun poFxCompleteIdleCondition(handle: Pohandle, component: UInt)

public expect fun poFxCompleteIdleState(handle: Pohandle, component: UInt)

public expect fun poFxIdleComponent(handle: Pohandle, component: UInt, flags: UInt)

public expect fun poFxIssueComponentPerfStateChange(handle: Pohandle, flags: UInt, component: UInt, perfchange: ConstPtr<PoFxPerfStateChange>, context: ConstPtr<CVoid>)

public expect fun poFxIssueComponentPerfStateChangeMultiple(handle: Pohandle, flags: UInt, component: UInt, perfchangescount: UInt, perfchanges: ConstPtr<PoFxPerfStateChange>, context: ConstPtr<CVoid>)

public expect fun poFxNotifySurprisePowerOn(pdo: ConstPtr<DeviceObject>)

public expect fun poFxPowerControl(handle: Pohandle, powercontrolcode: ConstPtr<Guid>, inbuffer: ConstPtr<CVoid>, inbuffersize: ULong, outbuffer: MutPtr<CVoid>, outbuffersize: ULong, bytesreturned: MutPtr<ULong>): Ntstatus

public expect fun poFxPowerOnCrashdumpDevice(handle: Pohandle, context: ConstPtr<CVoid>): Ntstatus

public expect fun poFxQueryCurrentComponentPerfState(handle: Pohandle, flags: UInt, component: UInt, setindex: UInt, currentperf: MutPtr<ULong>): Ntstatus

public expect fun poFxRegisterComponentPerfStates(handle: Pohandle, component: UInt, flags: ULong, componentperfstatecallback: PpoFxComponentPerfStateCallback, inputstateinfo: ConstPtr<PoFxComponentPerfInfo>, outputstateinfo: MutPtr<MutPtr<PoFxComponentPerfInfo>>): Ntstatus

public expect fun poFxRegisterCrashdumpDevice(handle: Pohandle): Ntstatus

public expect fun poFxRegisterDevice(pdo: ConstPtr<DeviceObject>, device: ConstPtr<PoFxDeviceV1>, handle: MutPtr<Pohandle>): Ntstatus

public expect fun poFxRegisterDripsWatchdogCallback(handle: Pohandle, callback: PpoFxDripsWatchdogCallback, includechilddevices: Boolean, matchingdriverobject: ConstPtr<DriverObject>)

public expect fun poFxReportDevicePoweredOn(handle: Pohandle)

public expect fun poFxSetComponentLatency(handle: Pohandle, component: UInt, latency: ULong)

public expect fun poFxSetComponentResidency(handle: Pohandle, component: UInt, residency: ULong)

public expect fun poFxSetComponentWake(handle: Pohandle, component: UInt, wakehint: Boolean)

public expect fun poFxSetDeviceIdleTimeout(handle: Pohandle, idletimeout: ULong)

public expect fun poFxSetTargetDripsDevicePowerState(handle: Pohandle, targetstate: DevicePowerState): Ntstatus

public expect fun poFxStartDevicePowerManagement(handle: Pohandle)

public expect fun poFxUnregisterDevice(handle: Pohandle)

public expect fun poGetSystemWake(irp: ConstPtr<Irp>): Boolean

public expect fun poGetThermalRequestSupport(thermalrequest: ConstPtr<CVoid>, type: PoThermalRequestType): Boolean

public expect fun poQueryWatchdogTime(pdo: ConstPtr<DeviceObject>, secondsremaining: MutPtr<UInt>): Boolean

public expect fun poRegisterDeviceForIdleDetection(deviceobject: ConstPtr<DeviceObject>, conservationidletime: UInt, performanceidletime: UInt, state: DevicePowerState): MutPtr<UInt>

public expect fun poRegisterPowerSettingCallback(deviceobject: ConstPtr<DeviceObject>, settingguid: ConstPtr<Guid>, callback: PpowerSettingCallback, context: ConstPtr<CVoid>, handle: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun poRegisterSystemState(statehandle: MutPtr<CVoid>, flags: UInt): MutPtr<CVoid>

public expect fun poRequestPowerIrp(deviceobject: ConstPtr<DeviceObject>, minorfunction: UByte, powerstate: PowerState, completionfunction: PrequestPowerComplete, context: ConstPtr<CVoid>, irp: MutPtr<MutPtr<Irp>>): Ntstatus

public expect fun poSetDeviceBusyEx(idlepointer: MutPtr<UInt>)

public expect fun poSetHiberRange(memorymap: ConstPtr<CVoid>, flags: UInt, address: ConstPtr<CVoid>, length: ULong, tag: UInt)

public expect fun poSetPowerRequest(powerrequest: MutPtr<CVoid>, type: PowerRequestType): Ntstatus

public expect fun poSetPowerState(deviceobject: ConstPtr<DeviceObject>, type: PowerStateType, state: PowerState): PowerState

public expect fun poSetSystemState(flags: UInt)

public expect fun poSetSystemWake(irp: MutPtr<Irp>)

public expect fun poSetSystemWakeDevice(deviceobject: ConstPtr<DeviceObject>)

public expect fun poSetThermalActiveCooling(thermalrequest: MutPtr<CVoid>, engaged: Boolean): Ntstatus

public expect fun poSetThermalPassiveCooling(thermalrequest: MutPtr<CVoid>, throttle: UByte): Ntstatus

public expect fun poStartDeviceBusy(idlepointer: MutPtr<UInt>)

public expect fun poStartNextPowerIrp(irp: MutPtr<Irp>)

public expect fun poUnregisterPowerSettingCallback(handle: MutPtr<CVoid>): Ntstatus

public expect fun poUnregisterSystemState(statehandle: MutPtr<CVoid>)

public expect fun probeForRead(address: ConstPtr<CVoid>, length: ULong, alignment: UInt)

public expect fun probeForWrite(address: MutPtr<CVoid>, length: ULong, alignment: UInt)

public expect fun psAcquireSiloHardReference(silo: Pesilo): Ntstatus

public expect fun psAllocSiloContextSlot(reserved: ULong, returnedcontextslot: MutPtr<UInt>): Ntstatus

public expect fun psAllocateAffinityToken(affinitytoken: MutPtr<PaffinityToken>): Ntstatus

public expect fun psAttachSiloToCurrentThread(silo: Pesilo): Pesilo

public expect fun psCreateSiloContext(silo: Pesilo, size: UInt, pooltype: PoolType, contextcleanupcallback: SiloContextCleanupCallback, returnedsilocontext: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun psCreateSystemThread(threadhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, processhandle: Handle, clientid: MutPtr<ClientId>, startroutine: PkstartRoutine, startcontext: ConstPtr<CVoid>): Ntstatus

public expect fun psDereferenceSiloContext(silocontext: ConstPtr<CVoid>)

public expect fun psDetachSiloFromCurrentThread(previoussilo: Pesilo)

public expect fun psFreeAffinityToken(affinitytoken: PaffinityToken)

public expect fun psFreeSiloContextSlot(contextslot: UInt): Ntstatus

public expect fun psGetCurrentProcessId(): Handle

public expect fun psGetCurrentServerSilo(): Pesilo

public expect fun psGetCurrentServerSiloName(): MutPtr<UnicodeString>

public expect fun psGetCurrentSilo(): Pesilo

public expect fun psGetCurrentThreadId(): Handle

public expect fun psGetCurrentThreadTeb(): MutPtr<CVoid>

public expect fun psGetEffectiveServerSilo(silo: Pesilo): Pesilo

public expect fun psGetHostSilo(): Pesilo

public expect fun psGetJobServerSilo(job: Pejob, serversilo: MutPtr<Pesilo>): Ntstatus

public expect fun psGetJobSilo(job: Pejob, silo: MutPtr<Pesilo>): Ntstatus

public expect fun psGetParentSilo(job: Pejob): Pesilo

public expect fun psGetPermanentSiloContext(silo: Pesilo, contextslot: UInt, returnedsilocontext: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun psGetProcessCreateTimeQuadPart(process: Peprocess): Long

public expect fun psGetProcessExitStatus(process: Peprocess): Ntstatus

public expect fun psGetProcessId(process: Peprocess): Handle

public expect fun psGetProcessStartKey(process: Peprocess): ULong

public expect fun psGetServerSiloServiceSessionId(silo: Pesilo): UInt

public expect fun psGetSiloContainerId(silo: Pesilo): MutPtr<Guid>

public expect fun psGetSiloContext(silo: Pesilo, contextslot: UInt, returnedsilocontext: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun psGetSiloMonitorContextSlot(monitor: PsiloMonitor): UInt

public expect fun psGetThreadCreateTime(thread: Pethread): Long

public expect fun psGetThreadExitStatus(thread: Pethread): Ntstatus

public expect fun psGetThreadId(thread: Pethread): Handle

public expect fun psGetThreadProcessId(thread: Pethread): Handle

public expect fun psGetThreadProperty(thread: Pethread, key: ULong, flags: UInt): MutPtr<CVoid>

public expect fun psGetThreadServerSilo(thread: Pethread): Pesilo

public expect fun psGetVersion(majorversion: MutPtr<UInt>, minorversion: MutPtr<UInt>, buildnumber: MutPtr<UInt>, csdversion: MutPtr<UnicodeString>): Boolean

public expect fun psInsertPermanentSiloContext(silo: Pesilo, contextslot: UInt, silocontext: ConstPtr<CVoid>): Ntstatus

public expect fun psInsertSiloContext(silo: Pesilo, contextslot: UInt, silocontext: ConstPtr<CVoid>): Ntstatus

public expect fun psIsCurrentThreadInServerSilo(): Boolean

public expect fun psIsCurrentThreadPrefetching(): Boolean

public expect fun psIsHostSilo(silo: Pesilo): Boolean

public expect fun psMakeSiloContextPermanent(silo: Pesilo, contextslot: UInt): Ntstatus

public expect fun psQueryTotalCycleTimeProcess(process: Peprocess, cycletimestamp: MutPtr<ULong>): ULong

public expect fun psReferenceSiloContext(silocontext: ConstPtr<CVoid>)

public expect fun psRegisterSiloMonitor(registration: ConstPtr<SiloMonitorRegistration>, returnedmonitor: MutPtr<PsiloMonitor>): Ntstatus

public expect fun psReleaseSiloHardReference(silo: Pesilo)

public expect fun psRemoveCreateThreadNotifyRoutine(notifyroutine: PcreateThreadNotifyRoutine): Ntstatus

public expect fun psRemoveLoadImageNotifyRoutine(notifyroutine: PloadImageNotifyRoutine): Ntstatus

public expect fun psRemoveSiloContext(silo: Pesilo, contextslot: UInt, removedsilocontext: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun psReplaceSiloContext(silo: Pesilo, contextslot: UInt, newsilocontext: ConstPtr<CVoid>, oldsilocontext: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun psRevertToUserMultipleGroupAffinityThread(affinitytoken: PaffinityToken)

public expect fun psSetCreateProcessNotifyRoutine(notifyroutine: PcreateProcessNotifyRoutine, remove: Boolean): Ntstatus

public expect fun psSetCreateProcessNotifyRoutineEx(notifyroutine: PcreateProcessNotifyRoutineEx, remove: Boolean): Ntstatus

public expect fun psSetCreateProcessNotifyRoutineEx2(notifytype: Pscreateprocessnotifytype, notifyinformation: ConstPtr<CVoid>, remove: Boolean): Ntstatus

public expect fun psSetCreateThreadNotifyRoutine(notifyroutine: PcreateThreadNotifyRoutine): Ntstatus

public expect fun psSetCreateThreadNotifyRoutineEx(notifytype: Pscreatethreadnotifytype, notifyinformation: ConstPtr<CVoid>): Ntstatus

public expect fun psSetCurrentThreadPrefetching(prefetching: Boolean): Boolean

public expect fun psSetLoadImageNotifyRoutine(notifyroutine: PloadImageNotifyRoutine): Ntstatus

public expect fun psSetLoadImageNotifyRoutineEx(notifyroutine: PloadImageNotifyRoutine, flags: ULong): Ntstatus

public expect fun psSetSystemMultipleGroupAffinityThread(groupaffinities: ConstPtr<GroupAffinity>, groupcount: UShort, affinitytoken: PaffinityToken): Ntstatus

public expect fun psStartSiloMonitor(monitor: PsiloMonitor): Ntstatus

public expect fun psTerminateServerSilo(serversilo: Pesilo, exitstatus: Ntstatus)

public expect fun psTerminateSystemThread(exitstatus: Ntstatus): Ntstatus

public expect fun psUnregisterSiloMonitor(monitor: PsiloMonitor)

public expect fun psWrapApcWow64Thread(apccontext: MutPtr<MutPtr<CVoid>>, apcroutine: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun pshedAllocateMemory(size: UInt): MutPtr<CVoid>

public expect fun pshedFreeMemory(address: ConstPtr<CVoid>)

public expect fun pshedIsSystemWheaEnabled(): Boolean

public expect fun pshedRegisterPlugin(packet: MutPtr<WheaPshedPluginRegistrationPacketV2>): Ntstatus

public expect fun pshedSynchronizeExecution(errorsource: ConstPtr<WheaErrorSourceDescriptor>, synchronizeroutine: PksynchronizeRoutine, synchronizecontext: ConstPtr<CVoid>): Boolean

public expect fun pshedUnregisterPlugin(pluginhandle: ConstPtr<CVoid>)

public expect fun rtlAppendUnicodeStringToString(destination: MutPtr<UnicodeString>, source: ConstPtr<UnicodeString>): Ntstatus

public expect fun rtlAppendUnicodeToString(destination: MutPtr<UnicodeString>, source: Pcwstr): Ntstatus

public expect fun rtlAreBitsClear(bitmapheader: ConstPtr<RtlBitmap>, startingindex: UInt, length: UInt): Boolean

public expect fun rtlAreBitsSet(bitmapheader: ConstPtr<RtlBitmap>, startingindex: UInt, length: UInt): Boolean

public expect fun rtlAssert(voidfailedassertion: ConstPtr<CVoid>, voidfilename: ConstPtr<CVoid>, linenumber: UInt, mutablemessage: Pcstr)

public expect fun rtlCheckRegistryKey(relativeto: UInt, path: Pcwstr): Ntstatus

public expect fun rtlClearAllBits(bitmapheader: ConstPtr<RtlBitmap>)

public expect fun rtlClearBit(bitmapheader: ConstPtr<RtlBitmap>, bitnumber: UInt)

public expect fun rtlClearBits(bitmapheader: ConstPtr<RtlBitmap>, startingindex: UInt, numbertoclear: UInt)

public expect fun rtlCmDecodeMemIoResource(descriptor: ConstPtr<CmPartialResourceDescriptor>, start: MutPtr<ULong>): ULong

public expect fun rtlCmEncodeMemIoResource(descriptor: ConstPtr<CmPartialResourceDescriptor>, type: UByte, length: ULong, start: ULong): Ntstatus

public expect fun rtlCompareString(string1: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, string2: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, caseinsensitive: Boolean): Int

public expect fun rtlCompareUnicodeString(string1: ConstPtr<UnicodeString>, string2: ConstPtr<UnicodeString>, caseinsensitive: Boolean): Int

public expect fun rtlCompareUnicodeStrings(string1: ConstPtr<UShort>, string1length: ULong, string2: ConstPtr<UShort>, string2length: ULong, caseinsensitive: Boolean): Int

public expect fun rtlContractHashTable(hashtable: ConstPtr<RtlDynamicHashTable>): Boolean

public expect fun rtlCopyBitMap(source: ConstPtr<RtlBitmap>, destination: ConstPtr<RtlBitmap>, targetbit: UInt)

public expect fun rtlCopyString(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>)

public expect fun rtlCopyUnicodeString(destinationstring: MutPtr<UnicodeString>, sourcestring: ConstPtr<UnicodeString>)

public expect fun rtlCreateHashTable(hashtable: MutPtr<MutPtr<RtlDynamicHashTable>>, shift: UInt, flags: UInt): Boolean

public expect fun rtlCreateHashTableEx(hashtable: MutPtr<MutPtr<RtlDynamicHashTable>>, initialsize: UInt, shift: UInt, flags: UInt): Boolean

public expect fun rtlCreateRegistryKey(relativeto: UInt, path: Pcwstr): Ntstatus

public expect fun rtlCreateSecurityDescriptor(securitydescriptor: PsecurityDescriptor, revision: UInt): Ntstatus

public expect fun rtlDelete(links: ConstPtr<RtlSplayLinks>): MutPtr<RtlSplayLinks>

public expect fun rtlDeleteElementGenericTable(table: ConstPtr<RtlGenericTable>, buffer: ConstPtr<CVoid>): Boolean

public expect fun rtlDeleteElementGenericTableAvl(table: ConstPtr<RtlAvlTable>, buffer: ConstPtr<CVoid>): Boolean

public expect fun rtlDeleteElementGenericTableAvlEx(table: ConstPtr<RtlAvlTable>, nodeorparent: ConstPtr<CVoid>)

public expect fun rtlDeleteHashTable(hashtable: ConstPtr<RtlDynamicHashTable>)

public expect fun rtlDeleteNoSplay(links: ConstPtr<RtlSplayLinks>, root: MutPtr<MutPtr<RtlSplayLinks>>)

public expect fun rtlDeleteRegistryValue(relativeto: UInt, path: Pcwstr, valuename: Pcwstr): Ntstatus

public expect fun rtlDowncaseUnicodeChar(sourcecharacter: UShort): UShort

public expect fun rtlEndEnumerationHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>)

public expect fun rtlEndStrongEnumerationHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>)

public expect fun rtlEndWeakEnumerationHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>)

public expect fun rtlEnumerateEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>): MutPtr<RtlDynamicHashTableEntry>

public expect fun rtlEnumerateGenericTable(table: ConstPtr<RtlGenericTable>, restart: Boolean): MutPtr<CVoid>

public expect fun rtlEnumerateGenericTableAvl(table: ConstPtr<RtlAvlTable>, restart: Boolean): MutPtr<CVoid>

public expect fun rtlEnumerateGenericTableLikeADirectory(table: ConstPtr<RtlAvlTable>, matchfunction: PrtlAvlMatchFunction, matchdata: ConstPtr<CVoid>, nextflag: UInt, restartkey: MutPtr<MutPtr<CVoid>>, deletecount: MutPtr<UInt>, buffer: ConstPtr<CVoid>): MutPtr<CVoid>

public expect fun rtlEnumerateGenericTableWithoutSplaying(table: ConstPtr<RtlGenericTable>, restartkey: MutPtr<MutPtr<CVoid>>): MutPtr<CVoid>

public expect fun rtlEnumerateGenericTableWithoutSplayingAvl(table: ConstPtr<RtlAvlTable>, restartkey: MutPtr<MutPtr<CVoid>>): MutPtr<CVoid>

public expect fun rtlEqualString(string1: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, string2: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, caseinsensitive: Boolean): Boolean

public expect fun rtlEqualUnicodeString(string1: ConstPtr<UnicodeString>, string2: ConstPtr<UnicodeString>, caseinsensitive: Boolean): Boolean

public expect fun rtlExpandHashTable(hashtable: ConstPtr<RtlDynamicHashTable>): Boolean

public expect fun rtlExtractBitMap(source: ConstPtr<RtlBitmap>, destination: ConstPtr<RtlBitmap>, targetbit: UInt, numberofbits: UInt)

public expect fun rtlFindClearBits(bitmapheader: ConstPtr<RtlBitmap>, numbertofind: UInt, hintindex: UInt): UInt

public expect fun rtlFindClearBitsAndSet(bitmapheader: ConstPtr<RtlBitmap>, numbertofind: UInt, hintindex: UInt): UInt

public expect fun rtlFindClearRuns(bitmapheader: ConstPtr<RtlBitmap>, runarray: MutPtr<RtlBitmapRun>, sizeofrunarray: UInt, locatelongestruns: Boolean): UInt

public expect fun rtlFindClosestEncodableLength(sourcelength: ULong, targetlength: MutPtr<ULong>): Ntstatus

public expect fun rtlFindFirstRunClear(bitmapheader: ConstPtr<RtlBitmap>, startingindex: MutPtr<UInt>): UInt

public expect fun rtlFindLastBackwardRunClear(bitmapheader: ConstPtr<RtlBitmap>, fromindex: UInt, startingrunindex: MutPtr<UInt>): UInt

public expect fun rtlFindLeastSignificantBit(set: ULong): Byte

public expect fun rtlFindLongestRunClear(bitmapheader: ConstPtr<RtlBitmap>, startingindex: MutPtr<UInt>): UInt

public expect fun rtlFindMostSignificantBit(set: ULong): Byte

public expect fun rtlFindNextForwardRunClear(bitmapheader: ConstPtr<RtlBitmap>, fromindex: UInt, startingrunindex: MutPtr<UInt>): UInt

public expect fun rtlFindSetBits(bitmapheader: ConstPtr<RtlBitmap>, numbertofind: UInt, hintindex: UInt): UInt

public expect fun rtlFindSetBitsAndClear(bitmapheader: ConstPtr<RtlBitmap>, numbertofind: UInt, hintindex: UInt): UInt

public expect fun rtlFreeUTF8String(utf8string: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>)

public expect fun rtlGUIDFromString(guidstring: ConstPtr<UnicodeString>, guid: MutPtr<Guid>): Ntstatus

public expect fun rtlGenerateClass5Guid(namespaceguid: ConstPtr<Guid>, buffer: ConstPtr<CVoid>, buffersize: UInt, guid: MutPtr<Guid>): Ntstatus

public expect fun rtlGetActiveConsoleId(): UInt

public expect fun rtlGetCallersAddress(callersaddress: MutPtr<MutPtr<CVoid>>, callerscaller: MutPtr<MutPtr<CVoid>>)

public expect fun rtlGetConsoleSessionForegroundProcessId(): ULong

public expect fun rtlGetElementGenericTable(table: ConstPtr<RtlGenericTable>, i: UInt): MutPtr<CVoid>

public expect fun rtlGetElementGenericTableAvl(table: ConstPtr<RtlAvlTable>, i: UInt): MutPtr<CVoid>

public expect fun rtlGetEnabledExtendedFeatures(featuremask: ULong): ULong

public expect fun rtlGetNextEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, context: ConstPtr<RtlDynamicHashTableContext>): MutPtr<RtlDynamicHashTableEntry>

public expect fun rtlGetNtProductType(ntproducttype: MutPtr<NtProductType>): Boolean

public expect fun rtlGetNtSystemRoot(): Pcwstr

public expect fun rtlGetPersistedStateLocation(sourceid: Pcwstr, customvalue: Pcwstr, defaultpath: Pcwstr, statelocationtype: StateLocationType, targetpath: Pwstr, bufferlengthin: UInt, bufferlengthout: MutPtr<UInt>): Ntstatus

public expect fun rtlGetSuiteMask(): UInt

public expect fun rtlGetVersion(lpversioninformation: MutPtr<Osversioninfow>): Ntstatus

public expect fun rtlHashUnicodeString(string: ConstPtr<UnicodeString>, caseinsensitive: Boolean, hashalgorithm: UInt, hashvalue: MutPtr<UInt>): Ntstatus

public expect fun rtlInitEnumerationHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>): Boolean

public expect fun rtlInitStrongEnumerationHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>): Boolean

public expect fun rtlInitUTF8String(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<Byte>)

public expect fun rtlInitUTF8StringEx(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<Byte>): Ntstatus

public expect fun rtlInitWeakEnumerationHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>): Boolean

public expect fun rtlInitializeBitMap(bitmapheader: MutPtr<RtlBitmap>, bitmapbuffer: ConstPtr<UInt>, sizeofbitmap: UInt)

public expect fun rtlInitializeGenericTable(table: MutPtr<RtlGenericTable>, compareroutine: PrtlGenericCompareRoutine, allocateroutine: PrtlGenericAllocateRoutine, freeroutine: PrtlGenericFreeRoutine, tablecontext: ConstPtr<CVoid>)

public expect fun rtlInitializeGenericTableAvl(table: MutPtr<RtlAvlTable>, compareroutine: PrtlAvlCompareRoutine, allocateroutine: PrtlAvlAllocateRoutine, freeroutine: PrtlAvlFreeRoutine, tablecontext: ConstPtr<CVoid>)

public expect fun rtlInsertElementGenericTable(table: ConstPtr<RtlGenericTable>, buffer: ConstPtr<CVoid>, buffersize: UInt, newelement: MutPtr<Boolean>): MutPtr<CVoid>

public expect fun rtlInsertElementGenericTableAvl(table: ConstPtr<RtlAvlTable>, buffer: ConstPtr<CVoid>, buffersize: UInt, newelement: MutPtr<Boolean>): MutPtr<CVoid>

public expect fun rtlInsertElementGenericTableFull(table: ConstPtr<RtlGenericTable>, buffer: ConstPtr<CVoid>, buffersize: UInt, newelement: MutPtr<Boolean>, nodeorparent: ConstPtr<CVoid>, searchresult: TableSearchResult): MutPtr<CVoid>

public expect fun rtlInsertElementGenericTableFullAvl(table: ConstPtr<RtlAvlTable>, buffer: ConstPtr<CVoid>, buffersize: UInt, newelement: MutPtr<Boolean>, nodeorparent: ConstPtr<CVoid>, searchresult: TableSearchResult): MutPtr<CVoid>

public expect fun rtlInsertEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, entry: ConstPtr<RtlDynamicHashTableEntry>, signature: ULong, context: MutPtr<RtlDynamicHashTableContext>): Boolean

public expect fun rtlInt64ToUnicodeString(value: ULong, base: UInt, string: MutPtr<UnicodeString>): Ntstatus

public expect fun rtlIntegerToUnicodeString(value: UInt, base: UInt, string: MutPtr<UnicodeString>): Ntstatus

public expect fun rtlIoDecodeMemIoResource(descriptor: ConstPtr<IoResourceDescriptor>, alignment: MutPtr<ULong>, minimumaddress: MutPtr<ULong>, maximumaddress: MutPtr<ULong>): ULong

public expect fun rtlIoEncodeMemIoResource(descriptor: ConstPtr<IoResourceDescriptor>, type: UByte, length: ULong, alignment: ULong, minimumaddress: ULong, maximumaddress: ULong): Ntstatus

public expect fun rtlIsApiSetImplemented(apisetname: Pcstr): Ntstatus

public expect fun rtlIsGenericTableEmpty(table: ConstPtr<RtlGenericTable>): Boolean

public expect fun rtlIsGenericTableEmptyAvl(table: ConstPtr<RtlAvlTable>): Boolean

public expect fun rtlIsMultiSessionSku(): Boolean

public expect fun rtlIsMultiUsersInSessionSku(): Boolean

public expect fun rtlIsNtDdiVersionAvailable(version: UInt): Boolean

public expect fun rtlIsServicePackVersionInstalled(version: UInt): Boolean

public expect fun rtlIsStateSeparationEnabled(): Boolean

public expect fun rtlIsUntrustedObject(handle: Handle, obj: ConstPtr<CVoid>, untrustedobject: MutPtr<Boolean>): Ntstatus

public expect fun rtlLengthSecurityDescriptor(securitydescriptor: PsecurityDescriptor): UInt

public expect fun rtlLookupElementGenericTable(table: ConstPtr<RtlGenericTable>, buffer: ConstPtr<CVoid>): MutPtr<CVoid>

public expect fun rtlLookupElementGenericTableAvl(table: ConstPtr<RtlAvlTable>, buffer: ConstPtr<CVoid>): MutPtr<CVoid>

public expect fun rtlLookupElementGenericTableFull(table: ConstPtr<RtlGenericTable>, buffer: ConstPtr<CVoid>, nodeorparent: MutPtr<MutPtr<CVoid>>, searchresult: MutPtr<TableSearchResult>): MutPtr<CVoid>

public expect fun rtlLookupElementGenericTableFullAvl(table: ConstPtr<RtlAvlTable>, buffer: ConstPtr<CVoid>, nodeorparent: MutPtr<MutPtr<CVoid>>, searchresult: MutPtr<TableSearchResult>): MutPtr<CVoid>

public expect fun rtlLookupEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, signature: ULong, context: MutPtr<RtlDynamicHashTableContext>): MutPtr<RtlDynamicHashTableEntry>

public expect fun rtlLookupFirstMatchingElementGenericTableAvl(table: ConstPtr<RtlAvlTable>, buffer: ConstPtr<CVoid>, restartkey: MutPtr<MutPtr<CVoid>>): MutPtr<CVoid>

public expect fun rtlMapGenericMask(accessmask: MutPtr<UInt>, genericmapping: ConstPtr<GenericMapping>)

public expect fun rtlNormalizeSecurityDescriptor(securitydescriptor: MutPtr<PsecurityDescriptor>, securitydescriptorlength: UInt, newsecuritydescriptor: MutPtr<PsecurityDescriptor>, newsecuritydescriptorlength: MutPtr<UInt>, checkonly: Boolean): Boolean

public expect fun rtlNumberGenericTableElements(table: ConstPtr<RtlGenericTable>): UInt

public expect fun rtlNumberGenericTableElementsAvl(table: ConstPtr<RtlAvlTable>): UInt

public expect fun rtlNumberOfClearBits(bitmapheader: ConstPtr<RtlBitmap>): UInt

public expect fun rtlNumberOfClearBitsInRange(bitmapheader: ConstPtr<RtlBitmap>, startingindex: UInt, length: UInt): UInt

public expect fun rtlNumberOfSetBits(bitmapheader: ConstPtr<RtlBitmap>): UInt

public expect fun rtlNumberOfSetBitsInRange(bitmapheader: ConstPtr<RtlBitmap>, startingindex: UInt, length: UInt): UInt

public expect fun rtlNumberOfSetBitsUlongPtr(target: ULong): UInt

public expect fun rtlPrefetchMemoryNonTemporal(source: ConstPtr<CVoid>, length: ULong)

public expect fun rtlPrefixUnicodeString(string1: ConstPtr<UnicodeString>, string2: ConstPtr<UnicodeString>, caseinsensitive: Boolean): Boolean

public expect fun rtlQueryRegistryValueWithFallback(primaryhandle: Handle, fallbackhandle: Handle, valuename: ConstPtr<UnicodeString>, valuelength: UInt, valuetype: MutPtr<UInt>, valuedata: MutPtr<CVoid>, resultlength: MutPtr<UInt>): Ntstatus

public expect fun rtlQueryRegistryValues(relativeto: UInt, path: Pcwstr, querytable: MutPtr<RtlQueryRegistryTable>, context: ConstPtr<CVoid>, environment: ConstPtr<CVoid>): Ntstatus

public expect fun rtlQueryValidationRunlevel(componentname: ConstPtr<UnicodeString>): UInt

public expect fun rtlRealPredecessor(links: ConstPtr<RtlSplayLinks>): MutPtr<RtlSplayLinks>

public expect fun rtlRealSuccessor(links: ConstPtr<RtlSplayLinks>): MutPtr<RtlSplayLinks>

public expect fun rtlRemoveEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, entry: ConstPtr<RtlDynamicHashTableEntry>, context: MutPtr<RtlDynamicHashTableContext>): Boolean

public expect fun rtlRunOnceBeginInitialize(runonce: MutPtr<InitOnce>, flags: UInt, context: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun rtlRunOnceComplete(runonce: MutPtr<InitOnce>, flags: UInt, context: ConstPtr<CVoid>): Ntstatus

public expect fun rtlRunOnceExecuteOnce(runonce: MutPtr<InitOnce>, initfn: PrtlRunOnceInitFn, parameter: MutPtr<CVoid>, context: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun rtlRunOnceInitialize(runonce: MutPtr<InitOnce>)

public expect fun rtlSetAllBits(bitmapheader: ConstPtr<RtlBitmap>)

public expect fun rtlSetBit(bitmapheader: ConstPtr<RtlBitmap>, bitnumber: UInt)

public expect fun rtlSetBits(bitmapheader: ConstPtr<RtlBitmap>, startingindex: UInt, numbertoset: UInt)

public expect fun rtlSetDaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, daclpresent: Boolean, dacl: ConstPtr<Acl>, dacldefaulted: Boolean): Ntstatus
