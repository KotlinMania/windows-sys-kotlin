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

private object WindowsWin32SystemThreadingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_AcquireSRWLockExclusive(srwlock: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_AcquireSRWLockShared(srwlock: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_AddIntegrityLabelToBoundaryDescriptor(boundarydescriptor: Long, integritylabel: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_AddSIDToBoundaryDescriptor(boundarydescriptor: Long, requiredsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_AttachThreadInput(idattach: Int, idattachto: Int, fattach: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_AvQuerySystemResponsiveness(avrthandle: Long, systemresponsivenessvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_AvRevertMmThreadCharacteristics(avrthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_AvRtCreateThreadOrderingGroup(context: Long, period: Long, threadorderingguid: Long, timeout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_AvRtCreateThreadOrderingGroupExA(context: Long, period: Long, threadorderingguid: Long, timeout: Long, taskname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_AvRtCreateThreadOrderingGroupExW(context: Long, period: Long, threadorderingguid: Long, timeout: Long, taskname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_AvRtDeleteThreadOrderingGroup(context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_AvRtJoinThreadOrderingGroup(context: Long, threadorderingguid: Long, before: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_AvRtLeaveThreadOrderingGroup(context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_AvRtWaitOnThreadOrderingGroup(context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_AvSetMmMaxThreadCharacteristicsA(firsttask: Long, secondtask: Long, taskindex: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_AvSetMmMaxThreadCharacteristicsW(firsttask: Long, secondtask: Long, taskindex: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_AvSetMmThreadCharacteristicsA(taskname: Long, taskindex: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_AvSetMmThreadCharacteristicsW(taskname: Long, taskindex: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_AvSetMmThreadPriority(avrthandle: Long, priority: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CallbackMayRunLong(pci: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CancelThreadpoolIo(pio: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CancelTimerQueueTimer(timerqueue: Long, timer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CancelWaitableTimer(htimer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_ChangeTimerQueueTimer(timerqueue: Long, timer: Long, duetime: Int, period: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_ClosePrivateNamespace(handle: Long, flags: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CloseThreadpool(ptpp: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CloseThreadpoolCleanupGroup(ptpcg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CloseThreadpoolCleanupGroupMembers(ptpcg: Long, fcancelpendingcallbacks: Int, pvcleanupcontext: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CloseThreadpoolIo(pio: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CloseThreadpoolTimer(pti: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CloseThreadpoolWait(pwa: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CloseThreadpoolWork(pwk: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_ConvertFiberToThread(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_ConvertThreadToFiber(lpparameter: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_ConvertThreadToFiberEx(lpparameter: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateBoundaryDescriptorA(name: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateBoundaryDescriptorW(name: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateEventA(lpeventattributes: Long, bmanualreset: Int, binitialstate: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateEventExA(lpeventattributes: Long, lpname: Long, dwflags: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateEventExW(lpeventattributes: Long, lpname: Long, dwflags: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateEventW(lpeventattributes: Long, bmanualreset: Int, binitialstate: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateFiber(dwstacksize: Long, lpstartaddress: Long, lpparameter: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateFiberEx(dwstackcommitsize: Long, dwstackreservesize: Long, dwflags: Int, lpstartaddress: Long, lpparameter: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateMutexA(lpmutexattributes: Long, binitialowner: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateMutexExA(lpmutexattributes: Long, lpname: Long, dwflags: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateMutexExW(lpmutexattributes: Long, lpname: Long, dwflags: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateMutexW(lpmutexattributes: Long, binitialowner: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreatePrivateNamespaceA(lpprivatenamespaceattributes: Long, lpboundarydescriptor: Long, lpaliasprefix: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreatePrivateNamespaceW(lpprivatenamespaceattributes: Long, lpboundarydescriptor: Long, lpaliasprefix: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateProcessA(lpapplicationname: Long, lpcommandline: Long, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: Int, dwcreationflags: Int, lpenvironment: Long, lpcurrentdirectory: Long, lpstartupinfo: Long, lpprocessinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateProcessAsUserA(htoken: Long, lpapplicationname: Long, lpcommandline: Long, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: Int, dwcreationflags: Int, lpenvironment: Long, lpcurrentdirectory: Long, lpstartupinfo: Long, lpprocessinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateProcessAsUserW(htoken: Long, lpapplicationname: Long, lpcommandline: Long, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: Int, dwcreationflags: Int, lpenvironment: Long, lpcurrentdirectory: Long, lpstartupinfo: Long, lpprocessinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateProcessW(lpapplicationname: Long, lpcommandline: Long, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: Int, dwcreationflags: Int, lpenvironment: Long, lpcurrentdirectory: Long, lpstartupinfo: Long, lpprocessinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateProcessWithLogonW(lpusername: Long, lpdomain: Long, lppassword: Long, dwlogonflags: Int, lpapplicationname: Long, lpcommandline: Long, dwcreationflags: Int, lpenvironment: Long, lpcurrentdirectory: Long, lpstartupinfo: Long, lpprocessinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateProcessWithTokenW(htoken: Long, dwlogonflags: Int, lpapplicationname: Long, lpcommandline: Long, dwcreationflags: Int, lpenvironment: Long, lpcurrentdirectory: Long, lpstartupinfo: Long, lpprocessinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateRemoteThread(hprocess: Long, lpthreadattributes: Long, dwstacksize: Long, lpstartaddress: Long, lpparameter: Long, dwcreationflags: Int, lpthreadid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateRemoteThreadEx(hprocess: Long, lpthreadattributes: Long, dwstacksize: Long, lpstartaddress: Long, lpparameter: Long, dwcreationflags: Int, lpattributelist: Long, lpthreadid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateSemaphoreA(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateSemaphoreExA(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: Long, dwflags: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateSemaphoreExW(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: Long, dwflags: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateSemaphoreW(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateThread(lpthreadattributes: Long, dwstacksize: Long, lpstartaddress: Long, lpparameter: Long, dwcreationflags: Int, lpthreadid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateThreadpool(reserved: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateThreadpoolCleanupGroup(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateThreadpoolIo(fl: Long, pfnio: Long, pv: Long, pcbe: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateThreadpoolTimer(pfnti: Long, pv: Long, pcbe: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateThreadpoolWait(pfnwa: Long, pv: Long, pcbe: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateThreadpoolWork(pfnwk: Long, pv: Long, pcbe: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateTimerQueue(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateTimerQueueTimer(phnewtimer: Long, timerqueue: Long, callback: Long, parameter: Long, duetime: Int, period: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateUmsCompletionList(umscompletionlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateUmsThreadContext(lpumsthread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateWaitableTimerA(lptimerattributes: Long, bmanualreset: Int, lptimername: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateWaitableTimerExA(lptimerattributes: Long, lptimername: Long, dwflags: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateWaitableTimerExW(lptimerattributes: Long, lptimername: Long, dwflags: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_CreateWaitableTimerW(lptimerattributes: Long, bmanualreset: Int, lptimername: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_DeleteBoundaryDescriptor(boundarydescriptor: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_DeleteCriticalSection(lpcriticalsection: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_DeleteFiber(lpfiber: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_DeleteProcThreadAttributeList(lpattributelist: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_DeleteSynchronizationBarrier(lpbarrier: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_DeleteTimerQueue(timerqueue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_DeleteTimerQueueEx(timerqueue: Long, completionevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_DeleteTimerQueueTimer(timerqueue: Long, timer: Long, completionevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_DeleteUmsCompletionList(umscompletionlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_DeleteUmsThreadContext(umsthread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_DequeueUmsCompletionListItems(umscompletionlist: Long, waittimeout: Int, umsthreadlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_DisassociateCurrentThreadFromCallback(pci: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_EnterCriticalSection(lpcriticalsection: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_EnterSynchronizationBarrier(lpbarrier: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_EnterUmsSchedulingMode(schedulerstartupinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_ExecuteUmsThread(umsthread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_ExitProcess(uexitcode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_ExitThread(dwexitcode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_FlsAlloc(lpcallback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_FlsFree(dwflsindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_FlsGetValue(dwflsindex: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_FlsSetValue(dwflsindex: Int, lpflsdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_FlushProcessWriteBuffers()

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_FreeLibraryWhenCallbackReturns(pci: Long, mod: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetActiveProcessorCount(groupnumber: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetActiveProcessorGroupCount(): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetCurrentProcess(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetCurrentProcessId(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetCurrentProcessorNumber(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetCurrentProcessorNumberEx(procnumber: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetCurrentThread(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetCurrentThreadId(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetCurrentThreadStackLimits(lowlimit: Long, highlimit: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetCurrentUmsThread(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetExitCodeProcess(hprocess: Long, lpexitcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetExitCodeThread(hthread: Long, lpexitcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetGuiResources(hprocess: Long, uiflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetMachineTypeAttributes(machine: Short, machinetypeattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetMaximumProcessorCount(groupnumber: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetMaximumProcessorGroupCount(): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetNextUmsListItem(umscontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetNumaAvailableMemoryNode(node: Byte, availablebytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetNumaAvailableMemoryNodeEx(node: Short, availablebytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetNumaHighestNodeNumber(highestnodenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetNumaNodeNumberFromHandle(hfile: Long, nodenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetNumaNodeProcessorMask(node: Byte, processormask: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetNumaNodeProcessorMask2(nodenumber: Short, processormasks: Long, processormaskcount: Short, requiredmaskcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetNumaNodeProcessorMaskEx(node: Short, processormask: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetNumaProcessorNode(processor: Byte, nodenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetNumaProcessorNodeEx(processor: Long, nodenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetNumaProximityNode(proximityid: Int, nodenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetNumaProximityNodeEx(proximityid: Int, nodenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetPriorityClass(hprocess: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetProcessAffinityMask(hprocess: Long, lpprocessaffinitymask: Long, lpsystemaffinitymask: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetProcessDEPPolicy(hprocess: Long, lpflags: Long, lppermanent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetProcessDefaultCpuSetMasks(process: Long, cpusetmasks: Long, cpusetmaskcount: Short, requiredmaskcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetProcessDefaultCpuSets(process: Long, cpusetids: Long, cpusetidcount: Int, requiredidcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetProcessGroupAffinity(hprocess: Long, groupcount: Long, grouparray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetProcessHandleCount(hprocess: Long, pdwhandlecount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetProcessHandleFromHwnd(hwnd: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetProcessId(process: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetProcessIdOfThread(thread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetProcessInformation(hprocess: Long, processinformationclass: Int, processinformation: Long, processinformationsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetProcessIoCounters(hprocess: Long, lpiocounters: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetProcessMitigationPolicy(hprocess: Long, mitigationpolicy: Int, lpbuffer: Long, dwlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetProcessPriorityBoost(hprocess: Long, pdisablepriorityboost: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetProcessShutdownParameters(lpdwlevel: Long, lpdwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetProcessTimes(hprocess: Long, lpcreationtime: Long, lpexittime: Long, lpkerneltime: Long, lpusertime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetProcessVersion(processid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetProcessWorkingSetSize(hprocess: Long, lpminimumworkingsetsize: Long, lpmaximumworkingsetsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetStartupInfoA(lpstartupinfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetStartupInfoW(lpstartupinfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetSystemTimes(lpidletime: Long, lpkerneltime: Long, lpusertime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetThreadDescription(hthread: Long, ppszthreaddescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetThreadGroupAffinity(hthread: Long, groupaffinity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetThreadIOPendingFlag(hthread: Long, lpioispending: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetThreadId(thread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetThreadIdealProcessorEx(hthread: Long, lpidealprocessor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetThreadInformation(hthread: Long, threadinformationclass: Int, threadinformation: Long, threadinformationsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetThreadPriority(hthread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetThreadPriorityBoost(hthread: Long, pdisablepriorityboost: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetThreadSelectedCpuSetMasks(thread: Long, cpusetmasks: Long, cpusetmaskcount: Short, requiredmaskcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetThreadSelectedCpuSets(thread: Long, cpusetids: Long, cpusetidcount: Int, requiredidcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetThreadTimes(hthread: Long, lpcreationtime: Long, lpexittime: Long, lpkerneltime: Long, lpusertime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetUmsCompletionListEvent(umscompletionlist: Long, umscompletionevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_GetUmsSystemThreadInformation(threadhandle: Long, systemthreadinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_InitOnceBeginInitialize(lpinitonce: Long, dwflags: Int, fpending: Long, lpcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_InitOnceComplete(lpinitonce: Long, dwflags: Int, lpcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_InitOnceExecuteOnce(initonce: Long, initfn: Long, parameter: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_InitOnceInitialize(initonce: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_InitializeConditionVariable(conditionvariable: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_InitializeCriticalSection(lpcriticalsection: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_InitializeCriticalSectionAndSpinCount(lpcriticalsection: Long, dwspincount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_InitializeCriticalSectionEx(lpcriticalsection: Long, dwspincount: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_InitializeProcThreadAttributeList(lpattributelist: Long, dwattributecount: Int, dwflags: Int, lpsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_InitializeSListHead(listhead: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_InitializeSRWLock(srwlock: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_InitializeSynchronizationBarrier(lpbarrier: Long, ltotalthreads: Int, lspincount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_InterlockedFlushSList(listhead: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_InterlockedPopEntrySList(listhead: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_InterlockedPushEntrySList(listhead: Long, listentry: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_InterlockedPushListSListEx(listhead: Long, list: Long, listend: Long, count: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_IsImmersiveProcess(hprocess: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_IsProcessCritical(hprocess: Long, critical: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_IsProcessorFeaturePresent(processorfeature: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_IsThreadAFiber(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_IsThreadpoolTimerSet(pti: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_IsWow64Process(hprocess: Long, wow64process: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_IsWow64Process2(hprocess: Long, pprocessmachine: Long, pnativemachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_LeaveCriticalSection(lpcriticalsection: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_LeaveCriticalSectionWhenCallbackReturns(pci: Long, pcs: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_OpenEventA(dwdesiredaccess: Int, binherithandle: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_OpenEventW(dwdesiredaccess: Int, binherithandle: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_OpenMutexW(dwdesiredaccess: Int, binherithandle: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_OpenPrivateNamespaceA(lpboundarydescriptor: Long, lpaliasprefix: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_OpenPrivateNamespaceW(lpboundarydescriptor: Long, lpaliasprefix: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_OpenProcess(dwdesiredaccess: Int, binherithandle: Int, dwprocessid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_OpenProcessToken(processhandle: Long, desiredaccess: Int, tokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_OpenSemaphoreW(dwdesiredaccess: Int, binherithandle: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_OpenThread(dwdesiredaccess: Int, binherithandle: Int, dwthreadid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_OpenThreadToken(threadhandle: Long, desiredaccess: Int, openasself: Int, tokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_OpenWaitableTimerA(dwdesiredaccess: Int, binherithandle: Int, lptimername: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_OpenWaitableTimerW(dwdesiredaccess: Int, binherithandle: Int, lptimername: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_PulseEvent(hevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_QueryDepthSList(listhead: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_QueryFullProcessImageNameA(hprocess: Long, dwflags: Int, lpexename: Long, lpdwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_QueryFullProcessImageNameW(hprocess: Long, dwflags: Int, lpexename: Long, lpdwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_QueryProcessAffinityUpdateMode(hprocess: Long, lpdwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_QueryProtectedPolicy(policyguid: Long, policyvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_QueryThreadpoolStackInformation(ptpp: Long, ptpsi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_QueryUmsThreadInformation(umsthread: Long, umsthreadinfoclass: Int, umsthreadinformation: Long, umsthreadinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_QueueUserWorkItem(function: Long, context: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RegisterWaitForSingleObject(phnewwaitobject: Long, hobject: Long, callback: Long, context: Long, dwmilliseconds: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_ReleaseMutex(hmutex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_ReleaseMutexWhenCallbackReturns(pci: Long, mut: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_ReleaseSRWLockExclusive(srwlock: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_ReleaseSRWLockShared(srwlock: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_ReleaseSemaphore(hsemaphore: Long, lreleasecount: Int, lppreviouscount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_ReleaseSemaphoreWhenCallbackReturns(pci: Long, sem: Long, crel: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_ResetEvent(hevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_ResumeThread(hthread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RtwqAddPeriodicCallback(callback: Long, context: Long, key: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RtwqAllocateSerialWorkQueue(workqueueidin: Int, workqueueidout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RtwqAllocateWorkQueue(workqueuetype: Int, workqueueid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RtwqBeginRegisterWorkQueueWithMMCSS(workqueueid: Int, usageclass: Long, dwtaskid: Int, lpriority: Int, donecallback: Long, donestate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RtwqBeginUnregisterWorkQueueWithMMCSS(workqueueid: Int, donecallback: Long, donestate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RtwqCancelDeadline(prequest: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RtwqCancelWorkItem(key: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RtwqCreateAsyncResult(appobject: Long, callback: Long, appstate: Long, asyncresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RtwqEndRegisterWorkQueueWithMMCSS(result: Long, taskid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RtwqGetWorkQueueMMCSSClass(workqueueid: Int, usageclass: Long, usageclasslength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RtwqGetWorkQueueMMCSSPriority(workqueueid: Int, priority: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RtwqGetWorkQueueMMCSSTaskId(workqueueid: Int, taskid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RtwqInvokeCallback(result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RtwqJoinWorkQueue(workqueueid: Int, hfile: Long, out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RtwqLockPlatform(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RtwqLockSharedWorkQueue(usageclass: Long, basepriority: Int, taskid: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RtwqLockWorkQueue(workqueueid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RtwqPutWaitingWorkItem(hevent: Long, lpriority: Int, result: Long, key: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RtwqPutWorkItem(dwqueue: Int, lpriority: Int, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RtwqRegisterPlatformEvents(platformevents: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RtwqRegisterPlatformWithMMCSS(usageclass: Long, taskid: Long, lpriority: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RtwqRemovePeriodicCallback(dwkey: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RtwqScheduleWorkItem(result: Long, timeout: Long, key: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RtwqSetDeadline(workqueueid: Int, deadlineinhns: Long, prequest: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RtwqSetDeadline2(workqueueid: Int, deadlineinhns: Long, predeadlineinhns: Long, prequest: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RtwqSetLongRunning(workqueueid: Int, enable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RtwqShutdown(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RtwqStartup(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RtwqUnjoinWorkQueue(workqueueid: Int, hfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RtwqUnlockPlatform(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RtwqUnlockWorkQueue(workqueueid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RtwqUnregisterPlatformEvents(platformevents: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_RtwqUnregisterPlatformFromMMCSS(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetCriticalSectionSpinCount(lpcriticalsection: Long, dwspincount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetEvent(hevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetEventWhenCallbackReturns(pci: Long, evt: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetPriorityClass(hprocess: Long, dwpriorityclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetProcessAffinityMask(hprocess: Long, dwprocessaffinitymask: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetProcessAffinityUpdateMode(hprocess: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetProcessDEPPolicy(dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetProcessDefaultCpuSetMasks(process: Long, cpusetmasks: Long, cpusetmaskcount: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetProcessDefaultCpuSets(process: Long, cpusetids: Long, cpusetidcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetProcessDynamicEHContinuationTargets(process: Long, numberoftargets: Short, targets: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetProcessDynamicEnforcedCetCompatibleRanges(process: Long, numberofranges: Short, ranges: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetProcessInformation(hprocess: Long, processinformationclass: Int, processinformation: Long, processinformationsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetProcessMitigationPolicy(mitigationpolicy: Int, lpbuffer: Long, dwlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetProcessPriorityBoost(hprocess: Long, bdisablepriorityboost: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetProcessRestrictionExemption(fenableexemption: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetProcessShutdownParameters(dwlevel: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetProcessWorkingSetSize(hprocess: Long, dwminimumworkingsetsize: Long, dwmaximumworkingsetsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetProtectedPolicy(policyguid: Long, policyvalue: Long, oldpolicyvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetThreadAffinityMask(hthread: Long, dwthreadaffinitymask: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetThreadDescription(hthread: Long, lpthreaddescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetThreadGroupAffinity(hthread: Long, groupaffinity: Long, previousgroupaffinity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetThreadIdealProcessor(hthread: Long, dwidealprocessor: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetThreadIdealProcessorEx(hthread: Long, lpidealprocessor: Long, lppreviousidealprocessor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetThreadInformation(hthread: Long, threadinformationclass: Int, threadinformation: Long, threadinformationsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetThreadPriority(hthread: Long, npriority: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetThreadPriorityBoost(hthread: Long, bdisablepriorityboost: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetThreadSelectedCpuSetMasks(thread: Long, cpusetmasks: Long, cpusetmaskcount: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetThreadSelectedCpuSets(thread: Long, cpusetids: Long, cpusetidcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetThreadStackGuarantee(stacksizeinbytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetThreadToken(thread: Long, token: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetThreadpoolStackInformation(ptpp: Long, ptpsi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetThreadpoolThreadMaximum(ptpp: Long, cthrdmost: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetThreadpoolThreadMinimum(ptpp: Long, cthrdmic: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetThreadpoolTimer(pti: Long, pftduetime: Long, msperiod: Int, mswindowlength: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetThreadpoolTimerEx(pti: Long, pftduetime: Long, msperiod: Int, mswindowlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetThreadpoolWait(pwa: Long, h: Long, pfttimeout: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetThreadpoolWaitEx(pwa: Long, h: Long, pfttimeout: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetTimerQueueTimer(timerqueue: Long, callback: Long, parameter: Long, duetime: Int, period: Int, preferio: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetUmsThreadInformation(umsthread: Long, umsthreadinfoclass: Int, umsthreadinformation: Long, umsthreadinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetWaitableTimer(htimer: Long, lpduetime: Long, lperiod: Int, pfncompletionroutine: Long, lpargtocompletionroutine: Long, fresume: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SetWaitableTimerEx(htimer: Long, lpduetime: Long, lperiod: Int, pfncompletionroutine: Long, lpargtocompletionroutine: Long, wakecontext: Long, tolerabledelay: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SignalObjectAndWait(hobjecttosignal: Long, hobjecttowaiton: Long, dwmilliseconds: Int, balertable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_Sleep(dwmilliseconds: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SleepConditionVariableCS(conditionvariable: Long, criticalsection: Long, dwmilliseconds: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SleepConditionVariableSRW(conditionvariable: Long, srwlock: Long, dwmilliseconds: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SleepEx(dwmilliseconds: Int, balertable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_StartThreadpoolIo(pio: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SubmitThreadpoolWork(pwk: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SuspendThread(hthread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SwitchToFiber(lpfiber: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_SwitchToThread(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_TerminateProcess(hprocess: Long, uexitcode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_TerminateThread(hthread: Long, dwexitcode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_TlsAlloc(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_TlsFree(dwtlsindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_TlsGetValue(dwtlsindex: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_TlsSetValue(dwtlsindex: Int, lptlsvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_TryAcquireSRWLockExclusive(srwlock: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_TryAcquireSRWLockShared(srwlock: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_TryEnterCriticalSection(lpcriticalsection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_TrySubmitThreadpoolCallback(pfns: Long, pv: Long, pcbe: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_UmsThreadYield(schedulerparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_UnregisterWait(waithandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_UnregisterWaitEx(waithandle: Long, completionevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_UpdateProcThreadAttribute(lpattributelist: Long, dwflags: Int, attribute: Long, lpvalue: Long, cbsize: Long, lppreviousvalue: Long, lpreturnsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_WaitForInputIdle(hprocess: Long, dwmilliseconds: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_WaitForMultipleObjects(ncount: Int, lphandles: Long, bwaitall: Int, dwmilliseconds: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_WaitForMultipleObjectsEx(ncount: Int, lphandles: Long, bwaitall: Int, dwmilliseconds: Int, balertable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_WaitForSingleObject(hhandle: Long, dwmilliseconds: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_WaitForSingleObjectEx(hhandle: Long, dwmilliseconds: Int, balertable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_WaitForThreadpoolIoCallbacks(pio: Long, fcancelpendingcallbacks: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_WaitForThreadpoolTimerCallbacks(pti: Long, fcancelpendingcallbacks: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_WaitForThreadpoolWaitCallbacks(pwa: Long, fcancelpendingcallbacks: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_WaitForThreadpoolWorkCallbacks(pwk: Long, fcancelpendingcallbacks: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_WaitOnAddress(address: Long, compareaddress: Long, addresssize: Long, dwmilliseconds: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_WakeAllConditionVariable(conditionvariable: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_WakeByAddressAll(address: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_WakeByAddressSingle(address: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_WakeConditionVariable(conditionvariable: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_WinExec(lpcmdline: Long, ucmdshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_Wow64SetThreadDefaultGuestMachine(machine: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_Wow64SuspendThread(hthread: Long): Int
}

public actual fun AcquireSRWLockExclusive(srwlock: Long) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_AcquireSRWLockExclusive(srwlock)
}

public actual fun AcquireSRWLockShared(srwlock: Long) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_AcquireSRWLockShared(srwlock)
}

public actual fun AddIntegrityLabelToBoundaryDescriptor(boundarydescriptor: Long, integritylabel: PSID): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_AddIntegrityLabelToBoundaryDescriptor(boundarydescriptor, integritylabel)

public actual fun AddSIDToBoundaryDescriptor(boundarydescriptor: Long, requiredsid: PSID): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_AddSIDToBoundaryDescriptor(boundarydescriptor, requiredsid)

public actual fun AttachThreadInput(idattach: UInt, idattachto: UInt, fattach: BOOL): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_AttachThreadInput(idattach.toInt(), idattachto.toInt(), fattach)

public actual fun AvQuerySystemResponsiveness(avrthandle: HANDLE, systemresponsivenessvalue: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_AvQuerySystemResponsiveness(avrthandle, systemresponsivenessvalue)

public actual fun AvRevertMmThreadCharacteristics(avrthandle: HANDLE): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_AvRevertMmThreadCharacteristics(avrthandle)

public actual fun AvRtCreateThreadOrderingGroup(context: Long, period: Long, threadorderingguid: Long, timeout: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_AvRtCreateThreadOrderingGroup(context, period, threadorderingguid, timeout)

public actual fun AvRtCreateThreadOrderingGroupExA(context: Long, period: Long, threadorderingguid: Long, timeout: Long, taskname: PCSTR): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_AvRtCreateThreadOrderingGroupExA(context, period, threadorderingguid, timeout, taskname)

public actual fun AvRtCreateThreadOrderingGroupExW(context: Long, period: Long, threadorderingguid: Long, timeout: Long, taskname: PCWSTR): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_AvRtCreateThreadOrderingGroupExW(context, period, threadorderingguid, timeout, taskname)

public actual fun AvRtDeleteThreadOrderingGroup(context: HANDLE): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_AvRtDeleteThreadOrderingGroup(context)

public actual fun AvRtJoinThreadOrderingGroup(context: Long, threadorderingguid: Long, before: BOOL): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_AvRtJoinThreadOrderingGroup(context, threadorderingguid, before)

public actual fun AvRtLeaveThreadOrderingGroup(context: HANDLE): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_AvRtLeaveThreadOrderingGroup(context)

public actual fun AvRtWaitOnThreadOrderingGroup(context: HANDLE): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_AvRtWaitOnThreadOrderingGroup(context)

public actual fun AvSetMmMaxThreadCharacteristicsA(firsttask: PCSTR, secondtask: PCSTR, taskindex: Long): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_AvSetMmMaxThreadCharacteristicsA(firsttask, secondtask, taskindex)

public actual fun AvSetMmMaxThreadCharacteristicsW(firsttask: PCWSTR, secondtask: PCWSTR, taskindex: Long): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_AvSetMmMaxThreadCharacteristicsW(firsttask, secondtask, taskindex)

public actual fun AvSetMmThreadCharacteristicsA(taskname: PCSTR, taskindex: Long): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_AvSetMmThreadCharacteristicsA(taskname, taskindex)

public actual fun AvSetMmThreadCharacteristicsW(taskname: PCWSTR, taskindex: Long): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_AvSetMmThreadCharacteristicsW(taskname, taskindex)

public actual fun AvSetMmThreadPriority(avrthandle: HANDLE, priority: AVRT_PRIORITY): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_AvSetMmThreadPriority(avrthandle, priority)

public actual fun CallbackMayRunLong(pci: PTP_CALLBACK_INSTANCE): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CallbackMayRunLong(pci)

public actual fun CancelThreadpoolIo(pio: PTP_IO) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CancelThreadpoolIo(pio)
}

public actual fun CancelTimerQueueTimer(timerqueue: HANDLE, timer: HANDLE): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CancelTimerQueueTimer(timerqueue, timer)

public actual fun CancelWaitableTimer(htimer: HANDLE): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CancelWaitableTimer(htimer)

public actual fun ChangeTimerQueueTimer(timerqueue: HANDLE, timer: HANDLE, duetime: UInt, period: UInt): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_ChangeTimerQueueTimer(timerqueue, timer, duetime.toInt(), period.toInt())

public actual fun ClosePrivateNamespace(handle: HANDLE, flags: UInt): Boolean =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_ClosePrivateNamespace(handle, flags.toInt())

public actual fun CloseThreadpool(ptpp: PTP_POOL) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CloseThreadpool(ptpp)
}

public actual fun CloseThreadpoolCleanupGroup(ptpcg: PTP_CLEANUP_GROUP) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CloseThreadpoolCleanupGroup(ptpcg)
}

public actual fun CloseThreadpoolCleanupGroupMembers(ptpcg: PTP_CLEANUP_GROUP, fcancelpendingcallbacks: BOOL, pvcleanupcontext: Long) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CloseThreadpoolCleanupGroupMembers(ptpcg, fcancelpendingcallbacks, pvcleanupcontext)
}

public actual fun CloseThreadpoolIo(pio: PTP_IO) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CloseThreadpoolIo(pio)
}

public actual fun CloseThreadpoolTimer(pti: PTP_TIMER) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CloseThreadpoolTimer(pti)
}

public actual fun CloseThreadpoolWait(pwa: PTP_WAIT) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CloseThreadpoolWait(pwa)
}

public actual fun CloseThreadpoolWork(pwk: PTP_WORK) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CloseThreadpoolWork(pwk)
}

public actual fun ConvertFiberToThread(): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_ConvertFiberToThread()

public actual fun ConvertThreadToFiber(lpparameter: Long): Long =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_ConvertThreadToFiber(lpparameter)

public actual fun ConvertThreadToFiberEx(lpparameter: Long, dwflags: UInt): Long =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_ConvertThreadToFiberEx(lpparameter, dwflags.toInt())

public actual fun CreateBoundaryDescriptorA(name: PCSTR, flags: UInt): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateBoundaryDescriptorA(name, flags.toInt())

public actual fun CreateBoundaryDescriptorW(name: PCWSTR, flags: UInt): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateBoundaryDescriptorW(name, flags.toInt())

public actual fun CreateEventA(lpeventattributes: Long, bmanualreset: BOOL, binitialstate: BOOL, lpname: PCSTR): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateEventA(lpeventattributes, bmanualreset, binitialstate, lpname)

public actual fun CreateEventExA(lpeventattributes: Long, lpname: PCSTR, dwflags: CREATE_EVENT, dwdesiredaccess: UInt): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateEventExA(lpeventattributes, lpname, dwflags.toInt(), dwdesiredaccess.toInt())

public actual fun CreateEventExW(lpeventattributes: Long, lpname: PCWSTR, dwflags: CREATE_EVENT, dwdesiredaccess: UInt): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateEventExW(lpeventattributes, lpname, dwflags.toInt(), dwdesiredaccess.toInt())

public actual fun CreateEventW(lpeventattributes: Long, bmanualreset: BOOL, binitialstate: BOOL, lpname: PCWSTR): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateEventW(lpeventattributes, bmanualreset, binitialstate, lpname)

public actual fun CreateFiber(dwstacksize: ULong, lpstartaddress: LPFIBER_START_ROUTINE, lpparameter: Long): Long =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateFiber(dwstacksize.toLong(), lpstartaddress.toLong(), lpparameter)

public actual fun CreateFiberEx(dwstackcommitsize: ULong, dwstackreservesize: ULong, dwflags: UInt, lpstartaddress: LPFIBER_START_ROUTINE, lpparameter: Long): Long =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateFiberEx(dwstackcommitsize.toLong(), dwstackreservesize.toLong(), dwflags.toInt(), lpstartaddress.toLong(), lpparameter)

public actual fun CreateMutexA(lpmutexattributes: Long, binitialowner: BOOL, lpname: PCSTR): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateMutexA(lpmutexattributes, binitialowner, lpname)

public actual fun CreateMutexExA(lpmutexattributes: Long, lpname: PCSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateMutexExA(lpmutexattributes, lpname, dwflags.toInt(), dwdesiredaccess.toInt())

public actual fun CreateMutexExW(lpmutexattributes: Long, lpname: PCWSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateMutexExW(lpmutexattributes, lpname, dwflags.toInt(), dwdesiredaccess.toInt())

public actual fun CreateMutexW(lpmutexattributes: Long, binitialowner: BOOL, lpname: PCWSTR): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateMutexW(lpmutexattributes, binitialowner, lpname)

public actual fun CreatePrivateNamespaceA(lpprivatenamespaceattributes: Long, lpboundarydescriptor: Long, lpaliasprefix: PCSTR): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreatePrivateNamespaceA(lpprivatenamespaceattributes, lpboundarydescriptor, lpaliasprefix)

public actual fun CreatePrivateNamespaceW(lpprivatenamespaceattributes: Long, lpboundarydescriptor: Long, lpaliasprefix: PCWSTR): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreatePrivateNamespaceW(lpprivatenamespaceattributes, lpboundarydescriptor, lpaliasprefix)

public actual fun CreateProcessA(lpapplicationname: PCSTR, lpcommandline: PSTR, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: BOOL, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateProcessA(lpapplicationname, lpcommandline, lpprocessattributes, lpthreadattributes, binherithandles, dwcreationflags.toInt(), lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation)

public actual fun CreateProcessAsUserA(htoken: HANDLE, lpapplicationname: PCSTR, lpcommandline: PSTR, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: BOOL, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateProcessAsUserA(htoken, lpapplicationname, lpcommandline, lpprocessattributes, lpthreadattributes, binherithandles, dwcreationflags.toInt(), lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation)

public actual fun CreateProcessAsUserW(htoken: HANDLE, lpapplicationname: PCWSTR, lpcommandline: PWSTR, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: BOOL, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCWSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateProcessAsUserW(htoken, lpapplicationname, lpcommandline, lpprocessattributes, lpthreadattributes, binherithandles, dwcreationflags.toInt(), lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation)

public actual fun CreateProcessW(lpapplicationname: PCWSTR, lpcommandline: PWSTR, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: BOOL, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCWSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateProcessW(lpapplicationname, lpcommandline, lpprocessattributes, lpthreadattributes, binherithandles, dwcreationflags.toInt(), lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation)

public actual fun CreateProcessWithLogonW(lpusername: PCWSTR, lpdomain: PCWSTR, lppassword: PCWSTR, dwlogonflags: CREATE_PROCESS_LOGON_FLAGS, lpapplicationname: PCWSTR, lpcommandline: PWSTR, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCWSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateProcessWithLogonW(lpusername, lpdomain, lppassword, dwlogonflags.toInt(), lpapplicationname, lpcommandline, dwcreationflags.toInt(), lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation)

public actual fun CreateProcessWithTokenW(htoken: HANDLE, dwlogonflags: CREATE_PROCESS_LOGON_FLAGS, lpapplicationname: PCWSTR, lpcommandline: PWSTR, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCWSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateProcessWithTokenW(htoken, dwlogonflags.toInt(), lpapplicationname, lpcommandline, dwcreationflags.toInt(), lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation)

public actual fun CreateRemoteThread(hprocess: HANDLE, lpthreadattributes: Long, dwstacksize: ULong, lpstartaddress: LPTHREAD_START_ROUTINE, lpparameter: Long, dwcreationflags: UInt, lpthreadid: Long): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateRemoteThread(hprocess, lpthreadattributes, dwstacksize.toLong(), lpstartaddress.toLong(), lpparameter, dwcreationflags.toInt(), lpthreadid)

public actual fun CreateRemoteThreadEx(hprocess: HANDLE, lpthreadattributes: Long, dwstacksize: ULong, lpstartaddress: LPTHREAD_START_ROUTINE, lpparameter: Long, dwcreationflags: UInt, lpattributelist: LPPROC_THREAD_ATTRIBUTE_LIST, lpthreadid: Long): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateRemoteThreadEx(hprocess, lpthreadattributes, dwstacksize.toLong(), lpstartaddress.toLong(), lpparameter, dwcreationflags.toInt(), lpattributelist, lpthreadid)

public actual fun CreateSemaphoreA(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: PCSTR): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateSemaphoreA(lpsemaphoreattributes, linitialcount, lmaximumcount, lpname)

public actual fun CreateSemaphoreExA(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: PCSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateSemaphoreExA(lpsemaphoreattributes, linitialcount, lmaximumcount, lpname, dwflags.toInt(), dwdesiredaccess.toInt())

public actual fun CreateSemaphoreExW(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: PCWSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateSemaphoreExW(lpsemaphoreattributes, linitialcount, lmaximumcount, lpname, dwflags.toInt(), dwdesiredaccess.toInt())

public actual fun CreateSemaphoreW(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: PCWSTR): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateSemaphoreW(lpsemaphoreattributes, linitialcount, lmaximumcount, lpname)

public actual fun CreateThread(lpthreadattributes: Long, dwstacksize: ULong, lpstartaddress: LPTHREAD_START_ROUTINE, lpparameter: Long, dwcreationflags: THREAD_CREATION_FLAGS, lpthreadid: Long): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateThread(lpthreadattributes, dwstacksize.toLong(), lpstartaddress.toLong(), lpparameter, dwcreationflags.toInt(), lpthreadid)

public actual fun CreateThreadpool(reserved: Long): PTP_POOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateThreadpool(reserved)

public actual fun CreateThreadpoolCleanupGroup(): PTP_CLEANUP_GROUP =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateThreadpoolCleanupGroup()

public actual fun CreateThreadpoolIo(fl: HANDLE, pfnio: PTP_WIN32_IO_CALLBACK, pv: Long, pcbe: Long): PTP_IO =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateThreadpoolIo(fl, pfnio.toLong(), pv, pcbe)

public actual fun CreateThreadpoolTimer(pfnti: PTP_TIMER_CALLBACK, pv: Long, pcbe: Long): PTP_TIMER =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateThreadpoolTimer(pfnti.toLong(), pv, pcbe)

public actual fun CreateThreadpoolWait(pfnwa: PTP_WAIT_CALLBACK, pv: Long, pcbe: Long): PTP_WAIT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateThreadpoolWait(pfnwa.toLong(), pv, pcbe)

public actual fun CreateThreadpoolWork(pfnwk: PTP_WORK_CALLBACK, pv: Long, pcbe: Long): PTP_WORK =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateThreadpoolWork(pfnwk.toLong(), pv, pcbe)

public actual fun CreateTimerQueue(): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateTimerQueue()

public actual fun CreateTimerQueueTimer(phnewtimer: Long, timerqueue: HANDLE, callback: WAITORTIMERCALLBACK, parameter: Long, duetime: UInt, period: UInt, flags: WORKER_THREAD_FLAGS): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateTimerQueueTimer(phnewtimer, timerqueue, callback.toLong(), parameter, duetime.toInt(), period.toInt(), flags.toInt())

public actual fun CreateUmsCompletionList(umscompletionlist: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateUmsCompletionList(umscompletionlist)

public actual fun CreateUmsThreadContext(lpumsthread: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateUmsThreadContext(lpumsthread)

public actual fun CreateWaitableTimerA(lptimerattributes: Long, bmanualreset: BOOL, lptimername: PCSTR): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateWaitableTimerA(lptimerattributes, bmanualreset, lptimername)

public actual fun CreateWaitableTimerExA(lptimerattributes: Long, lptimername: PCSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateWaitableTimerExA(lptimerattributes, lptimername, dwflags.toInt(), dwdesiredaccess.toInt())

public actual fun CreateWaitableTimerExW(lptimerattributes: Long, lptimername: PCWSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateWaitableTimerExW(lptimerattributes, lptimername, dwflags.toInt(), dwdesiredaccess.toInt())

public actual fun CreateWaitableTimerW(lptimerattributes: Long, bmanualreset: BOOL, lptimername: PCWSTR): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_CreateWaitableTimerW(lptimerattributes, bmanualreset, lptimername)

public actual fun DeleteBoundaryDescriptor(boundarydescriptor: HANDLE) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_DeleteBoundaryDescriptor(boundarydescriptor)
}

public actual fun DeleteCriticalSection(lpcriticalsection: Long) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_DeleteCriticalSection(lpcriticalsection)
}

public actual fun DeleteFiber(lpfiber: Long) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_DeleteFiber(lpfiber)
}

public actual fun DeleteProcThreadAttributeList(lpattributelist: LPPROC_THREAD_ATTRIBUTE_LIST) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_DeleteProcThreadAttributeList(lpattributelist)
}

public actual fun DeleteSynchronizationBarrier(lpbarrier: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_DeleteSynchronizationBarrier(lpbarrier)

public actual fun DeleteTimerQueue(timerqueue: HANDLE): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_DeleteTimerQueue(timerqueue)

public actual fun DeleteTimerQueueEx(timerqueue: HANDLE, completionevent: HANDLE): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_DeleteTimerQueueEx(timerqueue, completionevent)

public actual fun DeleteTimerQueueTimer(timerqueue: HANDLE, timer: HANDLE, completionevent: HANDLE): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_DeleteTimerQueueTimer(timerqueue, timer, completionevent)

public actual fun DeleteUmsCompletionList(umscompletionlist: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_DeleteUmsCompletionList(umscompletionlist)

public actual fun DeleteUmsThreadContext(umsthread: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_DeleteUmsThreadContext(umsthread)

public actual fun DequeueUmsCompletionListItems(umscompletionlist: Long, waittimeout: UInt, umsthreadlist: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_DequeueUmsCompletionListItems(umscompletionlist, waittimeout.toInt(), umsthreadlist)

public actual fun DisassociateCurrentThreadFromCallback(pci: PTP_CALLBACK_INSTANCE) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_DisassociateCurrentThreadFromCallback(pci)
}

public actual fun EnterCriticalSection(lpcriticalsection: Long) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_EnterCriticalSection(lpcriticalsection)
}

public actual fun EnterSynchronizationBarrier(lpbarrier: Long, dwflags: UInt): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_EnterSynchronizationBarrier(lpbarrier, dwflags.toInt())

public actual fun EnterUmsSchedulingMode(schedulerstartupinfo: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_EnterUmsSchedulingMode(schedulerstartupinfo)

public actual fun ExecuteUmsThread(umsthread: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_ExecuteUmsThread(umsthread)

public actual fun ExitProcess(uexitcode: UInt): Nothing {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_ExitProcess(uexitcode.toInt())
    error("Unreachable noreturn C function ExitProcess")
}

public actual fun ExitThread(dwexitcode: UInt): Nothing {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_ExitThread(dwexitcode.toInt())
    error("Unreachable noreturn C function ExitThread")
}

public actual fun FlsAlloc(lpcallback: PFLS_CALLBACK_FUNCTION): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_FlsAlloc(lpcallback.toLong()).toUInt()

public actual fun FlsFree(dwflsindex: UInt): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_FlsFree(dwflsindex.toInt())

public actual fun FlsGetValue(dwflsindex: UInt): Long =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_FlsGetValue(dwflsindex.toInt())

public actual fun FlsSetValue(dwflsindex: UInt, lpflsdata: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_FlsSetValue(dwflsindex.toInt(), lpflsdata)

public actual fun FlushProcessWriteBuffers() {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_FlushProcessWriteBuffers()
}

public actual fun FreeLibraryWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, mod: HMODULE) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_FreeLibraryWhenCallbackReturns(pci, mod)
}

public actual fun GetActiveProcessorCount(groupnumber: UShort): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetActiveProcessorCount(groupnumber.toShort()).toUInt()

public actual fun GetActiveProcessorGroupCount(): UShort =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetActiveProcessorGroupCount().toUShort()

public actual fun GetCurrentProcess(): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetCurrentProcess()

public actual fun GetCurrentProcessId(): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetCurrentProcessId().toUInt()

public actual fun GetCurrentProcessorNumber(): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetCurrentProcessorNumber().toUInt()

public actual fun GetCurrentProcessorNumberEx(procnumber: Long) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetCurrentProcessorNumberEx(procnumber)
}

public actual fun GetCurrentThread(): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetCurrentThread()

public actual fun GetCurrentThreadId(): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetCurrentThreadId().toUInt()

public actual fun GetCurrentThreadStackLimits(lowlimit: Long, highlimit: Long) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetCurrentThreadStackLimits(lowlimit, highlimit)
}

public actual fun GetCurrentUmsThread(): Long =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetCurrentUmsThread()

public actual fun GetExitCodeProcess(hprocess: HANDLE, lpexitcode: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetExitCodeProcess(hprocess, lpexitcode)

public actual fun GetExitCodeThread(hthread: HANDLE, lpexitcode: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetExitCodeThread(hthread, lpexitcode)

public actual fun GetGuiResources(hprocess: HANDLE, uiflags: GET_GUI_RESOURCES_FLAGS): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetGuiResources(hprocess, uiflags.toInt()).toUInt()

public actual fun GetMachineTypeAttributes(machine: UShort, machinetypeattributes: Long): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetMachineTypeAttributes(machine.toShort(), machinetypeattributes)

public actual fun GetMaximumProcessorCount(groupnumber: UShort): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetMaximumProcessorCount(groupnumber.toShort()).toUInt()

public actual fun GetMaximumProcessorGroupCount(): UShort =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetMaximumProcessorGroupCount().toUShort()

public actual fun GetNextUmsListItem(umscontext: Long): Long =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetNextUmsListItem(umscontext)

public actual fun GetNumaAvailableMemoryNode(node: UByte, availablebytes: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetNumaAvailableMemoryNode(node.toByte(), availablebytes)

public actual fun GetNumaAvailableMemoryNodeEx(node: UShort, availablebytes: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetNumaAvailableMemoryNodeEx(node.toShort(), availablebytes)

public actual fun GetNumaHighestNodeNumber(highestnodenumber: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetNumaHighestNodeNumber(highestnodenumber)

public actual fun GetNumaNodeNumberFromHandle(hfile: HANDLE, nodenumber: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetNumaNodeNumberFromHandle(hfile, nodenumber)

public actual fun GetNumaNodeProcessorMask(node: UByte, processormask: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetNumaNodeProcessorMask(node.toByte(), processormask)

public actual fun GetNumaNodeProcessorMask2(nodenumber: UShort, processormasks: Long, processormaskcount: UShort, requiredmaskcount: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetNumaNodeProcessorMask2(nodenumber.toShort(), processormasks, processormaskcount.toShort(), requiredmaskcount)

public actual fun GetNumaNodeProcessorMaskEx(node: UShort, processormask: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetNumaNodeProcessorMaskEx(node.toShort(), processormask)

public actual fun GetNumaProcessorNode(processor: UByte, nodenumber: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetNumaProcessorNode(processor.toByte(), nodenumber)

public actual fun GetNumaProcessorNodeEx(processor: Long, nodenumber: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetNumaProcessorNodeEx(processor, nodenumber)

public actual fun GetNumaProximityNode(proximityid: UInt, nodenumber: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetNumaProximityNode(proximityid.toInt(), nodenumber)

public actual fun GetNumaProximityNodeEx(proximityid: UInt, nodenumber: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetNumaProximityNodeEx(proximityid.toInt(), nodenumber)

public actual fun GetPriorityClass(hprocess: HANDLE): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetPriorityClass(hprocess).toUInt()

public actual fun GetProcessAffinityMask(hprocess: HANDLE, lpprocessaffinitymask: Long, lpsystemaffinitymask: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetProcessAffinityMask(hprocess, lpprocessaffinitymask, lpsystemaffinitymask)

public actual fun GetProcessDEPPolicy(hprocess: HANDLE, lpflags: Long, lppermanent: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetProcessDEPPolicy(hprocess, lpflags, lppermanent)

public actual fun GetProcessDefaultCpuSetMasks(process: HANDLE, cpusetmasks: Long, cpusetmaskcount: UShort, requiredmaskcount: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetProcessDefaultCpuSetMasks(process, cpusetmasks, cpusetmaskcount.toShort(), requiredmaskcount)

public actual fun GetProcessDefaultCpuSets(process: HANDLE, cpusetids: Long, cpusetidcount: UInt, requiredidcount: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetProcessDefaultCpuSets(process, cpusetids, cpusetidcount.toInt(), requiredidcount)

public actual fun GetProcessGroupAffinity(hprocess: HANDLE, groupcount: Long, grouparray: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetProcessGroupAffinity(hprocess, groupcount, grouparray)

public actual fun GetProcessHandleCount(hprocess: HANDLE, pdwhandlecount: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetProcessHandleCount(hprocess, pdwhandlecount)

public actual fun GetProcessHandleFromHwnd(hwnd: HWND): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetProcessHandleFromHwnd(hwnd)

public actual fun GetProcessId(process: HANDLE): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetProcessId(process).toUInt()

public actual fun GetProcessIdOfThread(thread: HANDLE): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetProcessIdOfThread(thread).toUInt()

public actual fun GetProcessInformation(hprocess: HANDLE, processinformationclass: PROCESS_INFORMATION_CLASS, processinformation: Long, processinformationsize: UInt): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetProcessInformation(hprocess, processinformationclass, processinformation, processinformationsize.toInt())

public actual fun GetProcessIoCounters(hprocess: HANDLE, lpiocounters: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetProcessIoCounters(hprocess, lpiocounters)

public actual fun GetProcessMitigationPolicy(hprocess: HANDLE, mitigationpolicy: PROCESS_MITIGATION_POLICY, lpbuffer: Long, dwlength: ULong): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetProcessMitigationPolicy(hprocess, mitigationpolicy, lpbuffer, dwlength.toLong())

public actual fun GetProcessPriorityBoost(hprocess: HANDLE, pdisablepriorityboost: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetProcessPriorityBoost(hprocess, pdisablepriorityboost)

public actual fun GetProcessShutdownParameters(lpdwlevel: Long, lpdwflags: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetProcessShutdownParameters(lpdwlevel, lpdwflags)

public actual fun GetProcessTimes(hprocess: HANDLE, lpcreationtime: Long, lpexittime: Long, lpkerneltime: Long, lpusertime: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetProcessTimes(hprocess, lpcreationtime, lpexittime, lpkerneltime, lpusertime)

public actual fun GetProcessVersion(processid: UInt): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetProcessVersion(processid.toInt()).toUInt()

public actual fun GetProcessWorkingSetSize(hprocess: HANDLE, lpminimumworkingsetsize: Long, lpmaximumworkingsetsize: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetProcessWorkingSetSize(hprocess, lpminimumworkingsetsize, lpmaximumworkingsetsize)

public actual fun GetStartupInfoA(lpstartupinfo: Long) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetStartupInfoA(lpstartupinfo)
}

public actual fun GetStartupInfoW(lpstartupinfo: Long) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetStartupInfoW(lpstartupinfo)
}

public actual fun GetSystemTimes(lpidletime: Long, lpkerneltime: Long, lpusertime: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetSystemTimes(lpidletime, lpkerneltime, lpusertime)

public actual fun GetThreadDescription(hthread: HANDLE, ppszthreaddescription: Long): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetThreadDescription(hthread, ppszthreaddescription)

public actual fun GetThreadGroupAffinity(hthread: HANDLE, groupaffinity: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetThreadGroupAffinity(hthread, groupaffinity)

public actual fun GetThreadIOPendingFlag(hthread: HANDLE, lpioispending: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetThreadIOPendingFlag(hthread, lpioispending)

public actual fun GetThreadId(thread: HANDLE): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetThreadId(thread).toUInt()

public actual fun GetThreadIdealProcessorEx(hthread: HANDLE, lpidealprocessor: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetThreadIdealProcessorEx(hthread, lpidealprocessor)

public actual fun GetThreadInformation(hthread: HANDLE, threadinformationclass: THREAD_INFORMATION_CLASS, threadinformation: Long, threadinformationsize: UInt): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetThreadInformation(hthread, threadinformationclass, threadinformation, threadinformationsize.toInt())

public actual fun GetThreadPriority(hthread: HANDLE): Int =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetThreadPriority(hthread)

public actual fun GetThreadPriorityBoost(hthread: HANDLE, pdisablepriorityboost: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetThreadPriorityBoost(hthread, pdisablepriorityboost)

public actual fun GetThreadSelectedCpuSetMasks(thread: HANDLE, cpusetmasks: Long, cpusetmaskcount: UShort, requiredmaskcount: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetThreadSelectedCpuSetMasks(thread, cpusetmasks, cpusetmaskcount.toShort(), requiredmaskcount)

public actual fun GetThreadSelectedCpuSets(thread: HANDLE, cpusetids: Long, cpusetidcount: UInt, requiredidcount: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetThreadSelectedCpuSets(thread, cpusetids, cpusetidcount.toInt(), requiredidcount)

public actual fun GetThreadTimes(hthread: HANDLE, lpcreationtime: Long, lpexittime: Long, lpkerneltime: Long, lpusertime: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetThreadTimes(hthread, lpcreationtime, lpexittime, lpkerneltime, lpusertime)

public actual fun GetUmsCompletionListEvent(umscompletionlist: Long, umscompletionevent: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetUmsCompletionListEvent(umscompletionlist, umscompletionevent)

public actual fun GetUmsSystemThreadInformation(threadhandle: HANDLE, systemthreadinfo: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_GetUmsSystemThreadInformation(threadhandle, systemthreadinfo)

public actual fun InitOnceBeginInitialize(lpinitonce: Long, dwflags: UInt, fpending: Long, lpcontext: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_InitOnceBeginInitialize(lpinitonce, dwflags.toInt(), fpending, lpcontext)

public actual fun InitOnceComplete(lpinitonce: Long, dwflags: UInt, lpcontext: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_InitOnceComplete(lpinitonce, dwflags.toInt(), lpcontext)

public actual fun InitOnceExecuteOnce(initonce: Long, initfn: PINIT_ONCE_FN, parameter: Long, context: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_InitOnceExecuteOnce(initonce, initfn.toLong(), parameter, context)

public actual fun InitOnceInitialize(initonce: Long) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_InitOnceInitialize(initonce)
}

public actual fun InitializeConditionVariable(conditionvariable: Long) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_InitializeConditionVariable(conditionvariable)
}

public actual fun InitializeCriticalSection(lpcriticalsection: Long) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_InitializeCriticalSection(lpcriticalsection)
}

public actual fun InitializeCriticalSectionAndSpinCount(lpcriticalsection: Long, dwspincount: UInt): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_InitializeCriticalSectionAndSpinCount(lpcriticalsection, dwspincount.toInt())

public actual fun InitializeCriticalSectionEx(lpcriticalsection: Long, dwspincount: UInt, flags: UInt): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_InitializeCriticalSectionEx(lpcriticalsection, dwspincount.toInt(), flags.toInt())

public actual fun InitializeProcThreadAttributeList(lpattributelist: LPPROC_THREAD_ATTRIBUTE_LIST, dwattributecount: UInt, dwflags: UInt, lpsize: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_InitializeProcThreadAttributeList(lpattributelist, dwattributecount.toInt(), dwflags.toInt(), lpsize)

public actual fun InitializeSListHead(listhead: Long) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_InitializeSListHead(listhead)
}

public actual fun InitializeSRWLock(srwlock: Long) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_InitializeSRWLock(srwlock)
}

public actual fun InitializeSynchronizationBarrier(lpbarrier: Long, ltotalthreads: Int, lspincount: Int): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_InitializeSynchronizationBarrier(lpbarrier, ltotalthreads, lspincount)

public actual fun InterlockedFlushSList(listhead: Long): Long =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_InterlockedFlushSList(listhead)

public actual fun InterlockedPopEntrySList(listhead: Long): Long =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_InterlockedPopEntrySList(listhead)

public actual fun InterlockedPushEntrySList(listhead: Long, listentry: Long): Long =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_InterlockedPushEntrySList(listhead, listentry)

public actual fun InterlockedPushListSListEx(listhead: Long, list: Long, listend: Long, count: UInt): Long =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_InterlockedPushListSListEx(listhead, list, listend, count.toInt())

public actual fun IsImmersiveProcess(hprocess: HANDLE): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_IsImmersiveProcess(hprocess)

public actual fun IsProcessCritical(hprocess: HANDLE, critical: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_IsProcessCritical(hprocess, critical)

public actual fun IsProcessorFeaturePresent(processorfeature: PROCESSOR_FEATURE_ID): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_IsProcessorFeaturePresent(processorfeature.toInt())

public actual fun IsThreadAFiber(): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_IsThreadAFiber()

public actual fun IsThreadpoolTimerSet(pti: PTP_TIMER): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_IsThreadpoolTimerSet(pti)

public actual fun IsWow64Process(hprocess: HANDLE, wow64process: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_IsWow64Process(hprocess, wow64process)

public actual fun IsWow64Process2(hprocess: HANDLE, pprocessmachine: Long, pnativemachine: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_IsWow64Process2(hprocess, pprocessmachine, pnativemachine)

public actual fun LeaveCriticalSection(lpcriticalsection: Long) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_LeaveCriticalSection(lpcriticalsection)
}

public actual fun LeaveCriticalSectionWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, pcs: Long) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_LeaveCriticalSectionWhenCallbackReturns(pci, pcs)
}

public actual fun OpenEventA(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lpname: PCSTR): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_OpenEventA(dwdesiredaccess.toInt(), binherithandle, lpname)

public actual fun OpenEventW(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lpname: PCWSTR): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_OpenEventW(dwdesiredaccess.toInt(), binherithandle, lpname)

public actual fun OpenMutexW(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lpname: PCWSTR): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_OpenMutexW(dwdesiredaccess.toInt(), binherithandle, lpname)

public actual fun OpenPrivateNamespaceA(lpboundarydescriptor: Long, lpaliasprefix: PCSTR): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_OpenPrivateNamespaceA(lpboundarydescriptor, lpaliasprefix)

public actual fun OpenPrivateNamespaceW(lpboundarydescriptor: Long, lpaliasprefix: PCWSTR): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_OpenPrivateNamespaceW(lpboundarydescriptor, lpaliasprefix)

public actual fun OpenProcess(dwdesiredaccess: PROCESS_ACCESS_RIGHTS, binherithandle: BOOL, dwprocessid: UInt): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_OpenProcess(dwdesiredaccess.toInt(), binherithandle, dwprocessid.toInt())

public actual fun OpenProcessToken(processhandle: HANDLE, desiredaccess: TOKEN_ACCESS_MASK, tokenhandle: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_OpenProcessToken(processhandle, desiredaccess.toInt(), tokenhandle)

public actual fun OpenSemaphoreW(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lpname: PCWSTR): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_OpenSemaphoreW(dwdesiredaccess.toInt(), binherithandle, lpname)

public actual fun OpenThread(dwdesiredaccess: THREAD_ACCESS_RIGHTS, binherithandle: BOOL, dwthreadid: UInt): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_OpenThread(dwdesiredaccess.toInt(), binherithandle, dwthreadid.toInt())

public actual fun OpenThreadToken(threadhandle: HANDLE, desiredaccess: TOKEN_ACCESS_MASK, openasself: BOOL, tokenhandle: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_OpenThreadToken(threadhandle, desiredaccess.toInt(), openasself, tokenhandle)

public actual fun OpenWaitableTimerA(dwdesiredaccess: UInt, binherithandle: BOOL, lptimername: PCSTR): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_OpenWaitableTimerA(dwdesiredaccess.toInt(), binherithandle, lptimername)

public actual fun OpenWaitableTimerW(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lptimername: PCWSTR): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_OpenWaitableTimerW(dwdesiredaccess.toInt(), binherithandle, lptimername)

public actual fun PulseEvent(hevent: HANDLE): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_PulseEvent(hevent)

public actual fun QueryDepthSList(listhead: Long): UShort =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_QueryDepthSList(listhead).toUShort()

public actual fun QueryFullProcessImageNameA(hprocess: HANDLE, dwflags: PROCESS_NAME_FORMAT, lpexename: PSTR, lpdwsize: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_QueryFullProcessImageNameA(hprocess, dwflags.toInt(), lpexename, lpdwsize)

public actual fun QueryFullProcessImageNameW(hprocess: HANDLE, dwflags: PROCESS_NAME_FORMAT, lpexename: PWSTR, lpdwsize: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_QueryFullProcessImageNameW(hprocess, dwflags.toInt(), lpexename, lpdwsize)

public actual fun QueryProcessAffinityUpdateMode(hprocess: HANDLE, lpdwflags: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_QueryProcessAffinityUpdateMode(hprocess, lpdwflags)

public actual fun QueryProtectedPolicy(policyguid: Long, policyvalue: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_QueryProtectedPolicy(policyguid, policyvalue)

public actual fun QueryThreadpoolStackInformation(ptpp: PTP_POOL, ptpsi: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_QueryThreadpoolStackInformation(ptpp, ptpsi)

public actual fun QueryUmsThreadInformation(umsthread: Long, umsthreadinfoclass: UMS_THREAD_INFO_CLASS, umsthreadinformation: Long, umsthreadinformationlength: UInt, returnlength: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_QueryUmsThreadInformation(umsthread, umsthreadinfoclass, umsthreadinformation, umsthreadinformationlength.toInt(), returnlength)

public actual fun QueueUserAPC(pfnapc: PAPCFUNC, hthread: HANDLE, dwdata: ULong): UInt =
    0u

public actual fun QueueUserAPC2(apcroutine: PAPCFUNC, thread: HANDLE, data: ULong, flags: QUEUE_USER_APC_FLAGS): BOOL =
    0

public actual fun QueueUserWorkItem(function: LPTHREAD_START_ROUTINE, context: Long, flags: WORKER_THREAD_FLAGS): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_QueueUserWorkItem(function.toLong(), context, flags.toInt())

public actual fun RegisterWaitForSingleObject(phnewwaitobject: Long, hobject: HANDLE, callback: WAITORTIMERCALLBACK, context: Long, dwmilliseconds: UInt, dwflags: WORKER_THREAD_FLAGS): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RegisterWaitForSingleObject(phnewwaitobject, hobject, callback.toLong(), context, dwmilliseconds.toInt(), dwflags.toInt())

public actual fun ReleaseMutex(hmutex: HANDLE): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_ReleaseMutex(hmutex)

public actual fun ReleaseMutexWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, mut: HANDLE) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_ReleaseMutexWhenCallbackReturns(pci, mut)
}

public actual fun ReleaseSRWLockExclusive(srwlock: Long) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_ReleaseSRWLockExclusive(srwlock)
}

public actual fun ReleaseSRWLockShared(srwlock: Long) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_ReleaseSRWLockShared(srwlock)
}

public actual fun ReleaseSemaphore(hsemaphore: HANDLE, lreleasecount: Int, lppreviouscount: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_ReleaseSemaphore(hsemaphore, lreleasecount, lppreviouscount)

public actual fun ReleaseSemaphoreWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, sem: HANDLE, crel: UInt) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_ReleaseSemaphoreWhenCallbackReturns(pci, sem, crel.toInt())
}

public actual fun ResetEvent(hevent: HANDLE): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_ResetEvent(hevent)

public actual fun ResumeThread(hthread: HANDLE): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_ResumeThread(hthread).toUInt()

public actual fun RtwqAddPeriodicCallback(callback: RTWQPERIODICCALLBACK, context: Long, key: Long): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RtwqAddPeriodicCallback(callback.toLong(), context, key)

public actual fun RtwqAllocateSerialWorkQueue(workqueueidin: UInt, workqueueidout: Long): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RtwqAllocateSerialWorkQueue(workqueueidin.toInt(), workqueueidout)

public actual fun RtwqAllocateWorkQueue(workqueuetype: RTWQ_WORKQUEUE_TYPE, workqueueid: Long): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RtwqAllocateWorkQueue(workqueuetype, workqueueid)

public actual fun RtwqBeginRegisterWorkQueueWithMMCSS(workqueueid: UInt, usageclass: PCWSTR, dwtaskid: UInt, lpriority: Int, donecallback: Long, donestate: Long): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RtwqBeginRegisterWorkQueueWithMMCSS(workqueueid.toInt(), usageclass, dwtaskid.toInt(), lpriority, donecallback, donestate)

public actual fun RtwqBeginUnregisterWorkQueueWithMMCSS(workqueueid: UInt, donecallback: Long, donestate: Long): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RtwqBeginUnregisterWorkQueueWithMMCSS(workqueueid.toInt(), donecallback, donestate)

public actual fun RtwqCancelDeadline(prequest: HANDLE): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RtwqCancelDeadline(prequest)

public actual fun RtwqCancelWorkItem(key: ULong): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RtwqCancelWorkItem(key.toLong())

public actual fun RtwqCreateAsyncResult(appobject: Long, callback: Long, appstate: Long, asyncresult: Long): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RtwqCreateAsyncResult(appobject, callback, appstate, asyncresult)

public actual fun RtwqEndRegisterWorkQueueWithMMCSS(result: Long, taskid: Long): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RtwqEndRegisterWorkQueueWithMMCSS(result, taskid)

public actual fun RtwqGetWorkQueueMMCSSClass(workqueueid: UInt, usageclass: PWSTR, usageclasslength: Long): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RtwqGetWorkQueueMMCSSClass(workqueueid.toInt(), usageclass, usageclasslength)

public actual fun RtwqGetWorkQueueMMCSSPriority(workqueueid: UInt, priority: Long): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RtwqGetWorkQueueMMCSSPriority(workqueueid.toInt(), priority)

public actual fun RtwqGetWorkQueueMMCSSTaskId(workqueueid: UInt, taskid: Long): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RtwqGetWorkQueueMMCSSTaskId(workqueueid.toInt(), taskid)

public actual fun RtwqInvokeCallback(result: Long): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RtwqInvokeCallback(result)

public actual fun RtwqJoinWorkQueue(workqueueid: UInt, hfile: HANDLE, out: Long): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RtwqJoinWorkQueue(workqueueid.toInt(), hfile, out)

public actual fun RtwqLockPlatform(): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RtwqLockPlatform()

public actual fun RtwqLockSharedWorkQueue(usageclass: PCWSTR, basepriority: Int, taskid: Long, id: Long): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RtwqLockSharedWorkQueue(usageclass, basepriority, taskid, id)

public actual fun RtwqLockWorkQueue(workqueueid: UInt): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RtwqLockWorkQueue(workqueueid.toInt())

public actual fun RtwqPutWaitingWorkItem(hevent: HANDLE, lpriority: Int, result: Long, key: Long): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RtwqPutWaitingWorkItem(hevent, lpriority, result, key)

public actual fun RtwqPutWorkItem(dwqueue: UInt, lpriority: Int, result: Long): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RtwqPutWorkItem(dwqueue.toInt(), lpriority, result)

public actual fun RtwqRegisterPlatformEvents(platformevents: Long): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RtwqRegisterPlatformEvents(platformevents)

public actual fun RtwqRegisterPlatformWithMMCSS(usageclass: PCWSTR, taskid: Long, lpriority: Int): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RtwqRegisterPlatformWithMMCSS(usageclass, taskid, lpriority)

public actual fun RtwqRemovePeriodicCallback(dwkey: UInt): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RtwqRemovePeriodicCallback(dwkey.toInt())

public actual fun RtwqScheduleWorkItem(result: Long, timeout: Long, key: Long): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RtwqScheduleWorkItem(result, timeout, key)

public actual fun RtwqSetDeadline(workqueueid: UInt, deadlineinhns: Long, prequest: Long): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RtwqSetDeadline(workqueueid.toInt(), deadlineinhns, prequest)

public actual fun RtwqSetDeadline2(workqueueid: UInt, deadlineinhns: Long, predeadlineinhns: Long, prequest: Long): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RtwqSetDeadline2(workqueueid.toInt(), deadlineinhns, predeadlineinhns, prequest)

public actual fun RtwqSetLongRunning(workqueueid: UInt, enable: BOOL): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RtwqSetLongRunning(workqueueid.toInt(), enable)

public actual fun RtwqShutdown(): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RtwqShutdown()

public actual fun RtwqStartup(): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RtwqStartup()

public actual fun RtwqUnjoinWorkQueue(workqueueid: UInt, hfile: HANDLE): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RtwqUnjoinWorkQueue(workqueueid.toInt(), hfile)

public actual fun RtwqUnlockPlatform(): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RtwqUnlockPlatform()

public actual fun RtwqUnlockWorkQueue(workqueueid: UInt): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RtwqUnlockWorkQueue(workqueueid.toInt())

public actual fun RtwqUnregisterPlatformEvents(platformevents: Long): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RtwqUnregisterPlatformEvents(platformevents)

public actual fun RtwqUnregisterPlatformFromMMCSS(): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_RtwqUnregisterPlatformFromMMCSS()

public actual fun SetCriticalSectionSpinCount(lpcriticalsection: Long, dwspincount: UInt): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetCriticalSectionSpinCount(lpcriticalsection, dwspincount.toInt()).toUInt()

public actual fun SetEvent(hevent: HANDLE): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetEvent(hevent)

public actual fun SetEventWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, evt: HANDLE) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetEventWhenCallbackReturns(pci, evt)
}

public actual fun SetPriorityClass(hprocess: HANDLE, dwpriorityclass: PROCESS_CREATION_FLAGS): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetPriorityClass(hprocess, dwpriorityclass.toInt())

public actual fun SetProcessAffinityMask(hprocess: HANDLE, dwprocessaffinitymask: ULong): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetProcessAffinityMask(hprocess, dwprocessaffinitymask.toLong())

public actual fun SetProcessAffinityUpdateMode(hprocess: HANDLE, dwflags: PROCESS_AFFINITY_AUTO_UPDATE_FLAGS): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetProcessAffinityUpdateMode(hprocess, dwflags.toInt())

public actual fun SetProcessDEPPolicy(dwflags: PROCESS_DEP_FLAGS): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetProcessDEPPolicy(dwflags.toInt())

public actual fun SetProcessDefaultCpuSetMasks(process: HANDLE, cpusetmasks: Long, cpusetmaskcount: UShort): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetProcessDefaultCpuSetMasks(process, cpusetmasks, cpusetmaskcount.toShort())

public actual fun SetProcessDefaultCpuSets(process: HANDLE, cpusetids: Long, cpusetidcount: UInt): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetProcessDefaultCpuSets(process, cpusetids, cpusetidcount.toInt())

public actual fun SetProcessDynamicEHContinuationTargets(process: HANDLE, numberoftargets: UShort, targets: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetProcessDynamicEHContinuationTargets(process, numberoftargets.toShort(), targets)

public actual fun SetProcessDynamicEnforcedCetCompatibleRanges(process: HANDLE, numberofranges: UShort, ranges: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetProcessDynamicEnforcedCetCompatibleRanges(process, numberofranges.toShort(), ranges)

public actual fun SetProcessInformation(hprocess: HANDLE, processinformationclass: PROCESS_INFORMATION_CLASS, processinformation: Long, processinformationsize: UInt): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetProcessInformation(hprocess, processinformationclass, processinformation, processinformationsize.toInt())

public actual fun SetProcessMitigationPolicy(mitigationpolicy: PROCESS_MITIGATION_POLICY, lpbuffer: Long, dwlength: ULong): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetProcessMitigationPolicy(mitigationpolicy, lpbuffer, dwlength.toLong())

public actual fun SetProcessPriorityBoost(hprocess: HANDLE, bdisablepriorityboost: BOOL): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetProcessPriorityBoost(hprocess, bdisablepriorityboost)

public actual fun SetProcessRestrictionExemption(fenableexemption: BOOL): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetProcessRestrictionExemption(fenableexemption)

public actual fun SetProcessShutdownParameters(dwlevel: UInt, dwflags: UInt): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetProcessShutdownParameters(dwlevel.toInt(), dwflags.toInt())

public actual fun SetProcessWorkingSetSize(hprocess: HANDLE, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetProcessWorkingSetSize(hprocess, dwminimumworkingsetsize.toLong(), dwmaximumworkingsetsize.toLong())

public actual fun SetProtectedPolicy(policyguid: Long, policyvalue: ULong, oldpolicyvalue: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetProtectedPolicy(policyguid, policyvalue.toLong(), oldpolicyvalue)

public actual fun SetThreadAffinityMask(hthread: HANDLE, dwthreadaffinitymask: ULong): ULong =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetThreadAffinityMask(hthread, dwthreadaffinitymask.toLong()).toULong()

public actual fun SetThreadDescription(hthread: HANDLE, lpthreaddescription: PCWSTR): HRESULT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetThreadDescription(hthread, lpthreaddescription)

public actual fun SetThreadGroupAffinity(hthread: HANDLE, groupaffinity: Long, previousgroupaffinity: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetThreadGroupAffinity(hthread, groupaffinity, previousgroupaffinity)

public actual fun SetThreadIdealProcessor(hthread: HANDLE, dwidealprocessor: UInt): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetThreadIdealProcessor(hthread, dwidealprocessor.toInt()).toUInt()

public actual fun SetThreadIdealProcessorEx(hthread: HANDLE, lpidealprocessor: Long, lppreviousidealprocessor: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetThreadIdealProcessorEx(hthread, lpidealprocessor, lppreviousidealprocessor)

public actual fun SetThreadInformation(hthread: HANDLE, threadinformationclass: THREAD_INFORMATION_CLASS, threadinformation: Long, threadinformationsize: UInt): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetThreadInformation(hthread, threadinformationclass, threadinformation, threadinformationsize.toInt())

public actual fun SetThreadPriority(hthread: HANDLE, npriority: THREAD_PRIORITY): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetThreadPriority(hthread, npriority)

public actual fun SetThreadPriorityBoost(hthread: HANDLE, bdisablepriorityboost: BOOL): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetThreadPriorityBoost(hthread, bdisablepriorityboost)

public actual fun SetThreadSelectedCpuSetMasks(thread: HANDLE, cpusetmasks: Long, cpusetmaskcount: UShort): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetThreadSelectedCpuSetMasks(thread, cpusetmasks, cpusetmaskcount.toShort())

public actual fun SetThreadSelectedCpuSets(thread: HANDLE, cpusetids: Long, cpusetidcount: UInt): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetThreadSelectedCpuSets(thread, cpusetids, cpusetidcount.toInt())

public actual fun SetThreadStackGuarantee(stacksizeinbytes: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetThreadStackGuarantee(stacksizeinbytes)

public actual fun SetThreadToken(thread: Long, token: HANDLE): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetThreadToken(thread, token)

public actual fun SetThreadpoolStackInformation(ptpp: PTP_POOL, ptpsi: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetThreadpoolStackInformation(ptpp, ptpsi)

public actual fun SetThreadpoolThreadMaximum(ptpp: PTP_POOL, cthrdmost: UInt) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetThreadpoolThreadMaximum(ptpp, cthrdmost.toInt())
}

public actual fun SetThreadpoolThreadMinimum(ptpp: PTP_POOL, cthrdmic: UInt): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetThreadpoolThreadMinimum(ptpp, cthrdmic.toInt())

public actual fun SetThreadpoolTimer(pti: PTP_TIMER, pftduetime: Long, msperiod: UInt, mswindowlength: UInt) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetThreadpoolTimer(pti, pftduetime, msperiod.toInt(), mswindowlength.toInt())
}

public actual fun SetThreadpoolTimerEx(pti: PTP_TIMER, pftduetime: Long, msperiod: UInt, mswindowlength: UInt): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetThreadpoolTimerEx(pti, pftduetime, msperiod.toInt(), mswindowlength.toInt())

public actual fun SetThreadpoolWait(pwa: PTP_WAIT, h: HANDLE, pfttimeout: Long) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetThreadpoolWait(pwa, h, pfttimeout)
}

public actual fun SetThreadpoolWaitEx(pwa: PTP_WAIT, h: HANDLE, pfttimeout: Long, reserved: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetThreadpoolWaitEx(pwa, h, pfttimeout, reserved)

public actual fun SetTimerQueueTimer(timerqueue: HANDLE, callback: WAITORTIMERCALLBACK, parameter: Long, duetime: UInt, period: UInt, preferio: BOOL): HANDLE =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetTimerQueueTimer(timerqueue, callback.toLong(), parameter, duetime.toInt(), period.toInt(), preferio)

public actual fun SetUmsThreadInformation(umsthread: Long, umsthreadinfoclass: UMS_THREAD_INFO_CLASS, umsthreadinformation: Long, umsthreadinformationlength: UInt): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetUmsThreadInformation(umsthread, umsthreadinfoclass, umsthreadinformation, umsthreadinformationlength.toInt())

public actual fun SetWaitableTimer(htimer: HANDLE, lpduetime: Long, lperiod: Int, pfncompletionroutine: PTIMERAPCROUTINE, lpargtocompletionroutine: Long, fresume: BOOL): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetWaitableTimer(htimer, lpduetime, lperiod, pfncompletionroutine.toLong(), lpargtocompletionroutine, fresume)

public actual fun SetWaitableTimerEx(htimer: HANDLE, lpduetime: Long, lperiod: Int, pfncompletionroutine: PTIMERAPCROUTINE, lpargtocompletionroutine: Long, wakecontext: Long, tolerabledelay: UInt): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SetWaitableTimerEx(htimer, lpduetime, lperiod, pfncompletionroutine.toLong(), lpargtocompletionroutine, wakecontext, tolerabledelay.toInt())

public actual fun SignalObjectAndWait(hobjecttosignal: HANDLE, hobjecttowaiton: HANDLE, dwmilliseconds: UInt, balertable: BOOL): WAIT_EVENT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SignalObjectAndWait(hobjecttosignal, hobjecttowaiton, dwmilliseconds.toInt(), balertable).toUInt()

public actual fun Sleep(dwmilliseconds: UInt) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_Sleep(dwmilliseconds.toInt())
}

public actual fun SleepConditionVariableCS(conditionvariable: Long, criticalsection: Long, dwmilliseconds: UInt): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SleepConditionVariableCS(conditionvariable, criticalsection, dwmilliseconds.toInt())

public actual fun SleepConditionVariableSRW(conditionvariable: Long, srwlock: Long, dwmilliseconds: UInt, flags: UInt): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SleepConditionVariableSRW(conditionvariable, srwlock, dwmilliseconds.toInt(), flags.toInt())

public actual fun SleepEx(dwmilliseconds: UInt, balertable: BOOL): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SleepEx(dwmilliseconds.toInt(), balertable).toUInt()

public actual fun StartThreadpoolIo(pio: PTP_IO) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_StartThreadpoolIo(pio)
}

public actual fun SubmitThreadpoolWork(pwk: PTP_WORK) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SubmitThreadpoolWork(pwk)
}

public actual fun SuspendThread(hthread: HANDLE): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SuspendThread(hthread).toUInt()

public actual fun SwitchToFiber(lpfiber: Long) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SwitchToFiber(lpfiber)
}

public actual fun SwitchToThread(): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_SwitchToThread()

public actual fun TerminateProcess(hprocess: HANDLE, uexitcode: UInt): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_TerminateProcess(hprocess, uexitcode.toInt())

public actual fun TerminateThread(hthread: HANDLE, dwexitcode: UInt): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_TerminateThread(hthread, dwexitcode.toInt())

public actual fun TlsAlloc(): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_TlsAlloc().toUInt()

public actual fun TlsFree(dwtlsindex: UInt): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_TlsFree(dwtlsindex.toInt())

public actual fun TlsGetValue(dwtlsindex: UInt): Long =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_TlsGetValue(dwtlsindex.toInt())

public actual fun TlsSetValue(dwtlsindex: UInt, lptlsvalue: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_TlsSetValue(dwtlsindex.toInt(), lptlsvalue)

public actual fun TryAcquireSRWLockExclusive(srwlock: Long): Boolean =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_TryAcquireSRWLockExclusive(srwlock)

public actual fun TryAcquireSRWLockShared(srwlock: Long): Boolean =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_TryAcquireSRWLockShared(srwlock)

public actual fun TryEnterCriticalSection(lpcriticalsection: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_TryEnterCriticalSection(lpcriticalsection)

public actual fun TrySubmitThreadpoolCallback(pfns: PTP_SIMPLE_CALLBACK, pv: Long, pcbe: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_TrySubmitThreadpoolCallback(pfns.toLong(), pv, pcbe)

public actual fun UmsThreadYield(schedulerparam: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_UmsThreadYield(schedulerparam)

public actual fun UnregisterWait(waithandle: HANDLE): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_UnregisterWait(waithandle)

public actual fun UnregisterWaitEx(waithandle: HANDLE, completionevent: HANDLE): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_UnregisterWaitEx(waithandle, completionevent)

public actual fun UpdateProcThreadAttribute(lpattributelist: LPPROC_THREAD_ATTRIBUTE_LIST, dwflags: UInt, attribute: ULong, lpvalue: Long, cbsize: ULong, lppreviousvalue: Long, lpreturnsize: Long): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_UpdateProcThreadAttribute(lpattributelist, dwflags.toInt(), attribute.toLong(), lpvalue, cbsize.toLong(), lppreviousvalue, lpreturnsize)

public actual fun WaitForInputIdle(hprocess: HANDLE, dwmilliseconds: UInt): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_WaitForInputIdle(hprocess, dwmilliseconds.toInt()).toUInt()

public actual fun WaitForMultipleObjects(ncount: UInt, lphandles: Long, bwaitall: BOOL, dwmilliseconds: UInt): WAIT_EVENT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_WaitForMultipleObjects(ncount.toInt(), lphandles, bwaitall, dwmilliseconds.toInt()).toUInt()

public actual fun WaitForMultipleObjectsEx(ncount: UInt, lphandles: Long, bwaitall: BOOL, dwmilliseconds: UInt, balertable: BOOL): WAIT_EVENT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_WaitForMultipleObjectsEx(ncount.toInt(), lphandles, bwaitall, dwmilliseconds.toInt(), balertable).toUInt()

public actual fun WaitForSingleObject(hhandle: HANDLE, dwmilliseconds: UInt): WAIT_EVENT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_WaitForSingleObject(hhandle, dwmilliseconds.toInt()).toUInt()

public actual fun WaitForSingleObjectEx(hhandle: HANDLE, dwmilliseconds: UInt, balertable: BOOL): WAIT_EVENT =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_WaitForSingleObjectEx(hhandle, dwmilliseconds.toInt(), balertable).toUInt()

public actual fun WaitForThreadpoolIoCallbacks(pio: PTP_IO, fcancelpendingcallbacks: BOOL) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_WaitForThreadpoolIoCallbacks(pio, fcancelpendingcallbacks)
}

public actual fun WaitForThreadpoolTimerCallbacks(pti: PTP_TIMER, fcancelpendingcallbacks: BOOL) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_WaitForThreadpoolTimerCallbacks(pti, fcancelpendingcallbacks)
}

public actual fun WaitForThreadpoolWaitCallbacks(pwa: PTP_WAIT, fcancelpendingcallbacks: BOOL) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_WaitForThreadpoolWaitCallbacks(pwa, fcancelpendingcallbacks)
}

public actual fun WaitForThreadpoolWorkCallbacks(pwk: PTP_WORK, fcancelpendingcallbacks: BOOL) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_WaitForThreadpoolWorkCallbacks(pwk, fcancelpendingcallbacks)
}

public actual fun WaitOnAddress(address: Long, compareaddress: Long, addresssize: ULong, dwmilliseconds: UInt): BOOL =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_WaitOnAddress(address, compareaddress, addresssize.toLong(), dwmilliseconds.toInt())

public actual fun WakeAllConditionVariable(conditionvariable: Long) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_WakeAllConditionVariable(conditionvariable)
}

public actual fun WakeByAddressAll(address: Long) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_WakeByAddressAll(address)
}

public actual fun WakeByAddressSingle(address: Long) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_WakeByAddressSingle(address)
}

public actual fun WakeConditionVariable(conditionvariable: Long) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_WakeConditionVariable(conditionvariable)
}

public actual fun WinExec(lpcmdline: PCSTR, ucmdshow: UInt): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_WinExec(lpcmdline, ucmdshow.toInt()).toUInt()

public actual fun Wow64SetThreadDefaultGuestMachine(machine: UShort): UShort =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_Wow64SetThreadDefaultGuestMachine(machine.toShort()).toUShort()

public actual fun Wow64SuspendThread(hthread: HANDLE): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_Wow64SuspendThread(hthread).toUInt()
