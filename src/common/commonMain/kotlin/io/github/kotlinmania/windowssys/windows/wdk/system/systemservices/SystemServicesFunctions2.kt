package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.windowssys.Win32DynamicFfi
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

public fun interface FnCallbackPart2 {
    public operator fun invoke(): ULong
}

public fun interface FnCallback1Part2 {
    public operator fun invoke(): BOUND_CALLBACK_STATUS
}

public fun interface FnCallback2Part2 {
    public operator fun invoke()
}

public fun interface FnCallback3Part2 {
    public operator fun invoke(): Boolean
}

public fun interface FnCallback4Part2 {
    public operator fun invoke(destinationmdl: Long, sourcemdl: Long, context: Long): NTSTATUS
}

public fun interface FnCallback5Part2 {
    public operator fun invoke(): NTSTATUS
}

public fun interface FnCallback6Part2 {
    public operator fun invoke(silocontext: Long)
}

public fun interface FnCallback7Part2 {
    public operator fun invoke(processid: HANDLE, threadid: HANDLE, create: Boolean)
}

public fun interface FnCallback8Part2 {
    public operator fun invoke(fullimagename: Long, processid: HANDLE, imageinfo: Long)
}

public fun interface FnCallback9Part2 {
    public operator fun invoke(process: PEPROCESS, processid: HANDLE, createinfo: Long)
}

public fun interface FnCallback10Part2 {
    public operator fun invoke(): RTL_GENERIC_COMPARE_RESULTS
}

public fun interface FnCallback11Part2 {
    public operator fun invoke(): Long
}

public fun interface FnCallback12Part2 {
    public operator fun invoke(): UInt
}

public fun KeInitializeMutex(mutex: Long, level: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeInitializeMutex", longArrayOf(mutex, level.toLong()))
}

public fun KeInitializeSemaphore(semaphore: Long, count: Int, limit: Int) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeInitializeSemaphore", longArrayOf(semaphore, count.toLong(), limit.toLong()))
}

public fun KeInitializeSpinLock(spinlock: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeInitializeSpinLock", longArrayOf(spinlock))
}

public fun KeInitializeThreadedDpc(dpc: Long, deferredroutine: PKDEFERRED_ROUTINE, deferredcontext: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeInitializeThreadedDpc", longArrayOf(dpc, Win32DynamicFfi.objectSlot(deferredroutine), deferredcontext))
}

public fun KeInitializeTimer(timer: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeInitializeTimer", longArrayOf(timer))
}

public fun KeInitializeTimerEx(timer: Long, type: TIMER_TYPE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeInitializeTimerEx", longArrayOf(timer, type.toLong()))
}

public fun KeInitializeTriageDumpDataArray(ktriagedumpdataarray: Long, size: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeInitializeTriageDumpDataArray", longArrayOf(ktriagedumpdataarray, size.toLong())).toInt()
}

public fun KeInsertByKeyDeviceQueue(devicequeue: Long, devicequeueentry: Long, sortkey: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "KeInsertByKeyDeviceQueue", longArrayOf(devicequeue, devicequeueentry, sortkey.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun KeInsertDeviceQueue(devicequeue: Long, devicequeueentry: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "KeInsertDeviceQueue", longArrayOf(devicequeue, devicequeueentry))
    return (rawRet and 0xFFL) != 0L
}

public fun KeInsertQueueDpc(dpc: Long, systemargument1: Long, systemargument2: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "KeInsertQueueDpc", longArrayOf(dpc, systemargument1, systemargument2))
    return (rawRet and 0xFFL) != 0L
}

public fun KeInvalidateAllCaches(): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "KeInvalidateAllCaches", longArrayOf())
    return (rawRet and 0xFFL) != 0L
}

public fun KeInvalidateRangeAllCaches(baseaddress: Long, length: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeInvalidateRangeAllCaches", longArrayOf(baseaddress, length.toLong()))
}

public fun KeIpiGenericCall(broadcastfunction: PKIPI_BROADCAST_WORKER, context: ULong): ULong {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeIpiGenericCall", longArrayOf(Win32DynamicFfi.objectSlot(broadcastfunction), context.toLong())).toULong()
}

public fun KeIsExecutingDpc(): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeIsExecutingDpc", longArrayOf()).toUInt()
}

public fun KeLeaveCriticalRegion() {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeLeaveCriticalRegion", longArrayOf())
}

public fun KeLeaveGuardedRegion() {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeLeaveGuardedRegion", longArrayOf())
}

public fun KePulseEvent(event: Long, increment: Int, wait: Boolean): Int {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KePulseEvent", longArrayOf(event, increment.toLong(), if (wait) 1L else 0L)).toInt()
}

public fun KeQueryActiveGroupCount(): UShort {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeQueryActiveGroupCount", longArrayOf()).toUShort()
}

public fun KeQueryActiveProcessorCount(activeprocessors: Long): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeQueryActiveProcessorCount", longArrayOf(activeprocessors)).toUInt()
}

public fun KeQueryActiveProcessorCountEx(groupnumber: UShort): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeQueryActiveProcessorCountEx", longArrayOf(groupnumber.toLong())).toUInt()
}

public fun KeQueryActiveProcessors(): ULong {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeQueryActiveProcessors", longArrayOf()).toULong()
}

public fun KeQueryAuxiliaryCounterFrequency(auxiliarycounterfrequency: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeQueryAuxiliaryCounterFrequency", longArrayOf(auxiliarycounterfrequency)).toInt()
}

public fun KeQueryDpcWatchdogInformation(watchdoginformation: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeQueryDpcWatchdogInformation", longArrayOf(watchdoginformation)).toInt()
}

public fun KeQueryGroupAffinity(groupnumber: UShort): ULong {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeQueryGroupAffinity", longArrayOf(groupnumber.toLong())).toULong()
}

public fun KeQueryHardwareCounterConfiguration(counterarray: Long, maximumcount: UInt, count: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeQueryHardwareCounterConfiguration", longArrayOf(counterarray, maximumcount.toLong(), count)).toInt()
}

public fun KeQueryHighestNodeNumber(): UShort {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeQueryHighestNodeNumber", longArrayOf()).toUShort()
}

public fun KeQueryInterruptTimePrecise(qpctimestamp: Long): ULong {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeQueryInterruptTimePrecise", longArrayOf(qpctimestamp)).toULong()
}

public fun KeQueryLogicalProcessorRelationship(processornumber: Long, relationshiptype: LOGICAL_PROCESSOR_RELATIONSHIP, information: Long, length: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeQueryLogicalProcessorRelationship", longArrayOf(processornumber, relationshiptype.toLong(), information, length)).toInt()
}

public fun KeQueryMaximumGroupCount(): UShort {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeQueryMaximumGroupCount", longArrayOf()).toUShort()
}

public fun KeQueryMaximumProcessorCount(): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeQueryMaximumProcessorCount", longArrayOf()).toUInt()
}

public fun KeQueryMaximumProcessorCountEx(groupnumber: UShort): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeQueryMaximumProcessorCountEx", longArrayOf(groupnumber.toLong())).toUInt()
}

public fun KeQueryNodeActiveAffinity(nodenumber: UShort, affinity: Long, count: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeQueryNodeActiveAffinity", longArrayOf(nodenumber.toLong(), affinity, count))
}

public fun KeQueryNodeActiveAffinity2(nodenumber: UShort, groupaffinities: Long, groupaffinitiescount: UShort, groupaffinitiesrequired: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeQueryNodeActiveAffinity2", longArrayOf(nodenumber.toLong(), groupaffinities, groupaffinitiescount.toLong(), groupaffinitiesrequired)).toInt()
}

public fun KeQueryNodeActiveProcessorCount(nodenumber: UShort): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeQueryNodeActiveProcessorCount", longArrayOf(nodenumber.toLong())).toUInt()
}

public fun KeQueryNodeMaximumProcessorCount(nodenumber: UShort): UShort {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeQueryNodeMaximumProcessorCount", longArrayOf(nodenumber.toLong())).toUShort()
}

public fun KeQueryPerformanceCounter(performancefrequency: Long): Long {
    return Win32DynamicFfi.invoke("hal.dll", "KeQueryPerformanceCounter", longArrayOf(performancefrequency))
}

public fun KeQueryPriorityThread(thread: PKTHREAD): Int {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeQueryPriorityThread", longArrayOf(thread)).toInt()
}

public fun KeQueryRuntimeThread(thread: PKTHREAD, usertime: Long): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeQueryRuntimeThread", longArrayOf(thread, usertime)).toUInt()
}

public fun KeQuerySystemTimePrecise(currenttime: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeQuerySystemTimePrecise", longArrayOf(currenttime))
}

public fun KeQueryTimeIncrement(): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeQueryTimeIncrement", longArrayOf()).toUInt()
}

public fun KeQueryTotalCycleTimeThread(thread: PKTHREAD, cycletimestamp: Long): ULong {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeQueryTotalCycleTimeThread", longArrayOf(thread, cycletimestamp)).toULong()
}

public fun KeQueryUnbiasedInterruptTime(): ULong {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeQueryUnbiasedInterruptTime", longArrayOf()).toULong()
}

public fun KeQueryUnbiasedInterruptTimePrecise(qpctimestamp: Long): ULong {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeQueryUnbiasedInterruptTimePrecise", longArrayOf(qpctimestamp)).toULong()
}

public fun KeReadStateEvent(event: Long): Int {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeReadStateEvent", longArrayOf(event)).toInt()
}

public fun KeReadStateMutex(mutex: Long): Int {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeReadStateMutex", longArrayOf(mutex)).toInt()
}

public fun KeReadStateSemaphore(semaphore: Long): Int {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeReadStateSemaphore", longArrayOf(semaphore)).toInt()
}

public fun KeReadStateTimer(timer: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "KeReadStateTimer", longArrayOf(timer))
    return (rawRet and 0xFFL) != 0L
}

public fun KeRegisterBoundCallback(callbackroutine: PBOUND_CALLBACK): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeRegisterBoundCallback", longArrayOf(Win32DynamicFfi.objectSlot(callbackroutine)))
}

public fun KeRegisterBugCheckCallback(callbackrecord: Long, callbackroutine: PKBUGCHECK_CALLBACK_ROUTINE, buffer: Long, length: UInt, component: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "KeRegisterBugCheckCallback", longArrayOf(callbackrecord, Win32DynamicFfi.objectSlot(callbackroutine), buffer, length.toLong(), component))
    return (rawRet and 0xFFL) != 0L
}

public fun KeRegisterBugCheckReasonCallback(callbackrecord: Long, callbackroutine: PKBUGCHECK_REASON_CALLBACK_ROUTINE, reason: KBUGCHECK_CALLBACK_REASON, component: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "KeRegisterBugCheckReasonCallback", longArrayOf(callbackrecord, Win32DynamicFfi.objectSlot(callbackroutine), reason.toLong(), component))
    return (rawRet and 0xFFL) != 0L
}

public fun KeRegisterNmiCallback(callbackroutine: PNMI_CALLBACK, context: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeRegisterNmiCallback", longArrayOf(Win32DynamicFfi.objectSlot(callbackroutine), context))
}

public fun KeRegisterProcessorChangeCallback(callbackfunction: PPROCESSOR_CALLBACK_FUNCTION, callbackcontext: Long, flags: UInt): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeRegisterProcessorChangeCallback", longArrayOf(Win32DynamicFfi.objectSlot(callbackfunction), callbackcontext, flags.toLong()))
}

public fun KeReleaseGuardedMutex(mutex: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeReleaseGuardedMutex", longArrayOf(mutex))
}

public fun KeReleaseGuardedMutexUnsafe(fastmutex: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeReleaseGuardedMutexUnsafe", longArrayOf(fastmutex))
}

public fun KeReleaseInStackQueuedSpinLock(lockhandle: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeReleaseInStackQueuedSpinLock", longArrayOf(lockhandle))
}

public fun KeReleaseInStackQueuedSpinLockForDpc(lockhandle: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeReleaseInStackQueuedSpinLockForDpc", longArrayOf(lockhandle))
}

public fun KeReleaseInStackQueuedSpinLockFromDpcLevel(lockhandle: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeReleaseInStackQueuedSpinLockFromDpcLevel", longArrayOf(lockhandle))
}

public fun KeReleaseInterruptSpinLock(interrupt: PKINTERRUPT, oldirql: UByte) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeReleaseInterruptSpinLock", longArrayOf(interrupt, oldirql.toLong()))
}

public fun KeReleaseMutex(mutex: Long, wait: Boolean): Int {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeReleaseMutex", longArrayOf(mutex, if (wait) 1L else 0L)).toInt()
}

public fun KeReleaseSemaphore(semaphore: Long, increment: Int, adjustment: Int, wait: Boolean): Int {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeReleaseSemaphore", longArrayOf(semaphore, increment.toLong(), adjustment.toLong(), if (wait) 1L else 0L)).toInt()
}

public fun KeReleaseSpinLockForDpc(spinlock: Long, oldirql: UByte) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeReleaseSpinLockForDpc", longArrayOf(spinlock, oldirql.toLong()))
}

public fun KeRemoveByKeyDeviceQueue(devicequeue: Long, sortkey: UInt): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeRemoveByKeyDeviceQueue", longArrayOf(devicequeue, sortkey.toLong()))
}

public fun KeRemoveByKeyDeviceQueueIfBusy(devicequeue: Long, sortkey: UInt): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeRemoveByKeyDeviceQueueIfBusy", longArrayOf(devicequeue, sortkey.toLong()))
}

public fun KeRemoveDeviceQueue(devicequeue: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeRemoveDeviceQueue", longArrayOf(devicequeue))
}

public fun KeRemoveEntryDeviceQueue(devicequeue: Long, devicequeueentry: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "KeRemoveEntryDeviceQueue", longArrayOf(devicequeue, devicequeueentry))
    return (rawRet and 0xFFL) != 0L
}

public fun KeRemoveQueueDpc(dpc: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "KeRemoveQueueDpc", longArrayOf(dpc))
    return (rawRet and 0xFFL) != 0L
}

public fun KeRemoveQueueDpcEx(dpc: Long, waitifactive: Boolean): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "KeRemoveQueueDpcEx", longArrayOf(dpc, if (waitifactive) 1L else 0L))
    return (rawRet and 0xFFL) != 0L
}

public fun KeResetEvent(event: Long): Int {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeResetEvent", longArrayOf(event)).toInt()
}

public fun KeRestoreExtendedProcessorState(xstatesave: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeRestoreExtendedProcessorState", longArrayOf(xstatesave))
}

public fun KeRevertToUserAffinityThread() {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeRevertToUserAffinityThread", longArrayOf())
}

public fun KeRevertToUserAffinityThreadEx(affinity: ULong) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeRevertToUserAffinityThreadEx", longArrayOf(affinity.toLong()))
}

public fun KeRevertToUserGroupAffinityThread(previousaffinity: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeRevertToUserGroupAffinityThread", longArrayOf(previousaffinity))
}

public fun KeSaveExtendedProcessorState(mask: ULong, xstatesave: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeSaveExtendedProcessorState", longArrayOf(mask.toLong(), xstatesave)).toInt()
}

public fun KeSetBasePriorityThread(thread: PKTHREAD, increment: Int): Int {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeSetBasePriorityThread", longArrayOf(thread, increment.toLong())).toInt()
}

public fun KeSetCoalescableTimer(timer: Long, duetime: Long, period: UInt, tolerabledelay: UInt, dpc: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "KeSetCoalescableTimer", longArrayOf(timer, duetime, period.toLong(), tolerabledelay.toLong(), dpc))
    return (rawRet and 0xFFL) != 0L
}

public fun KeSetEvent(event: Long, increment: Int, wait: Boolean): Int {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeSetEvent", longArrayOf(event, increment.toLong(), if (wait) 1L else 0L)).toInt()
}

public fun KeSetHardwareCounterConfiguration(counterarray: Long, count: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeSetHardwareCounterConfiguration", longArrayOf(counterarray, count.toLong())).toInt()
}

public fun KeSetImportanceDpc(dpc: Long, importance: KDPC_IMPORTANCE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeSetImportanceDpc", longArrayOf(dpc, importance.toLong()))
}

public fun KeSetPriorityThread(thread: PKTHREAD, priority: Int): Int {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeSetPriorityThread", longArrayOf(thread, priority.toLong())).toInt()
}

public fun KeSetSystemAffinityThread(affinity: ULong) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeSetSystemAffinityThread", longArrayOf(affinity.toLong()))
}

public fun KeSetSystemAffinityThreadEx(affinity: ULong): ULong {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeSetSystemAffinityThreadEx", longArrayOf(affinity.toLong())).toULong()
}

public fun KeSetSystemGroupAffinityThread(affinity: Long, previousaffinity: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeSetSystemGroupAffinityThread", longArrayOf(affinity, previousaffinity))
}

public fun KeSetTargetProcessorDpc(dpc: Long, number: Byte) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeSetTargetProcessorDpc", longArrayOf(dpc, number.toLong()))
}

public fun KeSetTargetProcessorDpcEx(dpc: Long, procnumber: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeSetTargetProcessorDpcEx", longArrayOf(dpc, procnumber)).toInt()
}

public fun KeSetTimer(timer: Long, duetime: Long, dpc: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "KeSetTimer", longArrayOf(timer, duetime, dpc))
    return (rawRet and 0xFFL) != 0L
}

public fun KeSetTimerEx(timer: Long, duetime: Long, period: Int, dpc: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "KeSetTimerEx", longArrayOf(timer, duetime, period.toLong(), dpc))
    return (rawRet and 0xFFL) != 0L
}

public fun KeShouldYieldProcessor(): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeShouldYieldProcessor", longArrayOf()).toUInt()
}

public fun KeStallExecutionProcessor(microseconds: UInt) {
    Win32DynamicFfi.invoke("hal.dll", "KeStallExecutionProcessor", longArrayOf(microseconds.toLong()))
}

public fun KeSynchronizeExecution(interrupt: PKINTERRUPT, synchronizeroutine: PKSYNCHRONIZE_ROUTINE, synchronizecontext: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "KeSynchronizeExecution", longArrayOf(interrupt, Win32DynamicFfi.objectSlot(synchronizeroutine), synchronizecontext))
    return (rawRet and 0xFFL) != 0L
}

public fun KeTestSpinLock(spinlock: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "KeTestSpinLock", longArrayOf(spinlock))
    return (rawRet and 0xFFL) != 0L
}

public fun KeTryToAcquireGuardedMutex(mutex: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "KeTryToAcquireGuardedMutex", longArrayOf(mutex))
    return (rawRet and 0xFFL) != 0L
}

public fun KeTryToAcquireSpinLockAtDpcLevel(spinlock: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "KeTryToAcquireSpinLockAtDpcLevel", longArrayOf(spinlock))
    return (rawRet and 0xFFL) != 0L
}

public fun KeWaitForMultipleObjects(count: UInt, obj: Long, waittype: WAIT_TYPE, waitreason: KWAIT_REASON, waitmode: Byte, alertable: Boolean, timeout: Long, waitblockarray: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeWaitForMultipleObjects", longArrayOf(count.toLong(), obj, waittype.toLong(), waitreason.toLong(), waitmode.toLong(), if (alertable) 1L else 0L, timeout, waitblockarray)).toInt()
}

public fun KeWaitForSingleObject(obj: Long, waitreason: KWAIT_REASON, waitmode: Byte, alertable: Boolean, timeout: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeWaitForSingleObject", longArrayOf(obj, waitreason.toLong(), waitmode.toLong(), if (alertable) 1L else 0L, timeout)).toInt()
}

public fun KfRaiseIrql(newirql: UByte): UByte {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KfRaiseIrql", longArrayOf(newirql.toLong())).toUByte()
}

public fun MmAddPhysicalMemory(startaddress: Long, numberofbytes: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmAddPhysicalMemory", longArrayOf(startaddress, numberofbytes)).toInt()
}

public fun MmAddVerifierSpecialThunks(entryroutine: ULong, thunkbuffer: Long, thunkbuffersize: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmAddVerifierSpecialThunks", longArrayOf(entryroutine.toLong(), thunkbuffer, thunkbuffersize.toLong())).toInt()
}

public fun MmAddVerifierThunks(thunkbuffer: Long, thunkbuffersize: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmAddVerifierThunks", longArrayOf(thunkbuffer, thunkbuffersize.toLong())).toInt()
}

public fun MmAdvanceMdl(mdl: Long, numberofbytes: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmAdvanceMdl", longArrayOf(mdl, numberofbytes.toLong())).toInt()
}

public fun MmAllocateContiguousMemory(numberofbytes: ULong, highestacceptableaddress: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmAllocateContiguousMemory", longArrayOf(numberofbytes.toLong(), highestacceptableaddress))
}

public fun MmAllocateContiguousMemoryEx(numberofbytes: Long, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, preferrednode: UInt, protect: UInt, partitionobject: Long, tag: UInt, flags: UInt, baseaddress: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmAllocateContiguousMemoryEx", longArrayOf(numberofbytes, lowestacceptableaddress, highestacceptableaddress, boundaryaddressmultiple, preferrednode.toLong(), protect.toLong(), partitionobject, tag.toLong(), flags.toLong(), baseaddress)).toInt()
}

public fun MmAllocateContiguousMemorySpecifyCache(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MEMORY_CACHING_TYPE): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmAllocateContiguousMemorySpecifyCache", longArrayOf(numberofbytes.toLong(), lowestacceptableaddress, highestacceptableaddress, boundaryaddressmultiple, cachetype.toLong()))
}

public fun MmAllocateContiguousMemorySpecifyCacheNode(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MEMORY_CACHING_TYPE, preferrednode: UInt): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmAllocateContiguousMemorySpecifyCacheNode", longArrayOf(numberofbytes.toLong(), lowestacceptableaddress, highestacceptableaddress, boundaryaddressmultiple, cachetype.toLong(), preferrednode.toLong()))
}

public fun MmAllocateContiguousNodeMemory(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, protect: UInt, preferrednode: UInt): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmAllocateContiguousNodeMemory", longArrayOf(numberofbytes.toLong(), lowestacceptableaddress, highestacceptableaddress, boundaryaddressmultiple, protect.toLong(), preferrednode.toLong()))
}

public fun MmAllocateMappingAddress(numberofbytes: ULong, pooltag: UInt): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmAllocateMappingAddress", longArrayOf(numberofbytes.toLong(), pooltag.toLong()))
}

public fun MmAllocateMappingAddressEx(numberofbytes: ULong, pooltag: UInt, flags: UInt): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmAllocateMappingAddressEx", longArrayOf(numberofbytes.toLong(), pooltag.toLong(), flags.toLong()))
}

public fun MmAllocateMdlForIoSpace(physicaladdresslist: Long, numberofentries: ULong, newmdl: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmAllocateMdlForIoSpace", longArrayOf(physicaladdresslist, numberofentries.toLong(), newmdl)).toInt()
}

public fun MmAllocateNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MEMORY_CACHING_TYPE, idealnode: UInt, flags: UInt): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmAllocateNodePagesForMdlEx", longArrayOf(lowaddress, highaddress, skipbytes, totalbytes.toLong(), cachetype.toLong(), idealnode.toLong(), flags.toLong()))
}

public fun MmAllocateNonCachedMemory(numberofbytes: ULong): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmAllocateNonCachedMemory", longArrayOf(numberofbytes.toLong()))
}

public fun MmAllocatePagesForMdl(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmAllocatePagesForMdl", longArrayOf(lowaddress, highaddress, skipbytes, totalbytes.toLong()))
}

public fun MmAllocatePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MEMORY_CACHING_TYPE, flags: UInt): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmAllocatePagesForMdlEx", longArrayOf(lowaddress, highaddress, skipbytes, totalbytes.toLong(), cachetype.toLong(), flags.toLong()))
}

public fun MmAllocatePartitionNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MEMORY_CACHING_TYPE, idealnode: UInt, flags: UInt, partitionobject: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmAllocatePartitionNodePagesForMdlEx", longArrayOf(lowaddress, highaddress, skipbytes, totalbytes.toLong(), cachetype.toLong(), idealnode.toLong(), flags.toLong(), partitionobject))
}

public fun MmAreMdlPagesCached(memorydescriptorlist: Long): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmAreMdlPagesCached", longArrayOf(memorydescriptorlist)).toUInt()
}

public fun MmBuildMdlForNonPagedPool(memorydescriptorlist: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "MmBuildMdlForNonPagedPool", longArrayOf(memorydescriptorlist))
}

public fun MmCopyMemory(targetaddress: Long, sourceaddress: MM_COPY_ADDRESS, numberofbytes: ULong, flags: UInt, numberofbytestransferred: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmCopyMemory", longArrayOf(targetaddress, (sourceaddress.Anonymous.VirtualAddress or sourceaddress.Anonymous.PhysicalAddress), numberofbytes.toLong(), flags.toLong(), numberofbytestransferred)).toInt()
}

public fun MmCreateMdl(memorydescriptorlist: Long, base: Long, length: ULong): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmCreateMdl", longArrayOf(memorydescriptorlist, base, length.toLong()))
}

public fun MmCreateMirror(): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmCreateMirror", longArrayOf()).toInt()
}

public fun MmFreeContiguousMemory(baseaddress: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "MmFreeContiguousMemory", longArrayOf(baseaddress))
}

public fun MmFreeContiguousMemorySpecifyCache(baseaddress: Long, numberofbytes: ULong, cachetype: MEMORY_CACHING_TYPE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "MmFreeContiguousMemorySpecifyCache", longArrayOf(baseaddress, numberofbytes.toLong(), cachetype.toLong()))
}

public fun MmFreeMappingAddress(baseaddress: Long, pooltag: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "MmFreeMappingAddress", longArrayOf(baseaddress, pooltag.toLong()))
}

public fun MmFreeNonCachedMemory(baseaddress: Long, numberofbytes: ULong) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "MmFreeNonCachedMemory", longArrayOf(baseaddress, numberofbytes.toLong()))
}

public fun MmFreePagesFromMdl(memorydescriptorlist: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "MmFreePagesFromMdl", longArrayOf(memorydescriptorlist))
}

public fun MmFreePagesFromMdlEx(memorydescriptorlist: Long, flags: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "MmFreePagesFromMdlEx", longArrayOf(memorydescriptorlist, flags.toLong()))
}

public fun MmGetCacheAttribute(physicaladdress: Long, cachetype: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmGetCacheAttribute", longArrayOf(physicaladdress, cachetype)).toInt()
}

public fun MmGetCacheAttributeEx(physicaladdress: Long, flags: UInt, cachetype: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmGetCacheAttributeEx", longArrayOf(physicaladdress, flags.toLong(), cachetype)).toInt()
}

public fun MmGetPhysicalAddress(baseaddress: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmGetPhysicalAddress", longArrayOf(baseaddress))
}

public fun MmGetPhysicalMemoryRanges(): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmGetPhysicalMemoryRanges", longArrayOf())
}

public fun MmGetPhysicalMemoryRangesEx(partitionobject: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmGetPhysicalMemoryRangesEx", longArrayOf(partitionobject))
}

public fun MmGetPhysicalMemoryRangesEx2(partitionobject: Long, flags: UInt): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmGetPhysicalMemoryRangesEx2", longArrayOf(partitionobject, flags.toLong()))
}

public fun MmGetSystemRoutineAddress(systemroutinename: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmGetSystemRoutineAddress", longArrayOf(systemroutinename))
}

public fun MmGetVirtualForPhysical(physicaladdress: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmGetVirtualForPhysical", longArrayOf(physicaladdress))
}

public fun MmIsAddressValid(virtualaddress: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "MmIsAddressValid", longArrayOf(virtualaddress))
    return (rawRet and 0xFFL) != 0L
}

public fun MmIsDriverSuspectForVerifier(driverobject: Long): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmIsDriverSuspectForVerifier", longArrayOf(driverobject)).toUInt()
}

public fun MmIsDriverVerifying(driverobject: Long): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmIsDriverVerifying", longArrayOf(driverobject)).toUInt()
}

public fun MmIsDriverVerifyingByAddress(addresswithinsection: Long): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmIsDriverVerifyingByAddress", longArrayOf(addresswithinsection)).toUInt()
}

public fun MmIsIoSpaceActive(startaddress: Long, numberofbytes: ULong): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmIsIoSpaceActive", longArrayOf(startaddress, numberofbytes.toLong())).toUInt()
}

public fun MmIsNonPagedSystemAddressValid(virtualaddress: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "MmIsNonPagedSystemAddressValid", longArrayOf(virtualaddress))
    return (rawRet and 0xFFL) != 0L
}

public fun MmIsThisAnNtAsSystem(): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "MmIsThisAnNtAsSystem", longArrayOf())
    return (rawRet and 0xFFL) != 0L
}

public fun MmIsVerifierEnabled(verifierflags: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmIsVerifierEnabled", longArrayOf(verifierflags)).toInt()
}

public fun MmLockPagableDataSection(addresswithinsection: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmLockPagableDataSection", longArrayOf(addresswithinsection))
}

public fun MmLockPagableSectionByHandle(imagesectionhandle: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "MmLockPagableSectionByHandle", longArrayOf(imagesectionhandle))
}

public fun MmMapIoSpace(physicaladdress: Long, numberofbytes: ULong, cachetype: MEMORY_CACHING_TYPE): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmMapIoSpace", longArrayOf(physicaladdress, numberofbytes.toLong(), cachetype.toLong()))
}

public fun MmMapIoSpaceEx(physicaladdress: Long, numberofbytes: ULong, protect: UInt): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmMapIoSpaceEx", longArrayOf(physicaladdress, numberofbytes.toLong(), protect.toLong()))
}

public fun MmMapLockedPages(memorydescriptorlist: Long, accessmode: Byte): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmMapLockedPages", longArrayOf(memorydescriptorlist, accessmode.toLong()))
}

public fun MmMapLockedPagesSpecifyCache(memorydescriptorlist: Long, accessmode: Byte, cachetype: MEMORY_CACHING_TYPE, requestedaddress: Long, bugcheckonfailure: UInt, priority: UInt): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmMapLockedPagesSpecifyCache", longArrayOf(memorydescriptorlist, accessmode.toLong(), cachetype.toLong(), requestedaddress, bugcheckonfailure.toLong(), priority.toLong()))
}

public fun MmMapLockedPagesWithReservedMapping(mappingaddress: Long, pooltag: UInt, memorydescriptorlist: Long, cachetype: MEMORY_CACHING_TYPE): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmMapLockedPagesWithReservedMapping", longArrayOf(mappingaddress, pooltag.toLong(), memorydescriptorlist, cachetype.toLong()))
}

public fun MmMapMdl(memorydescriptorlist: Long, protection: UInt, driverroutine: PMM_MDL_ROUTINE, drivercontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmMapMdl", longArrayOf(memorydescriptorlist, protection.toLong(), Win32DynamicFfi.objectSlot(driverroutine), drivercontext)).toInt()
}

public fun MmMapMemoryDumpMdlEx(va: Long, pagetotal: UInt, memorydumpmdl: Long, flags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmMapMemoryDumpMdlEx", longArrayOf(va, pagetotal.toLong(), memorydumpmdl, flags.toLong())).toInt()
}

public fun MmMapUserAddressesToPage(baseaddress: Long, numberofbytes: ULong, pageaddress: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmMapUserAddressesToPage", longArrayOf(baseaddress, numberofbytes.toLong(), pageaddress)).toInt()
}

public fun MmMapVideoDisplay(physicaladdress: Long, numberofbytes: ULong, cachetype: MEMORY_CACHING_TYPE): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmMapVideoDisplay", longArrayOf(physicaladdress, numberofbytes.toLong(), cachetype.toLong()))
}

public fun MmMapViewInSessionSpace(section: Long, mappedbase: Long, viewsize: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmMapViewInSessionSpace", longArrayOf(section, mappedbase, viewsize)).toInt()
}

public fun MmMapViewInSessionSpaceEx(section: Long, mappedbase: Long, viewsize: Long, sectionoffset: Long, flags: ULong): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmMapViewInSessionSpaceEx", longArrayOf(section, mappedbase, viewsize, sectionoffset, flags.toLong())).toInt()
}

public fun MmMapViewInSystemSpace(section: Long, mappedbase: Long, viewsize: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmMapViewInSystemSpace", longArrayOf(section, mappedbase, viewsize)).toInt()
}

public fun MmMapViewInSystemSpaceEx(section: Long, mappedbase: Long, viewsize: Long, sectionoffset: Long, flags: ULong): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmMapViewInSystemSpaceEx", longArrayOf(section, mappedbase, viewsize, sectionoffset, flags.toLong())).toInt()
}

public fun MmMdlPageContentsState(memorydescriptorlist: Long, state: MM_MDL_PAGE_CONTENTS_STATE): MM_MDL_PAGE_CONTENTS_STATE {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmMdlPageContentsState", longArrayOf(memorydescriptorlist, state.toLong())).toInt()
}

public fun MmPageEntireDriver(addresswithinsection: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmPageEntireDriver", longArrayOf(addresswithinsection))
}

public fun MmProbeAndLockPages(memorydescriptorlist: Long, accessmode: Byte, operation: LOCK_OPERATION) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "MmProbeAndLockPages", longArrayOf(memorydescriptorlist, accessmode.toLong(), operation.toLong()))
}

public fun MmProbeAndLockProcessPages(memorydescriptorlist: Long, process: PEPROCESS, accessmode: Byte, operation: LOCK_OPERATION) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "MmProbeAndLockProcessPages", longArrayOf(memorydescriptorlist, process, accessmode.toLong(), operation.toLong()))
}

public fun MmProbeAndLockSelectedPages(memorydescriptorlist: Long, segmentarray: Long, accessmode: Byte, operation: LOCK_OPERATION) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "MmProbeAndLockSelectedPages", longArrayOf(memorydescriptorlist, segmentarray, accessmode.toLong(), operation.toLong()))
}

public fun MmProtectDriverSection(addresswithinsection: Long, size: ULong, flags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmProtectDriverSection", longArrayOf(addresswithinsection, size.toLong(), flags.toLong())).toInt()
}

public fun MmProtectMdlSystemAddress(memorydescriptorlist: Long, newprotect: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmProtectMdlSystemAddress", longArrayOf(memorydescriptorlist, newprotect.toLong())).toInt()
}

public fun MmQuerySystemSize(): MM_SYSTEMSIZE {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmQuerySystemSize", longArrayOf()).toInt()
}

public fun MmRemovePhysicalMemory(startaddress: Long, numberofbytes: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmRemovePhysicalMemory", longArrayOf(startaddress, numberofbytes)).toInt()
}

public fun MmResetDriverPaging(addresswithinsection: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "MmResetDriverPaging", longArrayOf(addresswithinsection))
}

public fun MmRotatePhysicalView(virtualaddress: Long, numberofbytes: Long, newmdl: Long, direction: MM_ROTATE_DIRECTION, copyfunction: PMM_ROTATE_COPY_CALLBACK_FUNCTION, context: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmRotatePhysicalView", longArrayOf(virtualaddress, numberofbytes, newmdl, direction.toLong(), Win32DynamicFfi.objectSlot(copyfunction), context)).toInt()
}

public fun MmSecureVirtualMemory(address: Long, size: ULong, probemode: UInt): HANDLE {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmSecureVirtualMemory", longArrayOf(address, size.toLong(), probemode.toLong()))
}

public fun MmSecureVirtualMemoryEx(address: Long, size: ULong, probemode: UInt, flags: UInt): HANDLE {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmSecureVirtualMemoryEx", longArrayOf(address, size.toLong(), probemode.toLong(), flags.toLong()))
}

public fun MmSetPermanentCacheAttribute(startaddress: Long, numberofbytes: Long, cachetype: MEMORY_CACHING_TYPE, flags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmSetPermanentCacheAttribute", longArrayOf(startaddress, numberofbytes, cachetype.toLong(), flags.toLong())).toInt()
}

public fun MmSizeOfMdl(base: Long, length: ULong): ULong {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmSizeOfMdl", longArrayOf(base, length.toLong())).toULong()
}

public fun MmUnlockPagableImageSection(imagesectionhandle: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "MmUnlockPagableImageSection", longArrayOf(imagesectionhandle))
}

public fun MmUnlockPages(memorydescriptorlist: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "MmUnlockPages", longArrayOf(memorydescriptorlist))
}

public fun MmUnmapIoSpace(baseaddress: Long, numberofbytes: ULong) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "MmUnmapIoSpace", longArrayOf(baseaddress, numberofbytes.toLong()))
}

public fun MmUnmapLockedPages(baseaddress: Long, memorydescriptorlist: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "MmUnmapLockedPages", longArrayOf(baseaddress, memorydescriptorlist))
}

public fun MmUnmapReservedMapping(baseaddress: Long, pooltag: UInt, memorydescriptorlist: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "MmUnmapReservedMapping", longArrayOf(baseaddress, pooltag.toLong(), memorydescriptorlist))
}

public fun MmUnmapVideoDisplay(baseaddress: Long, numberofbytes: ULong) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "MmUnmapVideoDisplay", longArrayOf(baseaddress, numberofbytes.toLong()))
}

public fun MmUnmapViewInSessionSpace(mappedbase: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmUnmapViewInSessionSpace", longArrayOf(mappedbase)).toInt()
}

public fun MmUnmapViewInSystemSpace(mappedbase: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmUnmapViewInSystemSpace", longArrayOf(mappedbase)).toInt()
}

public fun MmUnsecureVirtualMemory(securehandle: HANDLE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "MmUnsecureVirtualMemory", longArrayOf(securehandle))
}

public fun NtAllocateLocallyUniqueId(luid: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtAllocateLocallyUniqueId", longArrayOf(luid)).toInt()
}

public fun NtCommitComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtCommitComplete", longArrayOf(enlistmenthandle, tmvirtualclock)).toInt()
}

public fun NtCommitEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtCommitEnlistment", longArrayOf(enlistmenthandle, tmvirtualclock)).toInt()
}

public fun NtCommitTransaction(transactionhandle: HANDLE, wait: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtCommitTransaction", longArrayOf(transactionhandle, if (wait) 1L else 0L)).toInt()
}

public fun NtCreateEnlistment(enlistmenthandle: Long, desiredaccess: UInt, resourcemanagerhandle: HANDLE, transactionhandle: HANDLE, objectattributes: Long, createoptions: UInt, notificationmask: UInt, enlistmentkey: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtCreateEnlistment", longArrayOf(enlistmenthandle, desiredaccess.toLong(), resourcemanagerhandle, transactionhandle, objectattributes, createoptions.toLong(), notificationmask.toLong(), enlistmentkey)).toInt()
}

public fun NtCreateResourceManager(resourcemanagerhandle: Long, desiredaccess: UInt, tmhandle: HANDLE, rmguid: Long, objectattributes: Long, createoptions: UInt, description: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtCreateResourceManager", longArrayOf(resourcemanagerhandle, desiredaccess.toLong(), tmhandle, rmguid, objectattributes, createoptions.toLong(), description)).toInt()
}

public fun NtCreateTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, uow: Long, tmhandle: HANDLE, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: Long, description: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtCreateTransaction", longArrayOf(transactionhandle, desiredaccess.toLong(), objectattributes, uow, tmhandle, createoptions.toLong(), isolationlevel.toLong(), isolationflags.toLong(), timeout, description)).toInt()
}

public fun NtCreateTransactionManager(tmhandle: Long, desiredaccess: UInt, objectattributes: Long, logfilename: Long, createoptions: UInt, commitstrength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtCreateTransactionManager", longArrayOf(tmhandle, desiredaccess.toLong(), objectattributes, logfilename, createoptions.toLong(), commitstrength.toLong())).toInt()
}

public fun NtDisplayString(string: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtDisplayString", longArrayOf(string)).toInt()
}

public fun NtEnumerateTransactionObject(rootobjecthandle: HANDLE, querytype: KTMOBJECT_TYPE, objectcursor: Long, objectcursorlength: UInt, returnlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtEnumerateTransactionObject", longArrayOf(rootobjecthandle, querytype.toLong(), objectcursor, objectcursorlength.toLong(), returnlength)).toInt()
}

public fun NtGetNotificationResourceManager(resourcemanagerhandle: HANDLE, transactionnotification: Long, notificationlength: UInt, timeout: Long, returnlength: Long, asynchronous: UInt, asynchronouscontext: ULong): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtGetNotificationResourceManager", longArrayOf(resourcemanagerhandle, transactionnotification, notificationlength.toLong(), timeout, returnlength, asynchronous.toLong(), asynchronouscontext.toLong())).toInt()
}

public fun NtLoadDriver(driverservicename: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtLoadDriver", longArrayOf(driverservicename)).toInt()
}

public fun NtMakeTemporaryObject(handle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtMakeTemporaryObject", longArrayOf(handle)).toInt()
}

public fun NtManagePartition(targethandle: HANDLE, sourcehandle: HANDLE, partitioninformationclass: PARTITION_INFORMATION_CLASS, partitioninformation: Long, partitioninformationlength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtManagePartition", longArrayOf(targethandle, sourcehandle, partitioninformationclass.toLong(), partitioninformation, partitioninformationlength.toLong())).toInt()
}

public fun NtOpenEnlistment(enlistmenthandle: Long, desiredaccess: UInt, resourcemanagerhandle: HANDLE, enlistmentguid: Long, objectattributes: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtOpenEnlistment", longArrayOf(enlistmenthandle, desiredaccess.toLong(), resourcemanagerhandle, enlistmentguid, objectattributes)).toInt()
}

public fun NtOpenResourceManager(resourcemanagerhandle: Long, desiredaccess: UInt, tmhandle: HANDLE, resourcemanagerguid: Long, objectattributes: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtOpenResourceManager", longArrayOf(resourcemanagerhandle, desiredaccess.toLong(), tmhandle, resourcemanagerguid, objectattributes)).toInt()
}

public fun NtOpenTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, uow: Long, tmhandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtOpenTransaction", longArrayOf(transactionhandle, desiredaccess.toLong(), objectattributes, uow, tmhandle)).toInt()
}

public fun NtOpenTransactionManager(tmhandle: Long, desiredaccess: UInt, objectattributes: Long, logfilename: Long, tmidentity: Long, openoptions: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtOpenTransactionManager", longArrayOf(tmhandle, desiredaccess.toLong(), objectattributes, logfilename, tmidentity, openoptions.toLong())).toInt()
}

public fun NtPowerInformation(informationlevel: POWER_INFORMATION_LEVEL, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtPowerInformation", longArrayOf(informationlevel.toLong(), inputbuffer, inputbufferlength.toLong(), outputbuffer, outputbufferlength.toLong())).toInt()
}

public fun NtPrePrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtPrePrepareComplete", longArrayOf(enlistmenthandle, tmvirtualclock)).toInt()
}

public fun NtPrePrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtPrePrepareEnlistment", longArrayOf(enlistmenthandle, tmvirtualclock)).toInt()
}

public fun NtPrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtPrepareComplete", longArrayOf(enlistmenthandle, tmvirtualclock)).toInt()
}

public fun NtPrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtPrepareEnlistment", longArrayOf(enlistmenthandle, tmvirtualclock)).toInt()
}

public fun NtPropagationComplete(resourcemanagerhandle: HANDLE, requestcookie: UInt, bufferlength: UInt, buffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtPropagationComplete", longArrayOf(resourcemanagerhandle, requestcookie.toLong(), bufferlength.toLong(), buffer)).toInt()
}

public fun NtPropagationFailed(resourcemanagerhandle: HANDLE, requestcookie: UInt, propstatus: NTSTATUS): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtPropagationFailed", longArrayOf(resourcemanagerhandle, requestcookie.toLong(), propstatus.toLong())).toInt()
}

public fun NtQueryInformationEnlistment(enlistmenthandle: HANDLE, enlistmentinformationclass: ENLISTMENT_INFORMATION_CLASS, enlistmentinformation: Long, enlistmentinformationlength: UInt, returnlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtQueryInformationEnlistment", longArrayOf(enlistmenthandle, enlistmentinformationclass.toLong(), enlistmentinformation, enlistmentinformationlength.toLong(), returnlength)).toInt()
}

public fun NtQueryInformationResourceManager(resourcemanagerhandle: HANDLE, resourcemanagerinformationclass: RESOURCEMANAGER_INFORMATION_CLASS, resourcemanagerinformation: Long, resourcemanagerinformationlength: UInt, returnlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtQueryInformationResourceManager", longArrayOf(resourcemanagerhandle, resourcemanagerinformationclass.toLong(), resourcemanagerinformation, resourcemanagerinformationlength.toLong(), returnlength)).toInt()
}

public fun NtQueryInformationTransaction(transactionhandle: HANDLE, transactioninformationclass: TRANSACTION_INFORMATION_CLASS, transactioninformation: Long, transactioninformationlength: UInt, returnlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtQueryInformationTransaction", longArrayOf(transactionhandle, transactioninformationclass.toLong(), transactioninformation, transactioninformationlength.toLong(), returnlength)).toInt()
}

public fun NtQueryInformationTransactionManager(transactionmanagerhandle: HANDLE, transactionmanagerinformationclass: TRANSACTIONMANAGER_INFORMATION_CLASS, transactionmanagerinformation: Long, transactionmanagerinformationlength: UInt, returnlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtQueryInformationTransactionManager", longArrayOf(transactionmanagerhandle, transactionmanagerinformationclass.toLong(), transactionmanagerinformation, transactionmanagerinformationlength.toLong(), returnlength)).toInt()
}

public fun NtReadOnlyEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtReadOnlyEnlistment", longArrayOf(enlistmenthandle, tmvirtualclock)).toInt()
}

public fun NtRecoverEnlistment(enlistmenthandle: HANDLE, enlistmentkey: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtRecoverEnlistment", longArrayOf(enlistmenthandle, enlistmentkey)).toInt()
}

public fun NtRecoverResourceManager(resourcemanagerhandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtRecoverResourceManager", longArrayOf(resourcemanagerhandle)).toInt()
}

public fun NtRecoverTransactionManager(transactionmanagerhandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtRecoverTransactionManager", longArrayOf(transactionmanagerhandle)).toInt()
}

public fun NtRegisterProtocolAddressInformation(resourcemanager: HANDLE, protocolid: Long, protocolinformationsize: UInt, protocolinformation: Long, createoptions: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtRegisterProtocolAddressInformation", longArrayOf(resourcemanager, protocolid, protocolinformationsize.toLong(), protocolinformation, createoptions.toLong())).toInt()
}

public fun NtRenameTransactionManager(logfilename: Long, existingtransactionmanagerguid: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtRenameTransactionManager", longArrayOf(logfilename, existingtransactionmanagerguid)).toInt()
}

public fun NtRollbackComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtRollbackComplete", longArrayOf(enlistmenthandle, tmvirtualclock)).toInt()
}

public fun NtRollbackEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtRollbackEnlistment", longArrayOf(enlistmenthandle, tmvirtualclock)).toInt()
}

public fun NtRollbackTransaction(transactionhandle: HANDLE, wait: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtRollbackTransaction", longArrayOf(transactionhandle, if (wait) 1L else 0L)).toInt()
}

public fun NtRollforwardTransactionManager(transactionmanagerhandle: HANDLE, tmvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtRollforwardTransactionManager", longArrayOf(transactionmanagerhandle, tmvirtualclock)).toInt()
}

public fun NtSetInformationEnlistment(enlistmenthandle: HANDLE, enlistmentinformationclass: ENLISTMENT_INFORMATION_CLASS, enlistmentinformation: Long, enlistmentinformationlength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtSetInformationEnlistment", longArrayOf(enlistmenthandle, enlistmentinformationclass.toLong(), enlistmentinformation, enlistmentinformationlength.toLong())).toInt()
}

public fun NtSetInformationResourceManager(resourcemanagerhandle: HANDLE, resourcemanagerinformationclass: RESOURCEMANAGER_INFORMATION_CLASS, resourcemanagerinformation: Long, resourcemanagerinformationlength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtSetInformationResourceManager", longArrayOf(resourcemanagerhandle, resourcemanagerinformationclass.toLong(), resourcemanagerinformation, resourcemanagerinformationlength.toLong())).toInt()
}

public fun NtSetInformationTransaction(transactionhandle: HANDLE, transactioninformationclass: TRANSACTION_INFORMATION_CLASS, transactioninformation: Long, transactioninformationlength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtSetInformationTransaction", longArrayOf(transactionhandle, transactioninformationclass.toLong(), transactioninformation, transactioninformationlength.toLong())).toInt()
}

public fun NtSetInformationTransactionManager(tmhandle: HANDLE, transactionmanagerinformationclass: TRANSACTIONMANAGER_INFORMATION_CLASS, transactionmanagerinformation: Long, transactionmanagerinformationlength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtSetInformationTransactionManager", longArrayOf(tmhandle, transactionmanagerinformationclass.toLong(), transactionmanagerinformation, transactionmanagerinformationlength.toLong())).toInt()
}

public fun NtSinglePhaseReject(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtSinglePhaseReject", longArrayOf(enlistmenthandle, tmvirtualclock)).toInt()
}

public fun NtUnloadDriver(driverservicename: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtUnloadDriver", longArrayOf(driverservicename)).toInt()
}

public fun ObCloseHandle(handle: HANDLE, previousmode: Byte): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ObCloseHandle", longArrayOf(handle, previousmode.toLong())).toInt()
}

public fun ObDereferenceObjectDeferDelete(obj: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ObDereferenceObjectDeferDelete", longArrayOf(obj))
}

public fun ObDereferenceObjectDeferDeleteWithTag(obj: Long, tag: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ObDereferenceObjectDeferDeleteWithTag", longArrayOf(obj, tag.toLong()))
}

public fun ObGetFilterVersion(): UShort {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ObGetFilterVersion", longArrayOf()).toUShort()
}

public fun ObGetObjectSecurity(obj: Long, securitydescriptor: Long, memoryallocated: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ObGetObjectSecurity", longArrayOf(obj, securitydescriptor, memoryallocated)).toInt()
}

public fun ObReferenceObjectByHandle(handle: HANDLE, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte, obj: Long, handleinformation: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ObReferenceObjectByHandle", longArrayOf(handle, desiredaccess.toLong(), objecttype, accessmode.toLong(), obj, handleinformation)).toInt()
}

public fun ObReferenceObjectByHandleWithTag(handle: HANDLE, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte, tag: UInt, obj: Long, handleinformation: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ObReferenceObjectByHandleWithTag", longArrayOf(handle, desiredaccess.toLong(), objecttype, accessmode.toLong(), tag.toLong(), obj, handleinformation)).toInt()
}

public fun ObReferenceObjectByPointer(obj: Long, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ObReferenceObjectByPointer", longArrayOf(obj, desiredaccess.toLong(), objecttype, accessmode.toLong())).toInt()
}

public fun ObReferenceObjectByPointerWithTag(obj: Long, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte, tag: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ObReferenceObjectByPointerWithTag", longArrayOf(obj, desiredaccess.toLong(), objecttype, accessmode.toLong(), tag.toLong())).toInt()
}

public fun ObReferenceObjectSafe(obj: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "ObReferenceObjectSafe", longArrayOf(obj))
    return (rawRet and 0xFFL) != 0L
}

public fun ObReferenceObjectSafeWithTag(obj: Long, tag: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "ObReferenceObjectSafeWithTag", longArrayOf(obj, tag.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun ObRegisterCallbacks(callbackregistration: Long, registrationhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ObRegisterCallbacks", longArrayOf(callbackregistration, registrationhandle)).toInt()
}

public fun ObReleaseObjectSecurity(securitydescriptor: PSECURITY_DESCRIPTOR, memoryallocated: Boolean) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ObReleaseObjectSecurity", longArrayOf(securitydescriptor, if (memoryallocated) 1L else 0L))
}

public fun ObUnRegisterCallbacks(registrationhandle: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ObUnRegisterCallbacks", longArrayOf(registrationhandle))
}

public fun ObfDereferenceObject(obj: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ObfDereferenceObject", longArrayOf(obj))
}

public fun ObfDereferenceObjectWithTag(obj: Long, tag: UInt): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ObfDereferenceObjectWithTag", longArrayOf(obj, tag.toLong()))
}

public fun ObfReferenceObject(obj: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ObfReferenceObject", longArrayOf(obj))
}

public fun ObfReferenceObjectWithTag(obj: Long, tag: UInt): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ObfReferenceObjectWithTag", longArrayOf(obj, tag.toLong()))
}

public fun PcwAddInstance(buffer: PPCW_BUFFER, name: Long, id: UInt, count: UInt, data: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PcwAddInstance", longArrayOf(buffer, name, id.toLong(), count.toLong(), data)).toInt()
}

public fun PcwCloseInstance(instance: PPCW_INSTANCE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PcwCloseInstance", longArrayOf(instance))
}

public fun PcwCreateInstance(instance: Long, registration: PPCW_REGISTRATION, name: Long, count: UInt, data: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PcwCreateInstance", longArrayOf(instance, registration, name, count.toLong(), data)).toInt()
}

public fun PcwRegister(registration: Long, info: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PcwRegister", longArrayOf(registration, info)).toInt()
}

public fun PcwUnregister(registration: PPCW_REGISTRATION) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PcwUnregister", longArrayOf(registration))
}

public fun PoCallDriver(deviceobject: Long, irp: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PoCallDriver", longArrayOf(deviceobject, irp)).toInt()
}

public fun PoClearPowerRequest(powerrequest: Long, type: POWER_REQUEST_TYPE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PoClearPowerRequest", longArrayOf(powerrequest, type.toLong())).toInt()
}

public fun PoCreatePowerRequest(powerrequest: Long, deviceobject: Long, context: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PoCreatePowerRequest", longArrayOf(powerrequest, deviceobject, context)).toInt()
}

public fun PoCreateThermalRequest(thermalrequest: Long, targetdeviceobject: Long, policydeviceobject: Long, context: Long, flags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PoCreateThermalRequest", longArrayOf(thermalrequest, targetdeviceobject, policydeviceobject, context, flags.toLong())).toInt()
}

public fun PoDeletePowerRequest(powerrequest: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PoDeletePowerRequest", longArrayOf(powerrequest))
}

public fun PoDeleteThermalRequest(thermalrequest: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PoDeleteThermalRequest", longArrayOf(thermalrequest))
}

public fun PoEndDeviceBusy(idlepointer: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PoEndDeviceBusy", longArrayOf(idlepointer))
}

public fun PoFxActivateComponent(handle: POHANDLE, component: UInt, flags: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PoFxActivateComponent", longArrayOf(handle, component.toLong(), flags.toLong()))
}

public fun PoFxCompleteDevicePowerNotRequired(handle: POHANDLE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PoFxCompleteDevicePowerNotRequired", longArrayOf(handle))
}

public fun PoFxCompleteDirectedPowerDown(handle: POHANDLE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PoFxCompleteDirectedPowerDown", longArrayOf(handle))
}

public fun PoFxCompleteIdleCondition(handle: POHANDLE, component: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PoFxCompleteIdleCondition", longArrayOf(handle, component.toLong()))
}

public fun PoFxCompleteIdleState(handle: POHANDLE, component: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PoFxCompleteIdleState", longArrayOf(handle, component.toLong()))
}

public fun PoFxIdleComponent(handle: POHANDLE, component: UInt, flags: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PoFxIdleComponent", longArrayOf(handle, component.toLong(), flags.toLong()))
}

public fun PoFxIssueComponentPerfStateChange(handle: POHANDLE, flags: UInt, component: UInt, perfchange: Long, context: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PoFxIssueComponentPerfStateChange", longArrayOf(handle, flags.toLong(), component.toLong(), perfchange, context))
}

public fun PoFxIssueComponentPerfStateChangeMultiple(handle: POHANDLE, flags: UInt, component: UInt, perfchangescount: UInt, perfchanges: Long, context: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PoFxIssueComponentPerfStateChangeMultiple", longArrayOf(handle, flags.toLong(), component.toLong(), perfchangescount.toLong(), perfchanges, context))
}

public fun PoFxNotifySurprisePowerOn(pdo: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PoFxNotifySurprisePowerOn", longArrayOf(pdo))
}

public fun PoFxPowerControl(handle: POHANDLE, powercontrolcode: Long, inbuffer: Long, inbuffersize: ULong, outbuffer: Long, outbuffersize: ULong, bytesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PoFxPowerControl", longArrayOf(handle, powercontrolcode, inbuffer, inbuffersize.toLong(), outbuffer, outbuffersize.toLong(), bytesreturned)).toInt()
}

public fun PoFxPowerOnCrashdumpDevice(handle: POHANDLE, context: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PoFxPowerOnCrashdumpDevice", longArrayOf(handle, context)).toInt()
}

public fun PoFxQueryCurrentComponentPerfState(handle: POHANDLE, flags: UInt, component: UInt, setindex: UInt, currentperf: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PoFxQueryCurrentComponentPerfState", longArrayOf(handle, flags.toLong(), component.toLong(), setindex.toLong(), currentperf)).toInt()
}

public fun PoFxRegisterComponentPerfStates(handle: POHANDLE, component: UInt, flags: ULong, componentperfstatecallback: PPO_FX_COMPONENT_PERF_STATE_CALLBACK, inputstateinfo: Long, outputstateinfo: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PoFxRegisterComponentPerfStates", longArrayOf(handle, component.toLong(), flags.toLong(), Win32DynamicFfi.objectSlot(componentperfstatecallback), inputstateinfo, outputstateinfo)).toInt()
}

public fun PoFxRegisterCrashdumpDevice(handle: POHANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PoFxRegisterCrashdumpDevice", longArrayOf(handle)).toInt()
}

public fun PoFxRegisterDevice(pdo: Long, device: Long, handle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PoFxRegisterDevice", longArrayOf(pdo, device, handle)).toInt()
}

public fun PoFxRegisterDripsWatchdogCallback(handle: POHANDLE, callback: PPO_FX_DRIPS_WATCHDOG_CALLBACK, includechilddevices: Boolean, matchingdriverobject: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PoFxRegisterDripsWatchdogCallback", longArrayOf(handle, Win32DynamicFfi.objectSlot(callback), if (includechilddevices) 1L else 0L, matchingdriverobject))
}

public fun PoFxReportDevicePoweredOn(handle: POHANDLE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PoFxReportDevicePoweredOn", longArrayOf(handle))
}

public fun PoFxSetComponentLatency(handle: POHANDLE, component: UInt, latency: ULong) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PoFxSetComponentLatency", longArrayOf(handle, component.toLong(), latency.toLong()))
}

public fun PoFxSetComponentResidency(handle: POHANDLE, component: UInt, residency: ULong) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PoFxSetComponentResidency", longArrayOf(handle, component.toLong(), residency.toLong()))
}

public fun PoFxSetComponentWake(handle: POHANDLE, component: UInt, wakehint: Boolean) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PoFxSetComponentWake", longArrayOf(handle, component.toLong(), if (wakehint) 1L else 0L))
}

public fun PoFxSetDeviceIdleTimeout(handle: POHANDLE, idletimeout: ULong) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PoFxSetDeviceIdleTimeout", longArrayOf(handle, idletimeout.toLong()))
}

public fun PoFxSetTargetDripsDevicePowerState(handle: POHANDLE, targetstate: DEVICE_POWER_STATE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PoFxSetTargetDripsDevicePowerState", longArrayOf(handle, targetstate.toLong())).toInt()
}

public fun PoFxStartDevicePowerManagement(handle: POHANDLE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PoFxStartDevicePowerManagement", longArrayOf(handle))
}

public fun PoFxUnregisterDevice(handle: POHANDLE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PoFxUnregisterDevice", longArrayOf(handle))
}

public fun PoGetSystemWake(irp: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "PoGetSystemWake", longArrayOf(irp))
    return (rawRet and 0xFFL) != 0L
}

public fun PoGetThermalRequestSupport(thermalrequest: Long, type: PO_THERMAL_REQUEST_TYPE): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "PoGetThermalRequestSupport", longArrayOf(thermalrequest, type.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun PoQueryWatchdogTime(pdo: Long, secondsremaining: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "PoQueryWatchdogTime", longArrayOf(pdo, secondsremaining))
    return (rawRet and 0xFFL) != 0L
}

public fun PoRegisterDeviceForIdleDetection(deviceobject: Long, conservationidletime: UInt, performanceidletime: UInt, state: DEVICE_POWER_STATE): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PoRegisterDeviceForIdleDetection", longArrayOf(deviceobject, conservationidletime.toLong(), performanceidletime.toLong(), state.toLong()))
}

public fun PoRegisterPowerSettingCallback(deviceobject: Long, settingguid: Long, callback: PPOWER_SETTING_CALLBACK, context: Long, handle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PoRegisterPowerSettingCallback", longArrayOf(deviceobject, settingguid, Win32DynamicFfi.objectSlot(callback), context, handle)).toInt()
}

public fun PoRegisterSystemState(statehandle: Long, flags: UInt): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PoRegisterSystemState", longArrayOf(statehandle, flags.toLong()))
}

public fun PoRequestPowerIrp(deviceobject: Long, minorfunction: UByte, powerstate: POWER_STATE, completionfunction: PREQUEST_POWER_COMPLETE, context: Long, irp: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PoRequestPowerIrp", longArrayOf(deviceobject, minorfunction.toLong(), ((powerstate.SystemState.toLong() and 0xFFFF_FFFFL) or (powerstate.DeviceState.toLong() and 0xFFFF_FFFFL)), Win32DynamicFfi.objectSlot(completionfunction), context, irp)).toInt()
}

public fun PoSetDeviceBusyEx(idlepointer: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PoSetDeviceBusyEx", longArrayOf(idlepointer))
}

public fun PoSetHiberRange(memorymap: Long, flags: UInt, address: Long, length: ULong, tag: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PoSetHiberRange", longArrayOf(memorymap, flags.toLong(), address, length.toLong(), tag.toLong()))
}

public fun PoSetPowerRequest(powerrequest: Long, type: POWER_REQUEST_TYPE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PoSetPowerRequest", longArrayOf(powerrequest, type.toLong())).toInt()
}

public fun PoSetPowerState(deviceobject: Long, type: POWER_STATE_TYPE, state: POWER_STATE): POWER_STATE {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "PoSetPowerState", longArrayOf(deviceobject, type.toLong(), ((state.SystemState.toLong() and 0xFFFF_FFFFL) or (state.DeviceState.toLong() and 0xFFFF_FFFFL))))
    return POWER_STATE(SystemState = rawRet.toInt(), DeviceState = rawRet.toInt())
}

public fun PoSetSystemState(flags: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PoSetSystemState", longArrayOf(flags.toLong()))
}

public fun PoSetSystemWake(irp: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PoSetSystemWake", longArrayOf(irp))
}

public fun PoSetSystemWakeDevice(deviceobject: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PoSetSystemWakeDevice", longArrayOf(deviceobject))
}

public fun PoSetThermalActiveCooling(thermalrequest: Long, engaged: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PoSetThermalActiveCooling", longArrayOf(thermalrequest, if (engaged) 1L else 0L)).toInt()
}

public fun PoSetThermalPassiveCooling(thermalrequest: Long, throttle: UByte): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PoSetThermalPassiveCooling", longArrayOf(thermalrequest, throttle.toLong())).toInt()
}

public fun PoStartDeviceBusy(idlepointer: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PoStartDeviceBusy", longArrayOf(idlepointer))
}

public fun PoStartNextPowerIrp(irp: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PoStartNextPowerIrp", longArrayOf(irp))
}

public fun PoUnregisterPowerSettingCallback(handle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PoUnregisterPowerSettingCallback", longArrayOf(handle)).toInt()
}

public fun PoUnregisterSystemState(statehandle: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PoUnregisterSystemState", longArrayOf(statehandle))
}

public fun ProbeForRead(address: Long, length: ULong, alignment: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ProbeForRead", longArrayOf(address, length.toLong(), alignment.toLong()))
}

public fun ProbeForWrite(address: Long, length: ULong, alignment: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ProbeForWrite", longArrayOf(address, length.toLong(), alignment.toLong()))
}

public fun PsAcquireSiloHardReference(silo: PESILO): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsAcquireSiloHardReference", longArrayOf(silo)).toInt()
}

public fun PsAllocSiloContextSlot(reserved: ULong, returnedcontextslot: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsAllocSiloContextSlot", longArrayOf(reserved.toLong(), returnedcontextslot)).toInt()
}

public fun PsAllocateAffinityToken(affinitytoken: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsAllocateAffinityToken", longArrayOf(affinitytoken)).toInt()
}

public fun PsAttachSiloToCurrentThread(silo: PESILO): PESILO {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsAttachSiloToCurrentThread", longArrayOf(silo))
}

public fun PsCreateSiloContext(silo: PESILO, size: UInt, pooltype: POOL_TYPE, contextcleanupcallback: SILO_CONTEXT_CLEANUP_CALLBACK, returnedsilocontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsCreateSiloContext", longArrayOf(silo, size.toLong(), pooltype.toLong(), Win32DynamicFfi.objectSlot(contextcleanupcallback), returnedsilocontext)).toInt()
}

public fun PsCreateSystemThread(threadhandle: Long, desiredaccess: UInt, objectattributes: Long, processhandle: HANDLE, clientid: Long, startroutine: PKSTART_ROUTINE, startcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsCreateSystemThread", longArrayOf(threadhandle, desiredaccess.toLong(), objectattributes, processhandle, clientid, Win32DynamicFfi.objectSlot(startroutine), startcontext)).toInt()
}

public fun PsDereferenceSiloContext(silocontext: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PsDereferenceSiloContext", longArrayOf(silocontext))
}

public fun PsDetachSiloFromCurrentThread(previoussilo: PESILO) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PsDetachSiloFromCurrentThread", longArrayOf(previoussilo))
}

public fun PsFreeAffinityToken(affinitytoken: PAFFINITY_TOKEN) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PsFreeAffinityToken", longArrayOf(affinitytoken))
}

public fun PsFreeSiloContextSlot(contextslot: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsFreeSiloContextSlot", longArrayOf(contextslot.toLong())).toInt()
}

public fun PsGetCurrentProcessId(): HANDLE {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsGetCurrentProcessId", longArrayOf())
}

public fun PsGetCurrentServerSilo(): PESILO {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsGetCurrentServerSilo", longArrayOf())
}

public fun PsGetCurrentServerSiloName(): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsGetCurrentServerSiloName", longArrayOf())
}

public fun PsGetCurrentSilo(): PESILO {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsGetCurrentSilo", longArrayOf())
}

public fun PsGetCurrentThreadId(): HANDLE {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsGetCurrentThreadId", longArrayOf())
}

public fun PsGetCurrentThreadTeb(): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsGetCurrentThreadTeb", longArrayOf())
}

public fun PsGetEffectiveServerSilo(silo: PESILO): PESILO {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsGetEffectiveServerSilo", longArrayOf(silo))
}

public fun PsGetHostSilo(): PESILO {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsGetHostSilo", longArrayOf())
}

public fun PsGetJobServerSilo(job: PEJOB, serversilo: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsGetJobServerSilo", longArrayOf(job, serversilo)).toInt()
}

public fun PsGetJobSilo(job: PEJOB, silo: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsGetJobSilo", longArrayOf(job, silo)).toInt()
}

public fun PsGetParentSilo(job: PEJOB): PESILO {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsGetParentSilo", longArrayOf(job))
}

public fun PsGetPermanentSiloContext(silo: PESILO, contextslot: UInt, returnedsilocontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsGetPermanentSiloContext", longArrayOf(silo, contextslot.toLong(), returnedsilocontext)).toInt()
}

public fun PsGetProcessCreateTimeQuadPart(process: PEPROCESS): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsGetProcessCreateTimeQuadPart", longArrayOf(process))
}

public fun PsGetProcessExitStatus(process: PEPROCESS): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsGetProcessExitStatus", longArrayOf(process)).toInt()
}

public fun PsGetProcessId(process: PEPROCESS): HANDLE {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsGetProcessId", longArrayOf(process))
}

public fun PsGetProcessStartKey(process: PEPROCESS): ULong {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsGetProcessStartKey", longArrayOf(process)).toULong()
}

public fun PsGetServerSiloServiceSessionId(silo: PESILO): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsGetServerSiloServiceSessionId", longArrayOf(silo)).toUInt()
}

public fun PsGetSiloContainerId(silo: PESILO): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsGetSiloContainerId", longArrayOf(silo))
}

public fun PsGetSiloContext(silo: PESILO, contextslot: UInt, returnedsilocontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsGetSiloContext", longArrayOf(silo, contextslot.toLong(), returnedsilocontext)).toInt()
}

public fun PsGetSiloMonitorContextSlot(monitor: PSILO_MONITOR): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsGetSiloMonitorContextSlot", longArrayOf(monitor)).toUInt()
}

public fun PsGetThreadCreateTime(thread: PETHREAD): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsGetThreadCreateTime", longArrayOf(thread))
}

public fun PsGetThreadExitStatus(thread: PETHREAD): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsGetThreadExitStatus", longArrayOf(thread)).toInt()
}

public fun PsGetThreadId(thread: PETHREAD): HANDLE {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsGetThreadId", longArrayOf(thread))
}

public fun PsGetThreadProcessId(thread: PETHREAD): HANDLE {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsGetThreadProcessId", longArrayOf(thread))
}

public fun PsGetThreadProperty(thread: PETHREAD, key: ULong, flags: UInt): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsGetThreadProperty", longArrayOf(thread, key.toLong(), flags.toLong()))
}

public fun PsGetThreadServerSilo(thread: PETHREAD): PESILO {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsGetThreadServerSilo", longArrayOf(thread))
}

public fun PsGetVersion(majorversion: Long, minorversion: Long, buildnumber: Long, csdversion: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "PsGetVersion", longArrayOf(majorversion, minorversion, buildnumber, csdversion))
    return (rawRet and 0xFFL) != 0L
}

public fun PsInsertPermanentSiloContext(silo: PESILO, contextslot: UInt, silocontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsInsertPermanentSiloContext", longArrayOf(silo, contextslot.toLong(), silocontext)).toInt()
}

public fun PsInsertSiloContext(silo: PESILO, contextslot: UInt, silocontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsInsertSiloContext", longArrayOf(silo, contextslot.toLong(), silocontext)).toInt()
}

public fun PsIsCurrentThreadInServerSilo(): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "PsIsCurrentThreadInServerSilo", longArrayOf())
    return (rawRet and 0xFFL) != 0L
}

public fun PsIsCurrentThreadPrefetching(): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "PsIsCurrentThreadPrefetching", longArrayOf())
    return (rawRet and 0xFFL) != 0L
}

public fun PsIsHostSilo(silo: PESILO): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "PsIsHostSilo", longArrayOf(silo))
    return (rawRet and 0xFFL) != 0L
}

public fun PsMakeSiloContextPermanent(silo: PESILO, contextslot: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsMakeSiloContextPermanent", longArrayOf(silo, contextslot.toLong())).toInt()
}

public fun PsQueryTotalCycleTimeProcess(process: PEPROCESS, cycletimestamp: Long): ULong {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsQueryTotalCycleTimeProcess", longArrayOf(process, cycletimestamp)).toULong()
}

public fun PsReferenceSiloContext(silocontext: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PsReferenceSiloContext", longArrayOf(silocontext))
}

public fun PsRegisterSiloMonitor(registration: Long, returnedmonitor: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsRegisterSiloMonitor", longArrayOf(registration, returnedmonitor)).toInt()
}

public fun PsReleaseSiloHardReference(silo: PESILO) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PsReleaseSiloHardReference", longArrayOf(silo))
}

public fun PsRemoveCreateThreadNotifyRoutine(notifyroutine: PCREATE_THREAD_NOTIFY_ROUTINE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsRemoveCreateThreadNotifyRoutine", longArrayOf(Win32DynamicFfi.objectSlot(notifyroutine))).toInt()
}

public fun PsRemoveLoadImageNotifyRoutine(notifyroutine: PLOAD_IMAGE_NOTIFY_ROUTINE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsRemoveLoadImageNotifyRoutine", longArrayOf(Win32DynamicFfi.objectSlot(notifyroutine))).toInt()
}

public fun PsRemoveSiloContext(silo: PESILO, contextslot: UInt, removedsilocontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsRemoveSiloContext", longArrayOf(silo, contextslot.toLong(), removedsilocontext)).toInt()
}

public fun PsReplaceSiloContext(silo: PESILO, contextslot: UInt, newsilocontext: Long, oldsilocontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsReplaceSiloContext", longArrayOf(silo, contextslot.toLong(), newsilocontext, oldsilocontext)).toInt()
}

public fun PsRevertToUserMultipleGroupAffinityThread(affinitytoken: PAFFINITY_TOKEN) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PsRevertToUserMultipleGroupAffinityThread", longArrayOf(affinitytoken))
}

public fun PsSetCreateProcessNotifyRoutine(notifyroutine: PCREATE_PROCESS_NOTIFY_ROUTINE, remove: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsSetCreateProcessNotifyRoutine", longArrayOf(Win32DynamicFfi.objectSlot(notifyroutine), if (remove) 1L else 0L)).toInt()
}

public fun PsSetCreateProcessNotifyRoutineEx(notifyroutine: PCREATE_PROCESS_NOTIFY_ROUTINE_EX, remove: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsSetCreateProcessNotifyRoutineEx", longArrayOf(Win32DynamicFfi.objectSlot(notifyroutine), if (remove) 1L else 0L)).toInt()
}

public fun PsSetCreateProcessNotifyRoutineEx2(notifytype: PSCREATEPROCESSNOTIFYTYPE, notifyinformation: Long, remove: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsSetCreateProcessNotifyRoutineEx2", longArrayOf(notifytype.toLong(), notifyinformation, if (remove) 1L else 0L)).toInt()
}

public fun PsSetCreateThreadNotifyRoutine(notifyroutine: PCREATE_THREAD_NOTIFY_ROUTINE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsSetCreateThreadNotifyRoutine", longArrayOf(Win32DynamicFfi.objectSlot(notifyroutine))).toInt()
}

public fun PsSetCreateThreadNotifyRoutineEx(notifytype: PSCREATETHREADNOTIFYTYPE, notifyinformation: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsSetCreateThreadNotifyRoutineEx", longArrayOf(notifytype.toLong(), notifyinformation)).toInt()
}

public fun PsSetCurrentThreadPrefetching(prefetching: Boolean): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "PsSetCurrentThreadPrefetching", longArrayOf(if (prefetching) 1L else 0L))
    return (rawRet and 0xFFL) != 0L
}

public fun PsSetLoadImageNotifyRoutine(notifyroutine: PLOAD_IMAGE_NOTIFY_ROUTINE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsSetLoadImageNotifyRoutine", longArrayOf(Win32DynamicFfi.objectSlot(notifyroutine))).toInt()
}

public fun PsSetLoadImageNotifyRoutineEx(notifyroutine: PLOAD_IMAGE_NOTIFY_ROUTINE, flags: ULong): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsSetLoadImageNotifyRoutineEx", longArrayOf(Win32DynamicFfi.objectSlot(notifyroutine), flags.toLong())).toInt()
}

public fun PsSetSystemMultipleGroupAffinityThread(groupaffinities: Long, groupcount: UShort, affinitytoken: PAFFINITY_TOKEN): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsSetSystemMultipleGroupAffinityThread", longArrayOf(groupaffinities, groupcount.toLong(), affinitytoken)).toInt()
}

public fun PsStartSiloMonitor(monitor: PSILO_MONITOR): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsStartSiloMonitor", longArrayOf(monitor)).toInt()
}

public fun PsTerminateServerSilo(serversilo: PESILO, exitstatus: NTSTATUS) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PsTerminateServerSilo", longArrayOf(serversilo, exitstatus.toLong()))
}

public fun PsTerminateSystemThread(exitstatus: NTSTATUS): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsTerminateSystemThread", longArrayOf(exitstatus.toLong())).toInt()
}

public fun PsUnregisterSiloMonitor(monitor: PSILO_MONITOR) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PsUnregisterSiloMonitor", longArrayOf(monitor))
}

public fun PsWrapApcWow64Thread(apccontext: Long, apcroutine: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsWrapApcWow64Thread", longArrayOf(apccontext, apcroutine)).toInt()
}

public fun PshedAllocateMemory(size: UInt): Long {
    return Win32DynamicFfi.invoke("pshed.dll", "PshedAllocateMemory", longArrayOf(size.toLong()))
}

public fun PshedFreeMemory(address: Long) {
    Win32DynamicFfi.invoke("pshed.dll", "PshedFreeMemory", longArrayOf(address))
}

public fun PshedIsSystemWheaEnabled(): Boolean {
    val rawRet = Win32DynamicFfi.invoke("pshed.dll", "PshedIsSystemWheaEnabled", longArrayOf())
    return (rawRet and 0xFFL) != 0L
}

public fun PshedRegisterPlugin(packet: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("pshed.dll", "PshedRegisterPlugin", longArrayOf(packet)).toInt()
}

public fun PshedSynchronizeExecution(errorsource: Long, synchronizeroutine: PKSYNCHRONIZE_ROUTINE, synchronizecontext: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("pshed.dll", "PshedSynchronizeExecution", longArrayOf(errorsource, Win32DynamicFfi.objectSlot(synchronizeroutine), synchronizecontext))
    return (rawRet and 0xFFL) != 0L
}

public fun PshedUnregisterPlugin(pluginhandle: Long) {
    Win32DynamicFfi.invoke("pshed.dll", "PshedUnregisterPlugin", longArrayOf(pluginhandle))
}

public fun RtlAppendUnicodeStringToString(destination: Long, source: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlAppendUnicodeStringToString", longArrayOf(destination, source)).toInt()
}

public fun RtlAppendUnicodeToString(destination: Long, source: PCWSTR): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlAppendUnicodeToString", longArrayOf(destination, source)).toInt()
}

public fun RtlAreBitsClear(bitmapheader: Long, startingindex: UInt, length: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlAreBitsClear", longArrayOf(bitmapheader, startingindex.toLong(), length.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlAreBitsSet(bitmapheader: Long, startingindex: UInt, length: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlAreBitsSet", longArrayOf(bitmapheader, startingindex.toLong(), length.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlAssert(voidfailedassertion: Long, voidfilename: Long, linenumber: UInt, mutablemessage: PCSTR) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlAssert", longArrayOf(voidfailedassertion, voidfilename, linenumber.toLong(), mutablemessage))
}

public fun RtlCheckRegistryKey(relativeto: UInt, path: PCWSTR): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlCheckRegistryKey", longArrayOf(relativeto.toLong(), path)).toInt()
}

public fun RtlClearAllBits(bitmapheader: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlClearAllBits", longArrayOf(bitmapheader))
}

public fun RtlClearBit(bitmapheader: Long, bitnumber: UInt) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlClearBit", longArrayOf(bitmapheader, bitnumber.toLong()))
}

public fun RtlClearBits(bitmapheader: Long, startingindex: UInt, numbertoclear: UInt) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlClearBits", longArrayOf(bitmapheader, startingindex.toLong(), numbertoclear.toLong()))
}

public fun RtlCmDecodeMemIoResource(descriptor: Long, start: Long): ULong {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlCmDecodeMemIoResource", longArrayOf(descriptor, start)).toULong()
}

public fun RtlCmEncodeMemIoResource(descriptor: Long, type: UByte, length: ULong, start: ULong): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlCmEncodeMemIoResource", longArrayOf(descriptor, type.toLong(), length.toLong(), start.toLong())).toInt()
}

public fun RtlCompareString(string1: Long, string2: Long, caseinsensitive: Boolean): Int {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlCompareString", longArrayOf(string1, string2, if (caseinsensitive) 1L else 0L)).toInt()
}

public fun RtlCompareUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Int {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlCompareUnicodeString", longArrayOf(string1, string2, if (caseinsensitive) 1L else 0L)).toInt()
}

public fun RtlCompareUnicodeStrings(string1: Long, string1length: ULong, string2: Long, string2length: ULong, caseinsensitive: Boolean): Int {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlCompareUnicodeStrings", longArrayOf(string1, string1length.toLong(), string2, string2length.toLong(), if (caseinsensitive) 1L else 0L)).toInt()
}

public fun RtlContractHashTable(hashtable: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlContractHashTable", longArrayOf(hashtable))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlCopyBitMap(source: Long, destination: Long, targetbit: UInt) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlCopyBitMap", longArrayOf(source, destination, targetbit.toLong()))
}

public fun RtlCopyString(destinationstring: Long, sourcestring: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlCopyString", longArrayOf(destinationstring, sourcestring))
}

public fun RtlCopyUnicodeString(destinationstring: Long, sourcestring: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlCopyUnicodeString", longArrayOf(destinationstring, sourcestring))
}

public fun RtlCreateHashTable(hashtable: Long, shift: UInt, flags: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlCreateHashTable", longArrayOf(hashtable, shift.toLong(), flags.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlCreateHashTableEx(hashtable: Long, initialsize: UInt, shift: UInt, flags: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlCreateHashTableEx", longArrayOf(hashtable, initialsize.toLong(), shift.toLong(), flags.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlCreateRegistryKey(relativeto: UInt, path: PCWSTR): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlCreateRegistryKey", longArrayOf(relativeto.toLong(), path)).toInt()
}

public fun RtlCreateSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, revision: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlCreateSecurityDescriptor", longArrayOf(securitydescriptor, revision.toLong())).toInt()
}

public fun RtlDelete(links: Long): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlDelete", longArrayOf(links))
}

public fun RtlDeleteElementGenericTable(table: Long, buffer: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlDeleteElementGenericTable", longArrayOf(table, buffer))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlDeleteElementGenericTableAvl(table: Long, buffer: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlDeleteElementGenericTableAvl", longArrayOf(table, buffer))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlDeleteElementGenericTableAvlEx(table: Long, nodeorparent: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlDeleteElementGenericTableAvlEx", longArrayOf(table, nodeorparent))
}

public fun RtlDeleteHashTable(hashtable: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlDeleteHashTable", longArrayOf(hashtable))
}

public fun RtlDeleteNoSplay(links: Long, root: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlDeleteNoSplay", longArrayOf(links, root))
}

public fun RtlDeleteRegistryValue(relativeto: UInt, path: PCWSTR, valuename: PCWSTR): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlDeleteRegistryValue", longArrayOf(relativeto.toLong(), path, valuename)).toInt()
}

public fun RtlDowncaseUnicodeChar(sourcecharacter: UShort): UShort {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlDowncaseUnicodeChar", longArrayOf(sourcecharacter.toLong())).toUShort()
}

public fun RtlEndEnumerationHashTable(hashtable: Long, enumerator: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlEndEnumerationHashTable", longArrayOf(hashtable, enumerator))
}

public fun RtlEndStrongEnumerationHashTable(hashtable: Long, enumerator: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlEndStrongEnumerationHashTable", longArrayOf(hashtable, enumerator))
}

public fun RtlEndWeakEnumerationHashTable(hashtable: Long, enumerator: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlEndWeakEnumerationHashTable", longArrayOf(hashtable, enumerator))
}

public fun RtlEnumerateEntryHashTable(hashtable: Long, enumerator: Long): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlEnumerateEntryHashTable", longArrayOf(hashtable, enumerator))
}

public fun RtlEnumerateGenericTable(table: Long, restart: Boolean): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlEnumerateGenericTable", longArrayOf(table, if (restart) 1L else 0L))
}

public fun RtlEnumerateGenericTableAvl(table: Long, restart: Boolean): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlEnumerateGenericTableAvl", longArrayOf(table, if (restart) 1L else 0L))
}

public fun RtlEnumerateGenericTableLikeADirectory(table: Long, matchfunction: PRTL_AVL_MATCH_FUNCTION, matchdata: Long, nextflag: UInt, restartkey: Long, deletecount: Long, buffer: Long): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlEnumerateGenericTableLikeADirectory", longArrayOf(table, Win32DynamicFfi.objectSlot(matchfunction), matchdata, nextflag.toLong(), restartkey, deletecount, buffer))
}

public fun RtlEnumerateGenericTableWithoutSplaying(table: Long, restartkey: Long): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlEnumerateGenericTableWithoutSplaying", longArrayOf(table, restartkey))
}

public fun RtlEnumerateGenericTableWithoutSplayingAvl(table: Long, restartkey: Long): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlEnumerateGenericTableWithoutSplayingAvl", longArrayOf(table, restartkey))
}

public fun RtlEqualString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlEqualString", longArrayOf(string1, string2, if (caseinsensitive) 1L else 0L))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlEqualUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlEqualUnicodeString", longArrayOf(string1, string2, if (caseinsensitive) 1L else 0L))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlExpandHashTable(hashtable: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlExpandHashTable", longArrayOf(hashtable))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlExtractBitMap(source: Long, destination: Long, targetbit: UInt, numberofbits: UInt) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlExtractBitMap", longArrayOf(source, destination, targetbit.toLong(), numberofbits.toLong()))
}

public fun RtlFindClearBits(bitmapheader: Long, numbertofind: UInt, hintindex: UInt): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlFindClearBits", longArrayOf(bitmapheader, numbertofind.toLong(), hintindex.toLong())).toUInt()
}

public fun RtlFindClearBitsAndSet(bitmapheader: Long, numbertofind: UInt, hintindex: UInt): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlFindClearBitsAndSet", longArrayOf(bitmapheader, numbertofind.toLong(), hintindex.toLong())).toUInt()
}

public fun RtlFindClearRuns(bitmapheader: Long, runarray: Long, sizeofrunarray: UInt, locatelongestruns: Boolean): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlFindClearRuns", longArrayOf(bitmapheader, runarray, sizeofrunarray.toLong(), if (locatelongestruns) 1L else 0L)).toUInt()
}

public fun RtlFindClosestEncodableLength(sourcelength: ULong, targetlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlFindClosestEncodableLength", longArrayOf(sourcelength.toLong(), targetlength)).toInt()
}

public fun RtlFindFirstRunClear(bitmapheader: Long, startingindex: Long): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlFindFirstRunClear", longArrayOf(bitmapheader, startingindex)).toUInt()
}

public fun RtlFindLastBackwardRunClear(bitmapheader: Long, fromindex: UInt, startingrunindex: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlFindLastBackwardRunClear", longArrayOf(bitmapheader, fromindex.toLong(), startingrunindex)).toUInt()
}

public fun RtlFindLeastSignificantBit(set: ULong): Byte {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlFindLeastSignificantBit", longArrayOf(set.toLong())).toByte()
}

public fun RtlFindLongestRunClear(bitmapheader: Long, startingindex: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlFindLongestRunClear", longArrayOf(bitmapheader, startingindex)).toUInt()
}

public fun RtlFindMostSignificantBit(set: ULong): Byte {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlFindMostSignificantBit", longArrayOf(set.toLong())).toByte()
}

public fun RtlFindNextForwardRunClear(bitmapheader: Long, fromindex: UInt, startingrunindex: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlFindNextForwardRunClear", longArrayOf(bitmapheader, fromindex.toLong(), startingrunindex)).toUInt()
}

public fun RtlFindSetBits(bitmapheader: Long, numbertofind: UInt, hintindex: UInt): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlFindSetBits", longArrayOf(bitmapheader, numbertofind.toLong(), hintindex.toLong())).toUInt()
}

public fun RtlFindSetBitsAndClear(bitmapheader: Long, numbertofind: UInt, hintindex: UInt): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlFindSetBitsAndClear", longArrayOf(bitmapheader, numbertofind.toLong(), hintindex.toLong())).toUInt()
}

public fun RtlFreeUTF8String(utf8string: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlFreeUTF8String", longArrayOf(utf8string))
}

public fun RtlGUIDFromString(guidstring: Long, guid: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlGUIDFromString", longArrayOf(guidstring, guid)).toInt()
}

public fun RtlGenerateClass5Guid(namespaceguid: Long, buffer: Long, buffersize: UInt, guid: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlGenerateClass5Guid", longArrayOf(namespaceguid, buffer, buffersize.toLong(), guid)).toInt()
}

public fun RtlGetActiveConsoleId(): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlGetActiveConsoleId", longArrayOf()).toUInt()
}

public fun RtlGetCallersAddress(callersaddress: Long, callerscaller: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlGetCallersAddress", longArrayOf(callersaddress, callerscaller))
}

public fun RtlGetConsoleSessionForegroundProcessId(): ULong {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlGetConsoleSessionForegroundProcessId", longArrayOf()).toULong()
}

public fun RtlGetElementGenericTable(table: Long, i: UInt): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlGetElementGenericTable", longArrayOf(table, i.toLong()))
}

public fun RtlGetElementGenericTableAvl(table: Long, i: UInt): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlGetElementGenericTableAvl", longArrayOf(table, i.toLong()))
}

public fun RtlGetEnabledExtendedFeatures(featuremask: ULong): ULong {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlGetEnabledExtendedFeatures", longArrayOf(featuremask.toLong())).toULong()
}

public fun RtlGetNextEntryHashTable(hashtable: Long, context: Long): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlGetNextEntryHashTable", longArrayOf(hashtable, context))
}

public fun RtlGetNtProductType(ntproducttype: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlGetNtProductType", longArrayOf(ntproducttype))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlGetNtSystemRoot(): PCWSTR {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlGetNtSystemRoot", longArrayOf())
}

public fun RtlGetPersistedStateLocation(sourceid: PCWSTR, customvalue: PCWSTR, defaultpath: PCWSTR, statelocationtype: STATE_LOCATION_TYPE, targetpath: PWSTR, bufferlengthin: UInt, bufferlengthout: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlGetPersistedStateLocation", longArrayOf(sourceid, customvalue, defaultpath, statelocationtype.toLong(), targetpath, bufferlengthin.toLong(), bufferlengthout)).toInt()
}

public fun RtlGetSuiteMask(): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlGetSuiteMask", longArrayOf()).toUInt()
}

public fun RtlGetVersion(lpversioninformation: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlGetVersion", longArrayOf(lpversioninformation)).toInt()
}

public fun RtlHashUnicodeString(string: Long, caseinsensitive: Boolean, hashalgorithm: UInt, hashvalue: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlHashUnicodeString", longArrayOf(string, if (caseinsensitive) 1L else 0L, hashalgorithm.toLong(), hashvalue)).toInt()
}

public fun RtlInitEnumerationHashTable(hashtable: Long, enumerator: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlInitEnumerationHashTable", longArrayOf(hashtable, enumerator))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlInitStrongEnumerationHashTable(hashtable: Long, enumerator: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlInitStrongEnumerationHashTable", longArrayOf(hashtable, enumerator))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlInitUTF8String(destinationstring: Long, sourcestring: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlInitUTF8String", longArrayOf(destinationstring, sourcestring))
}

public fun RtlInitUTF8StringEx(destinationstring: Long, sourcestring: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlInitUTF8StringEx", longArrayOf(destinationstring, sourcestring)).toInt()
}

public fun RtlInitWeakEnumerationHashTable(hashtable: Long, enumerator: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlInitWeakEnumerationHashTable", longArrayOf(hashtable, enumerator))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlInitializeBitMap(bitmapheader: Long, bitmapbuffer: Long, sizeofbitmap: UInt) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlInitializeBitMap", longArrayOf(bitmapheader, bitmapbuffer, sizeofbitmap.toLong()))
}

public fun RtlInitializeGenericTable(table: Long, compareroutine: PRTL_GENERIC_COMPARE_ROUTINE, allocateroutine: PRTL_GENERIC_ALLOCATE_ROUTINE, freeroutine: PRTL_GENERIC_FREE_ROUTINE, tablecontext: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlInitializeGenericTable", longArrayOf(table, Win32DynamicFfi.objectSlot(compareroutine), Win32DynamicFfi.objectSlot(allocateroutine), Win32DynamicFfi.objectSlot(freeroutine), tablecontext))
}

public fun RtlInitializeGenericTableAvl(table: Long, compareroutine: PRTL_AVL_COMPARE_ROUTINE, allocateroutine: PRTL_AVL_ALLOCATE_ROUTINE, freeroutine: PRTL_AVL_FREE_ROUTINE, tablecontext: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlInitializeGenericTableAvl", longArrayOf(table, Win32DynamicFfi.objectSlot(compareroutine), Win32DynamicFfi.objectSlot(allocateroutine), Win32DynamicFfi.objectSlot(freeroutine), tablecontext))
}

public fun RtlInsertElementGenericTable(table: Long, buffer: Long, buffersize: UInt, newelement: Long): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlInsertElementGenericTable", longArrayOf(table, buffer, buffersize.toLong(), newelement))
}

public fun RtlInsertElementGenericTableAvl(table: Long, buffer: Long, buffersize: UInt, newelement: Long): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlInsertElementGenericTableAvl", longArrayOf(table, buffer, buffersize.toLong(), newelement))
}

public fun RtlInsertElementGenericTableFull(table: Long, buffer: Long, buffersize: UInt, newelement: Long, nodeorparent: Long, searchresult: TABLE_SEARCH_RESULT): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlInsertElementGenericTableFull", longArrayOf(table, buffer, buffersize.toLong(), newelement, nodeorparent, searchresult.toLong()))
}

public fun RtlInsertElementGenericTableFullAvl(table: Long, buffer: Long, buffersize: UInt, newelement: Long, nodeorparent: Long, searchresult: TABLE_SEARCH_RESULT): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlInsertElementGenericTableFullAvl", longArrayOf(table, buffer, buffersize.toLong(), newelement, nodeorparent, searchresult.toLong()))
}

public fun RtlInsertEntryHashTable(hashtable: Long, entry: Long, signature: ULong, context: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlInsertEntryHashTable", longArrayOf(hashtable, entry, signature.toLong(), context))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlInt64ToUnicodeString(value: ULong, base: UInt, string: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlInt64ToUnicodeString", longArrayOf(value.toLong(), base.toLong(), string)).toInt()
}

public fun RtlIntegerToUnicodeString(value: UInt, base: UInt, string: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlIntegerToUnicodeString", longArrayOf(value.toLong(), base.toLong(), string)).toInt()
}

public fun RtlIoDecodeMemIoResource(descriptor: Long, alignment: Long, minimumaddress: Long, maximumaddress: Long): ULong {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlIoDecodeMemIoResource", longArrayOf(descriptor, alignment, minimumaddress, maximumaddress)).toULong()
}

public fun RtlIoEncodeMemIoResource(descriptor: Long, type: UByte, length: ULong, alignment: ULong, minimumaddress: ULong, maximumaddress: ULong): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlIoEncodeMemIoResource", longArrayOf(descriptor, type.toLong(), length.toLong(), alignment.toLong(), minimumaddress.toLong(), maximumaddress.toLong())).toInt()
}

public fun RtlIsApiSetImplemented(apisetname: PCSTR): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlIsApiSetImplemented", longArrayOf(apisetname)).toInt()
}

public fun RtlIsGenericTableEmpty(table: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlIsGenericTableEmpty", longArrayOf(table))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlIsGenericTableEmptyAvl(table: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlIsGenericTableEmptyAvl", longArrayOf(table))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlIsMultiSessionSku(): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlIsMultiSessionSku", longArrayOf())
    return (rawRet and 0xFFL) != 0L
}

public fun RtlIsMultiUsersInSessionSku(): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlIsMultiUsersInSessionSku", longArrayOf())
    return (rawRet and 0xFFL) != 0L
}

public fun RtlIsNtDdiVersionAvailable(version: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlIsNtDdiVersionAvailable", longArrayOf(version.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlIsServicePackVersionInstalled(version: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlIsServicePackVersionInstalled", longArrayOf(version.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlIsStateSeparationEnabled(): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlIsStateSeparationEnabled", longArrayOf())
    return (rawRet and 0xFFL) != 0L
}

public fun RtlIsUntrustedObject(handle: HANDLE, obj: Long, untrustedobject: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlIsUntrustedObject", longArrayOf(handle, obj, untrustedobject)).toInt()
}

public fun RtlLengthSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlLengthSecurityDescriptor", longArrayOf(securitydescriptor)).toUInt()
}

public fun RtlLookupElementGenericTable(table: Long, buffer: Long): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlLookupElementGenericTable", longArrayOf(table, buffer))
}

public fun RtlLookupElementGenericTableAvl(table: Long, buffer: Long): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlLookupElementGenericTableAvl", longArrayOf(table, buffer))
}

public fun RtlLookupElementGenericTableFull(table: Long, buffer: Long, nodeorparent: Long, searchresult: Long): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlLookupElementGenericTableFull", longArrayOf(table, buffer, nodeorparent, searchresult))
}

public fun RtlLookupElementGenericTableFullAvl(table: Long, buffer: Long, nodeorparent: Long, searchresult: Long): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlLookupElementGenericTableFullAvl", longArrayOf(table, buffer, nodeorparent, searchresult))
}

public fun RtlLookupEntryHashTable(hashtable: Long, signature: ULong, context: Long): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlLookupEntryHashTable", longArrayOf(hashtable, signature.toLong(), context))
}

public fun RtlLookupFirstMatchingElementGenericTableAvl(table: Long, buffer: Long, restartkey: Long): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlLookupFirstMatchingElementGenericTableAvl", longArrayOf(table, buffer, restartkey))
}

public fun RtlMapGenericMask(accessmask: Long, genericmapping: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlMapGenericMask", longArrayOf(accessmask, genericmapping))
}

public fun RtlNormalizeSecurityDescriptor(securitydescriptor: Long, securitydescriptorlength: UInt, newsecuritydescriptor: Long, newsecuritydescriptorlength: Long, checkonly: Boolean): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlNormalizeSecurityDescriptor", longArrayOf(securitydescriptor, securitydescriptorlength.toLong(), newsecuritydescriptor, newsecuritydescriptorlength, if (checkonly) 1L else 0L))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlNumberGenericTableElements(table: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlNumberGenericTableElements", longArrayOf(table)).toUInt()
}

public fun RtlNumberGenericTableElementsAvl(table: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlNumberGenericTableElementsAvl", longArrayOf(table)).toUInt()
}

public fun RtlNumberOfClearBits(bitmapheader: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlNumberOfClearBits", longArrayOf(bitmapheader)).toUInt()
}

public fun RtlNumberOfClearBitsInRange(bitmapheader: Long, startingindex: UInt, length: UInt): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlNumberOfClearBitsInRange", longArrayOf(bitmapheader, startingindex.toLong(), length.toLong())).toUInt()
}

public fun RtlNumberOfSetBits(bitmapheader: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlNumberOfSetBits", longArrayOf(bitmapheader)).toUInt()
}

public fun RtlNumberOfSetBitsInRange(bitmapheader: Long, startingindex: UInt, length: UInt): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlNumberOfSetBitsInRange", longArrayOf(bitmapheader, startingindex.toLong(), length.toLong())).toUInt()
}

public fun RtlNumberOfSetBitsUlongPtr(target: ULong): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlNumberOfSetBitsUlongPtr", longArrayOf(target.toLong())).toUInt()
}

public fun RtlPrefetchMemoryNonTemporal(source: Long, length: ULong) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlPrefetchMemoryNonTemporal", longArrayOf(source, length.toLong()))
}

public fun RtlPrefixUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlPrefixUnicodeString", longArrayOf(string1, string2, if (caseinsensitive) 1L else 0L))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlQueryRegistryValueWithFallback(primaryhandle: HANDLE, fallbackhandle: HANDLE, valuename: Long, valuelength: UInt, valuetype: Long, valuedata: Long, resultlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlQueryRegistryValueWithFallback", longArrayOf(primaryhandle, fallbackhandle, valuename, valuelength.toLong(), valuetype, valuedata, resultlength)).toInt()
}

public fun RtlQueryRegistryValues(relativeto: UInt, path: PCWSTR, querytable: Long, context: Long, environment: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlQueryRegistryValues", longArrayOf(relativeto.toLong(), path, querytable, context, environment)).toInt()
}

public fun RtlQueryValidationRunlevel(componentname: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlQueryValidationRunlevel", longArrayOf(componentname)).toUInt()
}

public fun RtlRealPredecessor(links: Long): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlRealPredecessor", longArrayOf(links))
}

public fun RtlRealSuccessor(links: Long): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlRealSuccessor", longArrayOf(links))
}

public fun RtlRemoveEntryHashTable(hashtable: Long, entry: Long, context: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlRemoveEntryHashTable", longArrayOf(hashtable, entry, context))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlRunOnceBeginInitialize(runonce: Long, flags: UInt, context: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlRunOnceBeginInitialize", longArrayOf(runonce, flags.toLong(), context)).toInt()
}

public fun RtlRunOnceComplete(runonce: Long, flags: UInt, context: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlRunOnceComplete", longArrayOf(runonce, flags.toLong(), context)).toInt()
}

public fun RtlRunOnceExecuteOnce(runonce: Long, initfn: PRTL_RUN_ONCE_INIT_FN, parameter: Long, context: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlRunOnceExecuteOnce", longArrayOf(runonce, Win32DynamicFfi.objectSlot(initfn), parameter, context)).toInt()
}

public fun RtlRunOnceInitialize(runonce: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlRunOnceInitialize", longArrayOf(runonce))
}

public fun RtlSetAllBits(bitmapheader: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlSetAllBits", longArrayOf(bitmapheader))
}

public fun RtlSetBit(bitmapheader: Long, bitnumber: UInt) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlSetBit", longArrayOf(bitmapheader, bitnumber.toLong()))
}

public fun RtlSetBits(bitmapheader: Long, startingindex: UInt, numbertoset: UInt) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlSetBits", longArrayOf(bitmapheader, startingindex.toLong(), numbertoset.toLong()))
}

public fun RtlSetDaclSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, daclpresent: Boolean, dacl: Long, dacldefaulted: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlSetDaclSecurityDescriptor", longArrayOf(securitydescriptor, if (daclpresent) 1L else 0L, dacl, if (dacldefaulted) 1L else 0L)).toInt()
}
