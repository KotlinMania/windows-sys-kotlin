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

public expect fun AcquireSRWLockExclusive(srwlock: Long)

public expect fun AcquireSRWLockShared(srwlock: Long)

public expect fun AddIntegrityLabelToBoundaryDescriptor(boundarydescriptor: Long, integritylabel: PSID): BOOL

public expect fun AddSIDToBoundaryDescriptor(boundarydescriptor: Long, requiredsid: PSID): BOOL

public expect fun AttachThreadInput(idattach: UInt, idattachto: UInt, fattach: BOOL): BOOL

public expect fun AvQuerySystemResponsiveness(avrthandle: HANDLE, systemresponsivenessvalue: Long): BOOL

public expect fun AvRevertMmThreadCharacteristics(avrthandle: HANDLE): BOOL

public expect fun AvRtCreateThreadOrderingGroup(context: Long, period: Long, threadorderingguid: Long, timeout: Long): BOOL

public expect fun AvRtCreateThreadOrderingGroupExA(context: Long, period: Long, threadorderingguid: Long, timeout: Long, taskname: PCSTR): BOOL

public expect fun AvRtCreateThreadOrderingGroupExW(context: Long, period: Long, threadorderingguid: Long, timeout: Long, taskname: PCWSTR): BOOL

public expect fun AvRtDeleteThreadOrderingGroup(context: HANDLE): BOOL

public expect fun AvRtJoinThreadOrderingGroup(context: Long, threadorderingguid: Long, before: BOOL): BOOL

public expect fun AvRtLeaveThreadOrderingGroup(context: HANDLE): BOOL

public expect fun AvRtWaitOnThreadOrderingGroup(context: HANDLE): BOOL

public expect fun AvSetMmMaxThreadCharacteristicsA(firsttask: PCSTR, secondtask: PCSTR, taskindex: Long): HANDLE

public expect fun AvSetMmMaxThreadCharacteristicsW(firsttask: PCWSTR, secondtask: PCWSTR, taskindex: Long): HANDLE

public expect fun AvSetMmThreadCharacteristicsA(taskname: PCSTR, taskindex: Long): HANDLE

public expect fun AvSetMmThreadCharacteristicsW(taskname: PCWSTR, taskindex: Long): HANDLE

public expect fun AvSetMmThreadPriority(avrthandle: HANDLE, priority: AVRT_PRIORITY): BOOL

public expect fun CallbackMayRunLong(pci: PTP_CALLBACK_INSTANCE): BOOL

public expect fun CancelThreadpoolIo(pio: PTP_IO)

public expect fun CancelTimerQueueTimer(timerqueue: HANDLE, timer: HANDLE): BOOL

public expect fun CancelWaitableTimer(htimer: HANDLE): BOOL

public expect fun ChangeTimerQueueTimer(timerqueue: HANDLE, timer: HANDLE, duetime: UInt, period: UInt): BOOL

public expect fun ClosePrivateNamespace(handle: HANDLE, flags: UInt): Boolean

public expect fun CloseThreadpool(ptpp: PTP_POOL)

public expect fun CloseThreadpoolCleanupGroup(ptpcg: PTP_CLEANUP_GROUP)

public expect fun CloseThreadpoolCleanupGroupMembers(ptpcg: PTP_CLEANUP_GROUP, fcancelpendingcallbacks: BOOL, pvcleanupcontext: Long)

public expect fun CloseThreadpoolIo(pio: PTP_IO)

public expect fun CloseThreadpoolTimer(pti: PTP_TIMER)

public expect fun CloseThreadpoolWait(pwa: PTP_WAIT)

public expect fun CloseThreadpoolWork(pwk: PTP_WORK)

public expect fun ConvertFiberToThread(): BOOL

public expect fun ConvertThreadToFiber(lpparameter: Long): Long

public expect fun ConvertThreadToFiberEx(lpparameter: Long, dwflags: UInt): Long

public expect fun CreateBoundaryDescriptorA(name: PCSTR, flags: UInt): HANDLE

public expect fun CreateBoundaryDescriptorW(name: PCWSTR, flags: UInt): HANDLE

public expect fun CreateEventA(lpeventattributes: Long, bmanualreset: BOOL, binitialstate: BOOL, lpname: PCSTR): HANDLE

public expect fun CreateEventExA(lpeventattributes: Long, lpname: PCSTR, dwflags: CREATE_EVENT, dwdesiredaccess: UInt): HANDLE

public expect fun CreateEventExW(lpeventattributes: Long, lpname: PCWSTR, dwflags: CREATE_EVENT, dwdesiredaccess: UInt): HANDLE

public expect fun CreateEventW(lpeventattributes: Long, bmanualreset: BOOL, binitialstate: BOOL, lpname: PCWSTR): HANDLE

public expect fun CreateFiber(dwstacksize: ULong, lpstartaddress: LPFIBER_START_ROUTINE, lpparameter: Long): Long

public expect fun CreateFiberEx(dwstackcommitsize: ULong, dwstackreservesize: ULong, dwflags: UInt, lpstartaddress: LPFIBER_START_ROUTINE, lpparameter: Long): Long

public expect fun CreateMutexA(lpmutexattributes: Long, binitialowner: BOOL, lpname: PCSTR): HANDLE

public expect fun CreateMutexExA(lpmutexattributes: Long, lpname: PCSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE

public expect fun CreateMutexExW(lpmutexattributes: Long, lpname: PCWSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE

public expect fun CreateMutexW(lpmutexattributes: Long, binitialowner: BOOL, lpname: PCWSTR): HANDLE

public expect fun CreatePrivateNamespaceA(lpprivatenamespaceattributes: Long, lpboundarydescriptor: Long, lpaliasprefix: PCSTR): HANDLE

public expect fun CreatePrivateNamespaceW(lpprivatenamespaceattributes: Long, lpboundarydescriptor: Long, lpaliasprefix: PCWSTR): HANDLE

public expect fun CreateProcessA(lpapplicationname: PCSTR, lpcommandline: PSTR, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: BOOL, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL

public expect fun CreateProcessAsUserA(htoken: HANDLE, lpapplicationname: PCSTR, lpcommandline: PSTR, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: BOOL, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL

public expect fun CreateProcessAsUserW(htoken: HANDLE, lpapplicationname: PCWSTR, lpcommandline: PWSTR, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: BOOL, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCWSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL

public expect fun CreateProcessW(lpapplicationname: PCWSTR, lpcommandline: PWSTR, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: BOOL, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCWSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL

public expect fun CreateProcessWithLogonW(lpusername: PCWSTR, lpdomain: PCWSTR, lppassword: PCWSTR, dwlogonflags: CREATE_PROCESS_LOGON_FLAGS, lpapplicationname: PCWSTR, lpcommandline: PWSTR, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCWSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL

public expect fun CreateProcessWithTokenW(htoken: HANDLE, dwlogonflags: CREATE_PROCESS_LOGON_FLAGS, lpapplicationname: PCWSTR, lpcommandline: PWSTR, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCWSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL

public expect fun CreateRemoteThread(hprocess: HANDLE, lpthreadattributes: Long, dwstacksize: ULong, lpstartaddress: LPTHREAD_START_ROUTINE, lpparameter: Long, dwcreationflags: UInt, lpthreadid: Long): HANDLE

public expect fun CreateRemoteThreadEx(hprocess: HANDLE, lpthreadattributes: Long, dwstacksize: ULong, lpstartaddress: LPTHREAD_START_ROUTINE, lpparameter: Long, dwcreationflags: UInt, lpattributelist: LPPROC_THREAD_ATTRIBUTE_LIST, lpthreadid: Long): HANDLE

public expect fun CreateSemaphoreA(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: PCSTR): HANDLE

public expect fun CreateSemaphoreExA(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: PCSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE

public expect fun CreateSemaphoreExW(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: PCWSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE

public expect fun CreateSemaphoreW(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: PCWSTR): HANDLE

public expect fun CreateThread(lpthreadattributes: Long, dwstacksize: ULong, lpstartaddress: LPTHREAD_START_ROUTINE, lpparameter: Long, dwcreationflags: THREAD_CREATION_FLAGS, lpthreadid: Long): HANDLE

public expect fun CreateThreadpool(reserved: Long): PTP_POOL

public expect fun CreateThreadpoolCleanupGroup(): PTP_CLEANUP_GROUP

public expect fun CreateThreadpoolIo(fl: HANDLE, pfnio: PTP_WIN32_IO_CALLBACK, pv: Long, pcbe: Long): PTP_IO

public expect fun CreateThreadpoolTimer(pfnti: PTP_TIMER_CALLBACK, pv: Long, pcbe: Long): PTP_TIMER

public expect fun CreateThreadpoolWait(pfnwa: PTP_WAIT_CALLBACK, pv: Long, pcbe: Long): PTP_WAIT

public expect fun CreateThreadpoolWork(pfnwk: PTP_WORK_CALLBACK, pv: Long, pcbe: Long): PTP_WORK

public expect fun CreateTimerQueue(): HANDLE

public expect fun CreateTimerQueueTimer(phnewtimer: Long, timerqueue: HANDLE, callback: WAITORTIMERCALLBACK, parameter: Long, duetime: UInt, period: UInt, flags: WORKER_THREAD_FLAGS): BOOL

public expect fun CreateUmsCompletionList(umscompletionlist: Long): BOOL

public expect fun CreateUmsThreadContext(lpumsthread: Long): BOOL

public expect fun CreateWaitableTimerA(lptimerattributes: Long, bmanualreset: BOOL, lptimername: PCSTR): HANDLE

public expect fun CreateWaitableTimerExA(lptimerattributes: Long, lptimername: PCSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE

public expect fun CreateWaitableTimerExW(lptimerattributes: Long, lptimername: PCWSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE

public expect fun CreateWaitableTimerW(lptimerattributes: Long, bmanualreset: BOOL, lptimername: PCWSTR): HANDLE

public expect fun DeleteBoundaryDescriptor(boundarydescriptor: HANDLE)

public expect fun DeleteCriticalSection(lpcriticalsection: Long)

public expect fun DeleteFiber(lpfiber: Long)

public expect fun DeleteProcThreadAttributeList(lpattributelist: LPPROC_THREAD_ATTRIBUTE_LIST)

public expect fun DeleteSynchronizationBarrier(lpbarrier: Long): BOOL

public expect fun DeleteTimerQueue(timerqueue: HANDLE): BOOL

public expect fun DeleteTimerQueueEx(timerqueue: HANDLE, completionevent: HANDLE): BOOL

public expect fun DeleteTimerQueueTimer(timerqueue: HANDLE, timer: HANDLE, completionevent: HANDLE): BOOL

public expect fun DeleteUmsCompletionList(umscompletionlist: Long): BOOL

public expect fun DeleteUmsThreadContext(umsthread: Long): BOOL

public expect fun DequeueUmsCompletionListItems(umscompletionlist: Long, waittimeout: UInt, umsthreadlist: Long): BOOL

public expect fun DisassociateCurrentThreadFromCallback(pci: PTP_CALLBACK_INSTANCE)

public expect fun EnterCriticalSection(lpcriticalsection: Long)

public expect fun EnterSynchronizationBarrier(lpbarrier: Long, dwflags: UInt): BOOL

public expect fun EnterUmsSchedulingMode(schedulerstartupinfo: Long): BOOL

public expect fun ExecuteUmsThread(umsthread: Long): BOOL

public expect fun ExitProcess(uexitcode: UInt): Nothing

public expect fun ExitThread(dwexitcode: UInt): Nothing

public expect fun FlsAlloc(lpcallback: PFLS_CALLBACK_FUNCTION): UInt

public expect fun FlsFree(dwflsindex: UInt): BOOL

public expect fun FlsGetValue(dwflsindex: UInt): Long

public expect fun FlsSetValue(dwflsindex: UInt, lpflsdata: Long): BOOL

public expect fun FlushProcessWriteBuffers()

public expect fun FreeLibraryWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, mod: HMODULE)

public expect fun GetActiveProcessorCount(groupnumber: UShort): UInt

public expect fun GetActiveProcessorGroupCount(): UShort

public expect fun GetCurrentProcess(): HANDLE

public expect fun GetCurrentProcessId(): UInt

public expect fun GetCurrentProcessorNumber(): UInt

public expect fun GetCurrentProcessorNumberEx(procnumber: Long)

public expect fun GetCurrentThread(): HANDLE

public expect fun GetCurrentThreadId(): UInt

public expect fun GetCurrentThreadStackLimits(lowlimit: Long, highlimit: Long)

public expect fun GetCurrentUmsThread(): Long

public expect fun GetExitCodeProcess(hprocess: HANDLE, lpexitcode: Long): BOOL

public expect fun GetExitCodeThread(hthread: HANDLE, lpexitcode: Long): BOOL

public expect fun GetGuiResources(hprocess: HANDLE, uiflags: GET_GUI_RESOURCES_FLAGS): UInt

public expect fun GetMachineTypeAttributes(machine: UShort, machinetypeattributes: Long): HRESULT

public expect fun GetMaximumProcessorCount(groupnumber: UShort): UInt

public expect fun GetMaximumProcessorGroupCount(): UShort

public expect fun GetNextUmsListItem(umscontext: Long): Long

public expect fun GetNumaAvailableMemoryNode(node: UByte, availablebytes: Long): BOOL

public expect fun GetNumaAvailableMemoryNodeEx(node: UShort, availablebytes: Long): BOOL

public expect fun GetNumaHighestNodeNumber(highestnodenumber: Long): BOOL

public expect fun GetNumaNodeNumberFromHandle(hfile: HANDLE, nodenumber: Long): BOOL

public expect fun GetNumaNodeProcessorMask(node: UByte, processormask: Long): BOOL

public expect fun GetNumaNodeProcessorMask2(nodenumber: UShort, processormasks: Long, processormaskcount: UShort, requiredmaskcount: Long): BOOL

public expect fun GetNumaNodeProcessorMaskEx(node: UShort, processormask: Long): BOOL

public expect fun GetNumaProcessorNode(processor: UByte, nodenumber: Long): BOOL

public expect fun GetNumaProcessorNodeEx(processor: Long, nodenumber: Long): BOOL

public expect fun GetNumaProximityNode(proximityid: UInt, nodenumber: Long): BOOL

public expect fun GetNumaProximityNodeEx(proximityid: UInt, nodenumber: Long): BOOL

public expect fun GetPriorityClass(hprocess: HANDLE): UInt

public expect fun GetProcessAffinityMask(hprocess: HANDLE, lpprocessaffinitymask: Long, lpsystemaffinitymask: Long): BOOL

public expect fun GetProcessDEPPolicy(hprocess: HANDLE, lpflags: Long, lppermanent: Long): BOOL

public expect fun GetProcessDefaultCpuSetMasks(process: HANDLE, cpusetmasks: Long, cpusetmaskcount: UShort, requiredmaskcount: Long): BOOL

public expect fun GetProcessDefaultCpuSets(process: HANDLE, cpusetids: Long, cpusetidcount: UInt, requiredidcount: Long): BOOL

public expect fun GetProcessGroupAffinity(hprocess: HANDLE, groupcount: Long, grouparray: Long): BOOL

public expect fun GetProcessHandleCount(hprocess: HANDLE, pdwhandlecount: Long): BOOL

public expect fun GetProcessHandleFromHwnd(hwnd: HWND): HANDLE

public expect fun GetProcessId(process: HANDLE): UInt

public expect fun GetProcessIdOfThread(thread: HANDLE): UInt

public expect fun GetProcessInformation(hprocess: HANDLE, processinformationclass: PROCESS_INFORMATION_CLASS, processinformation: Long, processinformationsize: UInt): BOOL

public expect fun GetProcessIoCounters(hprocess: HANDLE, lpiocounters: Long): BOOL

public expect fun GetProcessMitigationPolicy(hprocess: HANDLE, mitigationpolicy: PROCESS_MITIGATION_POLICY, lpbuffer: Long, dwlength: ULong): BOOL

public expect fun GetProcessPriorityBoost(hprocess: HANDLE, pdisablepriorityboost: Long): BOOL

public expect fun GetProcessShutdownParameters(lpdwlevel: Long, lpdwflags: Long): BOOL

public expect fun GetProcessTimes(hprocess: HANDLE, lpcreationtime: Long, lpexittime: Long, lpkerneltime: Long, lpusertime: Long): BOOL

public expect fun GetProcessVersion(processid: UInt): UInt

public expect fun GetProcessWorkingSetSize(hprocess: HANDLE, lpminimumworkingsetsize: Long, lpmaximumworkingsetsize: Long): BOOL

public expect fun GetStartupInfoA(lpstartupinfo: Long)

public expect fun GetStartupInfoW(lpstartupinfo: Long)

public expect fun GetSystemTimes(lpidletime: Long, lpkerneltime: Long, lpusertime: Long): BOOL

public expect fun GetThreadDescription(hthread: HANDLE, ppszthreaddescription: Long): HRESULT

public expect fun GetThreadGroupAffinity(hthread: HANDLE, groupaffinity: Long): BOOL

public expect fun GetThreadIOPendingFlag(hthread: HANDLE, lpioispending: Long): BOOL

public expect fun GetThreadId(thread: HANDLE): UInt

public expect fun GetThreadIdealProcessorEx(hthread: HANDLE, lpidealprocessor: Long): BOOL

public expect fun GetThreadInformation(hthread: HANDLE, threadinformationclass: THREAD_INFORMATION_CLASS, threadinformation: Long, threadinformationsize: UInt): BOOL

public expect fun GetThreadPriority(hthread: HANDLE): Int

public expect fun GetThreadPriorityBoost(hthread: HANDLE, pdisablepriorityboost: Long): BOOL

public expect fun GetThreadSelectedCpuSetMasks(thread: HANDLE, cpusetmasks: Long, cpusetmaskcount: UShort, requiredmaskcount: Long): BOOL

public expect fun GetThreadSelectedCpuSets(thread: HANDLE, cpusetids: Long, cpusetidcount: UInt, requiredidcount: Long): BOOL

public expect fun GetThreadTimes(hthread: HANDLE, lpcreationtime: Long, lpexittime: Long, lpkerneltime: Long, lpusertime: Long): BOOL

public expect fun GetUmsCompletionListEvent(umscompletionlist: Long, umscompletionevent: Long): BOOL

public expect fun GetUmsSystemThreadInformation(threadhandle: HANDLE, systemthreadinfo: Long): BOOL

public expect fun InitOnceBeginInitialize(lpinitonce: Long, dwflags: UInt, fpending: Long, lpcontext: Long): BOOL

public expect fun InitOnceComplete(lpinitonce: Long, dwflags: UInt, lpcontext: Long): BOOL

public expect fun InitOnceExecuteOnce(initonce: Long, initfn: PINIT_ONCE_FN, parameter: Long, context: Long): BOOL

public expect fun InitOnceInitialize(initonce: Long)

public expect fun InitializeConditionVariable(conditionvariable: Long)

public expect fun InitializeCriticalSection(lpcriticalsection: Long)

public expect fun InitializeCriticalSectionAndSpinCount(lpcriticalsection: Long, dwspincount: UInt): BOOL

public expect fun InitializeCriticalSectionEx(lpcriticalsection: Long, dwspincount: UInt, flags: UInt): BOOL

public expect fun InitializeProcThreadAttributeList(lpattributelist: LPPROC_THREAD_ATTRIBUTE_LIST, dwattributecount: UInt, dwflags: UInt, lpsize: Long): BOOL

public expect fun InitializeSListHead(listhead: Long)

public expect fun InitializeSRWLock(srwlock: Long)

public expect fun InitializeSynchronizationBarrier(lpbarrier: Long, ltotalthreads: Int, lspincount: Int): BOOL

public expect fun InterlockedFlushSList(listhead: Long): Long

public expect fun InterlockedPopEntrySList(listhead: Long): Long

public expect fun InterlockedPushEntrySList(listhead: Long, listentry: Long): Long

public expect fun InterlockedPushListSListEx(listhead: Long, list: Long, listend: Long, count: UInt): Long

public expect fun IsImmersiveProcess(hprocess: HANDLE): BOOL

public expect fun IsProcessCritical(hprocess: HANDLE, critical: Long): BOOL

public expect fun IsProcessorFeaturePresent(processorfeature: PROCESSOR_FEATURE_ID): BOOL

public expect fun IsThreadAFiber(): BOOL

public expect fun IsThreadpoolTimerSet(pti: PTP_TIMER): BOOL

public expect fun IsWow64Process(hprocess: HANDLE, wow64process: Long): BOOL

public expect fun IsWow64Process2(hprocess: HANDLE, pprocessmachine: Long, pnativemachine: Long): BOOL

public expect fun LeaveCriticalSection(lpcriticalsection: Long)

public expect fun LeaveCriticalSectionWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, pcs: Long)

public expect fun OpenEventA(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lpname: PCSTR): HANDLE

public expect fun OpenEventW(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lpname: PCWSTR): HANDLE

public expect fun OpenMutexW(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lpname: PCWSTR): HANDLE

public expect fun OpenPrivateNamespaceA(lpboundarydescriptor: Long, lpaliasprefix: PCSTR): HANDLE

public expect fun OpenPrivateNamespaceW(lpboundarydescriptor: Long, lpaliasprefix: PCWSTR): HANDLE

public expect fun OpenProcess(dwdesiredaccess: PROCESS_ACCESS_RIGHTS, binherithandle: BOOL, dwprocessid: UInt): HANDLE

public expect fun OpenProcessToken(processhandle: HANDLE, desiredaccess: TOKEN_ACCESS_MASK, tokenhandle: Long): BOOL

public expect fun OpenSemaphoreW(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lpname: PCWSTR): HANDLE

public expect fun OpenThread(dwdesiredaccess: THREAD_ACCESS_RIGHTS, binherithandle: BOOL, dwthreadid: UInt): HANDLE

public expect fun OpenThreadToken(threadhandle: HANDLE, desiredaccess: TOKEN_ACCESS_MASK, openasself: BOOL, tokenhandle: Long): BOOL

public expect fun OpenWaitableTimerA(dwdesiredaccess: UInt, binherithandle: BOOL, lptimername: PCSTR): HANDLE

public expect fun OpenWaitableTimerW(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lptimername: PCWSTR): HANDLE

public expect fun PulseEvent(hevent: HANDLE): BOOL

public expect fun QueryDepthSList(listhead: Long): UShort

public expect fun QueryFullProcessImageNameA(hprocess: HANDLE, dwflags: PROCESS_NAME_FORMAT, lpexename: PSTR, lpdwsize: Long): BOOL

public expect fun QueryFullProcessImageNameW(hprocess: HANDLE, dwflags: PROCESS_NAME_FORMAT, lpexename: PWSTR, lpdwsize: Long): BOOL

public expect fun QueryProcessAffinityUpdateMode(hprocess: HANDLE, lpdwflags: Long): BOOL

public expect fun QueryProtectedPolicy(policyguid: Long, policyvalue: Long): BOOL

public expect fun QueryThreadpoolStackInformation(ptpp: PTP_POOL, ptpsi: Long): BOOL

public expect fun QueryUmsThreadInformation(umsthread: Long, umsthreadinfoclass: UMS_THREAD_INFO_CLASS, umsthreadinformation: Long, umsthreadinformationlength: UInt, returnlength: Long): BOOL

public expect fun QueueUserAPC(pfnapc: PAPCFUNC, hthread: HANDLE, dwdata: ULong): UInt

public expect fun QueueUserAPC2(apcroutine: PAPCFUNC, thread: HANDLE, data: ULong, flags: QUEUE_USER_APC_FLAGS): BOOL

public expect fun QueueUserWorkItem(function: LPTHREAD_START_ROUTINE, context: Long, flags: WORKER_THREAD_FLAGS): BOOL

public expect fun RegisterWaitForSingleObject(phnewwaitobject: Long, hobject: HANDLE, callback: WAITORTIMERCALLBACK, context: Long, dwmilliseconds: UInt, dwflags: WORKER_THREAD_FLAGS): BOOL

public expect fun ReleaseMutex(hmutex: HANDLE): BOOL

public expect fun ReleaseMutexWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, mut: HANDLE)

public expect fun ReleaseSRWLockExclusive(srwlock: Long)

public expect fun ReleaseSRWLockShared(srwlock: Long)

public expect fun ReleaseSemaphore(hsemaphore: HANDLE, lreleasecount: Int, lppreviouscount: Long): BOOL

public expect fun ReleaseSemaphoreWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, sem: HANDLE, crel: UInt)

public expect fun ResetEvent(hevent: HANDLE): BOOL

public expect fun ResumeThread(hthread: HANDLE): UInt

public expect fun RtwqAddPeriodicCallback(callback: RTWQPERIODICCALLBACK, context: Long, key: Long): HRESULT

public expect fun RtwqAllocateSerialWorkQueue(workqueueidin: UInt, workqueueidout: Long): HRESULT

public expect fun RtwqAllocateWorkQueue(workqueuetype: RTWQ_WORKQUEUE_TYPE, workqueueid: Long): HRESULT

public expect fun RtwqBeginRegisterWorkQueueWithMMCSS(workqueueid: UInt, usageclass: PCWSTR, dwtaskid: UInt, lpriority: Int, donecallback: Long, donestate: Long): HRESULT

public expect fun RtwqBeginUnregisterWorkQueueWithMMCSS(workqueueid: UInt, donecallback: Long, donestate: Long): HRESULT

public expect fun RtwqCancelDeadline(prequest: HANDLE): HRESULT

public expect fun RtwqCancelWorkItem(key: ULong): HRESULT

public expect fun RtwqCreateAsyncResult(appobject: Long, callback: Long, appstate: Long, asyncresult: Long): HRESULT

public expect fun RtwqEndRegisterWorkQueueWithMMCSS(result: Long, taskid: Long): HRESULT

public expect fun RtwqGetWorkQueueMMCSSClass(workqueueid: UInt, usageclass: PWSTR, usageclasslength: Long): HRESULT

public expect fun RtwqGetWorkQueueMMCSSPriority(workqueueid: UInt, priority: Long): HRESULT

public expect fun RtwqGetWorkQueueMMCSSTaskId(workqueueid: UInt, taskid: Long): HRESULT

public expect fun RtwqInvokeCallback(result: Long): HRESULT

public expect fun RtwqJoinWorkQueue(workqueueid: UInt, hfile: HANDLE, out: Long): HRESULT

public expect fun RtwqLockPlatform(): HRESULT

public expect fun RtwqLockSharedWorkQueue(usageclass: PCWSTR, basepriority: Int, taskid: Long, id: Long): HRESULT

public expect fun RtwqLockWorkQueue(workqueueid: UInt): HRESULT

public expect fun RtwqPutWaitingWorkItem(hevent: HANDLE, lpriority: Int, result: Long, key: Long): HRESULT

public expect fun RtwqPutWorkItem(dwqueue: UInt, lpriority: Int, result: Long): HRESULT

public expect fun RtwqRegisterPlatformEvents(platformevents: Long): HRESULT

public expect fun RtwqRegisterPlatformWithMMCSS(usageclass: PCWSTR, taskid: Long, lpriority: Int): HRESULT

public expect fun RtwqRemovePeriodicCallback(dwkey: UInt): HRESULT

public expect fun RtwqScheduleWorkItem(result: Long, timeout: Long, key: Long): HRESULT

public expect fun RtwqSetDeadline(workqueueid: UInt, deadlineinhns: Long, prequest: Long): HRESULT

public expect fun RtwqSetDeadline2(workqueueid: UInt, deadlineinhns: Long, predeadlineinhns: Long, prequest: Long): HRESULT

public expect fun RtwqSetLongRunning(workqueueid: UInt, enable: BOOL): HRESULT

public expect fun RtwqShutdown(): HRESULT

public expect fun RtwqStartup(): HRESULT

public expect fun RtwqUnjoinWorkQueue(workqueueid: UInt, hfile: HANDLE): HRESULT

public expect fun RtwqUnlockPlatform(): HRESULT

public expect fun RtwqUnlockWorkQueue(workqueueid: UInt): HRESULT

public expect fun RtwqUnregisterPlatformEvents(platformevents: Long): HRESULT

public expect fun RtwqUnregisterPlatformFromMMCSS(): HRESULT

public expect fun SetCriticalSectionSpinCount(lpcriticalsection: Long, dwspincount: UInt): UInt

public expect fun SetEvent(hevent: HANDLE): BOOL

public expect fun SetEventWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, evt: HANDLE)

public expect fun SetPriorityClass(hprocess: HANDLE, dwpriorityclass: PROCESS_CREATION_FLAGS): BOOL

public expect fun SetProcessAffinityMask(hprocess: HANDLE, dwprocessaffinitymask: ULong): BOOL

public expect fun SetProcessAffinityUpdateMode(hprocess: HANDLE, dwflags: PROCESS_AFFINITY_AUTO_UPDATE_FLAGS): BOOL

public expect fun SetProcessDEPPolicy(dwflags: PROCESS_DEP_FLAGS): BOOL

public expect fun SetProcessDefaultCpuSetMasks(process: HANDLE, cpusetmasks: Long, cpusetmaskcount: UShort): BOOL

public expect fun SetProcessDefaultCpuSets(process: HANDLE, cpusetids: Long, cpusetidcount: UInt): BOOL

public expect fun SetProcessDynamicEHContinuationTargets(process: HANDLE, numberoftargets: UShort, targets: Long): BOOL

public expect fun SetProcessDynamicEnforcedCetCompatibleRanges(process: HANDLE, numberofranges: UShort, ranges: Long): BOOL

public expect fun SetProcessInformation(hprocess: HANDLE, processinformationclass: PROCESS_INFORMATION_CLASS, processinformation: Long, processinformationsize: UInt): BOOL

public expect fun SetProcessMitigationPolicy(mitigationpolicy: PROCESS_MITIGATION_POLICY, lpbuffer: Long, dwlength: ULong): BOOL

public expect fun SetProcessPriorityBoost(hprocess: HANDLE, bdisablepriorityboost: BOOL): BOOL

public expect fun SetProcessRestrictionExemption(fenableexemption: BOOL): BOOL

public expect fun SetProcessShutdownParameters(dwlevel: UInt, dwflags: UInt): BOOL

public expect fun SetProcessWorkingSetSize(hprocess: HANDLE, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong): BOOL

public expect fun SetProtectedPolicy(policyguid: Long, policyvalue: ULong, oldpolicyvalue: Long): BOOL

public expect fun SetThreadAffinityMask(hthread: HANDLE, dwthreadaffinitymask: ULong): ULong

public expect fun SetThreadDescription(hthread: HANDLE, lpthreaddescription: PCWSTR): HRESULT

public expect fun SetThreadGroupAffinity(hthread: HANDLE, groupaffinity: Long, previousgroupaffinity: Long): BOOL

public expect fun SetThreadIdealProcessor(hthread: HANDLE, dwidealprocessor: UInt): UInt

public expect fun SetThreadIdealProcessorEx(hthread: HANDLE, lpidealprocessor: Long, lppreviousidealprocessor: Long): BOOL

public expect fun SetThreadInformation(hthread: HANDLE, threadinformationclass: THREAD_INFORMATION_CLASS, threadinformation: Long, threadinformationsize: UInt): BOOL

public expect fun SetThreadPriority(hthread: HANDLE, npriority: THREAD_PRIORITY): BOOL

public expect fun SetThreadPriorityBoost(hthread: HANDLE, bdisablepriorityboost: BOOL): BOOL

public expect fun SetThreadSelectedCpuSetMasks(thread: HANDLE, cpusetmasks: Long, cpusetmaskcount: UShort): BOOL

public expect fun SetThreadSelectedCpuSets(thread: HANDLE, cpusetids: Long, cpusetidcount: UInt): BOOL

public expect fun SetThreadStackGuarantee(stacksizeinbytes: Long): BOOL

public expect fun SetThreadToken(thread: Long, token: HANDLE): BOOL

public expect fun SetThreadpoolStackInformation(ptpp: PTP_POOL, ptpsi: Long): BOOL

public expect fun SetThreadpoolThreadMaximum(ptpp: PTP_POOL, cthrdmost: UInt)

public expect fun SetThreadpoolThreadMinimum(ptpp: PTP_POOL, cthrdmic: UInt): BOOL

public expect fun SetThreadpoolTimer(pti: PTP_TIMER, pftduetime: Long, msperiod: UInt, mswindowlength: UInt)

public expect fun SetThreadpoolTimerEx(pti: PTP_TIMER, pftduetime: Long, msperiod: UInt, mswindowlength: UInt): BOOL

public expect fun SetThreadpoolWait(pwa: PTP_WAIT, h: HANDLE, pfttimeout: Long)

public expect fun SetThreadpoolWaitEx(pwa: PTP_WAIT, h: HANDLE, pfttimeout: Long, reserved: Long): BOOL

public expect fun SetTimerQueueTimer(timerqueue: HANDLE, callback: WAITORTIMERCALLBACK, parameter: Long, duetime: UInt, period: UInt, preferio: BOOL): HANDLE

public expect fun SetUmsThreadInformation(umsthread: Long, umsthreadinfoclass: UMS_THREAD_INFO_CLASS, umsthreadinformation: Long, umsthreadinformationlength: UInt): BOOL

public expect fun SetWaitableTimer(htimer: HANDLE, lpduetime: Long, lperiod: Int, pfncompletionroutine: PTIMERAPCROUTINE, lpargtocompletionroutine: Long, fresume: BOOL): BOOL

public expect fun SetWaitableTimerEx(htimer: HANDLE, lpduetime: Long, lperiod: Int, pfncompletionroutine: PTIMERAPCROUTINE, lpargtocompletionroutine: Long, wakecontext: Long, tolerabledelay: UInt): BOOL

public expect fun SignalObjectAndWait(hobjecttosignal: HANDLE, hobjecttowaiton: HANDLE, dwmilliseconds: UInt, balertable: BOOL): WAIT_EVENT

public expect fun Sleep(dwmilliseconds: UInt)

public expect fun SleepConditionVariableCS(conditionvariable: Long, criticalsection: Long, dwmilliseconds: UInt): BOOL

public expect fun SleepConditionVariableSRW(conditionvariable: Long, srwlock: Long, dwmilliseconds: UInt, flags: UInt): BOOL

public expect fun SleepEx(dwmilliseconds: UInt, balertable: BOOL): UInt

public expect fun StartThreadpoolIo(pio: PTP_IO)

public expect fun SubmitThreadpoolWork(pwk: PTP_WORK)

public expect fun SuspendThread(hthread: HANDLE): UInt

public expect fun SwitchToFiber(lpfiber: Long)

public expect fun SwitchToThread(): BOOL

public expect fun TerminateProcess(hprocess: HANDLE, uexitcode: UInt): BOOL

public expect fun TerminateThread(hthread: HANDLE, dwexitcode: UInt): BOOL

public expect fun TlsAlloc(): UInt

public expect fun TlsFree(dwtlsindex: UInt): BOOL

public expect fun TlsGetValue(dwtlsindex: UInt): Long

public expect fun TlsSetValue(dwtlsindex: UInt, lptlsvalue: Long): BOOL

public expect fun TryAcquireSRWLockExclusive(srwlock: Long): Boolean

public expect fun TryAcquireSRWLockShared(srwlock: Long): Boolean

public expect fun TryEnterCriticalSection(lpcriticalsection: Long): BOOL

public expect fun TrySubmitThreadpoolCallback(pfns: PTP_SIMPLE_CALLBACK, pv: Long, pcbe: Long): BOOL

public expect fun UmsThreadYield(schedulerparam: Long): BOOL

public expect fun UnregisterWait(waithandle: HANDLE): BOOL

public expect fun UnregisterWaitEx(waithandle: HANDLE, completionevent: HANDLE): BOOL

public expect fun UpdateProcThreadAttribute(lpattributelist: LPPROC_THREAD_ATTRIBUTE_LIST, dwflags: UInt, attribute: ULong, lpvalue: Long, cbsize: ULong, lppreviousvalue: Long, lpreturnsize: Long): BOOL

public expect fun WaitForInputIdle(hprocess: HANDLE, dwmilliseconds: UInt): UInt

public expect fun WaitForMultipleObjects(ncount: UInt, lphandles: Long, bwaitall: BOOL, dwmilliseconds: UInt): WAIT_EVENT

public expect fun WaitForMultipleObjectsEx(ncount: UInt, lphandles: Long, bwaitall: BOOL, dwmilliseconds: UInt, balertable: BOOL): WAIT_EVENT

public expect fun WaitForSingleObject(hhandle: HANDLE, dwmilliseconds: UInt): WAIT_EVENT

public expect fun WaitForSingleObjectEx(hhandle: HANDLE, dwmilliseconds: UInt, balertable: BOOL): WAIT_EVENT

public expect fun WaitForThreadpoolIoCallbacks(pio: PTP_IO, fcancelpendingcallbacks: BOOL)

public expect fun WaitForThreadpoolTimerCallbacks(pti: PTP_TIMER, fcancelpendingcallbacks: BOOL)

public expect fun WaitForThreadpoolWaitCallbacks(pwa: PTP_WAIT, fcancelpendingcallbacks: BOOL)

public expect fun WaitForThreadpoolWorkCallbacks(pwk: PTP_WORK, fcancelpendingcallbacks: BOOL)

public expect fun WaitOnAddress(address: Long, compareaddress: Long, addresssize: ULong, dwmilliseconds: UInt): BOOL

public expect fun WakeAllConditionVariable(conditionvariable: Long)

public expect fun WakeByAddressAll(address: Long)

public expect fun WakeByAddressSingle(address: Long)

public expect fun WakeConditionVariable(conditionvariable: Long)

public expect fun WinExec(lpcmdline: PCSTR, ucmdshow: UInt): UInt

public expect fun Wow64SetThreadDefaultGuestMachine(machine: UShort): UShort

public expect fun Wow64SuspendThread(hthread: HANDLE): UInt
