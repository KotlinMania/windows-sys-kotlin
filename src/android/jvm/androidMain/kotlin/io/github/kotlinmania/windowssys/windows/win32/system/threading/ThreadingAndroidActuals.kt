@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.threading

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Papcfunc
import io.github.kotlinmania.windowssys.windows.win32.foundation.WaitEvent
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.TokenAccessMask

private object WindowsWin32SystemThreadingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_acquireSRWLockExclusive(srwlock: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_acquireSRWLockShared(srwlock: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_addIntegrityLabelToBoundaryDescriptor(boundarydescriptor: Long, integritylabel: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_addSIDToBoundaryDescriptor(boundarydescriptor: Long, requiredsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_attachThreadInput(idattach: Int, idattachto: Int, fattach: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_avQuerySystemResponsiveness(avrthandle: Long, systemresponsivenessvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_avRevertMmThreadCharacteristics(avrthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_avRtCreateThreadOrderingGroup(context: Long, period: Long, threadorderingguid: Long, timeout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_avRtCreateThreadOrderingGroupExA(context: Long, period: Long, threadorderingguid: Long, timeout: Long, taskname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_avRtCreateThreadOrderingGroupExW(context: Long, period: Long, threadorderingguid: Long, timeout: Long, taskname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_avRtDeleteThreadOrderingGroup(context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_avRtJoinThreadOrderingGroup(context: Long, threadorderingguid: Long, before: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_avRtLeaveThreadOrderingGroup(context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_avRtWaitOnThreadOrderingGroup(context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_avSetMmMaxThreadCharacteristicsA(firsttask: Long, secondtask: Long, taskindex: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_avSetMmMaxThreadCharacteristicsW(firsttask: Long, secondtask: Long, taskindex: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_avSetMmThreadCharacteristicsA(taskname: Long, taskindex: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_avSetMmThreadCharacteristicsW(taskname: Long, taskindex: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_avSetMmThreadPriority(avrthandle: Long, priority: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_callbackMayRunLong(pci: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_cancelThreadpoolIo(pio: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_cancelTimerQueueTimer(timerqueue: Long, timer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_cancelWaitableTimer(htimer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_changeTimerQueueTimer(timerqueue: Long, timer: Long, duetime: Int, period: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_closePrivateNamespace(handle: Long, flags: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_closeThreadpool(ptpp: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_closeThreadpoolCleanupGroup(ptpcg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_closeThreadpoolCleanupGroupMembers(ptpcg: Long, fcancelpendingcallbacks: Int, pvcleanupcontext: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_closeThreadpoolIo(pio: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_closeThreadpoolTimer(pti: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_closeThreadpoolWait(pwa: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_closeThreadpoolWork(pwk: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_convertFiberToThread(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_convertThreadToFiber(lpparameter: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_convertThreadToFiberEx(lpparameter: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createBoundaryDescriptorA(name: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createBoundaryDescriptorW(name: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createEventA(lpeventattributes: Long, bmanualreset: Int, binitialstate: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createEventExA(lpeventattributes: Long, lpname: Long, dwflags: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createEventExW(lpeventattributes: Long, lpname: Long, dwflags: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createEventW(lpeventattributes: Long, bmanualreset: Int, binitialstate: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createFiber(dwstacksize: Long, lpstartaddress: Long, lpparameter: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createFiberEx(dwstackcommitsize: Long, dwstackreservesize: Long, dwflags: Int, lpstartaddress: Long, lpparameter: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createMutexA(lpmutexattributes: Long, binitialowner: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createMutexExA(lpmutexattributes: Long, lpname: Long, dwflags: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createMutexExW(lpmutexattributes: Long, lpname: Long, dwflags: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createMutexW(lpmutexattributes: Long, binitialowner: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createPrivateNamespaceA(lpprivatenamespaceattributes: Long, lpboundarydescriptor: Long, lpaliasprefix: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createPrivateNamespaceW(lpprivatenamespaceattributes: Long, lpboundarydescriptor: Long, lpaliasprefix: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createProcessA(lpapplicationname: Long, lpcommandline: Long, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: Int, dwcreationflags: Int, lpenvironment: Long, lpcurrentdirectory: Long, lpstartupinfo: Long, lpprocessinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createProcessAsUserA(htoken: Long, lpapplicationname: Long, lpcommandline: Long, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: Int, dwcreationflags: Int, lpenvironment: Long, lpcurrentdirectory: Long, lpstartupinfo: Long, lpprocessinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createProcessAsUserW(htoken: Long, lpapplicationname: Long, lpcommandline: Long, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: Int, dwcreationflags: Int, lpenvironment: Long, lpcurrentdirectory: Long, lpstartupinfo: Long, lpprocessinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createProcessW(lpapplicationname: Long, lpcommandline: Long, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: Int, dwcreationflags: Int, lpenvironment: Long, lpcurrentdirectory: Long, lpstartupinfo: Long, lpprocessinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createProcessWithLogonW(lpusername: Long, lpdomain: Long, lppassword: Long, dwlogonflags: Int, lpapplicationname: Long, lpcommandline: Long, dwcreationflags: Int, lpenvironment: Long, lpcurrentdirectory: Long, lpstartupinfo: Long, lpprocessinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createProcessWithTokenW(htoken: Long, dwlogonflags: Int, lpapplicationname: Long, lpcommandline: Long, dwcreationflags: Int, lpenvironment: Long, lpcurrentdirectory: Long, lpstartupinfo: Long, lpprocessinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createRemoteThread(hprocess: Long, lpthreadattributes: Long, dwstacksize: Long, lpstartaddress: Long, lpparameter: Long, dwcreationflags: Int, lpthreadid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createRemoteThreadEx(hprocess: Long, lpthreadattributes: Long, dwstacksize: Long, lpstartaddress: Long, lpparameter: Long, dwcreationflags: Int, lpattributelist: Long, lpthreadid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createSemaphoreA(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createSemaphoreExA(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: Long, dwflags: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createSemaphoreExW(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: Long, dwflags: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createSemaphoreW(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createThread(lpthreadattributes: Long, dwstacksize: Long, lpstartaddress: Long, lpparameter: Long, dwcreationflags: Int, lpthreadid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createThreadpool(reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createThreadpoolCleanupGroup(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createThreadpoolIo(fl: Long, pfnio: Long, pv: Long, pcbe: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createThreadpoolTimer(pfnti: Long, pv: Long, pcbe: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createThreadpoolWait(pfnwa: Long, pv: Long, pcbe: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createThreadpoolWork(pfnwk: Long, pv: Long, pcbe: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createTimerQueue(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createTimerQueueTimer(phnewtimer: Long, timerqueue: Long, callback: Long, parameter: Long, duetime: Int, period: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createUmsCompletionList(umscompletionlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createUmsThreadContext(lpumsthread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createWaitableTimerA(lptimerattributes: Long, bmanualreset: Int, lptimername: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createWaitableTimerExA(lptimerattributes: Long, lptimername: Long, dwflags: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createWaitableTimerExW(lptimerattributes: Long, lptimername: Long, dwflags: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_createWaitableTimerW(lptimerattributes: Long, bmanualreset: Int, lptimername: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_deleteBoundaryDescriptor(boundarydescriptor: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_deleteCriticalSection(lpcriticalsection: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_deleteFiber(lpfiber: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_deleteProcThreadAttributeList(lpattributelist: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_deleteSynchronizationBarrier(lpbarrier: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_deleteTimerQueue(timerqueue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_deleteTimerQueueEx(timerqueue: Long, completionevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_deleteTimerQueueTimer(timerqueue: Long, timer: Long, completionevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_deleteUmsCompletionList(umscompletionlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_deleteUmsThreadContext(umsthread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_dequeueUmsCompletionListItems(umscompletionlist: Long, waittimeout: Int, umsthreadlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_disassociateCurrentThreadFromCallback(pci: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_enterCriticalSection(lpcriticalsection: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_enterSynchronizationBarrier(lpbarrier: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_enterUmsSchedulingMode(schedulerstartupinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_executeUmsThread(umsthread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_exitProcess(uexitcode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_exitThread(dwexitcode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_flsAlloc(lpcallback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_flsFree(dwflsindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_flsGetValue(dwflsindex: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_flsSetValue(dwflsindex: Int, lpflsdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_flushProcessWriteBuffers()

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_freeLibraryWhenCallbackReturns(pci: Long, mod: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getActiveProcessorCount(groupnumber: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getActiveProcessorGroupCount(): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getCurrentProcess(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getCurrentProcessId(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getCurrentProcessorNumber(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getCurrentProcessorNumberEx(procnumber: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getCurrentThread(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getCurrentThreadId(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getCurrentThreadStackLimits(lowlimit: Long, highlimit: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getCurrentUmsThread(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getExitCodeProcess(hprocess: Long, lpexitcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getExitCodeThread(hthread: Long, lpexitcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getGuiResources(hprocess: Long, uiflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getMachineTypeAttributes(machine: Short, machinetypeattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getMaximumProcessorCount(groupnumber: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getMaximumProcessorGroupCount(): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getNextUmsListItem(umscontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getNumaAvailableMemoryNode(node: Byte, availablebytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getNumaAvailableMemoryNodeEx(node: Short, availablebytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getNumaHighestNodeNumber(highestnodenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getNumaNodeNumberFromHandle(hfile: Long, nodenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getNumaNodeProcessorMask(node: Byte, processormask: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getNumaNodeProcessorMask2(nodenumber: Short, processormasks: Long, processormaskcount: Short, requiredmaskcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getNumaNodeProcessorMaskEx(node: Short, processormask: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getNumaProcessorNode(processor: Byte, nodenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getNumaProcessorNodeEx(processor: Long, nodenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getNumaProximityNode(proximityid: Int, nodenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getNumaProximityNodeEx(proximityid: Int, nodenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getPriorityClass(hprocess: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getProcessAffinityMask(hprocess: Long, lpprocessaffinitymask: Long, lpsystemaffinitymask: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getProcessDEPPolicy(hprocess: Long, lpflags: Long, lppermanent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getProcessDefaultCpuSetMasks(process: Long, cpusetmasks: Long, cpusetmaskcount: Short, requiredmaskcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getProcessDefaultCpuSets(process: Long, cpusetids: Long, cpusetidcount: Int, requiredidcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getProcessGroupAffinity(hprocess: Long, groupcount: Long, grouparray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getProcessHandleCount(hprocess: Long, pdwhandlecount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getProcessHandleFromHwnd(hwnd: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getProcessId(process: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getProcessIdOfThread(thread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getProcessInformation(hprocess: Long, processinformationclass: Int, processinformation: Long, processinformationsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getProcessIoCounters(hprocess: Long, lpiocounters: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getProcessMitigationPolicy(hprocess: Long, mitigationpolicy: Int, lpbuffer: Long, dwlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getProcessPriorityBoost(hprocess: Long, pdisablepriorityboost: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getProcessShutdownParameters(lpdwlevel: Long, lpdwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getProcessTimes(hprocess: Long, lpcreationtime: Long, lpexittime: Long, lpkerneltime: Long, lpusertime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getProcessVersion(processid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getProcessWorkingSetSize(hprocess: Long, lpminimumworkingsetsize: Long, lpmaximumworkingsetsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getStartupInfoA(lpstartupinfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getStartupInfoW(lpstartupinfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getSystemTimes(lpidletime: Long, lpkerneltime: Long, lpusertime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getThreadDescription(hthread: Long, ppszthreaddescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getThreadGroupAffinity(hthread: Long, groupaffinity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getThreadIOPendingFlag(hthread: Long, lpioispending: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getThreadId(thread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getThreadIdealProcessorEx(hthread: Long, lpidealprocessor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getThreadInformation(hthread: Long, threadinformationclass: Int, threadinformation: Long, threadinformationsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getThreadPriority(hthread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getThreadPriorityBoost(hthread: Long, pdisablepriorityboost: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getThreadSelectedCpuSetMasks(thread: Long, cpusetmasks: Long, cpusetmaskcount: Short, requiredmaskcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getThreadSelectedCpuSets(thread: Long, cpusetids: Long, cpusetidcount: Int, requiredidcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getThreadTimes(hthread: Long, lpcreationtime: Long, lpexittime: Long, lpkerneltime: Long, lpusertime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getUmsCompletionListEvent(umscompletionlist: Long, umscompletionevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_getUmsSystemThreadInformation(threadhandle: Long, systemthreadinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_initOnceBeginInitialize(lpinitonce: Long, dwflags: Int, fpending: Long, lpcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_initOnceComplete(lpinitonce: Long, dwflags: Int, lpcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_initOnceExecuteOnce(initonce: Long, initfn: Long, parameter: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_initOnceInitialize(initonce: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_initializeConditionVariable(conditionvariable: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_initializeCriticalSection(lpcriticalsection: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_initializeCriticalSectionAndSpinCount(lpcriticalsection: Long, dwspincount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_initializeCriticalSectionEx(lpcriticalsection: Long, dwspincount: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_initializeProcThreadAttributeList(lpattributelist: Long, dwattributecount: Int, dwflags: Int, lpsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_initializeSListHead(listhead: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_initializeSRWLock(srwlock: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_initializeSynchronizationBarrier(lpbarrier: Long, ltotalthreads: Int, lspincount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_interlockedFlushSList(listhead: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_interlockedPopEntrySList(listhead: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_interlockedPushEntrySList(listhead: Long, listentry: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_interlockedPushListSListEx(listhead: Long, list: Long, listend: Long, count: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_isImmersiveProcess(hprocess: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_isProcessCritical(hprocess: Long, critical: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_isProcessorFeaturePresent(processorfeature: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_isThreadAFiber(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_isThreadpoolTimerSet(pti: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_isWow64Process(hprocess: Long, wow64process: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_isWow64Process2(hprocess: Long, pprocessmachine: Long, pnativemachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_leaveCriticalSection(lpcriticalsection: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_leaveCriticalSectionWhenCallbackReturns(pci: Long, pcs: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_openEventA(dwdesiredaccess: Int, binherithandle: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_openEventW(dwdesiredaccess: Int, binherithandle: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_openMutexW(dwdesiredaccess: Int, binherithandle: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_openPrivateNamespaceA(lpboundarydescriptor: Long, lpaliasprefix: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_openPrivateNamespaceW(lpboundarydescriptor: Long, lpaliasprefix: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_openProcess(dwdesiredaccess: Int, binherithandle: Int, dwprocessid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_openProcessToken(processhandle: Long, desiredaccess: Int, tokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_openSemaphoreW(dwdesiredaccess: Int, binherithandle: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_openThread(dwdesiredaccess: Int, binherithandle: Int, dwthreadid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_openThreadToken(threadhandle: Long, desiredaccess: Int, openasself: Int, tokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_openWaitableTimerA(dwdesiredaccess: Int, binherithandle: Int, lptimername: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_openWaitableTimerW(dwdesiredaccess: Int, binherithandle: Int, lptimername: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_pulseEvent(hevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_queryDepthSList(listhead: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_queryFullProcessImageNameA(hprocess: Long, dwflags: Int, lpexename: Long, lpdwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_queryFullProcessImageNameW(hprocess: Long, dwflags: Int, lpexename: Long, lpdwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_queryProcessAffinityUpdateMode(hprocess: Long, lpdwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_queryProtectedPolicy(policyguid: Long, policyvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_queryThreadpoolStackInformation(ptpp: Long, ptpsi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_queryUmsThreadInformation(umsthread: Long, umsthreadinfoclass: Int, umsthreadinformation: Long, umsthreadinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_queueUserWorkItem(function: Long, context: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_registerWaitForSingleObject(phnewwaitobject: Long, hobject: Long, callback: Long, context: Long, dwmilliseconds: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_releaseMutex(hmutex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_releaseMutexWhenCallbackReturns(pci: Long, mut: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_releaseSRWLockExclusive(srwlock: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_releaseSRWLockShared(srwlock: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_releaseSemaphore(hsemaphore: Long, lreleasecount: Int, lppreviouscount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_releaseSemaphoreWhenCallbackReturns(pci: Long, sem: Long, crel: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_resetEvent(hevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_resumeThread(hthread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_rtwqAddPeriodicCallback(callback: Long, context: Long, key: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_rtwqAllocateSerialWorkQueue(workqueueidin: Int, workqueueidout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_rtwqAllocateWorkQueue(workqueuetype: Int, workqueueid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_rtwqBeginRegisterWorkQueueWithMMCSS(workqueueid: Int, usageclass: Long, dwtaskid: Int, lpriority: Int, donecallback: Long, donestate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_rtwqBeginUnregisterWorkQueueWithMMCSS(workqueueid: Int, donecallback: Long, donestate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_rtwqCancelDeadline(prequest: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_rtwqCancelWorkItem(key: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_rtwqCreateAsyncResult(appobject: Long, callback: Long, appstate: Long, asyncresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_rtwqEndRegisterWorkQueueWithMMCSS(result: Long, taskid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_rtwqGetWorkQueueMMCSSClass(workqueueid: Int, usageclass: Long, usageclasslength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_rtwqGetWorkQueueMMCSSPriority(workqueueid: Int, priority: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_rtwqGetWorkQueueMMCSSTaskId(workqueueid: Int, taskid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_rtwqInvokeCallback(result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_rtwqJoinWorkQueue(workqueueid: Int, hfile: Long, out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_rtwqLockPlatform(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_rtwqLockSharedWorkQueue(usageclass: Long, basepriority: Int, taskid: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_rtwqLockWorkQueue(workqueueid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_rtwqPutWaitingWorkItem(hevent: Long, lpriority: Int, result: Long, key: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_rtwqPutWorkItem(dwqueue: Int, lpriority: Int, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_rtwqRegisterPlatformEvents(platformevents: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_rtwqRegisterPlatformWithMMCSS(usageclass: Long, taskid: Long, lpriority: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_rtwqRemovePeriodicCallback(dwkey: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_rtwqScheduleWorkItem(result: Long, timeout: Long, key: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_rtwqSetDeadline(workqueueid: Int, deadlineinhns: Long, prequest: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_rtwqSetDeadline2(workqueueid: Int, deadlineinhns: Long, predeadlineinhns: Long, prequest: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_rtwqSetLongRunning(workqueueid: Int, enable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_rtwqShutdown(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_rtwqStartup(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_rtwqUnjoinWorkQueue(workqueueid: Int, hfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_rtwqUnlockPlatform(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_rtwqUnlockWorkQueue(workqueueid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_rtwqUnregisterPlatformEvents(platformevents: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_rtwqUnregisterPlatformFromMMCSS(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setCriticalSectionSpinCount(lpcriticalsection: Long, dwspincount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setEvent(hevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setEventWhenCallbackReturns(pci: Long, evt: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setPriorityClass(hprocess: Long, dwpriorityclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setProcessAffinityMask(hprocess: Long, dwprocessaffinitymask: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setProcessAffinityUpdateMode(hprocess: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setProcessDEPPolicy(dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setProcessDefaultCpuSetMasks(process: Long, cpusetmasks: Long, cpusetmaskcount: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setProcessDefaultCpuSets(process: Long, cpusetids: Long, cpusetidcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setProcessDynamicEHContinuationTargets(process: Long, numberoftargets: Short, targets: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setProcessDynamicEnforcedCetCompatibleRanges(process: Long, numberofranges: Short, ranges: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setProcessInformation(hprocess: Long, processinformationclass: Int, processinformation: Long, processinformationsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setProcessMitigationPolicy(mitigationpolicy: Int, lpbuffer: Long, dwlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setProcessPriorityBoost(hprocess: Long, bdisablepriorityboost: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setProcessRestrictionExemption(fenableexemption: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setProcessShutdownParameters(dwlevel: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setProcessWorkingSetSize(hprocess: Long, dwminimumworkingsetsize: Long, dwmaximumworkingsetsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setProtectedPolicy(policyguid: Long, policyvalue: Long, oldpolicyvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setThreadAffinityMask(hthread: Long, dwthreadaffinitymask: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setThreadDescription(hthread: Long, lpthreaddescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setThreadGroupAffinity(hthread: Long, groupaffinity: Long, previousgroupaffinity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setThreadIdealProcessor(hthread: Long, dwidealprocessor: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setThreadIdealProcessorEx(hthread: Long, lpidealprocessor: Long, lppreviousidealprocessor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setThreadInformation(hthread: Long, threadinformationclass: Int, threadinformation: Long, threadinformationsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setThreadPriority(hthread: Long, npriority: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setThreadPriorityBoost(hthread: Long, bdisablepriorityboost: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setThreadSelectedCpuSetMasks(thread: Long, cpusetmasks: Long, cpusetmaskcount: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setThreadSelectedCpuSets(thread: Long, cpusetids: Long, cpusetidcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setThreadStackGuarantee(stacksizeinbytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setThreadToken(thread: Long, token: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setThreadpoolStackInformation(ptpp: Long, ptpsi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setThreadpoolThreadMaximum(ptpp: Long, cthrdmost: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setThreadpoolThreadMinimum(ptpp: Long, cthrdmic: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setThreadpoolTimer(pti: Long, pftduetime: Long, msperiod: Int, mswindowlength: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setThreadpoolTimerEx(pti: Long, pftduetime: Long, msperiod: Int, mswindowlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setThreadpoolWait(pwa: Long, h: Long, pfttimeout: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setThreadpoolWaitEx(pwa: Long, h: Long, pfttimeout: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setTimerQueueTimer(timerqueue: Long, callback: Long, parameter: Long, duetime: Int, period: Int, preferio: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setUmsThreadInformation(umsthread: Long, umsthreadinfoclass: Int, umsthreadinformation: Long, umsthreadinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setWaitableTimer(htimer: Long, lpduetime: Long, lperiod: Int, pfncompletionroutine: Long, lpargtocompletionroutine: Long, fresume: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_setWaitableTimerEx(htimer: Long, lpduetime: Long, lperiod: Int, pfncompletionroutine: Long, lpargtocompletionroutine: Long, wakecontext: Long, tolerabledelay: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_signalObjectAndWait(hobjecttosignal: Long, hobjecttowaiton: Long, dwmilliseconds: Int, balertable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_sleep(dwmilliseconds: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_sleepConditionVariableCS(conditionvariable: Long, criticalsection: Long, dwmilliseconds: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_sleepConditionVariableSRW(conditionvariable: Long, srwlock: Long, dwmilliseconds: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_sleepEx(dwmilliseconds: Int, balertable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_startThreadpoolIo(pio: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_submitThreadpoolWork(pwk: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_suspendThread(hthread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_switchToFiber(lpfiber: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_switchToThread(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_terminateProcess(hprocess: Long, uexitcode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_terminateThread(hthread: Long, dwexitcode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_tlsAlloc(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_tlsFree(dwtlsindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_tlsGetValue(dwtlsindex: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_tlsSetValue(dwtlsindex: Int, lptlsvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_tryAcquireSRWLockExclusive(srwlock: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_tryAcquireSRWLockShared(srwlock: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_tryEnterCriticalSection(lpcriticalsection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_trySubmitThreadpoolCallback(pfns: Long, pv: Long, pcbe: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_umsThreadYield(schedulerparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_unregisterWait(waithandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_unregisterWaitEx(waithandle: Long, completionevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_updateProcThreadAttribute(lpattributelist: Long, dwflags: Int, attribute: Long, lpvalue: Long, cbsize: Long, lppreviousvalue: Long, lpreturnsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_waitForInputIdle(hprocess: Long, dwmilliseconds: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_waitForMultipleObjects(ncount: Int, lphandles: Long, bwaitall: Int, dwmilliseconds: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_waitForMultipleObjectsEx(ncount: Int, lphandles: Long, bwaitall: Int, dwmilliseconds: Int, balertable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_waitForSingleObject(hhandle: Long, dwmilliseconds: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_waitForSingleObjectEx(hhandle: Long, dwmilliseconds: Int, balertable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_waitForThreadpoolIoCallbacks(pio: Long, fcancelpendingcallbacks: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_waitForThreadpoolTimerCallbacks(pti: Long, fcancelpendingcallbacks: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_waitForThreadpoolWaitCallbacks(pwa: Long, fcancelpendingcallbacks: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_waitForThreadpoolWorkCallbacks(pwk: Long, fcancelpendingcallbacks: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_waitOnAddress(address: Long, compareaddress: Long, addresssize: Long, dwmilliseconds: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_wakeAllConditionVariable(conditionvariable: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_wakeByAddressAll(address: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_wakeByAddressSingle(address: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_wakeConditionVariable(conditionvariable: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_winExec(lpcmdline: Long, ucmdshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_wow64SetThreadDefaultGuestMachine(machine: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_threading_wow64SuspendThread(hthread: Long): Int
}

public actual fun acquireSRWLockExclusive(srwlock: COpaquePointer?) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_acquireSRWLockExclusive((srwlock?.value ?: 0L))
}

public actual fun acquireSRWLockShared(srwlock: COpaquePointer?) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_acquireSRWLockShared((srwlock?.value ?: 0L))
}

public actual fun addIntegrityLabelToBoundaryDescriptor(boundarydescriptor: COpaquePointer?, integritylabel: Psid): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_addIntegrityLabelToBoundaryDescriptor((boundarydescriptor?.value ?: 0L), (integritylabel?.value ?: 0L))

public actual fun addSIDToBoundaryDescriptor(boundarydescriptor: COpaquePointer?, requiredsid: Psid): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_addSIDToBoundaryDescriptor((boundarydescriptor?.value ?: 0L), (requiredsid?.value ?: 0L))

public actual fun attachThreadInput(idattach: UInt, idattachto: UInt, fattach: Bool): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_attachThreadInput(idattach.toInt(), idattachto.toInt(), fattach)

public actual fun avQuerySystemResponsiveness(avrthandle: Handle, systemresponsivenessvalue: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_avQuerySystemResponsiveness((avrthandle?.value ?: 0L), (systemresponsivenessvalue?.value ?: 0L))

public actual fun avRevertMmThreadCharacteristics(avrthandle: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_avRevertMmThreadCharacteristics((avrthandle?.value ?: 0L))

public actual fun avRtCreateThreadOrderingGroup(context: COpaquePointer?, period: COpaquePointer?, threadorderingguid: COpaquePointer?, timeout: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_avRtCreateThreadOrderingGroup((context?.value ?: 0L), (period?.value ?: 0L), (threadorderingguid?.value ?: 0L), (timeout?.value ?: 0L))

public actual fun avRtCreateThreadOrderingGroupExA(context: COpaquePointer?, period: COpaquePointer?, threadorderingguid: COpaquePointer?, timeout: COpaquePointer?, taskname: Pcstr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_avRtCreateThreadOrderingGroupExA((context?.value ?: 0L), (period?.value ?: 0L), (threadorderingguid?.value ?: 0L), (timeout?.value ?: 0L), (taskname?.value ?: 0L))

public actual fun avRtCreateThreadOrderingGroupExW(context: COpaquePointer?, period: COpaquePointer?, threadorderingguid: COpaquePointer?, timeout: COpaquePointer?, taskname: Pcwstr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_avRtCreateThreadOrderingGroupExW((context?.value ?: 0L), (period?.value ?: 0L), (threadorderingguid?.value ?: 0L), (timeout?.value ?: 0L), (taskname?.value ?: 0L))

public actual fun avRtDeleteThreadOrderingGroup(context: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_avRtDeleteThreadOrderingGroup((context?.value ?: 0L))

public actual fun avRtJoinThreadOrderingGroup(context: COpaquePointer?, threadorderingguid: COpaquePointer?, before: Bool): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_avRtJoinThreadOrderingGroup((context?.value ?: 0L), (threadorderingguid?.value ?: 0L), before)

public actual fun avRtLeaveThreadOrderingGroup(context: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_avRtLeaveThreadOrderingGroup((context?.value ?: 0L))

public actual fun avRtWaitOnThreadOrderingGroup(context: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_avRtWaitOnThreadOrderingGroup((context?.value ?: 0L))

public actual fun avSetMmMaxThreadCharacteristicsA(firsttask: Pcstr, secondtask: Pcstr, taskindex: COpaquePointer?): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_avSetMmMaxThreadCharacteristicsA((firsttask?.value ?: 0L), (secondtask?.value ?: 0L), (taskindex?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun avSetMmMaxThreadCharacteristicsW(firsttask: Pcwstr, secondtask: Pcwstr, taskindex: COpaquePointer?): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_avSetMmMaxThreadCharacteristicsW((firsttask?.value ?: 0L), (secondtask?.value ?: 0L), (taskindex?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun avSetMmThreadCharacteristicsA(taskname: Pcstr, taskindex: COpaquePointer?): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_avSetMmThreadCharacteristicsA((taskname?.value ?: 0L), (taskindex?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun avSetMmThreadCharacteristicsW(taskname: Pcwstr, taskindex: COpaquePointer?): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_avSetMmThreadCharacteristicsW((taskname?.value ?: 0L), (taskindex?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun avSetMmThreadPriority(avrthandle: Handle, priority: AvrtPriority): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_avSetMmThreadPriority((avrthandle?.value ?: 0L), priority)

public actual fun callbackMayRunLong(pci: PtpCallbackInstance): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_callbackMayRunLong(pci)

public actual fun cancelThreadpoolIo(pio: PtpIo) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_cancelThreadpoolIo(pio)
}

public actual fun cancelTimerQueueTimer(timerqueue: Handle, timer: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_cancelTimerQueueTimer((timerqueue?.value ?: 0L), (timer?.value ?: 0L))

public actual fun cancelWaitableTimer(htimer: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_cancelWaitableTimer((htimer?.value ?: 0L))

public actual fun changeTimerQueueTimer(timerqueue: Handle, timer: Handle, duetime: UInt, period: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_changeTimerQueueTimer((timerqueue?.value ?: 0L), (timer?.value ?: 0L), duetime.toInt(), period.toInt())

public actual fun closePrivateNamespace(handle: Handle, flags: UInt): Boolean =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_closePrivateNamespace((handle?.value ?: 0L), flags.toInt())

public actual fun closeThreadpool(ptpp: PtpPool) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_closeThreadpool(ptpp.toLong())
}

public actual fun closeThreadpoolCleanupGroup(ptpcg: PtpCleanupGroup) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_closeThreadpoolCleanupGroup(ptpcg.toLong())
}

public actual fun closeThreadpoolCleanupGroupMembers(ptpcg: PtpCleanupGroup, fcancelpendingcallbacks: Bool, pvcleanupcontext: COpaquePointer?) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_closeThreadpoolCleanupGroupMembers(ptpcg.toLong(), fcancelpendingcallbacks, (pvcleanupcontext?.value ?: 0L))
}

public actual fun closeThreadpoolIo(pio: PtpIo) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_closeThreadpoolIo(pio)
}

public actual fun closeThreadpoolTimer(pti: PtpTimer) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_closeThreadpoolTimer(pti)
}

public actual fun closeThreadpoolWait(pwa: PtpWait) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_closeThreadpoolWait(pwa)
}

public actual fun closeThreadpoolWork(pwk: PtpWork) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_closeThreadpoolWork(pwk)
}

public actual fun convertFiberToThread(): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_convertFiberToThread()

public actual fun convertThreadToFiber(lpparameter: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_convertThreadToFiber((lpparameter?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun convertThreadToFiberEx(lpparameter: COpaquePointer?, dwflags: UInt): COpaquePointer? =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_convertThreadToFiberEx((lpparameter?.value ?: 0L), dwflags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createBoundaryDescriptorA(name: Pcstr, flags: UInt): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createBoundaryDescriptorA((name?.value ?: 0L), flags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createBoundaryDescriptorW(name: Pcwstr, flags: UInt): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createBoundaryDescriptorW((name?.value ?: 0L), flags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createEventA(lpeventattributes: COpaquePointer?, bmanualreset: Bool, binitialstate: Bool, lpname: Pcstr): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createEventA((lpeventattributes?.value ?: 0L), bmanualreset, binitialstate, (lpname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createEventExA(lpeventattributes: COpaquePointer?, lpname: Pcstr, dwflags: CreateEvent, dwdesiredaccess: UInt): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createEventExA((lpeventattributes?.value ?: 0L), (lpname?.value ?: 0L), dwflags.toInt(), dwdesiredaccess.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createEventExW(lpeventattributes: COpaquePointer?, lpname: Pcwstr, dwflags: CreateEvent, dwdesiredaccess: UInt): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createEventExW((lpeventattributes?.value ?: 0L), (lpname?.value ?: 0L), dwflags.toInt(), dwdesiredaccess.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createEventW(lpeventattributes: COpaquePointer?, bmanualreset: Bool, binitialstate: Bool, lpname: Pcwstr): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createEventW((lpeventattributes?.value ?: 0L), bmanualreset, binitialstate, (lpname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createFiber(dwstacksize: ULong, lpstartaddress: LpfiberStartRoutine, lpparameter: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createFiber(dwstacksize.toLong(), 0L, (lpparameter?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createFiberEx(dwstackcommitsize: ULong, dwstackreservesize: ULong, dwflags: UInt, lpstartaddress: LpfiberStartRoutine, lpparameter: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createFiberEx(dwstackcommitsize.toLong(), dwstackreservesize.toLong(), dwflags.toInt(), 0L, (lpparameter?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createMutexA(lpmutexattributes: COpaquePointer?, binitialowner: Bool, lpname: Pcstr): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createMutexA((lpmutexattributes?.value ?: 0L), binitialowner, (lpname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createMutexExA(lpmutexattributes: COpaquePointer?, lpname: Pcstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createMutexExA((lpmutexattributes?.value ?: 0L), (lpname?.value ?: 0L), dwflags.toInt(), dwdesiredaccess.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createMutexExW(lpmutexattributes: COpaquePointer?, lpname: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createMutexExW((lpmutexattributes?.value ?: 0L), (lpname?.value ?: 0L), dwflags.toInt(), dwdesiredaccess.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createMutexW(lpmutexattributes: COpaquePointer?, binitialowner: Bool, lpname: Pcwstr): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createMutexW((lpmutexattributes?.value ?: 0L), binitialowner, (lpname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createPrivateNamespaceA(lpprivatenamespaceattributes: COpaquePointer?, lpboundarydescriptor: COpaquePointer?, lpaliasprefix: Pcstr): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createPrivateNamespaceA((lpprivatenamespaceattributes?.value ?: 0L), (lpboundarydescriptor?.value ?: 0L), (lpaliasprefix?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createPrivateNamespaceW(lpprivatenamespaceattributes: COpaquePointer?, lpboundarydescriptor: COpaquePointer?, lpaliasprefix: Pcwstr): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createPrivateNamespaceW((lpprivatenamespaceattributes?.value ?: 0L), (lpboundarydescriptor?.value ?: 0L), (lpaliasprefix?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createProcessA(lpapplicationname: Pcstr, lpcommandline: Pstr, lpprocessattributes: COpaquePointer?, lpthreadattributes: COpaquePointer?, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: COpaquePointer?, lpcurrentdirectory: Pcstr, lpstartupinfo: COpaquePointer?, lpprocessinformation: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createProcessA((lpapplicationname?.value ?: 0L), (lpcommandline?.value ?: 0L), (lpprocessattributes?.value ?: 0L), (lpthreadattributes?.value ?: 0L), binherithandles, dwcreationflags.toInt(), (lpenvironment?.value ?: 0L), (lpcurrentdirectory?.value ?: 0L), (lpstartupinfo?.value ?: 0L), (lpprocessinformation?.value ?: 0L))

public actual fun createProcessAsUserA(htoken: Handle, lpapplicationname: Pcstr, lpcommandline: Pstr, lpprocessattributes: COpaquePointer?, lpthreadattributes: COpaquePointer?, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: COpaquePointer?, lpcurrentdirectory: Pcstr, lpstartupinfo: COpaquePointer?, lpprocessinformation: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createProcessAsUserA((htoken?.value ?: 0L), (lpapplicationname?.value ?: 0L), (lpcommandline?.value ?: 0L), (lpprocessattributes?.value ?: 0L), (lpthreadattributes?.value ?: 0L), binherithandles, dwcreationflags.toInt(), (lpenvironment?.value ?: 0L), (lpcurrentdirectory?.value ?: 0L), (lpstartupinfo?.value ?: 0L), (lpprocessinformation?.value ?: 0L))

public actual fun createProcessAsUserW(htoken: Handle, lpapplicationname: Pcwstr, lpcommandline: Pwstr, lpprocessattributes: COpaquePointer?, lpthreadattributes: COpaquePointer?, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: COpaquePointer?, lpcurrentdirectory: Pcwstr, lpstartupinfo: COpaquePointer?, lpprocessinformation: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createProcessAsUserW((htoken?.value ?: 0L), (lpapplicationname?.value ?: 0L), (lpcommandline?.value ?: 0L), (lpprocessattributes?.value ?: 0L), (lpthreadattributes?.value ?: 0L), binherithandles, dwcreationflags.toInt(), (lpenvironment?.value ?: 0L), (lpcurrentdirectory?.value ?: 0L), (lpstartupinfo?.value ?: 0L), (lpprocessinformation?.value ?: 0L))

public actual fun createProcessW(lpapplicationname: Pcwstr, lpcommandline: Pwstr, lpprocessattributes: COpaquePointer?, lpthreadattributes: COpaquePointer?, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: COpaquePointer?, lpcurrentdirectory: Pcwstr, lpstartupinfo: COpaquePointer?, lpprocessinformation: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createProcessW((lpapplicationname?.value ?: 0L), (lpcommandline?.value ?: 0L), (lpprocessattributes?.value ?: 0L), (lpthreadattributes?.value ?: 0L), binherithandles, dwcreationflags.toInt(), (lpenvironment?.value ?: 0L), (lpcurrentdirectory?.value ?: 0L), (lpstartupinfo?.value ?: 0L), (lpprocessinformation?.value ?: 0L))

public actual fun createProcessWithLogonW(lpusername: Pcwstr, lpdomain: Pcwstr, lppassword: Pcwstr, dwlogonflags: CreateProcessLogonFlags, lpapplicationname: Pcwstr, lpcommandline: Pwstr, dwcreationflags: ProcessCreationFlags, lpenvironment: COpaquePointer?, lpcurrentdirectory: Pcwstr, lpstartupinfo: COpaquePointer?, lpprocessinformation: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createProcessWithLogonW((lpusername?.value ?: 0L), (lpdomain?.value ?: 0L), (lppassword?.value ?: 0L), dwlogonflags.toInt(), (lpapplicationname?.value ?: 0L), (lpcommandline?.value ?: 0L), dwcreationflags.toInt(), (lpenvironment?.value ?: 0L), (lpcurrentdirectory?.value ?: 0L), (lpstartupinfo?.value ?: 0L), (lpprocessinformation?.value ?: 0L))

public actual fun createProcessWithTokenW(htoken: Handle, dwlogonflags: CreateProcessLogonFlags, lpapplicationname: Pcwstr, lpcommandline: Pwstr, dwcreationflags: ProcessCreationFlags, lpenvironment: COpaquePointer?, lpcurrentdirectory: Pcwstr, lpstartupinfo: COpaquePointer?, lpprocessinformation: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createProcessWithTokenW((htoken?.value ?: 0L), dwlogonflags.toInt(), (lpapplicationname?.value ?: 0L), (lpcommandline?.value ?: 0L), dwcreationflags.toInt(), (lpenvironment?.value ?: 0L), (lpcurrentdirectory?.value ?: 0L), (lpstartupinfo?.value ?: 0L), (lpprocessinformation?.value ?: 0L))

public actual fun createRemoteThread(hprocess: Handle, lpthreadattributes: COpaquePointer?, dwstacksize: ULong, lpstartaddress: LpthreadStartRoutine, lpparameter: COpaquePointer?, dwcreationflags: UInt, lpthreadid: COpaquePointer?): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createRemoteThread((hprocess?.value ?: 0L), (lpthreadattributes?.value ?: 0L), dwstacksize.toLong(), 0L, (lpparameter?.value ?: 0L), dwcreationflags.toInt(), (lpthreadid?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createRemoteThreadEx(hprocess: Handle, lpthreadattributes: COpaquePointer?, dwstacksize: ULong, lpstartaddress: LpthreadStartRoutine, lpparameter: COpaquePointer?, dwcreationflags: UInt, lpattributelist: LpprocThreadAttributeList, lpthreadid: COpaquePointer?): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createRemoteThreadEx((hprocess?.value ?: 0L), (lpthreadattributes?.value ?: 0L), dwstacksize.toLong(), 0L, (lpparameter?.value ?: 0L), dwcreationflags.toInt(), (lpattributelist?.value ?: 0L), (lpthreadid?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createSemaphoreA(lpsemaphoreattributes: COpaquePointer?, linitialcount: Int, lmaximumcount: Int, lpname: Pcstr): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createSemaphoreA((lpsemaphoreattributes?.value ?: 0L), linitialcount, lmaximumcount, (lpname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createSemaphoreExA(lpsemaphoreattributes: COpaquePointer?, linitialcount: Int, lmaximumcount: Int, lpname: Pcstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createSemaphoreExA((lpsemaphoreattributes?.value ?: 0L), linitialcount, lmaximumcount, (lpname?.value ?: 0L), dwflags.toInt(), dwdesiredaccess.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createSemaphoreExW(lpsemaphoreattributes: COpaquePointer?, linitialcount: Int, lmaximumcount: Int, lpname: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createSemaphoreExW((lpsemaphoreattributes?.value ?: 0L), linitialcount, lmaximumcount, (lpname?.value ?: 0L), dwflags.toInt(), dwdesiredaccess.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createSemaphoreW(lpsemaphoreattributes: COpaquePointer?, linitialcount: Int, lmaximumcount: Int, lpname: Pcwstr): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createSemaphoreW((lpsemaphoreattributes?.value ?: 0L), linitialcount, lmaximumcount, (lpname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createThread(lpthreadattributes: COpaquePointer?, dwstacksize: ULong, lpstartaddress: LpthreadStartRoutine, lpparameter: COpaquePointer?, dwcreationflags: ThreadCreationFlags, lpthreadid: COpaquePointer?): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createThread((lpthreadattributes?.value ?: 0L), dwstacksize.toLong(), 0L, (lpparameter?.value ?: 0L), dwcreationflags.toInt(), (lpthreadid?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createThreadpool(reserved: COpaquePointer?): PtpPool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createThreadpool((reserved?.value ?: 0L))

public actual fun createThreadpoolCleanupGroup(): PtpCleanupGroup =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createThreadpoolCleanupGroup()

public actual fun createThreadpoolIo(fl: Handle, pfnio: PtpWin32IoCallback, pv: COpaquePointer?, pcbe: COpaquePointer?): PtpIo =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createThreadpoolIo((fl?.value ?: 0L), 0L, (pv?.value ?: 0L), (pcbe?.value ?: 0L))

public actual fun createThreadpoolTimer(pfnti: PtpTimerCallback, pv: COpaquePointer?, pcbe: COpaquePointer?): PtpTimer =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createThreadpoolTimer(0L, (pv?.value ?: 0L), (pcbe?.value ?: 0L))

public actual fun createThreadpoolWait(pfnwa: PtpWaitCallback, pv: COpaquePointer?, pcbe: COpaquePointer?): PtpWait =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createThreadpoolWait(0L, (pv?.value ?: 0L), (pcbe?.value ?: 0L))

public actual fun createThreadpoolWork(pfnwk: PtpWorkCallback, pv: COpaquePointer?, pcbe: COpaquePointer?): PtpWork =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createThreadpoolWork(0L, (pv?.value ?: 0L), (pcbe?.value ?: 0L))

public actual fun createTimerQueue(): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createTimerQueue().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createTimerQueueTimer(phnewtimer: COpaquePointer?, timerqueue: Handle, callback: Waitortimercallback, parameter: COpaquePointer?, duetime: UInt, period: UInt, flags: WorkerThreadFlags): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createTimerQueueTimer((phnewtimer?.value ?: 0L), (timerqueue?.value ?: 0L), 0L, (parameter?.value ?: 0L), duetime.toInt(), period.toInt(), flags.toInt())

public actual fun createUmsCompletionList(umscompletionlist: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createUmsCompletionList((umscompletionlist?.value ?: 0L))

public actual fun createUmsThreadContext(lpumsthread: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createUmsThreadContext((lpumsthread?.value ?: 0L))

public actual fun createWaitableTimerA(lptimerattributes: COpaquePointer?, bmanualreset: Bool, lptimername: Pcstr): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createWaitableTimerA((lptimerattributes?.value ?: 0L), bmanualreset, (lptimername?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createWaitableTimerExA(lptimerattributes: COpaquePointer?, lptimername: Pcstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createWaitableTimerExA((lptimerattributes?.value ?: 0L), (lptimername?.value ?: 0L), dwflags.toInt(), dwdesiredaccess.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createWaitableTimerExW(lptimerattributes: COpaquePointer?, lptimername: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createWaitableTimerExW((lptimerattributes?.value ?: 0L), (lptimername?.value ?: 0L), dwflags.toInt(), dwdesiredaccess.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createWaitableTimerW(lptimerattributes: COpaquePointer?, bmanualreset: Bool, lptimername: Pcwstr): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_createWaitableTimerW((lptimerattributes?.value ?: 0L), bmanualreset, (lptimername?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun deleteBoundaryDescriptor(boundarydescriptor: Handle) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_deleteBoundaryDescriptor((boundarydescriptor?.value ?: 0L))
}

public actual fun deleteCriticalSection(lpcriticalsection: COpaquePointer?) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_deleteCriticalSection((lpcriticalsection?.value ?: 0L))
}

public actual fun deleteFiber(lpfiber: COpaquePointer?) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_deleteFiber((lpfiber?.value ?: 0L))
}

public actual fun deleteProcThreadAttributeList(lpattributelist: LpprocThreadAttributeList) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_deleteProcThreadAttributeList((lpattributelist?.value ?: 0L))
}

public actual fun deleteSynchronizationBarrier(lpbarrier: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_deleteSynchronizationBarrier((lpbarrier?.value ?: 0L))

public actual fun deleteTimerQueue(timerqueue: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_deleteTimerQueue((timerqueue?.value ?: 0L))

public actual fun deleteTimerQueueEx(timerqueue: Handle, completionevent: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_deleteTimerQueueEx((timerqueue?.value ?: 0L), (completionevent?.value ?: 0L))

public actual fun deleteTimerQueueTimer(timerqueue: Handle, timer: Handle, completionevent: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_deleteTimerQueueTimer((timerqueue?.value ?: 0L), (timer?.value ?: 0L), (completionevent?.value ?: 0L))

public actual fun deleteUmsCompletionList(umscompletionlist: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_deleteUmsCompletionList((umscompletionlist?.value ?: 0L))

public actual fun deleteUmsThreadContext(umsthread: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_deleteUmsThreadContext((umsthread?.value ?: 0L))

public actual fun dequeueUmsCompletionListItems(umscompletionlist: COpaquePointer?, waittimeout: UInt, umsthreadlist: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_dequeueUmsCompletionListItems((umscompletionlist?.value ?: 0L), waittimeout.toInt(), (umsthreadlist?.value ?: 0L))

public actual fun disassociateCurrentThreadFromCallback(pci: PtpCallbackInstance) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_disassociateCurrentThreadFromCallback(pci)
}

public actual fun enterCriticalSection(lpcriticalsection: COpaquePointer?) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_enterCriticalSection((lpcriticalsection?.value ?: 0L))
}

public actual fun enterSynchronizationBarrier(lpbarrier: COpaquePointer?, dwflags: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_enterSynchronizationBarrier((lpbarrier?.value ?: 0L), dwflags.toInt())

public actual fun enterUmsSchedulingMode(schedulerstartupinfo: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_enterUmsSchedulingMode((schedulerstartupinfo?.value ?: 0L))

public actual fun executeUmsThread(umsthread: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_executeUmsThread((umsthread?.value ?: 0L))

public actual fun exitProcess(uexitcode: UInt): Nothing {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_exitProcess(uexitcode.toInt())
    error("Unreachable noreturn C function exitProcess")
}

public actual fun exitThread(dwexitcode: UInt): Nothing {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_exitThread(dwexitcode.toInt())
    error("Unreachable noreturn C function exitThread")
}

public actual fun flsAlloc(lpcallback: PflsCallbackFunction): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_flsAlloc(0L).toUInt()

public actual fun flsFree(dwflsindex: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_flsFree(dwflsindex.toInt())

public actual fun flsGetValue(dwflsindex: UInt): COpaquePointer? =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_flsGetValue(dwflsindex.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun flsSetValue(dwflsindex: UInt, lpflsdata: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_flsSetValue(dwflsindex.toInt(), (lpflsdata?.value ?: 0L))

public actual fun flushProcessWriteBuffers() {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_flushProcessWriteBuffers()
}

public actual fun freeLibraryWhenCallbackReturns(pci: PtpCallbackInstance, mod: Hmodule) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_freeLibraryWhenCallbackReturns(pci, (mod?.value ?: 0L))
}

public actual fun getActiveProcessorCount(groupnumber: UShort): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getActiveProcessorCount(groupnumber.toShort()).toUInt()

public actual fun getActiveProcessorGroupCount(): UShort =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getActiveProcessorGroupCount().toUShort()

public actual fun getCurrentProcess(): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getCurrentProcess().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getCurrentProcessId(): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getCurrentProcessId().toUInt()

public actual fun getCurrentProcessorNumber(): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getCurrentProcessorNumber().toUInt()

public actual fun getCurrentProcessorNumberEx(procnumber: COpaquePointer?) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getCurrentProcessorNumberEx((procnumber?.value ?: 0L))
}

public actual fun getCurrentThread(): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getCurrentThread().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getCurrentThreadId(): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getCurrentThreadId().toUInt()

public actual fun getCurrentThreadStackLimits(lowlimit: COpaquePointer?, highlimit: COpaquePointer?) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getCurrentThreadStackLimits((lowlimit?.value ?: 0L), (highlimit?.value ?: 0L))
}

public actual fun getCurrentUmsThread(): COpaquePointer? =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getCurrentUmsThread().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getExitCodeProcess(hprocess: Handle, lpexitcode: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getExitCodeProcess((hprocess?.value ?: 0L), (lpexitcode?.value ?: 0L))

public actual fun getExitCodeThread(hthread: Handle, lpexitcode: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getExitCodeThread((hthread?.value ?: 0L), (lpexitcode?.value ?: 0L))

public actual fun getGuiResources(hprocess: Handle, uiflags: GetGuiResourcesFlags): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getGuiResources((hprocess?.value ?: 0L), uiflags.toInt()).toUInt()

public actual fun getMachineTypeAttributes(machine: UShort, machinetypeattributes: COpaquePointer?): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getMachineTypeAttributes(machine.toShort(), (machinetypeattributes?.value ?: 0L))

public actual fun getMaximumProcessorCount(groupnumber: UShort): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getMaximumProcessorCount(groupnumber.toShort()).toUInt()

public actual fun getMaximumProcessorGroupCount(): UShort =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getMaximumProcessorGroupCount().toUShort()

public actual fun getNextUmsListItem(umscontext: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getNextUmsListItem((umscontext?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getNumaAvailableMemoryNode(node: UByte, availablebytes: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getNumaAvailableMemoryNode(node.toByte(), (availablebytes?.value ?: 0L))

public actual fun getNumaAvailableMemoryNodeEx(node: UShort, availablebytes: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getNumaAvailableMemoryNodeEx(node.toShort(), (availablebytes?.value ?: 0L))

public actual fun getNumaHighestNodeNumber(highestnodenumber: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getNumaHighestNodeNumber((highestnodenumber?.value ?: 0L))

public actual fun getNumaNodeNumberFromHandle(hfile: Handle, nodenumber: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getNumaNodeNumberFromHandle((hfile?.value ?: 0L), (nodenumber?.value ?: 0L))

public actual fun getNumaNodeProcessorMask(node: UByte, processormask: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getNumaNodeProcessorMask(node.toByte(), (processormask?.value ?: 0L))

public actual fun getNumaNodeProcessorMask2(nodenumber: UShort, processormasks: COpaquePointer?, processormaskcount: UShort, requiredmaskcount: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getNumaNodeProcessorMask2(nodenumber.toShort(), (processormasks?.value ?: 0L), processormaskcount.toShort(), (requiredmaskcount?.value ?: 0L))

public actual fun getNumaNodeProcessorMaskEx(node: UShort, processormask: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getNumaNodeProcessorMaskEx(node.toShort(), (processormask?.value ?: 0L))

public actual fun getNumaProcessorNode(processor: UByte, nodenumber: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getNumaProcessorNode(processor.toByte(), (nodenumber?.value ?: 0L))

public actual fun getNumaProcessorNodeEx(processor: COpaquePointer?, nodenumber: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getNumaProcessorNodeEx((processor?.value ?: 0L), (nodenumber?.value ?: 0L))

public actual fun getNumaProximityNode(proximityid: UInt, nodenumber: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getNumaProximityNode(proximityid.toInt(), (nodenumber?.value ?: 0L))

public actual fun getNumaProximityNodeEx(proximityid: UInt, nodenumber: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getNumaProximityNodeEx(proximityid.toInt(), (nodenumber?.value ?: 0L))

public actual fun getPriorityClass(hprocess: Handle): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getPriorityClass((hprocess?.value ?: 0L)).toUInt()

public actual fun getProcessAffinityMask(hprocess: Handle, lpprocessaffinitymask: COpaquePointer?, lpsystemaffinitymask: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getProcessAffinityMask((hprocess?.value ?: 0L), (lpprocessaffinitymask?.value ?: 0L), (lpsystemaffinitymask?.value ?: 0L))

public actual fun getProcessDEPPolicy(hprocess: Handle, lpflags: COpaquePointer?, lppermanent: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getProcessDEPPolicy((hprocess?.value ?: 0L), (lpflags?.value ?: 0L), (lppermanent?.value ?: 0L))

public actual fun getProcessDefaultCpuSetMasks(process: Handle, cpusetmasks: COpaquePointer?, cpusetmaskcount: UShort, requiredmaskcount: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getProcessDefaultCpuSetMasks((process?.value ?: 0L), (cpusetmasks?.value ?: 0L), cpusetmaskcount.toShort(), (requiredmaskcount?.value ?: 0L))

public actual fun getProcessDefaultCpuSets(process: Handle, cpusetids: COpaquePointer?, cpusetidcount: UInt, requiredidcount: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getProcessDefaultCpuSets((process?.value ?: 0L), (cpusetids?.value ?: 0L), cpusetidcount.toInt(), (requiredidcount?.value ?: 0L))

public actual fun getProcessGroupAffinity(hprocess: Handle, groupcount: COpaquePointer?, grouparray: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getProcessGroupAffinity((hprocess?.value ?: 0L), (groupcount?.value ?: 0L), (grouparray?.value ?: 0L))

public actual fun getProcessHandleCount(hprocess: Handle, pdwhandlecount: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getProcessHandleCount((hprocess?.value ?: 0L), (pdwhandlecount?.value ?: 0L))

public actual fun getProcessHandleFromHwnd(hwnd: Hwnd): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getProcessHandleFromHwnd((hwnd?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getProcessId(process: Handle): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getProcessId((process?.value ?: 0L)).toUInt()

public actual fun getProcessIdOfThread(thread: Handle): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getProcessIdOfThread((thread?.value ?: 0L)).toUInt()

public actual fun getProcessInformation(hprocess: Handle, processinformationclass: ProcessInformationClass, processinformation: COpaquePointer?, processinformationsize: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getProcessInformation((hprocess?.value ?: 0L), processinformationclass, (processinformation?.value ?: 0L), processinformationsize.toInt())

public actual fun getProcessIoCounters(hprocess: Handle, lpiocounters: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getProcessIoCounters((hprocess?.value ?: 0L), (lpiocounters?.value ?: 0L))

public actual fun getProcessMitigationPolicy(hprocess: Handle, mitigationpolicy: ProcessMitigationPolicy, lpbuffer: COpaquePointer?, dwlength: ULong): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getProcessMitigationPolicy((hprocess?.value ?: 0L), mitigationpolicy, (lpbuffer?.value ?: 0L), dwlength.toLong())

public actual fun getProcessPriorityBoost(hprocess: Handle, pdisablepriorityboost: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getProcessPriorityBoost((hprocess?.value ?: 0L), (pdisablepriorityboost?.value ?: 0L))

public actual fun getProcessShutdownParameters(lpdwlevel: COpaquePointer?, lpdwflags: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getProcessShutdownParameters((lpdwlevel?.value ?: 0L), (lpdwflags?.value ?: 0L))

public actual fun getProcessTimes(hprocess: Handle, lpcreationtime: COpaquePointer?, lpexittime: COpaquePointer?, lpkerneltime: COpaquePointer?, lpusertime: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getProcessTimes((hprocess?.value ?: 0L), (lpcreationtime?.value ?: 0L), (lpexittime?.value ?: 0L), (lpkerneltime?.value ?: 0L), (lpusertime?.value ?: 0L))

public actual fun getProcessVersion(processid: UInt): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getProcessVersion(processid.toInt()).toUInt()

public actual fun getProcessWorkingSetSize(hprocess: Handle, lpminimumworkingsetsize: COpaquePointer?, lpmaximumworkingsetsize: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getProcessWorkingSetSize((hprocess?.value ?: 0L), (lpminimumworkingsetsize?.value ?: 0L), (lpmaximumworkingsetsize?.value ?: 0L))

public actual fun getStartupInfoA(lpstartupinfo: COpaquePointer?) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getStartupInfoA((lpstartupinfo?.value ?: 0L))
}

public actual fun getStartupInfoW(lpstartupinfo: COpaquePointer?) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getStartupInfoW((lpstartupinfo?.value ?: 0L))
}

public actual fun getSystemTimes(lpidletime: COpaquePointer?, lpkerneltime: COpaquePointer?, lpusertime: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getSystemTimes((lpidletime?.value ?: 0L), (lpkerneltime?.value ?: 0L), (lpusertime?.value ?: 0L))

public actual fun getThreadDescription(hthread: Handle, ppszthreaddescription: COpaquePointer?): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getThreadDescription((hthread?.value ?: 0L), (ppszthreaddescription?.value ?: 0L))

public actual fun getThreadGroupAffinity(hthread: Handle, groupaffinity: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getThreadGroupAffinity((hthread?.value ?: 0L), (groupaffinity?.value ?: 0L))

public actual fun getThreadIOPendingFlag(hthread: Handle, lpioispending: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getThreadIOPendingFlag((hthread?.value ?: 0L), (lpioispending?.value ?: 0L))

public actual fun getThreadId(thread: Handle): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getThreadId((thread?.value ?: 0L)).toUInt()

public actual fun getThreadIdealProcessorEx(hthread: Handle, lpidealprocessor: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getThreadIdealProcessorEx((hthread?.value ?: 0L), (lpidealprocessor?.value ?: 0L))

public actual fun getThreadInformation(hthread: Handle, threadinformationclass: ThreadInformationClass, threadinformation: COpaquePointer?, threadinformationsize: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getThreadInformation((hthread?.value ?: 0L), threadinformationclass, (threadinformation?.value ?: 0L), threadinformationsize.toInt())

public actual fun getThreadPriority(hthread: Handle): Int =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getThreadPriority((hthread?.value ?: 0L))

public actual fun getThreadPriorityBoost(hthread: Handle, pdisablepriorityboost: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getThreadPriorityBoost((hthread?.value ?: 0L), (pdisablepriorityboost?.value ?: 0L))

public actual fun getThreadSelectedCpuSetMasks(thread: Handle, cpusetmasks: COpaquePointer?, cpusetmaskcount: UShort, requiredmaskcount: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getThreadSelectedCpuSetMasks((thread?.value ?: 0L), (cpusetmasks?.value ?: 0L), cpusetmaskcount.toShort(), (requiredmaskcount?.value ?: 0L))

public actual fun getThreadSelectedCpuSets(thread: Handle, cpusetids: COpaquePointer?, cpusetidcount: UInt, requiredidcount: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getThreadSelectedCpuSets((thread?.value ?: 0L), (cpusetids?.value ?: 0L), cpusetidcount.toInt(), (requiredidcount?.value ?: 0L))

public actual fun getThreadTimes(hthread: Handle, lpcreationtime: COpaquePointer?, lpexittime: COpaquePointer?, lpkerneltime: COpaquePointer?, lpusertime: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getThreadTimes((hthread?.value ?: 0L), (lpcreationtime?.value ?: 0L), (lpexittime?.value ?: 0L), (lpkerneltime?.value ?: 0L), (lpusertime?.value ?: 0L))

public actual fun getUmsCompletionListEvent(umscompletionlist: COpaquePointer?, umscompletionevent: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getUmsCompletionListEvent((umscompletionlist?.value ?: 0L), (umscompletionevent?.value ?: 0L))

public actual fun getUmsSystemThreadInformation(threadhandle: Handle, systemthreadinfo: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_getUmsSystemThreadInformation((threadhandle?.value ?: 0L), (systemthreadinfo?.value ?: 0L))

public actual fun initOnceBeginInitialize(lpinitonce: COpaquePointer?, dwflags: UInt, fpending: COpaquePointer?, lpcontext: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_initOnceBeginInitialize((lpinitonce?.value ?: 0L), dwflags.toInt(), (fpending?.value ?: 0L), (lpcontext?.value ?: 0L))

public actual fun initOnceComplete(lpinitonce: COpaquePointer?, dwflags: UInt, lpcontext: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_initOnceComplete((lpinitonce?.value ?: 0L), dwflags.toInt(), (lpcontext?.value ?: 0L))

public actual fun initOnceExecuteOnce(initonce: COpaquePointer?, initfn: PinitOnceFn, parameter: COpaquePointer?, context: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_initOnceExecuteOnce((initonce?.value ?: 0L), 0L, (parameter?.value ?: 0L), (context?.value ?: 0L))

public actual fun initOnceInitialize(initonce: COpaquePointer?) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_initOnceInitialize((initonce?.value ?: 0L))
}

public actual fun initializeConditionVariable(conditionvariable: COpaquePointer?) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_initializeConditionVariable((conditionvariable?.value ?: 0L))
}

public actual fun initializeCriticalSection(lpcriticalsection: COpaquePointer?) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_initializeCriticalSection((lpcriticalsection?.value ?: 0L))
}

public actual fun initializeCriticalSectionAndSpinCount(lpcriticalsection: COpaquePointer?, dwspincount: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_initializeCriticalSectionAndSpinCount((lpcriticalsection?.value ?: 0L), dwspincount.toInt())

public actual fun initializeCriticalSectionEx(lpcriticalsection: COpaquePointer?, dwspincount: UInt, flags: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_initializeCriticalSectionEx((lpcriticalsection?.value ?: 0L), dwspincount.toInt(), flags.toInt())

public actual fun initializeProcThreadAttributeList(lpattributelist: LpprocThreadAttributeList, dwattributecount: UInt, dwflags: UInt, lpsize: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_initializeProcThreadAttributeList((lpattributelist?.value ?: 0L), dwattributecount.toInt(), dwflags.toInt(), (lpsize?.value ?: 0L))

public actual fun initializeSListHead(listhead: COpaquePointer?) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_initializeSListHead((listhead?.value ?: 0L))
}

public actual fun initializeSRWLock(srwlock: COpaquePointer?) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_initializeSRWLock((srwlock?.value ?: 0L))
}

public actual fun initializeSynchronizationBarrier(lpbarrier: COpaquePointer?, ltotalthreads: Int, lspincount: Int): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_initializeSynchronizationBarrier((lpbarrier?.value ?: 0L), ltotalthreads, lspincount)

public actual fun interlockedFlushSList(listhead: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_interlockedFlushSList((listhead?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun interlockedPopEntrySList(listhead: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_interlockedPopEntrySList((listhead?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun interlockedPushEntrySList(listhead: COpaquePointer?, listentry: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_interlockedPushEntrySList((listhead?.value ?: 0L), (listentry?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun interlockedPushListSListEx(listhead: COpaquePointer?, list: COpaquePointer?, listend: COpaquePointer?, count: UInt): COpaquePointer? =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_interlockedPushListSListEx((listhead?.value ?: 0L), (list?.value ?: 0L), (listend?.value ?: 0L), count.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun isImmersiveProcess(hprocess: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_isImmersiveProcess((hprocess?.value ?: 0L))

public actual fun isProcessCritical(hprocess: Handle, critical: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_isProcessCritical((hprocess?.value ?: 0L), (critical?.value ?: 0L))

public actual fun isProcessorFeaturePresent(processorfeature: ProcessorFeatureId): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_isProcessorFeaturePresent(processorfeature.toInt())

public actual fun isThreadAFiber(): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_isThreadAFiber()

public actual fun isThreadpoolTimerSet(pti: PtpTimer): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_isThreadpoolTimerSet(pti)

public actual fun isWow64Process(hprocess: Handle, wow64process: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_isWow64Process((hprocess?.value ?: 0L), (wow64process?.value ?: 0L))

public actual fun isWow64Process2(hprocess: Handle, pprocessmachine: COpaquePointer?, pnativemachine: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_isWow64Process2((hprocess?.value ?: 0L), (pprocessmachine?.value ?: 0L), (pnativemachine?.value ?: 0L))

public actual fun leaveCriticalSection(lpcriticalsection: COpaquePointer?) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_leaveCriticalSection((lpcriticalsection?.value ?: 0L))
}

public actual fun leaveCriticalSectionWhenCallbackReturns(pci: PtpCallbackInstance, pcs: COpaquePointer?) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_leaveCriticalSectionWhenCallbackReturns(pci, (pcs?.value ?: 0L))
}

public actual fun openEventA(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcstr): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_openEventA(dwdesiredaccess.toInt(), binherithandle, (lpname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openEventW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcwstr): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_openEventW(dwdesiredaccess.toInt(), binherithandle, (lpname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openMutexW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcwstr): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_openMutexW(dwdesiredaccess.toInt(), binherithandle, (lpname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openPrivateNamespaceA(lpboundarydescriptor: COpaquePointer?, lpaliasprefix: Pcstr): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_openPrivateNamespaceA((lpboundarydescriptor?.value ?: 0L), (lpaliasprefix?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openPrivateNamespaceW(lpboundarydescriptor: COpaquePointer?, lpaliasprefix: Pcwstr): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_openPrivateNamespaceW((lpboundarydescriptor?.value ?: 0L), (lpaliasprefix?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openProcess(dwdesiredaccess: ProcessAccessRights, binherithandle: Bool, dwprocessid: UInt): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_openProcess(dwdesiredaccess.toInt(), binherithandle, dwprocessid.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openProcessToken(processhandle: Handle, desiredaccess: TokenAccessMask, tokenhandle: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_openProcessToken((processhandle?.value ?: 0L), desiredaccess.toInt(), (tokenhandle?.value ?: 0L))

public actual fun openSemaphoreW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcwstr): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_openSemaphoreW(dwdesiredaccess.toInt(), binherithandle, (lpname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openThread(dwdesiredaccess: ThreadAccessRights, binherithandle: Bool, dwthreadid: UInt): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_openThread(dwdesiredaccess.toInt(), binherithandle, dwthreadid.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openThreadToken(threadhandle: Handle, desiredaccess: TokenAccessMask, openasself: Bool, tokenhandle: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_openThreadToken((threadhandle?.value ?: 0L), desiredaccess.toInt(), openasself, (tokenhandle?.value ?: 0L))

public actual fun openWaitableTimerA(dwdesiredaccess: UInt, binherithandle: Bool, lptimername: Pcstr): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_openWaitableTimerA(dwdesiredaccess.toInt(), binherithandle, (lptimername?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openWaitableTimerW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lptimername: Pcwstr): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_openWaitableTimerW(dwdesiredaccess.toInt(), binherithandle, (lptimername?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pulseEvent(hevent: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_pulseEvent((hevent?.value ?: 0L))

public actual fun queryDepthSList(listhead: COpaquePointer?): UShort =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_queryDepthSList((listhead?.value ?: 0L)).toUShort()

public actual fun queryFullProcessImageNameA(hprocess: Handle, dwflags: ProcessNameFormat, lpexename: Pstr, lpdwsize: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_queryFullProcessImageNameA((hprocess?.value ?: 0L), dwflags.toInt(), (lpexename?.value ?: 0L), (lpdwsize?.value ?: 0L))

public actual fun queryFullProcessImageNameW(hprocess: Handle, dwflags: ProcessNameFormat, lpexename: Pwstr, lpdwsize: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_queryFullProcessImageNameW((hprocess?.value ?: 0L), dwflags.toInt(), (lpexename?.value ?: 0L), (lpdwsize?.value ?: 0L))

public actual fun queryProcessAffinityUpdateMode(hprocess: Handle, lpdwflags: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_queryProcessAffinityUpdateMode((hprocess?.value ?: 0L), (lpdwflags?.value ?: 0L))

public actual fun queryProtectedPolicy(policyguid: COpaquePointer?, policyvalue: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_queryProtectedPolicy((policyguid?.value ?: 0L), (policyvalue?.value ?: 0L))

public actual fun queryThreadpoolStackInformation(ptpp: PtpPool, ptpsi: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_queryThreadpoolStackInformation(ptpp.toLong(), (ptpsi?.value ?: 0L))

public actual fun queryUmsThreadInformation(umsthread: COpaquePointer?, umsthreadinfoclass: UmsThreadInfoClass, umsthreadinformation: COpaquePointer?, umsthreadinformationlength: UInt, returnlength: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_queryUmsThreadInformation((umsthread?.value ?: 0L), umsthreadinfoclass, (umsthreadinformation?.value ?: 0L), umsthreadinformationlength.toInt(), (returnlength?.value ?: 0L))

public actual fun queueUserAPC(pfnapc: Papcfunc, hthread: Handle, dwdata: ULong): UInt =
    0u

public actual fun queueUserAPC2(apcroutine: Papcfunc, thread: Handle, data: ULong, flags: QueueUserApcFlags): Bool =
    0

public actual fun queueUserWorkItem(function: LpthreadStartRoutine, context: COpaquePointer?, flags: WorkerThreadFlags): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_queueUserWorkItem(0L, (context?.value ?: 0L), flags.toInt())

public actual fun registerWaitForSingleObject(phnewwaitobject: COpaquePointer?, hobject: Handle, callback: Waitortimercallback, context: COpaquePointer?, dwmilliseconds: UInt, dwflags: WorkerThreadFlags): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_registerWaitForSingleObject((phnewwaitobject?.value ?: 0L), (hobject?.value ?: 0L), 0L, (context?.value ?: 0L), dwmilliseconds.toInt(), dwflags.toInt())

public actual fun releaseMutex(hmutex: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_releaseMutex((hmutex?.value ?: 0L))

public actual fun releaseMutexWhenCallbackReturns(pci: PtpCallbackInstance, mut: Handle) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_releaseMutexWhenCallbackReturns(pci, (mut?.value ?: 0L))
}

public actual fun releaseSRWLockExclusive(srwlock: COpaquePointer?) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_releaseSRWLockExclusive((srwlock?.value ?: 0L))
}

public actual fun releaseSRWLockShared(srwlock: COpaquePointer?) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_releaseSRWLockShared((srwlock?.value ?: 0L))
}

public actual fun releaseSemaphore(hsemaphore: Handle, lreleasecount: Int, lppreviouscount: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_releaseSemaphore((hsemaphore?.value ?: 0L), lreleasecount, (lppreviouscount?.value ?: 0L))

public actual fun releaseSemaphoreWhenCallbackReturns(pci: PtpCallbackInstance, sem: Handle, crel: UInt) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_releaseSemaphoreWhenCallbackReturns(pci, (sem?.value ?: 0L), crel.toInt())
}

public actual fun resetEvent(hevent: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_resetEvent((hevent?.value ?: 0L))

public actual fun resumeThread(hthread: Handle): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_resumeThread((hthread?.value ?: 0L)).toUInt()

public actual fun rtwqAddPeriodicCallback(callback: Rtwqperiodiccallback, context: COpaquePointer?, key: COpaquePointer?): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_rtwqAddPeriodicCallback(0L, (context?.value ?: 0L), (key?.value ?: 0L))

public actual fun rtwqAllocateSerialWorkQueue(workqueueidin: UInt, workqueueidout: COpaquePointer?): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_rtwqAllocateSerialWorkQueue(workqueueidin.toInt(), (workqueueidout?.value ?: 0L))

public actual fun rtwqAllocateWorkQueue(workqueuetype: RtwqWorkqueueType, workqueueid: COpaquePointer?): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_rtwqAllocateWorkQueue(workqueuetype, (workqueueid?.value ?: 0L))

public actual fun rtwqBeginRegisterWorkQueueWithMMCSS(workqueueid: UInt, usageclass: Pcwstr, dwtaskid: UInt, lpriority: Int, donecallback: COpaquePointer?, donestate: COpaquePointer?): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_rtwqBeginRegisterWorkQueueWithMMCSS(workqueueid.toInt(), (usageclass?.value ?: 0L), dwtaskid.toInt(), lpriority, (donecallback?.value ?: 0L), (donestate?.value ?: 0L))

public actual fun rtwqBeginUnregisterWorkQueueWithMMCSS(workqueueid: UInt, donecallback: COpaquePointer?, donestate: COpaquePointer?): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_rtwqBeginUnregisterWorkQueueWithMMCSS(workqueueid.toInt(), (donecallback?.value ?: 0L), (donestate?.value ?: 0L))

public actual fun rtwqCancelDeadline(prequest: Handle): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_rtwqCancelDeadline((prequest?.value ?: 0L))

public actual fun rtwqCancelWorkItem(key: ULong): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_rtwqCancelWorkItem(key.toLong())

public actual fun rtwqCreateAsyncResult(appobject: COpaquePointer?, callback: COpaquePointer?, appstate: COpaquePointer?, asyncresult: COpaquePointer?): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_rtwqCreateAsyncResult((appobject?.value ?: 0L), (callback?.value ?: 0L), (appstate?.value ?: 0L), (asyncresult?.value ?: 0L))

public actual fun rtwqEndRegisterWorkQueueWithMMCSS(result: COpaquePointer?, taskid: COpaquePointer?): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_rtwqEndRegisterWorkQueueWithMMCSS((result?.value ?: 0L), (taskid?.value ?: 0L))

public actual fun rtwqGetWorkQueueMMCSSClass(workqueueid: UInt, usageclass: Pwstr, usageclasslength: COpaquePointer?): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_rtwqGetWorkQueueMMCSSClass(workqueueid.toInt(), (usageclass?.value ?: 0L), (usageclasslength?.value ?: 0L))

public actual fun rtwqGetWorkQueueMMCSSPriority(workqueueid: UInt, priority: COpaquePointer?): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_rtwqGetWorkQueueMMCSSPriority(workqueueid.toInt(), (priority?.value ?: 0L))

public actual fun rtwqGetWorkQueueMMCSSTaskId(workqueueid: UInt, taskid: COpaquePointer?): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_rtwqGetWorkQueueMMCSSTaskId(workqueueid.toInt(), (taskid?.value ?: 0L))

public actual fun rtwqInvokeCallback(result: COpaquePointer?): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_rtwqInvokeCallback((result?.value ?: 0L))

public actual fun rtwqJoinWorkQueue(workqueueid: UInt, hfile: Handle, out: COpaquePointer?): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_rtwqJoinWorkQueue(workqueueid.toInt(), (hfile?.value ?: 0L), (out?.value ?: 0L))

public actual fun rtwqLockPlatform(): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_rtwqLockPlatform()

public actual fun rtwqLockSharedWorkQueue(usageclass: Pcwstr, basepriority: Int, taskid: COpaquePointer?, id: COpaquePointer?): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_rtwqLockSharedWorkQueue((usageclass?.value ?: 0L), basepriority, (taskid?.value ?: 0L), (id?.value ?: 0L))

public actual fun rtwqLockWorkQueue(workqueueid: UInt): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_rtwqLockWorkQueue(workqueueid.toInt())

public actual fun rtwqPutWaitingWorkItem(hevent: Handle, lpriority: Int, result: COpaquePointer?, key: COpaquePointer?): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_rtwqPutWaitingWorkItem((hevent?.value ?: 0L), lpriority, (result?.value ?: 0L), (key?.value ?: 0L))

public actual fun rtwqPutWorkItem(dwqueue: UInt, lpriority: Int, result: COpaquePointer?): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_rtwqPutWorkItem(dwqueue.toInt(), lpriority, (result?.value ?: 0L))

public actual fun rtwqRegisterPlatformEvents(platformevents: COpaquePointer?): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_rtwqRegisterPlatformEvents((platformevents?.value ?: 0L))

public actual fun rtwqRegisterPlatformWithMMCSS(usageclass: Pcwstr, taskid: COpaquePointer?, lpriority: Int): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_rtwqRegisterPlatformWithMMCSS((usageclass?.value ?: 0L), (taskid?.value ?: 0L), lpriority)

public actual fun rtwqRemovePeriodicCallback(dwkey: UInt): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_rtwqRemovePeriodicCallback(dwkey.toInt())

public actual fun rtwqScheduleWorkItem(result: COpaquePointer?, timeout: Long, key: COpaquePointer?): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_rtwqScheduleWorkItem((result?.value ?: 0L), timeout, (key?.value ?: 0L))

public actual fun rtwqSetDeadline(workqueueid: UInt, deadlineinhns: Long, prequest: COpaquePointer?): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_rtwqSetDeadline(workqueueid.toInt(), deadlineinhns, (prequest?.value ?: 0L))

public actual fun rtwqSetDeadline2(workqueueid: UInt, deadlineinhns: Long, predeadlineinhns: Long, prequest: COpaquePointer?): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_rtwqSetDeadline2(workqueueid.toInt(), deadlineinhns, predeadlineinhns, (prequest?.value ?: 0L))

public actual fun rtwqSetLongRunning(workqueueid: UInt, enable: Bool): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_rtwqSetLongRunning(workqueueid.toInt(), enable)

public actual fun rtwqShutdown(): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_rtwqShutdown()

public actual fun rtwqStartup(): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_rtwqStartup()

public actual fun rtwqUnjoinWorkQueue(workqueueid: UInt, hfile: Handle): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_rtwqUnjoinWorkQueue(workqueueid.toInt(), (hfile?.value ?: 0L))

public actual fun rtwqUnlockPlatform(): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_rtwqUnlockPlatform()

public actual fun rtwqUnlockWorkQueue(workqueueid: UInt): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_rtwqUnlockWorkQueue(workqueueid.toInt())

public actual fun rtwqUnregisterPlatformEvents(platformevents: COpaquePointer?): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_rtwqUnregisterPlatformEvents((platformevents?.value ?: 0L))

public actual fun rtwqUnregisterPlatformFromMMCSS(): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_rtwqUnregisterPlatformFromMMCSS()

public actual fun setCriticalSectionSpinCount(lpcriticalsection: COpaquePointer?, dwspincount: UInt): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setCriticalSectionSpinCount((lpcriticalsection?.value ?: 0L), dwspincount.toInt()).toUInt()

public actual fun setEvent(hevent: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setEvent((hevent?.value ?: 0L))

public actual fun setEventWhenCallbackReturns(pci: PtpCallbackInstance, evt: Handle) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setEventWhenCallbackReturns(pci, (evt?.value ?: 0L))
}

public actual fun setPriorityClass(hprocess: Handle, dwpriorityclass: ProcessCreationFlags): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setPriorityClass((hprocess?.value ?: 0L), dwpriorityclass.toInt())

public actual fun setProcessAffinityMask(hprocess: Handle, dwprocessaffinitymask: ULong): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setProcessAffinityMask((hprocess?.value ?: 0L), dwprocessaffinitymask.toLong())

public actual fun setProcessAffinityUpdateMode(hprocess: Handle, dwflags: ProcessAffinityAutoUpdateFlags): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setProcessAffinityUpdateMode((hprocess?.value ?: 0L), dwflags.toInt())

public actual fun setProcessDEPPolicy(dwflags: ProcessDepFlags): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setProcessDEPPolicy(dwflags.toInt())

public actual fun setProcessDefaultCpuSetMasks(process: Handle, cpusetmasks: COpaquePointer?, cpusetmaskcount: UShort): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setProcessDefaultCpuSetMasks((process?.value ?: 0L), (cpusetmasks?.value ?: 0L), cpusetmaskcount.toShort())

public actual fun setProcessDefaultCpuSets(process: Handle, cpusetids: COpaquePointer?, cpusetidcount: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setProcessDefaultCpuSets((process?.value ?: 0L), (cpusetids?.value ?: 0L), cpusetidcount.toInt())

public actual fun setProcessDynamicEHContinuationTargets(process: Handle, numberoftargets: UShort, targets: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setProcessDynamicEHContinuationTargets((process?.value ?: 0L), numberoftargets.toShort(), (targets?.value ?: 0L))

public actual fun setProcessDynamicEnforcedCetCompatibleRanges(process: Handle, numberofranges: UShort, ranges: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setProcessDynamicEnforcedCetCompatibleRanges((process?.value ?: 0L), numberofranges.toShort(), (ranges?.value ?: 0L))

public actual fun setProcessInformation(hprocess: Handle, processinformationclass: ProcessInformationClass, processinformation: COpaquePointer?, processinformationsize: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setProcessInformation((hprocess?.value ?: 0L), processinformationclass, (processinformation?.value ?: 0L), processinformationsize.toInt())

public actual fun setProcessMitigationPolicy(mitigationpolicy: ProcessMitigationPolicy, lpbuffer: COpaquePointer?, dwlength: ULong): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setProcessMitigationPolicy(mitigationpolicy, (lpbuffer?.value ?: 0L), dwlength.toLong())

public actual fun setProcessPriorityBoost(hprocess: Handle, bdisablepriorityboost: Bool): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setProcessPriorityBoost((hprocess?.value ?: 0L), bdisablepriorityboost)

public actual fun setProcessRestrictionExemption(fenableexemption: Bool): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setProcessRestrictionExemption(fenableexemption)

public actual fun setProcessShutdownParameters(dwlevel: UInt, dwflags: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setProcessShutdownParameters(dwlevel.toInt(), dwflags.toInt())

public actual fun setProcessWorkingSetSize(hprocess: Handle, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setProcessWorkingSetSize((hprocess?.value ?: 0L), dwminimumworkingsetsize.toLong(), dwmaximumworkingsetsize.toLong())

public actual fun setProtectedPolicy(policyguid: COpaquePointer?, policyvalue: ULong, oldpolicyvalue: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setProtectedPolicy((policyguid?.value ?: 0L), policyvalue.toLong(), (oldpolicyvalue?.value ?: 0L))

public actual fun setThreadAffinityMask(hthread: Handle, dwthreadaffinitymask: ULong): ULong =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setThreadAffinityMask((hthread?.value ?: 0L), dwthreadaffinitymask.toLong()).toULong()

public actual fun setThreadDescription(hthread: Handle, lpthreaddescription: Pcwstr): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setThreadDescription((hthread?.value ?: 0L), (lpthreaddescription?.value ?: 0L))

public actual fun setThreadGroupAffinity(hthread: Handle, groupaffinity: COpaquePointer?, previousgroupaffinity: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setThreadGroupAffinity((hthread?.value ?: 0L), (groupaffinity?.value ?: 0L), (previousgroupaffinity?.value ?: 0L))

public actual fun setThreadIdealProcessor(hthread: Handle, dwidealprocessor: UInt): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setThreadIdealProcessor((hthread?.value ?: 0L), dwidealprocessor.toInt()).toUInt()

public actual fun setThreadIdealProcessorEx(hthread: Handle, lpidealprocessor: COpaquePointer?, lppreviousidealprocessor: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setThreadIdealProcessorEx((hthread?.value ?: 0L), (lpidealprocessor?.value ?: 0L), (lppreviousidealprocessor?.value ?: 0L))

public actual fun setThreadInformation(hthread: Handle, threadinformationclass: ThreadInformationClass, threadinformation: COpaquePointer?, threadinformationsize: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setThreadInformation((hthread?.value ?: 0L), threadinformationclass, (threadinformation?.value ?: 0L), threadinformationsize.toInt())

public actual fun setThreadPriority(hthread: Handle, npriority: ThreadPriority): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setThreadPriority((hthread?.value ?: 0L), npriority)

public actual fun setThreadPriorityBoost(hthread: Handle, bdisablepriorityboost: Bool): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setThreadPriorityBoost((hthread?.value ?: 0L), bdisablepriorityboost)

public actual fun setThreadSelectedCpuSetMasks(thread: Handle, cpusetmasks: COpaquePointer?, cpusetmaskcount: UShort): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setThreadSelectedCpuSetMasks((thread?.value ?: 0L), (cpusetmasks?.value ?: 0L), cpusetmaskcount.toShort())

public actual fun setThreadSelectedCpuSets(thread: Handle, cpusetids: COpaquePointer?, cpusetidcount: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setThreadSelectedCpuSets((thread?.value ?: 0L), (cpusetids?.value ?: 0L), cpusetidcount.toInt())

public actual fun setThreadStackGuarantee(stacksizeinbytes: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setThreadStackGuarantee((stacksizeinbytes?.value ?: 0L))

public actual fun setThreadToken(thread: COpaquePointer?, token: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setThreadToken((thread?.value ?: 0L), (token?.value ?: 0L))

public actual fun setThreadpoolStackInformation(ptpp: PtpPool, ptpsi: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setThreadpoolStackInformation(ptpp.toLong(), (ptpsi?.value ?: 0L))

public actual fun setThreadpoolThreadMaximum(ptpp: PtpPool, cthrdmost: UInt) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setThreadpoolThreadMaximum(ptpp.toLong(), cthrdmost.toInt())
}

public actual fun setThreadpoolThreadMinimum(ptpp: PtpPool, cthrdmic: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setThreadpoolThreadMinimum(ptpp.toLong(), cthrdmic.toInt())

public actual fun setThreadpoolTimer(pti: PtpTimer, pftduetime: COpaquePointer?, msperiod: UInt, mswindowlength: UInt) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setThreadpoolTimer(pti, (pftduetime?.value ?: 0L), msperiod.toInt(), mswindowlength.toInt())
}

public actual fun setThreadpoolTimerEx(pti: PtpTimer, pftduetime: COpaquePointer?, msperiod: UInt, mswindowlength: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setThreadpoolTimerEx(pti, (pftduetime?.value ?: 0L), msperiod.toInt(), mswindowlength.toInt())

public actual fun setThreadpoolWait(pwa: PtpWait, h: Handle, pfttimeout: COpaquePointer?) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setThreadpoolWait(pwa, (h?.value ?: 0L), (pfttimeout?.value ?: 0L))
}

public actual fun setThreadpoolWaitEx(pwa: PtpWait, h: Handle, pfttimeout: COpaquePointer?, reserved: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setThreadpoolWaitEx(pwa, (h?.value ?: 0L), (pfttimeout?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun setTimerQueueTimer(timerqueue: Handle, callback: Waitortimercallback, parameter: COpaquePointer?, duetime: UInt, period: UInt, preferio: Bool): Handle =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setTimerQueueTimer((timerqueue?.value ?: 0L), 0L, (parameter?.value ?: 0L), duetime.toInt(), period.toInt(), preferio).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setUmsThreadInformation(umsthread: COpaquePointer?, umsthreadinfoclass: UmsThreadInfoClass, umsthreadinformation: COpaquePointer?, umsthreadinformationlength: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setUmsThreadInformation((umsthread?.value ?: 0L), umsthreadinfoclass, (umsthreadinformation?.value ?: 0L), umsthreadinformationlength.toInt())

public actual fun setWaitableTimer(htimer: Handle, lpduetime: COpaquePointer?, lperiod: Int, pfncompletionroutine: Ptimerapcroutine, lpargtocompletionroutine: COpaquePointer?, fresume: Bool): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setWaitableTimer((htimer?.value ?: 0L), (lpduetime?.value ?: 0L), lperiod, 0L, (lpargtocompletionroutine?.value ?: 0L), fresume)

public actual fun setWaitableTimerEx(htimer: Handle, lpduetime: COpaquePointer?, lperiod: Int, pfncompletionroutine: Ptimerapcroutine, lpargtocompletionroutine: COpaquePointer?, wakecontext: COpaquePointer?, tolerabledelay: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_setWaitableTimerEx((htimer?.value ?: 0L), (lpduetime?.value ?: 0L), lperiod, 0L, (lpargtocompletionroutine?.value ?: 0L), (wakecontext?.value ?: 0L), tolerabledelay.toInt())

public actual fun signalObjectAndWait(hobjecttosignal: Handle, hobjecttowaiton: Handle, dwmilliseconds: UInt, balertable: Bool): WaitEvent =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_signalObjectAndWait((hobjecttosignal?.value ?: 0L), (hobjecttowaiton?.value ?: 0L), dwmilliseconds.toInt(), balertable).toUInt()

public actual fun sleep(dwmilliseconds: UInt) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_sleep(dwmilliseconds.toInt())
}

public actual fun sleepConditionVariableCS(conditionvariable: COpaquePointer?, criticalsection: COpaquePointer?, dwmilliseconds: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_sleepConditionVariableCS((conditionvariable?.value ?: 0L), (criticalsection?.value ?: 0L), dwmilliseconds.toInt())

public actual fun sleepConditionVariableSRW(conditionvariable: COpaquePointer?, srwlock: COpaquePointer?, dwmilliseconds: UInt, flags: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_sleepConditionVariableSRW((conditionvariable?.value ?: 0L), (srwlock?.value ?: 0L), dwmilliseconds.toInt(), flags.toInt())

public actual fun sleepEx(dwmilliseconds: UInt, balertable: Bool): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_sleepEx(dwmilliseconds.toInt(), balertable).toUInt()

public actual fun startThreadpoolIo(pio: PtpIo) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_startThreadpoolIo(pio)
}

public actual fun submitThreadpoolWork(pwk: PtpWork) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_submitThreadpoolWork(pwk)
}

public actual fun suspendThread(hthread: Handle): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_suspendThread((hthread?.value ?: 0L)).toUInt()

public actual fun switchToFiber(lpfiber: COpaquePointer?) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_switchToFiber((lpfiber?.value ?: 0L))
}

public actual fun switchToThread(): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_switchToThread()

public actual fun terminateProcess(hprocess: Handle, uexitcode: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_terminateProcess((hprocess?.value ?: 0L), uexitcode.toInt())

public actual fun terminateThread(hthread: Handle, dwexitcode: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_terminateThread((hthread?.value ?: 0L), dwexitcode.toInt())

public actual fun tlsAlloc(): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_tlsAlloc().toUInt()

public actual fun tlsFree(dwtlsindex: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_tlsFree(dwtlsindex.toInt())

public actual fun tlsGetValue(dwtlsindex: UInt): COpaquePointer? =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_tlsGetValue(dwtlsindex.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun tlsSetValue(dwtlsindex: UInt, lptlsvalue: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_tlsSetValue(dwtlsindex.toInt(), (lptlsvalue?.value ?: 0L))

public actual fun tryAcquireSRWLockExclusive(srwlock: COpaquePointer?): Boolean =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_tryAcquireSRWLockExclusive((srwlock?.value ?: 0L))

public actual fun tryAcquireSRWLockShared(srwlock: COpaquePointer?): Boolean =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_tryAcquireSRWLockShared((srwlock?.value ?: 0L))

public actual fun tryEnterCriticalSection(lpcriticalsection: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_tryEnterCriticalSection((lpcriticalsection?.value ?: 0L))

public actual fun trySubmitThreadpoolCallback(pfns: PtpSimpleCallback, pv: COpaquePointer?, pcbe: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_trySubmitThreadpoolCallback(0L, (pv?.value ?: 0L), (pcbe?.value ?: 0L))

public actual fun umsThreadYield(schedulerparam: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_umsThreadYield((schedulerparam?.value ?: 0L))

public actual fun unregisterWait(waithandle: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_unregisterWait((waithandle?.value ?: 0L))

public actual fun unregisterWaitEx(waithandle: Handle, completionevent: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_unregisterWaitEx((waithandle?.value ?: 0L), (completionevent?.value ?: 0L))

public actual fun updateProcThreadAttribute(lpattributelist: LpprocThreadAttributeList, dwflags: UInt, attribute: ULong, lpvalue: COpaquePointer?, cbsize: ULong, lppreviousvalue: COpaquePointer?, lpreturnsize: COpaquePointer?): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_updateProcThreadAttribute((lpattributelist?.value ?: 0L), dwflags.toInt(), attribute.toLong(), (lpvalue?.value ?: 0L), cbsize.toLong(), (lppreviousvalue?.value ?: 0L), (lpreturnsize?.value ?: 0L))

public actual fun waitForInputIdle(hprocess: Handle, dwmilliseconds: UInt): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_waitForInputIdle((hprocess?.value ?: 0L), dwmilliseconds.toInt()).toUInt()

public actual fun waitForMultipleObjects(ncount: UInt, lphandles: COpaquePointer?, bwaitall: Bool, dwmilliseconds: UInt): WaitEvent =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_waitForMultipleObjects(ncount.toInt(), (lphandles?.value ?: 0L), bwaitall, dwmilliseconds.toInt()).toUInt()

public actual fun waitForMultipleObjectsEx(ncount: UInt, lphandles: COpaquePointer?, bwaitall: Bool, dwmilliseconds: UInt, balertable: Bool): WaitEvent =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_waitForMultipleObjectsEx(ncount.toInt(), (lphandles?.value ?: 0L), bwaitall, dwmilliseconds.toInt(), balertable).toUInt()

public actual fun waitForSingleObject(hhandle: Handle, dwmilliseconds: UInt): WaitEvent =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_waitForSingleObject((hhandle?.value ?: 0L), dwmilliseconds.toInt()).toUInt()

public actual fun waitForSingleObjectEx(hhandle: Handle, dwmilliseconds: UInt, balertable: Bool): WaitEvent =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_waitForSingleObjectEx((hhandle?.value ?: 0L), dwmilliseconds.toInt(), balertable).toUInt()

public actual fun waitForThreadpoolIoCallbacks(pio: PtpIo, fcancelpendingcallbacks: Bool) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_waitForThreadpoolIoCallbacks(pio, fcancelpendingcallbacks)
}

public actual fun waitForThreadpoolTimerCallbacks(pti: PtpTimer, fcancelpendingcallbacks: Bool) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_waitForThreadpoolTimerCallbacks(pti, fcancelpendingcallbacks)
}

public actual fun waitForThreadpoolWaitCallbacks(pwa: PtpWait, fcancelpendingcallbacks: Bool) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_waitForThreadpoolWaitCallbacks(pwa, fcancelpendingcallbacks)
}

public actual fun waitForThreadpoolWorkCallbacks(pwk: PtpWork, fcancelpendingcallbacks: Bool) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_waitForThreadpoolWorkCallbacks(pwk, fcancelpendingcallbacks)
}

public actual fun waitOnAddress(address: COpaquePointer?, compareaddress: COpaquePointer?, addresssize: ULong, dwmilliseconds: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_waitOnAddress((address?.value ?: 0L), (compareaddress?.value ?: 0L), addresssize.toLong(), dwmilliseconds.toInt())

public actual fun wakeAllConditionVariable(conditionvariable: COpaquePointer?) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_wakeAllConditionVariable((conditionvariable?.value ?: 0L))
}

public actual fun wakeByAddressAll(address: COpaquePointer?) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_wakeByAddressAll((address?.value ?: 0L))
}

public actual fun wakeByAddressSingle(address: COpaquePointer?) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_wakeByAddressSingle((address?.value ?: 0L))
}

public actual fun wakeConditionVariable(conditionvariable: COpaquePointer?) {
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_wakeConditionVariable((conditionvariable?.value ?: 0L))
}

public actual fun winExec(lpcmdline: Pcstr, ucmdshow: UInt): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_winExec((lpcmdline?.value ?: 0L), ucmdshow.toInt()).toUInt()

public actual fun wow64SetThreadDefaultGuestMachine(machine: UShort): UShort =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_wow64SetThreadDefaultGuestMachine(machine.toShort()).toUShort()

public actual fun wow64SuspendThread(hthread: Handle): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssys_windows_win32_system_threading_wow64SuspendThread((hthread?.value ?: 0L)).toUInt()
