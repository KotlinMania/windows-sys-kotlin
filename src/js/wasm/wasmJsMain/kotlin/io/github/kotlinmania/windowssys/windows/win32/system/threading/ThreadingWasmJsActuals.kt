@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.threading

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HMODULE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.PAPCFUNC
import io.github.kotlinmania.windowssys.windows.win32.foundation.WAIT_EVENT
import io.github.kotlinmania.windowssys.windows.win32.security.PSID
import io.github.kotlinmania.windowssys.windows.win32.security.TOKEN_ACCESS_MASK

public actual fun AcquireSRWLockExclusive(srwlock: Long) {
}

public actual fun AcquireSRWLockShared(srwlock: Long) {
}

public actual fun AddIntegrityLabelToBoundaryDescriptor(boundarydescriptor: Long, integritylabel: PSID): BOOL =
    0

public actual fun AddSIDToBoundaryDescriptor(boundarydescriptor: Long, requiredsid: PSID): BOOL =
    0

public actual fun AttachThreadInput(idattach: UInt, idattachto: UInt, fattach: BOOL): BOOL =
    0

public actual fun AvQuerySystemResponsiveness(avrthandle: HANDLE, systemresponsivenessvalue: Long): BOOL =
    0

public actual fun AvRevertMmThreadCharacteristics(avrthandle: HANDLE): BOOL =
    0

public actual fun AvRtCreateThreadOrderingGroup(context: Long, period: Long, threadorderingguid: Long, timeout: Long): BOOL =
    0

public actual fun AvRtCreateThreadOrderingGroupExA(context: Long, period: Long, threadorderingguid: Long, timeout: Long, taskname: PCSTR): BOOL =
    0

public actual fun AvRtCreateThreadOrderingGroupExW(context: Long, period: Long, threadorderingguid: Long, timeout: Long, taskname: PCWSTR): BOOL =
    0

public actual fun AvRtDeleteThreadOrderingGroup(context: HANDLE): BOOL =
    0

public actual fun AvRtJoinThreadOrderingGroup(context: Long, threadorderingguid: Long, before: BOOL): BOOL =
    0

public actual fun AvRtLeaveThreadOrderingGroup(context: HANDLE): BOOL =
    0

public actual fun AvRtWaitOnThreadOrderingGroup(context: HANDLE): BOOL =
    0

public actual fun AvSetMmMaxThreadCharacteristicsA(firsttask: PCSTR, secondtask: PCSTR, taskindex: Long): HANDLE =
    0L

public actual fun AvSetMmMaxThreadCharacteristicsW(firsttask: PCWSTR, secondtask: PCWSTR, taskindex: Long): HANDLE =
    0L

public actual fun AvSetMmThreadCharacteristicsA(taskname: PCSTR, taskindex: Long): HANDLE =
    0L

public actual fun AvSetMmThreadCharacteristicsW(taskname: PCWSTR, taskindex: Long): HANDLE =
    0L

public actual fun AvSetMmThreadPriority(avrthandle: HANDLE, priority: AVRT_PRIORITY): BOOL =
    0

public actual fun CallbackMayRunLong(pci: PTP_CALLBACK_INSTANCE): BOOL =
    0

public actual fun CancelThreadpoolIo(pio: PTP_IO) {
}

public actual fun CancelTimerQueueTimer(timerqueue: HANDLE, timer: HANDLE): BOOL =
    0

public actual fun CancelWaitableTimer(htimer: HANDLE): BOOL =
    0

public actual fun ChangeTimerQueueTimer(timerqueue: HANDLE, timer: HANDLE, duetime: UInt, period: UInt): BOOL =
    0

public actual fun ClosePrivateNamespace(handle: HANDLE, flags: UInt): Boolean =
    false

public actual fun CloseThreadpool(ptpp: PTP_POOL) {
}

public actual fun CloseThreadpoolCleanupGroup(ptpcg: PTP_CLEANUP_GROUP) {
}

public actual fun CloseThreadpoolCleanupGroupMembers(ptpcg: PTP_CLEANUP_GROUP, fcancelpendingcallbacks: BOOL, pvcleanupcontext: Long) {
}

public actual fun CloseThreadpoolIo(pio: PTP_IO) {
}

public actual fun CloseThreadpoolTimer(pti: PTP_TIMER) {
}

public actual fun CloseThreadpoolWait(pwa: PTP_WAIT) {
}

public actual fun CloseThreadpoolWork(pwk: PTP_WORK) {
}

public actual fun ConvertFiberToThread(): BOOL =
    0

public actual fun ConvertThreadToFiber(lpparameter: Long): Long =
    0L

public actual fun ConvertThreadToFiberEx(lpparameter: Long, dwflags: UInt): Long =
    0L

public actual fun CreateBoundaryDescriptorA(name: PCSTR, flags: UInt): HANDLE =
    0L

public actual fun CreateBoundaryDescriptorW(name: PCWSTR, flags: UInt): HANDLE =
    0L

public actual fun CreateEventA(lpeventattributes: Long, bmanualreset: BOOL, binitialstate: BOOL, lpname: PCSTR): HANDLE =
    0L

public actual fun CreateEventExA(lpeventattributes: Long, lpname: PCSTR, dwflags: CREATE_EVENT, dwdesiredaccess: UInt): HANDLE =
    0L

public actual fun CreateEventExW(lpeventattributes: Long, lpname: PCWSTR, dwflags: CREATE_EVENT, dwdesiredaccess: UInt): HANDLE =
    0L

public actual fun CreateEventW(lpeventattributes: Long, bmanualreset: BOOL, binitialstate: BOOL, lpname: PCWSTR): HANDLE =
    0L

public actual fun CreateFiber(dwstacksize: ULong, lpstartaddress: LPFIBER_START_ROUTINE, lpparameter: Long): Long =
    0L

public actual fun CreateFiberEx(dwstackcommitsize: ULong, dwstackreservesize: ULong, dwflags: UInt, lpstartaddress: LPFIBER_START_ROUTINE, lpparameter: Long): Long =
    0L

public actual fun CreateMutexA(lpmutexattributes: Long, binitialowner: BOOL, lpname: PCSTR): HANDLE =
    0L

public actual fun CreateMutexExA(lpmutexattributes: Long, lpname: PCSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE =
    0L

public actual fun CreateMutexExW(lpmutexattributes: Long, lpname: PCWSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE =
    0L

public actual fun CreateMutexW(lpmutexattributes: Long, binitialowner: BOOL, lpname: PCWSTR): HANDLE =
    0L

public actual fun CreatePrivateNamespaceA(lpprivatenamespaceattributes: Long, lpboundarydescriptor: Long, lpaliasprefix: PCSTR): HANDLE =
    0L

public actual fun CreatePrivateNamespaceW(lpprivatenamespaceattributes: Long, lpboundarydescriptor: Long, lpaliasprefix: PCWSTR): HANDLE =
    0L

public actual fun CreateProcessA(lpapplicationname: PCSTR, lpcommandline: PSTR, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: BOOL, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL =
    0

public actual fun CreateProcessAsUserA(htoken: HANDLE, lpapplicationname: PCSTR, lpcommandline: PSTR, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: BOOL, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL =
    0

public actual fun CreateProcessAsUserW(htoken: HANDLE, lpapplicationname: PCWSTR, lpcommandline: PWSTR, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: BOOL, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCWSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL =
    0

public actual fun CreateProcessW(lpapplicationname: PCWSTR, lpcommandline: PWSTR, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: BOOL, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCWSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL =
    0

public actual fun CreateProcessWithLogonW(lpusername: PCWSTR, lpdomain: PCWSTR, lppassword: PCWSTR, dwlogonflags: CREATE_PROCESS_LOGON_FLAGS, lpapplicationname: PCWSTR, lpcommandline: PWSTR, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCWSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL =
    0

public actual fun CreateProcessWithTokenW(htoken: HANDLE, dwlogonflags: CREATE_PROCESS_LOGON_FLAGS, lpapplicationname: PCWSTR, lpcommandline: PWSTR, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCWSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL =
    0

public actual fun CreateRemoteThread(hprocess: HANDLE, lpthreadattributes: Long, dwstacksize: ULong, lpstartaddress: LPTHREAD_START_ROUTINE, lpparameter: Long, dwcreationflags: UInt, lpthreadid: Long): HANDLE =
    0L

public actual fun CreateRemoteThreadEx(hprocess: HANDLE, lpthreadattributes: Long, dwstacksize: ULong, lpstartaddress: LPTHREAD_START_ROUTINE, lpparameter: Long, dwcreationflags: UInt, lpattributelist: LPPROC_THREAD_ATTRIBUTE_LIST, lpthreadid: Long): HANDLE =
    0L

public actual fun CreateSemaphoreA(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: PCSTR): HANDLE =
    0L

public actual fun CreateSemaphoreExA(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: PCSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE =
    0L

public actual fun CreateSemaphoreExW(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: PCWSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE =
    0L

public actual fun CreateSemaphoreW(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: PCWSTR): HANDLE =
    0L

public actual fun CreateThread(lpthreadattributes: Long, dwstacksize: ULong, lpstartaddress: LPTHREAD_START_ROUTINE, lpparameter: Long, dwcreationflags: THREAD_CREATION_FLAGS, lpthreadid: Long): HANDLE =
    0L

public actual fun CreateThreadpool(reserved: Long): PTP_POOL =
    0L

public actual fun CreateThreadpoolCleanupGroup(): PTP_CLEANUP_GROUP =
    0L

public actual fun CreateThreadpoolIo(fl: HANDLE, pfnio: PTP_WIN32_IO_CALLBACK, pv: Long, pcbe: Long): PTP_IO =
    0L

public actual fun CreateThreadpoolTimer(pfnti: PTP_TIMER_CALLBACK, pv: Long, pcbe: Long): PTP_TIMER =
    0L

public actual fun CreateThreadpoolWait(pfnwa: PTP_WAIT_CALLBACK, pv: Long, pcbe: Long): PTP_WAIT =
    0L

public actual fun CreateThreadpoolWork(pfnwk: PTP_WORK_CALLBACK, pv: Long, pcbe: Long): PTP_WORK =
    0L

public actual fun CreateTimerQueue(): HANDLE =
    0L

public actual fun CreateTimerQueueTimer(phnewtimer: Long, timerqueue: HANDLE, callback: WAITORTIMERCALLBACK, parameter: Long, duetime: UInt, period: UInt, flags: WORKER_THREAD_FLAGS): BOOL =
    0

public actual fun CreateUmsCompletionList(umscompletionlist: Long): BOOL =
    0

public actual fun CreateUmsThreadContext(lpumsthread: Long): BOOL =
    0

public actual fun CreateWaitableTimerA(lptimerattributes: Long, bmanualreset: BOOL, lptimername: PCSTR): HANDLE =
    0L

public actual fun CreateWaitableTimerExA(lptimerattributes: Long, lptimername: PCSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE =
    0L

public actual fun CreateWaitableTimerExW(lptimerattributes: Long, lptimername: PCWSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE =
    0L

public actual fun CreateWaitableTimerW(lptimerattributes: Long, bmanualreset: BOOL, lptimername: PCWSTR): HANDLE =
    0L

public actual fun DeleteBoundaryDescriptor(boundarydescriptor: HANDLE) {
}

public actual fun DeleteCriticalSection(lpcriticalsection: Long) {
}

public actual fun DeleteFiber(lpfiber: Long) {
}

public actual fun DeleteProcThreadAttributeList(lpattributelist: LPPROC_THREAD_ATTRIBUTE_LIST) {
}

public actual fun DeleteSynchronizationBarrier(lpbarrier: Long): BOOL =
    0

public actual fun DeleteTimerQueue(timerqueue: HANDLE): BOOL =
    0

public actual fun DeleteTimerQueueEx(timerqueue: HANDLE, completionevent: HANDLE): BOOL =
    0

public actual fun DeleteTimerQueueTimer(timerqueue: HANDLE, timer: HANDLE, completionevent: HANDLE): BOOL =
    0

public actual fun DeleteUmsCompletionList(umscompletionlist: Long): BOOL =
    0

public actual fun DeleteUmsThreadContext(umsthread: Long): BOOL =
    0

public actual fun DequeueUmsCompletionListItems(umscompletionlist: Long, waittimeout: UInt, umsthreadlist: Long): BOOL =
    0

public actual fun DisassociateCurrentThreadFromCallback(pci: PTP_CALLBACK_INSTANCE) {
}

public actual fun EnterCriticalSection(lpcriticalsection: Long) {
}

public actual fun EnterSynchronizationBarrier(lpbarrier: Long, dwflags: UInt): BOOL =
    0

public actual fun EnterUmsSchedulingMode(schedulerstartupinfo: Long): BOOL =
    0

public actual fun ExecuteUmsThread(umsthread: Long): BOOL =
    0

public actual fun ExitProcess(uexitcode: UInt): Nothing =
    error("Unreachable noreturn C function ExitProcess")

public actual fun ExitThread(dwexitcode: UInt): Nothing =
    error("Unreachable noreturn C function ExitThread")

public actual fun FlsAlloc(lpcallback: PFLS_CALLBACK_FUNCTION): UInt =
    0u

public actual fun FlsFree(dwflsindex: UInt): BOOL =
    0

public actual fun FlsGetValue(dwflsindex: UInt): Long =
    0L

public actual fun FlsSetValue(dwflsindex: UInt, lpflsdata: Long): BOOL =
    0

public actual fun FlushProcessWriteBuffers() {
}

public actual fun FreeLibraryWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, mod: HMODULE) {
}

public actual fun GetActiveProcessorCount(groupnumber: UShort): UInt =
    0u

public actual fun GetActiveProcessorGroupCount(): UShort =
    0u

public actual fun GetCurrentProcess(): HANDLE =
    0L

public actual fun GetCurrentProcessId(): UInt =
    0u

public actual fun GetCurrentProcessorNumber(): UInt =
    0u

public actual fun GetCurrentProcessorNumberEx(procnumber: Long) {
}

public actual fun GetCurrentThread(): HANDLE =
    0L

public actual fun GetCurrentThreadId(): UInt =
    0u

public actual fun GetCurrentThreadStackLimits(lowlimit: Long, highlimit: Long) {
}

public actual fun GetCurrentUmsThread(): Long =
    0L

public actual fun GetExitCodeProcess(hprocess: HANDLE, lpexitcode: Long): BOOL =
    0

public actual fun GetExitCodeThread(hthread: HANDLE, lpexitcode: Long): BOOL =
    0

public actual fun GetGuiResources(hprocess: HANDLE, uiflags: GET_GUI_RESOURCES_FLAGS): UInt =
    0u

public actual fun GetMachineTypeAttributes(machine: UShort, machinetypeattributes: Long): HRESULT =
    0

public actual fun GetMaximumProcessorCount(groupnumber: UShort): UInt =
    0u

public actual fun GetMaximumProcessorGroupCount(): UShort =
    0u

public actual fun GetNextUmsListItem(umscontext: Long): Long =
    0L

public actual fun GetNumaAvailableMemoryNode(node: UByte, availablebytes: Long): BOOL =
    0

public actual fun GetNumaAvailableMemoryNodeEx(node: UShort, availablebytes: Long): BOOL =
    0

public actual fun GetNumaHighestNodeNumber(highestnodenumber: Long): BOOL =
    0

public actual fun GetNumaNodeNumberFromHandle(hfile: HANDLE, nodenumber: Long): BOOL =
    0

public actual fun GetNumaNodeProcessorMask(node: UByte, processormask: Long): BOOL =
    0

public actual fun GetNumaNodeProcessorMask2(nodenumber: UShort, processormasks: Long, processormaskcount: UShort, requiredmaskcount: Long): BOOL =
    0

public actual fun GetNumaNodeProcessorMaskEx(node: UShort, processormask: Long): BOOL =
    0

public actual fun GetNumaProcessorNode(processor: UByte, nodenumber: Long): BOOL =
    0

public actual fun GetNumaProcessorNodeEx(processor: Long, nodenumber: Long): BOOL =
    0

public actual fun GetNumaProximityNode(proximityid: UInt, nodenumber: Long): BOOL =
    0

public actual fun GetNumaProximityNodeEx(proximityid: UInt, nodenumber: Long): BOOL =
    0

public actual fun GetPriorityClass(hprocess: HANDLE): UInt =
    0u

public actual fun GetProcessAffinityMask(hprocess: HANDLE, lpprocessaffinitymask: Long, lpsystemaffinitymask: Long): BOOL =
    0

public actual fun GetProcessDEPPolicy(hprocess: HANDLE, lpflags: Long, lppermanent: Long): BOOL =
    0

public actual fun GetProcessDefaultCpuSetMasks(process: HANDLE, cpusetmasks: Long, cpusetmaskcount: UShort, requiredmaskcount: Long): BOOL =
    0

public actual fun GetProcessDefaultCpuSets(process: HANDLE, cpusetids: Long, cpusetidcount: UInt, requiredidcount: Long): BOOL =
    0

public actual fun GetProcessGroupAffinity(hprocess: HANDLE, groupcount: Long, grouparray: Long): BOOL =
    0

public actual fun GetProcessHandleCount(hprocess: HANDLE, pdwhandlecount: Long): BOOL =
    0

public actual fun GetProcessHandleFromHwnd(hwnd: HWND): HANDLE =
    0L

public actual fun GetProcessId(process: HANDLE): UInt =
    0u

public actual fun GetProcessIdOfThread(thread: HANDLE): UInt =
    0u

public actual fun GetProcessInformation(hprocess: HANDLE, processinformationclass: PROCESS_INFORMATION_CLASS, processinformation: Long, processinformationsize: UInt): BOOL =
    0

public actual fun GetProcessIoCounters(hprocess: HANDLE, lpiocounters: Long): BOOL =
    0

public actual fun GetProcessMitigationPolicy(hprocess: HANDLE, mitigationpolicy: PROCESS_MITIGATION_POLICY, lpbuffer: Long, dwlength: ULong): BOOL =
    0

public actual fun GetProcessPriorityBoost(hprocess: HANDLE, pdisablepriorityboost: Long): BOOL =
    0

public actual fun GetProcessShutdownParameters(lpdwlevel: Long, lpdwflags: Long): BOOL =
    0

public actual fun GetProcessTimes(hprocess: HANDLE, lpcreationtime: Long, lpexittime: Long, lpkerneltime: Long, lpusertime: Long): BOOL =
    0

public actual fun GetProcessVersion(processid: UInt): UInt =
    0u

public actual fun GetProcessWorkingSetSize(hprocess: HANDLE, lpminimumworkingsetsize: Long, lpmaximumworkingsetsize: Long): BOOL =
    0

public actual fun GetStartupInfoA(lpstartupinfo: Long) {
}

public actual fun GetStartupInfoW(lpstartupinfo: Long) {
}

public actual fun GetSystemTimes(lpidletime: Long, lpkerneltime: Long, lpusertime: Long): BOOL =
    0

public actual fun GetThreadDescription(hthread: HANDLE, ppszthreaddescription: Long): HRESULT =
    0

public actual fun GetThreadGroupAffinity(hthread: HANDLE, groupaffinity: Long): BOOL =
    0

public actual fun GetThreadIOPendingFlag(hthread: HANDLE, lpioispending: Long): BOOL =
    0

public actual fun GetThreadId(thread: HANDLE): UInt =
    0u

public actual fun GetThreadIdealProcessorEx(hthread: HANDLE, lpidealprocessor: Long): BOOL =
    0

public actual fun GetThreadInformation(hthread: HANDLE, threadinformationclass: THREAD_INFORMATION_CLASS, threadinformation: Long, threadinformationsize: UInt): BOOL =
    0

public actual fun GetThreadPriority(hthread: HANDLE): Int =
    0

public actual fun GetThreadPriorityBoost(hthread: HANDLE, pdisablepriorityboost: Long): BOOL =
    0

public actual fun GetThreadSelectedCpuSetMasks(thread: HANDLE, cpusetmasks: Long, cpusetmaskcount: UShort, requiredmaskcount: Long): BOOL =
    0

public actual fun GetThreadSelectedCpuSets(thread: HANDLE, cpusetids: Long, cpusetidcount: UInt, requiredidcount: Long): BOOL =
    0

public actual fun GetThreadTimes(hthread: HANDLE, lpcreationtime: Long, lpexittime: Long, lpkerneltime: Long, lpusertime: Long): BOOL =
    0

public actual fun GetUmsCompletionListEvent(umscompletionlist: Long, umscompletionevent: Long): BOOL =
    0

public actual fun GetUmsSystemThreadInformation(threadhandle: HANDLE, systemthreadinfo: Long): BOOL =
    0

public actual fun InitOnceBeginInitialize(lpinitonce: Long, dwflags: UInt, fpending: Long, lpcontext: Long): BOOL =
    0

public actual fun InitOnceComplete(lpinitonce: Long, dwflags: UInt, lpcontext: Long): BOOL =
    0

public actual fun InitOnceExecuteOnce(initonce: Long, initfn: PINIT_ONCE_FN, parameter: Long, context: Long): BOOL =
    0

public actual fun InitOnceInitialize(initonce: Long) {
}

public actual fun InitializeConditionVariable(conditionvariable: Long) {
}

public actual fun InitializeCriticalSection(lpcriticalsection: Long) {
}

public actual fun InitializeCriticalSectionAndSpinCount(lpcriticalsection: Long, dwspincount: UInt): BOOL =
    0

public actual fun InitializeCriticalSectionEx(lpcriticalsection: Long, dwspincount: UInt, flags: UInt): BOOL =
    0

public actual fun InitializeProcThreadAttributeList(lpattributelist: LPPROC_THREAD_ATTRIBUTE_LIST, dwattributecount: UInt, dwflags: UInt, lpsize: Long): BOOL =
    0

public actual fun InitializeSListHead(listhead: Long) {
}

public actual fun InitializeSRWLock(srwlock: Long) {
}

public actual fun InitializeSynchronizationBarrier(lpbarrier: Long, ltotalthreads: Int, lspincount: Int): BOOL =
    0

public actual fun InterlockedFlushSList(listhead: Long): Long =
    0L

public actual fun InterlockedPopEntrySList(listhead: Long): Long =
    0L

public actual fun InterlockedPushEntrySList(listhead: Long, listentry: Long): Long =
    0L

public actual fun InterlockedPushListSListEx(listhead: Long, list: Long, listend: Long, count: UInt): Long =
    0L

public actual fun IsImmersiveProcess(hprocess: HANDLE): BOOL =
    0

public actual fun IsProcessCritical(hprocess: HANDLE, critical: Long): BOOL =
    0

public actual fun IsProcessorFeaturePresent(processorfeature: PROCESSOR_FEATURE_ID): BOOL =
    0

public actual fun IsThreadAFiber(): BOOL =
    0

public actual fun IsThreadpoolTimerSet(pti: PTP_TIMER): BOOL =
    0

public actual fun IsWow64Process(hprocess: HANDLE, wow64process: Long): BOOL =
    0

public actual fun IsWow64Process2(hprocess: HANDLE, pprocessmachine: Long, pnativemachine: Long): BOOL =
    0

public actual fun LeaveCriticalSection(lpcriticalsection: Long) {
}

public actual fun LeaveCriticalSectionWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, pcs: Long) {
}

public actual fun OpenEventA(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lpname: PCSTR): HANDLE =
    0L

public actual fun OpenEventW(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lpname: PCWSTR): HANDLE =
    0L

public actual fun OpenMutexW(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lpname: PCWSTR): HANDLE =
    0L

public actual fun OpenPrivateNamespaceA(lpboundarydescriptor: Long, lpaliasprefix: PCSTR): HANDLE =
    0L

public actual fun OpenPrivateNamespaceW(lpboundarydescriptor: Long, lpaliasprefix: PCWSTR): HANDLE =
    0L

public actual fun OpenProcess(dwdesiredaccess: PROCESS_ACCESS_RIGHTS, binherithandle: BOOL, dwprocessid: UInt): HANDLE =
    0L

public actual fun OpenProcessToken(processhandle: HANDLE, desiredaccess: TOKEN_ACCESS_MASK, tokenhandle: Long): BOOL =
    0

public actual fun OpenSemaphoreW(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lpname: PCWSTR): HANDLE =
    0L

public actual fun OpenThread(dwdesiredaccess: THREAD_ACCESS_RIGHTS, binherithandle: BOOL, dwthreadid: UInt): HANDLE =
    0L

public actual fun OpenThreadToken(threadhandle: HANDLE, desiredaccess: TOKEN_ACCESS_MASK, openasself: BOOL, tokenhandle: Long): BOOL =
    0

public actual fun OpenWaitableTimerA(dwdesiredaccess: UInt, binherithandle: BOOL, lptimername: PCSTR): HANDLE =
    0L

public actual fun OpenWaitableTimerW(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lptimername: PCWSTR): HANDLE =
    0L

public actual fun PulseEvent(hevent: HANDLE): BOOL =
    0

public actual fun QueryDepthSList(listhead: Long): UShort =
    0u

public actual fun QueryFullProcessImageNameA(hprocess: HANDLE, dwflags: PROCESS_NAME_FORMAT, lpexename: PSTR, lpdwsize: Long): BOOL =
    0

public actual fun QueryFullProcessImageNameW(hprocess: HANDLE, dwflags: PROCESS_NAME_FORMAT, lpexename: PWSTR, lpdwsize: Long): BOOL =
    0

public actual fun QueryProcessAffinityUpdateMode(hprocess: HANDLE, lpdwflags: Long): BOOL =
    0

public actual fun QueryProtectedPolicy(policyguid: Long, policyvalue: Long): BOOL =
    0

public actual fun QueryThreadpoolStackInformation(ptpp: PTP_POOL, ptpsi: Long): BOOL =
    0

public actual fun QueryUmsThreadInformation(umsthread: Long, umsthreadinfoclass: UMS_THREAD_INFO_CLASS, umsthreadinformation: Long, umsthreadinformationlength: UInt, returnlength: Long): BOOL =
    0

public actual fun QueueUserAPC(pfnapc: PAPCFUNC, hthread: HANDLE, dwdata: ULong): UInt =
    0u

public actual fun QueueUserAPC2(apcroutine: PAPCFUNC, thread: HANDLE, data: ULong, flags: QUEUE_USER_APC_FLAGS): BOOL =
    0

public actual fun QueueUserWorkItem(function: LPTHREAD_START_ROUTINE, context: Long, flags: WORKER_THREAD_FLAGS): BOOL =
    0

public actual fun RegisterWaitForSingleObject(phnewwaitobject: Long, hobject: HANDLE, callback: WAITORTIMERCALLBACK, context: Long, dwmilliseconds: UInt, dwflags: WORKER_THREAD_FLAGS): BOOL =
    0

public actual fun ReleaseMutex(hmutex: HANDLE): BOOL =
    0

public actual fun ReleaseMutexWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, mut: HANDLE) {
}

public actual fun ReleaseSRWLockExclusive(srwlock: Long) {
}

public actual fun ReleaseSRWLockShared(srwlock: Long) {
}

public actual fun ReleaseSemaphore(hsemaphore: HANDLE, lreleasecount: Int, lppreviouscount: Long): BOOL =
    0

public actual fun ReleaseSemaphoreWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, sem: HANDLE, crel: UInt) {
}

public actual fun ResetEvent(hevent: HANDLE): BOOL =
    0

public actual fun ResumeThread(hthread: HANDLE): UInt =
    0u

public actual fun RtwqAddPeriodicCallback(callback: RTWQPERIODICCALLBACK, context: Long, key: Long): HRESULT =
    0

public actual fun RtwqAllocateSerialWorkQueue(workqueueidin: UInt, workqueueidout: Long): HRESULT =
    0

public actual fun RtwqAllocateWorkQueue(workqueuetype: RTWQ_WORKQUEUE_TYPE, workqueueid: Long): HRESULT =
    0

public actual fun RtwqBeginRegisterWorkQueueWithMMCSS(workqueueid: UInt, usageclass: PCWSTR, dwtaskid: UInt, lpriority: Int, donecallback: Long, donestate: Long): HRESULT =
    0

public actual fun RtwqBeginUnregisterWorkQueueWithMMCSS(workqueueid: UInt, donecallback: Long, donestate: Long): HRESULT =
    0

public actual fun RtwqCancelDeadline(prequest: HANDLE): HRESULT =
    0

public actual fun RtwqCancelWorkItem(key: ULong): HRESULT =
    0

public actual fun RtwqCreateAsyncResult(appobject: Long, callback: Long, appstate: Long, asyncresult: Long): HRESULT =
    0

public actual fun RtwqEndRegisterWorkQueueWithMMCSS(result: Long, taskid: Long): HRESULT =
    0

public actual fun RtwqGetWorkQueueMMCSSClass(workqueueid: UInt, usageclass: PWSTR, usageclasslength: Long): HRESULT =
    0

public actual fun RtwqGetWorkQueueMMCSSPriority(workqueueid: UInt, priority: Long): HRESULT =
    0

public actual fun RtwqGetWorkQueueMMCSSTaskId(workqueueid: UInt, taskid: Long): HRESULT =
    0

public actual fun RtwqInvokeCallback(result: Long): HRESULT =
    0

public actual fun RtwqJoinWorkQueue(workqueueid: UInt, hfile: HANDLE, out: Long): HRESULT =
    0

public actual fun RtwqLockPlatform(): HRESULT =
    0

public actual fun RtwqLockSharedWorkQueue(usageclass: PCWSTR, basepriority: Int, taskid: Long, id: Long): HRESULT =
    0

public actual fun RtwqLockWorkQueue(workqueueid: UInt): HRESULT =
    0

public actual fun RtwqPutWaitingWorkItem(hevent: HANDLE, lpriority: Int, result: Long, key: Long): HRESULT =
    0

public actual fun RtwqPutWorkItem(dwqueue: UInt, lpriority: Int, result: Long): HRESULT =
    0

public actual fun RtwqRegisterPlatformEvents(platformevents: Long): HRESULT =
    0

public actual fun RtwqRegisterPlatformWithMMCSS(usageclass: PCWSTR, taskid: Long, lpriority: Int): HRESULT =
    0

public actual fun RtwqRemovePeriodicCallback(dwkey: UInt): HRESULT =
    0

public actual fun RtwqScheduleWorkItem(result: Long, timeout: Long, key: Long): HRESULT =
    0

public actual fun RtwqSetDeadline(workqueueid: UInt, deadlineinhns: Long, prequest: Long): HRESULT =
    0

public actual fun RtwqSetDeadline2(workqueueid: UInt, deadlineinhns: Long, predeadlineinhns: Long, prequest: Long): HRESULT =
    0

public actual fun RtwqSetLongRunning(workqueueid: UInt, enable: BOOL): HRESULT =
    0

public actual fun RtwqShutdown(): HRESULT =
    0

public actual fun RtwqStartup(): HRESULT =
    0

public actual fun RtwqUnjoinWorkQueue(workqueueid: UInt, hfile: HANDLE): HRESULT =
    0

public actual fun RtwqUnlockPlatform(): HRESULT =
    0

public actual fun RtwqUnlockWorkQueue(workqueueid: UInt): HRESULT =
    0

public actual fun RtwqUnregisterPlatformEvents(platformevents: Long): HRESULT =
    0

public actual fun RtwqUnregisterPlatformFromMMCSS(): HRESULT =
    0

public actual fun SetCriticalSectionSpinCount(lpcriticalsection: Long, dwspincount: UInt): UInt =
    0u

public actual fun SetEvent(hevent: HANDLE): BOOL =
    0

public actual fun SetEventWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, evt: HANDLE) {
}

public actual fun SetPriorityClass(hprocess: HANDLE, dwpriorityclass: PROCESS_CREATION_FLAGS): BOOL =
    0

public actual fun SetProcessAffinityMask(hprocess: HANDLE, dwprocessaffinitymask: ULong): BOOL =
    0

public actual fun SetProcessAffinityUpdateMode(hprocess: HANDLE, dwflags: PROCESS_AFFINITY_AUTO_UPDATE_FLAGS): BOOL =
    0

public actual fun SetProcessDEPPolicy(dwflags: PROCESS_DEP_FLAGS): BOOL =
    0

public actual fun SetProcessDefaultCpuSetMasks(process: HANDLE, cpusetmasks: Long, cpusetmaskcount: UShort): BOOL =
    0

public actual fun SetProcessDefaultCpuSets(process: HANDLE, cpusetids: Long, cpusetidcount: UInt): BOOL =
    0

public actual fun SetProcessDynamicEHContinuationTargets(process: HANDLE, numberoftargets: UShort, targets: Long): BOOL =
    0

public actual fun SetProcessDynamicEnforcedCetCompatibleRanges(process: HANDLE, numberofranges: UShort, ranges: Long): BOOL =
    0

public actual fun SetProcessInformation(hprocess: HANDLE, processinformationclass: PROCESS_INFORMATION_CLASS, processinformation: Long, processinformationsize: UInt): BOOL =
    0

public actual fun SetProcessMitigationPolicy(mitigationpolicy: PROCESS_MITIGATION_POLICY, lpbuffer: Long, dwlength: ULong): BOOL =
    0

public actual fun SetProcessPriorityBoost(hprocess: HANDLE, bdisablepriorityboost: BOOL): BOOL =
    0

public actual fun SetProcessRestrictionExemption(fenableexemption: BOOL): BOOL =
    0

public actual fun SetProcessShutdownParameters(dwlevel: UInt, dwflags: UInt): BOOL =
    0

public actual fun SetProcessWorkingSetSize(hprocess: HANDLE, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong): BOOL =
    0

public actual fun SetProtectedPolicy(policyguid: Long, policyvalue: ULong, oldpolicyvalue: Long): BOOL =
    0

public actual fun SetThreadAffinityMask(hthread: HANDLE, dwthreadaffinitymask: ULong): ULong =
    0uL

public actual fun SetThreadDescription(hthread: HANDLE, lpthreaddescription: PCWSTR): HRESULT =
    0

public actual fun SetThreadGroupAffinity(hthread: HANDLE, groupaffinity: Long, previousgroupaffinity: Long): BOOL =
    0

public actual fun SetThreadIdealProcessor(hthread: HANDLE, dwidealprocessor: UInt): UInt =
    0u

public actual fun SetThreadIdealProcessorEx(hthread: HANDLE, lpidealprocessor: Long, lppreviousidealprocessor: Long): BOOL =
    0

public actual fun SetThreadInformation(hthread: HANDLE, threadinformationclass: THREAD_INFORMATION_CLASS, threadinformation: Long, threadinformationsize: UInt): BOOL =
    0

public actual fun SetThreadPriority(hthread: HANDLE, npriority: THREAD_PRIORITY): BOOL =
    0

public actual fun SetThreadPriorityBoost(hthread: HANDLE, bdisablepriorityboost: BOOL): BOOL =
    0

public actual fun SetThreadSelectedCpuSetMasks(thread: HANDLE, cpusetmasks: Long, cpusetmaskcount: UShort): BOOL =
    0

public actual fun SetThreadSelectedCpuSets(thread: HANDLE, cpusetids: Long, cpusetidcount: UInt): BOOL =
    0

public actual fun SetThreadStackGuarantee(stacksizeinbytes: Long): BOOL =
    0

public actual fun SetThreadToken(thread: Long, token: HANDLE): BOOL =
    0

public actual fun SetThreadpoolStackInformation(ptpp: PTP_POOL, ptpsi: Long): BOOL =
    0

public actual fun SetThreadpoolThreadMaximum(ptpp: PTP_POOL, cthrdmost: UInt) {
}

public actual fun SetThreadpoolThreadMinimum(ptpp: PTP_POOL, cthrdmic: UInt): BOOL =
    0

public actual fun SetThreadpoolTimer(pti: PTP_TIMER, pftduetime: Long, msperiod: UInt, mswindowlength: UInt) {
}

public actual fun SetThreadpoolTimerEx(pti: PTP_TIMER, pftduetime: Long, msperiod: UInt, mswindowlength: UInt): BOOL =
    0

public actual fun SetThreadpoolWait(pwa: PTP_WAIT, h: HANDLE, pfttimeout: Long) {
}

public actual fun SetThreadpoolWaitEx(pwa: PTP_WAIT, h: HANDLE, pfttimeout: Long, reserved: Long): BOOL =
    0

public actual fun SetTimerQueueTimer(timerqueue: HANDLE, callback: WAITORTIMERCALLBACK, parameter: Long, duetime: UInt, period: UInt, preferio: BOOL): HANDLE =
    0L

public actual fun SetUmsThreadInformation(umsthread: Long, umsthreadinfoclass: UMS_THREAD_INFO_CLASS, umsthreadinformation: Long, umsthreadinformationlength: UInt): BOOL =
    0

public actual fun SetWaitableTimer(htimer: HANDLE, lpduetime: Long, lperiod: Int, pfncompletionroutine: PTIMERAPCROUTINE, lpargtocompletionroutine: Long, fresume: BOOL): BOOL =
    0

public actual fun SetWaitableTimerEx(htimer: HANDLE, lpduetime: Long, lperiod: Int, pfncompletionroutine: PTIMERAPCROUTINE, lpargtocompletionroutine: Long, wakecontext: Long, tolerabledelay: UInt): BOOL =
    0

public actual fun SignalObjectAndWait(hobjecttosignal: HANDLE, hobjecttowaiton: HANDLE, dwmilliseconds: UInt, balertable: BOOL): WAIT_EVENT =
    0u

public actual fun Sleep(dwmilliseconds: UInt) {
}

public actual fun SleepConditionVariableCS(conditionvariable: Long, criticalsection: Long, dwmilliseconds: UInt): BOOL =
    0

public actual fun SleepConditionVariableSRW(conditionvariable: Long, srwlock: Long, dwmilliseconds: UInt, flags: UInt): BOOL =
    0

public actual fun SleepEx(dwmilliseconds: UInt, balertable: BOOL): UInt =
    0u

public actual fun StartThreadpoolIo(pio: PTP_IO) {
}

public actual fun SubmitThreadpoolWork(pwk: PTP_WORK) {
}

public actual fun SuspendThread(hthread: HANDLE): UInt =
    0u

public actual fun SwitchToFiber(lpfiber: Long) {
}

public actual fun SwitchToThread(): BOOL =
    0

public actual fun TerminateProcess(hprocess: HANDLE, uexitcode: UInt): BOOL =
    0

public actual fun TerminateThread(hthread: HANDLE, dwexitcode: UInt): BOOL =
    0

public actual fun TlsAlloc(): UInt =
    0u

public actual fun TlsFree(dwtlsindex: UInt): BOOL =
    0

public actual fun TlsGetValue(dwtlsindex: UInt): Long =
    0L

public actual fun TlsSetValue(dwtlsindex: UInt, lptlsvalue: Long): BOOL =
    0

public actual fun TryAcquireSRWLockExclusive(srwlock: Long): Boolean =
    false

public actual fun TryAcquireSRWLockShared(srwlock: Long): Boolean =
    false

public actual fun TryEnterCriticalSection(lpcriticalsection: Long): BOOL =
    0

public actual fun TrySubmitThreadpoolCallback(pfns: PTP_SIMPLE_CALLBACK, pv: Long, pcbe: Long): BOOL =
    0

public actual fun UmsThreadYield(schedulerparam: Long): BOOL =
    0

public actual fun UnregisterWait(waithandle: HANDLE): BOOL =
    0

public actual fun UnregisterWaitEx(waithandle: HANDLE, completionevent: HANDLE): BOOL =
    0

public actual fun UpdateProcThreadAttribute(lpattributelist: LPPROC_THREAD_ATTRIBUTE_LIST, dwflags: UInt, attribute: ULong, lpvalue: Long, cbsize: ULong, lppreviousvalue: Long, lpreturnsize: Long): BOOL =
    0

public actual fun WaitForInputIdle(hprocess: HANDLE, dwmilliseconds: UInt): UInt =
    0u

public actual fun WaitForMultipleObjects(ncount: UInt, lphandles: Long, bwaitall: BOOL, dwmilliseconds: UInt): WAIT_EVENT =
    0u

public actual fun WaitForMultipleObjectsEx(ncount: UInt, lphandles: Long, bwaitall: BOOL, dwmilliseconds: UInt, balertable: BOOL): WAIT_EVENT =
    0u

public actual fun WaitForSingleObject(hhandle: HANDLE, dwmilliseconds: UInt): WAIT_EVENT =
    0u

public actual fun WaitForSingleObjectEx(hhandle: HANDLE, dwmilliseconds: UInt, balertable: BOOL): WAIT_EVENT =
    0u

public actual fun WaitForThreadpoolIoCallbacks(pio: PTP_IO, fcancelpendingcallbacks: BOOL) {
}

public actual fun WaitForThreadpoolTimerCallbacks(pti: PTP_TIMER, fcancelpendingcallbacks: BOOL) {
}

public actual fun WaitForThreadpoolWaitCallbacks(pwa: PTP_WAIT, fcancelpendingcallbacks: BOOL) {
}

public actual fun WaitForThreadpoolWorkCallbacks(pwk: PTP_WORK, fcancelpendingcallbacks: BOOL) {
}

public actual fun WaitOnAddress(address: Long, compareaddress: Long, addresssize: ULong, dwmilliseconds: UInt): BOOL =
    0

public actual fun WakeAllConditionVariable(conditionvariable: Long) {
}

public actual fun WakeByAddressAll(address: Long) {
}

public actual fun WakeByAddressSingle(address: Long) {
}

public actual fun WakeConditionVariable(conditionvariable: Long) {
}

public actual fun WinExec(lpcmdline: PCSTR, ucmdshow: UInt): UInt =
    0u

public actual fun Wow64SetThreadDefaultGuestMachine(machine: UShort): UShort =
    0u

public actual fun Wow64SuspendThread(hthread: HANDLE): UInt =
    0u
